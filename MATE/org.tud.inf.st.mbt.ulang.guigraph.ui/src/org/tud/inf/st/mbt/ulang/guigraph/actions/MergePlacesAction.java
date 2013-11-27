package org.tud.inf.st.mbt.ulang.guigraph.actions;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IWorkbenchPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFSelectionAction;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.ulang.guigraph.Form;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode;
import org.tud.inf.st.mbt.ulang.guigraph.Place;
import org.tud.inf.st.mbt.ulang.guigraph.commands.MergePlacesCommand;

public class MergePlacesAction extends EMFSelectionAction {
	public static final String ID = "org.tud.inf.st.mbt.ulang.guigraph.actions.mergeplaces";

	public MergePlacesAction(IWorkbenchPart part) {
		super(part);
		setId(ID);
		setText("Merge places");
	}

	@Override
	protected boolean calculateEnabled() {
		return getSelectedPlaces().size() > 0;
	}

	private List<Place> getSelectedPlaces() {
		List<Place> places = new LinkedList<>();
		for (EObject eo : getEMFSelection()) {
			if (eo instanceof NoWidgetNode)
				places.add((Place) eo);
			else if (eo instanceof Form) {
				places.add(0, (Place) eo);
			}
		}
		return places;
	}

	@Override
	public void run() {
		GraphicalEMFEditor ged = (GraphicalEMFEditor) getWorkbenchPart();
		ged.executeCommand(new MergePlacesCommand((GuiGraph) ged.getGraph(),getSelectedPlaces()));
	}

}
