package org.tud.inf.st.mbt.automation.record;

import java.util.Collection;

public abstract class AbstractRecorderType {
	public abstract String getName();
	public abstract String[] getAvailableConnections();
	public abstract AbstractRecorder getRecorder(String connection);
	public abstract void terminateRecorder(String connection);
	protected abstract Collection<? extends AbstractRecorder> getActiveRecorders();

	public void terminate(){
		for(AbstractRecorder r:getActiveRecorders()){
			r.terminate();
		}
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
