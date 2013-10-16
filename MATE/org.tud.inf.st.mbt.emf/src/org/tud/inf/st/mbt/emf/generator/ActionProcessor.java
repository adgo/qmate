package org.tud.inf.st.mbt.emf.generator;

import static org.tud.inf.st.mbt.emf.util.ModelUtil.atom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.mbt.actions.ActionReference;
import org.tud.inf.st.mbt.actions.ActionsFactory;
import org.tud.inf.st.mbt.actions.ActivateFeatureAction;
import org.tud.inf.st.mbt.actions.DeactivateFeatureAction;
import org.tud.inf.st.mbt.actions.FailAction;
import org.tud.inf.st.mbt.actions.GetDataAction;
import org.tud.inf.st.mbt.actions.GetPropertyAction;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.actions.PreGenerationAction;
import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.actions.RemoveBagAction;
import org.tud.inf.st.mbt.actions.SetDataAction;
import org.tud.inf.st.mbt.actions.TermAction;
import org.tud.inf.st.mbt.actions.ThrowAction;
import org.tud.inf.st.mbt.actions.TimeAction;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.IContextVariable;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.DataScenario;
import org.tud.inf.st.mbt.data.TypedDataElement;
import org.tud.inf.st.mbt.emf.util.FunctionProcessor;
import org.tud.inf.st.mbt.emf.util.FunctionProcessor.Data;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.functions.IArithmetricFunction;
import org.tud.inf.st.mbt.functions.IDataNodeFunction;
import org.tud.inf.st.mbt.functions.IValueFunction;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;
import org.tud.inf.st.mbt.rules.ITimeConsumer;
import org.tud.inf.st.mbt.rules.InstructionPointerAtom;
import org.tud.inf.st.mbt.rules.RulesFactory;
import org.tud.inf.st.mbt.terms.ContainerTerm;
import org.tud.inf.st.mbt.terms.FunctionTerm;
import org.tud.inf.st.mbt.terms.FunctorTerm;
import org.tud.inf.st.mbt.terms.ListTerm;
import org.tud.inf.st.mbt.terms.ReferenceTerm;
import org.tud.inf.st.mbt.terms.Term;
import org.tud.inf.st.mbt.terms.TermVariable;
import org.tud.inf.st.mbt.terms.TermsFactory;

public class ActionProcessor {
	private static final ActionsFactory fActions = ActionsFactory.eINSTANCE;
	private static final RulesFactory fRules = RulesFactory.eINSTANCE;

	private SATFoundation satFoundation;

	public ActionProcessor(SATFoundation sf) {
		this.satFoundation = sf;
	}

	public static PreGenerationAction normalize(PreGenerationAction a,
			Collection<IFeature> features, Map<String, Object> context) {
		a = EcoreUtil.copy(a);

		if (a instanceof ActionReference) {
			Map<String, Object> nextContext = new HashMap<String, Object>();
			for (int i = 0; i < ((ActionReference) a).getParameters().size(); i++) {
				Object value = ((ActionReference) a).getParameters().get(i);
				String id = ModelUtil.getVariableID(((ActionReference) a)
						.getAction().getParameters().get(i));
				nextContext.put(id, value);
			}
			a = normalize(((ActionReference) a).getAction().getAction(),
					features, nextContext);
		} else if (a instanceof PreGenerationSequence) {
			int i = 0;
			for (PreGenerationAction e : ((PreGenerationSequence) a)
					.getActions().toArray(new PreGenerationAction[0])) {
				((PreGenerationSequence) a).getActions().set(i,
						normalize(e, features, context));
				i++;
			}
		} else if (a instanceof SetDataAction) {
			((SetDataAction) a)
					.setNode((IDataNodeFunction) FunctionProcessor.normalize(
							((SetDataAction) a).getNode(), features, context));
			((SetDataAction) a).setValues((IValueFunction) FunctionProcessor
					.normalize(((SetDataAction) a).getValues(), features,
							context));
		} else if (a instanceof GetDataAction) {
			((GetDataAction) a)
					.setNode((IDataNodeFunction) FunctionProcessor.normalize(
							((GetDataAction) a).getNode(), features, context));
		} else if (a instanceof RemoveBagAction) {
			((RemoveBagAction) a)
					.setIndex((IArithmetricFunction) FunctionProcessor
							.normalize(((RemoveBagAction) a).getIndex(),
									features, context));
		} else if (a instanceof TermAction) {
			((TermAction) a).setTerm(normalize(((TermAction) a).getTerm(),
					features, context));
		}

		return a;
	}

