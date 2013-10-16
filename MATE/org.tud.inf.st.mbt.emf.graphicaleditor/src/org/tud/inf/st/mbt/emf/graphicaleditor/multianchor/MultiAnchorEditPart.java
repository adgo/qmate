package org.tud.inf.st.mbt.emf.graphicaleditor.multianchor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.AccessibleAnchorProvider;
import org.eclipse.gef.AccessibleEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.requests.DropRequest;
import org.eclipse.swt.accessibility.AccessibleEvent;

public abstract class MultiAnchorEditPart extends AbstractGraphicalEditPart
		implements NodeEditPart, IAdaptable {
	
	private AccessibleEditPart accessibleEditPart;

	protected AccessibleEditPart createAccessible() {
		return new AccessibleGraphicalEditPart() {
			public void getName(AccessibleEvent e) {
				e.result = ""+getModel();
			}
		};
	}
	
	@Override
	protected AccessibleEditPart getAccessibleEditPart() {
		if (accessibleEditPart == null)
			accessibleEditPart = createAccessible();
		return accessibleEditPart;
	}

	@Override
	public RelativeEMFConnectionAnchor getSourceConnectionAnchor(Request request) {
		Object o = getFigure().getAnchorTypeAt(
				new Point(((DropRequest) request).getLocation()),
				AnchorType.SOURCE);
		return getFigure().getAnchorFor(o, AnchorType.SOURCE);
	}

	@Override
	public RelativeEMFConnectionAnchor getTargetConnectionAnchor(Request request) {
		Object o = getFigure().getAnchorTypeAt(
				new Point(((DropRequest) request).getLocation()),
				AnchorType.TARGET);
		return getFigure().getAnchorFor(o, AnchorType.TARGET);
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class key) {
		if (key == AccessibleAnchorProvider.class)
			return new DefaultAccessibleAnchorProvider() {
				@Override
				public List<?> getSourceAnchorLocations() {
					List<Point> list = new ArrayList<>();
					for (ConnectionAnchor a : getFigure().getAnchors(
							AnchorType.SOURCE)) {
						list.add(a.getReferencePoint());
					}
					return list;
				}

				@Override
				public List<?> getTargetAnchorLocations() {
					List<Point> list = new ArrayList<>();
					for (ConnectionAnchor a : getFigure().getAnchors(
							AnchorType.TARGET)) {
						list.add(a.getReferencePoint());
					}
					return list;
				}
			};
		return super.getAdapter(key);
	}

	@Override
	public MultiAnchorNodeFigure getFigure() {
		return (MultiAnchorNodeFigure) super.getFigure();
	}

}
