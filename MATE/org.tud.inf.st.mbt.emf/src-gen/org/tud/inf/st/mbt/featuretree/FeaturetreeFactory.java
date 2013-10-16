/**
 */
package org.tud.inf.st.mbt.featuretree;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.featuretree.FeaturetreePackage
 * @generated
 */
public interface FeaturetreeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturetreeFactory eINSTANCE = org.tud.inf.st.mbt.featuretree.impl.FeaturetreeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Feature Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Tree</em>'.
	 * @generated
	 */
	FeatureTree createFeatureTree();

	/**
	 * Returns a new object of class '<em>Tree Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Feature</em>'.
	 * @generated
	 */
	TreeFeature createTreeFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeaturetreePackage getFeaturetreePackage();

} //FeaturetreeFactory
