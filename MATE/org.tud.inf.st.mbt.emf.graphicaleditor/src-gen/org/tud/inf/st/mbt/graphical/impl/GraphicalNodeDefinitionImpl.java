/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.mbt.graphical.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition;
import org.tud.inf.st.mbt.graphical.GraphicalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.graphical.impl.GraphicalNodeDefinitionImpl#getX <em>X</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.graphical.impl.GraphicalNodeDefinitionImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.graphical.impl.GraphicalNodeDefinitionImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.graphical.impl.GraphicalNodeDefinitionImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.graphical.impl.GraphicalNodeDefinitionImpl#getReferenceId <em>Reference Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphicalNodeDefinitionImpl extends EObjectImpl implements GraphicalNodeDefinition {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceId() <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceId() <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceId()
	 * @generated
	 * @ordered
	 */
	protected String referenceId = REFERENCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalNodeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GraphicalPackage.Literals.GRAPHICAL_NODE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicalPackage.GRAPHICAL_NODE_DEFINITION__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicalPackage.GRAPHICAL_NODE_DEFINITION__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicalPackage.GRAPHICAL_NODE_DEFINITION__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicalPackage.GRAPHICAL_NODE_DEFINITION__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceId() {
		return referenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceId(String newReferenceId) {
		String oldReferenceId = referenceId;
		referenceId = newReferenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicalPackage.GRAPHICAL_NODE_DEFINITION__REFERENCE_ID, oldReferenceId, referenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__X:
				return new Integer(getX());
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__Y:
				return new Integer(getY());
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__WIDTH:
				return new Integer(getWidth());
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__HEIGHT:
				return new Integer(getHeight());
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__REFERENCE_ID:
				return getReferenceId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__X:
				setX(((Integer)newValue).intValue());
				return;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__Y:
				setY(((Integer)newValue).intValue());
				return;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__REFERENCE_ID:
				setReferenceId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__X:
				setX(X_EDEFAULT);
				return;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__Y:
				setY(Y_EDEFAULT);
				return;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__REFERENCE_ID:
				setReferenceId(REFERENCE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__X:
				return x != X_EDEFAULT;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__Y:
				return y != Y_EDEFAULT;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__WIDTH:
				return width != WIDTH_EDEFAULT;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION__REFERENCE_ID:
				return REFERENCE_ID_EDEFAULT == null ? referenceId != null : !REFERENCE_ID_EDEFAULT.equals(referenceId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", referenceId: ");
		result.append(referenceId);
		result.append(')');
		return result.toString();
	}

} //GraphicalNodeDefinitionImpl
