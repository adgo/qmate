package org.tud.inf.st.mbt.emf.generator;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractOperator {
	public abstract State[] operate(State s);

	public void contributeToInitialState(State s) {
	}

	public AbstractOperator ifEmpty(final AbstractOperator then){
		return new AbstractOperator() {
			
			@Override
			public State[] operate(State s) {
				State[] result = AbstractOperator.this.operate(s);
				if(result == null || result.length==0)return then.operate(s);
				else return result;
			}
			
			@Override
			public void contributeToInitialState(State s) {
				AbstractOperator.this.contributeToInitialState(s);
				then.contributeToInitialState(s);
			}
		};
	}
	
	public static AbstractOperator combine(final AbstractOperator... ops){
		return new AbstractOperator() {
			
			@Override
			public State[] operate(State s) {
				List<State> result = new ArrayList<>(ops.length);
				for(AbstractOperator op:ops)
					for(State r:op.operate(s))
						result.add(r);
				return result.toArray(new State[0]);
			}
			
			@Override
			public void contributeToInitialState(State s) {
				for(AbstractOperator op:ops)op.contributeToInitialState(s);
			}
		};
	}
}
