package org.tud.inf.st.mbt.automation.execute;

import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.automation.IConnector;

public interface ISimulationAutomation extends IConnector{
	boolean automate(PostGenerationAction action,
			ISimulationResponder simulationAccessor);
}
