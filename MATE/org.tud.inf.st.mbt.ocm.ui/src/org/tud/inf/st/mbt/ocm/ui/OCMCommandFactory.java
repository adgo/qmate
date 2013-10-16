package org.tud.inf.st.mbt.ocm.ui;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphicsUtil;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFCommandFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFConnectionCommand;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFReconnectCommand;
import org.tud.inf.st.mbt.ocm.ComposedConfigurationNode;
import org.tud.inf.st.mbt.ocm.CompositionEdge;
import org.tud.inf.st.mbt.ocm.ConfigurationNode;
import org.tud.inf.st.mbt.ocm.Edge;
import org.tud.inf.st.mbt.ocm.OcmFactory;
import org.tud.inf.st.mbt.ocm.OcmPackage;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;
import org.tud.inf.st.mbt.ocm.OperationalEdge;

public class OCMCommandFactory implements EMFCommandFactory {

	private EMFGraphics graphics;

	public OCMCommandFactory(EMFGraphics graphics) {
		this.graphics = graphics;
	}

	@Override
	public Command createNodeCreateCommand(EObject parent, EClass childType,
			Point location, Dimension size) {
		return new OCMNodeCreateCommand(parent, childType, location, size,
				graphics);
	}

	@Override
	public EMFConnectionCommand createConnectionCommand(EObject parent,
			EClass connType) {
		return new EMFConnectionCommand(connType, parent) {
			@Override
			public void execute() {
				if (getConnectionType().equals(
						OcmPackage.eINSTANCE.getCompositionEdge())) {
					CompositionEdge e = OcmFactory.eINSTANCE
							.createCompositionEdge();
					e.setSource((ConfigurationNode) getSource());
					e.setTarget((ComposedConfigurationNode) getTarget());
					((OperationalConfigurationModel) getParent()).getEdges()
							.add(e);
					setConnection(e);
				} else {
					OperationalEdge e = getConnectionType().equals(
							OcmPackage.eINSTANCE.getTimedEdge()) ? OcmFactory.eINSTANCE
							.createTimedEdge() : OcmFactory.eINSTANCE
							.createEventGuardedEdge();
					e.setSource((ConfigurationNode) getSource());
					e.setTarget((ConfigurationNode) getTarget());
					((OperationalConfigurationModel) getParent()).getEdges()
							.add(e);
					setConnection(e);
				}
				notifyModel();
			}

			@Override
			public void undo() {
				((OperationalConfigurationModel) getParent()).getEdges()
						.remove(getConnection());
				notifyModel();
			}
		};
	}

	@Override
	public EMFReconnectCommand createReconnectCommand(EObject connection,
			EObject fromOld, EObject toOld) {
		return new EMFReconnectCommand(connection, fromOld, toOld) {
			@Override
			public void execute() {
				if (getConnectionType().equals(
						OcmPackage.eINSTANCE.getCompositionEdge())) {

					CompositionEdge e = (CompositionEdge) getConnection();

					if (getSource() != null)
						e.setSource((ConfigurationNode) getSource());
					if (getTarget() != null)
						e.setTarget((ComposedConfigurationNode) getTarget());
				} else {
					OperationalEdge e = (OperationalEdge) getConnection();

					if (getSource() != null)
						e.setSource((ConfigurationNode) getSource());
					if (getTarget() != null)
						e.setTarget((ConfigurationNode) getTarget());
				}
				notifyModel();
			}

			@Override
			public void undo() {
				if (getConnectionType().equals(
						OcmPackage.eINSTANCE.getCompositionEdge())) {

					CompositionEdge e = (CompositionEdge) getConnection();

					if (getSourceOld() != null)
						e.setSource((ConfigurationNode) getSourceOld());
					if (getTargetOld() != null)
						e.setTarget((ComposedConfigurationNode) getTargetOld());
				} else {
					OperationalEdge e = (OperationalEdge) getConnection();

					if (getSourceOld() != null)
						e.setSource((ConfigurationNode) getSourceOld());
					if (getTargetOld() != null)
						e.setTarget((ConfigurationNode) getTargetOld());
				}
				notifyModel();
			}
		};
	}

	@Override
	public Command createDeleteCommand(final EObject toDelete) {
		if (toDelete instanceof ConfigurationNode) {
			return new Command() {
				private Set<Edge> inouts = new HashSet<>();
				private OperationalConfigurationModel graph = (OperationalConfigurationModel) toDelete
						.eContainer();

				@Override
				public void execute() {
					for (Edge e : graph.getEdges()) {
						if (e instanceof CompositionEdge) {
							CompositionEdge ce = (CompositionEdge) e;
							if (ce.getSource().equals(toDelete)
									|| ce.getTarget().equals(toDelete))
								inouts.add(ce);
						} else {
							OperationalEdge oe = (OperationalEdge) e;
							if (oe.getSource().equals(toDelete)
									|| oe.getTarget().equals(toDelete))
								inouts.add(oe);
						}
					}

					graph.getEdges().removeAll(inouts);
					graph.getNodes().remove(toDelete);

					notifyModel();
				}

				@Override
				public void undo() {
					graph.getNodes().add((ConfigurationNode) toDelete);
					graph.getEdges().addAll(inouts);

					notifyModel();
				}

				private void notifyModel() {
					EMFGraphicsUtil.notifyNull(toDelete);
					EMFGraphicsUtil.notifyNull(graph);
					for (Edge e : inouts) {
						EMFGraphicsUtil.notifyNull(e);
						if (e instanceof CompositionEdge) {
							EMFGraphicsUtil.notifyNull(((CompositionEdge) e)
									.getSource());
							EMFGraphicsUtil.notifyNull(((CompositionEdge) e)
									.getTarget());
						} else {
							EMFGraphicsUtil.notifyNull(((OperationalEdge) e)
									.getSource());
							EMFGraphicsUtil.notifyNull(((OperationalEdge) e)
									.getTarget());
						}
					}
				}
			};
		} else if (toDelete instanceof Edge) {
			return new Command() {
				private OperationalConfigurationModel graph = (OperationalConfigurationModel) toDelete
						.eContainer();

				@Override
				public void execute() {
					graph.getEdges().remove(toDelete);
					notifyModel();
				}

				@Override
				public void undo() {
					graph.getEdges().add((Edge) toDelete);
					notifyModel();
				}

				private void notifyModel() {
					EMFGraphicsUtil.notifyNull(toDelete);
					EMFGraphicsUtil.notifyNull(graph);
					if (toDelete instanceof CompositionEdge) {
						EMFGraphicsUtil.notifyNull(((CompositionEdge) toDelete)
								.getSource());
						EMFGraphicsUtil.notifyNull(((CompositionEdge) toDelete)
								.getTarget());
					} else {
						EMFGraphicsUtil.notifyNull(((OperationalEdge) toDelete)
								.getSource());
						EMFGraphicsUtil.notifyNull(((OperationalEdge) toDelete)
								.getTarget());
					}
				}
			};
		}

		return null;
	}
}
