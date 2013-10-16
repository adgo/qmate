package org.tud.inf.st.mbt.automation;

import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.features.FeatureVersion;
import org.tud.inf.st.mbt.features.IFeature;

public interface ISimulationResponder {
	void setProperty(DataLeaf leaf, DataElement value);
	void elapseRealTime(long realTime);
	void setFeatureActivated(IFeature f, FeatureVersion v, boolean activated);
}
