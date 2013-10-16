package org.tud.inf.st.mbt.automation.android;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.JavaBeautifier;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.tud.inf.st.mbt.core.CorePackage;
import org.tud.inf.st.mbt.data.DataPackage;
import org.tud.inf.st.mbt.terms.TermsPackage;
import org.tud.inf.st.mbt.test.TestPackage;
import org.tud.inf.st.mbt.test.TestSuite;

public class AndroidAutomationRunner {

	private String container, keywordProvider, activity;
	private TestSuite suite;

	public AndroidAutomationRunner(String container, String keywordProvider,
			String activity, TestSuite suite) {
		this.container = container;
		this.keywordProvider = keywordProvider;
		this.activity = activity;
		this.suite = suite;
	}

	public void run() {
		OutputImpl output = new OutputImpl();
		Outlet outlet = new Outlet(container);
		outlet.setOverwrite(true);
		output.addOutlet(outlet);
		outlet.addPostprocessor(new JavaBeautifier());

		Map<String, Variable> globalVars = new HashMap<>();
		XpandExecutionContextImpl ctx = new XpandExecutionContextImpl(output,
				null, globalVars, null, null);
		EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
			@Override
			protected EPackage[] allPackages() {
				return new EPackage[] { CorePackage.eINSTANCE,
						TestPackage.eINSTANCE, TermsPackage.eINSTANCE,
						DataPackage.eINSTANCE };
			}
		};
		ctx.registerMetaModel(metamodel);

		XpandFacade facade = XpandFacade.create(ctx);
		String template = "src::templates::Android::suite";
		facade.evaluate(template, suite, activity, keywordProvider);
	}
}
