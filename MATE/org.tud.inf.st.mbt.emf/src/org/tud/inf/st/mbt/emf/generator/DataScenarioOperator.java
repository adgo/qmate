package org.tud.inf.st.mbt.emf.generator;

import static org.tud.inf.st.mbt.emf.util.ModelUtil.atom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.mbt.actions.ActionsFactory;
import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.actions.ThrowAction;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.DataRange;
import org.tud.inf.st.mbt.data.DataScenario;
import org.tud.inf.st.mbt.data.StepDataBinding;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.rules.DataAtom;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RulesFactory;
import org.tud.inf.st.mbt.rules.RulesPackage;
import org.tud.inf.st.mbt.rules.TimeAtom;

public class DataScenarioOperator extends TransitionOperator {
	private static final ActionsFactory fActions = ActionsFactory.eINSTANCE;

	private int ticks = 0;
	private DataScenario scenario;

	public DataScenarioOperator(SATFoundation sf, DataScenario scen, int ticks, boolean ignoreRealTime) {
		super(sf,ignoreRealTime);
		this.scenario = scen;
		this.ticks = ticks;
	}

	@Override
	public State[] operate(State s) {
		List<State> next = new ArrayList<>();
		PredicateList nextPreds = new PredicateList(s.getPropositions());

		PredicateList times = s.findAllPredicates(RulesPackage.eINSTANCE
				.getTimeAtom());
		TimeAtom time = null;
		for (Predicate a : times) {
			if (((TimeAtom) a).getConsumer().equals(scenario)) {
				nextPreds.remove(a);
				time = EcoreUtil.copy((TimeAtom) a);
				time.setTime(time.getTime() % scenario.getLength());
				break;
			}
		}
		if (time == null) {
			time = RulesFactory.eINSTANCE.createTimeAtom();
			time.setConsumer(scenario);
			time.setTime(0);
		}
		{
			State n = new State(s, null, false, new PredicateList(
					s.getPropositions()), s.getTraceableTo());
			n.configureProposition(time);
			next.add(n);
		}
		while (ticks > 0) {
			List<DataAtom> data = getDataAt(scenario, time.getTime());
			for (State n : next) {
				n.configureAll(data);
			}
			time.setTime((time.getTime() + 1) % scenario.getLength());
			ticks--;
		}

		List<State> nextSwap = new ArrayList<>();
		for (State n : next) {
			n.configureProposition(time);
			n.setParent(s);

			List<ThrowAction> eventsToThrow = new ArrayList<ThrowAction>();
			for (DataRange r : scenario.getRanges()) {
				if (r.getEventID() != null) {
					for (DataElement e : r.getValues()) {
						DataElement ee = getStateValueFor(n, r.getLeaf());
						if (ModelUtil.getAllLowerElements(e).contains(ee)) {
							ThrowAction ta = fActions.createThrowAction();
							ta.setEventID(r.getEventID());
							eventsToThrow.add(ta);
						}
					}
				}
			}

			if (eventsToThrow.isEmpty())
				nextSwap.add(n);
			else {
				PreGenerationSequence pgs = fActions
						.createPreGenerationSequence();
				pgs.getActions().addAll(eventsToThrow);
				nextSwap.addAll(getSatFoundation().getActionProcessor().executeAction(scenario,n, pgs,
						new HashMap<String, Object>(), scenario));
			}
		}
		next = nextSwap;
		return next.toArray(new State[0]);
	}

	private static DataElement getStateValueFor(State s, DataLeaf leaf) {
		PredicateList datas = s.findAllPredicates(RulesPackage.eINSTANCE
				.getDataAtom());
		for (Object da : datas) {
			if (((DataAtom) da).getLeaf().equals(leaf))
				return ((DataAtom) da).getValue();
		}
		return null;
	}

	private static List<DataAtom> getDataAt(DataScenario scen, int t) {
		List<DataAtom> data = new ArrayList<DataAtom>(scen.getLength());

		for (StepDataBinding sdb : scen.getStepDataBindings()) {
			if (sdb.getStep() == t) {
				DataAtom a = atom(sdb.getLeaf(), sdb.getValue());
				data.add(a);
			}
		}

		return data;
	}
}
