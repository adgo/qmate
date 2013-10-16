/**
 */
package org.tud.inf.st.mbt.data;

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
 * @see org.tud.inf.st.mbt.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tud.org/mbt/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = org.tud.inf.st.mbt.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.DataStructureNodeImpl <em>Structure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.DataStructureNodeImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataStructureNode()
	 * @generated
	 */
	int DATA_STRUCTURE_NODE = 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_NODE__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_NODE__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_NODE__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_NODE__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Structure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_NODE_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.DataStructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.DataStructureImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataStructure()
	 * @generated
	 */
	int DATA_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__NOTE = DATA_STRUCTURE_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__ID = DATA_STRUCTURE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__TRACEABLE_TO = DATA_STRUCTURE_NODE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__NAME = DATA_STRUCTURE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__CHILDREN = DATA_STRUCTURE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_FEATURE_COUNT = DATA_STRUCTURE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.DataLeafImpl <em>Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.DataLeafImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataLeaf()
	 * @generated
	 */
	int DATA_LEAF = 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LEAF__NOTE = DATA_STRUCTURE_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LEAF__ID = DATA_STRUCTURE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LEAF__TRACEABLE_TO = DATA_STRUCTURE_NODE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LEAF__NAME = DATA_STRUCTURE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LEAF__DOMAIN = DATA_STRUCTURE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Causal Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LEAF__CAUSAL_LINK_TYPE = DATA_STRUCTURE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LEAF_FEATURE_COUNT = DATA_STRUCTURE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.DataElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.DataElementImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.DataClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.DataClassImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataClass()
	 * @generated
	 */
	int DATA_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__NOTE = DATA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__ID = DATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__TRACEABLE_TO = DATA_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__CHILDREN = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__ORDERED = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.DataValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.DataValueImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataValue()
	 * @generated
	 */
	int DATA_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__NOTE = DATA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__ID = DATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__TRACEABLE_TO = DATA_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__VALUE_LITERAL = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.DataBindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.DataBindingImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataBinding()
	 * @generated
	 */
	int DATA_BINDING = 6;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__LEAF = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.StepDataBindingImpl <em>Step Data Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.StepDataBindingImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getStepDataBinding()
	 * @generated
	 */
	int STEP_DATA_BINDING = 7;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DATA_BINDING__LEAF = DATA_BINDING__LEAF;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DATA_BINDING__VALUE = DATA_BINDING__VALUE;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DATA_BINDING__STEP = DATA_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step Data Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DATA_BINDING_FEATURE_COUNT = DATA_BINDING_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.DataScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.DataScenarioImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataScenario()
	 * @generated
	 */
	int DATA_SCENARIO = 8;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCENARIO__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCENARIO__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCENARIO__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCENARIO__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Step Data Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCENARIO__STEP_DATA_BINDINGS = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCENARIO__LENGTH = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCENARIO__RANGES = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCENARIO_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.DataRangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.DataRangeImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataRange()
	 * @generated
	 */
	int DATA_RANGE = 9;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__VALUES = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__EVENT_ID = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__LEAF = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.DataBagImpl <em>Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.DataBagImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataBag()
	 * @generated
	 */
	int DATA_BAG = 10;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG__NOTE = DATA_STRUCTURE_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG__ID = DATA_STRUCTURE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG__TRACEABLE_TO = DATA_STRUCTURE_NODE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG__NAME = DATA_STRUCTURE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Single Element Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG__SINGLE_ELEMENT_PROTOTYPE = DATA_STRUCTURE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG__MAX_SIZE = DATA_STRUCTURE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG__GENERATED_ELEMENTS = DATA_STRUCTURE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG_FEATURE_COUNT = DATA_STRUCTURE_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.TypedDataElementImpl <em>Typed Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.TypedDataElementImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getTypedDataElement()
	 * @generated
	 */
	int TYPED_DATA_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_ELEMENT__NOTE = DATA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_ELEMENT__ID = DATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_ELEMENT__TRACEABLE_TO = DATA_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_ELEMENT__NAME = DATA_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Typed Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_ELEMENT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.TypedDataClassImpl <em>Typed Data Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.TypedDataClassImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getTypedDataClass()
	 * @generated
	 */
	int TYPED_DATA_CLASS = 12;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_CLASS__NOTE = TYPED_DATA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_CLASS__ID = TYPED_DATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_CLASS__TRACEABLE_TO = TYPED_DATA_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_CLASS__NAME = TYPED_DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_CLASS__CHILDREN = TYPED_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Data Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_CLASS_FEATURE_COUNT = TYPED_DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.IntDataValueImpl <em>Int Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.IntDataValueImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getIntDataValue()
	 * @generated
	 */
	int INT_DATA_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DATA_VALUE__NOTE = TYPED_DATA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DATA_VALUE__ID = TYPED_DATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DATA_VALUE__TRACEABLE_TO = TYPED_DATA_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DATA_VALUE__NAME = TYPED_DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DATA_VALUE__VALUE = TYPED_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DATA_VALUE_FEATURE_COUNT = TYPED_DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.SubstitutableIntRangeImpl <em>Substitutable Int Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.SubstitutableIntRangeImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getSubstitutableIntRange()
	 * @generated
	 */
	int SUBSTITUTABLE_INT_RANGE = 14;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTABLE_INT_RANGE__NOTE = TYPED_DATA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTABLE_INT_RANGE__ID = TYPED_DATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTABLE_INT_RANGE__TRACEABLE_TO = TYPED_DATA_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTABLE_INT_RANGE__NAME = TYPED_DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTABLE_INT_RANGE__FROM = TYPED_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTABLE_INT_RANGE__TO = TYPED_DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Substitutable Int Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTABLE_INT_RANGE_FEATURE_COUNT = TYPED_DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.LongDataValueImpl <em>Long Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.LongDataValueImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getLongDataValue()
	 * @generated
	 */
	int LONG_DATA_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DATA_VALUE__NOTE = TYPED_DATA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DATA_VALUE__ID = TYPED_DATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DATA_VALUE__TRACEABLE_TO = TYPED_DATA_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DATA_VALUE__NAME = TYPED_DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DATA_VALUE__VALUE = TYPED_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Long Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DATA_VALUE_FEATURE_COUNT = TYPED_DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.BoolDataValueImpl <em>Bool Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.BoolDataValueImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getBoolDataValue()
	 * @generated
	 */
	int BOOL_DATA_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_DATA_VALUE__NOTE = TYPED_DATA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_DATA_VALUE__ID = TYPED_DATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_DATA_VALUE__TRACEABLE_TO = TYPED_DATA_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_DATA_VALUE__NAME = TYPED_DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_DATA_VALUE__VALUE = TYPED_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_DATA_VALUE_FEATURE_COUNT = TYPED_DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.data.impl.FloatDataValueImpl <em>Float Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.data.impl.FloatDataValueImpl
	 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getFloatDataValue()
	 * @generated
	 */
	int FLOAT_DATA_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_VALUE__NOTE = TYPED_DATA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_VALUE__ID = TYPED_DATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_VALUE__TRACEABLE_TO = TYPED_DATA_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_VALUE__NAME = TYPED_DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_VALUE__VALUE = TYPED_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_VALUE_FEATURE_COUNT = TYPED_DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.DataStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see org.tud.inf.st.mbt.data.DataStructure
	 * @generated
	 */
	EClass getDataStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.data.DataStructure#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.tud.inf.st.mbt.data.DataStructure#getChildren()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_Children();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.DataLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf</em>'.
	 * @see org.tud.inf.st.mbt.data.DataLeaf
	 * @generated
	 */
	EClass getDataLeaf();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.data.DataLeaf#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see org.tud.inf.st.mbt.data.DataLeaf#getDomain()
	 * @see #getDataLeaf()
	 * @generated
	 */
	EReference getDataLeaf_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.DataLeaf#getCausalLinkType <em>Causal Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Causal Link Type</em>'.
	 * @see org.tud.inf.st.mbt.data.DataLeaf#getCausalLinkType()
	 * @see #getDataLeaf()
	 * @generated
	 */
	EAttribute getDataLeaf_CausalLinkType();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.DataClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.tud.inf.st.mbt.data.DataClass
	 * @generated
	 */
	EClass getDataClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.data.DataClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.tud.inf.st.mbt.data.DataClass#getChildren()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.DataClass#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see org.tud.inf.st.mbt.data.DataClass#isOrdered()
	 * @see #getDataClass()
	 * @generated
	 */
	EAttribute getDataClass_Ordered();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.DataStructureNode <em>Structure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Node</em>'.
	 * @see org.tud.inf.st.mbt.data.DataStructureNode
	 * @generated
	 */
	EClass getDataStructureNode();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.DataElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.tud.inf.st.mbt.data.DataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.DataValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.data.DataValue
	 * @generated
	 */
	EClass getDataValue();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.DataValue#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.tud.inf.st.mbt.data.DataValue#getValueLiteral()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_ValueLiteral();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.DataBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see org.tud.inf.st.mbt.data.DataBinding
	 * @generated
	 */
	EClass getDataBinding();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.data.DataBinding#getLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leaf</em>'.
	 * @see org.tud.inf.st.mbt.data.DataBinding#getLeaf()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_Leaf();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.data.DataBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.data.DataBinding#getValue()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.StepDataBinding <em>Step Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Data Binding</em>'.
	 * @see org.tud.inf.st.mbt.data.StepDataBinding
	 * @generated
	 */
	EClass getStepDataBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.StepDataBinding#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see org.tud.inf.st.mbt.data.StepDataBinding#getStep()
	 * @see #getStepDataBinding()
	 * @generated
	 */
	EAttribute getStepDataBinding_Step();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.DataScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.tud.inf.st.mbt.data.DataScenario
	 * @generated
	 */
	EClass getDataScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.data.DataScenario#getStepDataBindings <em>Step Data Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step Data Bindings</em>'.
	 * @see org.tud.inf.st.mbt.data.DataScenario#getStepDataBindings()
	 * @see #getDataScenario()
	 * @generated
	 */
	EReference getDataScenario_StepDataBindings();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.DataScenario#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.tud.inf.st.mbt.data.DataScenario#getLength()
	 * @see #getDataScenario()
	 * @generated
	 */
	EAttribute getDataScenario_Length();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.data.DataScenario#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ranges</em>'.
	 * @see org.tud.inf.st.mbt.data.DataScenario#getRanges()
	 * @see #getDataScenario()
	 * @generated
	 */
	EReference getDataScenario_Ranges();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.DataRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see org.tud.inf.st.mbt.data.DataRange
	 * @generated
	 */
	EClass getDataRange();

	/**
	 * Returns the meta object for the reference list '{@link org.tud.inf.st.mbt.data.DataRange#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.tud.inf.st.mbt.data.DataRange#getValues()
	 * @see #getDataRange()
	 * @generated
	 */
	EReference getDataRange_Values();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.DataRange#getEventID <em>Event ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event ID</em>'.
	 * @see org.tud.inf.st.mbt.data.DataRange#getEventID()
	 * @see #getDataRange()
	 * @generated
	 */
	EAttribute getDataRange_EventID();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.data.DataRange#getLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leaf</em>'.
	 * @see org.tud.inf.st.mbt.data.DataRange#getLeaf()
	 * @see #getDataRange()
	 * @generated
	 */
	EReference getDataRange_Leaf();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.DataBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag</em>'.
	 * @see org.tud.inf.st.mbt.data.DataBag
	 * @generated
	 */
	EClass getDataBag();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.data.DataBag#getSingleElementPrototype <em>Single Element Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Element Prototype</em>'.
	 * @see org.tud.inf.st.mbt.data.DataBag#getSingleElementPrototype()
	 * @see #getDataBag()
	 * @generated
	 */
	EReference getDataBag_SingleElementPrototype();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.DataBag#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see org.tud.inf.st.mbt.data.DataBag#getMaxSize()
	 * @see #getDataBag()
	 * @generated
	 */
	EAttribute getDataBag_MaxSize();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.data.DataBag#getGeneratedElements <em>Generated Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generated Elements</em>'.
	 * @see org.tud.inf.st.mbt.data.DataBag#getGeneratedElements()
	 * @see #getDataBag()
	 * @generated
	 */
	EReference getDataBag_GeneratedElements();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.TypedDataElement <em>Typed Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Data Element</em>'.
	 * @see org.tud.inf.st.mbt.data.TypedDataElement
	 * @generated
	 */
	EClass getTypedDataElement();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.TypedDataClass <em>Typed Data Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Data Class</em>'.
	 * @see org.tud.inf.st.mbt.data.TypedDataClass
	 * @generated
	 */
	EClass getTypedDataClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.data.TypedDataClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.tud.inf.st.mbt.data.TypedDataClass#getChildren()
	 * @see #getTypedDataClass()
	 * @generated
	 */
	EReference getTypedDataClass_Children();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.IntDataValue <em>Int Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Data Value</em>'.
	 * @see org.tud.inf.st.mbt.data.IntDataValue
	 * @generated
	 */
	EClass getIntDataValue();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.IntDataValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.data.IntDataValue#getValue()
	 * @see #getIntDataValue()
	 * @generated
	 */
	EAttribute getIntDataValue_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.SubstitutableIntRange <em>Substitutable Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substitutable Int Range</em>'.
	 * @see org.tud.inf.st.mbt.data.SubstitutableIntRange
	 * @generated
	 */
	EClass getSubstitutableIntRange();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.SubstitutableIntRange#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.tud.inf.st.mbt.data.SubstitutableIntRange#getFrom()
	 * @see #getSubstitutableIntRange()
	 * @generated
	 */
	EAttribute getSubstitutableIntRange_From();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.SubstitutableIntRange#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.tud.inf.st.mbt.data.SubstitutableIntRange#getTo()
	 * @see #getSubstitutableIntRange()
	 * @generated
	 */
	EAttribute getSubstitutableIntRange_To();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.LongDataValue <em>Long Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Data Value</em>'.
	 * @see org.tud.inf.st.mbt.data.LongDataValue
	 * @generated
	 */
	EClass getLongDataValue();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.LongDataValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.data.LongDataValue#getValue()
	 * @see #getLongDataValue()
	 * @generated
	 */
	EAttribute getLongDataValue_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.BoolDataValue <em>Bool Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Data Value</em>'.
	 * @see org.tud.inf.st.mbt.data.BoolDataValue
	 * @generated
	 */
	EClass getBoolDataValue();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.BoolDataValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.data.BoolDataValue#isValue()
	 * @see #getBoolDataValue()
	 * @generated
	 */
	EAttribute getBoolDataValue_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.data.FloatDataValue <em>Float Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Data Value</em>'.
	 * @see org.tud.inf.st.mbt.data.FloatDataValue
	 * @generated
	 */
	EClass getFloatDataValue();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.data.FloatDataValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.data.FloatDataValue#getValue()
	 * @see #getFloatDataValue()
	 * @generated
	 */
	EAttribute getFloatDataValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.DataStructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.DataStructureImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataStructure()
		 * @generated
		 */
		EClass DATA_STRUCTURE = eINSTANCE.getDataStructure();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__CHILDREN = eINSTANCE.getDataStructure_Children();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.DataLeafImpl <em>Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.DataLeafImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataLeaf()
		 * @generated
		 */
		EClass DATA_LEAF = eINSTANCE.getDataLeaf();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LEAF__DOMAIN = eINSTANCE.getDataLeaf_Domain();

		/**
		 * The meta object literal for the '<em><b>Causal Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LEAF__CAUSAL_LINK_TYPE = eINSTANCE.getDataLeaf_CausalLinkType();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.DataClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.DataClassImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataClass()
		 * @generated
		 */
		EClass DATA_CLASS = eINSTANCE.getDataClass();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__CHILDREN = eINSTANCE.getDataClass_Children();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CLASS__ORDERED = eINSTANCE.getDataClass_Ordered();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.DataStructureNodeImpl <em>Structure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.DataStructureNodeImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataStructureNode()
		 * @generated
		 */
		EClass DATA_STRUCTURE_NODE = eINSTANCE.getDataStructureNode();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.DataElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.DataElementImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.DataValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.DataValueImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataValue()
		 * @generated
		 */
		EClass DATA_VALUE = eINSTANCE.getDataValue();

		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__VALUE_LITERAL = eINSTANCE.getDataValue_ValueLiteral();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.DataBindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.DataBindingImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataBinding()
		 * @generated
		 */
		EClass DATA_BINDING = eINSTANCE.getDataBinding();

		/**
		 * The meta object literal for the '<em><b>Leaf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__LEAF = eINSTANCE.getDataBinding_Leaf();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__VALUE = eINSTANCE.getDataBinding_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.StepDataBindingImpl <em>Step Data Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.StepDataBindingImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getStepDataBinding()
		 * @generated
		 */
		EClass STEP_DATA_BINDING = eINSTANCE.getStepDataBinding();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_DATA_BINDING__STEP = eINSTANCE.getStepDataBinding_Step();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.DataScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.DataScenarioImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataScenario()
		 * @generated
		 */
		EClass DATA_SCENARIO = eINSTANCE.getDataScenario();

		/**
		 * The meta object literal for the '<em><b>Step Data Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCENARIO__STEP_DATA_BINDINGS = eINSTANCE.getDataScenario_StepDataBindings();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCENARIO__LENGTH = eINSTANCE.getDataScenario_Length();

		/**
		 * The meta object literal for the '<em><b>Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCENARIO__RANGES = eINSTANCE.getDataScenario_Ranges();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.DataRangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.DataRangeImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataRange()
		 * @generated
		 */
		EClass DATA_RANGE = eINSTANCE.getDataRange();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RANGE__VALUES = eINSTANCE.getDataRange_Values();

		/**
		 * The meta object literal for the '<em><b>Event ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RANGE__EVENT_ID = eINSTANCE.getDataRange_EventID();

		/**
		 * The meta object literal for the '<em><b>Leaf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RANGE__LEAF = eINSTANCE.getDataRange_Leaf();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.DataBagImpl <em>Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.DataBagImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getDataBag()
		 * @generated
		 */
		EClass DATA_BAG = eINSTANCE.getDataBag();

		/**
		 * The meta object literal for the '<em><b>Single Element Prototype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BAG__SINGLE_ELEMENT_PROTOTYPE = eINSTANCE.getDataBag_SingleElementPrototype();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BAG__MAX_SIZE = eINSTANCE.getDataBag_MaxSize();

		/**
		 * The meta object literal for the '<em><b>Generated Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BAG__GENERATED_ELEMENTS = eINSTANCE.getDataBag_GeneratedElements();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.TypedDataElementImpl <em>Typed Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.TypedDataElementImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getTypedDataElement()
		 * @generated
		 */
		EClass TYPED_DATA_ELEMENT = eINSTANCE.getTypedDataElement();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.TypedDataClassImpl <em>Typed Data Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.TypedDataClassImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getTypedDataClass()
		 * @generated
		 */
		EClass TYPED_DATA_CLASS = eINSTANCE.getTypedDataClass();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_DATA_CLASS__CHILDREN = eINSTANCE.getTypedDataClass_Children();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.IntDataValueImpl <em>Int Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.IntDataValueImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getIntDataValue()
		 * @generated
		 */
		EClass INT_DATA_VALUE = eINSTANCE.getIntDataValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_DATA_VALUE__VALUE = eINSTANCE.getIntDataValue_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.SubstitutableIntRangeImpl <em>Substitutable Int Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.SubstitutableIntRangeImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getSubstitutableIntRange()
		 * @generated
		 */
		EClass SUBSTITUTABLE_INT_RANGE = eINSTANCE.getSubstitutableIntRange();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTABLE_INT_RANGE__FROM = eINSTANCE.getSubstitutableIntRange_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTABLE_INT_RANGE__TO = eINSTANCE.getSubstitutableIntRange_To();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.LongDataValueImpl <em>Long Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.LongDataValueImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getLongDataValue()
		 * @generated
		 */
		EClass LONG_DATA_VALUE = eINSTANCE.getLongDataValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_DATA_VALUE__VALUE = eINSTANCE.getLongDataValue_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.BoolDataValueImpl <em>Bool Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.BoolDataValueImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getBoolDataValue()
		 * @generated
		 */
		EClass BOOL_DATA_VALUE = eINSTANCE.getBoolDataValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_DATA_VALUE__VALUE = eINSTANCE.getBoolDataValue_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.data.impl.FloatDataValueImpl <em>Float Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.data.impl.FloatDataValueImpl
		 * @see org.tud.inf.st.mbt.data.impl.DataPackageImpl#getFloatDataValue()
		 * @generated
		 */
		EClass FLOAT_DATA_VALUE = eINSTANCE.getFloatDataValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_DATA_VALUE__VALUE = eINSTANCE.getFloatDataValue_Value();

	}

} //DataPackage
