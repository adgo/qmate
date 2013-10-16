package org.tud.inf.st.mbt.ocm.ui;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphicsUtil;
import org.tud.inf.st.mbt.features.FeaturesFactory;
import org.tud.inf.st.mbt.ocm.ConfigurationNode;
import org.tud.inf.st.mbt.ocm.OcmFactory;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;
import org.tud.inf.st.mbt.ocm.ReconfigurationActionNode;
import org.tud.inf.st.mbt.ocm.StandardConfigurationNode;

public class OCMNodeCreateCommand extends Command {

	private EObject parent, child;
	private EClass childType;
	private EMFGraphics graphics;
	private Point location;
	private Dimension size;

	public OCMNodeCreateCommand(EObject parent, EClass childType,
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
		child = OcmFactory.eINSTANCE.create(childType);

		if (child instanceof StandardConfigurationNode)
			((StandardConfigurationNode) child)
					.setConfiguration(FeaturesFactory.eINSTANCE
							.createConfiguration());
		
		if (child instanceof ReconfigurationActionNode)
			((ReconfigurationActionNode) child)
					.setActionsText("");
		
		((OperationalConfigurationModel) parent).getNodes().add(
				(ConfigurationNode) child);

		graphics.setObjectConstraint(
				child,
				new Rectangle(location, graphics
						.getStandardDimension(childType)));

		EMFGraphicsUtil.notifyNull(child);
		EMFGraphicsUtil.notifyNull(parent);
	}

	@Override
	public void undo() {
		((OperationalConfigurationModel) parent).getNodes().remove(
				(ConfigurationNode) child);

		graphics.deleteObjectConstraint(child);
		EMFGraphicsUtil.notifyNull(parent);
	}

}
