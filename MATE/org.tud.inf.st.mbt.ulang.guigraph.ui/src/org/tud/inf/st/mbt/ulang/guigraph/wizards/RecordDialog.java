package org.tud.inf.st.mbt.ulang.guigraph.wizards;

import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.tud.inf.st.mbt.automation.record.AbstractRecorderType;
import org.tud.inf.st.mbt.automation.record.RecorderManager;

public class RecordDialog extends TitleAreaDialog {

	private ComboViewer cbConnector,cbConnection;
	private String connection;
	private AbstractRecorderType connector;
	private String imgContainer, imgContainerRelative;
	private IPath resourceContainerPath;

	public RecordDialog(Shell parentShell, IPath resourceContainerPath) {
		super(parentShell);
		setTitle("Record from device");
		this.resourceContainerPath = resourceContainerPath;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;

		parent.setLayout(layout);

		Label l = new Label(parent, SWT.None);
		l.setText("Connector:");
		cbConnector = new ComboViewer(parent);
		cbConnector.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, false));
		cbConnector.setLabelProvider(new LabelProvider());
		cbConnector.setContentProvider(new IStructuredContentProvider() {
			@Override
			public void dispose() {		
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {		
			}

			@Override
			public Object[] getElements(Object inputElement) {
				@SuppressWarnings("unchecked")
				List<AbstractRecorderType> types = (List<AbstractRecorderType>)inputElement;
				return types.toArray();
			}
			
		});
		cbConnector.setInput(RecorderManager.getTypes());

		
		l = new Label(parent, SWT.None);
		l.setText("Connection:");

		cbConnection = new ComboViewer(parent);
		cbConnection.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, false));
		cbConnection.setLabelProvider(new LabelProvider());
		cbConnection.setContentProvider(new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			@Override
			public void dispose() {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				if (inputElement instanceof String[])
					return (Object[]) inputElement;
				return null;
			}
		});
		
		if(!((IStructuredSelection)cbConnector.getSelection()).isEmpty()){
			IStructuredSelection s = (IStructuredSelection)cbConnector.getSelection();
			cbConnection.setInput(((AbstractRecorderType)s.getFirstElement()).getAvailableConnections());
		}
		cbConnector.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if(!((IStructuredSelection)cbConnector.getSelection()).isEmpty()){
					IStructuredSelection s = (IStructuredSelection)cbConnector.getSelection();
					connector = (AbstractRecorderType)s.getFirstElement();
					cbConnection.setInput(connector.getAvailableConnections());					
				} else {
					cbConnection.setInput(new String[0]);
				}
			}
		});

		l = new Label(parent, SWT.None);
		l.setText("Image container:");
		final Button b = new Button(parent, SWT.None);
		b.setText("Browse...");
		b.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		b.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				ContainerSelectionDialog dialog = new ContainerSelectionDialog(
						Display.getDefault().getActiveShell(), ResourcesPlugin
								.getWorkspace().getRoot(), false,
						"Select container for images!");
				if (dialog.open() == Window.OK) {
					IPath container = (IPath) dialog.getResult()[0];
					imgContainerRelative = container.makeRelativeTo(resourceContainerPath).toPortableString();
					
					imgContainer = ResourcesPlugin.getWorkspace().getRoot()
							.getLocation().toPortableString()+container.toPortableString();
					b.setText("Browse... | "
							+ (container.toPortableString().length() > 15 ? container.toPortableString()
									.substring(0, 15) : container.toPortableString()));
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		setMessage("Select device and client application for recording a test model!");

		return parent;
	}

	@Override
	protected void okPressed() {
		if (imgContainer == null) {
			setErrorMessage("No imager container selected.");
			return;
		}
		if (!cbConnection.getSelection().isEmpty()) {
			connection = ((IStructuredSelection) cbConnection.getSelection())
					.getFirstElement() + "";
			super.okPressed();
		} else {
			setErrorMessage("No device selected.");
		}
	}

	public String getConnection() {
		return connection;
	}
	
	public AbstractRecorderType getConnector() {
		return connector;
	}

	public String getImgContainer() {
		return imgContainer;
	}

	public String getImgContainerRelative() {
		return imgContainerRelative;
	}

}
