package org.tud.inf.st.mbt.emf.generator;

import static org.tud.inf.st.mbt.emf.util.ModelUtil.not;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.actions.TimedConditionAction;
import org.tud.inf.st.mbt.emf.transformations.Model2Logic;
import org.tud.inf.st.mbt.emf.util.FunctionProcessor;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.functions.ILogicFunction;
import org.tud.inf.st.mbt.rules.IRealTimeConsumer;
import org.tud.inf.st.mbt.rules.Predicate;

public class TimedConditionActionOperator extends AbstractOperator {

	private SATFoundation satFoundation;
	private SAT sat;

	public TimedConditionActionOperator(SATFoundation sf) {
		this.satFoundation = sf;
		this.sat = sf.buildSAT();
	}

	@Override
	public State[] operate(State s) {
		List<State> next = new ArrayList<>(5);
		for (IRealTimeConsumer rcs : s
				.getRealTimeEnabledConsumers(TimedConditionAction.class)) {
			TimedConditionAction tca = (TimedConditionAction) rcs;
			List<State> nextLocal = new ArrayList<State>(5);

			ILogicFunction cond = (ILogicFunction) FunctionProcessor.normalize(
					tca.getCondition(), satFoundation.getFeatures(),
					Collections.<String, Object> emptyMap());
			if (conditionHolds(s, ModelUtil.atom(cond))) {
				nextLocal.addAll(satFoundation.getActionProcessor()
						.executeAction(tca, s, tca.getAction(),
								Collections.<String, Object> emptyMap(), tca));
			} else {
				State n = new State(s,
						Collections.<PostGenerationAction> emptyList(), false,
						s.getPropositions());
				nextLocal.add(n);
			}

			for (State n : nextLocal)
				n.configureProposition(ModelUtil.atom(tca, 0));
			next.addAll(nextLocal);
		}

		return next.toArray(new State[0]);
	}

	protected boolean conditionHolds(State s, Predicate p) {
		p = Model2Logic.normalize(p, satFoundation.getFeatures(),
				new HashMap<String, Object>());

		Conjunction appendix = new Conjunction();

		PredicateList unfold = s.getUnfoldPropositions();
		for (Predicate a : unfold) {
			if (satFoundation.getBase().contains(a)) {
				Clause unit = new Clause();
				unit.add(a);
				appendix.add(unit);
			}
		}
		for (Predicate a : satFoundation.getBase()) {
			if (!unfold.contains(a)) {
				Clause unit = new Clause();
				unit.add(not(EcoreUtil.copy(a)));
				appendix.add(unit);
			}
		}
		return sat.isSatisfiable(p, appendix);
	}

}
