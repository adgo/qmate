package org.tud.inf.st.mbt.ulang.guigraph.commands;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.ulang.guigraph.Arc;
import org.tud.inf.st.mbt.ulang.guigraph.GUIGraphModelIndex;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;

public class SplitTransitionCommand extends Command {
	private GuiGraph graph;
	private Transition transition;
	private Set<Arc> addedArcs = new HashSet<>();
	private Set<Transition> addedTransitions = new HashSet<>();
	private EMFGraphics graphics;

	public SplitTransitionCommand(GuiGraph graph, Transition transition, EMFGraphics graphics) {
		this.graph = graph;
		this.transition = transition;
		this.graphics = graphics;
	}

	@Override
	public void execute() {
		GUIGraphModelIndex idx = new GUIGraphModelIndex(graph);
		boolean firstArc = true;
		
		Rectangle bounds = graphics.getObjectConstraint(transition);

		for (Arc a : graph.getArcs().toArray(new Arc[0])) {
			if (a.getTarget().equals(transition)) {
				if (firstArc)
					firstArc = false;
				else {
					bounds = bounds.getTranslated(bounds.getSize().width+10, 0);

					Transition copy = EcoreUtil.copy(transition);
					copy.setName(null);
					copy.setId(null);
					idx.getIdByObject(transition);
								
					addedTransitions.add(copy);
					graph.getNodes().add(copy);					
			
					a.setTarget(copy);
					
					graphics.setObjectConstraint(copy, bounds);
					
					for(Arc out:graph.getArcs().toArray(new Arc[0])){
						if(out.getSource().equals(transition)){
							Arc outCopy = EcoreUtil.copy(out);
							outCopy.setSource(copy);
							addedArcs.add(outCopy);
							graph.getArcs().add(outCopy);
							outCopy.setId(null);
							outCopy.setName(null);
							idx.getIdByObject(outCopy);
						}
					}
				}
			}
		}
	}

	@Override
	public void undo() {
		graph.getArcs().removeAll(addedArcs);
		for(Arc a:graph.getArcs()){
			if(addedTransitions.contains(a.getTarget()))
				a.setTarget(transition);
		}
		graph.getNodes().removeAll(addedTransitions);
	}
}
