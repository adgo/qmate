package org.tud.inf.st.mbt.automation.basic;

import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;

import org.tud.inf.st.mbt.actions.GetFeatureStateAction;
import org.tud.inf.st.mbt.actions.GetPropertyAction;
import org.tud.inf.st.mbt.actions.GetRealTimeAction;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.actions.PostGenerationSequence;
import org.tud.inf.st.mbt.actions.TermAction;
import org.tud.inf.st.mbt.automation.execute.ISimulationResponder;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.features.FeatureVersion;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.featuretree.TreeFeature;

public class RandomAutomation extends ManualAutomation {

	private static Random rand = new Random();
	private static Logger logger = Logger.getLogger(RandomAutomation.class
			.getSimpleName());

	@Override
	public boolean automate(PostGenerationAction action,
			ISimulationResponder responder) {

		logger.info(action + "");

		if (action instanceof GetPropertyAction) {
			DataLeaf leaf = ((GetPropertyAction) action).getProperty();
			DataElement e = leaf.getDomain();
			Set<DataElement> elements = ModelUtil.getAllLeafElements(e);
			DataElement select = elements.toArray(new DataElement[0])[rand
					.nextInt(elements.size())];
			responder.setProperty(leaf, select);

			elapseRealTime(responder);
			return true;
		} else if (action instanceof GetFeatureStateAction) {
			IFeature f = ((GetFeatureStateAction) action).getFeature();
			FeatureVersion v = null;
			boolean activate = rand.nextBoolean();

			if (activate && v instanceof TreeFeature
					&& !((TreeFeature) f).getVersions().isEmpty()) {
				int sel = rand.nextInt(((TreeFeature) f).getVersions().size());
				v = ((TreeFeature) f).getVersions().get(sel);
			}

			responder.setFeatureActivated(
					((GetFeatureStateAction) action).getFeature(), v, activate);

			elapseRealTime(responder);
			return true;
		} else if (action instanceof TermAction) {
			elapseRealTime(responder);
			return true;
		}
		
		return super.automate(action, responder);
	}
}
