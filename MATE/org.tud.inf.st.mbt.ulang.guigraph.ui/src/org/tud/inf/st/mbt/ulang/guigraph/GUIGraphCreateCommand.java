package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphicsUtil;

public class GUIGraphCreateCommand extends Command {

	private EObject parent, child;
	private EClass childType;
	private EMFGraphics graphics;
	private Point location;
	private Dimension size;

	public GUIGraphCreateCommand(EObject parent, EClass childType,
			Point location, Dimension size, EMFGraphics graphics) {
		super();
		this.parent = parent;
		this.childType = childType;
		this.graphics = graphics;
		this.location = location;
		this.size = size;
	}

	@Override
	public void execute() {
		if (parent.eClass().equals(GuigraphPackage.eINSTANCE.getGuiGraph())) {
			if (childType.equals(GuigraphPackage.eINSTANCE.getWidget())) {
				child = GuigraphFactory.eINSTANCE.createForm();
			} else if (childType.equals(GuigraphPackage.eINSTANCE
					.getConditionActionTransition())) {
				child = GuigraphFactory.eINSTANCE
						.createConditionActionTransition();
				((ConditionActionTransition) child)
						.setApplicationConditionText("true");
				((ConditionActionTransition) child).setActionsText("");
			} else if (childType.equals(GuigraphPackage.eINSTANCE
					.getTimerTransition())) {
				child = GuigraphFactory.eINSTANCE
						.createTimerTransition();
			} else if (childType.equals(GuigraphPackage.eINSTANCE
					.getNoWidgetNode())) {
				child = GuigraphFactory.eINSTANCE.createNoWidgetNode();
			}
			((GuiGraph) parent).getNodes().add((GuiGraphNode) child);
		} else if (GuigraphPackage.eINSTANCE.getWidget().isSuperTypeOf(
				parent.eClass())) {
			if (childType.equals(GuigraphPackage.eINSTANCE.getWidget())) {
				child = GuigraphFactory.eINSTANCE.createWidget();
				((Widget) parent).getChildren().add((Widget) child);
			}
		}

		if (child != null) {
			if (!(parent instanceof GuiGraph)) {
				Point parentXY = graphics.getAbsoluteObjectConstraint(parent)
						.getLocation();
				location = location.getTranslated(-parentXY.x, -parentXY.y);
			}

			if (size == null || size.width * size.height == 0)
				size = graphics.getStandardDimension(childType);

			graphics.setObjectConstraint(child, new Rectangle(location, size));

			EMFGraphicsUtil.notifyNull(child);
			EMFGraphicsUtil.notifyNull(parent);
		}
	}

	@Override
	public void undo() {
		if (child != null) {
			if (parent.eClass().equals(GuigraphPackage.eINSTANCE.getGuiGraph())) {
				if (childType.equals(GuigraphPackage.eINSTANCE
						.getGuiGraphNode())) {
					((GuiGraph) parent).getNodes().remove((Form) child);
				}
			} else if (GuigraphPackage.eINSTANCE.getWidget().isSuperTypeOf(
					parent.eClass())) {
				if (childType.equals(GuigraphPackage.eINSTANCE.getWidget())) {
					((Widget) parent).getChildren().remove((Widget) child);
				}
			}

			graphics.deleteObjectConstraint(child);
			EMFGraphicsUtil.notifyNull(parent);
		}
	}
}
