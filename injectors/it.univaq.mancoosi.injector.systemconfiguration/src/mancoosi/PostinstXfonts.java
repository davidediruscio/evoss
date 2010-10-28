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
 * A representation of the model object '<em><b>Postinst Xfonts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostinstXfonts#getCmds <em>Cmds</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostinstXfonts()
 * @model
 * @generated
 */
public interface PostinstXfonts extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Cmds</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmds</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getPostinstXfonts_Cmds()
	 * @model type="mancoosi.Statement" ordered="false"
	 * @generated
	 */
	EList getCmds();

} // PostinstXfonts
