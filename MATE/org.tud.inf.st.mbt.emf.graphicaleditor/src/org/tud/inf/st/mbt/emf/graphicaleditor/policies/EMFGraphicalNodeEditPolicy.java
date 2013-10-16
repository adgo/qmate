package org.tud.inf.st.mbt.emf.graphicaleditor.policies;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFCommandFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFConnectionCommand;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFReconnectCommand;
import org.tud.inf.st.mbt.emf.graphicaleditor.multianchor.MultiAnchorEditPart;

public abstract class EMFGraphicalNodeEditPolicy extends
		GraphicalNodeEditPolicy {

	private EMFCommandFactory factory;

	public EMFGraphicalNodeEditPolicy(EMFCommandFactory factory) {
		this.factory = factory;
	}

	@Override
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		EMFConnectionCommand cmd = (EMFConnectionCommand) request
				.getStartCommand();

		if (!canConnect(cmd.getSource(), (EObject) getHost().getModel(),
				(EClass) request.getNewObjectType()))
			return null;

		if (getHost() instanceof MultiAnchorEditPart) {
			cmd.setChildTarget((((MultiAnchorEditPart) getHost())
					.getTargetConnectionAnchor(request)).getModel());
		}

		cmd.setTarget((EObject) getHost().getModel());

		return cmd;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		if (!canSource((EObject) getHost().getModel(),
				(EClass) request.getNewObjectType()))
			return null;
		EMFConnectionCommand cmd = factory.createConnectionCommand(
				(EObject) getHost().getParent().getModel(),
				(EClass) request.getNewObjectType());

		if (getHost() instanceof MultiAnchorEditPart) {
			cmd.setChildSource((((MultiAnchorEditPart) getHost())
					.getSourceConnectionAnchor(request)).getModel());
		}
		cmd.setSource((EObject) getHost().getModel());

		request.setStartCommand(cmd);
		return cmd;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		EObject connection = (EObject) request.getConnectionEditPart()
				.getModel();

		if (!canConnect(getSource(connection), (EObject) request.getTarget()
				.getModel(), connection.eClass()))
			return null;

		EMFReconnectCommand cmd = factory.createReconnectCommand(connection,
				getSource(connection), getTarget(connection));
		cmd.setTarget((EObject) request.getTarget().getModel());
		if (getHost() instanceof MultiAnchorEditPart) {
			cmd.setChildTarget((((MultiAnchorEditPart) getHost())
					.getTargetConnectionAnchor(request)).getModel());
		}

		return cmd;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		EObject connection = (EObject) request.getConnectionEditPart()
				.getModel();

		if (!canConnect((EObject) request.getTarget().getModel(),
				getTarget(connection), connection.eClass()))
			return null;

		EMFReconnectCommand cmd = factory.createReconnectCommand(connection,
				getSource(connection), getTarget(connection));
		cmd.setSource((EObject) request.getTarget().getModel());
		if (getHost() instanceof MultiAnchorEditPart) {
			cmd.setChildSource((((MultiAnchorEditPart) getHost())
					.getSourceConnectionAnchor(request)).getModel());
		}
		return cmd;
	}

	public abstract boolean canSource(EObject source, EClass connType);

	public abstract boolean canConnect(EObject source, EObject target,
			EClass connType);

	public abstract EObject getSource(EObject connection);

	public abstract EObject getTarget(EObject connection);

}
