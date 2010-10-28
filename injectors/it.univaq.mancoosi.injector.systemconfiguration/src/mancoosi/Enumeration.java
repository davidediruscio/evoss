/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.Enumeration#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.EnumerationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getEnumeration_Elements()
	 * @model type="mancoosi.EnumerationElement" required="true"
	 * @generated
	 */
	EList getElements();

} // Enumeration
