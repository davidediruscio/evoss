/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostinstScript#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostinstScript()
 * @model
 * @generated
 */
public interface PostinstScript extends Script {
	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.InstalledPackage#getPostinstScript <em>Postinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' container reference.
	 * @see #setPkg(InstalledPackage)
	 * @see mancoosi.MancoosiPackage#getPostinstScript_Pkg()
	 * @see mancoosi.InstalledPackage#getPostinstScript
	 * @model opposite="PostinstScript" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InstalledPackage getPkg();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstScript#getPkg <em>Pkg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' container reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(InstalledPackage value);

} // PostinstScript
