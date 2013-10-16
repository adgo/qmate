/**
 */
package org.tud.inf.st.mbt.functions;

import org.eclipse.emf.ecore.EObject;

import org.tud.inf.st.mbt.rules.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetric Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.ArithmetricCase#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.functions.ArithmetricCase#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getArithmetricCase()
 * @model
 * @generated
 */
public interface ArithmetricCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Predicate)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getArithmetricCase_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Predicate getCondition();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.ArithmetricCase#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Predicate value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(IArithmetricFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getArithmetricCase_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IArithmetricFunction getThen();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.ArithmetricCase#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(IArithmetricFunction value);

} // ArithmetricCase
