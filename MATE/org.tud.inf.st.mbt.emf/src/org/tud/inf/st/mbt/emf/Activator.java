package org.tud.inf.st.mbt.emf;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.tud.inf.st.mbt.emf.traversal.PriorityTraversalType;
import org.tud.inf.st.mbt.emf.traversal.RandomTraversalType;
import org.tud.inf.st.mbt.emf.traversal.TraversalManager;

public class Activator implements BundleActivator {

	private static BundleContext context;
	
	private static Activator activator;

	public static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		activator = this;
		
		TraversalManager.getInstance().registerType(new RandomTraversalType());
		TraversalManager.getInstance().registerType(new PriorityTraversalType());
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
	
	public static Activator getDefault() {
		return activator;
	}

}
