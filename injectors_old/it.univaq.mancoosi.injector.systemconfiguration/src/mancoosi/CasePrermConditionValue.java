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
 * A representation of the literals of the enumeration '<em><b>Case Prerm Condition Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mancoosi.MancoosiPackage#getCasePrermConditionValue()
 * @model
 * @generated
 */
public final class CasePrermConditionValue extends AbstractEnumerator {
	/**
	 * The '<em><b>Remove</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remove</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_LITERAL
	 * @model name="remove"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE = 1;

	/**
	 * The '<em><b>Upgrade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upgrade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPGRADE_LITERAL
	 * @model name="upgrade"
	 * @generated
	 * @ordered
	 */
	public static final int UPGRADE = 2;

	/**
	 * The '<em><b>Deconfigure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deconfigure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECONFIGURE_LITERAL
	 * @model name="deconfigure"
	 * @generated
	 * @ordered
	 */
	public static final int DECONFIGURE = 3;

	/**
	 * The '<em><b>Failed upgrade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Failed upgrade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILED_UPGRADE_LITERAL
	 * @model name="failed_upgrade"
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_UPGRADE = 4;

	/**
	 * The '<em><b>Remove</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE
	 * @generated
	 * @ordered
	 */
	public static final CasePrermConditionValue REMOVE_LITERAL = new CasePrermConditionValue(REMOVE, "remove", "remove");

	/**
	 * The '<em><b>Upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE
	 * @generated
	 * @ordered
	 */
	public static final CasePrermConditionValue UPGRADE_LITERAL = new CasePrermConditionValue(UPGRADE, "upgrade", "upgrade");

	/**
	 * The '<em><b>Deconfigure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECONFIGURE
	 * @generated
	 * @ordered
	 */
	public static final CasePrermConditionValue DECONFIGURE_LITERAL = new CasePrermConditionValue(DECONFIGURE, "deconfigure", "deconfigure");

	/**
	 * The '<em><b>Failed upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED_UPGRADE
	 * @generated
	 * @ordered
	 */
	public static final CasePrermConditionValue FAILED_UPGRADE_LITERAL = new CasePrermConditionValue(FAILED_UPGRADE, "failed_upgrade", "failed_upgrade");

	/**
	 * An array of all the '<em><b>Case Prerm Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CasePrermConditionValue[] VALUES_ARRAY =
		new CasePrermConditionValue[] {
			REMOVE_LITERAL,
			UPGRADE_LITERAL,
			DECONFIGURE_LITERAL,
			FAILED_UPGRADE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Case Prerm Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Case Prerm Condition Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePrermConditionValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CasePrermConditionValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Prerm Condition Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePrermConditionValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CasePrermConditionValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Prerm Condition Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePrermConditionValue get(int value) {
		switch (value) {
			case REMOVE: return REMOVE_LITERAL;
			case UPGRADE: return UPGRADE_LITERAL;
			case DECONFIGURE: return DECONFIGURE_LITERAL;
			case FAILED_UPGRADE: return FAILED_UPGRADE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CasePrermConditionValue(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CasePrermConditionValue
