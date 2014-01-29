package org.tud.inf.st.mbt.ulang.guigraph.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.ulang.guigraph.GUIGraphModelIndex;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode;

public class DuplicateNodeCommand extends Command  {
	private GuiGraph graph;
	private GuiGraphNode node,copy;
	private EMFGraphics graphics;
	
	public DuplicateNodeCommand(GuiGraph graph, GuiGraphNode node, EMFGraphics graphics) {
		this.graph = graph;
		this.node = node;
		this.graphics = graphics;
	}

	@Override
	public void execute() {
		GUIGraphModelIndex idx = new GUIGraphModelIndex(graph);
		copy = EcoreUtil.copy(node);
		copy.setId(null);
		copy.setName(null);
		idx.getIdByObject(copy);
		graph.getNodes().add(copy);
		
		Rectangle bounds = graphics.getObjectConstraint(node);
		bounds = bounds.getTranslated(bounds.getSize().width+10, 0);
		graphics.setObjectConstraint(copy, bounds);
	}
	
	@Override
	public void undo() {
		graph.getNodes().remove(copy);
		graphics.deleteObjectConstraint(copy);
	}
}