	public static Term normalize(Term t, Collection<IFeature> features,
			Map<String, Object> context) {
		t = EcoreUtil.copy(t);

		if (t instanceof FunctionTerm) {
			((FunctionTerm) t).setFunction(FunctionProcessor.normalize(
					((FunctionTerm) t).getFunction(), features, context));
		} else if (t instanceof FunctorTerm) {
			for (int i = 0; i < ((FunctorTerm) t).getArguments().size(); i++) {
				((FunctorTerm) t).getArguments().set(
						i,
						normalize(((FunctorTerm) t).getArguments().get(i),
								features, context));
			}
		} else if (t instanceof TermVariable) {
			t = (Term) context.get(((TermVariable) t).getId());
		} else if (t instanceof ListTerm) {
			for (int i = 0; i < ((ListTerm) t).getElements().size(); i++) {
				((ListTerm) t).getElements().set(
						i,
						normalize(((ListTerm) t).getElements().get(i),
								features, context));
			}
		}

		return t;
	}

	public Term evaluateFunctions(State s, Term t, Map<String, Object> context) {
		if (t instanceof FunctionTerm) {
			Object result = new FunctionProcessor(satFoundation, s).evaluate(
					((FunctionTerm) t).getFunction(), context);
			if (result instanceof Data) {
				Data resultData = (Data) result;
				if ((((Data) result).getBindings().get(0).getValue()
						.eResource() == null)) {
					ContainerTerm ct = TermsFactory.eINSTANCE
							.createContainerTerm();
					ct.setContainment(resultData.getBindings().get(0)
							.getValue());
					return ct;
				} else {
					if (resultData.getBindings().get(0).getValue() instanceof TypedDataElement) {
						return ModelUtil
								.value2Term((TypedDataElement) resultData
										.getBindings().get(0).getValue());
					} else {
						ReferenceTerm rt = TermsFactory.eINSTANCE
								.createReferenceTerm();
						rt.setReference(resultData.getBindings().get(0)
								.getValue());
						return rt;
					}
				}
			}
			if (result instanceof AbstractModelElement) {
				AbstractModelElement eo = (AbstractModelElement) result;
				if (eo.eResource() == null) {
					ContainerTerm ct = TermsFactory.eINSTANCE
							.createContainerTerm();
					ct.setContainment(eo);
					return ct;
				} else {
					ReferenceTerm rt = TermsFactory.eINSTANCE
							.createReferenceTerm();
					rt.setReference(eo);
					return rt;
				}
			}

			throw new UnsupportedOperationException("substituteFunctions: " + s
					+ " " + t);
		} else if (t instanceof FunctorTerm) {
			FunctorTerm result = (FunctorTerm) EcoreUtil.copy(t);
			result.getArguments().clear();
			for (Term arg : ((FunctorTerm) t).getArguments()) {
				result.getArguments().add(evaluateFunctions(s, arg, context));
			}
			return result;
		} else if (t instanceof TermVariable) {
			return (Term) context.get(((TermVariable) t).getId());
		} else if (t instanceof ListTerm) {
			ListTerm result = (ListTerm) EcoreUtil.copy(t);
			result.getElements().clear();
			for (Term arg : ((ListTerm) t).getElements()) {
				result.getElements().add(evaluateFunctions(s, arg, context));
			}
			return result;
		}
		return EcoreUtil.copy(t);
	}

