package org.tud.inf.st.mbt.emf.ui.modeltree;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

public class MBTComposedAdapterFactory {
	private static ComposedAdapterFactory FACTORY;
	
	public final static ComposedAdapterFactory getFactory(){
		if(FACTORY == null) FACTORY = new ComposedAdapterFactory(getFactoryList());
		return FACTORY;
	}

	private static Collection<AdapterFactory> getFactoryList() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
		return factories;
	}

}
