package org.tud.inf.st.mbt.emf.generator;

import org.tud.inf.st.mbt.test.TestCase;

public class GeneratorState {
	private int step;
	private int queueSize;
	private TestCase newCase;

	public GeneratorState(int step, int queueSize, TestCase newCase) {
		this.step = step;
		this.queueSize = queueSize;
		this.newCase = newCase;
	}

	public int getStep() {
		return step;
	}

	public int getQueueSize() {
		return queueSize;
	}

	public TestCase getNewCase() {
		return newCase;
	}
}
