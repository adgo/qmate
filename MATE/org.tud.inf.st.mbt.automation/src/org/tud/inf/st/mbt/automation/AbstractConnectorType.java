package org.tud.inf.st.mbt.automation;

import java.util.Collection;

public abstract class AbstractConnectorType {
	public abstract Integer getKind();
	public abstract String getName();
	public abstract String[] getAvailableConnections();
	public abstract IConnector getConnector(String connection);
	public abstract Collection<? extends IConnector> getActiveConnectors();

	public void terminateAll(){
		for(IConnector r:getActiveConnectors()){
			r.terminate();
		}
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
