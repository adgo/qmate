package org.tud.inf.st.mbt.emf.graphicaleditor.basics;

import org.eclipse.core.resources.IMarker;

public interface Markable{
	void clearMarkers();
	void addMarker(IMarker marker);
}
