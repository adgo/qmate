package org.tud.inf.st.mbt.automation.record;

import java.awt.Point;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRecorder {
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
	
	public abstract void buildState(AbstractRecorderListener l, String actionText);
	public abstract void identifyState(AbstractRecorderListener l,UIState state, String actionText);
	
	
	public abstract void start();
	public abstract void terminate();
	
	
	public abstract File screenshot();
	
	public void simulateTap(Point at){
		
	}
	
	public void simulateSwipe(Point from,Point to){
		
	}
	
	public void simulateTextInput(String txt){
		
	}
}
