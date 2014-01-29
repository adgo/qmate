package org.tud.inf.st.mbt.automation.exports;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.actions.TermAction;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.emf.ui.dialogs.ExportFileDialog;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.terms.FunctorTerm;
import org.tud.inf.st.mbt.terms.NumberTerm;
import org.tud.inf.st.mbt.terms.StringTerm;
import org.tud.inf.st.mbt.terms.Term;
import org.tud.inf.st.mbt.test.TestCase;
import org.tud.inf.st.mbt.test.TestStep;
import org.tud.inf.st.mbt.test.TestSuite;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;

import com.experitest.client.Client;

public class ExperitestExportAction extends ActionDelegate {
	private List<IFile> selected = new ArrayList<IFile>();

	private PrintStream os;
	private int tcNum;

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
		int i = new Random().nextInt(Integer.MAX_VALUE);

		ExportFileDialog d = new ExportFileDialog(Display.getDefault()
				.getActiveShell(), "Test" + i + ".java");
		if (d.open() == Window.OK) {
			try {
				File f = new File(ResourcesPlugin.getWorkspace().getRoot()
						.getLocation()
						+ "/" + d.getTargetFile());
				f.createNewFile();

				os = new PrintStream(new FileOutputStream(f, true));
				tcNum = 1;

				printHeader(i);

				Set<EObject> exported = new HashSet<>();

				for (TestSuite suite : ModelUtil.getAllEObjectsOfSuperType(
						new HashMap<Integer, Set<?>>(), rs, TestSuite.class))
					if (exported.add(suite))
						for (TestCase c : suite.getCases())
							if (exported.add(c))
								printTestCase(c);

				for (TestCase c : ModelUtil.getAllEObjectsOfSuperType(
						new HashMap<Integer, Set<?>>(), rs, TestCase.class))
					if (exported.add(c))
						printTestCase(c);

				printFooter();

				os.close();
				os = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void printTestCase(TestCase c) {
		os.println("\n\t@Test\n" + "\tpublic void testCase" + tcNum + "(){ //"
				+ c);
		os.println("\t\tMap<Object,Object> memory = new HashMap<Object,Object>();");
		for (TestStep s : c.getSteps()) {
			PostGenerationAction a = s.getAction();
			if (a instanceof TermAction) {
				
				if(((TermAction) a).getTerm() instanceof StringTerm){
					os.println("\t\t"+((StringTerm)((TermAction) a).getTerm()).getValue()+";");
					continue;
				} else if (((TermAction) a).getTerm() instanceof FunctorTerm) {
					FunctorTerm ft = (FunctorTerm) ((TermAction) a).getTerm();
					Class<?>[] signature = getSignature(ft);
					Method m = null;
					for (Method mi : Client.class.getMethods()) {
						if (mi.getName().equals(ft.getFunctor())) {
							if (fulfillsSignature(mi, signature)) {
								m = mi;
								break;
							}
						}
					}

					String postfix = "";
					if (ft.getArguments().isEmpty())
						postfix = "()";

					if (m != null) {
						os.println("\t\tclient." + ft + postfix + "; //"
								+ name(s));
						continue;
					} else {
						os.println("\t\tctx." + a + postfix + "; //" + name(s));
						continue;
					}
				}
			}

			os.println("\t\t" + a + "; //" + name(s));
		}
		os.println("\t}");
		tcNum++;
	}

	private boolean fulfillsSignature(Method m, Class<?>[] sig) {
		if (m.getParameterTypes().length != sig.length)
			return false;
		for (int i = 0; i < m.getParameterTypes().length; i++) {
			if (!m.getParameterTypes()[i].isAssignableFrom(sig[i]))
				return false;
		}
		return true;
	}

	private Class<?>[] getSignature(FunctorTerm ft) {
		Class<?>[] result = new Class<?>[ft.getArguments().size()];
		for (int i = 0; i < result.length; i++) {
			if (ft.getArguments().get(i) instanceof NumberTerm)
				result[i] = int.class;
			else if (ft.getArguments().get(i) instanceof StringTerm)
				result[i] = String.class;
			else
				result[i] = Object.class;
		}
		return result;
	}

	private String name(AbstractModelElement ame) {
		if (ame.getName() != null)
			return ame.getName();
		else if (ame.getId() != null)
			return ame.getId();
		else
			return "<" + ame.getClass().getSimpleName() + ">";
	}

	private void printHeader(int i) {
		os.println("package my.test.module; //TODO\n");
		os.println("import com.experitest.client.*;");
		os.println("import org.junit.*;");
		os.println("import java.util.*;");
		os.println("\n" + "public class Test" + i + " {\n"
				+ "\tprivate String host= \"localhost\";\n"
				+ "\tprivate int port = 8888;\n"
				+ "\tprivate String projectBaseDirectory = \"c:\\\\\";\n"
				+ "\t//TODO private Type ctx = ?;\n"
				+ "\tprotected Client client = null;\n" + "\n" + "\t@Before\n"
				+ "\tpublic void setUp(){\n"
				+ "\t\tclient = new Client(host,port);\n"
				+ "\t\tclient.setProjectBaseDirectory(projectBaseDirectory);\n"
				+ "\t\tclient.setReporter(\"xml\", \"reports\", \"Test\");\n"
				+ "\t}");
	}

	private void printFooter() {
		os.println("\n\t@After\n" + "\tpublic void tearDown(){\n"
				+ "\t\t client.generateReport();\n" + "\t}\n" + "}");
	}
}
