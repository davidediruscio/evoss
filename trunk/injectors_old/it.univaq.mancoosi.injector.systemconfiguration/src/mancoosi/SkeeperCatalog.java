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
 * A representation of the model object '<em><b>Skeeper Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.SkeeperCatalog#getEnv <em>Env</em>}</li>
 *   <li>{@link mancoosi.SkeeperCatalog#getDocuments <em>Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getSkeeperCatalog()
 * @model
 * @generated
 */
public interface SkeeperCatalog extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Environment#getSkeeperCatalog <em>Skeeper Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see mancoosi.MancoosiPackage#getSkeeperCatalog_Env()
	 * @see mancoosi.Environment#getSkeeperCatalog
	 * @model opposite="skeeperCatalog" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link mancoosi.SkeeperCatalog#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.SkeeperDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getSkeeperCatalog_Documents()
	 * @model type="mancoosi.SkeeperDocument" ordered="false"
	 * @generated
	 */
	EList getDocuments();

} // SkeeperCatalog
