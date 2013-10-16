package org.tud.inf.st.mbt.scenario.ui;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphicsUtil;
import org.tud.inf.st.mbt.scenario.Placement;
import org.tud.inf.st.mbt.scenario.Scenario;
import org.tud.inf.st.mbt.scenario.ScenarioFactory;

public class ScenarioNodeCreateCommand extends Command {

	private EObject parent, child;
	private EClass childType;
	private EMFGraphics graphics;
	private Point location;
	private Dimension size;

	public ScenarioNodeCreateCommand(EObject parent, EClass childType,
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
		child = ScenarioFactory.eINSTANCE.create(childType);

		((Scenario) parent).getPlacements().add((Placement) child);
		((Placement)child).setName("Thing");
		if (size == null)
			size = graphics.getStandardDimension(childType);

		graphics.setObjectConstraint(child, new Rectangle(location, size));

		EMFGraphicsUtil.notifyNull(child);
		EMFGraphicsUtil.notifyNull(parent);
	}

	@Override
	public void undo() {
		((Scenario) parent).getPlacements().remove((Placement) child);

		graphics.deleteObjectConstraint(child);
		EMFGraphicsUtil.notifyNull(parent);
	}
}
