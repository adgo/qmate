package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.Observer;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.BasicEdgeEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFBendpointEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFComponentEditPolicy;

public class ArcEditPart extends BasicEdgeEditPart implements
		Observer {

	public ArcEditPart(Arc model, EMFGraphics graphics) {
		super(model,graphics);
	}

	@Override
	protected IFigure createFigure() {
		ArcFigure f = new ArcFigure();
		f.setConnectionRouter(new BendpointConnectionRouter());
		return f;
	}

	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE,
				new EMFBendpointEditPolicy(getGraphics()));

		installEditPolicy(
				EditPolicy.COMPONENT_ROLE,
				new EMFComponentEditPolicy(new GUIGraphCommandFactory(getGraphics())));
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				new ConnectionEndpointEditPolicy());
	}

	protected void refreshVisuals() {
		Arc model = (Arc) getModel();
		ArcFigure fig = (ArcFigure) getFigure();
		
		fig.setInhibitor(model instanceof InhibitorArc);
		if(model instanceof StandardArc)fig.setWeight(((StandardArc) model).getWeight());
		
		super.refreshVisuals();
	}

}
