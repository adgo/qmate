/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Mapping Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.PageMappingArc#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getPageMappingArc()
 * @model
 * @generated
 */
public interface PageMappingArc extends Arc {

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' reference.
	 * @see #setMapping(Place)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getPageMappingArc_Mapping()
	 * @model
	 * @generated
	 */
	Place getMapping();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.PageMappingArc#getMapping <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Place value);
} // PageMappingArc
