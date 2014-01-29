package org.tud.inf.st.mbt.emf.generator;

import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;

public class InstructionsOperator extends TransitionOperator {

	public InstructionsOperator(SATFoundation satFoundation,
			boolean ignoreRealTime) {
		super(satFoundation, ignoreRealTime);	}

	@Override
	public State[] operate(State s) {
		if (s.isTopInstructionSequenceRunning()) {
			return getSatFoundation().getActionProcessor().operateTopInstructionSequence(s);
		}
		if (s.isTopInstructionSequenceFinishing()
				&& s.getTopInstructionFallBack() instanceof ConditionActionTransition) {
			ConditionActionTransition cat = (ConditionActionTransition) s
					.getTopInstructionFallBack();
			State n = new State(s, null, cat.isTerminates(), new PredicateList(
					s.getPropositions()), cat);
			n.deconfigureProposition(n.getTopInstructionPointerAtom());
			consumeAndProduce(cat, n);
			return new State[] { n };
		}
		if (s.isTopInstructionSequenceFinishing()
				&& s.getTopInstructionFallBack() == null) {
			State n = new State(s, null, false, new PredicateList(
					s.getPropositions()));
			n.deconfigureProposition(n.getTopInstructionPointerAtom());
			return new State[] { n };
		}
		return new State[]{};
	}

}
