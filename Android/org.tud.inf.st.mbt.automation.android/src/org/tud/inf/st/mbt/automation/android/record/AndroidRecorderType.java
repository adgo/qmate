package org.tud.inf.st.mbt.automation.android.record;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.tud.inf.st.mbt.automation.AbstractConnectorType;
import org.tud.inf.st.mbt.automation.IAutomationConstants;
import org.tud.inf.st.mbt.automation.record.AbstractRecorder;

public final class AndroidRecorderType extends AbstractConnectorType{
	
	private static AndroidRecorderType instance;
	private static final String name = "ADB Recorder (via Accessability Service)";
	private static final List<AndroidRecorder> recorders = new ArrayList<>();
	
	public static AndroidRecorderType getInstance() {
		if(instance == null)instance = new AndroidRecorderType();
		return instance;
	}

	private AndroidRecorderType() {
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String[] getAvailableConnections() {
		return CustomizedAndroidBridge.getDevices();
	}

	@Override
	public Collection<? extends AbstractRecorder> getActiveConnectors() {
		return recorders;
	}

	@Override
	public AbstractRecorder getConnector(String connection) {
		for(AndroidRecorder r:recorders){
			if(r.getConnection().equals(connection))return r;
		}
		
		AndroidRecorder r = new AndroidRecorder(connection);
		recorders.add(r);
		return r;
	}

	@Override
	public Integer getKind() {
		return IAutomationConstants.KIND_RECORDER;
	}

}
