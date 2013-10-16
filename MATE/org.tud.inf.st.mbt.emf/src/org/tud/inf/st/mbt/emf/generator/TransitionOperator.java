package org.tud.inf.st.mbt.emf.generator;

import static org.tud.inf.st.mbt.emf.util.ModelUtil.atom;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.getAllEObjectsOfSuperType;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.not;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.mbt.emf.transformations.Model2Logic;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.rules.Atom;
import org.tud.inf.st.mbt.rules.IRealTimeConsumer;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RealTimeAtom;
import org.tud.inf.st.mbt.rules.RulesPackage;
import org.tud.inf.st.mbt.rules.TokenAtom;
import org.tud.inf.st.mbt.ulang.guigraph.Arc;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.InhibitorArc;
import org.tud.inf.st.mbt.ulang.guigraph.Place;
import org.tud.inf.st.mbt.ulang.guigraph.StandardArc;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;

public abstract class TransitionOperator extends AbstractOperator {
	
	private static class PlaceWeight{
		public int weight = 0;
		public Place place;
		
		public PlaceWeight(Place p) {
			this.place = p;
		}
		
		@Override
		public String toString() {
			return "("+place+","+weight+")";
		}
	}

	private Collection<Transition> transitions;
	private Map<Transition, List<PlaceWeight>> trans2consumed = new HashMap<>();
	private Map<Transition, List<Place>> trans2inhibited = new HashMap<>();
	private Map<Transition, List<PlaceWeight>> trans2produced = new HashMap<>();

	private SAT sat;
	private SATFoundation satFoundation;

	public TransitionOperator(SATFoundation satFoundation) {
		this.satFoundation = satFoundation;

		this.sat = satFoundation.buildSAT();

		Collection<Place> places = getAllEObjectsOfSuperType(satFoundation.getResourceSet(),
				Place.class);
		Collection<Arc> arcs = getAllEObjectsOfSuperType(satFoundation.getResourceSet(),
						Arc.class);
		transitions = getAllEObjectsOfSuperType(satFoundation.getResourceSet(),
				Transition.class);

		for (Transition t : transitions) {
			List<PlaceWeight> consumed = new ArrayList<>(2);
			List<PlaceWeight> produced = new ArrayList<>(2);
			List<Place> inhibited = new ArrayList<>(1);
	
			for(Place p:places){
				PlaceWeight wConsumed = new PlaceWeight(p);
				PlaceWeight wProduced = new PlaceWeight(p);
				
				for (Arc e : arcs) {
					if (e.getTarget().equals(t) && e.getSource().equals(p)) {
						if (e instanceof InhibitorArc)
							inhibited.add(p);
						else
							wConsumed.weight+=((StandardArc) e).getWeight();
					}
					if (e.getSource().equals(t) && e.getTarget().equals(p)) {
						wProduced.weight+=((StandardArc) e).getWeight();
					}
				}
				consumed.add(wConsumed);
				produced.add(wProduced);
			}
			
			trans2consumed.put(t, consumed);
			trans2inhibited.put(t, inhibited);
			trans2produced.put(t, produced);
		}
	}

	protected Collection<Transition> getTransitions() {
		return transitions;
	}

	public SATFoundation getSatFoundation() {
		return satFoundation;
	}

	protected void consumeAndProduce(Transition t, State s) {
		for(PlaceWeight w:trans2consumed.get(t))
			changeTokenCount(s, w.place, -w.weight);
		for(PlaceWeight w:trans2produced.get(t))
			changeTokenCount(s, w.place, w.weight);
		s.deconfigureProposition(ModelUtil.atom((IRealTimeConsumer) t, 0L));
	}

	protected List<Transition> computeEnabledTransitions(State s) {
		List<Transition> enabled = new ArrayList<>(5);
		List<IRealTimeConsumer> timed = new ArrayList<>(5);

		PredicateList times = s.findAllPredicates(RulesPackage.eINSTANCE
				.getRealTimeAtom());
		for (Predicate p : times) {
			RealTimeAtom rta = (RealTimeAtom) p;
			timed.add(rta.getConsumer());
		}

		for (Transition t : transitions) {
			if (isEnabled(s, t)) {
				if (!timed.contains(t))
					s.configureProposition(ModelUtil.atom(t, 0));
				enabled.add(t);
			}
		}

		return enabled;
	}

	@SuppressWarnings("unchecked")
	protected List<Transition> computeActivatedTransitions(State s) {
		return (List<Transition>) s
				.getRealTimeEnabledConsumers(Transition.class);
	}

	/**
	 * to be overriden
	 */
	protected boolean isEnabled(State s, Transition t) {
		return isTokenEnabled(s, t);
	}

	protected final boolean isTokenEnabled(State s, Transition t) {
		for (PlaceWeight w : trans2consumed.get(t))
			if (s.getTokenCount(w.place) < w.weight)
				return false;

		for (Place p : trans2inhibited.get(t))
			if (s.getTokenCount(p) > 0)
				return false;

		for (PlaceWeight wp : trans2produced.get(t)) {
			int c = s.getTokenCount(wp.place);
			for(PlaceWeight wc:trans2consumed.get(t))
				if(wc.place.equals(wp.place))c-=wc.weight;
			c+= wp.weight;
			if (c > satFoundation.getMaxTokens())
				return false;
		}

		return true;
	}

	protected final static void changeTokenCount(State s, Place p, int d) {
		for (Predicate a : s.getPropositions().toArray()) {
			if (a instanceof TokenAtom && ((TokenAtom) a).getPlace().equals(p)) {
				TokenAtom ta = (TokenAtom) a;
				if (ta.getCount() + d <= 0)
					s.deconfigureProposition(ta);
				else
					s.configureProposition(atom(ta.getPlace(), ta.getCount()
							+ d));
				return;
			}
		}

		// if no token existed before
		Atom a = atom(p, d);
		s.configureProposition(a);
	}

	protected boolean conditionHolds(State s, Predicate p, GuiGraph gg) {
		p = Model2Logic.normalize(p, satFoundation.getFeatures(),
				new HashMap<String, Object>());

		Conjunction appendix = new Conjunction(satFoundation.getInvariant(gg));
		PredicateList unfold = s.getUnfoldPropositions();
		for (Predicate a : unfold) {
			if (satFoundation.getBase().contains(a)) {
				Clause unit = new Clause();
				unit.add(a);
				appendix.add(unit);
			}
		}
		for (Predicate a : satFoundation.getBase()) {
			if (!unfold.contains(a)) {
				Clause unit = new Clause();
				unit.add(not(EcoreUtil.copy(a)));
				appendix.add(unit);
			}
		}
		return sat.isSatisfiable(p, appendix);
	}
}
