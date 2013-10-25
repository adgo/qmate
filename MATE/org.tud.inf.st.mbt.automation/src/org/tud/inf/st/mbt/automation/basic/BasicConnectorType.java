package org.tud.inf.st.mbt.automation.basic;

import java.util.Collection;
import java.util.Collections;

import org.tud.inf.st.mbt.automation.AbstractConnectorType;
import org.tud.inf.st.mbt.automation.IAutomationConstants;
import org.tud.inf.st.mbt.automation.IConnector;

public class BasicConnectorType extends AbstractConnectorType {
	
	private final static String MANUAL = "Manual Execution";
	private final static String RANDOM = "Random Mock-Up";

	@Override
	public Integer getKind() {
		return IAutomationConstants.KIND_SIMULATION_AUTOMATION;
	}

	@Override
	public String getName() {
		return "Basic Connectors";
	}

	@Override
	public String[] getAvailableConnections() {
		return new String[]{MANUAL,RANDOM};
	}

	@Override
	public IConnector getConnector(String connection) {
		if(connection.equals(MANUAL))return new ManualAutomation();
		else if(connection.equals(RANDOM))return new RandomAutomation();
		else return null;
	}

	@Override
	public Collection<? extends IConnector> getActiveConnectors() {
		return Collections.<IConnector>emptyList();
	}

}
