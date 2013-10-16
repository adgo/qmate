package org.tud.inf.st.mbt.automation.java;

public class Data{
	
	private String[] parentClasses;
	private String literal;

	public Data(String literal,String... parentClasses) {
		this.literal = literal;
		this.parentClasses = parentClasses;
	}
	
	public Integer asInteger(){
		return Integer.parseInt(literal);
	}
	
	public Float asFloat(){
		return Float.parseFloat(literal);
	}
	
	public String asString(){
		return literal;
	}

	public String[] getParentClasses() {
		return parentClasses;
	}
	
	public boolean isContainedBy(String parentClass){
		for(String pcs:parentClasses){
			if(pcs.equals(parentClass))return true;
		}
		return false;
	}
}
