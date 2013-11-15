/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory
 * @model kind="package"
 * @generated
 */
public interface GuigraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "guigraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tud.org/mbt/guigraph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuigraphPackage eINSTANCE = org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.GuiGraphImpl <em>Gui Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuiGraphImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getGuiGraph()
	 * @generated
	 */
	int GUI_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH__ARCS = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH__NODES = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH__INVARIANT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invariant Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH__INVARIANT_TEXT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gui Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.WidgetImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CHILDREN = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__IMAGE = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode <em>Gui Graph Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getGuiGraphNode()
	 * @generated
	 */
	int GUI_GRAPH_NODE = 4;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.FormImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TRACEABLE_TO = WIDGET__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CHILDREN = WIDGET__CHILDREN;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__IMAGE = WIDGET__IMAGE;

	/**
	 * The feature id for the '<em><b>Map To Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__MAP_TO_PAGE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Gui Graph Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.TransitionImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NOTE = GUI_GRAPH_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = GUI_GRAPH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRACEABLE_TO = GUI_GRAPH_NODE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = GUI_GRAPH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RATE = GUI_GRAPH_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FAULT_IMPACT = GUI_GRAPH_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FAULT_PROBABILITY = GUI_GRAPH_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Terminates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TERMINATES = GUI_GRAPH_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TIME_MIN = GUI_GRAPH_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TIME_MAX = GUI_GRAPH_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Timing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TIMING_TYPE = GUI_GRAPH_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = GUI_GRAPH_NODE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.PlaceImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 6;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NOTE = GUI_GRAPH_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = GUI_GRAPH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TRACEABLE_TO = GUI_GRAPH_NODE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = GUI_GRAPH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Map To Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__MAP_TO_PAGE = GUI_GRAPH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = GUI_GRAPH_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.NoWidgetNodeImpl <em>No Widget Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.NoWidgetNodeImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getNoWidgetNode()
	 * @generated
	 */
	int NO_WIDGET_NODE = 5;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_WIDGET_NODE__NOTE = PLACE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_WIDGET_NODE__ID = PLACE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_WIDGET_NODE__TRACEABLE_TO = PLACE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_WIDGET_NODE__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Map To Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_WIDGET_NODE__MAP_TO_PAGE = PLACE__MAP_TO_PAGE;

	/**
	 * The feature id for the '<em><b>Initial Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_WIDGET_NODE__INITIAL_TOKENS = PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>No Widget Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_WIDGET_NODE_FEATURE_COUNT = PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.ConditionActionTransitionImpl <em>Condition Action Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.ConditionActionTransitionImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getConditionActionTransition()
	 * @generated
	 */
	int CONDITION_ACTION_TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__NOTE = TRANSITION__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__ID = TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__TRACEABLE_TO = TRANSITION__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__RATE = TRANSITION__RATE;

	/**
	 * The feature id for the '<em><b>Fault Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__FAULT_IMPACT = TRANSITION__FAULT_IMPACT;

	/**
	 * The feature id for the '<em><b>Fault Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__FAULT_PROBABILITY = TRANSITION__FAULT_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Terminates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__TERMINATES = TRANSITION__TERMINATES;

	/**
	 * The feature id for the '<em><b>Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__TIME_MIN = TRANSITION__TIME_MIN;

	/**
	 * The feature id for the '<em><b>Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__TIME_MAX = TRANSITION__TIME_MAX;

	/**
	 * The feature id for the '<em><b>Timing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__TIMING_TYPE = TRANSITION__TIMING_TYPE;

	/**
	 * The feature id for the '<em><b>Application Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__ACTIONS = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Application Condition Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION_TEXT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actions Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION__ACTIONS_TEXT = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Condition Action Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.TimerTransitionImpl <em>Timer Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.TimerTransitionImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getTimerTransition()
	 * @generated
	 */
	int TIMER_TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__NOTE = TRANSITION__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__ID = TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__TRACEABLE_TO = TRANSITION__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__RATE = TRANSITION__RATE;

	/**
	 * The feature id for the '<em><b>Fault Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__FAULT_IMPACT = TRANSITION__FAULT_IMPACT;

	/**
	 * The feature id for the '<em><b>Fault Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__FAULT_PROBABILITY = TRANSITION__FAULT_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Terminates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__TERMINATES = TRANSITION__TERMINATES;

	/**
	 * The feature id for the '<em><b>Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__TIME_MIN = TRANSITION__TIME_MIN;

	/**
	 * The feature id for the '<em><b>Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__TIME_MAX = TRANSITION__TIME_MAX;

	/**
	 * The feature id for the '<em><b>Timing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__TIMING_TYPE = TRANSITION__TIMING_TYPE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__DURATION = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION__CONSUMER = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timer Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.ArcImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 9;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.StandardArcImpl <em>Standard Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.StandardArcImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getStandardArc()
	 * @generated
	 */
	int STANDARD_ARC = 10;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ARC__NOTE = ARC__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ARC__ID = ARC__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ARC__TRACEABLE_TO = ARC__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ARC__NAME = ARC__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ARC__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ARC__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ARC__WEIGHT = ARC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.InhibitorArcImpl <em>Inhibitor Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.InhibitorArcImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getInhibitorArc()
	 * @generated
	 */
	int INHIBITOR_ARC = 11;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_ARC__NOTE = ARC__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_ARC__ID = ARC__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_ARC__TRACEABLE_TO = ARC__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_ARC__NAME = ARC__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_ARC__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_ARC__TARGET = ARC__TARGET;

	/**
	 * The number of structural features of the '<em>Inhibitor Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.PageTransitionImpl <em>Page Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.PageTransitionImpl
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getPageTransition()
	 * @generated
	 */
	int PAGE_TRANSITION = 12;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__NOTE = TRANSITION__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__ID = TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__TRACEABLE_TO = TRANSITION__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__RATE = TRANSITION__RATE;

	/**
	 * The feature id for the '<em><b>Fault Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__FAULT_IMPACT = TRANSITION__FAULT_IMPACT;

	/**
	 * The feature id for the '<em><b>Fault Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__FAULT_PROBABILITY = TRANSITION__FAULT_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Terminates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__TERMINATES = TRANSITION__TERMINATES;

	/**
	 * The feature id for the '<em><b>Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__TIME_MIN = TRANSITION__TIME_MIN;

	/**
	 * The feature id for the '<em><b>Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__TIME_MAX = TRANSITION__TIME_MAX;

	/**
	 * The feature id for the '<em><b>Timing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__TIMING_TYPE = TRANSITION__TIMING_TYPE;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION__PAGE = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.ulang.guigraph.TimingType <em>Timing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.ulang.guigraph.TimingType
	 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getTimingType()
	 * @generated
	 */
	int TIMING_TYPE = 13;

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph <em>Gui Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Graph</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuiGraph
	 * @generated
	 */
	EClass getGuiGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getArcs()
	 * @see #getGuiGraph()
	 * @generated
	 */
	EReference getGuiGraph_Arcs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getNodes()
	 * @see #getGuiGraph()
	 * @generated
	 */
	EReference getGuiGraph_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invariant</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getInvariant()
	 * @see #getGuiGraph()
	 * @generated
	 */
	EReference getGuiGraph_Invariant();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getInvariantText <em>Invariant Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invariant Text</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getInvariantText()
	 * @see #getGuiGraph()
	 * @generated
	 */
	EAttribute getGuiGraph_InvariantText();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.ulang.guigraph.Widget#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Widget#getChildren()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.Widget#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Widget#getImage()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Image();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Transition#getRate()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Rate();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getFaultImpact <em>Fault Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Impact</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Transition#getFaultImpact()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_FaultImpact();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getFaultProbability <em>Fault Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Probability</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Transition#getFaultProbability()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_FaultProbability();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#isTerminates <em>Terminates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminates</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Transition#isTerminates()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Terminates();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimeMin <em>Time Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Min</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimeMin()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_TimeMin();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimeMax <em>Time Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Max</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimeMax()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_TimeMax();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimingType <em>Timing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timing Type</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimingType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_TimingType();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode <em>Gui Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Graph Node</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode
	 * @generated
	 */
	EClass getGuiGraphNode();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode <em>No Widget Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Widget Node</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode
	 * @generated
	 */
	EClass getNoWidgetNode();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode#getInitialTokens <em>Initial Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Tokens</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode#getInitialTokens()
	 * @see #getNoWidgetNode()
	 * @generated
	 */
	EAttribute getNoWidgetNode_InitialTokens();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.Place#isMapToPage <em>Map To Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map To Page</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Place#isMapToPage()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_MapToPage();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition <em>Condition Action Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Action Transition</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition
	 * @generated
	 */
	EClass getConditionActionTransition();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getApplicationCondition <em>Application Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Condition</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getApplicationCondition()
	 * @see #getConditionActionTransition()
	 * @generated
	 */
	EReference getConditionActionTransition_ApplicationCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actions</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getActions()
	 * @see #getConditionActionTransition()
	 * @generated
	 */
	EReference getConditionActionTransition_Actions();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getApplicationConditionText <em>Application Condition Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Condition Text</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getApplicationConditionText()
	 * @see #getConditionActionTransition()
	 * @generated
	 */
	EAttribute getConditionActionTransition_ApplicationConditionText();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getActionsText <em>Actions Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions Text</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getActionsText()
	 * @see #getConditionActionTransition()
	 * @generated
	 */
	EAttribute getConditionActionTransition_ActionsText();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.TimerTransition <em>Timer Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Transition</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.TimerTransition
	 * @generated
	 */
	EClass getTimerTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.TimerTransition#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.TimerTransition#getDuration()
	 * @see #getTimerTransition()
	 * @generated
	 */
	EAttribute getTimerTransition_Duration();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.ulang.guigraph.TimerTransition#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumer</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.TimerTransition#getConsumer()
	 * @see #getTimerTransition()
	 * @generated
	 */
	EReference getTimerTransition_Consumer();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.ulang.guigraph.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Source();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.ulang.guigraph.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Target();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.StandardArc <em>Standard Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Arc</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.StandardArc
	 * @generated
	 */
	EClass getStandardArc();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.ulang.guigraph.StandardArc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.StandardArc#getWeight()
	 * @see #getStandardArc()
	 * @generated
	 */
	EAttribute getStandardArc_Weight();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.InhibitorArc <em>Inhibitor Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inhibitor Arc</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.InhibitorArc
	 * @generated
	 */
	EClass getInhibitorArc();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.ulang.guigraph.PageTransition <em>Page Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Transition</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.PageTransition
	 * @generated
	 */
	EClass getPageTransition();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.ulang.guigraph.PageTransition#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.PageTransition#getPage()
	 * @see #getPageTransition()
	 * @generated
	 */
	EReference getPageTransition_Page();

	/**
	 * Returns the meta object for enum '{@link org.tud.inf.st.mbt.ulang.guigraph.TimingType <em>Timing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Type</em>'.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.TimingType
	 * @generated
	 */
	EEnum getTimingType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GuigraphFactory getGuigraphFactory();

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
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.GuiGraphImpl <em>Gui Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuiGraphImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getGuiGraph()
		 * @generated
		 */
		EClass GUI_GRAPH = eINSTANCE.getGuiGraph();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_GRAPH__ARCS = eINSTANCE.getGuiGraph_Arcs();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_GRAPH__NODES = eINSTANCE.getGuiGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_GRAPH__INVARIANT = eINSTANCE.getGuiGraph_Invariant();

		/**
		 * The meta object literal for the '<em><b>Invariant Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_GRAPH__INVARIANT_TEXT = eINSTANCE.getGuiGraph_InvariantText();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.WidgetImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__CHILDREN = eINSTANCE.getWidget_Children();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__IMAGE = eINSTANCE.getWidget_Image();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.FormImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.TransitionImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__RATE = eINSTANCE.getTransition_Rate();

		/**
		 * The meta object literal for the '<em><b>Fault Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__FAULT_IMPACT = eINSTANCE.getTransition_FaultImpact();

		/**
		 * The meta object literal for the '<em><b>Fault Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__FAULT_PROBABILITY = eINSTANCE.getTransition_FaultProbability();

		/**
		 * The meta object literal for the '<em><b>Terminates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TERMINATES = eINSTANCE.getTransition_Terminates();

		/**
		 * The meta object literal for the '<em><b>Time Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TIME_MIN = eINSTANCE.getTransition_TimeMin();

		/**
		 * The meta object literal for the '<em><b>Time Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TIME_MAX = eINSTANCE.getTransition_TimeMax();

		/**
		 * The meta object literal for the '<em><b>Timing Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TIMING_TYPE = eINSTANCE.getTransition_TimingType();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode <em>Gui Graph Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getGuiGraphNode()
		 * @generated
		 */
		EClass GUI_GRAPH_NODE = eINSTANCE.getGuiGraphNode();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.NoWidgetNodeImpl <em>No Widget Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.NoWidgetNodeImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getNoWidgetNode()
		 * @generated
		 */
		EClass NO_WIDGET_NODE = eINSTANCE.getNoWidgetNode();

		/**
		 * The meta object literal for the '<em><b>Initial Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_WIDGET_NODE__INITIAL_TOKENS = eINSTANCE.getNoWidgetNode_InitialTokens();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.PlaceImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Map To Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__MAP_TO_PAGE = eINSTANCE.getPlace_MapToPage();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.ConditionActionTransitionImpl <em>Condition Action Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.ConditionActionTransitionImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getConditionActionTransition()
		 * @generated
		 */
		EClass CONDITION_ACTION_TRANSITION = eINSTANCE.getConditionActionTransition();

		/**
		 * The meta object literal for the '<em><b>Application Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION = eINSTANCE.getConditionActionTransition_ApplicationCondition();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ACTION_TRANSITION__ACTIONS = eINSTANCE.getConditionActionTransition_Actions();

		/**
		 * The meta object literal for the '<em><b>Application Condition Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION_TEXT = eINSTANCE.getConditionActionTransition_ApplicationConditionText();

		/**
		 * The meta object literal for the '<em><b>Actions Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_ACTION_TRANSITION__ACTIONS_TEXT = eINSTANCE.getConditionActionTransition_ActionsText();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.TimerTransitionImpl <em>Timer Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.TimerTransitionImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getTimerTransition()
		 * @generated
		 */
		EClass TIMER_TRANSITION = eINSTANCE.getTimerTransition();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER_TRANSITION__DURATION = eINSTANCE.getTimerTransition_Duration();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_TRANSITION__CONSUMER = eINSTANCE.getTimerTransition_Consumer();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.ArcImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.StandardArcImpl <em>Standard Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.StandardArcImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getStandardArc()
		 * @generated
		 */
		EClass STANDARD_ARC = eINSTANCE.getStandardArc();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_ARC__WEIGHT = eINSTANCE.getStandardArc_Weight();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.InhibitorArcImpl <em>Inhibitor Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.InhibitorArcImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getInhibitorArc()
		 * @generated
		 */
		EClass INHIBITOR_ARC = eINSTANCE.getInhibitorArc();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.impl.PageTransitionImpl <em>Page Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.PageTransitionImpl
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getPageTransition()
		 * @generated
		 */
		EClass PAGE_TRANSITION = eINSTANCE.getPageTransition();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_TRANSITION__PAGE = eINSTANCE.getPageTransition_Page();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.ulang.guigraph.TimingType <em>Timing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.ulang.guigraph.TimingType
		 * @see org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl#getTimingType()
		 * @generated
		 */
		EEnum TIMING_TYPE = eINSTANCE.getTimingType();

	}

} //GuigraphPackage
