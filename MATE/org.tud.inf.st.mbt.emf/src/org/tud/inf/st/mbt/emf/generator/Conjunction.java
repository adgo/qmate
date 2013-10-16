package org.tud.inf.st.mbt.emf.generator;

import java.util.LinkedList;

import org.tud.inf.st.mbt.rules.True;

public class Conjunction extends LinkedList<Clause> {

	private static final long serialVersionUID = -86432938714062992L;

	public Conjunction() {
		super();
	}

	public Conjunction(Conjunction conjunction) {
		super(conjunction);
	}

	public Conjunction concat(Conjunction o) {
		Conjunction out = new Conjunction(this);
		out.addAll(o);
		return out;
	}

	public void reduce() {
		for (Clause c : this.toArray(new Clause[0])) {
			c.reduce();
			if (c.size() == 1 && c.get(0) instanceof True)
				this.remove(c);
		}
	}

	@Override
	public boolean equals(Object o) {
		return o != null && o instanceof Conjunction
				&& o.hashCode() == this.hashCode();
	}

	@Override
	public int hashCode() {
		int hc = Conjunction.class.hashCode();
		for (Clause c : this)
			hc += c.hashCode();
		return hc;
	}
}
