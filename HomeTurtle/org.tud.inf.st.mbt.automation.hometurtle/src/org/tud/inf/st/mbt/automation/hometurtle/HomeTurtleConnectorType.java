package org.tud.inf.st.mbt.automation.hometurtle;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.json.rpc.client.HttpJsonRpcClientTransport;
import org.json.rpc.client.JsonRpcInvoker;
import org.json.rpc.server.JsonRpcExecutor;
import org.json.rpc.server.JsonRpcServletTransport;
import org.tud.inf.st.mbt.automation.AbstractConnectorType;
import org.tud.inf.st.mbt.automation.IAutomationConstants;
import org.tud.inf.st.mbt.automation.IConnector;
import org.tud.inf.st.mbt.automation.hometurtle.server.IHomeTurtleTestDriver;

public class HomeTurtleConnectorType extends AbstractConnectorType {

	private List<IConnector> active = new ArrayList<>();
	private Set<String> connections = new HashSet<>();

	public HomeTurtleConnectorType() {
		final JsonRpcExecutor executor = new JsonRpcExecutor();
		executor.addHandler(IHomeTurtleRegistry.SERVICE_NAME,
				new IHomeTurtleRegistry() {

					@Override
					public void registerHomeTurtle(String url) {
						connections.add(url);
					}
				}, IHomeTurtleRegistry.class);

		new Thread("HomeTurtleRegistry-Jetty") {
			@Override
			public void run() {
				Server server = new Server(8080);
				try {
					server.setHandler(new AbstractHandler() {
						public void handle(String target,
								org.eclipse.jetty.server.Request baseRequest,
								javax.servlet.http.HttpServletRequest request,
								javax.servlet.http.HttpServletResponse response)
								throws java.io.IOException,
								javax.servlet.ServletException {
							executor.execute(new JsonRpcServletTransport(
									request, response));
						};
					});
					server.start();
					server.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		
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
		return connections.toArray(new String[0]);
	}

	@Override
	public IConnector getConnector(String connection) {
		try {
			HttpJsonRpcClientTransport transport = new HttpJsonRpcClientTransport(
					new URL(connection));
			JsonRpcInvoker invoker = new JsonRpcInvoker();
			IHomeTurtleTestDriver remote = invoker.get(transport,
					IHomeTurtleTestDriver.SERVICE, IHomeTurtleTestDriver.class);
			IConnector c = new HomeTurtleConnector(remote);
			active.add(c);
			return c;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Collection<? extends IConnector> getActiveConnectors() {
		return active;
	}

}
