package org.tud.inf.st.mbt.scenario.ui;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFCommandFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFConnectionCommand;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFReconnectCommand;
import org.tud.inf.st.mbt.scenario.Placement;
import org.tud.inf.st.mbt.scenario.Scenario;

public class ScenarioCommandFactory implements EMFCommandFactory {

	private EMFGraphics graphics;

	public ScenarioCommandFactory(EMFGraphics graphics) {
		this.graphics = graphics;
	}

	@Override
	public Command createNodeCreateCommand(EObject parent, EClass childType,
			Point location, Dimension size) {
		return new ScenarioNodeCreateCommand(parent, childType, location, size,
				graphics);
	}

	@Override
	public EMFConnectionCommand createConnectionCommand(EObject parent,
			EClass connType) {
		return null;
	}

	@Override
	public EMFReconnectCommand createReconnectCommand(EObject connection,
			EObject fromOld, EObject toOld) {
		return null;
	}

	@Override
	public Command createDeleteCommand(final EObject toDelete) {
		return new Command(){
			private Scenario scen = (Scenario) toDelete.eContainer();
			
			@Override
			public void execute() {
				scen.getPlacements().remove(toDelete);
			}
			
			@Override
			public void undo() {
				scen.getPlacements().add((Placement) toDelete);
			}
		};
	}
}
