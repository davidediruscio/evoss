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
 * A representation of the model object '<em><b>Boot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.Boot#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getBoot()
 * @model
 * @generated
 */
public interface Boot extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getBoot_Services()
	 * @model type="mancoosi.Service" required="true" ordered="false"
	 * @generated
	 */
	EList getServices();

} // Boot
