/**
 */
package org.tud.inf.st.mbt.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Causal Link Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.core.CorePackage#getCausalLinkType()
 * @model
 * @generated
 */
public enum CausalLinkType implements Enumerator {
	/**
	 * The '<em><b>Uplink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPLINK_VALUE
	 * @generated
	 * @ordered
	 */
	UPLINK(0, "Uplink", "Uplink"),

	/**
	 * The '<em><b>Downlink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNLINK_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNLINK(1, "Downlink", "Downlink"),

	/**
	 * The '<em><b>Virtual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL(3, "Virtual", "Virtual");

	/**
	 * The '<em><b>Uplink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uplink</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPLINK
	 * @model name="Uplink"
	 * @generated
	 * @ordered
	 */
	public static final int UPLINK_VALUE = 0;

	/**
	 * The '<em><b>Downlink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Downlink</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWNLINK
	 * @model name="Downlink"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNLINK_VALUE = 1;

	/**
	 * The '<em><b>Virtual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Virtual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL
	 * @model name="Virtual"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Causal Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CausalLinkType[] VALUES_ARRAY =
		new CausalLinkType[] {
			UPLINK,
			DOWNLINK,
			VIRTUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Causal Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CausalLinkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Causal Link Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CausalLinkType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CausalLinkType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Causal Link Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CausalLinkType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CausalLinkType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Causal Link Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CausalLinkType get(int value) {
		switch (value) {
			case UPLINK_VALUE: return UPLINK;
			case DOWNLINK_VALUE: return DOWNLINK;
			case VIRTUAL_VALUE: return VIRTUAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CausalLinkType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CausalLinkType
