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
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.Configuration#getInstalledPackages <em>Installed Packages</em>}</li>
 *   <li>{@link mancoosi.Configuration#getFileSystem <em>File System</em>}</li>
 *   <li>{@link mancoosi.Configuration#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link mancoosi.Configuration#getNotInstalledPackages <em>Not Installed Packages</em>}</li>
 *   <li>{@link mancoosi.Configuration#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link mancoosi.Configuration#getSystemType <em>System Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Installed Packages</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installed Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installed Packages</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getConfiguration_InstalledPackages()
	 * @model type="mancoosi.InstalledPackage" containment="true" ordered="false"
	 * @generated
	 */
	EList getInstalledPackages();

	/**
	 * Returns the value of the '<em><b>File System</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.FileSystem#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File System</em>' containment reference.
	 * @see #setFileSystem(FileSystem)
	 * @see mancoosi.MancoosiPackage#getConfiguration_FileSystem()
	 * @see mancoosi.FileSystem#getConfiguration
	 * @model opposite="configuration" containment="true" required="true" ordered="false"
	 * @generated
	 */
	FileSystem getFileSystem();

	/**
	 * Sets the value of the '{@link mancoosi.Configuration#getFileSystem <em>File System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File System</em>' containment reference.
	 * @see #getFileSystem()
	 * @generated
	 */
	void setFileSystem(FileSystem value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Environment#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see mancoosi.MancoosiPackage#getConfiguration_Environment()
	 * @see mancoosi.Environment#getConfiguration
	 * @model opposite="configuration" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link mancoosi.Configuration#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Not Installed Packages</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.NotInstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Installed Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Installed Packages</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getConfiguration_NotInstalledPackages()
	 * @model type="mancoosi.NotInstalledPackage" containment="true" ordered="false"
	 * @generated
	 */
	EList getNotInstalledPackages();

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' attribute.
	 * @see #setCreationTime(String)
	 * @see mancoosi.MancoosiPackage#getConfiguration_CreationTime()
	 * @model
	 * @generated
	 */
	String getCreationTime();

	/**
	 * Sets the value of the '{@link mancoosi.Configuration#getCreationTime <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' attribute.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(String value);

	/**
	 * Returns the value of the '<em><b>System Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type</em>' attribute.
	 * @see #setSystemType(String)
	 * @see mancoosi.MancoosiPackage#getConfiguration_SystemType()
	 * @model
	 * @generated
	 */
	String getSystemType();

	/**
	 * Sets the value of the '{@link mancoosi.Configuration#getSystemType <em>System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type</em>' attribute.
	 * @see #getSystemType()
	 * @generated
	 */
	void setSystemType(String value);

} // Configuration
