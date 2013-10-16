package org.tud.inf.st.mbt.ulang.guigraph.wizards;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;

public class NewGUIMMWizard extends BasicNewFileResourceWizard {

	@Override
	public void addPages() {
		super.addPages();
		((WizardNewFileCreationPage)getStartingPage()).setFileExtension("guimm");
	}
	
}
