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
 * A representation of the literals of the enumeration '<em><b>Case Postinst Condition Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mancoosi.MancoosiPackage#getCasePostinstConditionValue()
 * @model
 * @generated
 */
public final class CasePostinstConditionValue extends AbstractEnumerator {
	/**
	 * The '<em><b>Configure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Configure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURE_LITERAL
	 * @model name="configure"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURE = 1;

	/**
	 * The '<em><b>Abort upgrade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abort upgrade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORT_UPGRADE_LITERAL
	 * @model name="abort_upgrade"
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_UPGRADE = 2;

	/**
	 * The '<em><b>Abort remove</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abort remove</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORT_REMOVE_LITERAL
	 * @model name="abort_remove"
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_REMOVE = 3;

	/**
	 * The '<em><b>Abort deconfigure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abort deconfigure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORT_DECONFIGURE_LITERAL
	 * @model name="abort_deconfigure"
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_DECONFIGURE = 4;

	/**
	 * The '<em><b>Configure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURE
	 * @generated
	 * @ordered
	 */
	public static final CasePostinstConditionValue CONFIGURE_LITERAL = new CasePostinstConditionValue(CONFIGURE, "configure", "configure");

	/**
	 * The '<em><b>Abort upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_UPGRADE
	 * @generated
	 * @ordered
	 */
	public static final CasePostinstConditionValue ABORT_UPGRADE_LITERAL = new CasePostinstConditionValue(ABORT_UPGRADE, "abort_upgrade", "abort_upgrade");

	/**
	 * The '<em><b>Abort remove</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_REMOVE
	 * @generated
	 * @ordered
	 */
	public static final CasePostinstConditionValue ABORT_REMOVE_LITERAL = new CasePostinstConditionValue(ABORT_REMOVE, "abort_remove", "abort_remove");

	/**
	 * The '<em><b>Abort deconfigure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_DECONFIGURE
	 * @generated
	 * @ordered
	 */
	public static final CasePostinstConditionValue ABORT_DECONFIGURE_LITERAL = new CasePostinstConditionValue(ABORT_DECONFIGURE, "abort_deconfigure", "abort_deconfigure");

	/**
	 * An array of all the '<em><b>Case Postinst Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CasePostinstConditionValue[] VALUES_ARRAY =
		new CasePostinstConditionValue[] {
			CONFIGURE_LITERAL,
			ABORT_UPGRADE_LITERAL,
			ABORT_REMOVE_LITERAL,
			ABORT_DECONFIGURE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Case Postinst Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Case Postinst Condition Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePostinstConditionValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CasePostinstConditionValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Postinst Condition Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePostinstConditionValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CasePostinstConditionValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Postinst Condition Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePostinstConditionValue get(int value) {
		switch (value) {
			case CONFIGURE: return CONFIGURE_LITERAL;
			case ABORT_UPGRADE: return ABORT_UPGRADE_LITERAL;
			case ABORT_REMOVE: return ABORT_REMOVE_LITERAL;
			case ABORT_DECONFIGURE: return ABORT_DECONFIGURE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CasePostinstConditionValue(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CasePostinstConditionValue
