package org.tud.inf.st.mbt.emf.graphicaleditor.policies;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.ChangeEMFNodeConstraintCommand;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFCommandFactory;

public class EMFXYLayoutEditPolicy extends XYLayoutEditPolicy {

	private EMFCommandFactory cmdFactory;
	private EMFGraphics graphics;
	private boolean childrenResizeable;

	public EMFXYLayoutEditPolicy(EMFGraphics graphics,
			EMFCommandFactory cmdFactory, boolean childrenResizeable) {
		this.graphics = graphics;
		this.cmdFactory = cmdFactory;
		this.childrenResizeable = childrenResizeable;
	}

	protected EditPolicy createChildEditPolicy(EditPart child) {
		return childrenResizeable ? new ResizableEditPolicy()
				: new NonResizableEditPolicy();
	}

	protected Command createChangeConstraintCommand(
			ChangeBoundsRequest request, EditPart child, Object constraint) {
		Dimension intent = ((Rectangle) constraint).getSize();
		Dimension std = graphics.getStandardDimension(((EObject) child
				.getModel()).eClass());

		if (intent.width < std.width) {
			intent.setWidth(std.width);
		}
		if (intent.height < std.height) {
			intent.setHeight(std.height);
		}

		return new ChangeEMFNodeConstraintCommand((EObject) child.getModel(),
				graphics, new Rectangle(((Rectangle) constraint).getLocation(),
						intent));
	}

	protected Command getCreateCommand(CreateRequest request) {
		Point l = request.getLocation();
		((GraphicalEditPart) getHost()).getFigure().translateToRelative(l);

		if (getHost().getModel() instanceof EObject) {
			Command cmd = cmdFactory.createNodeCreateCommand(
					(EObject) getHost().getModel(),
					(EClass) request.getNewObjectType(), request.getLocation(),
					request.getSize());
			return cmd;
		}

		return null;
	}

	@Override
	protected Command getMoveChildrenCommand(Request request) {
		return getChangeConstraintCommand((ChangeBoundsRequest) request);
	}

	@Override
	protected Command getResizeChildrenCommand(ChangeBoundsRequest request) {
		return getChangeConstraintCommand(request);
	}

}