	public List<State> executeAction(State s, PreGenerationAction a,
			Map<String, Object> context, AbstractModelElement... traceableTo) {
		if (traceableTo == null || traceableTo.length == 0
				&& s.getParent() != null)
			traceableTo = s.getParent().getTraceableTo();

		FunctionProcessor fproc = new FunctionProcessor(satFoundation, s);

		List<State> next = new ArrayList<State>(1);
		if (a instanceof FailAction) {
			State n = new State(s,
					Collections.<PostGenerationAction> emptyList(), false,
					new PredicateList(s.getPropositions()), traceableTo);
			n.addActions((PostGenerationAction) a);
			n.setFailed(true);
			next.add(n);
		} else if (a instanceof SetDataAction) {
			next.addAll(Arrays.asList(new SetDataOperator(fproc.evaluate(
					((SetDataAction) a).getNode(), context), fproc.evaluate(
					((SetDataAction) a).getValues(), context)).operate(s)));
		} else if (a instanceof GetDataAction) {
			State n = new State(s,
					Collections.<PostGenerationAction> emptyList(), false,
					new PredicateList(s.getPropositions()), traceableTo);
			DataLeaf l = (DataLeaf) fproc.evaluate(
					((GetDataAction) a).getNode(), context);
			GetPropertyAction get = fActions.createGetPropertyAction();
			get.setProperty(l);
			n.getActions().getActions().add(get);
			next.add(n);
		} else if (a instanceof RemoveBagAction) {
			State n = new State(s,
					Collections.<PostGenerationAction> emptyList(), false,
					new PredicateList(s.getPropositions()), traceableTo);
			int idx = (int) ModelUtil.getValue(fproc.evaluate(
					((RemoveBagAction) a).getIndex(), context));
			n.deconfigureProposition(atom(((RemoveBagAction) a).getBag(), idx));
			next.add(n);
		} else if (a instanceof TermAction) {
			State n = new State(s,
					Collections.<PostGenerationAction> emptyList(), false,
					new PredicateList(s.getPropositions()), traceableTo);
			Term postGenTerm = evaluateFunctions(s, ((TermAction) a).getTerm(),
					context);
			TermAction postAction = fActions.createTermAction();
			postAction.setTerm(postGenTerm);
			n.addActions(postAction);
			next.add(n);
		} else if (a instanceof ThrowAction) {
			@SuppressWarnings("unchecked")
			List<OperationalConfigurationModel> ocms = (List<OperationalConfigurationModel>) ModelUtil
					.getAllEObjectsOfSuperType(satFoundation.getResourceSet(),
							OperationalConfigurationModel.class);
			for (OperationalConfigurationModel ocm : ocms)
				next.addAll(Arrays.asList(new OCMOperator(satFoundation, ocm,
						((ThrowAction) a).getEventID()).operate(s)));
			if (next.isEmpty()) {
				State n = new State(s,
						Collections.<PostGenerationAction> emptyList(), false,
						new PredicateList(s.getPropositions()), traceableTo);
				next.add(n);
			}
		} else if (a instanceof PreGenerationSequence) {
			InstructionPointerAtom ipa = fRules.createInstructionPointerAtom();
			ipa.setInstruction(0);
			InstructionPointerAtom top = s.getTopInstructionPointerAtom();
			ipa.setStackLevel(top != null ? s.getTopInstructionPointerAtom()
					.getStackLevel() + 1 : 0);
			ipa.setSequence((PreGenerationSequence) a);
			ModelUtil.setContext(ipa, context);

			State n = new State(s,
					Collections.<PostGenerationAction> emptyList(), false,
					new PredicateList(s.getPropositions()), traceableTo);
			n.configureProposition(ipa);
			next.add(n);
		} else if (a instanceof ActivateFeatureAction) {
			State n = new State(s,
					Collections.<PostGenerationAction> emptyList(), false,
					new PredicateList(s.getPropositions()), traceableTo);
			n.configureProposition(atom(
					((ActivateFeatureAction) a).getFeature(),
					((ActivateFeatureAction) a).getVersion()));
			next.add(n);
		} else if (a instanceof DeactivateFeatureAction) {
			State n = new State(s,
					Collections.<PostGenerationAction> emptyList(), false,
					new PredicateList(s.getPropositions()), traceableTo);
			n.deconfigureProposition(atom(
					((DeactivateFeatureAction) a).getFeature(), null));
			next.add(n);
		} else if (a instanceof TimeAction) {
			ITimeConsumer consumer = ((TimeAction) a).getConsumer();
			int time = ((TimeAction) a).getTime();
			if (consumer instanceof OperationalConfigurationModel) {
				next.addAll(Arrays.asList(new OCMOperator(satFoundation,
						(OperationalConfigurationModel) consumer, time)
						.operate(s)));
			} else if (consumer instanceof DataScenario) {
				next.addAll(Arrays.asList(new DataScenarioOperator(
						satFoundation, (DataScenario) consumer, time)
						.operate(s)));
			} else {
				for (ITimeConsumer tc : ModelUtil.getAllEObjectsOfSuperType(
						satFoundation.getResourceSet(), ITimeConsumer.class)) {
					consumer = tc;
					if (consumer instanceof OperationalConfigurationModel) {
						next.addAll(Arrays.asList(new OCMOperator(
								satFoundation,
								(OperationalConfigurationModel) consumer, time)
								.operate(s)));
					} else if (consumer instanceof DataScenario) {
						next.addAll(Arrays.asList(new DataScenarioOperator(
								satFoundation, (DataScenario) consumer, time)
								.operate(s)));
					}
				}
			}
		} else if (a instanceof ActionReference) {
			Map<String, Object> nextContext = new HashMap<String, Object>();
			for (int i = 0; i < ((ActionReference) a).getParameters().size(); i++) {
				Object value = ((ActionReference) a).getParameters().get(i);
				IContextVariable v = ((ActionReference) a).getAction()
						.getParameters().get(i);
				String id = ModelUtil.getVariableID(v);
				nextContext.put(id, value);
			}
			next.addAll(this.executeAction(s, ((ActionReference) a).getAction()
					.getAction(), nextContext, traceableTo));
		} else if (a instanceof PostGenerationAction) {
			State n = new State(s,
					Collections.<PostGenerationAction> emptyList(), false,
					new PredicateList(s.getPropositions()), traceableTo);
			n.getActions().getActions()
					.add((PostGenerationAction) EcoreUtil.copy(a));
			next.add(n);
		} else {
			throw new UnsupportedOperationException("Action: " + a);
		}
		return next;
	}

	public State[] operateTopInstructionSequence(State s) {
		InstructionPointerAtom ipa = s.getTopInstructionPointerAtom();
		EList<PreGenerationAction> actions = ipa.getSequence().getActions();
		PreGenerationAction a = actions.get(ipa.getInstruction());
		List<State> next = new ArrayList<State>(1);

		AbstractModelElement container = (AbstractModelElement) ipa
				.eContainer();
		AbstractModelElement[] traceableTo = container != null
				&& container instanceof AbstractModelElement ? new AbstractModelElement[] { container }
				: new AbstractModelElement[0];
		next.addAll(executeAction(s, a, ModelUtil.getContext(ipa), traceableTo));
		for (State n : next) {
			n.deconfigureProposition(ipa);
			InstructionPointerAtom nipa = EcoreUtil.copy(ipa);
			nipa.setInstruction(nipa.getInstruction() + 1);
			n.configureProposition(nipa);
			new FunctionProcessor(satFoundation, n).recomputeFunctionResults();
		}
		return next.toArray(new State[0]);
	}
}
