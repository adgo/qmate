package org.tud.inf.st.mbt.scenario.ui;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFContainerEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFEditPartFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.emf.transformations.ScenarioModelAnalyzer;
import org.tud.inf.st.mbt.scenario.Placement;
import org.tud.inf.st.mbt.scenario.Scenario;
import org.tud.inf.st.mbt.scenario.ScenarioModel;
import org.tud.inf.st.mbt.scenario.ScenarioPackage;
import org.tud.inf.st.mbt.scenario.SpatialBase;

public class ScenarioEditPartFactory extends EMFEditPartFactory {

	public ScenarioEditPartFactory(GraphicalEMFEditor editor,
			EMFGraphics graphics) {
		super(editor, graphics);
	}

	@Override
	public EditPart createEMFEditPart(EditPart context, Object model) {
		EMFGraphics graphics = getGraphics();

		if (model instanceof Placement) {
			return new PlacementEditPart((EObject) model, graphics,
					getEditedResource());
		} else if (model instanceof Scenario) {
			return new EMFContainerEditPart((EObject) model, graphics,
					new ScenarioCommandFactory(graphics), true) {

				@Override
				protected boolean isNodeType(EClass type) {
					return ScenarioPackage.eINSTANCE.getPlacement()
							.isSuperTypeOf(type);
				}

				@Override
				protected IFigure createFigure() {
					FreeformLayer fl = new FreeformLayer() {
						@Override
						protected void paintFigure(Graphics g) {
							Scenario scen = (Scenario) getModel();
							SpatialBase base = (SpatialBase) scen.eContainer();

							ScenarioModelAnalyzer transformer = ScenarioModelAnalyzer
									.getInstance((ScenarioModel) base
											.eContainer());
							

							g.setBackgroundColor(ColorConstants.white);
							transformer
									.computeSpatialBaseBounds(base);
							
							Rectangle bounds = new Rectangle(base.getX(), base.getY(),
									base.getWidth(), base.getHeight());
							
							g.fillRectangle(bounds.x, bounds.y, bounds.width,
									bounds.height);

							g.setForegroundColor(ColorConstants.black);
							int i = 0;
							for (Integer x : transformer
									.getHorizontalBorders(base)) {
								g.drawLine(x, bounds.y, x, bounds.y
										+ bounds.height);
								if (x < bounds.x + bounds.width) {
									g.drawText(i + "", x + 5, bounds.y - 15);
								}
								i++;
							}
							i = 0;
							for (Integer y : transformer
									.getVerticalBorders(base)) {
								g.drawLine(bounds.x, y,
										bounds.x + bounds.width, y);
								if (y < bounds.y + bounds.height) {
									g.drawText(i + "", bounds.x + bounds.width
											+ 5, y + 5);
								}
								i++;
							}
						}
					};
					fl.setLayoutManager(new FreeformLayout());
					return fl;
				}
			};
		}

		return null;
	}

}
