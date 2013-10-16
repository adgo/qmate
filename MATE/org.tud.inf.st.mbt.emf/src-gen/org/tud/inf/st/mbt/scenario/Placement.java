/**
 */
package org.tud.inf.st.mbt.scenario;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.eclipse.emf.ecore.EObject;

import org.tud.inf.st.mbt.features.FeatureAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.scenario.Placement#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.scenario.Placement#getX <em>X</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.scenario.Placement#getY <em>Y</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.scenario.Placement#getWidth <em>Width</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.scenario.Placement#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getPlacement()
 * @model
 * @generated
 */
public interface Placement extends AbstractModelElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(ScenarioEntity)
	 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getPlacement_Entity()
	 * @model required="true"
	 * @generated
	 */
	ScenarioEntity getEntity();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.scenario.Placement#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(ScenarioEntity value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getPlacement_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.scenario.Placement#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getPlacement_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.scenario.Placement#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getPlacement_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.scenario.Placement#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getPlacement_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.scenario.Placement#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // Placement
