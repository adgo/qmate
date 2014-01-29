package org.tud.inf.st.mbt.ulang.guigraph.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.ulang.guigraph.Arc;
import org.tud.inf.st.mbt.ulang.guigraph.GUIGraphModelIndex;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory;
import org.tud.inf.st.mbt.ulang.guigraph.PageMappingArc;
import org.tud.inf.st.mbt.ulang.guigraph.PageTransition;
import org.tud.inf.st.mbt.ulang.guigraph.Place;

public class UnfoldInterfaceCommand extends Command {
	private GuiGraph graph;
	private EMFGraphics graphics;
	private List<PageMappingArc> addedArcs = new ArrayList<>();
	private List<Place> addedPlaces = new ArrayList<>();
	private PageTransition pageTransiton;

	public UnfoldInterfaceCommand(GuiGraph graph, PageTransition pageTransiton,
			EMFGraphics graphics) {
		this.graph = graph;
		this.pageTransiton = pageTransiton;
		this.graphics = graphics;
	}

	@Override
	public void execute() {
		GUIGraphModelIndex idx = new GUIGraphModelIndex(graph);

		List<Place> interfacePlaces = new ArrayList<>();
		for(GuiGraphNode n:pageTransiton.getPage().getNodes())
			if(n instanceof Place && ((Place)n).isProvideAsInterface())
				interfacePlaces.add((Place)n);
		
		for (Arc a : graph.getArcs())
			if (a instanceof PageMappingArc
					&& (a.getSource().equals(pageTransiton) || a.getTarget()
							.equals(pageTransiton)) && ((PageMappingArc)a).getMapping()!=null) {
				interfacePlaces.remove(((PageMappingArc)a).getMapping());
			}
		
		int ip = 0;
		
		Rectangle bounds = graphics.getObjectConstraint(pageTransiton);
		bounds = bounds.getTranslated(bounds.width+20, 0);
		
		for(Place ifp:interfacePlaces){
			Place mappingPlace = EcoreUtil.copy(ifp);
			mappingPlace.setId(null);
			mappingPlace.setName(null);
			idx.getIdByObject(mappingPlace);
			mappingPlace.setName(ifp.getName());
			graph.getNodes().add(mappingPlace);
			addedPlaces.add(mappingPlace);
			graphics.setObjectConstraint(mappingPlace, bounds.getTranslated(0, ip*50));
			
			PageMappingArc a = GuigraphFactory.eINSTANCE.createPageMappingArc();
			idx.getIdByObject(a);
			a.setSource(mappingPlace);
			a.setTarget(pageTransiton);
			graph.getArcs().add(a);
			addedArcs.add(a);
			a.setMapping(ifp);
			
			ip++;
		}
	}

	@Override
	public void undo() {
		graph.getNodes().removeAll(addedPlaces);
		for (Place p : addedPlaces)
			graphics.deleteObjectConstraint(p);
		graph.getArcs().removeAll(addedArcs);
	}
}
