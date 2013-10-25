/**
 */
package org.tud.inf.st.mbt.ocm;

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
 * @see org.tud.inf.st.mbt.ocm.OcmFactory
 * @model kind="package"
 * @generated
 */
public interface OcmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ocm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tud.org/mbt/ocm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ocm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OcmPackage eINSTANCE = org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ocm.impl.OperationalConfigurationModelImpl <em>Operational Configuration Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ocm.impl.OperationalConfigurationModelImpl
	 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getOperationalConfigurationModel()
	 * @generated
	 */
	int OPERATIONAL_CONFIGURATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONFIGURATION_MODEL__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONFIGURATION_MODEL__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONFIGURATION_MODEL__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONFIGURATION_MODEL__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONFIGURATION_MODEL__EDGES = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONFIGURATION_MODEL__NODES = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONFIGURATION_MODEL__START = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operational Configuration Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONFIGURATION_MODEL_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ocm.impl.ConfigurationNodeImpl <em>Configuration Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ocm.impl.ConfigurationNodeImpl
	 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getConfigurationNode()
	 * @generated
	 */
	int CONFIGURATION_NODE = 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_NODE__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_NODE__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_NODE__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_NODE__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Post Conf Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_NODE__POST_CONF_EVENT_ID = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_NODE_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ocm.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ocm.impl.EdgeImpl
	 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 5;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ocm.impl.OperationalEdgeImpl <em>Operational Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ocm.impl.OperationalEdgeImpl
	 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getOperationalEdge()
	 * @generated
	 */
	int OPERATIONAL_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_EDGE__NOTE = EDGE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_EDGE__ID = EDGE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_EDGE__TRACEABLE_TO = EDGE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_EDGE__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_EDGE__SOURCE = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_EDGE__TARGET = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operational Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ocm.impl.StandardConfigurationNodeImpl <em>Standard Configuration Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ocm.impl.StandardConfigurationNodeImpl
	 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getStandardConfigurationNode()
	 * @generated
	 */
	int STANDARD_CONFIGURATION_NODE = 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CONFIGURATION_NODE__NOTE = CONFIGURATION_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CONFIGURATION_NODE__ID = CONFIGURATION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CONFIGURATION_NODE__TRACEABLE_TO = CONFIGURATION_NODE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CONFIGURATION_NODE__NAME = CONFIGURATION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Post Conf Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CONFIGURATION_NODE__POST_CONF_EVENT_ID = CONFIGURATION_NODE__POST_CONF_EVENT_ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CONFIGURATION_NODE__CONFIGURATION = CONFIGURATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Configuration Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CONFIGURATION_NODE_FEATURE_COUNT = CONFIGURATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ocm.impl.ReconfigurationActionNodeImpl <em>Reconfiguration Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ocm.impl.ReconfigurationActionNodeImpl
	 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getReconfigurationActionNode()
	 * @generated
	 */
	int RECONFIGURATION_ACTION_NODE = 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION_NODE__NOTE = CONFIGURATION_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION_NODE__ID = CONFIGURATION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION_NODE__TRACEABLE_TO = CONFIGURATION_NODE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION_NODE__NAME = CONFIGURATION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Post Conf Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION_NODE__POST_CONF_EVENT_ID = CONFIGURATION_NODE__POST_CONF_EVENT_ID;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION_NODE__ACTIONS = CONFIGURATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION_NODE__ACTIONS_TEXT = CONFIGURATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reconfiguration Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION_NODE_FEATURE_COUNT = CONFIGURATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ocm.impl.TimedEdgeImpl <em>Timed Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ocm.impl.TimedEdgeImpl
	 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getTimedEdge()
	 * @generated
	 */
	int TIMED_EDGE = 6;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EDGE__NOTE = OPERATIONAL_EDGE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EDGE__ID = OPERATIONAL_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EDGE__TRACEABLE_TO = OPERATIONAL_EDGE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EDGE__NAME = OPERATIONAL_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EDGE__SOURCE = OPERATIONAL_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EDGE__TARGET = OPERATIONAL_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EDGE__DURATION = OPERATIONAL_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EDGE_FEATURE_COUNT = OPERATIONAL_EDGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ocm.impl.EventGuardedEdgeImpl <em>Event Guarded Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ocm.impl.EventGuardedEdgeImpl
	 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getEventGuardedEdge()
	 * @generated
	 */
	int EVENT_GUARDED_EDGE = 7;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARDED_EDGE__NOTE = OPERATIONAL_EDGE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARDED_EDGE__ID = OPERATIONAL_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARDED_EDGE__TRACEABLE_TO = OPERATIONAL_EDGE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARDED_EDGE__NAME = OPERATIONAL_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARDED_EDGE__SOURCE = OPERATIONAL_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARDED_EDGE__TARGET = OPERATIONAL_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Guard Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARDED_EDGE__GUARD_EVENT_ID = OPERATIONAL_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Guarded Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARDED_EDGE_FEATURE_COUNT = OPERATIONAL_EDGE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ocm.OperationalConfigurationModel <em>Operational Configuration Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Configuration Model</em>'.
	 * @see org.tud.inf.st.mbt.ocm.OperationalConfigurationModel
	 * @generated
	 */
	EClass getOperationalConfigurationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.ocm.OperationalConfigurationModel#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see org.tud.inf.st.mbt.ocm.OperationalConfigurationModel#getEdges()
	 * @see #getOperationalConfigurationModel()
	 * @generated
	 */
	EReference getOperationalConfigurationModel_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.ocm.OperationalConfigurationModel#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.tud.inf.st.mbt.ocm.OperationalConfigurationModel#getNodes()
	 * @see #getOperationalConfigurationModel()
	 * @generated
	 */
	EReference getOperationalConfigurationModel_Nodes();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.ocm.OperationalConfigurationModel#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.tud.inf.st.mbt.ocm.OperationalConfigurationModel#getStart()
	 * @see #getOperationalConfigurationModel()
	 * @generated
	 */
	EReference getOperationalConfigurationModel_Start();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ocm.ConfigurationNode <em>Configuration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Node</em>'.
	 * @see org.tud.inf.st.mbt.ocm.ConfigurationNode
	 * @generated
	 */
	EClass getConfigurationNode();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ocm.ConfigurationNode#getPostConfEventID <em>Post Conf Event ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Conf Event ID</em>'.
	 * @see org.tud.inf.st.mbt.ocm.ConfigurationNode#getPostConfEventID()
	 * @see #getConfigurationNode()
	 * @generated
	 */
	EAttribute getConfigurationNode_PostConfEventID();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ocm.OperationalEdge <em>Operational Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Edge</em>'.
	 * @see org.tud.inf.st.mbt.ocm.OperationalEdge
	 * @generated
	 */
	EClass getOperationalEdge();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.ocm.OperationalEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.tud.inf.st.mbt.ocm.OperationalEdge#getSource()
	 * @see #getOperationalEdge()
	 * @generated
	 */
	EReference getOperationalEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.ocm.OperationalEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.tud.inf.st.mbt.ocm.OperationalEdge#getTarget()
	 * @see #getOperationalEdge()
	 * @generated
	 */
	EReference getOperationalEdge_Target();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ocm.StandardConfigurationNode <em>Standard Configuration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Configuration Node</em>'.
	 * @see org.tud.inf.st.mbt.ocm.StandardConfigurationNode
	 * @generated
	 */
	EClass getStandardConfigurationNode();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.ocm.StandardConfigurationNode#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see org.tud.inf.st.mbt.ocm.StandardConfigurationNode#getConfiguration()
	 * @see #getStandardConfigurationNode()
	 * @generated
	 */
	EReference getStandardConfigurationNode_Configuration();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ocm.ReconfigurationActionNode <em>Reconfiguration Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Action Node</em>'.
	 * @see org.tud.inf.st.mbt.ocm.ReconfigurationActionNode
	 * @generated
	 */
	EClass getReconfigurationActionNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.ocm.ReconfigurationActionNode#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.tud.inf.st.mbt.ocm.ReconfigurationActionNode#getActions()
	 * @see #getReconfigurationActionNode()
	 * @generated
	 */
	EReference getReconfigurationActionNode_Actions();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ocm.ReconfigurationActionNode#getActionsText <em>Actions Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions Text</em>'.
	 * @see org.tud.inf.st.mbt.ocm.ReconfigurationActionNode#getActionsText()
	 * @see #getReconfigurationActionNode()
	 * @generated
	 */
	EAttribute getReconfigurationActionNode_ActionsText();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ocm.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.tud.inf.st.mbt.ocm.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ocm.TimedEdge <em>Timed Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Edge</em>'.
	 * @see org.tud.inf.st.mbt.ocm.TimedEdge
	 * @generated
	 */
	EClass getTimedEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ocm.TimedEdge#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.tud.inf.st.mbt.ocm.TimedEdge#getDuration()
	 * @see #getTimedEdge()
	 * @generated
	 */
	EAttribute getTimedEdge_Duration();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ocm.EventGuardedEdge <em>Event Guarded Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Guarded Edge</em>'.
	 * @see org.tud.inf.st.mbt.ocm.EventGuardedEdge
	 * @generated
	 */
	EClass getEventGuardedEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ocm.EventGuardedEdge#getGuardEventID <em>Guard Event ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Event ID</em>'.
	 * @see org.tud.inf.st.mbt.ocm.EventGuardedEdge#getGuardEventID()
	 * @see #getEventGuardedEdge()
	 * @generated
	 */
	EAttribute getEventGuardedEdge_GuardEventID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OcmFactory getOcmFactory();

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
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ocm.impl.OperationalConfigurationModelImpl <em>Operational Configuration Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ocm.impl.OperationalConfigurationModelImpl
		 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getOperationalConfigurationModel()
		 * @generated
		 */
		EClass OPERATIONAL_CONFIGURATION_MODEL = eINSTANCE.getOperationalConfigurationModel();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_CONFIGURATION_MODEL__EDGES = eINSTANCE.getOperationalConfigurationModel_Edges();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_CONFIGURATION_MODEL__NODES = eINSTANCE.getOperationalConfigurationModel_Nodes();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_CONFIGURATION_MODEL__START = eINSTANCE.getOperationalConfigurationModel_Start();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ocm.impl.ConfigurationNodeImpl <em>Configuration Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ocm.impl.ConfigurationNodeImpl
		 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getConfigurationNode()
		 * @generated
		 */
		EClass CONFIGURATION_NODE = eINSTANCE.getConfigurationNode();

		/**
		 * The meta object literal for the '<em><b>Post Conf Event ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_NODE__POST_CONF_EVENT_ID = eINSTANCE.getConfigurationNode_PostConfEventID();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ocm.impl.OperationalEdgeImpl <em>Operational Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ocm.impl.OperationalEdgeImpl
		 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getOperationalEdge()
		 * @generated
		 */
		EClass OPERATIONAL_EDGE = eINSTANCE.getOperationalEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_EDGE__SOURCE = eINSTANCE.getOperationalEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_EDGE__TARGET = eINSTANCE.getOperationalEdge_Target();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ocm.impl.StandardConfigurationNodeImpl <em>Standard Configuration Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ocm.impl.StandardConfigurationNodeImpl
		 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getStandardConfigurationNode()
		 * @generated
		 */
		EClass STANDARD_CONFIGURATION_NODE = eINSTANCE.getStandardConfigurationNode();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_CONFIGURATION_NODE__CONFIGURATION = eINSTANCE.getStandardConfigurationNode_Configuration();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ocm.impl.ReconfigurationActionNodeImpl <em>Reconfiguration Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ocm.impl.ReconfigurationActionNodeImpl
		 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getReconfigurationActionNode()
		 * @generated
		 */
		EClass RECONFIGURATION_ACTION_NODE = eINSTANCE.getReconfigurationActionNode();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_ACTION_NODE__ACTIONS = eINSTANCE.getReconfigurationActionNode_Actions();

		/**
		 * The meta object literal for the '<em><b>Actions Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION_ACTION_NODE__ACTIONS_TEXT = eINSTANCE.getReconfigurationActionNode_ActionsText();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ocm.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ocm.impl.EdgeImpl
		 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ocm.impl.TimedEdgeImpl <em>Timed Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ocm.impl.TimedEdgeImpl
		 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getTimedEdge()
		 * @generated
		 */
		EClass TIMED_EDGE = eINSTANCE.getTimedEdge();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_EDGE__DURATION = eINSTANCE.getTimedEdge_Duration();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ocm.impl.EventGuardedEdgeImpl <em>Event Guarded Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ocm.impl.EventGuardedEdgeImpl
		 * @see org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl#getEventGuardedEdge()
		 * @generated
		 */
		EClass EVENT_GUARDED_EDGE = eINSTANCE.getEventGuardedEdge();

		/**
		 * The meta object literal for the '<em><b>Guard Event ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_GUARDED_EDGE__GUARD_EVENT_ID = eINSTANCE.getEventGuardedEdge_GuardEventID();

	}

} //OcmPackage
