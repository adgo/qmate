package org.tud.inf.st.mbt.automation.record;

import java.awt.Point;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.tud.inf.st.mbt.actions.PreGenerationAction;
import org.tud.inf.st.mbt.automation.IConnector;

public abstract class AbstractRecorder implements IConnector{
	private String connection;	
	private List<AbstractRecorderListener> listeners = new ArrayList<>();
	
	public AbstractRecorder(String connection) {
		this.connection = connection;
	}
	
	public String getConnection() {
		return connection;
	}
	
	public void registerListener(AbstractRecorderListener l){
		listeners.add(l);
	}
	
	public void unregisterListener(AbstractRecorderListener l){
		listeners.remove(l);
	}
	
	public List<AbstractRecorderListener> getListeners() {
		return new ArrayList<>(listeners);
	}
	
	public abstract void buildState(AbstractRecorderListener l, PreGenerationAction action);
	public abstract void identifyState(AbstractRecorderListener l,UIState state, PreGenerationAction action);
	
	
	public abstract void start();	
	public abstract File screenshot();
	
	public void simulateTap(Point at){
		
	}
	
	public void simulateSwipe(Point from,Point to){
		
	}
	
	public void simulateTextInput(String txt){
		
	}
}
