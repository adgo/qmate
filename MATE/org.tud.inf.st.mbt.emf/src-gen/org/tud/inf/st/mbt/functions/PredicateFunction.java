/**
 */
package org.tud.inf.st.mbt.functions;

import org.tud.inf.st.mbt.rules.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.PredicateFunction#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getPredicateFunction()
 * @model
 * @generated
 */
public interface PredicateFunction extends ILogicFunction {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(Predicate)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getPredicateFunction_Predicate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.PredicateFunction#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);

} // PredicateFunction
