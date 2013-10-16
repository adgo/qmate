package org.tud.inf.st.mbt.ocm.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;

public class CompositionEditPart extends BasicOCMNodeEditPart {

	public CompositionEditPart(EObject model, EMFGraphics graphics, IResource editedResource) {
		super(model, graphics, editedResource);
	}

	@Override
	protected IFigure createFigure() {
		return new CompositionFigure("U");
	}

	@Override
	public CompositionFigure getFigure() {
		return (CompositionFigure) super.getFigure();
	}

	@Override
	public void refreshVisuals() {
		OperationalConfigurationModel ocm = (OperationalConfigurationModel) getModel()
				.eContainer();

		boolean isStart = getModel().equals(ocm.getStart());

		if (isActive()) {
			getFigure().setColors(ColorConstants.white, ColorConstants.blue);
		} else {
			if (isStart) {
				getFigure().setColors(ColorConstants.black, ColorConstants.green);
			} else {
				getFigure().setColors(ColorConstants.white, ColorConstants.black);
			}
		}

		setConstraint(new Rectangle(getGraphics().getObjectConstraint(
				getModel())));
		getFigure().repaint();
		refreshChildren();
	}

	@Override
	protected AbstractConnectionAnchor createAnchor() {
		return new EllipseAnchor(getFigure());
	}
}