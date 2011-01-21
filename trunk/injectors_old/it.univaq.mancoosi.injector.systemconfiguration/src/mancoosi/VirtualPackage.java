/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.VirtualPackage#getImpPackage <em>Imp Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getVirtualPackage()
 * @model
 * @generated
 */
public interface VirtualPackage extends InstalledPackage {
	/**
	 * Returns the value of the '<em><b>Imp Package</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imp Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imp Package</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getVirtualPackage_ImpPackage()
	 * @model type="mancoosi.InstalledPackage" required="true" ordered="false"
	 * @generated
	 */
	EList getImpPackage();

} // VirtualPackage
