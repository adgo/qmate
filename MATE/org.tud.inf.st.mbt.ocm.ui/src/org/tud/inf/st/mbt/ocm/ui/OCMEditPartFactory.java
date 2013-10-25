package org.tud.inf.st.mbt.ocm.ui;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFContainerEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFEditPartFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.LabeledRectangle;
import org.tud.inf.st.mbt.ocm.Edge;
import org.tud.inf.st.mbt.ocm.OcmPackage;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;
import org.tud.inf.st.mbt.ocm.ReconfigurationActionNode;
import org.tud.inf.st.mbt.ocm.StandardConfigurationNode;

public class OCMEditPartFactory extends EMFEditPartFactory {

	public OCMEditPartFactory(GraphicalEMFEditor editor, EMFGraphics graphics) {
		super(editor, graphics);
	}

	@Override
	public EditPart createEMFEditPart(EditPart context, Object model) {
		EMFGraphics graphics = getGraphics();

		EditPart result = null;

		if (model instanceof OperationalConfigurationModel) {
			result = new EMFContainerEditPart((EObject) model, graphics,
					new OCMCommandFactory(graphics), true) {

				@Override
				protected boolean isNodeType(EClass type) {
					return OcmPackage.eINSTANCE.getConfigurationNode()
							.isSuperTypeOf(type);
				}

			};
		} else if (model instanceof StandardConfigurationNode) {
			result = new BasicOCMNodeEditPart((EObject) model, graphics,
					getEditedResource()) {

				@Override
				protected IFigure createFigure() {
					return new LabeledRectangle(ColorConstants.black,
							ColorConstants.orange, null);
				}

				@Override
				public void refreshVisuals() {
					LabeledRectangle fig = (LabeledRectangle) getFigure();
					fig.getLabel(null).setText("" + getModel());
					super.refreshVisuals();
				}
			};
		} else if (model instanceof ReconfigurationActionNode) {
			result = new ReconfigurationActionEditPart((EObject) model,
					graphics, getEditedResource());
		} else if (model instanceof Edge)
			return new OCMEdgeEditPart(model, graphics);

		return result;
	}
}
