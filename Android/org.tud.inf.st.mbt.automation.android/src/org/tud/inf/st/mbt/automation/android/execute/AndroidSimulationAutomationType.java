package org.tud.inf.st.mbt.automation.android.execute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.tud.inf.st.mbt.automation.AbstractConnectorType;
import org.tud.inf.st.mbt.automation.IAutomationConstants;
import org.tud.inf.st.mbt.automation.IConnector;
import org.tud.inf.st.mbt.automation.android.record.CustomizedAndroidBridge;

public final class AndroidSimulationAutomationType extends
		AbstractConnectorType {

	private static AndroidSimulationAutomationType instance;

	public static AndroidSimulationAutomationType getInstance() {
		if (instance == null)
			instance = new AndroidSimulationAutomationType();
		return instance;
	}

	private List<AndroidSimulationAutomation> connectors = new ArrayList<>();
	private boolean initiated = false;

	private AndroidSimulationAutomationType() {
	}

	@Override
	public Integer getKind() {
		return IAutomationConstants.KIND_SIMULATION_AUTOMATION;
	}

	@Override
	public String getName() {
		return "Android (via Accessability Service)";
	}

	@Override
	public String[] getAvailableConnections() {
		if(!initiated)CustomizedAndroidBridge.initADB();
		return CustomizedAndroidBridge.getDevices();
	}

	@Override
	public IConnector getConnector(String connection) {
		for(AndroidSimulationAutomation c:connectors){
			if(c.getConnection().equals(connection))return c;
		}
		
		AndroidSimulationAutomation connector = new AndroidSimulationAutomation(
				connection);
		connectors.add(connector);
		return connector;
	}

	@Override
	public Collection<? extends IConnector> getActiveConnectors() {
		return new ArrayList<>(connectors);
	}

}
