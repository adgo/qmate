package org.tud.inf.st.mbt.datascen.ui;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.DialogUtil;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;
import org.tud.inf.st.mbt.data.DataFactory;
import org.tud.inf.st.mbt.data.DataScenario;

@SuppressWarnings("restriction")
public class NewDataScenarioWizard extends BasicNewFileResourceWizard {

	private Text txtLen;
	private DSPropertyPage props;
	
	private class DSPropertyPage extends WizardPage{
		protected DSPropertyPage() {
			super("Data scenario properties");
		}

		@Override
		public void createControl(Composite parent) {
			Composite comp = new Composite(parent, SWT.None);
			comp.setLayout(new GridLayout(2, false));

			Label l = new Label(comp, SWT.None);
			l.setText("Scenario length:");
			txtLen = new Text(comp, SWT.None);
			txtLen.setText("100");
			txtLen.setLayoutData(new GridData(SWT.FILL, SWT.None, true,
					false));
			setControl(comp);
		}
	}

	@Override
	public void addPages() {
		super.addPages();
		((WizardNewFileCreationPage) getStartingPage())
				.setFileExtension("scen");
		addPage(props = new DSPropertyPage());
	}

	@Override
	public boolean performFinish() {
		int len = 0;
		try {
			len = Integer.parseInt(txtLen.getText());
		} catch (Exception e) {
			props.setErrorMessage("Please enter a reasonable scenario length.");
			return false;
		}

		IFile file = ((WizardNewFileCreationPage) getStartingPage())
				.createNewFile();
		if (file == null) {
			return false;
		}

		selectAndReveal(file);

		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(org.eclipse.emf.common.util.URI
				.createURI(file.getLocationURI().toString()));

		DataScenario scenario = DataFactory.eINSTANCE.createDataScenario();
		scenario.setLength(len);

		r.getContents().add(scenario);

		try {
			r.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Open editor on new file.
		IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
		try {
			if (dw != null) {
				IWorkbenchPage page = dw.getActivePage();
				if (page != null) {
					IDE.openEditor(page, file, true);
				}
			}
		} catch (PartInitException e) {
			DialogUtil.openError(dw.getShell(),
					ResourceMessages.FileResource_errorMessage, e.getMessage(),
					e);
		}

		return true;
	}

}
