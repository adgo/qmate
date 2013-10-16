package org.tud.inf.st.mbt.emf.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.mbt.actions.ActionsFactory;
import org.tud.inf.st.mbt.actions.ActivateFeatureAction;
import org.tud.inf.st.mbt.actions.DeactivateFeatureAction;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.actions.ReconfigurationAction;
import org.tud.inf.st.mbt.actions.SetDataAction;
import org.tud.inf.st.mbt.actions.ThrowAction;
import org.tud.inf.st.mbt.data.DataBinding;
import org.tud.inf.st.mbt.data.DataStructureNode;
import org.tud.inf.st.mbt.emf.util.FunctionProcessor;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.functions.DataNodeFunction;
import org.tud.inf.st.mbt.functions.DataValueFunction;
import org.tud.inf.st.mbt.functions.FunctionsFactory;
import org.tud.inf.st.mbt.ocm.ComposedConfigurationNode;
import org.tud.inf.st.mbt.ocm.CompositionEdge;
import org.tud.inf.st.mbt.ocm.ConfigurationNode;
import org.tud.inf.st.mbt.ocm.Edge;
import org.tud.inf.st.mbt.ocm.EventGuardedEdge;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;
import org.tud.inf.st.mbt.ocm.ReconfigurationActionNode;
import org.tud.inf.st.mbt.ocm.StandardConfigurationNode;
import org.tud.inf.st.mbt.ocm.TimedEdge;
import org.tud.inf.st.mbt.rules.Atom;
import org.tud.inf.st.mbt.rules.ConfigurationAtom;
import org.tud.inf.st.mbt.rules.DataAtom;
import org.tud.inf.st.mbt.rules.FeatureAtom;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RulesFactory;
import org.tud.inf.st.mbt.rules.RulesPackage;
import org.tud.inf.st.mbt.rules.TimeAtom;

public class OCMOperator extends TransitionOperator {

	private static final RulesFactory fRules = RulesFactory.eINSTANCE;
	private static final ActionsFactory fActions = ActionsFactory.eINSTANCE;

	private Integer ticks = 0;
	private String eventID;
	private OperationalConfigurationModel ocm;
	private ActionProcessor actionProcessor;

	public OCMOperator(SATFoundation sf, OperationalConfigurationModel ocm,
			int ticks) {
		super(sf);
		this.actionProcessor = new ActionProcessor(sf);
		this.ticks = ticks;
		this.ocm = ocm;
	}

	public OCMOperator(SATFoundation sf, OperationalConfigurationModel ocm,
			String eventID) {
		super(sf);
		this.eventID = eventID;
		this.ocm = ocm;
	}

	@Override
	public State[] operate(State s) {
		if (eventID == null) {
			return operateTimed(s);
		} else {
			return operateEventBased(s);
		}
	}

	private State[] operateEventBased(State s) {
		List<State> next = new ArrayList<>();
		PredicateList nextPreds = new PredicateList(s.getPropositions());

		ConfigurationAtom currentAtom = getCurrentConfigurationAtom(s);
		if (currentAtom != null)
			nextPreds.remove(currentAtom);
		ConfigurationNode current = currentAtom != null ? currentAtom
				.getConfiguration() : null;
		if (current == null)
			current = ocm.getStart();
		if (current == null)
			return next.toArray(new State[0]);

		for (Edge e : ocm.getEdges()) {
			if (e instanceof EventGuardedEdge
					&& ((EventGuardedEdge) e).getSource().equals(current)
					&& ((EventGuardedEdge) e).getGuardEventID() != null
					&& ((EventGuardedEdge) e).getGuardEventID().equals(eventID)) {
				EventGuardedEdge ee = (EventGuardedEdge) e;
				State n = new State(s,
						Collections.<PostGenerationAction> emptyList(), false,
						nextPreds);
				next.add(n);

				for (ReconfigurationAction a : getFinalConfigurationActions(s,
						ee.getTarget())) {
					List<State> nextLocal = new ArrayList<State>();
					for (State nn : next) {
						nextLocal.addAll(actionProcessor.executeAction(nn, a,
								new HashMap<String, Object>()));
					}
					next.clear();
					next.addAll(nextLocal);
				}

				ConfigurationAtom nconf = RulesFactory.eINSTANCE
						.createConfigurationAtom();
				nconf.setConfiguration(ee.getTarget());
				n.configureProposition(nconf);

				next.add(n);
			}
		}

		return postProcessEvent(next, s);
	}

