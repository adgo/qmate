package org.tud.inf.st.mbt.emf.generator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.tud.inf.st.mbt.actions.ActionsFactory;
import org.tud.inf.st.mbt.actions.GetRealTimeAction;

public class RealTimeOperator extends TransitionOperator {

	public RealTimeOperator(SATFoundation satFoundation, boolean ignoreRealTime) {
		super(satFoundation, ignoreRealTime);
	}

	@Override
	public State[] operate(State s) {
		List<State> next = new LinkedList<>();
				
		if (!isIgnoreRealtime()) {
			
			computeActivatedTransitions(s);
			
			GetRealTimeAction grta = ActionsFactory.eINSTANCE
					.createGetRealTimeAction();
			long hint = s.getMinTimeToElapse();
			if (hint != Long.MAX_VALUE && hint!=0) {
				grta.setTimeHint(hint);
				next.addAll(getSatFoundation().getActionProcessor().executeAction(s, grta,
						Collections.<String, Object> emptyMap()));
			}
		}
		
		return next.toArray(new State[0]);
	}

}
