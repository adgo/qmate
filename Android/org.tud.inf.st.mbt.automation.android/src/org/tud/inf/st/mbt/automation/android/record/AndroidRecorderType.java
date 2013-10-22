package org.tud.inf.st.mbt.automation.android.record;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.tud.inf.st.mbt.automation.record.AbstractRecorder;
import org.tud.inf.st.mbt.automation.record.AbstractRecorderType;

public final class AndroidRecorderType extends AbstractRecorderType{
	
	private static AndroidRecorderType instance;
	private static final String name = "ADB Recorder (via Accessability Service)";
	private static final List<AndroidRecorder> recorders = new ArrayList<>();
	
	private AndroidRecorderType() {
	}
	
	public static AndroidRecorderType getInstance() {
		if(instance == null)instance = new AndroidRecorderType();
		return instance;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String[] getAvailableConnections() {
		return AndroidRecorderBridge.getDevices();
	}

	@Override
	protected Collection<? extends AbstractRecorder> getActiveRecorders() {
		return recorders;
	}

	@Override
	public AbstractRecorder getRecorder(String connection) {
		for(AndroidRecorder r:recorders){
			if(r.getConnection().equals(connection))return r;
		}
		
		AndroidRecorder r = new AndroidRecorder(connection);
		recorders.add(r);
		return r;
	}

	@Override
	public void terminateRecorder(String connection) {
		for(AndroidRecorder r:recorders.toArray(new AndroidRecorder[0])){
			if(r.equals(connection)){
				r.terminate();
				recorders.remove(r);
				return;
			}
		}
	}

}
