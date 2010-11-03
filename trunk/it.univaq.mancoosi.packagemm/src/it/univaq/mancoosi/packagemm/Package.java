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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getVersion <em>Version</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getInstalledSize <em>Installed Size</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getFileSize <em>File Size</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getDescription <em>Description</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getSection <em>Section</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getTag <em>Tag</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getPriority <em>Priority</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getStatus <em>Status</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getUploaders <em>Uploaders</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getRecommends <em>Recommends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getSuggests <em>Suggests</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getEnhances <em>Enhances</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getPredepends <em>Predepends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getFiles <em>Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getDocumentationFiles <em>Documentation Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getPreinstScript <em>Preinst Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getPostinstScript <em>Postinst Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getPrermScript <em>Prerm Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getPostrmScript <em>Postrm Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getConfigScript <em>Config Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getConflict <em>Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getDepends <em>Depends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Package#getConffiles <em>Conffiles</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Version()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Installed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installed Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installed Size</em>' attribute.
	 * @see #setInstalledSize(int)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_InstalledSize()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getInstalledSize();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getInstalledSize <em>Installed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installed Size</em>' attribute.
	 * @see #getInstalledSize()
	 * @generated
	 */
	void setInstalledSize(int value);

	/**
	 * Returns the value of the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintainer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintainer</em>' attribute.
	 * @see #setMaintainer(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Maintainer()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getMaintainer();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getMaintainer <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintainer</em>' attribute.
	 * @see #getMaintainer()
	 * @generated
	 */
	void setMaintainer(String value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see #setArchitecture(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Architecture()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Size</em>' attribute.
	 * @see #setFileSize(int)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_FileSize()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getFileSize();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getFileSize <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size</em>' attribute.
	 * @see #getFileSize()
	 * @generated
	 */
	void setFileSize(int value);

	/**
	 * Returns the value of the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Sum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Sum</em>' attribute.
	 * @see #setCheckSum(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_CheckSum()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCheckSum();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getCheckSum <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Sum</em>' attribute.
	 * @see #getCheckSum()
	 * @generated
	 */
	void setCheckSum(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Description()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' attribute.
	 * @see #setSection(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Section()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getSection();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' attribute.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Tag()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.mancoosi.packagemm.PriorityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see it.univaq.mancoosi.packagemm.PriorityType
	 * @see #setPriority(PriorityType)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Priority()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	PriorityType getPriority();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see it.univaq.mancoosi.packagemm.PriorityType
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PriorityType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.mancoosi.packagemm.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see it.univaq.mancoosi.packagemm.StatusType
	 * @see #setStatus(StatusType)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Status()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see it.univaq.mancoosi.packagemm.StatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Returns the value of the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uploaders</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uploaders</em>' attribute.
	 * @see #setUploaders(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Uploaders()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getUploaders();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getUploaders <em>Uploaders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uploaders</em>' attribute.
	 * @see #getUploaders()
	 * @generated
	 */
	void setUploaders(String value);

	/**
	 * Returns the value of the '<em><b>Recommends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommends</em>' attribute.
	 * @see #setRecommends(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Recommends()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getRecommends();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getRecommends <em>Recommends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommends</em>' attribute.
	 * @see #getRecommends()
	 * @generated
	 */
	void setRecommends(String value);

	/**
	 * Returns the value of the '<em><b>Suggests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suggests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suggests</em>' attribute.
	 * @see #setSuggests(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Suggests()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getSuggests();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getSuggests <em>Suggests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suggests</em>' attribute.
	 * @see #getSuggests()
	 * @generated
	 */
	void setSuggests(String value);

	/**
	 * Returns the value of the '<em><b>Enhances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enhances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enhances</em>' attribute.
	 * @see #setEnhances(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Enhances()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getEnhances();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getEnhances <em>Enhances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enhances</em>' attribute.
	 * @see #getEnhances()
	 * @generated
	 */
	void setEnhances(String value);

	/**
	 * Returns the value of the '<em><b>Predepends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predepends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predepends</em>' attribute.
	 * @see #setPredepends(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Predepends()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPredepends();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getPredepends <em>Predepends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predepends</em>' attribute.
	 * @see #getPredepends()
	 * @generated
	 */
	void setPredepends(String value);

	/**
	 * Returns the value of the '<em><b>Replaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replaces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaces</em>' attribute.
	 * @see #setReplaces(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Replaces()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getReplaces();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getReplaces <em>Replaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaces</em>' attribute.
	 * @see #getReplaces()
	 * @generated
	 */
	void setReplaces(String value);

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Files()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Documentation Files</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.DocumentationFile}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.DocumentationFile#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation Files</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_DocumentationFiles()
	 * @see it.univaq.mancoosi.packagemm.DocumentationFile#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	EList<DocumentationFile> getDocumentationFiles();

	/**
	 * Returns the value of the '<em><b>Preinst Script</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.PreinstScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preinst Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preinst Script</em>' containment reference.
	 * @see #setPreinstScript(PreinstScript)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_PreinstScript()
	 * @see it.univaq.mancoosi.packagemm.PreinstScript#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	PreinstScript getPreinstScript();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getPreinstScript <em>Preinst Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preinst Script</em>' containment reference.
	 * @see #getPreinstScript()
	 * @generated
	 */
	void setPreinstScript(PreinstScript value);

	/**
	 * Returns the value of the '<em><b>Postinst Script</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.PostinstScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postinst Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postinst Script</em>' containment reference.
	 * @see #setPostinstScript(PostinstScript)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_PostinstScript()
	 * @see it.univaq.mancoosi.packagemm.PostinstScript#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	PostinstScript getPostinstScript();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getPostinstScript <em>Postinst Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postinst Script</em>' containment reference.
	 * @see #getPostinstScript()
	 * @generated
	 */
	void setPostinstScript(PostinstScript value);

	/**
	 * Returns the value of the '<em><b>Prerm Script</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.PrermScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prerm Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerm Script</em>' containment reference.
	 * @see #setPrermScript(PrermScript)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_PrermScript()
	 * @see it.univaq.mancoosi.packagemm.PrermScript#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	PrermScript getPrermScript();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getPrermScript <em>Prerm Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prerm Script</em>' containment reference.
	 * @see #getPrermScript()
	 * @generated
	 */
	void setPrermScript(PrermScript value);

	/**
	 * Returns the value of the '<em><b>Postrm Script</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.PostrmScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postrm Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postrm Script</em>' containment reference.
	 * @see #setPostrmScript(PostrmScript)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_PostrmScript()
	 * @see it.univaq.mancoosi.packagemm.PostrmScript#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	PostrmScript getPostrmScript();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getPostrmScript <em>Postrm Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postrm Script</em>' containment reference.
	 * @see #getPostrmScript()
	 * @generated
	 */
	void setPostrmScript(PostrmScript value);

	/**
	 * Returns the value of the '<em><b>Config Script</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.ConfigScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Script</em>' containment reference.
	 * @see #setConfigScript(ConfigScript)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_ConfigScript()
	 * @see it.univaq.mancoosi.packagemm.ConfigScript#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	ConfigScript getConfigScript();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getConfigScript <em>Config Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Script</em>' containment reference.
	 * @see #getConfigScript()
	 * @generated
	 */
	void setConfigScript(ConfigScript value);

	/**
	 * Returns the value of the '<em><b>Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflict</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict</em>' containment reference.
	 * @see #setConflict(Conflict)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Conflict()
	 * @model containment="true"
	 * @generated
	 */
	Conflict getConflict();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getConflict <em>Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict</em>' containment reference.
	 * @see #getConflict()
	 * @generated
	 */
	void setConflict(Conflict value);

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' containment reference.
	 * @see #setDepends(Dependence)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Depends()
	 * @model containment="true"
	 * @generated
	 */
	Dependence getDepends();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Package#getDepends <em>Depends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends</em>' containment reference.
	 * @see #getDepends()
	 * @generated
	 */
	void setDepends(Dependence value);

	/**
	 * Returns the value of the '<em><b>Conffiles</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conffiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conffiles</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackage_Conffiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getConffiles();

} // Package
