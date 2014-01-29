package org.tud.inf.st.mbt.emf.generator;

import static org.tud.inf.st.mbt.emf.util.ModelUtil.atom;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.atoms;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.getAllEObjectsOfSuperType;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.getAllLowerElements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.mbt.actions.PreGenerationAction;
import org.tud.inf.st.mbt.actions.TimedConditionAction;
import org.tud.inf.st.mbt.data.DataBag;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.emf.transformations.Model2Logic;
import org.tud.inf.st.mbt.emf.util.FunctionProcessor;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.functions.IFunction;
import org.tud.inf.st.mbt.functions.ILogicFunction;
import org.tud.inf.st.mbt.ocm.ReconfigurationActionNode;
import org.tud.inf.st.mbt.rules.LogicFunctionAtom;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RulesFactory;
import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;

public class SATFoundation {
	private PredicateList base;
	private Collection<IFeature> features;
	private ResourceSet rs;
	private int maxTokens, maxTime;
	private PredicateList logicFunctionAtoms;
	private Map<GuiGraph, Conjunction> invariants = new HashMap<GuiGraph, Conjunction>();
	private Map<Integer,Set<?>> cache = new HashMap<Integer, Set<?>>();
	private ActionProcessor actionProcessor;

	public SATFoundation(ResourceSet rs, int maxTokens, int maxTime) {
		this.rs = rs;
		this.maxTime = maxTime;
		this.maxTokens = maxTokens;
		this.actionProcessor = new ActionProcessor(this);
	}
	
	public ActionProcessor getActionProcessor() {
		return actionProcessor;
	}
	
	public Map<Integer, Set<?>> getCache() {
		return cache;
	}

	public PredicateList getBase() {
		return base;
	}

	public Collection<IFeature> getFeatures() {
		return features;
	}

	public int getMaxTime() {
		return maxTime;
	}

	public int getMaxTokens() {
		return maxTokens;
	}

	public ResourceSet getResourceSet() {
		return rs;
	}

	public Collection<LogicFunctionAtom> getLogicFunctionAtoms() {
		List<LogicFunctionAtom> lfal = new ArrayList<LogicFunctionAtom>();
		for (Predicate p : logicFunctionAtoms)
			if (p instanceof LogicFunctionAtom)
				lfal.add((LogicFunctionAtom) p);
		return lfal;
	}

	public Conjunction getInvariant(GuiGraph gg) {
		return invariants.get(gg);
	}

