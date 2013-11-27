package org.tud.inf.st.mbt.ulang.guigraph.commands;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.gef.commands.Command;
import org.tud.inf.st.mbt.ulang.guigraph.Arc;
import org.tud.inf.st.mbt.ulang.guigraph.GUIGraphModelIndex;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory;
import org.tud.inf.st.mbt.ulang.guigraph.InhibitorArc;
import org.tud.inf.st.mbt.ulang.guigraph.Place;
import org.tud.inf.st.mbt.ulang.guigraph.StandardArc;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;

public class MergePlacesCommand extends Command {

	private GuiGraph graph;
	private List<Place> places;
	private int initialTokensBefore = 0;
	private Set<Arc> removedArcs = new HashSet<>();
	private Place p0;

	public MergePlacesCommand(GuiGraph gg, List<Place> places) {
		this.graph = gg;
		this.places = places;
	}

	@Override
	public void execute() {
		p0 = places.get(0);
		initialTokensBefore = p0.getInitialTokens();

		Map<Transition, Integer> inWeights = new HashMap<>();
		Map<Transition, Integer> outWeights = new HashMap<>();
		Set<Transition> inhibited = new HashSet<>();

		for (Arc a : graph.getArcs().toArray(new Arc[0])) {
			if (a.getSource().equals(p0)) {
				if (a instanceof StandardArc) {
					Integer w = outWeights.get(a.getTarget());
					if (w == null)
						w = 0;
					w += ((StandardArc) a).getWeight();
					outWeights.put((Transition) a.getTarget(), w);
				} else if (a instanceof InhibitorArc) {
					inhibited.add((Transition) a.getTarget());
				}
				graph.getArcs().remove(a);
				removedArcs.add(a);
			}
			if (a.getTarget().equals(p0)) {
				Integer w = inWeights.get(a.getSource());
				if (w == null)
					w = 0;
				w += ((StandardArc) a).getWeight();
				inWeights.put((Transition) a.getSource(), w);
				graph.getArcs().remove(a);
				removedArcs.add(a);
			}
		}

		for (int i = 1; i < places.size(); i++) {
			Place pi = places.get(i);
			p0.setInitialTokens(p0.getInitialTokens() + pi.getInitialTokens());
			for (Arc a : graph.getArcs().toArray(new Arc[0])) {
				if (a.getSource().equals(pi)) {
					if (a instanceof StandardArc) {
						Integer w = outWeights.get(a.getTarget());
						if (w == null)
							w = 0;
						w += ((StandardArc) a).getWeight();
						outWeights.put((Transition) a.getTarget(), w);
					} else if (a instanceof InhibitorArc) {
						inhibited.add((Transition) a.getTarget());
					}
					graph.getArcs().remove(a);
					removedArcs.add(a);
				}
				if (a.getTarget().equals(pi)) {
					Integer w = inWeights.get(a.getSource());
					if (w == null)
						w = 0;
					w += ((StandardArc) a).getWeight();
					inWeights.put((Transition) a.getSource(), w);
					graph.getArcs().remove(a);
					removedArcs.add(a);
				}
			}
			graph.getNodes().remove(pi);
		}

		GuigraphFactory fac = GuigraphFactory.eINSTANCE;
		GUIGraphModelIndex idx = new GUIGraphModelIndex(graph);
		for (Entry<Transition, Integer> in : inWeights.entrySet()) {
			StandardArc a = fac.createStandardArc();
			idx.getIdByObject(a);
			a.setWeight(in.getValue());
			a.setSource(in.getKey());
			a.setTarget(p0);
			graph.getArcs().add(a);
		}
		for (Entry<Transition, Integer> out : outWeights.entrySet()) {
			StandardArc a = fac.createStandardArc();
			idx.getIdByObject(a);
			a.setWeight(out.getValue());
			a.setTarget(out.getKey());
			a.setSource(p0);
			graph.getArcs().add(a);
		}
		for (Transition inh : inhibited) {
			InhibitorArc a = fac.createInhibitorArc();
			idx.getIdByObject(a);
			a.setSource(p0);
			a.setTarget(inh);
			graph.getArcs().add(a);
		}
	}

	@Override
	public void undo() {
		for (Arc a : graph.getArcs().toArray(new Arc[0])) {
			if (a.getSource().equals(p0) || a.getTarget().equals(p0))
				graph.getArcs().remove(a);
		}
		graph.getArcs().addAll(removedArcs);
		p0.setInitialTokens(initialTokensBefore);
		for (int i = 1; i < places.size(); i++) {
			graph.getNodes().add(places.get(i));
		}
	}
}
