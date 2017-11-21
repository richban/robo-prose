/**
 */
package dk.itu.dsl.roboprose.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MOVE DIRECTION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getMOVE_DIRECTION()
 * @model
 * @generated
 */
public enum MOVE_DIRECTION implements Enumerator {
	/**
	 * The '<em><b>FORWARDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORWARDS_VALUE
	 * @generated
	 * @ordered
	 */
	FORWARDS(1, "FORWARDS", "forwards"),

	/**
	 * The '<em><b>BACKWARDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKWARDS_VALUE
	 * @generated
	 * @ordered
	 */
	BACKWARDS(0, "BACKWARDS", "backwards");

	/**
	 * The '<em><b>FORWARDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORWARDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORWARDS
	 * @model literal="forwards"
	 * @generated
	 * @ordered
	 */
	public static final int FORWARDS_VALUE = 1;

	/**
	 * The '<em><b>BACKWARDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BACKWARDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BACKWARDS
	 * @model literal="backwards"
	 * @generated
	 * @ordered
	 */
	public static final int BACKWARDS_VALUE = 0;

	/**
	 * An array of all the '<em><b>MOVE DIRECTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MOVE_DIRECTION[] VALUES_ARRAY =
		new MOVE_DIRECTION[] {
			FORWARDS,
			BACKWARDS,
		};

	/**
	 * A public read-only list of all the '<em><b>MOVE DIRECTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MOVE_DIRECTION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MOVE DIRECTION</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MOVE_DIRECTION get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MOVE_DIRECTION result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MOVE DIRECTION</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MOVE_DIRECTION getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MOVE_DIRECTION result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MOVE DIRECTION</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MOVE_DIRECTION get(int value) {
		switch (value) {
			case FORWARDS_VALUE: return FORWARDS;
			case BACKWARDS_VALUE: return BACKWARDS;
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
	private MOVE_DIRECTION(int value, String name, String literal) {
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
	
} //MOVE_DIRECTION
