package org.tud.inf.st.mbt.emf.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.viewers.IStructuredContentProvider;
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
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.tud.inf.st.mbt.emf.postprocess.PostProcessorManager;
import org.tud.inf.st.mbt.emf.util.Importer;

public class LoadModelResourceDialog extends TrayDialog {

	private ResourceSet rs;
	private LMRDialogPage page;

	public LoadModelResourceDialog(Shell shell, ResourceSet rs) {
		super(shell);
		setShellStyle(getShellStyle() | SWT.RESIZE);
		this.rs = rs;
	}

	public Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new GridLayout(1, true));
		page = new LMRDialogPage(composite);
		page.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		return composite;
	}

	private class LMRDialogPage extends Composite {

		public LMRDialogPage(Composite parent) {
			super(parent, SWT.NONE);
			createContents();
		}

		private void createContents() {
			GridLayout gl = new GridLayout();
			gl.numColumns = 2;
			this.setLayout(gl);

			createListComposite();
		}

		private void createListComposite() {
			Composite c = new Composite(this, SWT.NONE);
			GridLayout gl = new GridLayout();
			gl.numColumns = 2;
			c.setLayout(gl);
			c.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

			Label l = new Label(c, SWT.NONE);
			l.setText("Referenced model resources:");
			l.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1,
					1));

			final ListViewer listImports = new ListViewer(c);
			listImports.getControl().setLayoutData(
					new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

			listImports.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object element) {
					if (element instanceof Resource) {
						return ((Resource) element).getURI() + "";
					}
					return element + "";
				}
			});
			listImports.setContentProvider(new IStructuredContentProvider() {

				public void inputChanged(Viewer viewer, Object oldInput,
						Object newInput) {
				}

				public void dispose() {
				}

				public Object[] getElements(Object inputElement) {
					if (inputElement instanceof ResourceSet) {
						List<Resource> rl = new ArrayList<>();
						for (Resource r : ((ResourceSet) inputElement)
								.getResources()) {
							if (!r.getURI().toString().startsWith("temp://")) {
								rl.add(r);
							}
						}

						return rl.toArray();
					} else
						return null;
				}
			});
			listImports.setInput(rs);

			Button b = new Button(c, SWT.NONE);
			b.setText("Load...");
			b.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
					1));

			b.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					CheckedTreeSelectionDialog dialog = new CheckedTreeSelectionDialog(
							LMRDialogPage.this.getShell(),
							new WorkbenchLabelProvider(),
							new BaseWorkbenchContentProvider());

					dialog.setTitle("Select resource");

					dialog.setMessage("Select files from workspace:");

					dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

					dialog.setContainerMode(true);

					if (dialog.open() == Window.OK) {
						for (Object o : dialog.getResult()) {
							if (o instanceof org.eclipse.core.resources.IContainer)
								continue;
							IResource r = (IResource) o;
							URI uri = URI.createURI("platform:/resource"+r.getFullPath().toString());

							Resource res = Importer.loadModelPath(rs, uri);
							rs.getResources().add(res);
							PostProcessorManager.getInstance().processAll(rs);
							listImports.setInput(rs);
						}
					}
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
		}
	}
}
