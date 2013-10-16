package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pceditor.emf.PCCSResourceFactoryImpl;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;
import org.tud.inf.st.pceditor.interpreter.Util;

public class GuiGraphResourceSet extends PCCSResourceSetImpl {
	@SuppressWarnings("unchecked")
	public <T> Set<T> getAllElementsOfType(Class<T> type) {
		Set<T> result = new HashSet<>();
		for (Resource r : getResources()) {
			Iterator<EObject> i = r.getAllContents();
			while (i.hasNext()) {
				EObject eo = i.next();
				if (type.isAssignableFrom(eo.getClass())) {
					result.add((T) eo);
				}
			}
		}
		return result;
	}

	public GuiGraphResourceSet() {
		super();
		Util.registerPCCSExtensions();
		PCCSResourceSetImpl rs = new PCCSResourceSetImpl();
		rs.createResource(URI
				.createURI("platform:/plugin/org.tud.inf.st.mbt.emf/syntax/definitions.pccs"));
		rs.resolveImports();
		rs.computeReferenceErrors();
		ConcreteSyntax[] syntax = Util.filterConcreteSyntax(rs);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"defs", new PCCSResourceFactoryImpl(syntax));

	}
}
