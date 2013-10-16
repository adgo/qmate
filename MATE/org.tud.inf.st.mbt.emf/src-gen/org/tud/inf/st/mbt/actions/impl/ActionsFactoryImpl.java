/**
 */
package org.tud.inf.st.mbt.actions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.mbt.actions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionsFactoryImpl extends EFactoryImpl implements ActionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionsFactory init() {
		try {
			ActionsFactory theActionsFactory = (ActionsFactory)EPackage.Registry.INSTANCE.getEFactory(ActionsPackage.eNS_URI);
			if (theActionsFactory != null) {
				return theActionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ActionsPackage.ACTION_REFERENCE: return createActionReference();
			case ActionsPackage.STAND_ALONE_ACTION: return createStandAloneAction();
			case ActionsPackage.TIMED_CONDITION_ACTION: return createTimedConditionAction();
			case ActionsPackage.PRE_GENERATION_SEQUENCE: return createPreGenerationSequence();
			case ActionsPackage.POST_GENERATION_SEQUENCE: return createPostGenerationSequence();
			case ActionsPackage.THROW_ACTION: return createThrowAction();
			case ActionsPackage.TERM_ACTION: return createTermAction();
			case ActionsPackage.SET_DATA_ACTION: return createSetDataAction();
			case ActionsPackage.GET_DATA_ACTION: return createGetDataAction();
			case ActionsPackage.REMOVE_BAG_ACTION: return createRemoveBagAction();
			case ActionsPackage.ACTIVATE_FEATURE_ACTION: return createActivateFeatureAction();
			case ActionsPackage.DEACTIVATE_FEATURE_ACTION: return createDeactivateFeatureAction();
			case ActionsPackage.SET_PROPERTY_ACTION: return createSetPropertyAction();
			case ActionsPackage.FAIL_ACTION: return createFailAction();
			case ActionsPackage.TIME_ACTION: return createTimeAction();
			case ActionsPackage.GET_PROPERTY_ACTION: return createGetPropertyAction();
			case ActionsPackage.GET_REAL_TIME_ACTION: return createGetRealTimeAction();
			case ActionsPackage.GET_FEATURE_STATE_ACTION: return createGetFeatureStateAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreGenerationSequence createPreGenerationSequence() {
		PreGenerationSequenceImpl preGenerationSequence = new PreGenerationSequenceImpl();
		return preGenerationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostGenerationSequence createPostGenerationSequence() {
		PostGenerationSequenceImpl postGenerationSequence = new PostGenerationSequenceImpl();
		return postGenerationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermAction createTermAction() {
		TermActionImpl termAction = new TermActionImpl();
		return termAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetDataAction createSetDataAction() {
		SetDataActionImpl setDataAction = new SetDataActionImpl();
		return setDataAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDataAction createGetDataAction() {
		GetDataActionImpl getDataAction = new GetDataActionImpl();
		return getDataAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveBagAction createRemoveBagAction() {
		RemoveBagActionImpl removeBagAction = new RemoveBagActionImpl();
		return removeBagAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowAction createThrowAction() {
		ThrowActionImpl throwAction = new ThrowActionImpl();
		return throwAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateFeatureAction createActivateFeatureAction() {
		ActivateFeatureActionImpl activateFeatureAction = new ActivateFeatureActionImpl();
		return activateFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeactivateFeatureAction createDeactivateFeatureAction() {
		DeactivateFeatureActionImpl deactivateFeatureAction = new DeactivateFeatureActionImpl();
		return deactivateFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPropertyAction createSetPropertyAction() {
		SetPropertyActionImpl setPropertyAction = new SetPropertyActionImpl();
		return setPropertyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetPropertyAction createGetPropertyAction() {
		GetPropertyActionImpl getPropertyAction = new GetPropertyActionImpl();
		return getPropertyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetRealTimeAction createGetRealTimeAction() {
		GetRealTimeActionImpl getRealTimeAction = new GetRealTimeActionImpl();
		return getRealTimeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetFeatureStateAction createGetFeatureStateAction() {
		GetFeatureStateActionImpl getFeatureStateAction = new GetFeatureStateActionImpl();
		return getFeatureStateAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailAction createFailAction() {
		FailActionImpl failAction = new FailActionImpl();
		return failAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandAloneAction createStandAloneAction() {
		StandAloneActionImpl standAloneAction = new StandAloneActionImpl();
		return standAloneAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedConditionAction createTimedConditionAction() {
		TimedConditionActionImpl timedConditionAction = new TimedConditionActionImpl();
		return timedConditionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionReference createActionReference() {
		ActionReferenceImpl actionReference = new ActionReferenceImpl();
		return actionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAction createTimeAction() {
		TimeActionImpl timeAction = new TimeActionImpl();
		return timeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsPackage getActionsPackage() {
		return (ActionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActionsPackage getPackage() {
		return ActionsPackage.eINSTANCE;
	}

} //ActionsFactoryImpl
