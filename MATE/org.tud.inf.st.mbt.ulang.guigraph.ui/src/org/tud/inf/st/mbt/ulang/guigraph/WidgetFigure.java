package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FocusBorder;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class WidgetFigure extends Figure{
	private ImageFigure image;
	private Label label;
	private RectangleFigure rect;
	private String imagePath;
	private Dimension lastSize = new Dimension(0,0);
	
	public WidgetFigure() {
		setLayoutManager(new XYLayout());

		image = new ImageFigure();
		setImagePath(null);
		
		rect = new RectangleFigure();
		rect.setBackgroundColor(ColorConstants.lightGray);

		label = new Label();

		image.setLayoutManager(new XYLayout());
		rect.setLayoutManager(new XYLayout());

		setBorder(new LineBorder());
		setActive(false);
		
		add(rect);
		add(image);
		add(label);
	}
	
	public void setActive(boolean active){
		if(active){
			((LineBorder)getBorder()).setWidth(5);
			((LineBorder)getBorder()).setColor(ColorConstants.blue);	
		} else{
			((LineBorder)getBorder()).setWidth(1);
			((LineBorder)getBorder()).setColor(ColorConstants.black);	
		}
	}

	public void setFocus(boolean f) {
		image.setVisible(f);
		if (f)
			image.setBorder(new FocusBorder());
		else
			image.setBorder(new FocusBorder());

	}

	protected void paintFigure(Graphics graphics) {
		graphics.setInterpolation(SWT.NONE);
		
		Dimension size = getBounds().getSize();
		if(!size.equals(lastSize))resetImage(true);
		lastSize = size;
		
		if(size.getArea()<900)size = new Dimension(30,30);

		setConstraint(rect, new Rectangle(new Point(0, 0), size));
		
		setConstraint(image, new Rectangle(new Point(0, 0), size));

		setConstraint(label, new Rectangle(new Point(1, 1), new Dimension(
				size.width, 15)));

		rect.invalidate();
		image.invalidate();
		label.invalidate();

		resetImage(false);
	}

	public void setImagePath(String imagePath) {
		if (this.imagePath == null || !this.imagePath.equals(imagePath)) {
			this.imagePath = imagePath;
			resetImage(true);
		}
	}

	public void resetImage(boolean newImage) {
		if (image.getImage() == null
				|| (newImage && !(image.getImage().getBounds().equals(getBounds()) && getBounds().height
						* getBounds().width > 0))) {
			if (imagePath != null) {
				Image old = image.getImage();
				try {
					Image i = new Image(Display.getDefault(), imagePath);
					Image iScaled = new Image(i.getDevice(), i.getImageData()
							.scaledTo(getBounds().width, getBounds().height));
					i.dispose();
					image.setImage(iScaled);
				} catch (Exception e) {
					image.setImage(null);
				} finally {
					if (old != null)
						old.dispose();
				}

			}
		}
	}

	public Label getLabel() {
		return label;
	}

	public IFigure getContentPane() {
		return image;
	}
}