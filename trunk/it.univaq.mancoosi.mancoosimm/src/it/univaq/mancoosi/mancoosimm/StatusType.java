/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getStatusType()
 * @model
 * @generated
 */
public enum StatusType implements Enumerator {
	/**
	 * The '<em><b>Installed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLED_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLED(1, "installed", "installed"),

	/**
	 * The '<em><b>Not installed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_INSTALLED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_INSTALLED(2, "not_installed", "not_installed"),

	/**
	 * The '<em><b>Half configured</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_CONFIGURED_VALUE
	 * @generated
	 * @ordered
	 */
	HALF_CONFIGURED(3, "half_configured", "half_configured"),

	/**
	 * The '<em><b>Half installed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_INSTALLED_VALUE
	 * @generated
	 * @ordered
	 */
	HALF_INSTALLED(4, "half_installed", "half_installed"),

	/**
	 * The '<em><b>Config files</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIG_FILES_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIG_FILES(5, "config_files", "config_files"),

	/**
	 * The '<em><b>Unpacked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPACKED_VALUE
	 * @generated
	 * @ordered
	 */
	UNPACKED(6, "unpacked", "unpacked");

	/**
	 * The '<em><b>Installed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Installed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTALLED
	 * @model name="installed"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLED_VALUE = 1;

	/**
	 * The '<em><b>Not installed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not installed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_INSTALLED
	 * @model name="not_installed"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_INSTALLED_VALUE = 2;

	/**
	 * The '<em><b>Half configured</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Half configured</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALF_CONFIGURED
	 * @model name="half_configured"
	 * @generated
	 * @ordered
	 */
	public static final int HALF_CONFIGURED_VALUE = 3;

	/**
	 * The '<em><b>Half installed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Half installed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALF_INSTALLED
	 * @model name="half_installed"
	 * @generated
	 * @ordered
	 */
	public static final int HALF_INSTALLED_VALUE = 4;

	/**
	 * The '<em><b>Config files</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Config files</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIG_FILES
	 * @model name="config_files"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIG_FILES_VALUE = 5;

	/**
	 * The '<em><b>Unpacked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unpacked</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNPACKED
	 * @model name="unpacked"
	 * @generated
	 * @ordered
	 */
	public static final int UNPACKED_VALUE = 6;

	/**
	 * An array of all the '<em><b>Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatusType[] VALUES_ARRAY =
		new StatusType[] {
			INSTALLED,
			NOT_INSTALLED,
			HALF_CONFIGURED,
			HALF_INSTALLED,
			CONFIG_FILES,
			UNPACKED,
		};

	/**
	 * A public read-only list of all the '<em><b>Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StatusType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatusType get(int value) {
		switch (value) {
			case INSTALLED_VALUE: return INSTALLED;
			case NOT_INSTALLED_VALUE: return NOT_INSTALLED;
			case HALF_CONFIGURED_VALUE: return HALF_CONFIGURED;
			case HALF_INSTALLED_VALUE: return HALF_INSTALLED;
			case CONFIG_FILES_VALUE: return CONFIG_FILES;
			case UNPACKED_VALUE: return UNPACKED;
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
	private StatusType(int value, String name, String literal) {
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
	
} //StatusType
