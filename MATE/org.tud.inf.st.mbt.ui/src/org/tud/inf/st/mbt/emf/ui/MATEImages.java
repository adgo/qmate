package org.tud.inf.st.mbt.emf.ui;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;

public abstract class MATEImages {
	
	private static final String MATE = "org.tud.inf.st.mbt.ui.";
	public static String TERM = MATE+"term";
	public static String STEP = MATE+"step";
	public static String STEPO = MATE+"stepo";
	public static String CONF = MATE+"conf";	
	public static String DONE = MATE+"done";	
	public static String UNDEF = MATE+"undefined";	
	
	public static void putImage(String key,String source){
		Bundle bundle = Activator.getDefault().getBundle();

        ImageDescriptor myImage = ImageDescriptor.createFromURL(
              FileLocator.find(bundle,
                               new Path(source),
                                        null));
        Activator.getDefault().getImageRegistry().put(key, myImage);
	}
	
	public static Image getImage(String key){
		return Activator.getDefault().getImageRegistry().get(key);
	}

	public static void init() {
		putImage(TERM,"icons/term.png");
		putImage(STEP,"icons/step.png");
		putImage(STEPO,"icons/stepo.png");
		putImage(CONF,"icons/conf.png");		
		putImage(DONE,"icons/done.png");		
		putImage(UNDEF,"icons/undefined.png");		
	}
}
