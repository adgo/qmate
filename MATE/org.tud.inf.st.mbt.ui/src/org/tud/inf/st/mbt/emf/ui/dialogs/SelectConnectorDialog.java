package org.tud.inf.st.mbt.emf.ui.dialogs;

import java.util.List;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.tud.inf.st.mbt.automation.AbstractConnectorType;
import org.tud.inf.st.mbt.automation.ConnectorManager;

public class SelectConnectorDialog extends TitleAreaDialog {

	private ComboViewer cbType,cbConnection;
	private String connection;
	private AbstractConnectorType type;
	private Integer kind;

	public SelectConnectorDialog(Shell parentShell, Integer connectorKind) {
		super(parentShell);
		setTitle("Select Connector");
		this.kind = connectorKind;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;

		parent.setLayout(layout);

		Label l = new Label(parent, SWT.None);
		l.setText("Connector Type:");
		cbType = new ComboViewer(parent);
		cbType.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, false,2,1));
		cbType.setLabelProvider(new LabelProvider());
		cbType.setContentProvider(new IStructuredContentProvider() {
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
				List<AbstractConnectorType> types = (List<AbstractConnectorType>)inputElement;
				return types.toArray();
			}
			
		});
		cbType.setInput(ConnectorManager.getInstance().getTypes(kind));
		
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
		
		if(!((IStructuredSelection)cbType.getSelection()).isEmpty()){
			IStructuredSelection s = (IStructuredSelection)cbType.getSelection();
			cbConnection.setInput(((AbstractConnectorType)s.getFirstElement()).getAvailableConnections());
		}
		cbType.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if(!((IStructuredSelection)cbType.getSelection()).isEmpty()){
					IStructuredSelection s = (IStructuredSelection)cbType.getSelection();
					type = (AbstractConnectorType)s.getFirstElement();
					cbConnection.setInput(type.getAvailableConnections());					
				} else {
					cbConnection.setInput(new String[0]);
				}
			}
		});
		
		Button refresh = new Button(parent,SWT.NONE);
		refresh.setText("Refresh");
		refresh.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!((IStructuredSelection)cbType.getSelection()).isEmpty()){
					IStructuredSelection s = (IStructuredSelection)cbType.getSelection();
					type = (AbstractConnectorType)s.getFirstElement();
					cbConnection.setInput(type.getAvailableConnections());					
				} else {
					cbConnection.setInput(new String[0]);
				}
			}
		});

		setMessage("Select type and connection!");

		return parent;
	}

	@Override
	protected void okPressed() {
		if (!cbConnection.getSelection().isEmpty()) {
			connection = ((IStructuredSelection) cbConnection.getSelection())
					.getFirstElement() + "";
			super.okPressed();
		} else {
			setErrorMessage("No connection selected.");
		}
	}
	
	public String getConnection() {
		return connection;
	}
	
	public AbstractConnectorType getConnectorType() {
		return type;
	}

}
