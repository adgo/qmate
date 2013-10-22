package org.tud.inf.st.mbt.android;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.tud.inf.st.mbt.automation.AutomationManager;
import org.tud.inf.st.mbt.automation.android.AndroidAutomationType;
import org.tud.inf.st.mbt.automation.android.record.AndroidRecorderBridge;
import org.tud.inf.st.mbt.automation.android.record.AndroidRecorderType;
import org.tud.inf.st.mbt.automation.record.RecorderManager;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.tud.inf.st.mbt.android"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		RecorderManager.registerType(AndroidRecorderType.getInstance());
		AutomationManager.getInstance().registerType(AndroidAutomationType.getInstance());

	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		RecorderManager.terminate();
		AndroidRecorderBridge.terminateADB();
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
