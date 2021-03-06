package org.tud.inf.st.mbt.emf.generator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.tud.inf.st.mbt.emf.util.FunctionProcessor;
import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.TimingType;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;

public class CAOperator extends TransitionOperator {
	private TimingType timingType;

	public CAOperator(SATFoundation sf, boolean ignoreRealTime,
			TimingType timingType) {
		super(sf, ignoreRealTime);
		this.timingType = timingType;
	}

	@Override
	protected boolean isEnabled(State s, Transition t) {
		if (!(t instanceof ConditionActionTransition))
			return super.isEnabled(s, t);

		ConditionActionTransition cat = (ConditionActionTransition) t;
		return super.isEnabled(s, t)
				&& conditionHolds(s, cat.getApplicationCondition(),
						(GuiGraph) cat.eContainer());
	}

	@Override
	public State[] operate(State s) {
		List<State> next = new LinkedList<>();

		new FunctionProcessor(getSatFoundation(), s).recomputeFunctionResults();

		List<Transition> activated = super.computeActivatedTransitions(s);

		for (Transition t : activated)
			if (t instanceof ConditionActionTransition
					&& t.getTimingType().equals(timingType)) {
				ConditionActionTransition cat = (ConditionActionTransition) t;

				if (cat.getActions() == null
						|| cat.getActions().getActions().size() == 0) {
					State n = new State(s, null, false, new PredicateList(
							s.getPropositions()), cat);
					n.setTerminating(cat.isTerminates());
					consumeAndProduce(cat, n);
					n.setPriority(cat.getRisk());
					next.add(n);
				} else {
					List<State> postAction = getSatFoundation().getActionProcessor().executeAction(cat,s,
							cat.getActions(),
							Collections.<String, Object> emptyMap(), cat);
					for (State pa : postAction)
						pa.setPriority(cat.getRisk());
					next.addAll(postAction);
				}

			}

		return next.toArray(new State[0]);
	}
}
