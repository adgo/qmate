package org.tud.inf.st.pceditor.exceptions;


public class DoubleParserDefinitionException extends InterpretationException {
	private String parserName;
	
	public DoubleParserDefinitionException(String parserName) {
		super("Parser "+parserName+" is defined multiple times.");
		this.parserName = parserName;
	}
	
	public String getParserName() {
		return parserName;
	}
}
