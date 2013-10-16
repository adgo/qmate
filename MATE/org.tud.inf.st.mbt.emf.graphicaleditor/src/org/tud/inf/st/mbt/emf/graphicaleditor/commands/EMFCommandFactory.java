package org.tud.inf.st.mbt.emf.graphicaleditor.commands;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;

public interface EMFCommandFactory{
	Command createNodeCreateCommand(EObject parent, EClass childType, Point location,Dimension size);
	EMFConnectionCommand createConnectionCommand(EObject parent, EClass connType);
	EMFReconnectCommand createReconnectCommand(EObject connection, EObject fromOld, EObject toOld);
	Command createDeleteCommand(EObject toDelete);
}
