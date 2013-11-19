package org.tud.inf.st.mbt.automation.hometurtle.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHomeTurtleTestDriver extends Remote{
	public static final String SERVICE = "HomeTurtle";
	
	void spinRight(int speed,int angle) throws RemoteException;

	void spinLeft(int speed, int angle) throws RemoteException;

	void driveForeward(int speed, int distance) throws RemoteException;
}
