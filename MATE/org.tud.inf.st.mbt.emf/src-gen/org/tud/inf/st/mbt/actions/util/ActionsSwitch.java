/**
 */
package org.tud.inf.st.mbt.actions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tud.inf.st.mbt.actions.*;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.rules.IRealTimeConsumer;

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
 * @see org.tud.inf.st.mbt.actions.ActionsPackage
 * @generated
 */
public class ActionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ActionsPackage.eINSTANCE;
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
			case ActionsPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.ACTION_REFERENCE: {
				ActionReference actionReference = (ActionReference)theEObject;
				T result = caseActionReference(actionReference);
				if (result == null) result = casePreGenerationAction(actionReference);
				if (result == null) result = caseAction(actionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.STAND_ALONE_ACTION: {
				StandAloneAction standAloneAction = (StandAloneAction)theEObject;
				T result = caseStandAloneAction(standAloneAction);
				if (result == null) result = caseAbstractModelElement(standAloneAction);
				if (result == null) result = caseITopLevelElement(standAloneAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.TIMED_CONDITION_ACTION: {
				TimedConditionAction timedConditionAction = (TimedConditionAction)theEObject;
				T result = caseTimedConditionAction(timedConditionAction);
				if (result == null) result = caseAbstractModelElement(timedConditionAction);
				if (result == null) result = caseITopLevelElement(timedConditionAction);
				if (result == null) result = caseIRealTimeConsumer(timedConditionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.PRE_GENERATION_ACTION: {
				PreGenerationAction preGenerationAction = (PreGenerationAction)theEObject;
				T result = casePreGenerationAction(preGenerationAction);
				if (result == null) result = caseAction(preGenerationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.POST_GENERATION_ACTION: {
				PostGenerationAction postGenerationAction = (PostGenerationAction)theEObject;
				T result = casePostGenerationAction(postGenerationAction);
				if (result == null) result = caseAction(postGenerationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.PRE_GENERATION_SEQUENCE: {
				PreGenerationSequence preGenerationSequence = (PreGenerationSequence)theEObject;
				T result = casePreGenerationSequence(preGenerationSequence);
				if (result == null) result = casePreGenerationAction(preGenerationSequence);
				if (result == null) result = caseAction(preGenerationSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.POST_GENERATION_SEQUENCE: {
				PostGenerationSequence postGenerationSequence = (PostGenerationSequence)theEObject;
				T result = casePostGenerationSequence(postGenerationSequence);
				if (result == null) result = casePostGenerationAction(postGenerationSequence);
				if (result == null) result = caseAction(postGenerationSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.THROW_ACTION: {
				ThrowAction throwAction = (ThrowAction)theEObject;
				T result = caseThrowAction(throwAction);
				if (result == null) result = casePreGenerationAction(throwAction);
				if (result == null) result = caseAction(throwAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.TERM_ACTION: {
				TermAction termAction = (TermAction)theEObject;
				T result = caseTermAction(termAction);
				if (result == null) result = casePostGenerationAction(termAction);
				if (result == null) result = caseReconfigurationAction(termAction);
				if (result == null) result = caseAction(termAction);
				if (result == null) result = casePreGenerationAction(termAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.RECONFIGURATION_ACTION: {
				ReconfigurationAction reconfigurationAction = (ReconfigurationAction)theEObject;
				T result = caseReconfigurationAction(reconfigurationAction);
				if (result == null) result = casePreGenerationAction(reconfigurationAction);
				if (result == null) result = caseAction(reconfigurationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.SET_DATA_ACTION: {
				SetDataAction setDataAction = (SetDataAction)theEObject;
				T result = caseSetDataAction(setDataAction);
				if (result == null) result = caseReconfigurationAction(setDataAction);
				if (result == null) result = casePreGenerationAction(setDataAction);
				if (result == null) result = caseAction(setDataAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.GET_DATA_ACTION: {
				GetDataAction getDataAction = (GetDataAction)theEObject;
				T result = caseGetDataAction(getDataAction);
				if (result == null) result = casePreGenerationAction(getDataAction);
				if (result == null) result = caseAction(getDataAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.REMOVE_BAG_ACTION: {
				RemoveBagAction removeBagAction = (RemoveBagAction)theEObject;
				T result = caseRemoveBagAction(removeBagAction);
				if (result == null) result = caseReconfigurationAction(removeBagAction);
				if (result == null) result = casePreGenerationAction(removeBagAction);
				if (result == null) result = caseAction(removeBagAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.ACTIVATE_FEATURE_ACTION: {
				ActivateFeatureAction activateFeatureAction = (ActivateFeatureAction)theEObject;
				T result = caseActivateFeatureAction(activateFeatureAction);
				if (result == null) result = casePostGenerationAction(activateFeatureAction);
				if (result == null) result = caseReconfigurationAction(activateFeatureAction);
				if (result == null) result = casePreGenerationAction(activateFeatureAction);
				if (result == null) result = caseAction(activateFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.DEACTIVATE_FEATURE_ACTION: {
				DeactivateFeatureAction deactivateFeatureAction = (DeactivateFeatureAction)theEObject;
				T result = caseDeactivateFeatureAction(deactivateFeatureAction);
				if (result == null) result = casePostGenerationAction(deactivateFeatureAction);
				if (result == null) result = caseReconfigurationAction(deactivateFeatureAction);
				if (result == null) result = casePreGenerationAction(deactivateFeatureAction);
				if (result == null) result = caseAction(deactivateFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.SET_PROPERTY_ACTION: {
				SetPropertyAction setPropertyAction = (SetPropertyAction)theEObject;
				T result = caseSetPropertyAction(setPropertyAction);
				if (result == null) result = casePostGenerationAction(setPropertyAction);
				if (result == null) result = caseAction(setPropertyAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.FAIL_ACTION: {
				FailAction failAction = (FailAction)theEObject;
				T result = caseFailAction(failAction);
				if (result == null) result = casePostGenerationAction(failAction);
				if (result == null) result = casePreGenerationAction(failAction);
				if (result == null) result = caseAction(failAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.TIME_ACTION: {
				TimeAction timeAction = (TimeAction)theEObject;
				T result = caseTimeAction(timeAction);
				if (result == null) result = casePreGenerationAction(timeAction);
				if (result == null) result = caseAction(timeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.DEPENDENT_ACTION: {
				DependentAction dependentAction = (DependentAction)theEObject;
				T result = caseDependentAction(dependentAction);
				if (result == null) result = casePostGenerationAction(dependentAction);
				if (result == null) result = caseAction(dependentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.GET_PROPERTY_ACTION: {
				GetPropertyAction getPropertyAction = (GetPropertyAction)theEObject;
				T result = caseGetPropertyAction(getPropertyAction);
				if (result == null) result = caseDependentAction(getPropertyAction);
				if (result == null) result = casePostGenerationAction(getPropertyAction);
				if (result == null) result = caseAction(getPropertyAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.GET_REAL_TIME_ACTION: {
				GetRealTimeAction getRealTimeAction = (GetRealTimeAction)theEObject;
				T result = caseGetRealTimeAction(getRealTimeAction);
				if (result == null) result = caseDependentAction(getRealTimeAction);
				if (result == null) result = casePreGenerationAction(getRealTimeAction);
				if (result == null) result = casePostGenerationAction(getRealTimeAction);
				if (result == null) result = caseAction(getRealTimeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.GET_FEATURE_STATE_ACTION: {
				GetFeatureStateAction getFeatureStateAction = (GetFeatureStateAction)theEObject;
				T result = caseGetFeatureStateAction(getFeatureStateAction);
				if (result == null) result = caseDependentAction(getFeatureStateAction);
				if (result == null) result = casePreGenerationAction(getFeatureStateAction);
				if (result == null) result = casePostGenerationAction(getFeatureStateAction);
				if (result == null) result = caseAction(getFeatureStateAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Generation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Generation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreGenerationAction(PreGenerationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Generation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Generation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostGenerationAction(PostGenerationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Generation Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Generation Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreGenerationSequence(PreGenerationSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Generation Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Generation Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostGenerationSequence(PostGenerationSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermAction(TermAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfiguration Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfiguration Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationAction(ReconfigurationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Data Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Data Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetDataAction(SetDataAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Data Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Data Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetDataAction(GetDataAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Bag Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Bag Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveBagAction(RemoveBagAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowAction(ThrowAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activate Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activate Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivateFeatureAction(ActivateFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deactivate Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deactivate Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeactivateFeatureAction(DeactivateFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Property Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Property Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetPropertyAction(SetPropertyAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Property Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Property Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPropertyAction(GetPropertyAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Real Time Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Real Time Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetRealTimeAction(GetRealTimeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Feature State Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Feature State Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetFeatureStateAction(GetFeatureStateAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fail Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fail Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailAction(FailAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stand Alone Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stand Alone Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandAloneAction(StandAloneAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Condition Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Condition Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedConditionAction(TimedConditionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionReference(ActionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeAction(TimeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentAction(DependentAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IReal Time Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IReal Time Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRealTimeConsumer(IRealTimeConsumer object) {
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

} //ActionsSwitch
