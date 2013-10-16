package org.tud.inf.st.mbt.emf.graphicaleditor.policies;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphicsUtil;
import org.tud.inf.st.mbt.graphical.Bendpoint;

public class EMFBendpointEditPolicy extends BendpointEditPolicy {

	private EMFGraphics graphics;

	public EMFBendpointEditPolicy(EMFGraphics graphics) {
		this.graphics = graphics;
	}

	@Override
	protected Command getCreateBendpointCommand(final BendpointRequest request) {
		return new Command() {
			@Override
			public void execute() {
				Point l = request.getLocation();
				Connection relative = (Connection) request.getSource().getFigure();
				l = l.getTranslated(relative.getSourceAnchor().getReferencePoint().getNegated());
				
				graphics.addBendpoint((EObject) request.getSource().getModel(),
						request.getIndex(),l);
				EMFGraphicsUtil.notifyNull(((EObject) request.getSource().getModel()));
			}

			@Override
			public void undo() {
				graphics.deleteBendpoint((EObject) request.getSource().getModel(),
						request.getIndex());
				EMFGraphicsUtil.notifyNull(((EObject) request.getSource().getModel()));
			}
		};
	}

	@Override
	protected Command getDeleteBendpointCommand(final BendpointRequest request) {
		return new Command() {
			@Override
			public void execute() {
				graphics.deleteBendpoint((EObject) request.getSource().getModel(),
						request.getIndex());
				EMFGraphicsUtil.notifyNull(((EObject) request.getSource().getModel()));
			}

			@Override
			public void undo() {
				graphics.addBendpoint((EObject) request.getSource().getModel(),
						request.getIndex(), request.getLocation());
				EMFGraphicsUtil.notifyNull(((EObject) request.getSource().getModel()));
			}
		};
	}

	@Override
	protected Command getMoveBendpointCommand(final BendpointRequest request) {
		return new Command() {
			private Bendpoint bendpoint = graphics.getBendpoint(
					(EObject) request.getSource().getModel(), request.getIndex());
			private Point old = new Point(bendpoint.getX(), bendpoint.getY());

			@Override
			public void execute() {
				Point l = request.getLocation();
				Connection relative = (Connection) request.getSource().getFigure();
				l = l.getTranslated(relative.getSourceAnchor().getReferencePoint().getNegated());
				
				bendpoint.setX(l.x);
				bendpoint.setY(l.y);
				EMFGraphicsUtil.notifyNull(((EObject) request.getSource().getModel()));
			}

			@Override
			public void undo() {
				bendpoint.setX(old.x);
				bendpoint.setY(old.y);
				EMFGraphicsUtil.notifyNull(((EObject) request.getSource().getModel()));
			}
		};
	}

}
