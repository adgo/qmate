package org.tud.inf.st.mbt.emf.graphicaleditor.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphicsUtil;

public abstract class EMFConnectionCommand extends Command {
	private EObject source,childSource,target,childTarget,parent,connection;
	private EClass connectionType;
	
	public EMFConnectionCommand(EClass connectionType,EObject parent) {
		setConnectionType(connectionType);
		setParent(parent);
	}
	
	public void setSource(EObject source) {
		this.source = source;
	}
	
	public void setTarget(EObject target) {
		this.target = target;
	}
	
	public void setChildSource(EObject childSource) {
		this.childSource = childSource;
	}
	
	public void setChildTarget(EObject childTarget) {
		this.childTarget = childTarget;
	}
	
	public EObject getChildSource() {
		return childSource;
	}
	
	public EObject getChildTarget() {
		return childTarget;
	}
	
	public EObject getSource() {
		return source;
	}
	
	public EObject getTarget() {
		return target;
	}
	
	public void setConnectionType(EClass connectionType) {
		this.connectionType = connectionType;
	}
	
	public EClass getConnectionType() {
		return connectionType;
	}
	
	public void setParent(EObject parent) {
		this.parent = parent;
	}
	
	public EObject getParent() {
		return parent;
	}
	
	public void setConnection(EObject connection) {
		this.connection = connection;
	}
	
	public EObject getConnection() {
		return connection;
	}
	
	public void notifyModel(){
		EMFGraphicsUtil.notifyNull(source);
		EMFGraphicsUtil.notifyNull(target);
		EMFGraphicsUtil.notifyNull(parent);
		EMFGraphicsUtil.notifyNull(connection);
	}
}
