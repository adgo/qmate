/**
 */
package org.tud.inf.st.mbt.functions;

import org.tud.inf.st.mbt.featuretree.FeatureTree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Tree Valid Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.FeatureTreeValidFunction#getTree <em>Tree</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getFeatureTreeValidFunction()
 * @model
 * @generated
 */
public interface FeatureTreeValidFunction extends ILogicFunction {
	/**
	 * Returns the value of the '<em><b>Tree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree</em>' reference.
	 * @see #setTree(FeatureTree)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getFeatureTreeValidFunction_Tree()
	 * @model required="true"
	 * @generated
	 */
	FeatureTree getTree();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.FeatureTreeValidFunction#getTree <em>Tree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree</em>' reference.
	 * @see #getTree()
	 * @generated
	 */
	void setTree(FeatureTree value);

} // FeatureTreeValidFunction
