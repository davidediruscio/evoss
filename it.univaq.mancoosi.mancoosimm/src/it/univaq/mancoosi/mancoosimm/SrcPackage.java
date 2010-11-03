/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.SrcPackage#getBuildDepends <em>Build Depends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.SrcPackage#getBuildConflicts <em>Build Conflicts</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSrcPackage()
 * @model
 * @generated
 */
public interface SrcPackage extends InstalledPackage {
	/**
	 * Returns the value of the '<em><b>Build Depends</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.BinPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Depends</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSrcPackage_BuildDepends()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BinPackage> getBuildDepends();

	/**
	 * Returns the value of the '<em><b>Build Conflicts</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.BinPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Conflicts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Conflicts</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSrcPackage_BuildConflicts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BinPackage> getBuildConflicts();

} // SrcPackage
