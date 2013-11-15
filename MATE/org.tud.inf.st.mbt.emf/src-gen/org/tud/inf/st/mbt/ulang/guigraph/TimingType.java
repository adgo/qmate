/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Timing Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTimingType()
 * @model
 * @generated
 */
public enum TimingType implements Enumerator {
	/**
	 * The '<em><b>Delay Until Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELAY_UNTIL_START_VALUE
	 * @generated
	 * @ordered
	 */
	DELAY_UNTIL_START(0, "DelayUntilStart", "DelayUntilStart"),

	/**
	 * The '<em><b>Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL(1, "Interval", "Interval");

	/**
	 * The '<em><b>Delay Until Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delay Until Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELAY_UNTIL_START
	 * @model name="DelayUntilStart"
	 * @generated
	 * @ordered
	 */
	public static final int DELAY_UNTIL_START_VALUE = 0;

	/**
	 * The '<em><b>Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interval</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERVAL
	 * @model name="Interval"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Timing Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimingType[] VALUES_ARRAY =
		new TimingType[] {
			DELAY_UNTIL_START,
			INTERVAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Timing Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Timing Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingType get(int value) {
		switch (value) {
			case DELAY_UNTIL_START_VALUE: return DELAY_UNTIL_START;
			case INTERVAL_VALUE: return INTERVAL;
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
	private TimingType(int value, String name, String literal) {
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
	
} //TimingType
