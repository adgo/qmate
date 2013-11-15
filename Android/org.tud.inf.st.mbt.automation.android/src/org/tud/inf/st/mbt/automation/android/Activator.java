package org.tud.inf.st.mbt.automation.android;

import java.io.IOException;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.tud.inf.st.mbt.automation.ConnectorManager;
import org.tud.inf.st.mbt.automation.android.execute.AndroidSimulationAutomationType;
import org.tud.inf.st.mbt.automation.android.record.AndroidRecorderType;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		ConnectorManager.getInstance().registerType(AndroidRecorderType.getInstance());
		ConnectorManager.getInstance().registerType(AndroidSimulationAutomationType.getInstance());
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		
		try {
			System.err.println("Destroying adb...");
			if (System.getProperty("os.name").toLowerCase()
					.indexOf("windows") > -1)
				Runtime.getRuntime()
						.exec("taskkill /F /IM adb.exe");
			else
				Runtime.getRuntime().exec("killall -9 adb");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
