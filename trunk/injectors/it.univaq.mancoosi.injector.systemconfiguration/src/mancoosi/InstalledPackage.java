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
 * A representation of the model object '<em><b>Installed Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.InstalledPackage#getInstalledSize <em>Installed Size</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getFileSize <em>File Size</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getDescription <em>Description</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getSection <em>Section</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getTag <em>Tag</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getPriority <em>Priority</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getStatus <em>Status</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getUploaders <em>Uploaders</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getSourcePackage <em>Source Package</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getDepends <em>Depends</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getRecommends <em>Recommends</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getSuggests <em>Suggests</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getEnhances <em>Enhances</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getPredepends <em>Predepends</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getProvides <em>Provides</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getFiles <em>Files</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getDocumentationFiles <em>Documentation Files</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getPreinstScript <em>Preinst Script</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getPostinstScript <em>Postinst Script</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getPrermScript <em>Prerm Script</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getPostrmScript <em>Postrm Script</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getConfigScript <em>Config Script</em>}</li>
 *   <li>{@link mancoosi.InstalledPackage#getConflict <em>Conflict</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getInstalledPackage()
 * @model
 * @generated
 */
public interface InstalledPackage extends mancoosi.Package {
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
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_InstalledSize()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getInstalledSize();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getInstalledSize <em>Installed Size</em>}' attribute.
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
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Maintainer()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getMaintainer();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getMaintainer <em>Maintainer</em>}' attribute.
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
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Architecture()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getArchitecture <em>Architecture</em>}' attribute.
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
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_FileSize()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getFileSize();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getFileSize <em>File Size</em>}' attribute.
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
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_CheckSum()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCheckSum();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getCheckSum <em>Check Sum</em>}' attribute.
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
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Description()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getDescription <em>Description</em>}' attribute.
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
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Section()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getSection();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getSection <em>Section</em>}' attribute.
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
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Tag()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link mancoosi.PriorityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see mancoosi.PriorityType
	 * @see #setPriority(PriorityType)
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Priority()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	PriorityType getPriority();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see mancoosi.PriorityType
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PriorityType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link mancoosi.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see mancoosi.StatusType
	 * @see #setStatus(StatusType)
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Status()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see mancoosi.StatusType
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
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Uploaders()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getUploaders();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getUploaders <em>Uploaders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uploaders</em>' attribute.
	 * @see #getUploaders()
	 * @generated
	 */
	void setUploaders(String value);

	/**
	 * Returns the value of the '<em><b>Source Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Package</em>' reference.
	 * @see #setSourcePackage(SrcPackage)
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_SourcePackage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SrcPackage getSourcePackage();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getSourcePackage <em>Source Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Package</em>' reference.
	 * @see #getSourcePackage()
	 * @generated
	 */
	void setSourcePackage(SrcPackage value);

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
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Depends()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Dependence getDepends();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getDepends <em>Depends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends</em>' containment reference.
	 * @see #getDepends()
	 * @generated
	 */
	void setDepends(Dependence value);

	/**
	 * Returns the value of the '<em><b>Recommends</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommends</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Recommends()
	 * @model type="mancoosi.InstalledPackage" ordered="false"
	 * @generated
	 */
	EList getRecommends();

	/**
	 * Returns the value of the '<em><b>Suggests</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suggests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suggests</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Suggests()
	 * @model type="mancoosi.InstalledPackage" ordered="false"
	 * @generated
	 */
	EList getSuggests();

	/**
	 * Returns the value of the '<em><b>Enhances</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enhances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enhances</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Enhances()
	 * @model type="mancoosi.InstalledPackage" ordered="false"
	 * @generated
	 */
	EList getEnhances();

	/**
	 * Returns the value of the '<em><b>Predepends</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predepends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predepends</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Predepends()
	 * @model type="mancoosi.InstalledPackage" ordered="false"
	 * @generated
	 */
	EList getPredepends();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference.
	 * @see #setProvides(VirtualPackage)
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Provides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualPackage getProvides();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getProvides <em>Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides</em>' reference.
	 * @see #getProvides()
	 * @generated
	 */
	void setProvides(VirtualPackage value);

	/**
	 * Returns the value of the '<em><b>Replaces</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaces</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Replaces()
	 * @model type="mancoosi.InstalledPackage" ordered="false"
	 * @generated
	 */
	EList getReplaces();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Files()
	 * @model type="mancoosi.File" ordered="false"
	 * @generated
	 */
	EList getFiles();

	/**
	 * Returns the value of the '<em><b>Documentation Files</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.DocumentationFile}.
	 * It is bidirectional and its opposite is '{@link mancoosi.DocumentationFile#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation Files</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_DocumentationFiles()
	 * @see mancoosi.DocumentationFile#getPkg
	 * @model type="mancoosi.DocumentationFile" opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	EList getDocumentationFiles();

	/**
	 * Returns the value of the '<em><b>Preinst Script</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.PreinstScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preinst Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preinst Script</em>' containment reference.
	 * @see #setPreinstScript(PreinstScript)
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_PreinstScript()
	 * @see mancoosi.PreinstScript#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	PreinstScript getPreinstScript();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getPreinstScript <em>Preinst Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preinst Script</em>' containment reference.
	 * @see #getPreinstScript()
	 * @generated
	 */
	void setPreinstScript(PreinstScript value);

	/**
	 * Returns the value of the '<em><b>Postinst Script</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.PostinstScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postinst Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postinst Script</em>' containment reference.
	 * @see #setPostinstScript(PostinstScript)
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_PostinstScript()
	 * @see mancoosi.PostinstScript#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	PostinstScript getPostinstScript();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getPostinstScript <em>Postinst Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postinst Script</em>' containment reference.
	 * @see #getPostinstScript()
	 * @generated
	 */
	void setPostinstScript(PostinstScript value);

	/**
	 * Returns the value of the '<em><b>Prerm Script</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.PrermScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prerm Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerm Script</em>' containment reference.
	 * @see #setPrermScript(PrermScript)
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_PrermScript()
	 * @see mancoosi.PrermScript#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	PrermScript getPrermScript();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getPrermScript <em>Prerm Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prerm Script</em>' containment reference.
	 * @see #getPrermScript()
	 * @generated
	 */
	void setPrermScript(PrermScript value);

	/**
	 * Returns the value of the '<em><b>Postrm Script</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.PostrmScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postrm Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postrm Script</em>' containment reference.
	 * @see #setPostrmScript(PostrmScript)
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_PostrmScript()
	 * @see mancoosi.PostrmScript#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	PostrmScript getPostrmScript();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getPostrmScript <em>Postrm Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postrm Script</em>' containment reference.
	 * @see #getPostrmScript()
	 * @generated
	 */
	void setPostrmScript(PostrmScript value);

	/**
	 * Returns the value of the '<em><b>Config Script</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.ConfigScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Script</em>' containment reference.
	 * @see #setConfigScript(ConfigScript)
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_ConfigScript()
	 * @see mancoosi.ConfigScript#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	ConfigScript getConfigScript();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getConfigScript <em>Config Script</em>}' containment reference.
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
	 * @see mancoosi.MancoosiPackage#getInstalledPackage_Conflict()
	 * @model containment="true"
	 * @generated
	 */
	Conflict getConflict();

	/**
	 * Sets the value of the '{@link mancoosi.InstalledPackage#getConflict <em>Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict</em>' containment reference.
	 * @see #getConflict()
	 * @generated
	 */
	void setConflict(Conflict value);

} // InstalledPackage
