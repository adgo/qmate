package org.tud.inf.st.mbt.ulang.guigraph.defs;

import org.eclipse.emf.common.util.URI;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;
import org.tud.inf.st.pceditor.interpreter.Util;
import org.tud.inf.st.pceditor.ui.PCEditor;

public class DefinitionsEdtior extends PCEditor {
	public DefinitionsEdtior() {
		try {
			Util.registerPCCSExtensions();
			PCCSResourceSetImpl rs = new PCCSResourceSetImpl();
			rs.createResource(URI.createURI("platform:/plugin/org.tud.inf.st.mbt.emf/syntax/definitions.pccs"));
			rs.resolveImports();
			rs.computeReferenceErrors();
			renewContentSyntax(
					Util.filterConcreteSyntax(rs));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
