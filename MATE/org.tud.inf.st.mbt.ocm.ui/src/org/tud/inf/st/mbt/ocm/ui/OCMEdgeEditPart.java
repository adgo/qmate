package org.tud.inf.st.mbt.ocm.ui;

import org.eclipse.core.resources.IMarker;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.BasicEdgeEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.Markable;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFBendpointEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFComponentEditPolicy;
import org.tud.inf.st.mbt.ocm.EventGuardedEdge;
import org.tud.inf.st.mbt.ocm.TimedEdge;

public class OCMEdgeEditPart extends BasicEdgeEditPart implements Markable {

	private Label l;

	public OCMEdgeEditPart(Object model, EMFGraphics graphics) {
		super(model, graphics);
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE,
				new EMFBendpointEditPolicy(getGraphics()));

		installEditPolicy(
				EditPolicy.COMPONENT_ROLE,
				new EMFComponentEditPolicy(new OCMCommandFactory(getGraphics())));
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				new ConnectionEndpointEditPolicy());
	}

	@Override
	protected IFigure createFigure() {
		PolylineConnection c = new PolylineConnection();
		c.setConnectionRouter(new BendpointConnectionRouter());
		c.setTargetDecoration(new PolylineDecoration());
		c.setAntialias(4);
		c.setLineWidth(2);
		c.add(l = new Label(), new MidpointLocator(c, 0));
		l.setForegroundColor(ColorConstants.black);
		if (getModel() instanceof EventGuardedEdge) {
			c.setForegroundColor(ColorConstants.black);
		} else {
			c.setForegroundColor(ColorConstants.green);
		}
		return c;
	}

	@Override
	protected void refreshVisuals() {
		EObject model = (EObject) getModel();
		if (model instanceof EventGuardedEdge) {
			l.setText(((EventGuardedEdge) model).getGuardEventID() == null ? ""
					: "     @" + ((EventGuardedEdge) model).getGuardEventID());
		} else if (model instanceof TimedEdge) {
			l.setText("    "+((TimedEdge) model).getDuration());
		}
		super.refreshVisuals();
	}

	@Override
	public PolylineConnection getFigure() {
		return (PolylineConnection) super.getFigure();
	}

	@Override
	public void clearMarkers() {
		PolylineConnection c = getFigure();

		c.setAntialias(4);
		c.setLineWidth(2);
		if (getModel() instanceof EventGuardedEdge) {
			c.setForegroundColor(ColorConstants.black);
		} else {
			c.setForegroundColor(ColorConstants.green);
		}
	}

	@Override
	public void addMarker(IMarker marker) {
		getFigure().setForegroundColor(ColorConstants.red);
	}

}
