package org.tud.inf.st.mbt.emf.graphicaleditor;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class GraphicalNodeEditPart extends AbstractGraphicalEditPart implements
		NodeEditPart {
	
	private Figure figure;
	
	public GraphicalNodeEditPart(Figure figure) {
		this.figure = figure;
	}
	
	@Override
	public EObject getModel() {
		return (EObject) super.getModel();
	}

	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return new ChopboxAnchor(figure);
	}

	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		return new ChopboxAnchor(figure);
	}

	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return new ChopboxAnchor(figure);
	}

	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return new ChopboxAnchor(figure);
	}

	protected IFigure createFigure() {
		return figure;
	}

	protected void createEditPolicies() {
	}

}
