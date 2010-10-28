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
 * A representation of the model object '<em><b>Src Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.SrcPackage#getBuildDepends <em>Build Depends</em>}</li>
 *   <li>{@link mancoosi.SrcPackage#getBuildConflicts <em>Build Conflicts</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getSrcPackage()
 * @model
 * @generated
 */
public interface SrcPackage extends InstalledPackage {
	/**
	 * Returns the value of the '<em><b>Build Depends</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.BinPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Depends</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getSrcPackage_BuildDepends()
	 * @model type="mancoosi.BinPackage" ordered="false"
	 * @generated
	 */
	EList getBuildDepends();

	/**
	 * Returns the value of the '<em><b>Build Conflicts</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.BinPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Conflicts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Conflicts</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getSrcPackage_BuildConflicts()
	 * @model type="mancoosi.BinPackage" ordered="false"
	 * @generated
	 */
	EList getBuildConflicts();

} // SrcPackage
