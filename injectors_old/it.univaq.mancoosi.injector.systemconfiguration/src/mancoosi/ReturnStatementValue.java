/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Return Statement Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mancoosi.MancoosiPackage#getReturnStatementValue()
 * @model
 * @generated
 */
public final class ReturnStatementValue extends AbstractEnumerator {
	/**
	 * The '<em><b>Zero</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zero</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO_LITERAL
	 * @model name="zero"
	 * @generated
	 * @ordered
	 */
	public static final int ZERO = 1;

	/**
	 * The '<em><b>One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_LITERAL
	 * @model name="one"
	 * @generated
	 * @ordered
	 */
	public static final int ONE = 2;

	/**
	 * The '<em><b>Zero</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO
	 * @generated
	 * @ordered
	 */
	public static final ReturnStatementValue ZERO_LITERAL = new ReturnStatementValue(ZERO, "zero", "zero");

	/**
	 * The '<em><b>One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE
	 * @generated
	 * @ordered
	 */
	public static final ReturnStatementValue ONE_LITERAL = new ReturnStatementValue(ONE, "one", "one");

	/**
	 * An array of all the '<em><b>Return Statement Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReturnStatementValue[] VALUES_ARRAY =
		new ReturnStatementValue[] {
			ZERO_LITERAL,
			ONE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Return Statement Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Return Statement Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReturnStatementValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReturnStatementValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Return Statement Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReturnStatementValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReturnStatementValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Return Statement Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReturnStatementValue get(int value) {
		switch (value) {
			case ZERO: return ZERO_LITERAL;
			case ONE: return ONE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReturnStatementValue(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ReturnStatementValue
