package org.tud.inf.st.mbt.ulang.guigraph.actions;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class GUIGraphSettingsPage extends Composite {

	private ListViewer listImports;
	private List<String> input;

	public GUIGraphSettingsPage(Composite parent, List<String> input) {
		super(parent, SWT.NONE);
		this.input = input;
		createContents();
	}

	private void createContents() {
		GridLayout gl = new GridLayout();
		gl.numColumns = 2;
		this.setLayout(gl);

		createImportComposite();
	}

	private void createImportComposite() {
		Composite c = new Composite(this, SWT.NONE);
		GridLayout gl = new GridLayout();
		gl.numColumns = 2;
		c.setLayout(gl);
		c.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Label l = new Label(c, SWT.NONE);
		l.setText("Imports:");
		l.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

		listImports = new ListViewer(c);
		listImports.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
		listImports.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				return element+"";				
			}
		});
		listImports.setContentProvider(new IStructuredContentProvider() {
			
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}
			
			public void dispose() {
			}
			
			@SuppressWarnings("unchecked")
			public Object[] getElements(Object inputElement) {
				return ((Collection<String>)inputElement).toArray();
			}
		});
		listImports.setInput(input);

		Button b = new Button(c, SWT.NONE);
		b.setText("Add...");
		b.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		b.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				CheckedTreeSelectionDialog dialog = new CheckedTreeSelectionDialog(
						GUIGraphSettingsPage.this.getShell(),
						new WorkbenchLabelProvider(),
						new BaseWorkbenchContentProvider());

				dialog.setTitle("Import Selection");

				dialog.setMessage("Select files from workspace:");

				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

				dialog.setContainerMode(true);

				if (dialog.open() == Window.OK) {
					for (Object o : dialog.getResult()) {
						if(o instanceof org.eclipse.core.resources.IContainer)continue;
						IResource r = (IResource)o;
						String imp = r.getFullPath().toString();
												
						input.add(imp);
					}
					listImports.setInput(input);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		b = new Button(c, SWT.NONE);
		b.setText("Remove selected imports");
		b.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		b.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection sel = (IStructuredSelection) listImports.getSelection();
				for(Object o:sel.toArray())input.remove(o);
				
				listImports.setInput(input);
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}
	
	public List<String> getResult(){
		return input;
	}
}
