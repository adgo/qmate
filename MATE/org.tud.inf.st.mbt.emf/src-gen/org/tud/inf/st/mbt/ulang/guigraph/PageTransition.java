/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.PageTransition#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getPageTransition()
 * @model
 * @generated
 */
public interface PageTransition extends Transition {

	/**
	 * Returns the value of the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' reference.
	 * @see #setPage(GuiGraph)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getPageTransition_Page()
	 * @model required="true"
	 * @generated
	 */
	GuiGraph getPage();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.PageTransition#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(GuiGraph value);
} // PageTransition
