package org.tud.inf.st.mbt.ocm.ui;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;

public class NewOCMWizard  extends BasicNewFileResourceWizard {

	@Override
	public void addPages() {
		super.addPages();
		((WizardNewFileCreationPage)getStartingPage()).setFileExtension("ocm");
	}
	
}
