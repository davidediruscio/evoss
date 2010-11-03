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
 * A representation of the literals of the enumeration '<em><b>Case Prerm Condition Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getCasePrermConditionValue()
 * @model
 * @generated
 */
public enum CasePrermConditionValue implements Enumerator {
	/**
	 * The '<em><b>Remove</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE(1, "remove", "remove"),

	/**
	 * The '<em><b>Upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE_VALUE
	 * @generated
	 * @ordered
	 */
	UPGRADE(2, "upgrade", "upgrade"),

	/**
	 * The '<em><b>Deconfigure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECONFIGURE_VALUE
	 * @generated
	 * @ordered
	 */
	DECONFIGURE(3, "deconfigure", "deconfigure"),

	/**
	 * The '<em><b>Failed upgrade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED_UPGRADE_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED_UPGRADE(4, "failed_upgrade", "failed_upgrade");

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
	public static final int REMOVE_VALUE = 1;

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
	public static final int UPGRADE_VALUE = 2;

	/**
	 * The '<em><b>Deconfigure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deconfigure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECONFIGURE
	 * @model name="deconfigure"
	 * @generated
	 * @ordered
	 */
	public static final int DECONFIGURE_VALUE = 3;

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
	public static final int FAILED_UPGRADE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Case Prerm Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CasePrermConditionValue[] VALUES_ARRAY =
		new CasePrermConditionValue[] {
			REMOVE,
			UPGRADE,
			DECONFIGURE,
			FAILED_UPGRADE,
		};

	/**
	 * A public read-only list of all the '<em><b>Case Prerm Condition Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CasePrermConditionValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case REMOVE_VALUE: return REMOVE;
			case UPGRADE_VALUE: return UPGRADE;
			case DECONFIGURE_VALUE: return DECONFIGURE;
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
	private CasePrermConditionValue(int value, String name, String literal) {
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
	
} //CasePrermConditionValue
