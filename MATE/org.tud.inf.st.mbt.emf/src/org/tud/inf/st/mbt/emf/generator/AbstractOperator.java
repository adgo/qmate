package org.tud.inf.st.mbt.emf.generator;


public abstract class AbstractOperator {
	public abstract State[] operate(State s);

	public void contributeToInitialState(State s) {
	}

	
}
