package org.tud.inf.st.pceditor.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;
import org.tud.inf.st.pceditor.exceptions.InterpretationException;
import org.tud.inf.st.pceditor.interpreter.Util;

public class DSLEditor extends PCEditor {
	@Override
	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);

		composite.setLayout(new GridLayout(4, false));

		super.createPartControl(composite);

		for (Control c : composite.getChildren())
			c.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1));

		Label l = new Label(composite, SWT.NONE);
		l.setText("Syntax definition:");
		l.setLayoutData(new GridData(SWT.FILL, SWT.NONE, false, false));
		final Label path = new Label(composite, SWT.None);
		path.setText("                                                         ");
		path.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));

		Button b = new Button(composite, SWT.NONE);
		b.setText("Browse syntax...");
		b.setLayoutData(new GridData(SWT.FILL, SWT.NONE, false, false));

		b.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
						path.getShell(), new WorkbenchLabelProvider(),
						new BaseWorkbenchContentProvider());

				dialog.setTitle("Syntax");

				dialog.setMessage("Select file from workspace:");

				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

				if (dialog.open() == Window.OK) {
					IFile result = (IFile) dialog.getFirstResult();
					path.setText(result.getName());
					try {
						PCCSResourceSetImpl rs = new PCCSResourceSetImpl();
						rs.getResource(
								URI.createURI(result.getFullPath().toString()),
								true);

						rs.resolveImports();
						rs.computeReferenceErrors();						
						
						renewContentSyntax(Util.filterConcreteSyntax(rs));

						runParser(getDocumentProvider().getDocument(
								getEditorInput()).get());
					} catch (InterpretationException e1) {
						e1.printStackTrace();
					}
					refreshSourceViewerConfiguration();
				}

			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		final Button bl = new Button(composite, SWT.NONE);
		bl.setText("Load additional resources...");
		bl.setLayoutData(new GridData(SWT.FILL, SWT.NONE, false, false));
		bl.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				LoadModelResourceDialog dialog = new LoadModelResourceDialog(
						Display.getCurrent().getActiveShell(),
						getContentResource().getResourceSet());
				dialog.open();
				runParser(getDocumentProvider().getDocument(getEditorInput())
						.get());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}
}
