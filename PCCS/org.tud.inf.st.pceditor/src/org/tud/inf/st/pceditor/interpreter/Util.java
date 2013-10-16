package org.tud.inf.st.pceditor.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pceditor.emf.PCCSResourceFactoryImpl;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;

public class Util {
	public static String TEMP_SCHEME = "temp";

	public static void computeReferenceErrors(ParserResult result) {
		if (result != null && result.getObjects() != null) {
			for (EObject ro : result.getObjects()) {
				ResourceSet rs = ro.eResource().getResourceSet();
				EcoreUtil.resolveAll(rs);
				Iterator<EObject> i = ro.eAllContents();
				boolean checkedRoot = false;
				while (i.hasNext() || !checkedRoot) {
					EObject eo = null;
					if (i.hasNext()) {
						eo = i.next();
					} else {
						eo = ro;
						checkedRoot = true;
					}
					for (EReference r : eo.eClass().getEAllReferences()) {
						Object oRef = eo.eGet(r);
						if (!r.isContainment() && oRef != null
								&& oRef instanceof EObject) {
							EObject eoRef = (EObject) eo.eGet(r);
							if (eoRef.eIsProxy()) {
								Location l = result.getLocation(eo);
								result.addError(new ParserError(0, 0, l,
										"reference " + r.getName() + " ("
												+ EcoreUtil.getURI(eoRef)
												+ ") " + " was not resolved",
										""));
							}
						} else if (!r.isContainment() && r.isMany()) {
							for (Object o : (Collection<?>) oRef) {
								if (o instanceof EObject
										&& ((EObject) o).eIsProxy()) {
									Location l = result.getLocation(eo);
									result.addError(new ParserError(0, 0, l,
											"reference " + r.getName()
													+ " was not resolved", ""));
								}
							}
						}
					}
				}
			}
		}
	}

	public static void removeReferencedResources(Resource origin) {
		for (Resource r : origin.getResourceSet().getResources()
				.toArray(new Resource[0])) {
			if (!r.equals(origin) && !r.getURI().scheme().equals(TEMP_SCHEME)) {
				origin.getResourceSet().getResources().remove(r);
			}
		}
	}

	private static Map<EClass, EClass> concreteTypesCache = new HashMap<>();

	public static EClass findConcreteType(EClass type) {
		if (!type.isAbstract())
			return type;
		if (concreteTypesCache.containsKey(type))
			return concreteTypesCache.get(type);

		// at first search in own package
		for (EClassifier c : type.getEPackage().getEClassifiers()) {
			if (c instanceof EClass) {
				for (EClass impl : ((EClass) c).getEAllSuperTypes()) {
					if (impl.equals(type)) {
						concreteTypesCache.put(type, (EClass) c);
						return (EClass) c;
					}
				}
			}
		}

		// then search in complete package registry
		for (Object o : EPackage.Registry.INSTANCE.values()) {
			if (o instanceof EPackage) {
				for (EClassifier c : ((EPackage) o).getEClassifiers()) {
					if (c instanceof EClass) {
						for (EClass impl : ((EClass) c).getEAllSuperTypes()) {
							if (impl.equals(type)) {
								concreteTypesCache.put(type, (EClass) c);
								return (EClass) c;
							}
						}
					}
				}
			}
		}

		throw new RuntimeException(
				"Could not find any concrete implementatoin for " + type);
	}

	public static InternalEObject createProxyFor(EObject eo, EClass type) {
		InternalEObject proxy = (InternalEObject) type.getEPackage()
				.getEFactoryInstance()
				.create(Util.findConcreteType((EClass) type));
		proxy.eSetProxyURI(org.eclipse.emf.common.util.URI
				.createURI(PCCSResourceSetImpl.PCCS_SCHEME
						+ type.getInstanceTypeName() + "/"
						+ PCCSResourceSetImpl.getObjectPath((EObject) eo)));
		return proxy;
	}

