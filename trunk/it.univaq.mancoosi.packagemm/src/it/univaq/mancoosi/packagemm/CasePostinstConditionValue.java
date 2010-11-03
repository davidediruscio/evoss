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
 * A representation of the literals of the enumeration '<em><b>Case Postinst Condition Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getCasePostinstConditionValue()
 * @model
 * @generated
 */
public enum CasePostinstConditionValue implements Enumerator {
	/**
	 * The '<em><b>Configure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURE(1, "configure", "configure"),

	/**
	 * The '<em><b>Abort upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_UPGRADE_VALUE
	 * @generated
	 * @ordered
	 */
	ABORT_UPGRADE(2, "abort_upgrade", "abort_upgrade"),

	/**
	 * The '<em><b>Abort remove</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_REMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	ABORT_REMOVE(3, "abort_remove", "abort_remove"),

	/**
	 * The '<em><b>Abort deconfigure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_DECONFIGURE_VALUE
	 * @generated
	 * @ordered
	 */
	ABORT_DECONFIGURE(4, "abort_deconfigure", "abort_deconfigure");

	/**
	 * The '<em><b>Configure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Configure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURE
	 * @model name="configure"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURE_VALUE = 1;

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
	public static final int ABORT_UPGRADE_VALUE = 2;

	/**
	 * The '<em><b>Abort remove</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abort remove</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORT_REMOVE
	 * @model name="abort_remove"
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_REMOVE_VALUE = 3;

	/**
	 * The '<em><b>Abort deconfigure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abort deconfigure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORT_DECONFIGURE
	 * @model name="abort_deconfigure"
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_DECONFIGURE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Case Postinst Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CasePostinstConditionValue[] VALUES_ARRAY =
		new CasePostinstConditionValue[] {
			CONFIGURE,
			ABORT_UPGRADE,
			ABORT_REMOVE,
			ABORT_DECONFIGURE,
		};

	/**
	 * A public read-only list of all the '<em><b>Case Postinst Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CasePostinstConditionValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case CONFIGURE_VALUE: return CONFIGURE;
			case ABORT_UPGRADE_VALUE: return ABORT_UPGRADE;
			case ABORT_REMOVE_VALUE: return ABORT_REMOVE;
			case ABORT_DECONFIGURE_VALUE: return ABORT_DECONFIGURE;
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
	private CasePostinstConditionValue(int value, String name, String literal) {
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
	
} //CasePostinstConditionValue
