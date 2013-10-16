package org.tud.inf.st.mbt.emf.graphicaleditor.focus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFEditPartFactory;

public class FocusTreeViewer extends TreeViewer {

	private static class FocusContentProvider implements ITreeContentProvider {

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return getChildren(inputElement);
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof FocusNode)
				return ((FocusNode) parentElement).getChildren().toArray();
			else
				return new Object[0];
		}

		@Override
		public Object getParent(Object element) {
			if (element instanceof FocusNode)
				return ((FocusNode) element).getParent();
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			if (element instanceof FocusNode)
				return !((FocusNode) element).getChildren().isEmpty();
			else
				return false;
		}

	}
	
	private static class FocusLabelProvider extends LabelProvider{
		@Override
		public String getText(Object element) {
			return element+"";
		}
	}

	public FocusTreeViewer(Composite parent,final Collection<IFocusableListener> listeners,final EMFEditPartFactory epf) {
		super(parent);
		setLabelProvider(new FocusLabelProvider());
		setContentProvider(new FocusContentProvider());
		addSelectionChangedListener(new ISelectionChangedListener() {			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection ssel = (IStructuredSelection)event.getSelection();
				List<Object> lsel = new ArrayList<>();
				for(Object n:ssel.toArray())lsel.add(""+n);
				for(IFocusableListener l:listeners)
					l.focus(lsel);
				epf.checkMarkers();
			}
		});
	}

}
