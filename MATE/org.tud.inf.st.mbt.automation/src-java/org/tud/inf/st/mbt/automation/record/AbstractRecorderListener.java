package org.tud.inf.st.mbt.automation.record;

import java.util.List;

import org.eclipse.swt.graphics.Image;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory;

public abstract class AbstractRecorderListener {

	private String imgFolder;
	private String relativeImgFolder;
	private GuiGraph graph = GuigraphFactory.eINSTANCE.createGuiGraph();

	public AbstractRecorderListener(GuiGraph graph, String imgFolder,
			String relativeImgFolder) {
		this.imgFolder = imgFolder;
		this.relativeImgFolder = relativeImgFolder;
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

	public String getImgFolder() {
		return imgFolder;
	}

	public String getRelativeImgFolder() {
		return relativeImgFolder;
	}
	
	public GuiGraph getGraph() {
		return graph;
	}
	
	public void updateScreen(final Image img) {
	}
}
