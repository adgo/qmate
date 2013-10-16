package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFContainerEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFEditPartFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;

public class GUIGraphEditPartFactory extends EMFEditPartFactory {

	public GUIGraphEditPartFactory(GraphicalEMFEditor editor,
			EMFGraphics graphics) {
		super(editor, graphics);
	}

	public EditPart createEMFEditPart(EditPart context, Object model) {
		EditPart result = null;
		EMFGraphics graphics = getGraphics();

		if (model instanceof GuiGraph) {
			result = new EMFContainerEditPart((EObject) model, graphics,
					new GUIGraphCommandFactory(graphics), true) {
				@Override
				protected boolean isNodeType(EClass type) {
					return GuigraphPackage.eINSTANCE.getGuiGraphNode()
							.isSuperTypeOf(type);
				}
			};
		} else if (model instanceof Widget) {
			result = new WidgetEditPart((Widget) model, graphics,
					getEditedResource());
		} else if (model instanceof Arc) {
			result = new ArcEditPart((Arc) model, graphics);
		} else if (model instanceof ConditionActionTransition) {
			result = new CATransitionEditPart(
					(ConditionActionTransition) model, graphics);
		} else if (model instanceof TimerTransition) {
			result = new TimerEditPart(
					(TimerTransition) model, graphics);
		} else if (model instanceof NoWidgetNode) {
			result = new NoWidgetNodeEditPart((NoWidgetNode) model, graphics);
		}

		return result;
	}
}
