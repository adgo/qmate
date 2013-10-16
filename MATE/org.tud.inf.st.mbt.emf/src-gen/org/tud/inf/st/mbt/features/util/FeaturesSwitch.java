/**
 */
package org.tud.inf.st.mbt.features.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tud.inf.st.mbt.core.AbstractModelElement;

import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.features.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.features.FeaturesPackage
 * @generated
 */
public class FeaturesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeaturesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesSwitch() {
		if (modelPackage == null) {
			modelPackage = FeaturesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FeaturesPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseAbstractModelElement(feature);
				if (result == null) result = caseIFeature(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.FEATURE_SET: {
				FeatureSet featureSet = (FeatureSet)theEObject;
				T result = caseFeatureSet(featureSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.EXPLICIT_SET: {
				ExplicitSet explicitSet = (ExplicitSet)theEObject;
				T result = caseExplicitSet(explicitSet);
				if (result == null) result = caseFeatureSet(explicitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.UNION: {
				Union union = (Union)theEObject;
				T result = caseUnion(union);
				if (result == null) result = caseBinarySetOperator(union);
				if (result == null) result = caseFeatureSet(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.INTERSECTION: {
				Intersection intersection = (Intersection)theEObject;
				T result = caseIntersection(intersection);
				if (result == null) result = caseBinarySetOperator(intersection);
				if (result == null) result = caseFeatureSet(intersection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.BINARY_SET_OPERATOR: {
				BinarySetOperator binarySetOperator = (BinarySetOperator)theEObject;
				T result = caseBinarySetOperator(binarySetOperator);
				if (result == null) result = caseFeatureSet(binarySetOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.WITHOUT: {
				Without without = (Without)theEObject;
				T result = caseWithout(without);
				if (result == null) result = caseBinarySetOperator(without);
				if (result == null) result = caseFeatureSet(without);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.SET_REFERENCE: {
				SetReference setReference = (SetReference)theEObject;
				T result = caseSetReference(setReference);
				if (result == null) result = caseFeatureSet(setReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.STANDALONE_FEATURE_SET: {
				StandaloneFeatureSet standaloneFeatureSet = (StandaloneFeatureSet)theEObject;
				T result = caseStandaloneFeatureSet(standaloneFeatureSet);
				if (result == null) result = caseAbstractModelElement(standaloneFeatureSet);
				if (result == null) result = caseIFeatureDomain(standaloneFeatureSet);
				if (result == null) result = caseITopLevelElement(standaloneFeatureSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.SUB_SET: {
				SubSet subSet = (SubSet)theEObject;
				T result = caseSubSet(subSet);
				if (result == null) result = caseFeatureSet(subSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.IFEATURE: {
				IFeature iFeature = (IFeature)theEObject;
				T result = caseIFeature(iFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.FEATURE_REFERENCE: {
				FeatureReference featureReference = (FeatureReference)theEObject;
				T result = caseFeatureReference(featureReference);
				if (result == null) result = caseIFeature(featureReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.IFEATURE_DOMAIN: {
				IFeatureDomain iFeatureDomain = (IFeatureDomain)theEObject;
				T result = caseIFeatureDomain(iFeatureDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.FEATURE_ATTRIBUTE: {
				FeatureAttribute featureAttribute = (FeatureAttribute)theEObject;
				T result = caseFeatureAttribute(featureAttribute);
				if (result == null) result = caseAbstractModelElement(featureAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = caseAbstractModelElement(configuration);
				if (result == null) result = caseITopLevelElement(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturesPackage.FEATURE_VERSION: {
				FeatureVersion featureVersion = (FeatureVersion)theEObject;
				T result = caseFeatureVersion(featureVersion);
				if (result == null) result = caseAbstractModelElement(featureVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSet(FeatureSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explicit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explicit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplicitSet(ExplicitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnion(Union object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intersection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intersection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntersection(Intersection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Set Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Set Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinarySetOperator(BinarySetOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Without</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Without</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithout(Without object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetReference(SetReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standalone Feature Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standalone Feature Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandaloneFeatureSet(StandaloneFeatureSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSet(SubSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFeature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFeature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFeature(IFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureReference(FeatureReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFeature Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFeature Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFeatureDomain(IFeatureDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureAttribute(FeatureAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureVersion(FeatureVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractModelElement(AbstractModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITop Level Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITop Level Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITopLevelElement(ITopLevelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FeaturesSwitch
