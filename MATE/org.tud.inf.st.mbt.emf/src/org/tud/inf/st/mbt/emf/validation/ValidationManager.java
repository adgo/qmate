package org.tud.inf.st.mbt.emf.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public final class ValidationManager {
	private static Map<IResource, ValidationManager> instances = new HashMap<>();
	private static List<IValidationConstraint> constraints = new ArrayList<IValidationConstraint>();

	public static ValidationManager getInstance(IResource r) {
		if (instances.isEmpty())
			init();
		ValidationManager instance = instances.get(r);
		if (instance == null) {
			instance = new ValidationManager(r);
			instances.put(r, instance);
		}
		return instance;
	}

	private static void init() {
		addConstraint(new NoProxies());
		addConstraint(new AllIDsSetConstraint());
		addConstraint(new ParsingConstraint());
	}

	private IResource resource;
	private List<EObject> cache;
	private boolean hasErrors = false;

	private ValidationManager(IResource r) {
		this.resource = r;
	}

	public static void addConstraint(IValidationConstraint c) {
		constraints.add(c);
	}

	public static void removeConstraint(IValidationConstraint c) {
		constraints.remove(c);
	}

	public boolean validateAll(ResourceSet rs) {
		reset();
		for (IValidationConstraint c : constraints)
			try {
				c.validate(this, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return !hasErrors;
	}

	public void reset() {
		try {
			resource.deleteMarkers(IMarker.PROBLEM, true,
					IResource.DEPTH_INFINITE);
			cache = null;
			hasErrors = false;
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public void setProblem(String msg, int severity, String location,
			String objID) {
		try {
			IMarker marker = resource.createMarker(IMarker.PROBLEM);
			marker.setAttribute(IMarker.MESSAGE, msg);
			marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
			marker.setAttribute(IMarker.SEVERITY, severity);
			marker.setAttribute(IMarker.LOCATION, location);
			marker.setAttribute(IMarker.SOURCE_ID, objID);
			if (severity == IMarker.SEVERITY_ERROR)
				hasErrors = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<EObject> getAllElements(ResourceSet rs) {
		if (cache != null)
			return cache;
		EcoreUtil.resolveAll(rs);
		List<EObject> result = new ArrayList<EObject>();
		for (Resource r : rs.getResources()) {
			Iterator<EObject> i = r.getAllContents();
			while (i.hasNext())
				result.add(i.next());
		}
		return cache = result;
	}
}
