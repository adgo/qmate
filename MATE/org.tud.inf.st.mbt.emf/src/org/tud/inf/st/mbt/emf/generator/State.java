package org.tud.inf.st.mbt.emf.generator;

import static org.tud.inf.st.mbt.emf.util.ModelUtil.atom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.mbt.actions.ActionsFactory;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.actions.PostGenerationSequence;
import org.tud.inf.st.mbt.actions.PreGenerationAction;
import org.tud.inf.st.mbt.actions.SetPropertyAction;
import org.tud.inf.st.mbt.actions.TimedConditionAction;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.CausalLinkType;
import org.tud.inf.st.mbt.data.DataBag;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.DataStructure;
import org.tud.inf.st.mbt.data.DataStructureNode;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.features.FeatureVersion;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.rules.Atom;
import org.tud.inf.st.mbt.rules.BagElementAssignedAtom;
import org.tud.inf.st.mbt.rules.ConfigurationAtom;
import org.tud.inf.st.mbt.rules.DataAtom;
import org.tud.inf.st.mbt.rules.FeatureAtom;
import org.tud.inf.st.mbt.rules.IRealTimeConsumer;
import org.tud.inf.st.mbt.rules.InstructionPointerAtom;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RealTimeAtom;
import org.tud.inf.st.mbt.rules.RulesPackage;
import org.tud.inf.st.mbt.rules.TimeAtom;
import org.tud.inf.st.mbt.rules.TokenAtom;
import org.tud.inf.st.mbt.ulang.guigraph.Place;
import org.tud.inf.st.mbt.ulang.guigraph.TimingType;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;

public class State {
	private static final ActionsFactory fActions = ActionsFactory.eINSTANCE;

	public interface IStateActivationListener {
		void stateActivated(State s);
	}

	private static List<IStateActivationListener> activationListeners = new ArrayList<State.IStateActivationListener>(
			1);
	private static State activatedState;

	public static void registerStateActivationListener(
			IStateActivationListener l) {
		activationListeners.add(l);
	}

	public static void unregisterStateActivationListener(
			IStateActivationListener l) {
		activationListeners.remove(l);
	}

	public static void deactivate() {
		activatedState = null;
		for (IStateActivationListener l : activationListeners)
			l.stateActivated(null);
	}

	private PostGenerationSequence actions = ActionsFactory.eINSTANCE
			.createPostGenerationSequence();
	private boolean terminating;
	private boolean failed = false;
	private PredicateList propositions;
	private State parent;
	private AbstractModelElement[] traceableTo;
	private double priority;

	public State(State parent,
			Collection<? extends PostGenerationAction> actions,
			boolean terminating, PredicateList propositions,
			AbstractModelElement... traceableTo) {
		if (actions != null)
			this.actions.getActions().addAll(EcoreUtil.copyAll(actions));
		this.terminating = terminating;
		this.propositions = propositions;
		this.parent = parent;
		this.traceableTo = traceableTo;
	}

	public void activate() {
		activatedState = this;
		for (IStateActivationListener l : activationListeners)
			l.stateActivated(this);
	}

	public static State getActivatedState() {
		return activatedState;
	}

	public AbstractModelElement[] getTraceableTo() {
		return traceableTo;
	}

	public boolean isFailed() {
		return failed;
	}

	public void setFailed(boolean failed) {
		this.failed = failed;
	}

	public PredicateList getPropositions() {
		return new PredicateList(propositions);
	}

	public void configureAll(Collection<? extends Atom> atoms) {
		for (Atom a : atoms)
			configureProposition(a);
	}

	public void configureProposition(Atom a) {
		configureProposition(a, true);
	}