	public SAT buildSAT() {
		base = new PredicateList();

		Collection<DataBag> bags = getAllEObjectsOfSuperType(cache,rs, DataBag.class);
		for (DataBag b : bags) {
			b.organize();
		}
		Collection<DataLeaf> leafs = getAllEObjectsOfSuperType(cache,rs,
				DataLeaf.class);
		for (DataLeaf l : leafs) {
			for (DataElement e : getAllLowerElements(l.getDomain())) {
				base.add(atom(l, e));
			}
		}

		// Collection<Place> places = getAllEObjectsOfSuperType(rs,
		// Place.class);
		// for (Place p : places) {
		// for (int i = 1; i <= getMaxTokens(); i++) {
		// base.add(atom(p, i));
		// }
		// }

		features = getAllEObjectsOfSuperType(cache,rs, IFeature.class);
		for (IFeature f : features) {
			base.addAll(atoms(f));
		}

		// Collection<ConfigurationNode> pcs = getAllEObjectsOfSuperType(rs,
		// ConfigurationNode.class);
		// for (ConfigurationNode pc : pcs) {
		// base.add(atom(pc));
		// }

		// generate logic function atoms
		logicFunctionAtoms = new PredicateList();
		Set<LogicFunctionAtom> logicFunctionAtoms_unNormalized = new HashSet<LogicFunctionAtom>();
		Set<IFunction> actionFunctionsNormalized = new HashSet<IFunction>();

		Collection<GuiGraph> ggs = getAllEObjectsOfSuperType(cache,rs, GuiGraph.class);
		for (GuiGraph gg : ggs) {
			logicFunctionAtoms_unNormalized.addAll(getAllEObjectsOfSuperType(cache,
					gg.getInvariant(), LogicFunctionAtom.class, false));
		}

		Collection<ConditionActionTransition> cats = getAllEObjectsOfSuperType(cache,
				rs, ConditionActionTransition.class);
		for (ConditionActionTransition cat : cats) {
			// if (cat.getActions() != null
			// && !cat.getActions().getActions().isEmpty()) {
			// int instructions = cat.getActions().getActions().size();
			// for (int i = 0; i < instructions; i++) {
			// base.add(atom(cat.getActions(), i));
			// }
			// }

			logicFunctionAtoms_unNormalized.addAll(getAllEObjectsOfSuperType(cache,
					cat.getApplicationCondition(), LogicFunctionAtom.class,
					false));
			PreGenerationAction pga_normalized = actionProcessor.normalize(
					cat.getActions(), features, new HashMap<String, Object>());
			actionFunctionsNormalized.addAll(getAllEObjectsOfSuperType(cache,
					pga_normalized, ILogicFunction.class, false));

		}

		for (ReconfigurationActionNode ran : getAllEObjectsOfSuperType(cache,rs,
				ReconfigurationActionNode.class, false)) {
			for (PreGenerationAction pga : ran.getActions()) {
				PreGenerationAction pga_normalized = actionProcessor.normalize(
						pga, features, new HashMap<String, Object>());
				actionFunctionsNormalized.addAll(getAllEObjectsOfSuperType(cache,
						pga_normalized, ILogicFunction.class, false));
			}
		}

		for (TimedConditionAction tca : getAllEObjectsOfSuperType(cache,rs,
				TimedConditionAction.class, false)) {
			PreGenerationAction pga_normalized = actionProcessor.normalize(
					tca.getAction(), features, new HashMap<String, Object>());
			actionFunctionsNormalized.addAll(getAllEObjectsOfSuperType(cache,
					pga_normalized, ILogicFunction.class, false));
			ILogicFunction pNormal = (ILogicFunction) FunctionProcessor
					.normalize(tca.getCondition(), features,
							new HashMap<String, Object>());
			LogicFunctionAtom lfa_normal = RulesFactory.eINSTANCE
					.createLogicFunctionAtom();
			lfa_normal.setFunction(pNormal);
			logicFunctionAtoms.add(lfa_normal);
		}

		for (LogicFunctionAtom lfa : logicFunctionAtoms_unNormalized) {
			LogicFunctionAtom lfa_normal = RulesFactory.eINSTANCE
					.createLogicFunctionAtom();
			lfa_normal.setFunction((ILogicFunction) FunctionProcessor
					.normalize(lfa.getFunction(), features,
							Collections.<String, Object> emptyMap()));
			logicFunctionAtoms.add(lfa_normal);
		}

		for (IFunction f : actionFunctionsNormalized) {
			LogicFunctionAtom lfa_normal = RulesFactory.eINSTANCE
					.createLogicFunctionAtom();
			lfa_normal.setFunction(EcoreUtil.copy((ILogicFunction) f));
			logicFunctionAtoms.add(lfa_normal);
		}

		// Collection<ITimeConsumer> cs = getAllEObjectsOfSuperType(rs,
		// ITimeConsumer.class);
		// for (ITimeConsumer c : cs) {
		// for (int t = 0; t <= maxTime; t++) {
		// base.add(atom(c, t));
		// }
		// }

		buildInvariants();

		base.addAll(logicFunctionAtoms);
		return new SAT(base);
	}

	private void buildInvariants() {
		Collection<GuiGraph> ggs = getAllEObjectsOfSuperType(cache,rs, GuiGraph.class);
		Collection<IFeature> fl = getAllEObjectsOfSuperType(cache,rs, IFeature.class);
		for (GuiGraph gg : ggs) {
			if (gg.getInvariant() != null) {
				Predicate fcp = Model2Logic.normalize(gg.getInvariant(), fl,
						new HashMap<String, Object>());
				Conjunction invariant = CnfBuilder.buildCnf(fcp).complete();
				invariants.put(gg, invariant);
			} else {
				invariants.put(gg, new Conjunction());
			}
		}
	}
}
