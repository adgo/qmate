package org.tud.inf.st.mbt.emf.graphicaleditor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class GraphicalEMFEditorActivator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "org.tud.inf.st.mbt.graphicaleditor"; //$NON-NLS-1$

	// The shared instance
	private static GraphicalEMFEditorActivator plugin;

	/**
	 * The constructor
	 */
	public GraphicalEMFEditorActivator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static GraphicalEMFEditorActivator getDefault() {
		return plugin;
	}

}