	public void configureProposition(Atom a, boolean generateActions) {
		if (a instanceof FeatureAtom) {
			for (Object p : propositions.toArray()) {
				if (p instanceof FeatureAtom
						&& ((FeatureAtom) p).getFeature().equals(
								((FeatureAtom) a).getFeature())) {
					propositions.remove((Predicate) p);
				}
			}
			propositions.add(a);
		} else if (a instanceof DataAtom) {
			for (Object p : propositions.toArray()) {
				if (p instanceof DataAtom
						&& ((DataAtom) p).getLeaf().equals(
								((DataAtom) a).getLeaf())) {
					propositions.remove((Predicate) p);
				}
			}
			for (DataElement e : ModelUtil.getAllLowerElements(((DataAtom) a)
					.getValue())) {
				propositions.add(ModelUtil.atom(((DataAtom) a).getLeaf(), e));
			}
			for (DataStructureNode effected : getEffectedUpperBagElements(((DataAtom) a)
					.getLeaf())) {
				DataBag bag = (DataBag) effected.eContainer();
				propositions.add(ModelUtil.atom(bag, bag.getGeneratedElements()
						.indexOf(effected)));
			}
			if (generateActions) {
				if (((DataAtom) a).getLeaf().getCausalLinkType() == CausalLinkType.UPLINK) {
					SetPropertyAction spa = fActions.createSetPropertyAction();
					spa.setValue(((DataAtom) a).getValue());
					spa.setProperty(((DataAtom) a).getLeaf());
					addActions(spa);
				}
			}
		} else if (a instanceof TokenAtom) {
			for (Object p : propositions.toArray()) {
				TokenAtom aClone = (TokenAtom) EcoreUtil.copy(a);
				aClone.setCount(0);
				if (p instanceof TokenAtom) {
					TokenAtom pClone = (TokenAtom) EcoreUtil
							.copy((TokenAtom) p);
					pClone.setCount(0);
					if (ModelUtil.hashCode(pClone) == ModelUtil
							.hashCode(aClone))
						propositions.remove((Predicate) p);
				}
			}
			propositions.add(a);
		} else if (a instanceof RealTimeAtom) {
			RealTimeAtom aClone = (RealTimeAtom) EcoreUtil.copy(a);
			aClone.setTime(0);
			for (Object p : propositions.toArray()) {
				if (p instanceof RealTimeAtom) {
					RealTimeAtom pClone = EcoreUtil.copy((RealTimeAtom) p);
					pClone.setTime(0);
					if (ModelUtil.hashCode(pClone) == ModelUtil
							.hashCode(aClone))
						propositions.remove((Predicate) p);
				}
			}
			propositions.add(a);
		} else if (a instanceof TimeAtom) {
			for (Object p : propositions.toArray()) {
				if (p instanceof TimeAtom
						&& ((TimeAtom) p).getConsumer().equals(
								((TimeAtom) a).getConsumer())) {
					propositions.remove((Predicate) p);
				}
			}
			propositions.add(a);
		} else if (a instanceof ConfigurationAtom) {
			for (Object p : propositions.toArray()) {
				if (p instanceof ConfigurationAtom
						&& ((ConfigurationAtom) p).getConfiguration().equals(
								((ConfigurationAtom) a).getConfiguration())) {
					propositions.remove((Predicate) p);
				}
			}
			propositions.add(a);
		} else
			propositions.add(a);
	}

	public void deconfigureProposition(Atom a) {
		deconfigureProposition(a, true);
	}

	public void deconfigureProposition(Atom a, boolean generateActions) {
		if (a instanceof FeatureAtom) {
			for (Object p : propositions.toArray()) {
				if (p instanceof FeatureAtom
						&& ((FeatureAtom) p).getFeature().equals(
								((FeatureAtom) a).getFeature())) {
					propositions.remove((Predicate) p);
				}
			}
		} else if (a instanceof BagElementAssignedAtom) {
			for (DataStructureNode effected : getEffectedLowerBagElements(((BagElementAssignedAtom) a)
					.getBag().getGeneratedElements()
					.get(((BagElementAssignedAtom) a).getIdx()))) {
				DataBag bag = (DataBag) effected.eContainer();
				int idx = bag.getGeneratedElements().indexOf(effected);
				propositions.remove(ModelUtil.atom(bag, idx));
			}
		} else if (a instanceof RealTimeAtom) {
			for (Object p : propositions.toArray()) {
				if (p instanceof RealTimeAtom
						&& ((RealTimeAtom) a).getConsumer().equals(
								((RealTimeAtom) p).getConsumer())) {
					propositions.remove((Predicate) p);
				}
			}
		} else {
			propositions.remove(a);
		}
	}

	private List<DataStructureNode> getEffectedUpperBagElements(
			DataStructureNode toBeSet) {
		EObject container = toBeSet.eContainer();
		if (container != null && container instanceof DataStructureNode) {
			if (container instanceof DataBag) {
				List<DataStructureNode> fromAbove = getEffectedUpperBagElements((DataStructureNode) container);
				fromAbove.add(toBeSet);
				return fromAbove;
			} else
				return getEffectedUpperBagElements((DataStructureNode) container);
		} else
			return new LinkedList<DataStructureNode>();
	}

