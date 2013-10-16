package org.tud.inf.st.mbt.emf.generator;

import org.tud.inf.st.mbt.rules.Not;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.True;

public class Clause extends PredicateList {

	public Clause() {
		super();
	}

	public Clause(Clause clause) {
		super(clause);
	}

	public Clause(Predicate... predicates) {
		super();
		for (Predicate p : predicates)
			add(p);
	}

	public void reduce() {
		if (size() > 1) {
			for (Predicate p : this.toArray()) {
				if (p instanceof Not && ((Not) p).getOperand() instanceof True)
					remove(p);
			}
		}
	}

	public Clause without(Predicate pred) {
		Clause out = new Clause(this);
		out.remove(pred);
		return out;
	}

	@Override
	public boolean equals(Object o) {
		return o != null && o instanceof Clause
				&& o.hashCode() == this.hashCode();
	}
}
