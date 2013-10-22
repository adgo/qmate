package org.tud.inf.st.mbt.automation.record;

import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.graphics.Image;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory;

public abstract class AbstractRecorderListener {

	private IPath imgFolder;
	private GuiGraph graph = GuigraphFactory.eINSTANCE.createGuiGraph();

	public AbstractRecorderListener(GuiGraph graph, IPath imgFolder) {
		this.imgFolder = imgFolder;
		this.graph = graph;
	}

	public void updateModel() {

	}
	
	public void updateEventActionsText(String eat){
		
	}
	
	public void updateValidationActionsText(String vat){
		
	}
	
	public void updateSimilarStatesList(List<? extends UIState> states){
		
	}

	public void terminate() {
	}

	public IPath getImgFolder() {
		return imgFolder;
	}
	
	public GuiGraph getGraph() {
		return graph;
	}
	
	public void updateScreen(final Image img) {
	}
}
