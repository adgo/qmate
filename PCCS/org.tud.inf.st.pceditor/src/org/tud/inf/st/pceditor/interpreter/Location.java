package org.tud.inf.st.pceditor.interpreter;

public class Location{
	private int index;
	private int length;
	
	public Location(int index, int length) {
		this.index = index;
		this.length = length;
	}

	public int getIndex() {
		return index;
	}
	
	public int getLength() {
		return length;
	}
	
	@Override
	public String toString() {
		return "@"+index+"--"+(index+length);
	}
}
