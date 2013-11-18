package org.tud.inf.st.mbt.automation.exports;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.ActionDelegate;
import org.tud.inf.st.mbt.emf.ui.dialogs.ExportFileDialog;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.test.TestCase;
import org.tud.inf.st.mbt.test.TestStep;
import org.tud.inf.st.mbt.test.TestSuite;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;

public class CSVExportAction extends ActionDelegate {
	private List<IFile> selected = new ArrayList<IFile>();

	private PrintStream os;

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selected.clear();
		Iterator<?> i = ((StructuredSelection) selection).iterator();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof IFile) {
				selected.add((IFile) o);
			}
		}
	}

	@Override
	public void run(IAction action) {
		if (selected.isEmpty())
			return;

		final ResourceSet rs = new PCCSResourceSetImpl();

		for (IFile f : selected) {
			final Resource r = rs.createResource(URI
					.createURI("platform:/resource"
							+ f.getFullPath().toString()));

			try {
				r.load(Collections.EMPTY_MAP);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			rs.getResources().add(r);
		}

		EcoreUtil.resolveAll(rs);

		export(rs);

		try {
			ResourcesPlugin.getWorkspace().getRoot()
					.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public void export(ResourceSet rs) {
		ExportFileDialog d = new ExportFileDialog(Display.getDefault()
				.getActiveShell(), new Random().nextInt(Integer.MAX_VALUE)
				+ ".csv");
		if (d.open() == Window.OK) {
			try {
				File f = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation()+"/"+d.getTargetFile());
				f.createNewFile();				
				
				os = new PrintStream(new FileOutputStream(f,true));

				Set<EObject> exported = new HashSet<>();
				
				for(TestSuite suite:ModelUtil.getAllEObjectsOfSuperType(rs, TestSuite.class))
					if(exported.add(suite))for(TestCase c:suite.getCases())
						if(exported.add(c))for(TestStep s:c.getSteps())
							if(exported.add(s))out(s);
				
				for(TestCase c:ModelUtil.getAllEObjectsOfSuperType(rs, TestCase.class))
					if(exported.add(c))for(TestStep s:c.getSteps())
						if(exported.add(s))out(s);
				
				for (TestStep ts : ModelUtil.getAllEObjectsOfSuperType(rs,
						TestStep.class))
					if(exported.add(ts))out(ts);

				os.close();
				os = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void out(TestStep ts) {
		String testSuiteID = "", testCaseName = "", testSuiteName = "", testCaseID = "", testStepID = "", testStepName = "";

		testStepID = ts.getId();
		testStepName = ts.getName();
		if (ts.eContainer() instanceof TestCase) {
			TestCase tc = (TestCase) ts.eContainer();
			testCaseID = tc.getId();
			testCaseName = tc.getName();
			if (tc.eContainer() instanceof TestSuite) {
				TestSuite suite = (TestSuite) tc.eContainer();
				testSuiteID = suite.getId();
				testSuiteName = suite.getName();
			}
		}

		os.print(testSuiteID + ";" + testSuiteName + ";" + testCaseID + ";"
				+ testCaseName + ";" + testStepID + ";" + testStepName + ";"
				+ ts.getAction()+"\n");
	}

}
