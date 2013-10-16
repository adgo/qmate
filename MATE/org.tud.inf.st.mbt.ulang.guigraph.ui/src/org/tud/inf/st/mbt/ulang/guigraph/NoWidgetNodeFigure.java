package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class NoWidgetNodeFigure extends Figure {
	private Shape circle;
	private Label label, markingLabel;

	public NoWidgetNodeFigure() {
		setLayoutManager(new XYLayout());

		circle = new Ellipse();
		circle.setBackgroundColor(ColorConstants.white);

		markingLabel = new Label("");
		label = new Label("");

		circle.setLayoutManager(new XYLayout());

		setTokens(0,false);
		
		add(circle);
		add(markingLabel);
		add(label);
	}

	public void setTokens(int count, boolean simulating) {
		circle.setBackgroundColor(count > 0 ? (simulating ? ColorConstants.blue : ColorConstants.green)
				: ColorConstants.white);
		label.setForegroundColor(count > 0 ? (simulating ? ColorConstants.white : ColorConstants.black)
				: ColorConstants.black);
		markingLabel.setForegroundColor(count > 0 ? (simulating ? ColorConstants.white : ColorConstants.black)
				: ColorConstants.white);
		if(count>0)markingLabel.setText("<"+count+">");
		else markingLabel.setText("");
	}

	public void setText(String text) {
		label.setText(text);
	}

	@Override
	protected void paintFigure(Graphics graphics) {
		Dimension size = getBounds().getSize();

		setConstraint(circle, new Rectangle(new Point(0, 0),
				new Dimension(size)));
		setConstraint(markingLabel, new Rectangle(new Point(
				(int) (size.width * 0.1), (int) (size.height * 0.22)),
				new Dimension(size.height, size.height).scale(0.6)));

		int labelStart = (int) (size.width * 0.2+10);

		setConstraint(label, new Rectangle(new Point(labelStart, 0),
				new Dimension(size.width - labelStart-2, size.height)));

		circle.invalidate();
		markingLabel.invalidate();
		label.invalidate();
	}

	public IFigure getAnchorFigure() {
		return circle;
	}
}
