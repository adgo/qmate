/**
 */
package org.tud.inf.st.mbt.actions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.tud.inf.st.mbt.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.actions.ActionsFactory
 * @model kind="package"
 * @generated
 */
public interface ActionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "actions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tud.org/mbt/actions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "actions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionsPackage eINSTANCE = org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.Action
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.PreGenerationAction <em>Pre Generation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.PreGenerationAction
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getPreGenerationAction()
	 * @generated
	 */
	int PRE_GENERATION_ACTION = 4;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.PostGenerationAction <em>Post Generation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.PostGenerationAction
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getPostGenerationAction()
	 * @generated
	 */
	int POST_GENERATION_ACTION = 5;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.PreGenerationSequenceImpl <em>Pre Generation Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.PreGenerationSequenceImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getPreGenerationSequence()
	 * @generated
	 */
	int PRE_GENERATION_SEQUENCE = 6;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.PostGenerationSequenceImpl <em>Post Generation Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.PostGenerationSequenceImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getPostGenerationSequence()
	 * @generated
	 */
	int POST_GENERATION_SEQUENCE = 7;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.TermActionImpl <em>Term Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.TermActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getTermAction()
	 * @generated
	 */
	int TERM_ACTION = 9;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.ReconfigurationActionImpl <em>Reconfiguration Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.ReconfigurationActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getReconfigurationAction()
	 * @generated
	 */
	int RECONFIGURATION_ACTION = 10;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.SetDataActionImpl <em>Set Data Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.SetDataActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getSetDataAction()
	 * @generated
	 */
	int SET_DATA_ACTION = 11;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.GetDataActionImpl <em>Get Data Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.GetDataActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getGetDataAction()
	 * @generated
	 */
	int GET_DATA_ACTION = 12;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.RemoveBagActionImpl <em>Remove Bag Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.RemoveBagActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getRemoveBagAction()
	 * @generated
	 */
	int REMOVE_BAG_ACTION = 13;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.ThrowActionImpl <em>Throw Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.ThrowActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getThrowAction()
	 * @generated
	 */
	int THROW_ACTION = 8;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.ActivateFeatureActionImpl <em>Activate Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.ActivateFeatureActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getActivateFeatureAction()
	 * @generated
	 */
	int ACTIVATE_FEATURE_ACTION = 14;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.DeactivateFeatureActionImpl <em>Deactivate Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.DeactivateFeatureActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getDeactivateFeatureAction()
	 * @generated
	 */
	int DEACTIVATE_FEATURE_ACTION = 15;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.SetPropertyActionImpl <em>Set Property Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.SetPropertyActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getSetPropertyAction()
	 * @generated
	 */
	int SET_PROPERTY_ACTION = 16;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.GetPropertyActionImpl <em>Get Property Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.GetPropertyActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getGetPropertyAction()
	 * @generated
	 */
	int GET_PROPERTY_ACTION = 20;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.FailActionImpl <em>Fail Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.FailActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getFailAction()
	 * @generated
	 */
	int FAIL_ACTION = 17;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.StandAloneActionImpl <em>Stand Alone Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.StandAloneActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getStandAloneAction()
	 * @generated
	 */
	int STAND_ALONE_ACTION = 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.TimedConditionActionImpl <em>Timed Condition Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.TimedConditionActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getTimedConditionAction()
	 * @generated
	 */
	int TIMED_CONDITION_ACTION = 3;

	/**
	 * The number of structural features of the '<em>Pre Generation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_GENERATION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.ActionReferenceImpl <em>Action Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.ActionReferenceImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getActionReference()
	 * @generated
	 */
	int ACTION_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE__ACTION = PRE_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE__PARAMETERS = PRE_GENERATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE_FEATURE_COUNT = PRE_GENERATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_ACTION__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_ACTION__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_ACTION__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_ACTION__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_ACTION__ACTION = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_ACTION__PARAMETERS = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stand Alone Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_ACTION_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONDITION_ACTION__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONDITION_ACTION__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONDITION_ACTION__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONDITION_ACTION__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONDITION_ACTION__ACTION = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONDITION_ACTION__FREQUENCY = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONDITION_ACTION__CONDITION = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timed Condition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONDITION_ACTION_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Post Generation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GENERATION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_GENERATION_SEQUENCE__ACTIONS = PRE_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pre Generation Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_GENERATION_SEQUENCE_FEATURE_COUNT = PRE_GENERATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GENERATION_SEQUENCE__ACTIONS = POST_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Post Generation Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GENERATION_SEQUENCE_FEATURE_COUNT = POST_GENERATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_ACTION__EVENT_ID = PRE_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Throw Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_ACTION_FEATURE_COUNT = PRE_GENERATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ACTION__TERM = POST_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ACTION_FEATURE_COUNT = POST_GENERATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reconfiguration Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION_FEATURE_COUNT = PRE_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DATA_ACTION__VALUES = RECONFIGURATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DATA_ACTION__NODE = RECONFIGURATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Data Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DATA_ACTION_FEATURE_COUNT = RECONFIGURATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DATA_ACTION__NODE = PRE_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Data Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DATA_ACTION_FEATURE_COUNT = PRE_GENERATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BAG_ACTION__BAG = RECONFIGURATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BAG_ACTION__INDEX = RECONFIGURATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Bag Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BAG_ACTION_FEATURE_COUNT = RECONFIGURATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_FEATURE_ACTION__FEATURE = POST_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_FEATURE_ACTION__VERSION = POST_GENERATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activate Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_FEATURE_ACTION_FEATURE_COUNT = POST_GENERATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEACTIVATE_FEATURE_ACTION__FEATURE = POST_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deactivate Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEACTIVATE_FEATURE_ACTION_FEATURE_COUNT = POST_GENERATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_ACTION__PROPERTY = POST_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_ACTION__VALUE = POST_GENERATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Property Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_ACTION_FEATURE_COUNT = POST_GENERATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.GetRealTimeActionImpl <em>Get Real Time Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.GetRealTimeActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getGetRealTimeAction()
	 * @generated
	 */
	int GET_REAL_TIME_ACTION = 21;

	/**
	 * The number of structural features of the '<em>Fail Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_ACTION_FEATURE_COUNT = POST_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.TimeActionImpl <em>Time Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.TimeActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getTimeAction()
	 * @generated
	 */
	int TIME_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ACTION__TIME = PRE_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ACTION__CONSUMER = PRE_GENERATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ACTION_FEATURE_COUNT = PRE_GENERATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.DependentAction <em>Dependent Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.DependentAction
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getDependentAction()
	 * @generated
	 */
	int DEPENDENT_ACTION = 19;

	/**
	 * The number of structural features of the '<em>Dependent Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_ACTION_FEATURE_COUNT = POST_GENERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ACTION__PROPERTY = DEPENDENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Property Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ACTION_FEATURE_COUNT = DEPENDENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_REAL_TIME_ACTION__TIME_HINT = DEPENDENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Real Time Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_REAL_TIME_ACTION_FEATURE_COUNT = DEPENDENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.actions.impl.GetFeatureStateActionImpl <em>Get Feature State Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.actions.impl.GetFeatureStateActionImpl
	 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getGetFeatureStateAction()
	 * @generated
	 */
	int GET_FEATURE_STATE_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_STATE_ACTION__FEATURE = DEPENDENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Feature State Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_STATE_ACTION_FEATURE_COUNT = DEPENDENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.PreGenerationAction <em>Pre Generation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Generation Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.PreGenerationAction
	 * @generated
	 */
	EClass getPreGenerationAction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.PostGenerationAction <em>Post Generation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Generation Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.PostGenerationAction
	 * @generated
	 */
	EClass getPostGenerationAction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.PreGenerationSequence <em>Pre Generation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Generation Sequence</em>'.
	 * @see org.tud.inf.st.mbt.actions.PreGenerationSequence
	 * @generated
	 */
	EClass getPreGenerationSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.actions.PreGenerationSequence#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.tud.inf.st.mbt.actions.PreGenerationSequence#getActions()
	 * @see #getPreGenerationSequence()
	 * @generated
	 */
	EReference getPreGenerationSequence_Actions();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.PostGenerationSequence <em>Post Generation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Generation Sequence</em>'.
	 * @see org.tud.inf.st.mbt.actions.PostGenerationSequence
	 * @generated
	 */
	EClass getPostGenerationSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.actions.PostGenerationSequence#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.tud.inf.st.mbt.actions.PostGenerationSequence#getActions()
	 * @see #getPostGenerationSequence()
	 * @generated
	 */
	EReference getPostGenerationSequence_Actions();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.TermAction <em>Term Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.TermAction
	 * @generated
	 */
	EClass getTermAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.actions.TermAction#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see org.tud.inf.st.mbt.actions.TermAction#getTerm()
	 * @see #getTermAction()
	 * @generated
	 */
	EReference getTermAction_Term();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.ReconfigurationAction <em>Reconfiguration Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.ReconfigurationAction
	 * @generated
	 */
	EClass getReconfigurationAction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.SetDataAction <em>Set Data Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Data Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.SetDataAction
	 * @generated
	 */
	EClass getSetDataAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.actions.SetDataAction#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Values</em>'.
	 * @see org.tud.inf.st.mbt.actions.SetDataAction#getValues()
	 * @see #getSetDataAction()
	 * @generated
	 */
	EReference getSetDataAction_Values();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.actions.SetDataAction#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see org.tud.inf.st.mbt.actions.SetDataAction#getNode()
	 * @see #getSetDataAction()
	 * @generated
	 */
	EReference getSetDataAction_Node();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.GetDataAction <em>Get Data Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Data Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.GetDataAction
	 * @generated
	 */
	EClass getGetDataAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.actions.GetDataAction#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see org.tud.inf.st.mbt.actions.GetDataAction#getNode()
	 * @see #getGetDataAction()
	 * @generated
	 */
	EReference getGetDataAction_Node();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.RemoveBagAction <em>Remove Bag Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Bag Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.RemoveBagAction
	 * @generated
	 */
	EClass getRemoveBagAction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.actions.RemoveBagAction#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bag</em>'.
	 * @see org.tud.inf.st.mbt.actions.RemoveBagAction#getBag()
	 * @see #getRemoveBagAction()
	 * @generated
	 */
	EReference getRemoveBagAction_Bag();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.actions.RemoveBagAction#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see org.tud.inf.st.mbt.actions.RemoveBagAction#getIndex()
	 * @see #getRemoveBagAction()
	 * @generated
	 */
	EReference getRemoveBagAction_Index();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.ThrowAction <em>Throw Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.ThrowAction
	 * @generated
	 */
	EClass getThrowAction();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.actions.ThrowAction#getEventID <em>Event ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event ID</em>'.
	 * @see org.tud.inf.st.mbt.actions.ThrowAction#getEventID()
	 * @see #getThrowAction()
	 * @generated
	 */
	EAttribute getThrowAction_EventID();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.ActivateFeatureAction <em>Activate Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activate Feature Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.ActivateFeatureAction
	 * @generated
	 */
	EClass getActivateFeatureAction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.actions.ActivateFeatureAction#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.tud.inf.st.mbt.actions.ActivateFeatureAction#getFeature()
	 * @see #getActivateFeatureAction()
	 * @generated
	 */
	EReference getActivateFeatureAction_Feature();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.actions.ActivateFeatureAction#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see org.tud.inf.st.mbt.actions.ActivateFeatureAction#getVersion()
	 * @see #getActivateFeatureAction()
	 * @generated
	 */
	EReference getActivateFeatureAction_Version();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.DeactivateFeatureAction <em>Deactivate Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deactivate Feature Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.DeactivateFeatureAction
	 * @generated
	 */
	EClass getDeactivateFeatureAction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.actions.DeactivateFeatureAction#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.tud.inf.st.mbt.actions.DeactivateFeatureAction#getFeature()
	 * @see #getDeactivateFeatureAction()
	 * @generated
	 */
	EReference getDeactivateFeatureAction_Feature();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.SetPropertyAction <em>Set Property Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Property Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.SetPropertyAction
	 * @generated
	 */
	EClass getSetPropertyAction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.actions.SetPropertyAction#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.tud.inf.st.mbt.actions.SetPropertyAction#getProperty()
	 * @see #getSetPropertyAction()
	 * @generated
	 */
	EReference getSetPropertyAction_Property();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.actions.SetPropertyAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.actions.SetPropertyAction#getValue()
	 * @see #getSetPropertyAction()
	 * @generated
	 */
	EReference getSetPropertyAction_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.GetPropertyAction <em>Get Property Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Property Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.GetPropertyAction
	 * @generated
	 */
	EClass getGetPropertyAction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.actions.GetPropertyAction#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.tud.inf.st.mbt.actions.GetPropertyAction#getProperty()
	 * @see #getGetPropertyAction()
	 * @generated
	 */
	EReference getGetPropertyAction_Property();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.GetRealTimeAction <em>Get Real Time Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Real Time Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.GetRealTimeAction
	 * @generated
	 */
	EClass getGetRealTimeAction();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.actions.GetRealTimeAction#getTimeHint <em>Time Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Hint</em>'.
	 * @see org.tud.inf.st.mbt.actions.GetRealTimeAction#getTimeHint()
	 * @see #getGetRealTimeAction()
	 * @generated
	 */
	EAttribute getGetRealTimeAction_TimeHint();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.GetFeatureStateAction <em>Get Feature State Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Feature State Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.GetFeatureStateAction
	 * @generated
	 */
	EClass getGetFeatureStateAction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.actions.GetFeatureStateAction#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.tud.inf.st.mbt.actions.GetFeatureStateAction#getFeature()
	 * @see #getGetFeatureStateAction()
	 * @generated
	 */
	EReference getGetFeatureStateAction_Feature();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.FailAction <em>Fail Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fail Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.FailAction
	 * @generated
	 */
	EClass getFailAction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.StandAloneAction <em>Stand Alone Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stand Alone Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.StandAloneAction
	 * @generated
	 */
	EClass getStandAloneAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.actions.StandAloneAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.StandAloneAction#getAction()
	 * @see #getStandAloneAction()
	 * @generated
	 */
	EReference getStandAloneAction_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.actions.StandAloneAction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.tud.inf.st.mbt.actions.StandAloneAction#getParameters()
	 * @see #getStandAloneAction()
	 * @generated
	 */
	EReference getStandAloneAction_Parameters();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.TimedConditionAction <em>Timed Condition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Condition Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.TimedConditionAction
	 * @generated
	 */
	EClass getTimedConditionAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.actions.TimedConditionAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.TimedConditionAction#getAction()
	 * @see #getTimedConditionAction()
	 * @generated
	 */
	EReference getTimedConditionAction_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.actions.TimedConditionAction#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.tud.inf.st.mbt.actions.TimedConditionAction#getFrequency()
	 * @see #getTimedConditionAction()
	 * @generated
	 */
	EAttribute getTimedConditionAction_Frequency();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.actions.TimedConditionAction#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.tud.inf.st.mbt.actions.TimedConditionAction#getCondition()
	 * @see #getTimedConditionAction()
	 * @generated
	 */
	EReference getTimedConditionAction_Condition();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.ActionReference <em>Action Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Reference</em>'.
	 * @see org.tud.inf.st.mbt.actions.ActionReference
	 * @generated
	 */
	EClass getActionReference();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.actions.ActionReference#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.ActionReference#getAction()
	 * @see #getActionReference()
	 * @generated
	 */
	EReference getActionReference_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.actions.ActionReference#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.tud.inf.st.mbt.actions.ActionReference#getParameters()
	 * @see #getActionReference()
	 * @generated
	 */
	EReference getActionReference_Parameters();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.TimeAction <em>Time Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.TimeAction
	 * @generated
	 */
	EClass getTimeAction();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.actions.TimeAction#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tud.inf.st.mbt.actions.TimeAction#getTime()
	 * @see #getTimeAction()
	 * @generated
	 */
	EAttribute getTimeAction_Time();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.actions.TimeAction#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumer</em>'.
	 * @see org.tud.inf.st.mbt.actions.TimeAction#getConsumer()
	 * @see #getTimeAction()
	 * @generated
	 */
	EReference getTimeAction_Consumer();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.actions.DependentAction <em>Dependent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Action</em>'.
	 * @see org.tud.inf.st.mbt.actions.DependentAction
	 * @generated
	 */
	EClass getDependentAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActionsFactory getActionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.Action
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.PreGenerationAction <em>Pre Generation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.PreGenerationAction
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getPreGenerationAction()
		 * @generated
		 */
		EClass PRE_GENERATION_ACTION = eINSTANCE.getPreGenerationAction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.PostGenerationAction <em>Post Generation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.PostGenerationAction
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getPostGenerationAction()
		 * @generated
		 */
		EClass POST_GENERATION_ACTION = eINSTANCE.getPostGenerationAction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.PreGenerationSequenceImpl <em>Pre Generation Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.PreGenerationSequenceImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getPreGenerationSequence()
		 * @generated
		 */
		EClass PRE_GENERATION_SEQUENCE = eINSTANCE.getPreGenerationSequence();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_GENERATION_SEQUENCE__ACTIONS = eINSTANCE.getPreGenerationSequence_Actions();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.PostGenerationSequenceImpl <em>Post Generation Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.PostGenerationSequenceImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getPostGenerationSequence()
		 * @generated
		 */
		EClass POST_GENERATION_SEQUENCE = eINSTANCE.getPostGenerationSequence();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_GENERATION_SEQUENCE__ACTIONS = eINSTANCE.getPostGenerationSequence_Actions();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.TermActionImpl <em>Term Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.TermActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getTermAction()
		 * @generated
		 */
		EClass TERM_ACTION = eINSTANCE.getTermAction();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_ACTION__TERM = eINSTANCE.getTermAction_Term();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.ReconfigurationActionImpl <em>Reconfiguration Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.ReconfigurationActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getReconfigurationAction()
		 * @generated
		 */
		EClass RECONFIGURATION_ACTION = eINSTANCE.getReconfigurationAction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.SetDataActionImpl <em>Set Data Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.SetDataActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getSetDataAction()
		 * @generated
		 */
		EClass SET_DATA_ACTION = eINSTANCE.getSetDataAction();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_DATA_ACTION__VALUES = eINSTANCE.getSetDataAction_Values();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_DATA_ACTION__NODE = eINSTANCE.getSetDataAction_Node();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.GetDataActionImpl <em>Get Data Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.GetDataActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getGetDataAction()
		 * @generated
		 */
		EClass GET_DATA_ACTION = eINSTANCE.getGetDataAction();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_DATA_ACTION__NODE = eINSTANCE.getGetDataAction_Node();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.RemoveBagActionImpl <em>Remove Bag Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.RemoveBagActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getRemoveBagAction()
		 * @generated
		 */
		EClass REMOVE_BAG_ACTION = eINSTANCE.getRemoveBagAction();

		/**
		 * The meta object literal for the '<em><b>Bag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_BAG_ACTION__BAG = eINSTANCE.getRemoveBagAction_Bag();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_BAG_ACTION__INDEX = eINSTANCE.getRemoveBagAction_Index();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.ThrowActionImpl <em>Throw Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.ThrowActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getThrowAction()
		 * @generated
		 */
		EClass THROW_ACTION = eINSTANCE.getThrowAction();

		/**
		 * The meta object literal for the '<em><b>Event ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROW_ACTION__EVENT_ID = eINSTANCE.getThrowAction_EventID();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.ActivateFeatureActionImpl <em>Activate Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.ActivateFeatureActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getActivateFeatureAction()
		 * @generated
		 */
		EClass ACTIVATE_FEATURE_ACTION = eINSTANCE.getActivateFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATE_FEATURE_ACTION__FEATURE = eINSTANCE.getActivateFeatureAction_Feature();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATE_FEATURE_ACTION__VERSION = eINSTANCE.getActivateFeatureAction_Version();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.DeactivateFeatureActionImpl <em>Deactivate Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.DeactivateFeatureActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getDeactivateFeatureAction()
		 * @generated
		 */
		EClass DEACTIVATE_FEATURE_ACTION = eINSTANCE.getDeactivateFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEACTIVATE_FEATURE_ACTION__FEATURE = eINSTANCE.getDeactivateFeatureAction_Feature();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.SetPropertyActionImpl <em>Set Property Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.SetPropertyActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getSetPropertyAction()
		 * @generated
		 */
		EClass SET_PROPERTY_ACTION = eINSTANCE.getSetPropertyAction();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_PROPERTY_ACTION__PROPERTY = eINSTANCE.getSetPropertyAction_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_PROPERTY_ACTION__VALUE = eINSTANCE.getSetPropertyAction_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.GetPropertyActionImpl <em>Get Property Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.GetPropertyActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getGetPropertyAction()
		 * @generated
		 */
		EClass GET_PROPERTY_ACTION = eINSTANCE.getGetPropertyAction();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_PROPERTY_ACTION__PROPERTY = eINSTANCE.getGetPropertyAction_Property();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.GetRealTimeActionImpl <em>Get Real Time Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.GetRealTimeActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getGetRealTimeAction()
		 * @generated
		 */
		EClass GET_REAL_TIME_ACTION = eINSTANCE.getGetRealTimeAction();

		/**
		 * The meta object literal for the '<em><b>Time Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_REAL_TIME_ACTION__TIME_HINT = eINSTANCE.getGetRealTimeAction_TimeHint();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.GetFeatureStateActionImpl <em>Get Feature State Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.GetFeatureStateActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getGetFeatureStateAction()
		 * @generated
		 */
		EClass GET_FEATURE_STATE_ACTION = eINSTANCE.getGetFeatureStateAction();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_FEATURE_STATE_ACTION__FEATURE = eINSTANCE.getGetFeatureStateAction_Feature();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.FailActionImpl <em>Fail Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.FailActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getFailAction()
		 * @generated
		 */
		EClass FAIL_ACTION = eINSTANCE.getFailAction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.StandAloneActionImpl <em>Stand Alone Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.StandAloneActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getStandAloneAction()
		 * @generated
		 */
		EClass STAND_ALONE_ACTION = eINSTANCE.getStandAloneAction();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAND_ALONE_ACTION__ACTION = eINSTANCE.getStandAloneAction_Action();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAND_ALONE_ACTION__PARAMETERS = eINSTANCE.getStandAloneAction_Parameters();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.TimedConditionActionImpl <em>Timed Condition Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.TimedConditionActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getTimedConditionAction()
		 * @generated
		 */
		EClass TIMED_CONDITION_ACTION = eINSTANCE.getTimedConditionAction();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_CONDITION_ACTION__ACTION = eINSTANCE.getTimedConditionAction_Action();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_CONDITION_ACTION__FREQUENCY = eINSTANCE.getTimedConditionAction_Frequency();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_CONDITION_ACTION__CONDITION = eINSTANCE.getTimedConditionAction_Condition();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.ActionReferenceImpl <em>Action Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.ActionReferenceImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getActionReference()
		 * @generated
		 */
		EClass ACTION_REFERENCE = eINSTANCE.getActionReference();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_REFERENCE__ACTION = eINSTANCE.getActionReference_Action();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_REFERENCE__PARAMETERS = eINSTANCE.getActionReference_Parameters();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.impl.TimeActionImpl <em>Time Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.impl.TimeActionImpl
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getTimeAction()
		 * @generated
		 */
		EClass TIME_ACTION = eINSTANCE.getTimeAction();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ACTION__TIME = eINSTANCE.getTimeAction_Time();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ACTION__CONSUMER = eINSTANCE.getTimeAction_Consumer();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.actions.DependentAction <em>Dependent Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.actions.DependentAction
		 * @see org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl#getDependentAction()
		 * @generated
		 */
		EClass DEPENDENT_ACTION = eINSTANCE.getDependentAction();

	}

} //ActionsPackage
