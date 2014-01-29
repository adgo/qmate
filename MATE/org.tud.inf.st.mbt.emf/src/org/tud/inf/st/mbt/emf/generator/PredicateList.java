package org.tud.inf.st.mbt.emf.generator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.rules.Predicate;

public class PredicateList implements Iterable<Predicate> {

	private List<Predicate> list = new ArrayList<Predicate>();
	private List<Integer> hashs = new ArrayList<>();

	public PredicateList() {
		super();
	}

	public PredicateList(PredicateList pl) {
		for (Predicate p : pl)
			add(p);
	}

	public String toString(PredicateList before) {
		if (before == null)
			return toString();

		PredicateList added = new PredicateList();
		PredicateList removed = new PredicateList();

		for (Predicate p : before)
			if (!this.contains(p))
				removed.add(p);
		for (Predicate p : this)
			if (!before.contains(p))
				added.add(p);

		return "-" + removed + " +" + added;
	}

	public boolean contains(Object o) {
		if (o instanceof Predicate) {
			return hashs.contains(ModelUtil.hashCode((Predicate) o));
		}
		return false;
	}

	@Override
	public String toString() {
		Iterator<Predicate> i = iterator();
		String str = "[";
		while (i.hasNext()) {
			str += "" + i.next();
			if (i.hasNext())
				str += ",";
		}
		return str + "]";
	}

	@Override
	public int hashCode() {
		int hc = Clause.class.hashCode();
		for (Integer h : hashs) {
			hc += h;
		}
		return hc;
	}

	@Override
	public Iterator<Predicate> iterator() {
		return list.iterator();
	}

	public void add(Predicate p) {
		if (!contains(p)) {
			list.add(p);
			hashs.add(ModelUtil.hashCode(p));
		}
	}

	public void addAll(Iterable<? extends Predicate> from) {
		for (Predicate p : from)
			add(p);
	}

	public int size() {
		return list.size();
	}

	public Predicate[] toArray() {
		return list.toArray(new Predicate[0]);
	}

	public Predicate get(int index) {
		return list.get(index);
	}

	public void remove(Predicate p) {
		list.remove(p);
		hashs.remove((Object)ModelUtil.hashCode(p));
	}
}
