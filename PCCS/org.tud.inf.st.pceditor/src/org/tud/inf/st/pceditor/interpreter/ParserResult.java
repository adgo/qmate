package org.tud.inf.st.pceditor.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class ParserResult {
	private List<ParserError> errors;
	private List<EObject> objects;
	private List<String> expectations;
	private Map<EObject, Location> locations;

	public ParserResult(List<EObject> objects, List<ParserError> errors,
			List<String> expectations, Map<EObject, Location> locations) {
		setObjects(objects);
		this.errors = errors;
		this.expectations = expectations;
		this.locations = locations;
	}
	
	public ResourceSet getResourceSet(){
		return getObjects().get(0).eResource().getResourceSet();
	}
	
	public Location getLocation(EObject eo) {
		return locations.get(eo);
	}

	public List<ParserError> getErrors() {
		return errors;
	}

	public List<String> getExpectations() {
		return expectations;
	}

	public List<EObject> getObjects() {
		return objects;
	}

	public void setObjects(List<EObject> objects) {
		this.objects = objects;
		
	}

	public void addExpecation(String e) {
		this.expectations.add(e);
	}

	public void addError(ParserError e) {
		this.errors.add(e);
	}

}
