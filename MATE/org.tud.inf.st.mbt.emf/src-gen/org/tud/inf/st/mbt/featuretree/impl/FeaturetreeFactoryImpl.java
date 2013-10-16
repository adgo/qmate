/**
 */
package org.tud.inf.st.mbt.featuretree.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.mbt.featuretree.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturetreeFactoryImpl extends EFactoryImpl implements FeaturetreeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeaturetreeFactory init() {
		try {
			FeaturetreeFactory theFeaturetreeFactory = (FeaturetreeFactory)EPackage.Registry.INSTANCE.getEFactory(FeaturetreePackage.eNS_URI);
			if (theFeaturetreeFactory != null) {
				return theFeaturetreeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeaturetreeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturetreeFactoryImpl() {
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
			case FeaturetreePackage.FEATURE_TREE: return createFeatureTree();
			case FeaturetreePackage.TREE_FEATURE: return createTreeFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureTree createFeatureTree() {
		FeatureTreeImpl featureTree = new FeatureTreeImpl();
		return featureTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeFeature createTreeFeature() {
		TreeFeatureImpl treeFeature = new TreeFeatureImpl();
		return treeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturetreePackage getFeaturetreePackage() {
		return (FeaturetreePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeaturetreePackage getPackage() {
		return FeaturetreePackage.eINSTANCE;
	}

} //FeaturetreeFactoryImpl
