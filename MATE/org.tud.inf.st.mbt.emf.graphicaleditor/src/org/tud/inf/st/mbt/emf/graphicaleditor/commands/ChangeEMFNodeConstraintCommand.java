package org.tud.inf.st.mbt.emf.graphicaleditor.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphicsUtil;

public class ChangeEMFNodeConstraintCommand extends Command {
	private EObject node;
	private Rectangle newConstraint, oldConstraint;
	private EMFGraphics graphics;

	public ChangeEMFNodeConstraintCommand(EObject node, EMFGraphics graphics, Rectangle newConstraint) {
		this.node = node;
		this.newConstraint = newConstraint;
		this.graphics = graphics;

		this.oldConstraint = graphics.getObjectConstraint(node);
	}

	private void set(Rectangle r) {
		graphics.setObjectConstraint(node, r);
		EMFGraphicsUtil.notifyNull(node);
	}

	public void execute() {
		set(newConstraint);
	}

	public void undo() {
		set(oldConstraint);
	}
}
