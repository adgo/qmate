package org.tud.inf.st.mbt.emf.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.data.DataBag;
import org.tud.inf.st.mbt.data.DataBinding;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.DataStructure;
import org.tud.inf.st.mbt.data.DataStructureNode;
import org.tud.inf.st.mbt.emf.util.FunctionProcessor.Data;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.rules.DataAtom;

public class SetDataOperator extends AbstractOperator {
	private Data data;
	private DataStructureNode node;

	public SetDataOperator(DataStructureNode node, Data data) {
		this.data = data;
		this.node = node;
	}

	@Override
	public State[] operate(State s) {
		PredicateList nextProps = new PredicateList(s.getPropositions());

		// create state for each possible new value
		List<State> next = new LinkedList<>();

		List<DataAtom> input = new LinkedList<DataAtom>();
		for (DataBinding db : data.getBindings())
			input.add(ModelUtil.atom(
					getEquivalentLeaf(data.getNode(), db.getLeaf(), node),
					db.getValue()));

		List<List<DataAtom>> combination = combineData(input);

		for (List<DataAtom> lda : combination) {
			State n = new State(s,
					Collections.<PostGenerationAction> emptyList(), false,
					new PredicateList(nextProps));

			n.configureAll(lda);

			next.add(n);
		}
		return next.toArray(new State[0]);
	}

	private static DataLeaf getEquivalentLeaf(DataStructureNode asIn,
			DataLeaf asLeaf, DataStructureNode in) {
		if (in instanceof DataLeaf && asLeaf == asIn)
			return (DataLeaf) in;

		if (asIn instanceof DataBag)
			((DataBag) asIn).organize();
		if (in instanceof DataBag)
			((DataBag) in).organize();

		DataStructureNode next = asLeaf;
		while (next.eContainer() != asIn)
			next = (DataStructureNode) next.eContainer();

		EList<DataStructureNode> children = in instanceof DataBag ? ((DataBag) in)
				.getGeneratedElements() : ((DataStructure) in).getChildren();

		DataStructureNode equivalentNext = null;

		for (DataStructureNode c : children)
			if (c.getId().equals(next.getId())) {
				equivalentNext = c;
				break;
			}

		return getEquivalentLeaf(next, asLeaf, equivalentNext);
	}

	private List<List<DataAtom>> combineData(List<DataAtom> input) {
		if (input.isEmpty())
			return new ArrayList<List<DataAtom>>(1);

		DataAtom select = input.get(0);
		Set<DataElement> leafs = ModelUtil
				.getAllLeafElements(select.getValue());
		List<List<DataAtom>> result = new ArrayList<List<DataAtom>>();
		
		List<DataAtom> tail = new LinkedList<DataAtom>(input);
		tail.remove(0);
		List<List<DataAtom>> tailResult = combineData(tail);

		if(tailResult.isEmpty()){
			tailResult.add(new ArrayList<DataAtom>(1));
		}
		
		for (DataElement l : leafs) {
			DataAtom selectAtom = ModelUtil.atom(select.getLeaf(), l);
			for(List<DataAtom> tr:tailResult){
				List<DataAtom> r = new ArrayList<>(tr);
				r.add(selectAtom);
				result.add(r);
			}
		}

		return result;
	}

}
