package org.tud.inf.st.mbt.emf.graphicaleditor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.EObject;

public class EMFGraphicsUtil {
	public static void notifyNull(EObject obj){
		if(obj!=null)obj.eNotify(new NotificationImpl(Notification.SET,null,null));
	}
}
