/**
 */
package org.tud.inf.st.pccs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.BoolParser#getTrueLit <em>True Lit</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.BoolParser#getFalseLit <em>False Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getBoolParser()
 * @model
 * @generated
 */
public interface BoolParser extends LiteralParser {

	/**
	 * Returns the value of the '<em><b>True Lit</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Lit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Lit</em>' attribute.
	 * @see #setTrueLit(String)
	 * @see org.tud.inf.st.pccs.PccsPackage#getBoolParser_TrueLit()
	 * @model default="true"
	 * @generated
	 */
	String getTrueLit();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.BoolParser#getTrueLit <em>True Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Lit</em>' attribute.
	 * @see #getTrueLit()
	 * @generated
	 */
	void setTrueLit(String value);

	/**
	 * Returns the value of the '<em><b>False Lit</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Lit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Lit</em>' attribute.
	 * @see #setFalseLit(String)
	 * @see org.tud.inf.st.pccs.PccsPackage#getBoolParser_FalseLit()
	 * @model default="false"
	 * @generated
	 */
	String getFalseLit();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.BoolParser#getFalseLit <em>False Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Lit</em>' attribute.
	 * @see #getFalseLit()
	 * @generated
	 */
	void setFalseLit(String value);
} // BoolParser
