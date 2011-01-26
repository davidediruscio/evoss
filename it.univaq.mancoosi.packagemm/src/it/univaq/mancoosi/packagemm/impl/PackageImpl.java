/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.ConfigScript;
import it.univaq.mancoosi.packagemm.Conflict;
import it.univaq.mancoosi.packagemm.Dependence;
import it.univaq.mancoosi.packagemm.DocumentationFile;
import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.PostinstScript;
import it.univaq.mancoosi.packagemm.PostrmScript;
import it.univaq.mancoosi.packagemm.PreinstScript;
import it.univaq.mancoosi.packagemm.PrermScript;
import it.univaq.mancoosi.packagemm.PriorityType;
import it.univaq.mancoosi.packagemm.StatusType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getInstalledSize <em>Installed Size</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getFileSize <em>File Size</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getSection <em>Section</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getUploaders <em>Uploaders</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getRecommends <em>Recommends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getSuggests <em>Suggests</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getEnhances <em>Enhances</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getPredepends <em>Predepends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getDocumentationFiles <em>Documentation Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getPreinstScript <em>Preinst Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getPostinstScript <em>Postinst Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getPrermScript <em>Prerm Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getPostrmScript <em>Postrm Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getConfigScript <em>Config Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getConflict <em>Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageImpl#getConffiles <em>Conffiles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements it.univaq.mancoosi.packagemm.Package {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstalledSize() <em>Installed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledSize()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTALLED_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstalledSize() <em>Installed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledSize()
	 * @generated
	 * @ordered
	 */
	protected int installedSize = INSTALLED_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaintainer() <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainer()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintainer() <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainer()
	 * @generated
	 * @ordered
	 */
	protected String maintainer = MAINTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FILE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected int fileSize = FILE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_SUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected String checkSum = CHECK_SUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected String section = SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final PriorityType PRIORITY_EDEFAULT = PriorityType.STANDARD;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected PriorityType priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusType STATUS_EDEFAULT = StatusType.INSTALLED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusType status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUploaders() <em>Uploaders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploaders()
	 * @generated
	 * @ordered
	 */
	protected static final String UPLOADERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUploaders() <em>Uploaders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploaders()
	 * @generated
	 * @ordered
	 */
	protected String uploaders = UPLOADERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecommends() <em>Recommends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommends()
	 * @generated
	 * @ordered
	 */
	protected static final String RECOMMENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecommends() <em>Recommends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommends()
	 * @generated
	 * @ordered
	 */
	protected String recommends = RECOMMENDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuggests() <em>Suggests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuggests()
	 * @generated
	 * @ordered
	 */
	protected static final String SUGGESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuggests() <em>Suggests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuggests()
	 * @generated
	 * @ordered
	 */
	protected String suggests = SUGGESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnhances() <em>Enhances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhances()
	 * @generated
	 * @ordered
	 */
	protected static final String ENHANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnhances() <em>Enhances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhances()
	 * @generated
	 * @ordered
	 */
	protected String enhances = ENHANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredepends() <em>Predepends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredepends()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDEPENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredepends() <em>Predepends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredepends()
	 * @generated
	 * @ordered
	 */
	protected String predepends = PREDEPENDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplaces() <em>Replaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaces()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplaces() <em>Replaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaces()
	 * @generated
	 * @ordered
	 */
	protected String replaces = REPLACES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getDocumentationFiles() <em>Documentation Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentationFile> documentationFiles;

	/**
	 * The cached value of the '{@link #getPreinstScript() <em>Preinst Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreinstScript()
	 * @generated
	 * @ordered
	 */
	protected PreinstScript preinstScript;

	/**
	 * The cached value of the '{@link #getPostinstScript() <em>Postinst Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostinstScript()
	 * @generated
	 * @ordered
	 */
	protected PostinstScript postinstScript;

	/**
	 * The cached value of the '{@link #getPrermScript() <em>Prerm Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrermScript()
	 * @generated
	 * @ordered
	 */
	protected PrermScript prermScript;

	/**
	 * The cached value of the '{@link #getPostrmScript() <em>Postrm Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostrmScript()
	 * @generated
	 * @ordered
	 */
	protected PostrmScript postrmScript;

	/**
	 * The cached value of the '{@link #getConfigScript() <em>Config Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigScript()
	 * @generated
	 * @ordered
	 */
	protected ConfigScript configScript;

	/**
	 * The cached value of the '{@link #getConflict() <em>Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflict()
	 * @generated
	 * @ordered
	 */
	protected Conflict conflict;

	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected Dependence depends;

	/**
	 * The cached value of the '{@link #getConffiles() <em>Conffiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConffiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> conffiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstalledSize() {
		return installedSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstalledSize(int newInstalledSize) {
		int oldInstalledSize = installedSize;
		installedSize = newInstalledSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__INSTALLED_SIZE, oldInstalledSize, installedSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaintainer() {
		return maintainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainer(String newMaintainer) {
		String oldMaintainer = maintainer;
		maintainer = newMaintainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__MAINTAINER, oldMaintainer, maintainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(String newArchitecture) {
		String oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFileSize() {
		return fileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSize(int newFileSize) {
		int oldFileSize = fileSize;
		fileSize = newFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__FILE_SIZE, oldFileSize, fileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckSum() {
		return checkSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckSum(String newCheckSum) {
		String oldCheckSum = checkSum;
		checkSum = newCheckSum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__CHECK_SUM, oldCheckSum, checkSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSection() {
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(String newSection) {
		String oldSection = section;
		section = newSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__SECTION, oldSection, section));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityType getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(PriorityType newPriority) {
		PriorityType oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		StatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUploaders() {
		return uploaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUploaders(String newUploaders) {
		String oldUploaders = uploaders;
		uploaders = newUploaders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__UPLOADERS, oldUploaders, uploaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecommends() {
		return recommends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommends(String newRecommends) {
		String oldRecommends = recommends;
		recommends = newRecommends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__RECOMMENDS, oldRecommends, recommends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuggests() {
		return suggests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuggests(String newSuggests) {
		String oldSuggests = suggests;
		suggests = newSuggests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__SUGGESTS, oldSuggests, suggests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnhances() {
		return enhances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnhances(String newEnhances) {
		String oldEnhances = enhances;
		enhances = newEnhances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__ENHANCES, oldEnhances, enhances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredepends() {
		return predepends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredepends(String newPredepends) {
		String oldPredepends = predepends;
		predepends = newPredepends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__PREDEPENDS, oldPredepends, predepends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplaces() {
		return replaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplaces(String newReplaces) {
		String oldReplaces = replaces;
		replaces = newReplaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__REPLACES, oldReplaces, replaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, PackagemmPackage.PACKAGE__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationFile> getDocumentationFiles() {
		if (documentationFiles == null) {
			documentationFiles = new EObjectWithInverseResolvingEList<DocumentationFile>(DocumentationFile.class, this, PackagemmPackage.PACKAGE__DOCUMENTATION_FILES, PackagemmPackage.DOCUMENTATION_FILE__PKG);
		}
		return documentationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreinstScript getPreinstScript() {
		return preinstScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreinstScript(PreinstScript newPreinstScript, NotificationChain msgs) {
		PreinstScript oldPreinstScript = preinstScript;
		preinstScript = newPreinstScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__PREINST_SCRIPT, oldPreinstScript, newPreinstScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreinstScript(PreinstScript newPreinstScript) {
		if (newPreinstScript != preinstScript) {
			NotificationChain msgs = null;
			if (preinstScript != null)
				msgs = ((InternalEObject)preinstScript).eInverseRemove(this, PackagemmPackage.PREINST_SCRIPT__PKG, PreinstScript.class, msgs);
			if (newPreinstScript != null)
				msgs = ((InternalEObject)newPreinstScript).eInverseAdd(this, PackagemmPackage.PREINST_SCRIPT__PKG, PreinstScript.class, msgs);
			msgs = basicSetPreinstScript(newPreinstScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__PREINST_SCRIPT, newPreinstScript, newPreinstScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstScript getPostinstScript() {
		return postinstScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostinstScript(PostinstScript newPostinstScript, NotificationChain msgs) {
		PostinstScript oldPostinstScript = postinstScript;
		postinstScript = newPostinstScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__POSTINST_SCRIPT, oldPostinstScript, newPostinstScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostinstScript(PostinstScript newPostinstScript) {
		if (newPostinstScript != postinstScript) {
			NotificationChain msgs = null;
			if (postinstScript != null)
				msgs = ((InternalEObject)postinstScript).eInverseRemove(this, PackagemmPackage.POSTINST_SCRIPT__PKG, PostinstScript.class, msgs);
			if (newPostinstScript != null)
				msgs = ((InternalEObject)newPostinstScript).eInverseAdd(this, PackagemmPackage.POSTINST_SCRIPT__PKG, PostinstScript.class, msgs);
			msgs = basicSetPostinstScript(newPostinstScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__POSTINST_SCRIPT, newPostinstScript, newPostinstScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermScript getPrermScript() {
		return prermScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrermScript(PrermScript newPrermScript, NotificationChain msgs) {
		PrermScript oldPrermScript = prermScript;
		prermScript = newPrermScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__PRERM_SCRIPT, oldPrermScript, newPrermScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrermScript(PrermScript newPrermScript) {
		if (newPrermScript != prermScript) {
			NotificationChain msgs = null;
			if (prermScript != null)
				msgs = ((InternalEObject)prermScript).eInverseRemove(this, PackagemmPackage.PRERM_SCRIPT__PKG, PrermScript.class, msgs);
			if (newPrermScript != null)
				msgs = ((InternalEObject)newPrermScript).eInverseAdd(this, PackagemmPackage.PRERM_SCRIPT__PKG, PrermScript.class, msgs);
			msgs = basicSetPrermScript(newPrermScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__PRERM_SCRIPT, newPrermScript, newPrermScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmScript getPostrmScript() {
		return postrmScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostrmScript(PostrmScript newPostrmScript, NotificationChain msgs) {
		PostrmScript oldPostrmScript = postrmScript;
		postrmScript = newPostrmScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__POSTRM_SCRIPT, oldPostrmScript, newPostrmScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostrmScript(PostrmScript newPostrmScript) {
		if (newPostrmScript != postrmScript) {
			NotificationChain msgs = null;
			if (postrmScript != null)
				msgs = ((InternalEObject)postrmScript).eInverseRemove(this, PackagemmPackage.POSTRM_SCRIPT__PKG, PostrmScript.class, msgs);
			if (newPostrmScript != null)
				msgs = ((InternalEObject)newPostrmScript).eInverseAdd(this, PackagemmPackage.POSTRM_SCRIPT__PKG, PostrmScript.class, msgs);
			msgs = basicSetPostrmScript(newPostrmScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__POSTRM_SCRIPT, newPostrmScript, newPostrmScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigScript getConfigScript() {
		return configScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigScript(ConfigScript newConfigScript, NotificationChain msgs) {
		ConfigScript oldConfigScript = configScript;
		configScript = newConfigScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__CONFIG_SCRIPT, oldConfigScript, newConfigScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigScript(ConfigScript newConfigScript) {
		if (newConfigScript != configScript) {
			NotificationChain msgs = null;
			if (configScript != null)
				msgs = ((InternalEObject)configScript).eInverseRemove(this, PackagemmPackage.CONFIG_SCRIPT__PKG, ConfigScript.class, msgs);
			if (newConfigScript != null)
				msgs = ((InternalEObject)newConfigScript).eInverseAdd(this, PackagemmPackage.CONFIG_SCRIPT__PKG, ConfigScript.class, msgs);
			msgs = basicSetConfigScript(newConfigScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__CONFIG_SCRIPT, newConfigScript, newConfigScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conflict getConflict() {
		return conflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConflict(Conflict newConflict, NotificationChain msgs) {
		Conflict oldConflict = conflict;
		conflict = newConflict;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__CONFLICT, oldConflict, newConflict);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConflict(Conflict newConflict) {
		if (newConflict != conflict) {
			NotificationChain msgs = null;
			if (conflict != null)
				msgs = ((InternalEObject)conflict).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PACKAGE__CONFLICT, null, msgs);
			if (newConflict != null)
				msgs = ((InternalEObject)newConflict).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PACKAGE__CONFLICT, null, msgs);
			msgs = basicSetConflict(newConflict, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__CONFLICT, newConflict, newConflict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependence getDepends() {
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepends(Dependence newDepends, NotificationChain msgs) {
		Dependence oldDepends = depends;
		depends = newDepends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__DEPENDS, oldDepends, newDepends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepends(Dependence newDepends) {
		if (newDepends != depends) {
			NotificationChain msgs = null;
			if (depends != null)
				msgs = ((InternalEObject)depends).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PACKAGE__DEPENDS, null, msgs);
			if (newDepends != null)
				msgs = ((InternalEObject)newDepends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PACKAGE__DEPENDS, null, msgs);
			msgs = basicSetDepends(newDepends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE__DEPENDS, newDepends, newDepends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getConffiles() {
		if (conffiles == null) {
			conffiles = new EObjectContainmentEList<File>(File.class, this, PackagemmPackage.PACKAGE__CONFFILES);
		}
		return conffiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.PACKAGE__DOCUMENTATION_FILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentationFiles()).basicAdd(otherEnd, msgs);
			case PackagemmPackage.PACKAGE__PREINST_SCRIPT:
				if (preinstScript != null)
					msgs = ((InternalEObject)preinstScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PACKAGE__PREINST_SCRIPT, null, msgs);
				return basicSetPreinstScript((PreinstScript)otherEnd, msgs);
			case PackagemmPackage.PACKAGE__POSTINST_SCRIPT:
				if (postinstScript != null)
					msgs = ((InternalEObject)postinstScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PACKAGE__POSTINST_SCRIPT, null, msgs);
				return basicSetPostinstScript((PostinstScript)otherEnd, msgs);
			case PackagemmPackage.PACKAGE__PRERM_SCRIPT:
				if (prermScript != null)
					msgs = ((InternalEObject)prermScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PACKAGE__PRERM_SCRIPT, null, msgs);
				return basicSetPrermScript((PrermScript)otherEnd, msgs);
			case PackagemmPackage.PACKAGE__POSTRM_SCRIPT:
				if (postrmScript != null)
					msgs = ((InternalEObject)postrmScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PACKAGE__POSTRM_SCRIPT, null, msgs);
				return basicSetPostrmScript((PostrmScript)otherEnd, msgs);
			case PackagemmPackage.PACKAGE__CONFIG_SCRIPT:
				if (configScript != null)
					msgs = ((InternalEObject)configScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PACKAGE__CONFIG_SCRIPT, null, msgs);
				return basicSetConfigScript((ConfigScript)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.PACKAGE__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case PackagemmPackage.PACKAGE__DOCUMENTATION_FILES:
				return ((InternalEList<?>)getDocumentationFiles()).basicRemove(otherEnd, msgs);
			case PackagemmPackage.PACKAGE__PREINST_SCRIPT:
				return basicSetPreinstScript(null, msgs);
			case PackagemmPackage.PACKAGE__POSTINST_SCRIPT:
				return basicSetPostinstScript(null, msgs);
			case PackagemmPackage.PACKAGE__PRERM_SCRIPT:
				return basicSetPrermScript(null, msgs);
			case PackagemmPackage.PACKAGE__POSTRM_SCRIPT:
				return basicSetPostrmScript(null, msgs);
			case PackagemmPackage.PACKAGE__CONFIG_SCRIPT:
				return basicSetConfigScript(null, msgs);
			case PackagemmPackage.PACKAGE__CONFLICT:
				return basicSetConflict(null, msgs);
			case PackagemmPackage.PACKAGE__DEPENDS:
				return basicSetDepends(null, msgs);
			case PackagemmPackage.PACKAGE__CONFFILES:
				return ((InternalEList<?>)getConffiles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagemmPackage.PACKAGE__VERSION:
				return getVersion();
			case PackagemmPackage.PACKAGE__INSTALLED_SIZE:
				return getInstalledSize();
			case PackagemmPackage.PACKAGE__MAINTAINER:
				return getMaintainer();
			case PackagemmPackage.PACKAGE__ARCHITECTURE:
				return getArchitecture();
			case PackagemmPackage.PACKAGE__FILE_SIZE:
				return getFileSize();
			case PackagemmPackage.PACKAGE__CHECK_SUM:
				return getCheckSum();
			case PackagemmPackage.PACKAGE__DESCRIPTION:
				return getDescription();
			case PackagemmPackage.PACKAGE__SECTION:
				return getSection();
			case PackagemmPackage.PACKAGE__TAG:
				return getTag();
			case PackagemmPackage.PACKAGE__PRIORITY:
				return getPriority();
			case PackagemmPackage.PACKAGE__STATUS:
				return getStatus();
			case PackagemmPackage.PACKAGE__UPLOADERS:
				return getUploaders();
			case PackagemmPackage.PACKAGE__RECOMMENDS:
				return getRecommends();
			case PackagemmPackage.PACKAGE__SUGGESTS:
				return getSuggests();
			case PackagemmPackage.PACKAGE__ENHANCES:
				return getEnhances();
			case PackagemmPackage.PACKAGE__PREDEPENDS:
				return getPredepends();
			case PackagemmPackage.PACKAGE__REPLACES:
				return getReplaces();
			case PackagemmPackage.PACKAGE__FILES:
				return getFiles();
			case PackagemmPackage.PACKAGE__DOCUMENTATION_FILES:
				return getDocumentationFiles();
			case PackagemmPackage.PACKAGE__PREINST_SCRIPT:
				return getPreinstScript();
			case PackagemmPackage.PACKAGE__POSTINST_SCRIPT:
				return getPostinstScript();
			case PackagemmPackage.PACKAGE__PRERM_SCRIPT:
				return getPrermScript();
			case PackagemmPackage.PACKAGE__POSTRM_SCRIPT:
				return getPostrmScript();
			case PackagemmPackage.PACKAGE__CONFIG_SCRIPT:
				return getConfigScript();
			case PackagemmPackage.PACKAGE__CONFLICT:
				return getConflict();
			case PackagemmPackage.PACKAGE__DEPENDS:
				return getDepends();
			case PackagemmPackage.PACKAGE__CONFFILES:
				return getConffiles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PackagemmPackage.PACKAGE__VERSION:
				setVersion((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__INSTALLED_SIZE:
				setInstalledSize((Integer)newValue);
				return;
			case PackagemmPackage.PACKAGE__MAINTAINER:
				setMaintainer((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__ARCHITECTURE:
				setArchitecture((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__FILE_SIZE:
				setFileSize((Integer)newValue);
				return;
			case PackagemmPackage.PACKAGE__CHECK_SUM:
				setCheckSum((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__SECTION:
				setSection((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__TAG:
				setTag((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__PRIORITY:
				setPriority((PriorityType)newValue);
				return;
			case PackagemmPackage.PACKAGE__STATUS:
				setStatus((StatusType)newValue);
				return;
			case PackagemmPackage.PACKAGE__UPLOADERS:
				setUploaders((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__RECOMMENDS:
				setRecommends((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__SUGGESTS:
				setSuggests((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__ENHANCES:
				setEnhances((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__PREDEPENDS:
				setPredepends((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__REPLACES:
				setReplaces((String)newValue);
				return;
			case PackagemmPackage.PACKAGE__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case PackagemmPackage.PACKAGE__DOCUMENTATION_FILES:
				getDocumentationFiles().clear();
				getDocumentationFiles().addAll((Collection<? extends DocumentationFile>)newValue);
				return;
			case PackagemmPackage.PACKAGE__PREINST_SCRIPT:
				setPreinstScript((PreinstScript)newValue);
				return;
			case PackagemmPackage.PACKAGE__POSTINST_SCRIPT:
				setPostinstScript((PostinstScript)newValue);
				return;
			case PackagemmPackage.PACKAGE__PRERM_SCRIPT:
				setPrermScript((PrermScript)newValue);
				return;
			case PackagemmPackage.PACKAGE__POSTRM_SCRIPT:
				setPostrmScript((PostrmScript)newValue);
				return;
			case PackagemmPackage.PACKAGE__CONFIG_SCRIPT:
				setConfigScript((ConfigScript)newValue);
				return;
			case PackagemmPackage.PACKAGE__CONFLICT:
				setConflict((Conflict)newValue);
				return;
			case PackagemmPackage.PACKAGE__DEPENDS:
				setDepends((Dependence)newValue);
				return;
			case PackagemmPackage.PACKAGE__CONFFILES:
				getConffiles().clear();
				getConffiles().addAll((Collection<? extends File>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PackagemmPackage.PACKAGE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__INSTALLED_SIZE:
				setInstalledSize(INSTALLED_SIZE_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__MAINTAINER:
				setMaintainer(MAINTAINER_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__FILE_SIZE:
				setFileSize(FILE_SIZE_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__CHECK_SUM:
				setCheckSum(CHECK_SUM_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__SECTION:
				setSection(SECTION_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__UPLOADERS:
				setUploaders(UPLOADERS_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__RECOMMENDS:
				setRecommends(RECOMMENDS_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__SUGGESTS:
				setSuggests(SUGGESTS_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__ENHANCES:
				setEnhances(ENHANCES_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__PREDEPENDS:
				setPredepends(PREDEPENDS_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__REPLACES:
				setReplaces(REPLACES_EDEFAULT);
				return;
			case PackagemmPackage.PACKAGE__FILES:
				getFiles().clear();
				return;
			case PackagemmPackage.PACKAGE__DOCUMENTATION_FILES:
				getDocumentationFiles().clear();
				return;
			case PackagemmPackage.PACKAGE__PREINST_SCRIPT:
				setPreinstScript((PreinstScript)null);
				return;
			case PackagemmPackage.PACKAGE__POSTINST_SCRIPT:
				setPostinstScript((PostinstScript)null);
				return;
			case PackagemmPackage.PACKAGE__PRERM_SCRIPT:
				setPrermScript((PrermScript)null);
				return;
			case PackagemmPackage.PACKAGE__POSTRM_SCRIPT:
				setPostrmScript((PostrmScript)null);
				return;
			case PackagemmPackage.PACKAGE__CONFIG_SCRIPT:
				setConfigScript((ConfigScript)null);
				return;
			case PackagemmPackage.PACKAGE__CONFLICT:
				setConflict((Conflict)null);
				return;
			case PackagemmPackage.PACKAGE__DEPENDS:
				setDepends((Dependence)null);
				return;
			case PackagemmPackage.PACKAGE__CONFFILES:
				getConffiles().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PackagemmPackage.PACKAGE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case PackagemmPackage.PACKAGE__INSTALLED_SIZE:
				return installedSize != INSTALLED_SIZE_EDEFAULT;
			case PackagemmPackage.PACKAGE__MAINTAINER:
				return MAINTAINER_EDEFAULT == null ? maintainer != null : !MAINTAINER_EDEFAULT.equals(maintainer);
			case PackagemmPackage.PACKAGE__ARCHITECTURE:
				return ARCHITECTURE_EDEFAULT == null ? architecture != null : !ARCHITECTURE_EDEFAULT.equals(architecture);
			case PackagemmPackage.PACKAGE__FILE_SIZE:
				return fileSize != FILE_SIZE_EDEFAULT;
			case PackagemmPackage.PACKAGE__CHECK_SUM:
				return CHECK_SUM_EDEFAULT == null ? checkSum != null : !CHECK_SUM_EDEFAULT.equals(checkSum);
			case PackagemmPackage.PACKAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PackagemmPackage.PACKAGE__SECTION:
				return SECTION_EDEFAULT == null ? section != null : !SECTION_EDEFAULT.equals(section);
			case PackagemmPackage.PACKAGE__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case PackagemmPackage.PACKAGE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case PackagemmPackage.PACKAGE__STATUS:
				return status != STATUS_EDEFAULT;
			case PackagemmPackage.PACKAGE__UPLOADERS:
				return UPLOADERS_EDEFAULT == null ? uploaders != null : !UPLOADERS_EDEFAULT.equals(uploaders);
			case PackagemmPackage.PACKAGE__RECOMMENDS:
				return RECOMMENDS_EDEFAULT == null ? recommends != null : !RECOMMENDS_EDEFAULT.equals(recommends);
			case PackagemmPackage.PACKAGE__SUGGESTS:
				return SUGGESTS_EDEFAULT == null ? suggests != null : !SUGGESTS_EDEFAULT.equals(suggests);
			case PackagemmPackage.PACKAGE__ENHANCES:
				return ENHANCES_EDEFAULT == null ? enhances != null : !ENHANCES_EDEFAULT.equals(enhances);
			case PackagemmPackage.PACKAGE__PREDEPENDS:
				return PREDEPENDS_EDEFAULT == null ? predepends != null : !PREDEPENDS_EDEFAULT.equals(predepends);
			case PackagemmPackage.PACKAGE__REPLACES:
				return REPLACES_EDEFAULT == null ? replaces != null : !REPLACES_EDEFAULT.equals(replaces);
			case PackagemmPackage.PACKAGE__FILES:
				return files != null && !files.isEmpty();
			case PackagemmPackage.PACKAGE__DOCUMENTATION_FILES:
				return documentationFiles != null && !documentationFiles.isEmpty();
			case PackagemmPackage.PACKAGE__PREINST_SCRIPT:
				return preinstScript != null;
			case PackagemmPackage.PACKAGE__POSTINST_SCRIPT:
				return postinstScript != null;
			case PackagemmPackage.PACKAGE__PRERM_SCRIPT:
				return prermScript != null;
			case PackagemmPackage.PACKAGE__POSTRM_SCRIPT:
				return postrmScript != null;
			case PackagemmPackage.PACKAGE__CONFIG_SCRIPT:
				return configScript != null;
			case PackagemmPackage.PACKAGE__CONFLICT:
				return conflict != null;
			case PackagemmPackage.PACKAGE__DEPENDS:
				return depends != null;
			case PackagemmPackage.PACKAGE__CONFFILES:
				return conffiles != null && !conffiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(", installedSize: ");
		result.append(installedSize);
		result.append(", maintainer: ");
		result.append(maintainer);
		result.append(", architecture: ");
		result.append(architecture);
		result.append(", fileSize: ");
		result.append(fileSize);
		result.append(", checkSum: ");
		result.append(checkSum);
		result.append(", description: ");
		result.append(description);
		result.append(", section: ");
		result.append(section);
		result.append(", tag: ");
		result.append(tag);
		result.append(", priority: ");
		result.append(priority);
		result.append(", status: ");
		result.append(status);
		result.append(", uploaders: ");
		result.append(uploaders);
		result.append(", recommends: ");
		result.append(recommends);
		result.append(", suggests: ");
		result.append(suggests);
		result.append(", enhances: ");
		result.append(enhances);
		result.append(", predepends: ");
		result.append(predepends);
		result.append(", replaces: ");
		result.append(replaces);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
