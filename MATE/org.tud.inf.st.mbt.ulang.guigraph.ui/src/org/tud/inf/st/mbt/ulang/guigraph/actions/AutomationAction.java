package org.tud.inf.st.mbt.ulang.guigraph.actions;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.actions.ActionDelegate;
import org.tud.inf.st.mbt.emf.validation.ValidationManager;
import org.tud.inf.st.mbt.ulang.guigraph.wizards.AutomationWizard;

public class AutomationAction extends ActionDelegate {
	private IFile selected;

	@Override
	public void run(IAction action) {
		final ResourceSet rs = new ResourceSetImpl();
		final Resource rgg = new XMIResourceImpl(URI.createURI(selected
				.getLocationURI().toString()));
		rs.getResources().add(rgg);
		try {
			rgg.load(new HashMap<>());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		EcoreUtil.resolveAll(rs);

		if (!ValidationManager.getInstance(selected).validateAll(rs)) {
			MessageBox mb = new MessageBox(Display.getCurrent()
					.getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			mb.setText("Validation failed");
			mb.setMessage("This resource contains an error. Please check the Problems view!");
			mb.open();
			return;
		}

		final AutomationWizard wizard = new AutomationWizard();
		WizardDialog dialog = new WizardDialog(Display.getDefault()
				.getActiveShell(), wizard);

		if (dialog.open() == Window.OK) {
			new Job("Automation: " + wizard.getAutomationType().getName()) {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					try {
						monitor.beginTask("Running automation...",
								IProgressMonitor.UNKNOWN);
						wizard.getAutomationType().automate(rgg);
						monitor.done();
					} catch (Exception e) {
						return Status.CANCEL_STATUS;
					}
					return Status.OK_STATUS;
				}
			}.schedule();

			// for (EObject r : rgg.getContents()) if(r instanceof TestSuite){
			// AndroidAutomationRunner aar = new AndroidAutomationRunner(
			// dialog.getContainer().getLocation().toPortableString(),
			// dialog.getKeywordProvider(), dialog.getActivity(), (TestSuite)
			// r);
			// aar.run();
			// }
		}

		// try {
		// dialog.getContainer()
		// .refreshLocal(IResource.DEPTH_INFINITE, null);
		// } catch (CoreException e) {
		// e.printStackTrace();
		// }

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selected = (IFile) ((StructuredSelection) selection).getFirstElement();
	}
}