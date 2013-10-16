package org.tud.inf.st.pceditor.ui;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pccs.provider.PccsItemProviderAdapterFactory;

public class PCCSOutline extends ContentOutlinePage {
	private TreeViewer contentOutlineViewer;
	private AdapterFactory adapterFactory = new PccsItemProviderAdapterFactory();
	private Object input;

	public PCCSOutline(EObject input) {
		this.input = input;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		contentOutlineViewer = getTreeViewer();
		contentOutlineViewer.addSelectionChangedListener(this);

		contentOutlineViewer
				.setContentProvider(new AdapterFactoryContentProvider(
						adapterFactory));

		contentOutlineViewer.setContentProvider(new ITreeContentProvider() {

			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			public void dispose() {
			}

			public Object[] getElements(Object inputElement) {
				return getChildren(inputElement);
			}

			public Object[] getChildren(Object parentElement) {
				if (parentElement instanceof EObject)
					return ((EObject) parentElement).eContents().toArray();
				else if(parentElement instanceof Collection<?>)
					return ((Collection<?>) parentElement).toArray();
				else if(parentElement instanceof ConcreteSyntax[]){
					return Arrays.asList(parentElement).toArray();
				}
				return new Object[0];
			}

			public Object getParent(Object element) {
				if (element instanceof EObject)
					return ((EObject) element).eContainer();
				return null;
			}

			public boolean hasChildren(Object element) {
				return getChildren(element).length > 0;
			}
		});

		contentOutlineViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof EObject) {
					EObject eo = (EObject) element;
					EClass ec = eo.eClass();
					String text = ec.getName();
					if (ec.getEIDAttribute() != null && eo.eGet(ec.getEIDAttribute())!=null) {
						text += " " + eo.eGet(ec.getEIDAttribute());
					}
					return text;
				}
				return element + "";
			}
		});

		contentOutlineViewer.setInput(input);
	}

	public void setInput(Object input) {
		if (this.input == input && contentOutlineViewer != null) {
			contentOutlineViewer.refresh();
		} else {
			this.input = input;
			if (contentOutlineViewer != null) {
				contentOutlineViewer.setInput(input);
			}
		}
		
		if(contentOutlineViewer!=null)contentOutlineViewer.expandToLevel(2);
	}

	public Object getInput() {
		return input;
	}
	
	public TreeViewer getContentOutlineViewer() {
		return contentOutlineViewer;
	}
};