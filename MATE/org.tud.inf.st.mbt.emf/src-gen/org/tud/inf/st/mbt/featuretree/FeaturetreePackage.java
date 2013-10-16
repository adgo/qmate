/**
 */
package org.tud.inf.st.mbt.featuretree;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.tud.inf.st.mbt.core.CorePackage;

import org.tud.inf.st.mbt.features.FeaturesPackage;

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
 * @see org.tud.inf.st.mbt.featuretree.FeaturetreeFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturetreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featuretree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tud.org/mbt/featuretree";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "featuretree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturetreePackage eINSTANCE = org.tud.inf.st.mbt.featuretree.impl.FeaturetreePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.featuretree.impl.FeatureTreeImpl <em>Feature Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.featuretree.impl.FeatureTreeImpl
	 * @see org.tud.inf.st.mbt.featuretree.impl.FeaturetreePackageImpl#getFeatureTree()
	 * @generated
	 */
	int FEATURE_TREE = 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE__ROOT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.featuretree.impl.TreeFeatureImpl <em>Tree Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.featuretree.impl.TreeFeatureImpl
	 * @see org.tud.inf.st.mbt.featuretree.impl.FeaturetreePackageImpl#getTreeFeature()
	 * @generated
	 */
	int TREE_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE__NOTE = FeaturesPackage.FEATURE__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE__ID = FeaturesPackage.FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE__TRACEABLE_TO = FeaturesPackage.FEATURE__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE__NAME = FeaturesPackage.FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE__ATTRIBUTES = FeaturesPackage.FEATURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE__VERSIONS = FeaturesPackage.FEATURE__VERSIONS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE__CHILDREN = FeaturesPackage.FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE__MANDATORY = FeaturesPackage.FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tree Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_FEATURE_COUNT = FeaturesPackage.FEATURE_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.featuretree.FeatureTree <em>Feature Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Tree</em>'.
	 * @see org.tud.inf.st.mbt.featuretree.FeatureTree
	 * @generated
	 */
	EClass getFeatureTree();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.featuretree.FeatureTree#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see org.tud.inf.st.mbt.featuretree.FeatureTree#getRoot()
	 * @see #getFeatureTree()
	 * @generated
	 */
	EReference getFeatureTree_Root();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.featuretree.TreeFeature <em>Tree Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Feature</em>'.
	 * @see org.tud.inf.st.mbt.featuretree.TreeFeature
	 * @generated
	 */
	EClass getTreeFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.featuretree.TreeFeature#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.tud.inf.st.mbt.featuretree.TreeFeature#getChildren()
	 * @see #getTreeFeature()
	 * @generated
	 */
	EReference getTreeFeature_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.featuretree.TreeFeature#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.tud.inf.st.mbt.featuretree.TreeFeature#isMandatory()
	 * @see #getTreeFeature()
	 * @generated
	 */
	EAttribute getTreeFeature_Mandatory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeaturetreeFactory getFeaturetreeFactory();

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
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.featuretree.impl.FeatureTreeImpl <em>Feature Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.featuretree.impl.FeatureTreeImpl
		 * @see org.tud.inf.st.mbt.featuretree.impl.FeaturetreePackageImpl#getFeatureTree()
		 * @generated
		 */
		EClass FEATURE_TREE = eINSTANCE.getFeatureTree();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TREE__ROOT = eINSTANCE.getFeatureTree_Root();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.featuretree.impl.TreeFeatureImpl <em>Tree Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.featuretree.impl.TreeFeatureImpl
		 * @see org.tud.inf.st.mbt.featuretree.impl.FeaturetreePackageImpl#getTreeFeature()
		 * @generated
		 */
		EClass TREE_FEATURE = eINSTANCE.getTreeFeature();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_FEATURE__CHILDREN = eINSTANCE.getTreeFeature_Children();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_FEATURE__MANDATORY = eINSTANCE.getTreeFeature_Mandatory();

	}

} //FeaturetreePackage
