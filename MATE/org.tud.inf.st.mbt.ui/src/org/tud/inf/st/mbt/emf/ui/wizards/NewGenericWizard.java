package org.tud.inf.st.mbt.emf.ui.wizards;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.DialogUtil;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;
import org.tud.inf.st.mbt.core.CoreFactory;

@SuppressWarnings("restriction")
public class NewGenericWizard extends BasicNewFileResourceWizard {

	@Override
	public void addPages() {
		super.addPages();
		((WizardNewFileCreationPage)getStartingPage()).setFileExtension("generic");
	}
	
	@Override
	public boolean performFinish() {
        IFile file = ((WizardNewFileCreationPage)getStartingPage()).createNewFile();
        if (file == null) {
			return false;
		}
        
        selectAndReveal(file);

        ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(org.eclipse.emf.common.util.URI
				.createURI(file.getLocationURI().toString()));
		r.getContents().add(CoreFactory.eINSTANCE.createGenericModelContainer());

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
            DialogUtil.openError(dw.getShell(), ResourceMessages.FileResource_errorMessage, 
                    e.getMessage(), e);
        }

        return true;
	}
	
	
}