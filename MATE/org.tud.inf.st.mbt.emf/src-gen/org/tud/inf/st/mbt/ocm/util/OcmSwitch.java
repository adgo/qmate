/**
 */
package org.tud.inf.st.mbt.ocm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.ocm.*;
import org.tud.inf.st.mbt.rules.ITimeConsumer;

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
 * @see org.tud.inf.st.mbt.ocm.OcmPackage
 * @generated
 */
public class OcmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OcmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcmSwitch() {
		if (modelPackage == null) {
			modelPackage = OcmPackage.eINSTANCE;
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
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL: {
				OperationalConfigurationModel operationalConfigurationModel = (OperationalConfigurationModel)theEObject;
				T result = caseOperationalConfigurationModel(operationalConfigurationModel);
				if (result == null) result = caseAbstractModelElement(operationalConfigurationModel);
				if (result == null) result = caseITimeConsumer(operationalConfigurationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcmPackage.CONFIGURATION_NODE: {
				ConfigurationNode configurationNode = (ConfigurationNode)theEObject;
				T result = caseConfigurationNode(configurationNode);
				if (result == null) result = caseAbstractModelElement(configurationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcmPackage.OPERATIONAL_EDGE: {
				OperationalEdge operationalEdge = (OperationalEdge)theEObject;
				T result = caseOperationalEdge(operationalEdge);
				if (result == null) result = caseEdge(operationalEdge);
				if (result == null) result = caseAbstractModelElement(operationalEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcmPackage.STANDARD_CONFIGURATION_NODE: {
				StandardConfigurationNode standardConfigurationNode = (StandardConfigurationNode)theEObject;
				T result = caseStandardConfigurationNode(standardConfigurationNode);
				if (result == null) result = caseConfigurationNode(standardConfigurationNode);
				if (result == null) result = caseAbstractModelElement(standardConfigurationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcmPackage.RECONFIGURATION_ACTION_NODE: {
				ReconfigurationActionNode reconfigurationActionNode = (ReconfigurationActionNode)theEObject;
				T result = caseReconfigurationActionNode(reconfigurationActionNode);
				if (result == null) result = caseConfigurationNode(reconfigurationActionNode);
				if (result == null) result = caseAbstractModelElement(reconfigurationActionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcmPackage.COMPOSED_CONFIGURATION_NODE: {
				ComposedConfigurationNode composedConfigurationNode = (ComposedConfigurationNode)theEObject;
				T result = caseComposedConfigurationNode(composedConfigurationNode);
				if (result == null) result = caseConfigurationNode(composedConfigurationNode);
				if (result == null) result = caseAbstractModelElement(composedConfigurationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcmPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseAbstractModelElement(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcmPackage.COMPOSITION_EDGE: {
				CompositionEdge compositionEdge = (CompositionEdge)theEObject;
				T result = caseCompositionEdge(compositionEdge);
				if (result == null) result = caseEdge(compositionEdge);
				if (result == null) result = caseAbstractModelElement(compositionEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcmPackage.TIMED_EDGE: {
				TimedEdge timedEdge = (TimedEdge)theEObject;
				T result = caseTimedEdge(timedEdge);
				if (result == null) result = caseOperationalEdge(timedEdge);
				if (result == null) result = caseEdge(timedEdge);
				if (result == null) result = caseAbstractModelElement(timedEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcmPackage.EVENT_GUARDED_EDGE: {
				EventGuardedEdge eventGuardedEdge = (EventGuardedEdge)theEObject;
				T result = caseEventGuardedEdge(eventGuardedEdge);
				if (result == null) result = caseOperationalEdge(eventGuardedEdge);
				if (result == null) result = caseEdge(eventGuardedEdge);
				if (result == null) result = caseAbstractModelElement(eventGuardedEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Configuration Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Configuration Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalConfigurationModel(OperationalConfigurationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationNode(ConfigurationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalEdge(OperationalEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Configuration Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Configuration Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardConfigurationNode(StandardConfigurationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfiguration Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfiguration Action Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationActionNode(ReconfigurationActionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionEdge(CompositionEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Configuration Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Configuration Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedConfigurationNode(ComposedConfigurationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedEdge(TimedEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Guarded Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Guarded Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventGuardedEdge(EventGuardedEdge object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ITime Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITime Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITimeConsumer(ITimeConsumer object) {
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

} //OcmSwitch