	private State[] operateTimed(State s) {
		List<State> next = new ArrayList<>();
		PredicateList nextPreds = new PredicateList(s.getPropositions());

		PredicateList times = s.findAllPredicates(RulesPackage.eINSTANCE
				.getTimeAtom());
		TimeAtom time = null;
		for (Predicate a : times) {
			if (((TimeAtom) a).getConsumer().equals(ocm)) {
				nextPreds.remove(a);
				time = EcoreUtil.copy((TimeAtom) a);
				break;
			}
		}
		if (time == null) {
			time = RulesFactory.eINSTANCE.createTimeAtom();
			time.setConsumer(ocm);
			time.setTime(0);
		}

		ConfigurationAtom currentAtom = getCurrentConfigurationAtom(s);
		if (currentAtom != null)
			nextPreds.remove(currentAtom);
		ConfigurationNode current = currentAtom != null ? currentAtom
				.getConfiguration() : null;
		if (current == null)
			current = ocm.getStart();
		if (current == null)
			return next.toArray(new State[0]);

		for (Edge e : ocm.getEdges()) {
			if (e instanceof TimedEdge
					&& ((TimedEdge) e).getSource().equals(current)) {
				TimedEdge te = (TimedEdge) e;
				int duration = te.getDuration();
				if (duration > ticks + time.getTime()) {
					State n = new State(s,
							Collections.<PostGenerationAction> emptyList(),
							false, nextPreds);
					TimeAtom timeNext = fRules.createTimeAtom();
					timeNext.setTime(ticks + time.getTime());
					timeNext.setConsumer(ocm);
					n.configureProposition(timeNext);
					n.configureProposition(currentAtom);
					next.add(n);
				} else {
					State i = new State(s,
							Collections.<PostGenerationAction> emptyList(),
							false, nextPreds);
					List<State> nextLocal = new LinkedList<State>();
					nextLocal.add(i);

					for (ReconfigurationAction a : getFinalConfigurationActions(
							s, te.getTarget())) {
						List<State> nextMoreLocal = new ArrayList<State>();
						for (State nn : nextLocal) {
							nextMoreLocal.addAll(actionProcessor.executeAction(
									nn, a, new HashMap<String, Object>()));
						}
						nextLocal.clear();
						nextLocal.addAll(nextMoreLocal);
					}

					for (State n : nextLocal) {
						TimeAtom ntime = RulesFactory.eINSTANCE
								.createTimeAtom();
						ntime.setConsumer(ocm);
						ntime.setTime(0);
						n.configureProposition(ntime);
						ConfigurationAtom nconf = RulesFactory.eINSTANCE
								.createConfigurationAtom();
						nconf.setConfiguration(te.getTarget());
						n.configureProposition(nconf);

						next.addAll(Arrays.asList(new OCMOperator(
								getSatFoundation(), ocm, ticks - duration)
								.operate(n)));
					}
					if (next.isEmpty())
						next.add(i);
				}

			}
		}

		return postProcessEvent(next, s);
	}

	private ConfigurationAtom getCurrentConfigurationAtom(State s) {
		for (Predicate a : s.findAllPredicates(RulesPackage.eINSTANCE
				.getConfigurationAtom())) {
			ConfigurationAtom ca = (ConfigurationAtom) a;
			if (ca.getConfiguration().eContainer().equals(ocm)) {
				return ca;
			}
		}

		return null;
	}

	private State[] postProcessEvent(List<State> states, State parent) {
		List<State> next = new ArrayList<>();

		for (State s : states) {
			ConfigurationAtom ca = getCurrentConfigurationAtom(s);
			if (ca != null && ca.getConfiguration() != null
					&& ca.getConfiguration().getPostConfEventID() != null) {
				ThrowAction ta = ActionsFactory.eINSTANCE.createThrowAction();
				ta.setEventID(ca.getConfiguration().getPostConfEventID());
				next.addAll(actionProcessor.executeAction(s, ta,
						new HashMap<String, Object>(), ca.getConfiguration()));
			} else
				next.add(s);
		}

		for (State n : next)
			n.setParent(parent);

		return next.toArray(new State[0]);
	}

	private static List<Atom> produceAtoms(StandardConfigurationNode pc) {
		List<Atom> atoms = new ArrayList<>();
		for (IFeature f : pc.getConfiguration().getFeatures()) {
			FeatureAtom fa = RulesFactory.eINSTANCE.createFeatureAtom();
			fa.setFeature(f);
			atoms.add(fa);
		}
		for (DataBinding db : pc.getConfiguration().getBindings()) {
			DataAtom da = RulesFactory.eINSTANCE.createDataAtom();
			da.setLeaf(db.getLeaf());
			da.setValue(db.getValue());
			atoms.add(da);
		}

		return atoms;
	}

