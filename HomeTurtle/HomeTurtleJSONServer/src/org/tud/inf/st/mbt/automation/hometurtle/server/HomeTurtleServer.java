package org.tud.inf.st.mbt.automation.hometurtle.server;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.rpc.client.HttpJsonRpcClientTransport;
import org.json.rpc.client.JsonRpcInvoker;
import org.json.rpc.server.JsonRpcExecutor;
import org.json.rpc.server.JsonRpcServletTransport;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.handler.AbstractHandler;
import org.qualitune.iclebo.driver.gen.initialization.Initializer;
import org.qualitune.iclebo.driver.gen.porttypes.IComPortLister;
import org.qualitune.iclebo.driver.gen.porttypes.IIclebo;
import org.qualitune.iclebo.driver.gen.porttypes.ITickBasedDriving;
import org.smags.runtime.RuntimeEnvironment;
import org.smags.runtime.RuntimeModel;
import org.tud.inf.st.mbt.automation.hometurtle.IHomeTurtleRegistry;

public class HomeTurtleServer implements IHomeTurtleTestDriver{
	
	private static Logger LOG = Logger.getLogger("HomeTurtleServer");
	private static ITickBasedDriving drive;

	public static void main(final String[] args) {
		if(args.length!=4)throw new RuntimeException("required args: <registryHost> <registryPort> <localHost> <localPort>");	
		try{
			final JsonRpcExecutor executor = new JsonRpcExecutor();
			executor.addHandler(IHomeTurtleTestDriver.SERVICE, new HomeTurtleServer(), IHomeTurtleTestDriver.class);
			
			new Thread("HomeTurtle-Jetty") {
				@Override
				public void run() {
					Server server = new Server(Integer.parseInt(args[3]));
					try {
						server.setHandler(new AbstractHandler() {

							@Override
							public void handle(String arg0,
									HttpServletRequest request,
									HttpServletResponse response, int arg3)
									throws IOException, ServletException {
								executor.execute(new JsonRpcServletTransport(
										request, response));								
							}
							
						});
						server.start();
						server.join();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}.start();
			
			HttpJsonRpcClientTransport transport = new HttpJsonRpcClientTransport(new URL("http://"+args[0]+":"+args[1]));
			JsonRpcInvoker invoker = new JsonRpcInvoker();
			IHomeTurtleRegistry registry = invoker.get(transport, IHomeTurtleRegistry.SERVICE_NAME, IHomeTurtleRegistry.class);
			registry.registerHomeTurtle("http://"+args[2]+":"+args[3]);
			
			RuntimeEnvironment re = RuntimeEnvironment.instance();
			RuntimeEnvironment.appName = "Iclebo";
			re.initializeRepositoryFinder();
			Initializer.Initialize(re);
			
			RuntimeModel m = re.getRuntimeModel();
			
			IComPortLister lister = m.getComponentByName(Initializer.Iclebo).as(IComPortLister.class);
			IIclebo i = m.getComponentByName(Initializer.Iclebo).as(IIclebo.class);
			
			i.startIclebo(lister.getAllComPorts().get(0));
			
			drive = re.getRuntimeModel().getComponentByName(Initializer.Motion).as(ITickBasedDriving.class);
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void spinRight(int speed, int angle) {
		LOG.info("spinRight "+speed+" "+angle);		
		drive.spinRight(speed, angle);
	}
	
	@Override
	public void spinLeft(int speed, int angle) {
		LOG.info("spinLeft "+speed+" "+angle);		
		drive.spinLeft(speed, angle);
	}
	
	@Override
	public void driveForeward(int speed,int distance){
		LOG.info("driveForeward "+speed+" "+distance);		
		drive.driveForward(speed, distance);
	}
}
