package org.tud.inf.st.mbt.automation.hometurtle;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.tud.inf.st.mbt.automation.AbstractConnectorType;
import org.tud.inf.st.mbt.automation.IAutomationConstants;
import org.tud.inf.st.mbt.automation.IConnector;
import org.tud.inf.st.mbt.automation.hometurtle.server.IHomeTurtleTestDriver;

public class HomeTurtleConnectorType extends AbstractConnectorType {
	
	private List<IConnector> active = new ArrayList<>();
	private Registry registry;
	
	public HomeTurtleConnectorType() {
		try {
			registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
		} catch (RemoteException e) {
			e.printStackTrace();
		}		
	}
	
	@Override
	public Integer getKind() {
		return IAutomationConstants.KIND_SIMULATION_AUTOMATION;
	}

	@Override
	public String getName() {
		return "HomeTurtle";
	}

	@Override
	public String[] getAvailableConnections() {
		List<String> connections = new ArrayList<>();
		try {
			for(String name:registry.list())
				if(registry.lookup(name) instanceof IHomeTurtleTestDriver)
				 connections.add(name);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return connections.toArray(new String[0]);
	}

	@Override
	public IConnector getConnector(String connection) {
		try {
			IConnector c = new HomeTurtleConnector((IHomeTurtleTestDriver) registry.lookup(connection));
			active.add(c);
			return c;
		} catch (Exception e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public Collection<? extends IConnector> getActiveConnectors() {
		return active;
	}

}
