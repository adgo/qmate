package org.tud.inf.st.mbt.ulang.guigraph;

import java.io.IOException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.internal.UIPlugin;

@SuppressWarnings("restriction")
public class TimerFigure extends Figure {
	private Label duration;
	private Ellipse shape;
	private ImageFigure img;

	public TimerFigure() {
		shape = new Ellipse();
		shape.setBackgroundColor(ColorConstants.white);
		add(shape);
		img = new ImageFigure();

		try {
			String loc = FileLocator.resolve(
					Activator.getDefault().getBundle().getEntry( "/icons/clock_100.png")).getFile();
			Image i = new Image(UIPlugin.getDefault().getWorkbench()
					.getDisplay(), loc);
			img.setImage(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		shape.add(img);
		duration = new Label();
		duration.setBackgroundColor(ColorConstants.white);
		shape.add(duration);
	}

	public void setText(String txt) {
		duration.setText("" + txt);
	}

	public void setTerminates(boolean term) {
		if (term) {
			shape.setForegroundColor(ColorConstants.red);
			shape.setLineWidth(3);
		} else {
			shape.setForegroundColor(ColorConstants.black);
			shape.setLineWidth(1);
		}
	}

	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle b = getBounds();
		shape.setBounds(new Rectangle(b));
		duration.setBounds(new Rectangle(b));
		img.setBounds(new Rectangle(b));
		shape.invalidate();
		duration.invalidate();
		img.invalidate();
	}
}