	private List<DataStructureNode> getEffectedLowerBagElements(
			DataStructureNode toBeUnset) {
		List<DataStructureNode> effected = new LinkedList<DataStructureNode>();
		if (toBeUnset instanceof DataLeaf)
			effected.add(toBeUnset);
		else if (toBeUnset instanceof DataStructure)
			for (DataStructureNode n : ((DataStructure) toBeUnset)
					.getChildren())
				effected.addAll(getEffectedLowerBagElements(n));
		else if (toBeUnset instanceof DataBag) {
			effected.addAll(((DataBag) toBeUnset).getGeneratedElements());
			for (DataStructureNode n : ((DataBag) toBeUnset)
					.getGeneratedElements())
				effected.addAll(getEffectedLowerBagElements(n));
		}
		return effected;
	}

	public double getPriority() {
		return priority;
	}

	public void setPriority(double priority) {
		this.priority = priority;
	}

	public void setParent(State parent) {
		this.parent = parent;
	}

	public PostGenerationSequence getActions() {
		return actions;
	}

	public void addActions(Collection<? extends PostGenerationAction> actions) {
		this.actions.getActions().addAll(EcoreUtil.copyAll(actions));
	}

	public void addActions(PostGenerationAction... actions) {
		this.actions.getActions().addAll(
				EcoreUtil.copyAll(Arrays.asList(actions)));
	}

	public boolean isTerminating() {
		return terminating;
	}

	public void setTerminating(boolean terminating) {
		this.terminating = terminating;
	}

	public Predicate findFirstPredicate(EClass ac) {
		for (Predicate a : getPropositions()) {
			if (ac.isSuperTypeOf(a.eClass())) {
				return (Predicate) a;
			}
		}
		return null;
	}

	public PredicateList findAllPredicates(EClass ac) {
		PredicateList preds = new PredicateList();

		for (Predicate a : getPropositions()) {
			if (ac.isSuperTypeOf(a.eClass())) {
				preds.add((Predicate) a);
			}
		}
		return preds;
	}

	public State getParent() {
		return parent;
	}

	private static String shorten(String s, int l) {
		return s.length() > l ? s.substring(0, l) + "..." : s;
	}

	@Override
	public String toString() {
		String str = terminating ? "[term]" : "";
		if (!actions.getActions().isEmpty())
			str += shorten(actions.toString(), 20);
		str += ">"
				+ (parent == null ? shorten(propositions.toString(), 100)
						: shorten(
								propositions.toString(parent.getPropositions()),
								100));
		return str;
	}

	public PredicateList getUnfoldPropositions() {
		PredicateList la = new PredicateList(getPropositions());
		for (Predicate a : getPropositions()) {
			if (a instanceof TokenAtom) {
				for (int i = ((TokenAtom) a).getCount() - 1; i > 0; i--) {
					la.add(atom(((TokenAtom) a).getPlace(), i));
				}
			}
		}
		return la;
	}

	public DataElement getCurrentValue(DataLeaf l) {
		PredicateList dal = findAllPredicates(RulesPackage.eINSTANCE
				.getDataAtom());
		for (Predicate a : dal) {
			DataAtom da = (DataAtom) a;
			if (da.getLeaf().equals(l)) {
				return da.getValue();
			}
		}
		return null;
	}

	public FeatureVersion getCurrentVersion(IFeature f) {
		PredicateList fal = findAllPredicates(RulesPackage.eINSTANCE
				.getFeatureAtom());
		for (Predicate p : fal) {
			FeatureAtom fa = (FeatureAtom) p;
			if (fa.getFeature().equals(fa))
				return fa.getVersion();
		}
		return null;
	}

	public int getTokenCount(Place p) {
		for (Predicate a : getPropositions().toArray())
			if (a instanceof TokenAtom && ((TokenAtom) a).getPlace().equals(p))
				return ((TokenAtom) a).getCount();
		return 0;
	}

	public EObject getTopInstructionFallBack() {
		if (isTopInstructionSequenceRunning()
				|| isTopInstructionSequenceFinishing()) {
			InstructionPointerAtom ipa = getTopInstructionPointerAtom();
			return ipa.getFallBack();
		} else
			return null;
	}

	public boolean isTopInstructionSequenceFinishing() {
		InstructionPointerAtom ipa = getTopInstructionPointerAtom();
		if (ipa == null)
			return false;
		EList<PreGenerationAction> actions = ipa.getSequence().getActions();
		return ipa.getInstruction() >= actions.size();
	}

	public boolean isTopInstructionSequenceRunning() {
		return getTopInstructionPointerAtom() != null
				&& !isTopInstructionSequenceFinishing();
	}

