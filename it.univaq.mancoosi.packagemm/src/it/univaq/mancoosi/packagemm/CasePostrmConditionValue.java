/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Case Postrm Condition Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getCasePostrmConditionValue()
 * @model
 * @generated
 */
public enum CasePostrmConditionValue implements Enumerator {
	/**
	 * The '<em><b>Purge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURGE_VALUE
	 * @generated
	 * @ordered
	 */
	PURGE(1, "purge", "purge"),

	/**
	 * The '<em><b>Remove</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE(2, "remove", "remove"),

	/**
	 * The '<em><b>Upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE_VALUE
	 * @generated
	 * @ordered
	 */
	UPGRADE(3, "upgrade", "upgrade"),

	/**
	 * The '<em><b>Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED(4, "failed", "failed"),

	/**
	 * The '<em><b>Abort install</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_INSTALL_VALUE
	 * @generated
	 * @ordered
	 */
	ABORT_INSTALL(5, "abort_install", "abort_install"),

	/**
	 * The '<em><b>Abort upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_UPGRADE_VALUE
	 * @generated
	 * @ordered
	 */
	ABORT_UPGRADE(6, "abort_upgrade", "abort_upgrade"),

	/**
	 * The '<em><b>Disappear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISAPPEAR_VALUE
	 * @generated
	 * @ordered
	 */
	DISAPPEAR(7, "disappear", "disappear"),

	/**
	 * The '<em><b>Failed upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED_UPGRADE_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED_UPGRADE(8, "failed_upgrade", "failed_upgrade");

	/**
	 * The '<em><b>Purge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Purge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PURGE
	 * @model name="purge"
	 * @generated
	 * @ordered
	 */
	public static final int PURGE_VALUE = 1;

	/**
	 * The '<em><b>Remove</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remove</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE
	 * @model name="remove"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_VALUE = 2;

	/**
	 * The '<em><b>Upgrade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upgrade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPGRADE
	 * @model name="upgrade"
	 * @generated
	 * @ordered
	 */
	public static final int UPGRADE_VALUE = 3;

	/**
	 * The '<em><b>Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Failed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILED
	 * @model name="failed"
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_VALUE = 4;

	/**
	 * The '<em><b>Abort install</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abort install</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORT_INSTALL
	 * @model name="abort_install"
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_INSTALL_VALUE = 5;

	/**
	 * The '<em><b>Abort upgrade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abort upgrade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORT_UPGRADE
	 * @model name="abort_upgrade"
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_UPGRADE_VALUE = 6;

	/**
	 * The '<em><b>Disappear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disappear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISAPPEAR
	 * @model name="disappear"
	 * @generated
	 * @ordered
	 */
	public static final int DISAPPEAR_VALUE = 7;

	/**
	 * The '<em><b>Failed upgrade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Failed upgrade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILED_UPGRADE
	 * @model name="failed_upgrade"
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_UPGRADE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Case Postrm Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CasePostrmConditionValue[] VALUES_ARRAY =
		new CasePostrmConditionValue[] {
			PURGE,
			REMOVE,
			UPGRADE,
			FAILED,
			ABORT_INSTALL,
			ABORT_UPGRADE,
			DISAPPEAR,
			FAILED_UPGRADE,
		};

	/**
	 * A public read-only list of all the '<em><b>Case Postrm Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CasePostrmConditionValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Case Postrm Condition Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePostrmConditionValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CasePostrmConditionValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Postrm Condition Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePostrmConditionValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CasePostrmConditionValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Postrm Condition Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasePostrmConditionValue get(int value) {
		switch (value) {
			case PURGE_VALUE: return PURGE;
			case REMOVE_VALUE: return REMOVE;
			case UPGRADE_VALUE: return UPGRADE;
			case FAILED_VALUE: return FAILED;
			case ABORT_INSTALL_VALUE: return ABORT_INSTALL;
			case ABORT_UPGRADE_VALUE: return ABORT_UPGRADE;
			case DISAPPEAR_VALUE: return DISAPPEAR;
			case FAILED_UPGRADE_VALUE: return FAILED_UPGRADE;
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
	private CasePostrmConditionValue(int value, String name, String literal) {
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
	
} //CasePostrmConditionValue
