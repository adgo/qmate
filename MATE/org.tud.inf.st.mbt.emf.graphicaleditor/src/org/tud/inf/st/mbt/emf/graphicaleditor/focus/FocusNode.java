package org.tud.inf.st.mbt.emf.graphicaleditor.focus;

import java.util.ArrayList;
import java.util.Collection;

public class FocusNode {
	private String name;
	private Collection<FocusNode> children = new ArrayList<>();
	private FocusNode parent;
	
	public FocusNode(String name,FocusNode parent) {
		this.name = name;
		if(parent!=null)parent.getChildren().add(this);
		this.parent = parent;
	}
	
	public FocusNode getParent() {
		return parent;
	}
	
	public String getName() {
		return name;
	}
	
	public Collection<FocusNode> getChildren() {
		return children;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
