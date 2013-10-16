package org.tud.inf.st.mbt.automation;

import org.eclipse.emf.ecore.resource.Resource;

public abstract class TestSuiteAutomationType extends AbstractAutomationType{
	public TestSuiteAutomationType(String name) {
		super(name);
	}

	public abstract void automate(Resource r);
}
