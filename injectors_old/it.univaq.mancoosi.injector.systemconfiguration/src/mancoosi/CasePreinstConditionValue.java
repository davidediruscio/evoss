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
 * A representation of the literals of the enumeration '<em><b>Case Preinst Condition Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mancoosi.MancoosiPackage#getCasePreinstConditionValue()
 * @model
 * @generated
 */
public final class CasePreinstConditionValue extends AbstractEnumerator {
	/**
	 * The '<em><b>Install</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Install</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTALL_LITERAL
	 * @model name="install"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALL = 1;

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
	public static final int ABORT_UPGRADE = 3;

	/**
	 * The '<em><b>Install</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALL
	 * @generated
	 * @ordered
	 */
	public static final CasePreinstConditionValue INSTALL_LITERAL = new CasePreinstConditionValue(INSTALL, "install", "install");

	/**
	 * The '<em><b>Upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE
	 * @generated
	 * @ordered
	 */
	public static final CasePreinstConditionValue UPGRADE_LITERAL = new CasePreinstConditionValue(UPGRADE, "upgrade", "upgrade");

	/**
	 * The '<em><b>Abort upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_UPGRADE
	 * @generated
	 * @ordered
	 */
	public static final CasePreinstConditionValue ABORT_UPGRADE_LITERAL = new CasePreinstConditionValue(ABORT_UPGRADE, "abort_upgrade", "abort_upgrade");

	/**
	 * An array of all the '<em><b>Case Preinst Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CasePreinstConditionValue[] VALUES_ARRAY =
		new CasePreinstConditionValue[] {
			INSTALL_LITERAL,
			UPGRADE_LITERAL,
			ABORT_UPGRADE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Case Preinst Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Case Preinst Condition Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePreinstConditionValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CasePreinstConditionValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Preinst Condition Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePreinstConditionValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CasePreinstConditionValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Preinst Condition Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePreinstConditionValue get(int value) {
		switch (value) {
			case INSTALL: return INSTALL_LITERAL;
			case UPGRADE: return UPGRADE_LITERAL;
			case ABORT_UPGRADE: return ABORT_UPGRADE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CasePreinstConditionValue(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CasePreinstConditionValue
