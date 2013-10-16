package org.tud.inf.st.mbt.scenario.ui;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;

public class NewScenarioWizard  extends BasicNewFileResourceWizard {

	@Override
	public void addPages() {
		super.addPages();
		((WizardNewFileCreationPage)getStartingPage()).setFileExtension("sscen");
	}
	
}