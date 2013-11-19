package org.tud.inf.st.mbt.emf.generator;

import static org.tud.inf.st.mbt.emf.util.ModelUtil.getAllEObjectsOfSuperType;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.data.DataScenario;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;
import org.tud.inf.st.mbt.ulang.guigraph.TimerTransition;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;

public class TimerOperator extends TransitionOperator {

	public TimerOperator(SATFoundation sf, boolean ignoreRealTime) {
		super(sf,ignoreRealTime);
	}

	@SuppressWarnings("unchecked")
	@Override
	public State[] operate(State s) {
		List<State> next = new LinkedList<>();
		if (s.isTopInstructionSequenceFinishing())
			return next.toArray(new State[0]);

		List<Transition> activated = computeActivatedTransitions(s);

		for (Transition t : activated)
			if (t instanceof TimerTransition) {
				TimerTransition tt = (TimerTransition) t;

				List<State> nextLocal = new LinkedList<>();

				if (tt.getConsumer() == null) {
					List<OperationalConfigurationModel> ocms = (List<OperationalConfigurationModel>) getAllEObjectsOfSuperType(
							getSatFoundation().getResourceSet(),
							OperationalConfigurationModel.class);
					for (OperationalConfigurationModel ocm : ocms)
						nextLocal.addAll(Arrays.asList(new OCMOperator(
								getSatFoundation(), ocm, tt.getDuration(),isIgnoreRealtime())
								.operate(s)));
					List<DataScenario> dss = (List<DataScenario>) getAllEObjectsOfSuperType(
							getSatFoundation().getResourceSet(),
							DataScenario.class);
					for (DataScenario ds : dss)
						nextLocal.addAll(Arrays
								.asList(new DataScenarioOperator(
										getSatFoundation(), ds, tt
												.getDuration(),isIgnoreRealtime()).operate(s)));
					if (ocms.isEmpty() && dss.isEmpty())
						nextLocal.add(new State(s, Collections
								.<PostGenerationAction> emptyList(), tt
								.isTerminates(), new PredicateList(s
								.getPropositions()), tt));
				} else if (tt.getConsumer() instanceof OperationalConfigurationModel) {
					nextLocal.addAll(Arrays.asList(new OCMOperator(
							getSatFoundation(),
							(OperationalConfigurationModel) tt.getConsumer(),
							tt.getDuration(),isIgnoreRealtime()).operate(s)));
				} else if (tt.getConsumer() instanceof DataScenario) {
					nextLocal.addAll(Arrays.asList(new DataScenarioOperator(
							getSatFoundation(),
							(DataScenario) tt.getConsumer(), tt.getDuration(),isIgnoreRealtime())
							.operate(s)));
				}

				for (State n : nextLocal) {
					consumeAndProduce(tt, n, null);//TODO instance
					n.setTerminating(tt.isTerminates());
					n.setPriority(tt.getFaultImpact()
							* tt.getFaultProbability() * tt.getRate());
				}
				
				tt.setRate(Math.max(tt.getRate() - 1, 0));

				next.addAll(nextLocal);
			}

		return next.toArray(new State[0]);
	}

}
