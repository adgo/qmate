package org.tud.inf.st.mbt.emf.ui;

import org.eclipse.core.runtime.Platform;

public interface MBTConstants {
	public static final String PRODUCT_MOBILE = "org.tud.inf.st.mbt.ui.mobile";
	public static final String PRODUCT_ADAPTIVE = "org.tud.inf.st.mbt.ui.adaptive";
	
	public static final boolean IS_MOBILE = Platform.getProduct().getId().equals(PRODUCT_MOBILE);
	public static final boolean USE_VARIABILITY = true;//!Platform.getProduct().getId().equals(PRODUCT_MOBILE);
	public static final boolean USE_REALTIME = false && !Platform.getProduct().getId().equals(PRODUCT_MOBILE);

			
}
