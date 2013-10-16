package org.tud.inf.st.mbt.emf.graphicaleditor.basics;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface MultiLabeled {
	public EStructuralFeature getFeatureOn(Point p);

	public Label getLabel(EStructuralFeature f);
}