	private static List<DeactivateFeatureAction> getDeactivateFeatures(
			State before, StandardConfigurationNode after) {
		List<Atom> afterAtoms = produceAtoms(after);
		List<DeactivateFeatureAction> deactivated = new ArrayList<>();
		before: for (Predicate ba : before.getPropositions()) {
			if (ba instanceof FeatureAtom) {
				for (Atom aa : afterAtoms) {
					if (aa instanceof FeatureAtom
							&& ((FeatureAtom) aa).getFeature().equals(
									((FeatureAtom) ba).getFeature()))
						continue before;
				}
				DeactivateFeatureAction dfa = fActions
						.createDeactivateFeatureAction();
				dfa.setFeature(((FeatureAtom) ba).getFeature());
				deactivated.add(dfa);
			}
		}
		return deactivated;
	}

	private List<ReconfigurationAction> getFinalConfigurationActions(
			State before, ConfigurationNode target) {
		FunctionProcessor f = new FunctionProcessor(getSatFoundation(), before);

		List<ReconfigurationAction> actions = getAllConfigurationActions(
				before, target, new LinkedList<ConfigurationNode>());
		List<ReconfigurationAction> remove = new ArrayList<ReconfigurationAction>();
		for (int i = actions.size() - 1; i > 0; i--) {
			ReconfigurationAction ra = actions.get(i);
			for (int j = i - 1; j >= 0; j--) {
				ReconfigurationAction check = actions.get(j);
				if (ra instanceof ActivateFeatureAction
						&& check instanceof ActivateFeatureAction
						&& ((ActivateFeatureAction) ra).getFeature().equals(
								((ActivateFeatureAction) check).getFeature()))
					remove.add(check);
				if (ra instanceof ActivateFeatureAction
						&& check instanceof DeactivateFeatureAction
						&& ((ActivateFeatureAction) ra).getFeature().equals(
								((DeactivateFeatureAction) check).getFeature()))
					remove.add(check);
				if (ra instanceof DeactivateFeatureAction
						&& check instanceof DeactivateFeatureAction
						&& ((DeactivateFeatureAction) ra).getFeature().equals(
								((DeactivateFeatureAction) check).getFeature()))
					remove.add(check);
				if (ra instanceof DeactivateFeatureAction
						&& check instanceof ActivateFeatureAction
						&& ((DeactivateFeatureAction) ra).getFeature().equals(
								((ActivateFeatureAction) check).getFeature()))
					remove.add(check);
				if (ra instanceof SetDataAction
						&& check instanceof SetDataAction) {
					DataStructureNode raNode = f.evaluate(
							((SetDataAction) ra).getNode(),
							new HashMap<String, Object>());
					DataStructureNode checkNode = f.evaluate(
							((SetDataAction) check).getNode(),
							new HashMap<String, Object>());
					if (raNode.equals(checkNode))
						remove.add(check);
				}
			}
		}

		actions.removeAll(remove);
		return actions;
	}

	private List<ReconfigurationAction> getAllConfigurationActions(
			State before, ConfigurationNode target,
			List<ConfigurationNode> visited) {
		List<ReconfigurationAction> actions = new LinkedList<ReconfigurationAction>();
		if (target instanceof ComposedConfigurationNode) {
			visited.add(target);
			for (Edge e : ocm.getEdges()) {
				if (e instanceof CompositionEdge
						&& ((CompositionEdge) e).getTarget().equals(target)) {
					ConfigurationNode in = ((CompositionEdge) e).getSource();
					if (visited.contains(in))
						throw new RuntimeException("Cyclic composition in OCM "
								+ ocm);
					actions.addAll(getAllConfigurationActions(before, in,
							visited));
				}
			}
		} else if (target instanceof StandardConfigurationNode) {
			actions.addAll(getDeactivateFeatures(before,
					(StandardConfigurationNode) target));
			for (Atom a : produceAtoms((StandardConfigurationNode) target)) {
				if (a instanceof FeatureAtom) {
					ActivateFeatureAction afa = fActions
							.createActivateFeatureAction();
					afa.setFeature(((FeatureAtom) a).getFeature());
					afa.setVersion(((FeatureAtom) a).getVersion());
					actions.add(afa);
				} else if (a instanceof DataAtom) {
					SetDataAction sda = fActions.createSetDataAction();
					DataNodeFunction dnf = FunctionsFactory.eINSTANCE
							.createDataNodeFunction();
					dnf.setData(((DataAtom) a).getLeaf());
					sda.setNode(dnf);
					DataValueFunction def = FunctionsFactory.eINSTANCE
							.createDataValueFunction();
					def.setValue(((DataAtom) a).getValue());
					sda.setValues(def);
					actions.add(sda);
				}
			}
		} else if (target instanceof ReconfigurationActionNode) {
			actions.addAll(((ReconfigurationActionNode) target).getActions());
		}

		return actions;
	}

}
