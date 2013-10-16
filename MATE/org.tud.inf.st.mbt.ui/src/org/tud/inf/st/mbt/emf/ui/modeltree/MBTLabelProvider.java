package org.tud.inf.st.mbt.emf.ui.modeltree;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

public class MBTLabelProvider extends AdapterFactoryLabelProvider{
	public MBTLabelProvider() {
		super(MBTComposedAdapterFactory.getFactory());
	}
}