package org.tud.inf.st.pceditor.exceptions;

import java.util.Collection;

public class CompositeException extends RuntimeException{
	private Collection<Exception> exceptions;
	
	public CompositeException(Collection<Exception> exceptions) {
		super("Multiple exceptions were thrown.");
		this.exceptions = exceptions;
	}
	
	public Collection<Exception> getExceptions() {
		return exceptions;
	}
}
