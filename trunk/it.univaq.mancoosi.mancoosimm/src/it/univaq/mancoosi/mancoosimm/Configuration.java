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
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Configuration#getInstalledPackages <em>Installed Packages</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Configuration#getFileSystem <em>File System</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Configuration#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Configuration#getNotInstalledPackages <em>Not Installed Packages</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Configuration#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Configuration#getSystemType <em>System Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Installed Packages</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installed Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installed Packages</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConfiguration_InstalledPackages()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InstalledPackage> getInstalledPackages();

	/**
	 * Returns the value of the '<em><b>File System</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.FileSystem#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File System</em>' containment reference.
	 * @see #setFileSystem(FileSystem)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConfiguration_FileSystem()
	 * @see it.univaq.mancoosi.mancoosimm.FileSystem#getConfiguration
	 * @model opposite="configuration" containment="true" required="true" ordered="false"
	 * @generated
	 */
	FileSystem getFileSystem();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Configuration#getFileSystem <em>File System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File System</em>' containment reference.
	 * @see #getFileSystem()
	 * @generated
	 */
	void setFileSystem(FileSystem value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Environment#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConfiguration_Environment()
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getConfiguration
	 * @model opposite="configuration" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Configuration#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Not Installed Packages</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.NotInstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Installed Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Installed Packages</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConfiguration_NotInstalledPackages()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NotInstalledPackage> getNotInstalledPackages();

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
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConfiguration_CreationTime()
	 * @model
	 * @generated
	 */
	String getCreationTime();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Configuration#getCreationTime <em>Creation Time</em>}' attribute.
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
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConfiguration_SystemType()
	 * @model
	 * @generated
	 */
	String getSystemType();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Configuration#getSystemType <em>System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type</em>' attribute.
	 * @see #getSystemType()
	 * @generated
	 */
	void setSystemType(String value);

} // Configuration
