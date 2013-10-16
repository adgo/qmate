package org.tud.inf.st.mbt.emf.graphicaleditor;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.tud.inf.st.mbt.graphical.Bendpoint;
import org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition;
import org.tud.inf.st.mbt.graphical.GraphicalDescription;
import org.tud.inf.st.mbt.graphical.GraphicalFactory;
import org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition;

public abstract class EMFGraphics {
	private GraphicalDescription graphicalDescription;
	private EMFTextProvider textProvider;
	private EMFModelIndex index;

	public EMFGraphics(GraphicalDescription graphicalDescription,
			EMFTextProvider textProvider) {
		if (graphicalDescription == null)
			graphicalDescription = GraphicalFactory.eINSTANCE
					.createGraphicalDescription();
		this.graphicalDescription = graphicalDescription;
		this.textProvider = textProvider;
	}

	public EMFTextProvider getTextProvider() {
		return textProvider;
	}

	public void addGraphNodeChangeAdapter(EObject eo, Adapter a) {
		getGraphicalNodeDefinition(eo).eAdapters().add(a);
	}

	public void addGraphEdgeChangeAdapter(EObject eo, Adapter a) {
		getGraphicalConnectionDefinition(eo).eAdapters().add(a);
	}

	public void setObjectConstraint(EObject eObject, Rectangle constraint) {
		GraphicalNodeDefinition gnd = getGraphicalNodeDefinition(eObject);
		gnd.setX(constraint.x);
		gnd.setY(constraint.y);
		gnd.setWidth(constraint.width);
		gnd.setHeight(constraint.height);
	}

	public Rectangle getObjectConstraint(EObject eObject) {
		GraphicalNodeDefinition gnd = getGraphicalNodeDefinition(eObject);
		return new Rectangle(gnd.getX(), gnd.getY(), gnd.getWidth(),
				gnd.getHeight());
	}

	public Rectangle getAbsoluteObjectConstraint(EObject eObject) {
		EObject container = eObject.eContainer();
		if (container == null)
			return new Rectangle(new Point(0, 0), getObjectConstraint(eObject)
					.getSize());
		else {
			Point location = getAbsoluteObjectConstraint(container)
					.getTranslated(getObjectConstraint(eObject).getLocation())
					.getLocation();
			return new Rectangle(location, getObjectConstraint(eObject)
					.getSize());
		}
	}

	public void deleteObjectConstraint(EObject eObject) {
		GraphicalNodeDefinition gnd = getGraphicalNodeDefinition(eObject);
		graphicalDescription.getNodes().remove(gnd);
	}

	@SuppressWarnings("unchecked")
	private GraphicalNodeDefinition getGraphicalNodeDefinition(EObject eObject) {
		String idx = getIndex().getIdByObject(eObject);
		for (Object obj : graphicalDescription.getNodes()) {
			GraphicalNodeDefinition gnd = (GraphicalNodeDefinition) obj;
			if (gnd.getReferenceId().equals(idx))
				return gnd;
		}

		GraphicalNodeDefinition gnd = GraphicalFactory.eINSTANCE
				.createGraphicalNodeDefinition();
		gnd.setWidth(0);
		gnd.setHeight(0);
		gnd.setX(0);
		gnd.setY(0);
		gnd.setReferenceId(idx);
		graphicalDescription.getNodes().add(gnd);

		return gnd;
	}

	@SuppressWarnings("unchecked")
	public void addBendpoint(EObject conn, int idx, Point location) {
		Bendpoint bp = GraphicalFactory.eINSTANCE.createBendpoint();
		bp.setIndex(idx);
		bp.setX(location.x);
		bp.setY(location.y);

		for (Object o2 : getGraphicalConnectionDefinition(conn).getBendpoints()) {
			if (((Bendpoint) o2).getIndex() >= idx)
				((Bendpoint) o2).setIndex(((Bendpoint) o2).getIndex() + 1);
		}

		getGraphicalConnectionDefinition(conn).getBendpoints().add(bp);
	}

	public void deleteBendpoint(EObject conn, int idx) {
		for (Object o : getGraphicalConnectionDefinition(conn).getBendpoints()) {
			if (((Bendpoint) o).getIndex() == idx) {
				getGraphicalConnectionDefinition(conn).getBendpoints()
						.remove(o);
				for (Object o2 : getGraphicalConnectionDefinition(conn)
						.getBendpoints()) {
					if (((Bendpoint) o2).getIndex() > idx)
						((Bendpoint) o2)
								.setIndex(((Bendpoint) o2).getIndex() - 1);
				}
				break;
			}
		}
	}

	public Bendpoint getBendpoint(EObject conn, int idx) {
		for (Object o : getGraphicalConnectionDefinition(conn).getBendpoints()) {
			if (((Bendpoint) o).getIndex() == idx)
				return (Bendpoint) o;
		}
		return null;
	}

	public Point[] getOrderedBendpoints(EObject conn) {
		SortedSet<Bendpoint> sorted = new TreeSet<Bendpoint>(
				new Comparator<Bendpoint>() {
					public int compare(Bendpoint o1, Bendpoint o2) {
						return Integer.compare(o1.getIndex(), o2.getIndex());
					};
				});

		for (Object o : getGraphicalConnectionDefinition(conn).getBendpoints())
			sorted.add((Bendpoint) o);

		Point[] result = new Point[sorted.size()];
		int idx = 0;
		for (Bendpoint b : sorted) {
			result[idx] = new Point(b.getX(), b.getY());
			idx++;
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private GraphicalConnectionDefinition getGraphicalConnectionDefinition(
			EObject eObject) {
		String idx = getIndex().getIdByObject(eObject);
		for (Object obj : graphicalDescription.getConnections()) {
			GraphicalConnectionDefinition gcd = (GraphicalConnectionDefinition) obj;
			if (gcd.getReferenceId().equals(idx))
				return gcd;
		}

		GraphicalConnectionDefinition gcd = GraphicalFactory.eINSTANCE
				.createGraphicalConnectionDefinition();
		gcd.setReferenceId(idx);
		graphicalDescription.getConnections().add(gcd);

		return gcd;
	}

	public void cleanup() {
		for (Object gnd : graphicalDescription.getNodes().toArray()) {
			if (getIndex().getObectById(
					((GraphicalNodeDefinition) gnd).getReferenceId()) == null)
				graphicalDescription.getNodes().remove(gnd);
		}
		for (Object gcd : graphicalDescription.getConnections().toArray()) {
			if (getIndex().getObectById(
					((GraphicalConnectionDefinition) gcd).getReferenceId()) == null)
				graphicalDescription.getConnections().remove(gcd);
		}
	}

	private EMFModelIndex getIndex() {
		if (index == null)
			index = createIndex();
		return index;
	}

	public abstract Dimension getStandardDimension(EClass type);

	protected abstract EMFModelIndex createIndex();
}
