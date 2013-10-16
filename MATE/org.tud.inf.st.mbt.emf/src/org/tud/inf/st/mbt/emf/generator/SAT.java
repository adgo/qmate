package org.tud.inf.st.mbt.emf.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;
import org.tud.inf.st.mbt.emf.generator.CnfBuilder.CnfIterator;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.rules.Atom;
import org.tud.inf.st.mbt.rules.Not;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.ReasonableAtom;
import org.tud.inf.st.mbt.rules.RulesFactory;

public class SAT {
	private List<Integer> atomHashs;
	private Map<Predicate, Conjunction> pred2Cnf = new HashMap<>();
	private PredicateList base;

	public SAT(PredicateList base) {
		this.base = base;
		atomHashs = new ArrayList<>(base.size());
		atomHashs.add(ModelUtil.hashCode(RulesFactory.eINSTANCE.createTrue()));
		for (Predicate a : base) {
			if (!(a instanceof ReasonableAtom))
				throw new RuntimeException("Reasoning on " + a
						+ " is not supported!");
			atomHashs.add(ModelUtil.hashCode(a));
		}
	}

	private Conjunction cnf(Predicate p) {
		CnfIterator i = CnfBuilder.buildCnf(p);
		Conjunction result = i.getCurrent();
		while (i.hasNext()) {
			result = i.next();
		}
		return result;
	}

	public boolean isSatisfiable(Conjunction c) {
		Conjunction cAndTrue = new Conjunction(c);
		cAndTrue.add(new Clause(RulesFactory.eINSTANCE.createTrue()));
		ISolver solver = SolverFactory.newDefault();
		solver.newVar(atomHashs.size());
		for (Clause cl : cAndTrue) {
			int[] arr = new int[cl.size()];
			int i = 0;
			for (Predicate p : cl) {
				if (p instanceof Not) {
					Atom a = (Atom) ((Not) p).getOperand();
					arr[i] = -(atomHashs.indexOf(ModelUtil.hashCode(a)) + 1);
					if (arr[i] == 0) {
						if (base.contains(a))
							System.out.println("why!");
						throw new RuntimeException(a
								+ " not found in atom base!");
					}
				} else {
					arr[i] = atomHashs.indexOf(ModelUtil.hashCode(p)) + 1;
					if (arr[i] == 0) {
						throw new RuntimeException(p
								+ " not found in atom base!");
					}
				}
				i++;
			}
			try {
				VecInt vec = new VecInt(arr);
				// System.out.println(vec);
				solver.addClause(vec);
			} catch (ContradictionException e) {
				return false;
			}
		}
		try {
			return solver.isSatisfiable();
		} catch (TimeoutException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean isSatisfiable(Predicate p) {
		return isSatisfiable(p, new Conjunction());
	}

	public boolean isSatisfiable(Predicate p, Conjunction appendix) {
		Conjunction c = pred2Cnf.get(p);
		if (c == null) {
			c = cnf(p);
			pred2Cnf.put(p, c);
		}
		Conjunction cl = new Conjunction();
		cl.addAll(c);
		cl.addAll(appendix);
		return isSatisfiable(cl);
	}

	@Override
	public String toString() {
		return base + "";
	}
}
