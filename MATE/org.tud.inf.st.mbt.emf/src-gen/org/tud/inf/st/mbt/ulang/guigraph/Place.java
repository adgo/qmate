/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Place#getInitialTokens <em>Initial Tokens</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Place#isProvideAsInterface <em>Provide As Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getPlace()
 * @model abstract="true"
 * @generated
 */
public interface Place extends GuiGraphNode {

	/**
	 * Returns the value of the '<em><b>Initial Tokens</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Tokens</em>' attribute.
	 * @see #setInitialTokens(int)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getPlace_InitialTokens()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getInitialTokens();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Place#getInitialTokens <em>Initial Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Tokens</em>' attribute.
	 * @see #getInitialTokens()
	 * @generated
	 */
	void setInitialTokens(int value);

	/**
	 * Returns the value of the '<em><b>Provide As Interface</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provide As Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide As Interface</em>' attribute.
	 * @see #setProvideAsInterface(boolean)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getPlace_ProvideAsInterface()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isProvideAsInterface();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Place#isProvideAsInterface <em>Provide As Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provide As Interface</em>' attribute.
	 * @see #isProvideAsInterface()
	 * @generated
	 */
	void setProvideAsInterface(boolean value);
} // Place
