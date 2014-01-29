package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.LineAttributes;

public class ArcFigure extends PolylineConnection {
	private Label weightLabel;

	public ArcFigure() {
		setTargetDecoration(new PolygonDecoration());
		setAntialias(SWT.ON);

		add(weightLabel = new Label(), new MidpointLocator(this, 0) {
			@Override
			protected Point getReferencePoint() {
				return super.getReferencePoint().getTranslated(6, 8);
			}
		});
		weightLabel.setForegroundColor(ColorConstants.black);
	}

	public void setInhibitor(boolean isInhibitor) {
		setTargetDecoration(isInhibitor ? new EllipseDecoration()
				: new PolygonDecoration());
	}

	public void setPageMapping(boolean isPageMapping) {
		setLineStyle(isPageMapping ? Graphics.LINE_DASH : Graphics.LINE_SOLID);
		setForegroundColor(isPageMapping ? ColorConstants.blue : ColorConstants.black);
	}

	public void setWeight(int w) {
		weightLabel.setText("" + w);
	}
}