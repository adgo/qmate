package org.tud.inf.st.pceditor.emf;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.tud.inf.st.pceditor.emf.PCCSResourceFactoryImpl.PCCSResourceImpl;
import org.tud.inf.st.pceditor.interpreter.Util;

public class PCCSResourceSetImpl extends ResourceSetImpl {
	public static final String PCCS_SCHEME = "pccs://";
	public static final String CONTENT_TYPE_MANUAL = "PCCS_MANUAL";

	@Override
	public Resource createResource(URI uri) {
		return createResource(uri, "");
	}

	@Override
	public Resource createResource(URI uri, String contentType) {
		uri = this.getURIConverter().normalize(uri);
		System.out.println("creating " + contentType + " resource " + uri);
		if (contentType.equals(CONTENT_TYPE_MANUAL)) {
			Resource r = new PCCSResourceImpl(uri, null){
				@Override
				public void load(Map<?, ?> options) throws IOException {
					//do nothing
				}
				@Override
				protected void doLoad(InputStream inputStream, Map<?, ?> options)
						throws IOException {
					//do nothing
				}
			};
			this.getResources().add(r);
			return r;
		} else {
			Resource r = super.createResource(uri, contentType);
			try {
				r.load(new HashMap<>());
			} catch (IOException e) {
				e.printStackTrace();
			}
			return r;
		}
	}

	/**
	 * hook
	 */
	public void resolveImports() {
		boolean newResourcesImported = false;
		for (Resource r : getResources().toArray(new Resource[0])) {
			if (r instanceof PCCSResourceImpl) {
				for (Object o : ((PCCSResourceImpl) r).getImports()) {
					URI uri = URI.createURI(o + "");
					if (!contains(uri)) {
						newResourcesImported = true;
						createResource(uri);
					}
				}
			}
		}
		if (newResourcesImported)
			resolveImports();
	}

	private boolean contains(URI uri) {
		for (Resource r : getResources())
			if (r.getURI().equals(uri))
				return true;
		return false;
	}

	public void computeReferenceErrors() {
		for (Resource r : getResources().toArray(new Resource[0])) {
			if (r instanceof PCCSResourceImpl) {
				Util.computeReferenceErrors(((PCCSResourceImpl) r)
						.getUnderlyingParserResult());
			}
		}
	}

	@Override
	public EObject getEObject(URI uri, boolean loadOnDemand) {
		if (PCCS_SCHEME.equals(uri.scheme() + "://")) {
			String pathDecoded = uri.path().substring(1);

			for (Resource r : getResources()) {
				Iterator<EObject> i = r.getAllContents();
				while (i.hasNext()) {
					EObject eo = i.next();
					try {
						String oPath = getObjectPath(eo);
						if (oPath == null)
							continue;

						if (pathDecoded.equals(oPath)
								|| (!pathDecoded.contains("/")
										&& eo.eClass().getEIDAttribute() != null && pathDecoded
											.equals(URLEncoder.encode(
													""
															+ eo.eGet(eo
																	.eClass()
																	.getEIDAttribute()),
													"UTF-8")))) {
							if (uri.host().equals(
									eo.eClass().getInstanceTypeName())) {
								return eo;
							}

							for (EClass ec : eo.eClass().getEAllSuperTypes()) {
								if (ec.getInstanceTypeName().equals(uri.host())) {
									return eo;
								}
							}
						}
					} catch (Exception e) {
						System.err.println(e);
					}
				}
			}
			return null;
		}
		return super.getEObject(uri, loadOnDemand);
	}

	public Set<String> getAllObjectPaths() {
		Set<String> paths = new HashSet<>();

		for (Resource r : getResources()) {
			Iterator<EObject> i = r.getAllContents();
			while (i.hasNext()) {
				String path = getObjectPath(i.next());
				if (path != null) {
					paths.add(path);
				}
			}
		}

		return paths;
	}

	public static String getObjectPath(EObject o) {
		String uri = "";
		if (o.eContainer() != null) {
			String prefix = getObjectURIIgnoreNull(o.eContainer());
			if (prefix != null) {
				uri += prefix;
			}
		}
		if (o.eClass().getEIDAttribute() == null)
			return null;

		Object id = o.eGet(o.eClass().getEIDAttribute());
		if (id == null)
			return null;

		if (id != null)
			try {
				id = URLEncoder.encode("" + id, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

		return uri.equals("") ? id + "" : uri + "/" + id;
	}

	private static String getObjectURIIgnoreNull(EObject o) {
		String uri = "";
		if (o.eContainer() != null) {
			String prefix = getObjectURIIgnoreNull(o.eContainer());
			if (prefix != null) {
				uri += prefix;
			}
		}
		if (o.eClass().getEIDAttribute() == null)
			return uri;

		Object id = o.eGet(o.eClass().getEIDAttribute());
		if (id == null)
			return uri;

		if (id != null)
			try {
				id = URLEncoder.encode("" + id, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

		return uri.equals("") ? id + "" : uri + "/" + id;
	}
}