	public InstructionPointerAtom getTopInstructionPointerAtom() {
		PredicateList ipas = findAllPredicates(RulesPackage.eINSTANCE
				.getInstructionPointerAtom());
		if (ipas.size() != 0) {
			Iterator<Predicate> i = ipas.iterator();
			InstructionPointerAtom top = (InstructionPointerAtom) i.next();
			while (i.hasNext()) {
				InstructionPointerAtom p = (InstructionPointerAtom) i.next();
				if (p.getStackLevel() > top.getStackLevel())
					top = p;
			}
			return top;
		} else
			return null;
	}

	public boolean isFeatureActive(IFeature f, FeatureVersion v) {
		for (Predicate p : getPropositions()) {
			if (p instanceof FeatureAtom
					&& ((FeatureAtom) p).getFeature().equals(f)) {
				if (v == null)
					return true;
				else
					return v.equals(((FeatureAtom) p).getVersion());
			}
		}
		return false;
	}

	public boolean isAssigned(DataBag b, int idx) {
		PredicateList asgs = findAllPredicates(RulesPackage.eINSTANCE
				.getBagElementAssignedAtom());
		for (Predicate p : asgs) {
			if (p instanceof BagElementAssignedAtom
					&& ((BagElementAssignedAtom) p).getBag().equals(b)
					&& ((BagElementAssignedAtom) p).getIdx() == idx)
				return true;
		}
		return false;
	}

	public boolean isBound(DataStructureNode n) {
		Collection<DataLeaf> l = ModelUtil.getAllLeafs(n);
		PredicateList bindings = findAllPredicates(RulesPackage.eINSTANCE
				.getDataAtom());
		for (Predicate p : bindings) {
			if (l.contains(((DataAtom) p).getLeaf()))
				return true;
		}
		return false;
	}

	public long getMinTimeToElapse() {

		long min = Long.MAX_VALUE;

		PredicateList rtas = findAllPredicates(RulesPackage.eINSTANCE
				.getRealTimeAtom());
		for (Predicate p : rtas) {
			RealTimeAtom rta = (RealTimeAtom) p;
			if (TimedConditionActionOperator.class.isAssignableFrom(rta
					.getConsumer().getClass())) {
				TimedConditionAction tca = (TimedConditionAction) rta
						.getConsumer();

				min = Math.max(0,
						Math.min(min, tca.getFrequency() - rta.getTime()));

			} else if (Transition.class.isAssignableFrom(rta.getConsumer()
					.getClass())) {
				Transition t = (Transition) rta.getConsumer();

				if (t.getTimingType().equals(TimingType.INTERVAL)) {
					if (rta.getTime() >= t.getTimeMin()) {
						min = Math.min(min,1);
					} else {
						min = Math.max(0,
								Math.min(min, t.getTimeMin() - rta.getTime()));
					}
				} else if (t.getTimingType().equals(
						TimingType.DELAY_UNTIL_START)) {
					min = Math.max(0,
							Math.min(min, t.getTimeMin() - rta.getTime()));
				}

			}
		}

		return min;
	}

	public List<? extends IRealTimeConsumer> getRealTimeEnabledConsumers(
			Class<? extends IRealTimeConsumer> type) {
		PredicateList rtas = findAllPredicates(RulesPackage.eINSTANCE
				.getRealTimeAtom());
		List<IRealTimeConsumer> result = new ArrayList<IRealTimeConsumer>();
		for (Predicate p : rtas) {
			RealTimeAtom rta = (RealTimeAtom) p;
			if (type.isAssignableFrom(rta.getConsumer().getClass())) {
				if (TimedConditionActionOperator.class.isAssignableFrom(rta
						.getConsumer().getClass())) {
					TimedConditionAction tca = (TimedConditionAction) rta
							.getConsumer();
					if (tca.getFrequency() <= rta.getTime())
						result.add(tca);
				} else if (Transition.class.isAssignableFrom(rta.getConsumer()
						.getClass())) {
					Transition t = (Transition) rta.getConsumer();
					if (rta.getTime() >= t.getTimeMin()
							&& (rta.getTime() <= t.getTimeMax() || t
									.getTimeMax() < t.getTimeMin()))
						result.add(t);
					else if (rta.getTime() >= t.getTimeMin()
							&& t.getTimingType().equals(
									TimingType.DELAY_UNTIL_START))
						result.add(t);
				}
			}
		}
		return result;
	}

	public void elapseRealTime(long realTime) {
		PredicateList rtas = findAllPredicates(RulesPackage.eINSTANCE
				.getRealTimeAtom());
		for (Predicate p : rtas) {
			RealTimeAtom rta = (RealTimeAtom) p;
			configureProposition(ModelUtil.atom(rta.getConsumer(),
					rta.getTime() + realTime));
		}
	}

}
