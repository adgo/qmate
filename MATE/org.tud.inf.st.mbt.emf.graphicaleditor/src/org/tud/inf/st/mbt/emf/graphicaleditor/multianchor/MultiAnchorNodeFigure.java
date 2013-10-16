package org.tud.inf.st.mbt.emf.graphicaleditor.multianchor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.geometry.Point;

public abstract class MultiAnchorNodeFigure extends Figure {
	private Map<Object, RelativeEMFConnectionAnchor> sourceAnchors = new HashMap<Object, RelativeEMFConnectionAnchor>();
	private Map<Object, RelativeEMFConnectionAnchor> targetAnchors = new HashMap<Object, RelativeEMFConnectionAnchor>();

	public Object getAnchorTypeAt(Point p, AnchorType t) {
		double min = Long.MAX_VALUE;
		Object closest = null;

		Collection<Entry<Object, RelativeEMFConnectionAnchor>> c = null;
		if (t.equals(AnchorType.SOURCE)) {
			c = sourceAnchors.entrySet();
		} else if (t.equals(AnchorType.TARGET)) {
			c = targetAnchors.entrySet();
		} else {
			c = new ArrayList<>(sourceAnchors.entrySet());
			c.addAll(targetAnchors.entrySet());
		}

		for (Entry<Object, RelativeEMFConnectionAnchor> e : c) {
			double dist = e.getValue().getLocation(null).getDistance(p);
			dist = dist * dist;

			if (dist < min) {
				min = dist;
				closest = e.getKey();
			}
		}

		return closest;
	}

	public RelativeEMFConnectionAnchor getAnchorFor(Object o, AnchorType t) {
		if (t.equals(AnchorType.SOURCE) || t.equals(AnchorType.BOTH)) {
			if (sourceAnchors.containsKey(o))
				return sourceAnchors.get(o);
		}
		if (t.equals(AnchorType.TARGET) || t.equals(AnchorType.BOTH)) {
			if (targetAnchors.containsKey(o))
				return targetAnchors.get(o);
		}
		return null;
	}

	public Set<RelativeEMFConnectionAnchor> getAnchors(AnchorType t) {
		Set<RelativeEMFConnectionAnchor> anchors = new HashSet<>();

		if (t.equals(AnchorType.SOURCE) || t.equals(AnchorType.BOTH)) {
			anchors.addAll(sourceAnchors.values());
		}
		if (t.equals(AnchorType.TARGET) || t.equals(AnchorType.BOTH)) {
			anchors.addAll(targetAnchors.values());
		}

		return anchors;
	}

	public void addAnchor(RelativeEMFConnectionAnchor a, AnchorType t) {
		switch (t) {
		case SOURCE:
			sourceAnchors.put(a.getModel(), a);
			break;
		case TARGET:
			targetAnchors.put(a.getModel(), a);
			break;
		default: {
			sourceAnchors.put(a.getModel(), a);
			targetAnchors.put(a.getModel(), a);
		}
		}
	}
}
