package org.tud.inf.st.mbt.emf.graphicaleditor;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

public class EMFOutlinePage extends ContentOutlinePage {
	private TreeViewer contentOutlineViewer;
	private AdapterFactory adapterFactory;
	private Collection<? extends EObject> input;
	
	public EMFOutlinePage(AdapterFactory af,Collection<? extends EObject> input) {
		this.adapterFactory = af;
		this.input = input;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		contentOutlineViewer = getTreeViewer();
		contentOutlineViewer.addSelectionChangedListener(this);

		// Set up the tree viewer.
		//
		contentOutlineViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		contentOutlineViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		contentOutlineViewer.setInput(input);
	}
}