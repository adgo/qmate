package org.tud.inf.st.mbt.emf.ui.wizards;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.tud.inf.st.mbt.emf.ui.MATENature;

public class NewMATEProjectWizard extends BasicNewProjectResourceWizard {
	@Override
	public boolean performFinish() {
		if (!super.performFinish())
			return false;

		try {
			IProject project = getNewProject();
			IProjectDescription desc = project.getDescription();
			List<String> natures = new LinkedList<>(Arrays.asList(desc.getNatureIds()));
			natures.add(MATENature.ID);
			desc.setNatureIds(natures.toArray(new String[0]));
			project.setDescription(desc, null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}
}
