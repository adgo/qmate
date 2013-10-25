package org.tud.inf.st.mbt.emf.ui.dialogs;

import java.util.Random;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.tud.inf.st.mbt.emf.ui.Activator;

public class ExportReportDialog extends TitleAreaDialog {

	private Button btnNew, btnAppend;
	private String targetFile = null;

	public ExportReportDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;

		parent.setLayout(layout);

		setTitle("Export Test Report");

		final Button chkNewFile = new Button(parent, SWT.RADIO);
		chkNewFile.setText("create new report file in container");
		chkNewFile.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (chkNewFile.getSelection()) {
					btnNew.setEnabled(true);
					btnAppend.setEnabled(false);
				}
			}
		});
		chkNewFile.setSelection(true);

		btnNew = new Button(parent, SWT.NONE);
		btnNew.setText("Browse...");
		btnNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ContainerSelectionDialog dialog = new ContainerSelectionDialog(
						getShell(), null, false,
						"Select a container for your report");
				dialog.setTitle("Container Selection");
				if(dialog.open() == Window.OK){
					IPath cont = (IPath) dialog.getResult()[0];
					targetFile = cont+"/report_"+Math.abs(new Random().nextInt())+".report";
					btnNew.setText("Browse... | "+targetFile);
				}
			}
		});
		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		final Button chkAppend = new Button(parent, SWT.RADIO);
		chkAppend.setText("append to existing model file");
		chkAppend.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (chkAppend.getSelection()) {
					btnNew.setEnabled(false);
					btnAppend.setEnabled(true);
				}
			}
		});
		chkAppend.setSelection(false);

		btnAppend = new Button(parent, SWT.NONE);
		btnAppend.setText("Browse...");
		btnAppend.setEnabled(false);
		btnAppend.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
						getShell(), new WorkbenchLabelProvider(),
						new BaseWorkbenchContentProvider());
				dialog.setAllowMultiple(false);
				dialog.setValidator(new ISelectionStatusValidator() {

					@Override
					public IStatus validate(Object[] selection) {
						boolean ok = selection != null && selection.length == 1
								&& selection[0] instanceof IFile;
						return ok ? Status.OK_STATUS : new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Please select a file!");
					}
				});
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				if (dialog.open() == Window.OK) {
					targetFile = ((IFile) dialog.getFirstResult())
							.getFullPath() + "";
					btnAppend.setText("Browse... | " + targetFile);
				}
			}
		});
		btnAppend.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		
		return parent;
	}

	@Override
	protected void okPressed() {
		if (targetFile != null)
			super.okPressed();
		else
			setErrorMessage("Please select a file!");
	}

	public String getTargetFile() {
		return targetFile;
	}

}
