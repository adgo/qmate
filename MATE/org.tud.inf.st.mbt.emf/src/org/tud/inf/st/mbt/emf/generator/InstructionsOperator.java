package org.tud.inf.st.mbt.emf.generator;

import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;

public class InstructionsOperator extends TransitionOperator {

	private ActionProcessor actionProcessor;

	public InstructionsOperator(SATFoundation satFoundation,
			boolean ignoreRealTime) {
		super(satFoundation, ignoreRealTime);
		this.actionProcessor = new ActionProcessor(satFoundation);
	}

	@Override
	public State[] operate(State s) {
		if (s.isTopInstructionSequenceRunning()) {
			return actionProcessor.operateTopInstructionSequence(s);
		}
		if (s.isTopInstructionSequenceFinishing()
				&& s.getTopInstructionContainer() instanceof ConditionActionTransition) {
			ConditionActionTransition cat = (ConditionActionTransition) s
					.getTopInstructionContainer();
			State n = new State(s, null, cat.isTerminates(), new PredicateList(
					s.getPropositions()), cat);
			n.deconfigureProposition(n.getTopInstructionPointerAtom());
			consumeAndProduce(cat, n,s.getTopInstructionPointerAtom().getInstancePath());
			return new State[] { n };
		}
		if (s.isTopInstructionSequenceFinishing()
				&& s.getTopInstructionContainer() == null) {
			State n = new State(s, null, false, new PredicateList(
					s.getPropositions()));
			n.deconfigureProposition(n.getTopInstructionPointerAtom());
			return new State[] { n };
		}
		return new State[]{};
	}

}
