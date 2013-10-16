package org.tud.inf.st.mbt.emf.graphicaleditor.commands;

import org.eclipse.emf.ecore.EObject;

public abstract class EMFReconnectCommand extends EMFConnectionCommand {

	private EObject targetOld,sourceOld;
	
	public EMFReconnectCommand(EObject connection,EObject fromOld,EObject toOld) {
		super(connection.eClass(), connection.eContainer());
		setConnection(connection);
		setSourceOld(fromOld);
		setTargetOld(toOld);
	}

	public EObject getTargetOld() {
		return targetOld;
	}

	public void setTargetOld(EObject targetOld) {
		this.targetOld = targetOld;
	}

	public EObject getSourceOld() {
		return sourceOld;
	}

	public void setSourceOld(EObject sourceOld) {
		this.sourceOld = sourceOld;
	}
}
