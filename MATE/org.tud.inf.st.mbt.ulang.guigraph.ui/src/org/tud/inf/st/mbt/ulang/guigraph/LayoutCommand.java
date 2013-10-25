package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gef.commands.Command;
import org.eclipse.swt.graphics.ImageData;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.emf.graphicaleditor.layout.EMFGraphicalLayouter;
import org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition;
import org.tud.inf.st.mbt.graphical.GraphicalDescription;
import org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition;

public class LayoutCommand extends Command {
	private Map<String, Rectangle> nodesBackup = new HashMap<>();
	private Map<String, Collection<?>> bendpointsBackup = new HashMap<>();
	private GraphicalDescription gd;
	private GuiGraph guiGraph;

	private class GGEndpointProvider implements
			EMFGraphicalLayouter.EndpointProvider {

		private final Dimension nodeMax = new Dimension(300, 250);
		private Dimension screenSize = null;
		private final Map<String, GuiGraphNode> id2node = new HashMap<>();

		public GGEndpointProvider() {
			for (GuiGraphNode node : guiGraph.getNodes().toArray(new GuiGraphNode[0])) {
				id2node.put(node.getId(), node);
				if (screenSize == null && node instanceof Form
						&& ((Form) node).getImage() != null) {
					String path = ResourcesPlugin.getWorkspace().getRoot().getLocation()+((Form) node).getImage();
					ImageData img = new ImageData(path);
					screenSize = new Dimension(img.width, img.height);

					// now scale screen size
					float scale = screenSize.width > nodeMax.width
							|| screenSize.height > nodeMax.height ? Math.min(
							(float) nodeMax.width / (float) screenSize.width,
							(float) nodeMax.height / (float) screenSize.height)
							: 1;
					screenSize = screenSize.scale(scale);
				}
			}
			if(screenSize == null){
				screenSize = nodeMax;
			}
		}

		@Override
		public String getSourceID(String conID) {
			for (Arc e : guiGraph.getArcs()) {
				if (e.getId().equals(conID))
					return e.getSource().getId();
			}
			return null;
		}

		@Override
		public String getTargetID(String conID) {
			for (Arc e : guiGraph.getArcs()) {
				if (e.getId().equals(conID))
					return e.getTarget().getId();
			}
			return null;
		}

		@Override
		public Dimension getSizeHint(String nodeID) {
			GuiGraphNode node = id2node.get(nodeID);
			if(node instanceof Form){
				return screenSize;
			} else if (node instanceof ConditionActionTransition) {
				String text = ((ConditionActionTransition) node).getActionsText();
				if(text != null){
					String[] lines = text.split("\n");
					return new Dimension(nodeMax.width, (int) ((1+lines.length)*15+60));					
				}
				return nodeMax;
			} else return nodesBackup.get(nodeID).getSize();
		}
	}

	public LayoutCommand(GraphicalEMFEditor ged) {
		super("Layout");
		this.gd = ged.getGraphicalDescription();
		this.guiGraph = (GuiGraph) ged.getGraph();

		for (Object e : gd.getNodes()) {
			GraphicalNodeDefinition n = (GraphicalNodeDefinition) e;
			nodesBackup.put(
					n.getReferenceId(),
					new Rectangle(n.getX(), n.getY(), n.getWidth(), n
							.getHeight()));
		}
		for (Object e : gd.getConnections()) {
			GraphicalConnectionDefinition c = (GraphicalConnectionDefinition) e;
			bendpointsBackup.put(c.getReferenceId(), c.getBendpoints());
		}
	}

	@Override
	public void execute() {
		new EMFGraphicalLayouter().layoutGraphicalDesicription(gd,
				new GGEndpointProvider());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void undo() {
		for (Object e : gd.getNodes()) {
			GraphicalNodeDefinition n = (GraphicalNodeDefinition) e;
			Rectangle r = nodesBackup.get(n.getReferenceId());
			n.setX(r.getLocation().x);
			n.setY(r.getLocation().y);
			n.setWidth(r.getSize().width);
			n.setHeight(r.getSize().height);
		}
		for (Object e : gd.getConnections()) {
			GraphicalConnectionDefinition c = (GraphicalConnectionDefinition) e;
			c.getBendpoints().clear();
			c.getBendpoints().addAll(bendpointsBackup.get(c.getReferenceId()));
		}
	}
}