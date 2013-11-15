package org.tud.inf.st.mbt.ulang.guigraph.wizards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
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
import org.eclipse.swt.widgets.Text;
import org.tud.inf.st.mbt.emf.traversal.AbstractTraversalType;
import org.tud.inf.st.mbt.emf.traversal.TraversalManager;
import org.tud.inf.st.mbt.emf.ui.MBTConstants;
import org.tud.inf.st.mbt.emf.ui.dialogs.LoadModelResourceDialog;
import org.tud.inf.st.mbt.features.Configuration;

public class GenerateDialog extends TitleAreaDialog {
	private String targetFile;
	private Text txtNoCases, txtTime, txtBound;
	private List<Configuration> selectedConfigurations;
	private ListViewer configs;
	private int noCases, time, bound;
	private boolean ignoreRealtime = false;
	private ResourceSet rs;
	private boolean simulating = false;
	private AbstractTraversalType traversalType;

	public GenerateDialog(Shell parentShell, String targetFile, ResourceSet rs) {
		super(parentShell);
		this.targetFile = targetFile;
		this.rs = rs;
	}

	/**
	 * For simulation only constructor.
	 * 
	 * @param parentShell
	 * @param rs
	 */
	public GenerateDialog(Shell parentShell, ResourceSet rs) {
		super(parentShell);
		this.rs = rs;
		this.simulating = true;
	}

	private void requestConfigs() {
		List<Configuration> cl = new ArrayList<>();
		Iterator<Notifier> i = rs.getAllContents();
		while (i.hasNext()) {
			Notifier n = i.next();
			if (n instanceof Configuration) {
				cl.add((Configuration) n);
			}
		}
		if(!MBTConstants.IS_MOBILE)configs.setInput(cl);
		else {
			selectedConfigurations = new ArrayList<>();
			selectedConfigurations.add(cl.get(0));
		}
	}

