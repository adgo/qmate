package org.tud.inf.st.mbt.emf.util;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class Importer {

	private static Resource getResource(ResourceSet rs, URI uri) {
		for (Resource r : rs.getResources()) {
			if (r.getURI().equals(uri))
				return r;
		}
		return null;
	}

	public static Resource loadModelPath(ResourceSet rs, URI uri) {
				
		Resource r = getResource(rs, uri);
		if (r != null)
			return r;

		try {
			Resource res = rs.createResource(uri);
			res.load(new HashMap<>());

			return res;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
