package org.tud.inf.st.mbt.automation.hometurtle.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;
import java.util.logging.Logger;

import org.qualitune.iclebo.driver.gen.initialization.Initializer;
import org.qualitune.iclebo.driver.gen.porttypes.IComPortLister;
import org.qualitune.iclebo.driver.gen.porttypes.IIclebo;
import org.qualitune.iclebo.driver.gen.porttypes.ITickBasedDriving;
import org.smags.runtime.RuntimeEnvironment;
import org.smags.runtime.RuntimeModel;

public class HomeTurtleServer implements IHomeTurtleTestDriver{
	
	private static Logger LOG = Logger.getLogger("HomeTurtleServer");
	private static ITickBasedDriving drive;

	public static void main(String[] args) {
		if(args.length!=1)throw new RuntimeException("First and only argument must be the registry server host name!");
		try{
			HomeTurtleServer server = new HomeTurtleServer();
			IHomeTurtleTestDriver stub = (IHomeTurtleTestDriver) UnicastRemoteObject.exportObject(server);
			Registry registry = LocateRegistry.getRegistry(args[0]);
			registry.rebind(IHomeTurtleTestDriver.SERVICE+new Random().nextInt(Integer.MAX_VALUE), stub);
			
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
