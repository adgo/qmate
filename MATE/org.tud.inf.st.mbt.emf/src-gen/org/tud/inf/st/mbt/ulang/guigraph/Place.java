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
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Place#isMapToPage <em>Map To Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getPlace()
 * @model abstract="true"
 * @generated
 */
public interface Place extends GuiGraphNode {

	/**
	 * Returns the value of the '<em><b>Map To Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map To Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map To Page</em>' attribute.
	 * @see #setMapToPage(boolean)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getPlace_MapToPage()
	 * @model
	 * @generated
	 */
	boolean isMapToPage();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Place#isMapToPage <em>Map To Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map To Page</em>' attribute.
	 * @see #isMapToPage()
	 * @generated
	 */
	void setMapToPage(boolean value);
} // Place
