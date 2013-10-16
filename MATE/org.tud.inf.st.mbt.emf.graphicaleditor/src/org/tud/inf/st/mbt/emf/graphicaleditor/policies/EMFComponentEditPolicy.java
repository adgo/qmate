package org.tud.inf.st.mbt.emf.graphicaleditor.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFCommandFactory;

public class EMFComponentEditPolicy extends ComponentEditPolicy {
	private EMFCommandFactory factory;
	
	public EMFComponentEditPolicy(EMFCommandFactory factory) {
		this.factory = factory;
	}
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		return factory.createDeleteCommand((EObject) getHost().getModel());
	}
}
