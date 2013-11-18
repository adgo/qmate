package org.tud.inf.st.mbt.automation.execute;

import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.automation.IConnector;
import org.tud.inf.st.mbt.test.TestCase;
import org.tud.inf.st.mbt.test.TestSuite;

public interface ISimulationAutomation extends IConnector{
	boolean automate(PostGenerationAction action,
			ISimulationResponder simulationAccessor);
	
	void startTestSuite(TestSuite suite);
	void startTestCase(TestCase _case);
}
