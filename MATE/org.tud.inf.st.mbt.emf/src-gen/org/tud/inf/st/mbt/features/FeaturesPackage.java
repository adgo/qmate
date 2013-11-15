/**
 */
package org.tud.inf.st.mbt.features;

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
 * @see org.tud.inf.st.mbt.features.FeaturesFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "features";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tud.org/mbt/features";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "features";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturesPackage eINSTANCE = org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.FeatureImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ATTRIBUTES = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSIONS = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Causal Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CAUSAL_LINK_TYPE = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.FeatureSetImpl <em>Feature Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.FeatureSetImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getFeatureSet()
	 * @generated
	 */
	int FEATURE_SET = 1;

	/**
	 * The number of structural features of the '<em>Feature Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.ExplicitSetImpl <em>Explicit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.ExplicitSetImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getExplicitSet()
	 * @generated
	 */
	int EXPLICIT_SET = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_SET__FEATURES = FEATURE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Explicit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_SET_FEATURE_COUNT = FEATURE_SET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.BinarySetOperatorImpl <em>Binary Set Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.BinarySetOperatorImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getBinarySetOperator()
	 * @generated
	 */
	int BINARY_SET_OPERATOR = 5;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SET_OPERATOR__OPERAND1 = FEATURE_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SET_OPERATOR__OPERAND2 = FEATURE_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Set Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SET_OPERATOR_FEATURE_COUNT = FEATURE_SET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.UnionImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 3;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__OPERAND1 = BINARY_SET_OPERATOR__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__OPERAND2 = BINARY_SET_OPERATOR__OPERAND2;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = BINARY_SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.IntersectionImpl <em>Intersection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.IntersectionImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getIntersection()
	 * @generated
	 */
	int INTERSECTION = 4;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__OPERAND1 = BINARY_SET_OPERATOR__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__OPERAND2 = BINARY_SET_OPERATOR__OPERAND2;

	/**
	 * The number of structural features of the '<em>Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_FEATURE_COUNT = BINARY_SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.WithoutImpl <em>Without</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.WithoutImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getWithout()
	 * @generated
	 */
	int WITHOUT = 6;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHOUT__OPERAND1 = BINARY_SET_OPERATOR__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHOUT__OPERAND2 = BINARY_SET_OPERATOR__OPERAND2;

	/**
	 * The number of structural features of the '<em>Without</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHOUT_FEATURE_COUNT = BINARY_SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.SetReferenceImpl <em>Set Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.SetReferenceImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getSetReference()
	 * @generated
	 */
	int SET_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__FEATURES = FEATURE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_FEATURE_COUNT = FEATURE_SET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.StandaloneFeatureSetImpl <em>Standalone Feature Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.StandaloneFeatureSetImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getStandaloneFeatureSet()
	 * @generated
	 */
	int STANDALONE_FEATURE_SET = 8;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDALONE_FEATURE_SET__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDALONE_FEATURE_SET__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDALONE_FEATURE_SET__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDALONE_FEATURE_SET__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDALONE_FEATURE_SET__FEATURES = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standalone Feature Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDALONE_FEATURE_SET_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.SubSetImpl <em>Sub Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.SubSetImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getSubSet()
	 * @generated
	 */
	int SUB_SET = 9;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SET__OPERAND = FEATURE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SET_FEATURE_COUNT = FEATURE_SET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.IFeatureImpl <em>IFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.IFeatureImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getIFeature()
	 * @generated
	 */
	int IFEATURE = 10;

	/**
	 * The number of structural features of the '<em>IFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEATURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.FeatureReferenceImpl <em>Feature Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.FeatureReferenceImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getFeatureReference()
	 * @generated
	 */
	int FEATURE_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE__FEATURE = IFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE__VERSION = IFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_FEATURE_COUNT = IFEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.IFeatureDomain <em>IFeature Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.IFeatureDomain
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getIFeatureDomain()
	 * @generated
	 */
	int IFEATURE_DOMAIN = 12;

	/**
	 * The number of structural features of the '<em>IFeature Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEATURE_DOMAIN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.FeatureAttributeImpl <em>Feature Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.FeatureAttributeImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getFeatureAttribute()
	 * @generated
	 */
	int FEATURE_ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ATTRIBUTE__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ATTRIBUTE__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ATTRIBUTE__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ATTRIBUTE__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ATTRIBUTE__DATA = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ATTRIBUTE_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.ConfigurationImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 14;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__FEATURES = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BINDINGS = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.features.impl.FeatureVersionImpl <em>Feature Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.features.impl.FeatureVersionImpl
	 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getFeatureVersion()
	 * @generated
	 */
	int FEATURE_VERSION = 15;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Feature Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.tud.inf.st.mbt.features.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.features.Feature#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.tud.inf.st.mbt.features.Feature#getAttributes()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.features.Feature#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.tud.inf.st.mbt.features.Feature#getVersions()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Versions();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.features.Feature#getCausalLinkType <em>Causal Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Causal Link Type</em>'.
	 * @see org.tud.inf.st.mbt.features.Feature#getCausalLinkType()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_CausalLinkType();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.FeatureSet <em>Feature Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Set</em>'.
	 * @see org.tud.inf.st.mbt.features.FeatureSet
	 * @generated
	 */
	EClass getFeatureSet();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.ExplicitSet <em>Explicit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Set</em>'.
	 * @see org.tud.inf.st.mbt.features.ExplicitSet
	 * @generated
	 */
	EClass getExplicitSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.features.ExplicitSet#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.tud.inf.st.mbt.features.ExplicitSet#getFeatures()
	 * @see #getExplicitSet()
	 * @generated
	 */
	EReference getExplicitSet_Features();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see org.tud.inf.st.mbt.features.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.Intersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intersection</em>'.
	 * @see org.tud.inf.st.mbt.features.Intersection
	 * @generated
	 */
	EClass getIntersection();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.BinarySetOperator <em>Binary Set Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Set Operator</em>'.
	 * @see org.tud.inf.st.mbt.features.BinarySetOperator
	 * @generated
	 */
	EClass getBinarySetOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.features.BinarySetOperator#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand1</em>'.
	 * @see org.tud.inf.st.mbt.features.BinarySetOperator#getOperand1()
	 * @see #getBinarySetOperator()
	 * @generated
	 */
	EReference getBinarySetOperator_Operand1();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.features.BinarySetOperator#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand2</em>'.
	 * @see org.tud.inf.st.mbt.features.BinarySetOperator#getOperand2()
	 * @see #getBinarySetOperator()
	 * @generated
	 */
	EReference getBinarySetOperator_Operand2();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.Without <em>Without</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Without</em>'.
	 * @see org.tud.inf.st.mbt.features.Without
	 * @generated
	 */
	EClass getWithout();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.SetReference <em>Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Reference</em>'.
	 * @see org.tud.inf.st.mbt.features.SetReference
	 * @generated
	 */
	EClass getSetReference();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.features.SetReference#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Features</em>'.
	 * @see org.tud.inf.st.mbt.features.SetReference#getFeatures()
	 * @see #getSetReference()
	 * @generated
	 */
	EReference getSetReference_Features();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.StandaloneFeatureSet <em>Standalone Feature Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standalone Feature Set</em>'.
	 * @see org.tud.inf.st.mbt.features.StandaloneFeatureSet
	 * @generated
	 */
	EClass getStandaloneFeatureSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.features.StandaloneFeatureSet#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features</em>'.
	 * @see org.tud.inf.st.mbt.features.StandaloneFeatureSet#getFeatures()
	 * @see #getStandaloneFeatureSet()
	 * @generated
	 */
	EReference getStandaloneFeatureSet_Features();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.SubSet <em>Sub Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Set</em>'.
	 * @see org.tud.inf.st.mbt.features.SubSet
	 * @generated
	 */
	EClass getSubSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.features.SubSet#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.tud.inf.st.mbt.features.SubSet#getOperand()
	 * @see #getSubSet()
	 * @generated
	 */
	EReference getSubSet_Operand();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.IFeature <em>IFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFeature</em>'.
	 * @see org.tud.inf.st.mbt.features.IFeature
	 * @generated
	 */
	EClass getIFeature();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.FeatureReference <em>Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Reference</em>'.
	 * @see org.tud.inf.st.mbt.features.FeatureReference
	 * @generated
	 */
	EClass getFeatureReference();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.features.FeatureReference#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.tud.inf.st.mbt.features.FeatureReference#getFeature()
	 * @see #getFeatureReference()
	 * @generated
	 */
	EReference getFeatureReference_Feature();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.features.FeatureReference#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see org.tud.inf.st.mbt.features.FeatureReference#getVersion()
	 * @see #getFeatureReference()
	 * @generated
	 */
	EReference getFeatureReference_Version();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.IFeatureDomain <em>IFeature Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFeature Domain</em>'.
	 * @see org.tud.inf.st.mbt.features.IFeatureDomain
	 * @generated
	 */
	EClass getIFeatureDomain();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.FeatureAttribute <em>Feature Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Attribute</em>'.
	 * @see org.tud.inf.st.mbt.features.FeatureAttribute
	 * @generated
	 */
	EClass getFeatureAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.features.FeatureAttribute#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.tud.inf.st.mbt.features.FeatureAttribute#getData()
	 * @see #getFeatureAttribute()
	 * @generated
	 */
	EReference getFeatureAttribute_Data();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.tud.inf.st.mbt.features.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.features.Configuration#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.tud.inf.st.mbt.features.Configuration#getFeatures()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.features.Configuration#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.tud.inf.st.mbt.features.Configuration#getBindings()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Bindings();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.features.FeatureVersion <em>Feature Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Version</em>'.
	 * @see org.tud.inf.st.mbt.features.FeatureVersion
	 * @generated
	 */
	EClass getFeatureVersion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeaturesFactory getFeaturesFactory();

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
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.FeatureImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ATTRIBUTES = eINSTANCE.getFeature_Attributes();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__VERSIONS = eINSTANCE.getFeature_Versions();

		/**
		 * The meta object literal for the '<em><b>Causal Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__CAUSAL_LINK_TYPE = eINSTANCE.getFeature_CausalLinkType();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.FeatureSetImpl <em>Feature Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.FeatureSetImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getFeatureSet()
		 * @generated
		 */
		EClass FEATURE_SET = eINSTANCE.getFeatureSet();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.ExplicitSetImpl <em>Explicit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.ExplicitSetImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getExplicitSet()
		 * @generated
		 */
		EClass EXPLICIT_SET = eINSTANCE.getExplicitSet();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLICIT_SET__FEATURES = eINSTANCE.getExplicitSet_Features();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.UnionImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getUnion()
		 * @generated
		 */
		EClass UNION = eINSTANCE.getUnion();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.IntersectionImpl <em>Intersection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.IntersectionImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getIntersection()
		 * @generated
		 */
		EClass INTERSECTION = eINSTANCE.getIntersection();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.BinarySetOperatorImpl <em>Binary Set Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.BinarySetOperatorImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getBinarySetOperator()
		 * @generated
		 */
		EClass BINARY_SET_OPERATOR = eINSTANCE.getBinarySetOperator();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_SET_OPERATOR__OPERAND1 = eINSTANCE.getBinarySetOperator_Operand1();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_SET_OPERATOR__OPERAND2 = eINSTANCE.getBinarySetOperator_Operand2();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.WithoutImpl <em>Without</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.WithoutImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getWithout()
		 * @generated
		 */
		EClass WITHOUT = eINSTANCE.getWithout();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.SetReferenceImpl <em>Set Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.SetReferenceImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getSetReference()
		 * @generated
		 */
		EClass SET_REFERENCE = eINSTANCE.getSetReference();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_REFERENCE__FEATURES = eINSTANCE.getSetReference_Features();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.StandaloneFeatureSetImpl <em>Standalone Feature Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.StandaloneFeatureSetImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getStandaloneFeatureSet()
		 * @generated
		 */
		EClass STANDALONE_FEATURE_SET = eINSTANCE.getStandaloneFeatureSet();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDALONE_FEATURE_SET__FEATURES = eINSTANCE.getStandaloneFeatureSet_Features();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.SubSetImpl <em>Sub Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.SubSetImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getSubSet()
		 * @generated
		 */
		EClass SUB_SET = eINSTANCE.getSubSet();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SET__OPERAND = eINSTANCE.getSubSet_Operand();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.IFeatureImpl <em>IFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.IFeatureImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getIFeature()
		 * @generated
		 */
		EClass IFEATURE = eINSTANCE.getIFeature();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.FeatureReferenceImpl <em>Feature Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.FeatureReferenceImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getFeatureReference()
		 * @generated
		 */
		EClass FEATURE_REFERENCE = eINSTANCE.getFeatureReference();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_REFERENCE__FEATURE = eINSTANCE.getFeatureReference_Feature();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_REFERENCE__VERSION = eINSTANCE.getFeatureReference_Version();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.IFeatureDomain <em>IFeature Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.IFeatureDomain
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getIFeatureDomain()
		 * @generated
		 */
		EClass IFEATURE_DOMAIN = eINSTANCE.getIFeatureDomain();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.FeatureAttributeImpl <em>Feature Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.FeatureAttributeImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getFeatureAttribute()
		 * @generated
		 */
		EClass FEATURE_ATTRIBUTE = eINSTANCE.getFeatureAttribute();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ATTRIBUTE__DATA = eINSTANCE.getFeatureAttribute_Data();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.ConfigurationImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__FEATURES = eINSTANCE.getConfiguration_Features();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BINDINGS = eINSTANCE.getConfiguration_Bindings();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.features.impl.FeatureVersionImpl <em>Feature Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.features.impl.FeatureVersionImpl
		 * @see org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl#getFeatureVersion()
		 * @generated
		 */
		EClass FEATURE_VERSION = eINSTANCE.getFeatureVersion();

	}

} //FeaturesPackage
