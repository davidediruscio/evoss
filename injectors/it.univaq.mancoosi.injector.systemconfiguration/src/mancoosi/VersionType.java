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
 * A representation of the literals of the enumeration '<em><b>Version Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mancoosi.MancoosiPackage#getVersionType()
 * @model
 * @generated
 */
public final class VersionType extends AbstractEnumerator {
	/**
	 * The '<em><b>Eq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQ_LITERAL
	 * @model name="eq"
	 * @generated
	 * @ordered
	 */
	public static final int EQ = 1;

	/**
	 * The '<em><b>Ge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GE_LITERAL
	 * @model name="ge"
	 * @generated
	 * @ordered
	 */
	public static final int GE = 2;

	/**
	 * The '<em><b>Le</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Le</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LE_LITERAL
	 * @model name="le"
	 * @generated
	 * @ordered
	 */
	public static final int LE = 3;

	/**
	 * The '<em><b>Lt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LT_LITERAL
	 * @model name="lt"
	 * @generated
	 * @ordered
	 */
	public static final int LT = 4;

	/**
	 * The '<em><b>Llt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Llt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LLT_LITERAL
	 * @model name="llt"
	 * @generated
	 * @ordered
	 */
	public static final int LLT = 5;

	/**
	 * The '<em><b>Gt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GT_LITERAL
	 * @model name="gt"
	 * @generated
	 * @ordered
	 */
	public static final int GT = 6;

	/**
	 * The '<em><b>Ggt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ggt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GGT_LITERAL
	 * @model name="ggt"
	 * @generated
	 * @ordered
	 */
	public static final int GGT = 7;

	/**
	 * The '<em><b>Eq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @generated
	 * @ordered
	 */
	public static final VersionType EQ_LITERAL = new VersionType(EQ, "eq", "eq");

	/**
	 * The '<em><b>Ge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GE
	 * @generated
	 * @ordered
	 */
	public static final VersionType GE_LITERAL = new VersionType(GE, "ge", "ge");

	/**
	 * The '<em><b>Le</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE
	 * @generated
	 * @ordered
	 */
	public static final VersionType LE_LITERAL = new VersionType(LE, "le", "le");

	/**
	 * The '<em><b>Lt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @generated
	 * @ordered
	 */
	public static final VersionType LT_LITERAL = new VersionType(LT, "lt", "lt");

	/**
	 * The '<em><b>Llt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LLT
	 * @generated
	 * @ordered
	 */
	public static final VersionType LLT_LITERAL = new VersionType(LLT, "llt", "llt");

	/**
	 * The '<em><b>Gt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @generated
	 * @ordered
	 */
	public static final VersionType GT_LITERAL = new VersionType(GT, "gt", "gt");

	/**
	 * The '<em><b>Ggt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GGT
	 * @generated
	 * @ordered
	 */
	public static final VersionType GGT_LITERAL = new VersionType(GGT, "ggt", "ggt");

	/**
	 * An array of all the '<em><b>Version Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VersionType[] VALUES_ARRAY =
		new VersionType[] {
			EQ_LITERAL,
			GE_LITERAL,
			LE_LITERAL,
			LT_LITERAL,
			LLT_LITERAL,
			GT_LITERAL,
			GGT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Version Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Version Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VersionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VersionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Version Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VersionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VersionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Version Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VersionType get(int value) {
		switch (value) {
			case EQ: return EQ_LITERAL;
			case GE: return GE_LITERAL;
			case LE: return LE_LITERAL;
			case LT: return LT_LITERAL;
			case LLT: return LLT_LITERAL;
			case GT: return GT_LITERAL;
			case GGT: return GGT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VersionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //VersionType