	public static void removeCrossReferences(EObject eo) {
		EList<EReference> refs = eo.eClass().getEAllReferences();
		for (EReference ref : refs)
			if (!ref.isContainment()) {
				Object refObj = eo.eGet(ref);
				if (refObj != null) {
					if (ref.isMany()) {
						Object[] refArr = ((Collection<?>) refObj).toArray();
						List<Object> replacement = new ArrayList<>();
						for (Object nextRefObj : refArr) {
							if (nextRefObj instanceof EObject
									&& !((EObject) nextRefObj).eIsProxy()
									&& !((EObject) nextRefObj).eResource()
											.equals(eo.eResource())) {
								replacement.add(createProxyFor(
										(EObject) nextRefObj,
										(EClass) ref.getEType()));
							} else {
								replacement.add(nextRefObj);
							}
						}
						eo.eSet(ref, replacement);
					} else {
						if (refObj instanceof EObject
								&& !((EObject) refObj).eIsProxy()
								&& !((EObject) refObj).eResource().equals(
										eo.eResource())) {
							eo.eSet(ref,
									createProxyFor((EObject) refObj,
											(EClass) ref.getEType()));
						}
					}
				}
			}

		// recursion
		Iterator<EObject> iCont = eo.eAllContents();
		while (iCont.hasNext()) {
			removeCrossReferences(iCont.next());
		}
	}

	public static ConcreteSyntax[] filterConcreteSyntax(ResourceSet rs) {
		List<ConcreteSyntax> csl = new ArrayList<>();

		for (Resource ri : rs.getResources()) {
			for (EObject eo : ri.getContents())
				if (eo instanceof ConcreteSyntax)
					csl.add((ConcreteSyntax) eo);
		}

		ConcreteSyntax[] result = csl.toArray(new ConcreteSyntax[0]);

		return result;
	}

	private static ConcreteSyntax[] pccsL0,pccsL1,pccsL2;

	private static ConcreteSyntax[] getSyntax_Level0() {
		if (pccsL0 == null) {
			ResourceSet rs = new PCCSResourceSetImpl();
			rs.createResource(URI
					.createURI("platform:/plugin/org.tud.inf.st.pceditor/csmodel/pccs0.xmi"));
			pccsL0 = filterConcreteSyntax(rs);
		}
		return pccsL0;
	}

	private static ConcreteSyntax[] getSyntax_Level1() {
		if (pccsL1 == null) {
				ResourceSet rs = new PCCSResourceSetImpl();
				rs.createResource(URI
						.createURI("platform:/plugin/org.tud.inf.st.pceditor/csmodel/pccs1.pccs0"));
				pccsL1 = filterConcreteSyntax(rs);
		}
		return pccsL1;
	}

	public static ConcreteSyntax[] getSyntax_Level2() {
		if (pccsL2 == null) {
				ResourceSet rs = new PCCSResourceSetImpl();
				rs.createResource(URI
						.createURI("platform:/plugin/org.tud.inf.st.pceditor/csmodel/pccs2.pccs1"));
				pccsL2 = filterConcreteSyntax(rs);
		}
		return pccsL2;
	}

	public static List<EObject> flatten(Object o) {
		List<EObject> result = new ArrayList<EObject>();
		if (o instanceof EObject) {
			result.add((EObject) o);
		} else if (o instanceof Iterable<?>)
			for (Object e : (Iterable<?>) o)
				result.addAll(flatten(e));
		else if (o instanceof IntmResult)
			result.addAll(flatten(((IntmResult) o).getObject()));

		return result;
	}

	public static void registerPCCSExtensions() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"pccs0", new PCCSResourceFactoryImpl(Util.getSyntax_Level0()));
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"pccs1",	new PCCSResourceFactoryImpl(getSyntax_Level1()));
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"pccs2",	new PCCSResourceFactoryImpl(getSyntax_Level2()));
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"pccs",	new PCCSResourceFactoryImpl(getSyntax_Level2()));
	}
}
