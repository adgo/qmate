package org.tud.inf.st.mbt.emf.generator;

import static org.tud.inf.st.mbt.emf.util.ModelUtil.atom;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.getAllEObjectsOfSuperType;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.tud.inf.st.mbt.actions.ActionsFactory;
import org.tud.inf.st.mbt.actions.GetRealTimeAction;
import org.tud.inf.st.mbt.emf.util.FunctionProcessor;
import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode;
import org.tud.inf.st.mbt.ulang.guigraph.TimingType;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;

public class CAOperator extends TransitionOperator {
	private ActionProcessor actionProcessor;
	private TimingType timingType;

	public CAOperator(SATFoundation sf, boolean ignoreRealTime,
			TimingType timingType) {
		super(sf, ignoreRealTime);
		actionProcessor = new ActionProcessor(sf);
		this.timingType = timingType;
	}

	@Override
	public void contributeToInitialState(State s) {
		Collection<NoWidgetNode> places = getAllEObjectsOfSuperType(
				getSatFoundation().getResourceSet(), NoWidgetNode.class);

		for (NoWidgetNode p : places)
			if (p.getInitialTokens() > 0)
				s.configureProposition(atom(p, p.getInitialTokens()));

		computeEnabledTransitions(s);
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

		if (!isIgnoreRealtime() && timingType.equals(TimingType.INTERVAL)) {
			GetRealTimeAction grta = ActionsFactory.eINSTANCE
					.createGetRealTimeAction();
			long hint = s.getMinTimeToElapse();
			if (hint != Long.MAX_VALUE) {
				grta.setTimeHint(hint);
				next.addAll(actionProcessor.executeAction(s, grta,
						Collections.<String, Object> emptyMap()));
			}
		}

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
					n.setPriority(cat.getRate() * cat.getFaultImpact()
							* cat.getFaultProbability());
					next.add(n);
				} else {
					List<State> postAction = actionProcessor.executeAction(s,
							cat.getActions(),
							Collections.<String, Object> emptyMap(), cat);
					for (State pa : postAction)
						pa.setPriority(cat.getRate() * cat.getFaultImpact()
								* cat.getFaultProbability());
					next.addAll(postAction);
				}

				cat.setRate(Math.max(cat.getRate() - 1, 0));

			}

		return next.toArray(new State[0]);
	}
}
