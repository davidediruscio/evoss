/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postrm Xfonts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostrmXfonts#getCmds <em>Cmds</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostrmXfonts()
 * @model
 * @generated
 */
public interface PostrmXfonts extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Cmds</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmds</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostrmXfonts_Cmds()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Statement> getCmds();

} // PostrmXfonts
