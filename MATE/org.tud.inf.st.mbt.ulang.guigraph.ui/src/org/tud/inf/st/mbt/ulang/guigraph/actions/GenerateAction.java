package org.tud.inf.st.mbt.ulang.guigraph.actions;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.actions.ActionDelegate;
import org.tud.inf.st.mbt.core.CausalLinkType;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.emf.generator.Generator;
import org.tud.inf.st.mbt.emf.generator.GeneratorState;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.emf.validation.ValidationManager;
import org.tud.inf.st.mbt.features.Configuration;
import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;
import org.tud.inf.st.mbt.ulang.guigraph.wizards.GenerateDialog;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;

public class GenerateAction extends ActionDelegate {
	private IFile selected;

	@Override
	public void run(IAction action) {
		final ResourceSet rs = new PCCSResourceSetImpl();
		Resource rgg = rs.createResource(URI.createURI(selected
				.getLocationURI().toString() + ".ecore"));
		rs.getResources().add(rgg);
		try {
			rgg.load(new HashMap<>());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		EcoreUtil.resolveAll(rs);
		for(DataLeaf l:ModelUtil.getAllEObjectsOfSuperType(rs, DataLeaf.class)){
			if(l.getCausalLinkType().equals(CausalLinkType.DOWNLINK)){
				MessageBox mb = new MessageBox(Display.getCurrent()
						.getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				mb.setText("Downlink Variables Found");
				mb.setMessage("No offline generation possible: resource contains downlink variables!");
				mb.open();
				return;
			}
		}
		
		if (!ValidationManager.getInstance(selected).validateAll(rs)) {
			MessageBox mb = new MessageBox(Display.getCurrent()
					.getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			mb.setText("Validation Failed");
			mb.setMessage("This resource contains an error. Please check the Problems view!");
			mb.open();
			return;
		}
		final GenerateDialog dialog = new GenerateDialog(Display.getDefault()
				.getActiveShell(), selected.getLocation().toString() + ".test",
				rs);
		if (dialog.open() == Window.OK) {
			Job job = new Job("Generating test cases") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					int ic = 1;

					Resource rtest = new XMIResourceImpl();
					rtest.setURI(URI.createURI(selected.getLocationURI()
							.toString() + ".test"));
					rs.getResources().add(rtest);

					for (Configuration c : dialog.getSelectedConfigurations()) {
						monitor.beginTask("Generating for configuration " + c
								+ " (" + ic + ")", IProgressMonitor.UNKNOWN);
						Generator generator = new Generator(c, rs,
								dialog.getBoundary(), dialog.getMaxTime(),dialog.getTraversalType());
						while (generator.hasNext()
								&& generator.getTestSuite().getCases().size() < dialog
										.getNoCases()) {
							GeneratorState gens = generator.next();
							monitor.subTask("step " + gens.getStep() + ", "
									+ gens.getQueueSize() + " open");
							if (monitor.isCanceled())
								return Status.CANCEL_STATUS;
						}
						ic++;

						rtest.getContents().add(generator.getTestSuite());
					}

					monitor.done();

					try {
						rtest.save(new HashMap<>());
						ResourcesPlugin.getWorkspace().getRoot()
								.refreshLocal(IResource.DEPTH_INFINITE, null);
					} catch (Exception e) {
						e.printStackTrace();
					}

					return Status.OK_STATUS;
				}

			};
			job.schedule();
		}

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selected = (IFile) ((StructuredSelection) selection).getFirstElement();
	}
}
