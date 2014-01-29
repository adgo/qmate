package org.tud.inf.st.mbt.emf.generator;

import static org.tud.inf.st.mbt.emf.util.ModelUtil.atom;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.getAllEObjectsOfSuperType;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.not;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import org.tud.inf.st.mbt.ulang.guigraph.PageMappingArc;
import org.tud.inf.st.mbt.ulang.guigraph.PageTransition;
import org.tud.inf.st.mbt.ulang.guigraph.Place;
import org.tud.inf.st.mbt.ulang.guigraph.StandardArc;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;

public abstract class TransitionOperator extends AbstractOperator {

	protected static class PlaceWeight {
		public int weight = 0;
		public Place place;

		public PlaceWeight(Place p) {
			this.place = p;
		}

		@Override
		public String toString() {
			return "(" + place + "," + weight + ")";
		}
	}

	private static class PlaceMappingRelation {
		private static class Pair {
			Place a, b;

			public Pair(Place a, Place b) {
				this.a = a;
				this.b = b;
			}
			
			@Override
			public String toString() {
				return "("+a+","+b+")";
			}
		}

		private List<Pair> pairs = new ArrayList<>();

		public void add(Place top, Place bottom) {
			pairs.add(new Pair(top, bottom));
		}

		public Set<Place> getMappings(Place p) {
			Set<Place> result = new HashSet<>();
			boolean foundSth = false;
			result.add(p);
			do {
				foundSth = false;
				for (Pair pair : pairs) {
					if (result.contains(pair.a) && result.add(pair.b))
						foundSth = true;
					if(result.contains(pair.b) && result.add(pair.a))
						foundSth = true;
				}
			} while (foundSth);
			return result;
		}
		
		@Override
		public String toString() {
			return pairs.toString();
		}
	}

	private Collection<Transition> transitions;
	private Map<Transition, List<PlaceWeight>> trans2consumed = new HashMap<>();
	private Map<Transition, List<Place>> trans2inhibited = new HashMap<>();
	private Map<Transition, List<PlaceWeight>> trans2produced = new HashMap<>();
	private PlaceMappingRelation mappings = new PlaceMappingRelation();

	private SAT sat;
	private SATFoundation satFoundation;
	private boolean ignoreRealtime = false;
	private Set<Place> places;

	public TransitionOperator(SATFoundation satFoundation,
			boolean ignoreRealTime) {
		this.satFoundation = satFoundation;
		this.ignoreRealtime = ignoreRealTime;

		this.sat = satFoundation.buildSAT();

		Collection<PageMappingArc> marcs = getAllEObjectsOfSuperType(satFoundation.getCache(),
				satFoundation.getResourceSet(), PageMappingArc.class, true);

		for (PageMappingArc marc : marcs) {
			Place top = null;
			GuiGraph page = null;
			if (marc.getSource() instanceof PageTransition
					&& marc.getTarget() instanceof Place) {
				page = ((PageTransition) marc.getSource()).getPage();
				top = (Place) marc.getTarget();
			} else if (marc.getTarget() instanceof PageTransition
					&& marc.getSource() instanceof Place) {
				page = ((PageTransition) marc.getTarget()).getPage();
				top = (Place) marc.getSource();
			}
			if (marc.getMapping().eContainer().equals(page)) {
				mappings.add(top, marc.getMapping());
			}
		}

		places = getAllEObjectsOfSuperType(satFoundation.getCache(),satFoundation.getResourceSet(),
				Place.class);
		Collection<Arc> arcs = getAllEObjectsOfSuperType(satFoundation.getCache(),
				satFoundation.getResourceSet(), Arc.class);
		transitions = getAllEObjectsOfSuperType(satFoundation.getCache(),satFoundation.getResourceSet(),
				Transition.class);

		for (Transition t : transitions) {
			List<PlaceWeight> consumed = new ArrayList<>(2);
			List<PlaceWeight> produced = new ArrayList<>(2);
			List<Place> inhibited = new ArrayList<>(1);

			for (Place p : places) {
				PlaceWeight wConsumed = new PlaceWeight(p);
				PlaceWeight wProduced = new PlaceWeight(p);

				for (Arc e : arcs) {
					if (e.getTarget().equals(t) && e.getSource().equals(p)) {
						if (e instanceof InhibitorArc)
							inhibited.add(p);
						else if (e instanceof StandardArc)
							wConsumed.weight += ((StandardArc) e).getWeight();
					}
					if (e.getSource().equals(t) && e.getTarget().equals(p)) {
						wProduced.weight += ((StandardArc) e).getWeight();
					}
				}
				if (wConsumed.weight > 0)
					consumed.add(wConsumed);
				if (wProduced.weight > 0)
					produced.add(wProduced);
			}

			trans2consumed.put(t, consumed);
			trans2inhibited.put(t, inhibited);
			trans2produced.put(t, produced);
		}
	}

	@Override
	public void contributeToInitialState(State s) {
		for (Place p : places) {
			if (p.getInitialTokens() > 0 && s.getTokenCount(p) == 0) {
				changeTokenCount(s, p, p.getInitialTokens());
			}

		}
		computeEnabledTransitions(s);
	}

	public void setIgnoreRealtime(boolean ignoreRealtime) {
		this.ignoreRealtime = ignoreRealtime;
	}

	public boolean isIgnoreRealtime() {
		return ignoreRealtime;
	}

	protected Collection<Transition> getTransitions() {
		return transitions;
	}

	public SATFoundation getSatFoundation() {
		return satFoundation;
	}

	protected void consumeAndProduce(Transition t, State s) {
		for (PlaceWeight w : trans2consumed.get(t))
			changeTokenCount(s, w.place, -w.weight);

		computeEnabledTransitions(s);

		for (PlaceWeight w : trans2produced.get(t))
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
			} else {
				if (timed.contains(t))
					s.deconfigureProposition(ModelUtil.atom(t, 0));
			}
		}

		return enabled;
	}

	@SuppressWarnings("unchecked")
	protected List<Transition> computeActivatedTransitions(State s) {
		List<Transition> enabled = computeEnabledTransitions(s);
		if (ignoreRealtime)
			return enabled;
		else
			return (List<Transition>) s
					.getRealTimeEnabledConsumers(Transition.class);
	}

	/**
	 * To be overriden.
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
			for (PlaceWeight wc : trans2consumed.get(t))
				if (wc.place.equals(wp.place))
					c -= wc.weight;
			c += wp.weight;
			if (c > satFoundation.getMaxTokens())
				return false;
		}

		return true;
	}

	protected final void changeTokenCount(State s, Place place, int d) {
		Set<Place> places = mappings.getMappings(place);

		PLACE:for (Place p : places) {
			for (Predicate a : s.getPropositions().toArray()) {
				if (a instanceof TokenAtom
						&& ((TokenAtom) a).getPlace().equals(p)) {
					TokenAtom ta = (TokenAtom) a;
					if (ta.getCount() + d <= 0)
						s.deconfigureProposition(ta);
					else
						s.configureProposition(atom(ta.getPlace(),
								ta.getCount() + d));
					continue PLACE;
				}
			}

			// if no token existed before
			Atom a = atom(p, d);
			s.configureProposition(a);
		}
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
