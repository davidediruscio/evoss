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
 * A representation of the literals of the enumeration '<em><b>Priority Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mancoosi.MancoosiPackage#getPriorityType()
 * @model
 * @generated
 */
public final class PriorityType extends AbstractEnumerator {
	/**
	 * The '<em><b>Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_LITERAL
	 * @model name="standard"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD = 1;

	/**
	 * The '<em><b>Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Required</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIRED_LITERAL
	 * @model name="required"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED = 2;

	/**
	 * The '<em><b>Important</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Important</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPORTANT_LITERAL
	 * @model name="important"
	 * @generated
	 * @ordered
	 */
	public static final int IMPORTANT = 3;

	/**
	 * The '<em><b>Optional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Optional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_LITERAL
	 * @model name="optional"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL = 4;

	/**
	 * The '<em><b>Extra</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extra</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTRA_LITERAL
	 * @model name="extra"
	 * @generated
	 * @ordered
	 */
	public static final int EXTRA = 5;

	/**
	 * The '<em><b>Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD
	 * @generated
	 * @ordered
	 */
	public static final PriorityType STANDARD_LITERAL = new PriorityType(STANDARD, "standard", "standard");

	/**
	 * The '<em><b>Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED
	 * @generated
	 * @ordered
	 */
	public static final PriorityType REQUIRED_LITERAL = new PriorityType(REQUIRED, "required", "required");

	/**
	 * The '<em><b>Important</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPORTANT
	 * @generated
	 * @ordered
	 */
	public static final PriorityType IMPORTANT_LITERAL = new PriorityType(IMPORTANT, "important", "important");

	/**
	 * The '<em><b>Optional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL
	 * @generated
	 * @ordered
	 */
	public static final PriorityType OPTIONAL_LITERAL = new PriorityType(OPTIONAL, "optional", "optional");

	/**
	 * The '<em><b>Extra</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTRA
	 * @generated
	 * @ordered
	 */
	public static final PriorityType EXTRA_LITERAL = new PriorityType(EXTRA, "extra", "extra");

	/**
	 * An array of all the '<em><b>Priority Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PriorityType[] VALUES_ARRAY =
		new PriorityType[] {
			STANDARD_LITERAL,
			REQUIRED_LITERAL,
			IMPORTANT_LITERAL,
			OPTIONAL_LITERAL,
			EXTRA_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Priority Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Priority Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Priority Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Priority Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorityType get(int value) {
		switch (value) {
			case STANDARD: return STANDARD_LITERAL;
			case REQUIRED: return REQUIRED_LITERAL;
			case IMPORTANT: return IMPORTANT_LITERAL;
			case OPTIONAL: return OPTIONAL_LITERAL;
			case EXTRA: return EXTRA_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PriorityType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PriorityType
