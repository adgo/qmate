package org.tud.inf.st.mbt.automation.record;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.swt.graphics.Image;
import org.tud.inf.st.mbt.ulang.guigraph.Form;
import org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode;
import org.tud.inf.st.mbt.ulang.guigraph.Place;

public class UIState implements Cloneable{

	private Form screenNode;
	private List<NoWidgetNode> noScreenNodes = new ArrayList<NoWidgetNode>(1);
	private Image img;

	public UIState(Form screenNode, NoWidgetNode... noScreenNodes) {
		this.screenNode = screenNode;
		this.noScreenNodes.addAll(Arrays.asList(noScreenNodes));
	}
	
	public List<Place> getAllPlaces() {
		List<Place> places = new ArrayList<Place>(noScreenNodes.size() + 1);
		if(screenNode!=null)places.add(screenNode);
		places.addAll(noScreenNodes);
		return places;
	}

	public Form getScreenNode() {
		return screenNode;
	}

	public void setScreenNode(Form screenNode) {
		this.screenNode = screenNode;
	}

	public List<NoWidgetNode> getNoScreenNodes() {
		return noScreenNodes;
	}

	public void setNoScreenNodes(List<NoWidgetNode> noScreenNodes) {
		this.noScreenNodes = noScreenNodes;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	
	@Override
	public int hashCode() {
		int hc = UIState.class.hashCode();
		for(Place p:getAllPlaces())hc += p.hashCode();
		return hc;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof UIState
				&& ((UIState) obj).getAllPlaces().containsAll(getAllPlaces())
				&& getAllPlaces().containsAll(((UIState) obj).getAllPlaces());
	}
	
	@Override
	public UIState clone() throws CloneNotSupportedException {
		UIState clone = new UIState(screenNode, noScreenNodes.toArray(new NoWidgetNode[0]));
		clone.setImg(img);
		return clone;
	}

}
