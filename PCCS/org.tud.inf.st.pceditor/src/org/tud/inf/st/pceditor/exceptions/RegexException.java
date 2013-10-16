package org.tud.inf.st.pceditor.exceptions;

import org.tud.inf.st.pceditor.interpreter.Location;

public class RegexException extends LocatableException {
	
	private String regex;

	public RegexException(String regex,Location location) {
		super("Regular expression "+regex+" failed.", location);
		this.regex = regex;
	}
	
	public String getRegex() {
		return regex;
	}

}
