package org.tud.inf.st.mbt.emf.graphicaleditor.basics;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.graphics.Color;

public class LabeledEllipse extends MultiLabeledFigure{
	private Label label;
	private Ellipse shape;
	private EStructuralFeature labeledFeature;
	
	public LabeledEllipse(Color fg, Color bg, EStructuralFeature labeledFeature) {
		super(bg);	
		this.labeledFeature = labeledFeature;
		setBorder(new LineBorder());

		shape = new Ellipse();		
		setBgShape(shape);

		shape.setBackgroundColor(bg);

		label = new Label();
		label.setForegroundColor(fg);
		
		setToolTip(new Label());
		
		add(shape);
		add(label);
	}
	
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle bounds = getBounds();
		shape.setBounds(new Rectangle(bounds));
		label.setBounds(new Rectangle(bounds));
		shape.invalidate();
		label.invalidate();
	}

	@Override
	public EStructuralFeature getFeatureOn(Point p) {
		return labeledFeature;
	}

	@Override
	public Label getLabel(EStructuralFeature f) {
		return label;
	}
	
	@Override
	public void setBackgroundColor(Color bg) {
		shape.setBackgroundColor(bg);
	}
	
	@Override
	public void setForegroundColor(Color fg) {
		label.setForegroundColor(fg);
	}
}