	@Override
	public void create() {
		super.create();
		if (!simulating) {
			setTitle("Test Generation Dialog");
			setMessage("Set up new test generation job.");
		} else {
			setTitle("Simulation Configuration Dialog");
			setMessage("Set up new simulation.");
		}
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		Control crtl = super.createButtonBar(parent);
		crtl.setLayoutData(new GridData(SWT.CENTER, GridData.CENTER, true, true));
		return crtl;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;

		parent.setLayout(layout);

		Label l = null;
		if (!simulating) {
			l = new Label(parent, SWT.None);
			l.setText("Output file:");
			l.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true, true));
			l = new Label(parent, SWT.None);
			l.setText(targetFile);
			l.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true, true));

			l = new Label(parent, SWT.None);
			l.setText("Max number of test cases per suite:");
			l.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true, true));

			txtNoCases = new Text(parent, SWT.None);
			txtNoCases.setLayoutData(new GridData(GridData.FILL, SWT.CENTER,
					true, true));
			txtNoCases.setText("100");

			l = new Label(parent, SWT.None);
			l.setText("Traversal strategy:");
			l.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true, true));
			final ComboViewer cbTraversal = new ComboViewer(parent);
			cbTraversal.getCombo().setLayoutData(
					new GridData(GridData.FILL, SWT.CENTER, true, true));
			cbTraversal.setContentProvider(new IStructuredContentProvider() {

				@Override
				public void inputChanged(Viewer viewer, Object oldInput,
						Object newInput) {
				}

				@Override
				public void dispose() {
				}

				@Override
				public Object[] getElements(Object inputElement) {
					return (Object[]) inputElement;
				}
			});
			cbTraversal.setInput(TraversalManager.getInstance()
					.getTraversalTypes());
			cbTraversal.getCombo().select(0);
			this.traversalType = TraversalManager.getInstance()
					.getTraversalTypes()[0];
			cbTraversal
					.addSelectionChangedListener(new ISelectionChangedListener() {

						@Override
						public void selectionChanged(SelectionChangedEvent event) {
							Object o = ((IStructuredSelection) event
									.getSelection()).getFirstElement();
							traversalType = (AbstractTraversalType) o;
						}
					});
		}

		if (!MBTConstants.IS_MOBILE) {
			l = new Label(parent, SWT.None);
			l.setText("General maximal time per clock:");
			l.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true, true));

			txtTime = new Text(parent, SWT.None);
			txtTime.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true,
					true));
			txtTime.setText("100");
		}

		l = new Label(parent, SWT.None);
		l.setText("K-boundedness constraint:");
		l.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true, true));

		txtBound = new Text(parent, SWT.None);
		txtBound.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true,
				true));
		txtBound.setText("3");

		l = new Label(parent, SWT.None);
		l.setText("Additional resources:");
		l.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true, true));

		Button btnLoad = new Button(parent, SWT.None);
		btnLoad.setText("Load...");
		btnLoad.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true,
				true));
		btnLoad.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				LoadModelResourceDialog dialog = new LoadModelResourceDialog(
						getShell(), rs);
				dialog.open();
				requestConfigs();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		if (!MBTConstants.IS_MOBILE) {
			if (simulating) {
				l = new Label(parent, SWT.None);
				l.setText("Time variability:");
				l.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true,
						true));
				final Button selIgnoreRT = new Button(parent, SWT.CHECK);
				selIgnoreRT.setText("Ignore realtime");
				selIgnoreRT.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						if (selIgnoreRT.getSelection())
							GenerateDialog.this.ignoreRealtime = true;
						else {
							GenerateDialog.this.ignoreRealtime = false;
						}
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
					}
				});
				selIgnoreRT.setLayoutData(new GridData(GridData.FILL,
						SWT.CENTER, true, true));
			}

			l = new Label(parent, SWT.None);
			l.setText("Generate for configurations:");
			l.setLayoutData(new GridData(GridData.BEGINNING, SWT.BEGINNING,
					true, true));
			GridData gd = new GridData(GridData.FILL, SWT.FILL, true, true);
			gd.heightHint = 100;
			configs = new ListViewer(parent);
			configs.getControl().setLayoutData(gd);
			configs.setContentProvider(new IStructuredContentProvider() {

				public void inputChanged(Viewer viewer, Object oldInput,
						Object newInput) {
				}

				public void dispose() {
				}

				@Override
				public Object[] getElements(Object inputElement) {
					if (inputElement instanceof List<?>) {
						return ((List<?>) inputElement).toArray();
					}
					return null;
				}
			});
			configs.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object element) {
					return element + "";
				}
			});
		}
		requestConfigs();

		return parent;
	}

	private boolean validate() {
		if (!simulating) {
			try {
				noCases = Integer.parseInt(txtNoCases.getText());
			} catch (NumberFormatException e) {
				setErrorMessage("You entered an invalid number of test cases.");
				return false;
			}
		}
		if (!MBTConstants.IS_MOBILE)
			try {
				time = Integer.parseInt(txtTime.getText());
			} catch (NumberFormatException e) {
				setErrorMessage("You entered an invalid time constraint.");
				return false;
			}

		try {
			bound = Integer.parseInt(txtBound.getText());
		} catch (NumberFormatException e) {
			setErrorMessage("You entered an invalid K-boundness.");
			return false;
		}

		if (!MBTConstants.IS_MOBILE)
			if (configs.getSelection().isEmpty()) {
				setErrorMessage("No configurations were selected.");
				return false;
			} else {
				selectedConfigurations = new ArrayList<>();
				Iterator<?> i = ((IStructuredSelection) configs.getSelection())
						.iterator();
				while (i.hasNext()) {
					Configuration c = (Configuration) i.next();
					selectedConfigurations.add(c);
				}
			}

		return true;
	}

	@Override
	protected void okPressed() {
		if (validate())
			super.okPressed();
	}

	public int getNoCases() {
		return noCases;
	}

	public int getMaxTime() {
		return MBTConstants.IS_MOBILE ? Integer.MAX_VALUE : time;
	}

	public int getBoundary() {
		return bound;
	}

	public List<Configuration> getSelectedConfigurations() {
		return selectedConfigurations;
	}

	public String getTargetFile() {
		return targetFile;
	}

	public boolean isIgnoreRealtime() {
		return MBTConstants.IS_MOBILE || ignoreRealtime;
	}

	public AbstractTraversalType getTraversalType() {
		return traversalType;
	}
}
