package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.BasicNodeEditPart;

public abstract class PlaceEditPart extends BasicNodeEditPart{

	private int simulationTokens = GUIGraphEditor.NOSIM;
	
	public PlaceEditPart(EObject model, EMFGraphics graphics,
			IResource loadedResource) {
		super(model, graphics, loadedResource);
	}

	public void setSimulationTokens(int simulationTokens) {
		this.simulationTokens = simulationTokens;
		refreshVisuals();
	}
	
	public int getSimulationTokens() {
		return simulationTokens;
	}
}
