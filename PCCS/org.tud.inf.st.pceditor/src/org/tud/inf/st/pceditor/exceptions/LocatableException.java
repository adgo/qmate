package org.tud.inf.st.pceditor.exceptions;

import org.tud.inf.st.pceditor.interpreter.Location;

public class LocatableException extends RuntimeException {
	private Location location;
	
	public LocatableException(String message,Location location) {
		super(location+": "+message);
		this.location = location;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
}
