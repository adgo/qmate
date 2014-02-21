package org.tud.inf.st.mbt.emf.ui.modeltree;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

public class MBTContentProvider extends AdapterFactoryContentProvider{

	public MBTContentProvider() {
		super(MBTComposedAdapterFactory.getFactory());
	}

	public Object[] getChildren(Object parentElement) 
	{
	    if (parentElement instanceof IFile)
	    {
	        String path = ((IFile)parentElement).getFullPath().toString();
	        URI uri = URI.createPlatformResourceURI(path, true);
	        parentElement = new ResourceSetImpl().getResource(uri, true);
	    }
	    return super.getChildren(parentElement);
	}
	
	@Override
	public boolean hasChildren(Object object) {
		if (object instanceof IFile)
	        return true;
	    return super.hasChildren(object);
	}
	
	@Override
	public Object getParent(Object object) {
		if (object instanceof IFile)
	        return ((IResource)object).getParent();
	    return super.getParent(object);
	}
}
