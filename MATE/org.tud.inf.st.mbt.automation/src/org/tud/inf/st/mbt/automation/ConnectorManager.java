package org.tud.inf.st.mbt.automation;

import java.util.ArrayList;
import java.util.List;

public final class ConnectorManager {
	private static ConnectorManager instance;

	public static ConnectorManager getInstance() {
		if (instance == null)
			instance = new ConnectorManager();
		return instance;
	}

	private List<AbstractConnectorType> connectorTypes = new ArrayList<>();

	private ConnectorManager() {
	}

	public void terminateAll() {
		for (AbstractConnectorType t : connectorTypes)
			t.terminateAll();
	}

	public void registerType(AbstractConnectorType t) {
		connectorTypes.add(t);
	}

	public List<AbstractConnectorType> getTypes(Integer kind) {
		List<AbstractConnectorType> result = new ArrayList<>();
		for (AbstractConnectorType ct : connectorTypes)
			if (ct.getKind().equals(kind))
				result.add(ct);
		return result;
	}
}
