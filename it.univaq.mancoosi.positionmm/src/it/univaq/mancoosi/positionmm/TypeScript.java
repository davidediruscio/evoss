/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.positionmm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Script</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.univaq.mancoosi.positionmm.PositionmmPackage#getTypeScript()
 * @model
 * @generated
 */
public enum TypeScript implements Enumerator {
	/**
	 * The '<em><b>Preinst Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREINST_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	PREINST_SCRIPT(0, "PreinstScript", "PreinstScript"),

	/**
	 * The '<em><b>Postinst Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTINST_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	POSTINST_SCRIPT(1, "PostinstScript", "PostinstScript"),

	/**
	 * The '<em><b>Prerm Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRERM_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	PRERM_SCRIPT(2, "PrermScript", "PrermScript"),

	/**
	 * The '<em><b>Postrm Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTRM_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	POSTRM_SCRIPT(3, "PostrmScript", "PostrmScript");

	/**
	 * The '<em><b>Preinst Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preinst Script</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREINST_SCRIPT
	 * @model name="PreinstScript"
	 * @generated
	 * @ordered
	 */
	public static final int PREINST_SCRIPT_VALUE = 0;

	/**
	 * The '<em><b>Postinst Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Postinst Script</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSTINST_SCRIPT
	 * @model name="PostinstScript"
	 * @generated
	 * @ordered
	 */
	public static final int POSTINST_SCRIPT_VALUE = 1;

	/**
	 * The '<em><b>Prerm Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prerm Script</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRERM_SCRIPT
	 * @model name="PrermScript"
	 * @generated
	 * @ordered
	 */
	public static final int PRERM_SCRIPT_VALUE = 2;

	/**
	 * The '<em><b>Postrm Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Postrm Script</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSTRM_SCRIPT
	 * @model name="PostrmScript"
	 * @generated
	 * @ordered
	 */
	public static final int POSTRM_SCRIPT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Script</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeScript[] VALUES_ARRAY =
		new TypeScript[] {
			PREINST_SCRIPT,
			POSTINST_SCRIPT,
			PRERM_SCRIPT,
			POSTRM_SCRIPT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Script</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeScript> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Script</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeScript get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeScript result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Script</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeScript getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeScript result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Script</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeScript get(int value) {
		switch (value) {
			case PREINST_SCRIPT_VALUE: return PREINST_SCRIPT;
			case POSTINST_SCRIPT_VALUE: return POSTINST_SCRIPT;
			case PRERM_SCRIPT_VALUE: return PRERM_SCRIPT;
			case POSTRM_SCRIPT_VALUE: return POSTRM_SCRIPT;
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
	private TypeScript(int value, String name, String literal) {
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
	
} //TypeScript
