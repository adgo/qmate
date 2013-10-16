package org.tud.inf.st.mbt.ulang.guigraph.actions;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
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
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.tud.inf.st.mbt.emf.validation.ValidationManager;
import org.tud.inf.st.mbt.ulang.guigraph.views.SimulationView;
import org.tud.inf.st.mbt.ulang.guigraph.wizards.GenerateDialog;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;

public class SimulateAction extends ActionDelegate {
	private IFile selected;

	@Override
	public void run(IAction action) {
		ResourceSet rs = new PCCSResourceSetImpl();
		Resource rgg = new XMIResourceImpl(URI.createURI(selected
				.getLocationURI().toString() + ".ecore"));
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
		final GenerateDialog dialog = new GenerateDialog(Display.getDefault()
				.getActiveShell(), rs);
		if (dialog.open() == Window.OK) {
			try {
				SimulationView view = (SimulationView) PlatformUI
						.getWorkbench()
						.getActiveWorkbenchWindow()
						.getActivePage()
						.showView(
								SimulationView.ID);
				view.startSimulation(dialog.getMaxTime(),
						dialog.getBoundary(),
						dialog.getSelectedConfigurations(), rs);
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selected = (IFile) ((StructuredSelection) selection).getFirstElement();
	}

}
