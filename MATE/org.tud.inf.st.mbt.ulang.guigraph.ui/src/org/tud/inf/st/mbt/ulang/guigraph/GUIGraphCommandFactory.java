package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphicsUtil;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFCommandFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFConnectionCommand;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFReconnectCommand;

public class GUIGraphCommandFactory implements EMFCommandFactory {

	private EMFGraphics graphics;

	public GUIGraphCommandFactory(EMFGraphics graphics) {
		this.graphics = graphics;
	}

	public Command createNodeCreateCommand(EObject parent, EClass childType,
			Point location, Dimension size) {
		return new GUIGraphCreateCommand(parent, childType, location, size,
				graphics);
	}

	public EMFConnectionCommand createConnectionCommand(EObject parent,
			final EClass connType) {
		return new EMFConnectionCommand(connType, parent) {
			@Override
			public void execute() {
					Arc e = (Arc) GuigraphFactory.eINSTANCE.create(connType);
					e.setSource((GuiGraphNode) getSource());
					e.setTarget((GuiGraphNode) getTarget());
					((GuiGraph) getParent()).getArcs().add(e);
					setConnection(e);
					notifyModel();
			}
		};
	}

	public EMFReconnectCommand createReconnectCommand(EObject connection,
			EObject fromOld, EObject toOld) {
		return new EMFReconnectCommand(connection, fromOld, toOld) {
			@Override
			public void execute() {
				if (getConnection() instanceof Arc) {
					if (getSource() != null) {
						((Arc) getConnection())
								.setSource((GuiGraphNode) getSource());
					}
					if (getTarget() != null) {
						((Arc) getConnection())
								.setTarget((GuiGraphNode) getTarget());
					}
					notifyModel();
				}
			}
		};
	}

	public Command createDeleteCommand(final EObject toDelete) {
		if (toDelete instanceof GuiGraphNode) {
			return new Command() {
				private GuiGraphNode node = (GuiGraphNode) toDelete;
				private Set<Arc> inouts = new HashSet<>();
				private GuiGraph graph = (GuiGraph) node.eContainer();
				private Rectangle constraint;

				@Override
				public void execute() {
					for (Arc e : graph.getArcs()) {
						if (e.getSource().equals(node)
								|| e.getTarget().equals(node)) {
							inouts.add(e);
						}

					}
					
					graph.getArcs().removeAll(inouts);
					graph.getNodes().remove(node);

					constraint = graphics.getObjectConstraint(toDelete);
					graphics.deleteObjectConstraint(toDelete);
					
					notifyModel();
				}

				@Override
				public void undo() {
					graph.getNodes().add(node);
					graph.getArcs().addAll(inouts);
					
					graphics.setObjectConstraint(toDelete, constraint);

					notifyModel();
				}

				private void notifyModel() {
					EMFGraphicsUtil.notifyNull(node);
					EMFGraphicsUtil.notifyNull(graph);
					for (Arc e : inouts) {
						EMFGraphicsUtil.notifyNull(e);
						EMFGraphicsUtil.notifyNull(e.getSource());
						EMFGraphicsUtil.notifyNull(e.getTarget());
					}
				}
			};
		} else if (toDelete.eClass().equals(
				GuigraphPackage.eINSTANCE.getWidget())) {
			return new Command() {
				private Widget widget = (Widget) toDelete;
				private Widget parent = (Widget) widget.eContainer();
				private Rectangle constraint;

				@Override
				public void execute() {
					parent.getChildren().remove(widget);

					constraint = graphics.getObjectConstraint(toDelete);
					graphics.deleteObjectConstraint(toDelete);
					
					notifyModel();
				}

				@Override
				public void undo() {
					parent.getChildren().add(widget);
					
					graphics.setObjectConstraint(toDelete, constraint);

					notifyModel();
				}

				private void notifyModel() {
					EMFGraphicsUtil.notifyNull(widget);
					EMFGraphicsUtil.notifyNull(parent);
				}
			};
		} else if (toDelete instanceof Arc) {
			return new Command() {
				private Arc arc = (Arc) toDelete;
				private GuiGraph parent = (GuiGraph) arc.eContainer();
				private Point[] bendpoints;

				@Override
				public void execute() {
					parent.getArcs().remove(arc);
					
					bendpoints = graphics.getOrderedBendpoints(toDelete);

					notifyModel();
				}

				@Override
				public void undo() {
					parent.getArcs().add(arc);
					
					for(int i=0;i<bendpoints.length;i++){
						graphics.addBendpoint(toDelete, i, bendpoints[i]);
					}

					notifyModel();
				}

				private void notifyModel() {
					EMFGraphicsUtil.notifyNull(arc);
					EMFGraphicsUtil.notifyNull(parent);
					EMFGraphicsUtil.notifyNull(arc.getSource());
					EMFGraphicsUtil.notifyNull(arc.getTarget());
				}
			};
		}

		return null;
	}

}
