/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mancoosi.MancoosiFactory
 * @model kind="package"
 * @generated
 */
public interface MancoosiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mancoosi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mancoosi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mancoosi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MancoosiPackage eINSTANCE = mancoosi.impl.MancoosiPackageImpl.init();

	/**
	 * The meta object id for the '{@link mancoosi.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.NamedElementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ConfigurationImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Installed Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INSTALLED_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__FILE_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENVIRONMENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not Installed Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NOT_INSTALLED_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CREATION_TIME = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>System Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__SYSTEM_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PackageImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 155;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONFIGURATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_SETTINGS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.InstalledPackageImpl <em>Installed Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.InstalledPackageImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getInstalledPackage()
	 * @generated
	 */
	int INSTALLED_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__VERSION = PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__CONFIGURATION = PACKAGE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Package Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__PACKAGE_SETTINGS = PACKAGE__PACKAGE_SETTINGS;

	/**
	 * The feature id for the '<em><b>Installed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__INSTALLED_SIZE = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__MAINTAINER = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__ARCHITECTURE = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__FILE_SIZE = PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__CHECK_SUM = PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__DESCRIPTION = PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__SECTION = PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__TAG = PACKAGE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__PRIORITY = PACKAGE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__STATUS = PACKAGE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__UPLOADERS = PACKAGE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Source Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__SOURCE_PACKAGE = PACKAGE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__DEPENDS = PACKAGE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Recommends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__RECOMMENDS = PACKAGE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Suggests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__SUGGESTS = PACKAGE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Enhances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__ENHANCES = PACKAGE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Predepends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__PREDEPENDS = PACKAGE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__PROVIDES = PACKAGE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Replaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__REPLACES = PACKAGE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__FILES = PACKAGE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Documentation Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__DOCUMENTATION_FILES = PACKAGE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Preinst Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__PREINST_SCRIPT = PACKAGE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Postinst Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__POSTINST_SCRIPT = PACKAGE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Prerm Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__PRERM_SCRIPT = PACKAGE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Postrm Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__POSTRM_SCRIPT = PACKAGE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Config Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__CONFIG_SCRIPT = PACKAGE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__CONFLICT = PACKAGE_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Installed Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 27;

	/**
	 * The meta object id for the '{@link mancoosi.impl.NotInstalledPackageImpl <em>Not Installed Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.NotInstalledPackageImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getNotInstalledPackage()
	 * @generated
	 */
	int NOT_INSTALLED_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INSTALLED_PACKAGE__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INSTALLED_PACKAGE__VERSION = PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INSTALLED_PACKAGE__CONFIGURATION = PACKAGE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Package Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INSTALLED_PACKAGE__PACKAGE_SETTINGS = PACKAGE__PACKAGE_SETTINGS;

	/**
	 * The number of structural features of the '<em>Not Installed Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INSTALLED_PACKAGE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.SrcPackageImpl <em>Src Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.SrcPackageImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getSrcPackage()
	 * @generated
	 */
	int SRC_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__NAME = INSTALLED_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__VERSION = INSTALLED_PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__CONFIGURATION = INSTALLED_PACKAGE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Package Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__PACKAGE_SETTINGS = INSTALLED_PACKAGE__PACKAGE_SETTINGS;

	/**
	 * The feature id for the '<em><b>Installed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__INSTALLED_SIZE = INSTALLED_PACKAGE__INSTALLED_SIZE;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__MAINTAINER = INSTALLED_PACKAGE__MAINTAINER;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__ARCHITECTURE = INSTALLED_PACKAGE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__FILE_SIZE = INSTALLED_PACKAGE__FILE_SIZE;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__CHECK_SUM = INSTALLED_PACKAGE__CHECK_SUM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__DESCRIPTION = INSTALLED_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__SECTION = INSTALLED_PACKAGE__SECTION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__TAG = INSTALLED_PACKAGE__TAG;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__PRIORITY = INSTALLED_PACKAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__STATUS = INSTALLED_PACKAGE__STATUS;

	/**
	 * The feature id for the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__UPLOADERS = INSTALLED_PACKAGE__UPLOADERS;

	/**
	 * The feature id for the '<em><b>Source Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__SOURCE_PACKAGE = INSTALLED_PACKAGE__SOURCE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__DEPENDS = INSTALLED_PACKAGE__DEPENDS;

	/**
	 * The feature id for the '<em><b>Recommends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__RECOMMENDS = INSTALLED_PACKAGE__RECOMMENDS;

	/**
	 * The feature id for the '<em><b>Suggests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__SUGGESTS = INSTALLED_PACKAGE__SUGGESTS;

	/**
	 * The feature id for the '<em><b>Enhances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__ENHANCES = INSTALLED_PACKAGE__ENHANCES;

	/**
	 * The feature id for the '<em><b>Predepends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__PREDEPENDS = INSTALLED_PACKAGE__PREDEPENDS;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__PROVIDES = INSTALLED_PACKAGE__PROVIDES;

	/**
	 * The feature id for the '<em><b>Replaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__REPLACES = INSTALLED_PACKAGE__REPLACES;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__FILES = INSTALLED_PACKAGE__FILES;

	/**
	 * The feature id for the '<em><b>Documentation Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__DOCUMENTATION_FILES = INSTALLED_PACKAGE__DOCUMENTATION_FILES;

	/**
	 * The feature id for the '<em><b>Preinst Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__PREINST_SCRIPT = INSTALLED_PACKAGE__PREINST_SCRIPT;

	/**
	 * The feature id for the '<em><b>Postinst Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__POSTINST_SCRIPT = INSTALLED_PACKAGE__POSTINST_SCRIPT;

	/**
	 * The feature id for the '<em><b>Prerm Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__PRERM_SCRIPT = INSTALLED_PACKAGE__PRERM_SCRIPT;

	/**
	 * The feature id for the '<em><b>Postrm Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__POSTRM_SCRIPT = INSTALLED_PACKAGE__POSTRM_SCRIPT;

	/**
	 * The feature id for the '<em><b>Config Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__CONFIG_SCRIPT = INSTALLED_PACKAGE__CONFIG_SCRIPT;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__CONFLICT = INSTALLED_PACKAGE__CONFLICT;

	/**
	 * The feature id for the '<em><b>Build Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__BUILD_DEPENDS = INSTALLED_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Build Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__BUILD_CONFLICTS = INSTALLED_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE_FEATURE_COUNT = INSTALLED_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.BinPackageImpl <em>Bin Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.BinPackageImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getBinPackage()
	 * @generated
	 */
	int BIN_PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__NAME = INSTALLED_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__VERSION = INSTALLED_PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__CONFIGURATION = INSTALLED_PACKAGE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Package Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__PACKAGE_SETTINGS = INSTALLED_PACKAGE__PACKAGE_SETTINGS;

	/**
	 * The feature id for the '<em><b>Installed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__INSTALLED_SIZE = INSTALLED_PACKAGE__INSTALLED_SIZE;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__MAINTAINER = INSTALLED_PACKAGE__MAINTAINER;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__ARCHITECTURE = INSTALLED_PACKAGE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__FILE_SIZE = INSTALLED_PACKAGE__FILE_SIZE;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__CHECK_SUM = INSTALLED_PACKAGE__CHECK_SUM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__DESCRIPTION = INSTALLED_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__SECTION = INSTALLED_PACKAGE__SECTION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__TAG = INSTALLED_PACKAGE__TAG;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__PRIORITY = INSTALLED_PACKAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__STATUS = INSTALLED_PACKAGE__STATUS;

	/**
	 * The feature id for the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__UPLOADERS = INSTALLED_PACKAGE__UPLOADERS;

	/**
	 * The feature id for the '<em><b>Source Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__SOURCE_PACKAGE = INSTALLED_PACKAGE__SOURCE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__DEPENDS = INSTALLED_PACKAGE__DEPENDS;

	/**
	 * The feature id for the '<em><b>Recommends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__RECOMMENDS = INSTALLED_PACKAGE__RECOMMENDS;

	/**
	 * The feature id for the '<em><b>Suggests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__SUGGESTS = INSTALLED_PACKAGE__SUGGESTS;

	/**
	 * The feature id for the '<em><b>Enhances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__ENHANCES = INSTALLED_PACKAGE__ENHANCES;

	/**
	 * The feature id for the '<em><b>Predepends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__PREDEPENDS = INSTALLED_PACKAGE__PREDEPENDS;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__PROVIDES = INSTALLED_PACKAGE__PROVIDES;

	/**
	 * The feature id for the '<em><b>Replaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__REPLACES = INSTALLED_PACKAGE__REPLACES;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__FILES = INSTALLED_PACKAGE__FILES;

	/**
	 * The feature id for the '<em><b>Documentation Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__DOCUMENTATION_FILES = INSTALLED_PACKAGE__DOCUMENTATION_FILES;

	/**
	 * The feature id for the '<em><b>Preinst Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__PREINST_SCRIPT = INSTALLED_PACKAGE__PREINST_SCRIPT;

	/**
	 * The feature id for the '<em><b>Postinst Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__POSTINST_SCRIPT = INSTALLED_PACKAGE__POSTINST_SCRIPT;

	/**
	 * The feature id for the '<em><b>Prerm Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__PRERM_SCRIPT = INSTALLED_PACKAGE__PRERM_SCRIPT;

	/**
	 * The feature id for the '<em><b>Postrm Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__POSTRM_SCRIPT = INSTALLED_PACKAGE__POSTRM_SCRIPT;

	/**
	 * The feature id for the '<em><b>Config Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__CONFIG_SCRIPT = INSTALLED_PACKAGE__CONFIG_SCRIPT;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__CONFLICT = INSTALLED_PACKAGE__CONFLICT;

	/**
	 * The feature id for the '<em><b>Src Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__SRC_REF = INSTALLED_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bin Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE_FEATURE_COUNT = INSTALLED_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.VirtualPackageImpl <em>Virtual Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.VirtualPackageImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getVirtualPackage()
	 * @generated
	 */
	int VIRTUAL_PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__NAME = INSTALLED_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__VERSION = INSTALLED_PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__CONFIGURATION = INSTALLED_PACKAGE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Package Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__PACKAGE_SETTINGS = INSTALLED_PACKAGE__PACKAGE_SETTINGS;

	/**
	 * The feature id for the '<em><b>Installed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__INSTALLED_SIZE = INSTALLED_PACKAGE__INSTALLED_SIZE;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__MAINTAINER = INSTALLED_PACKAGE__MAINTAINER;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__ARCHITECTURE = INSTALLED_PACKAGE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__FILE_SIZE = INSTALLED_PACKAGE__FILE_SIZE;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__CHECK_SUM = INSTALLED_PACKAGE__CHECK_SUM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__DESCRIPTION = INSTALLED_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__SECTION = INSTALLED_PACKAGE__SECTION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__TAG = INSTALLED_PACKAGE__TAG;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__PRIORITY = INSTALLED_PACKAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__STATUS = INSTALLED_PACKAGE__STATUS;

	/**
	 * The feature id for the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__UPLOADERS = INSTALLED_PACKAGE__UPLOADERS;

	/**
	 * The feature id for the '<em><b>Source Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__SOURCE_PACKAGE = INSTALLED_PACKAGE__SOURCE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__DEPENDS = INSTALLED_PACKAGE__DEPENDS;

	/**
	 * The feature id for the '<em><b>Recommends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__RECOMMENDS = INSTALLED_PACKAGE__RECOMMENDS;

	/**
	 * The feature id for the '<em><b>Suggests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__SUGGESTS = INSTALLED_PACKAGE__SUGGESTS;

	/**
	 * The feature id for the '<em><b>Enhances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__ENHANCES = INSTALLED_PACKAGE__ENHANCES;

	/**
	 * The feature id for the '<em><b>Predepends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__PREDEPENDS = INSTALLED_PACKAGE__PREDEPENDS;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__PROVIDES = INSTALLED_PACKAGE__PROVIDES;

	/**
	 * The feature id for the '<em><b>Replaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__REPLACES = INSTALLED_PACKAGE__REPLACES;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__FILES = INSTALLED_PACKAGE__FILES;

	/**
	 * The feature id for the '<em><b>Documentation Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__DOCUMENTATION_FILES = INSTALLED_PACKAGE__DOCUMENTATION_FILES;

	/**
	 * The feature id for the '<em><b>Preinst Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__PREINST_SCRIPT = INSTALLED_PACKAGE__PREINST_SCRIPT;

	/**
	 * The feature id for the '<em><b>Postinst Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__POSTINST_SCRIPT = INSTALLED_PACKAGE__POSTINST_SCRIPT;

	/**
	 * The feature id for the '<em><b>Prerm Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__PRERM_SCRIPT = INSTALLED_PACKAGE__PRERM_SCRIPT;

	/**
	 * The feature id for the '<em><b>Postrm Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__POSTRM_SCRIPT = INSTALLED_PACKAGE__POSTRM_SCRIPT;

	/**
	 * The feature id for the '<em><b>Config Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__CONFIG_SCRIPT = INSTALLED_PACKAGE__CONFIG_SCRIPT;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__CONFLICT = INSTALLED_PACKAGE__CONFLICT;

	/**
	 * The feature id for the '<em><b>Imp Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__IMP_PACKAGE = INSTALLED_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE_FEATURE_COUNT = INSTALLED_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.DependenceImpl <em>Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.DependenceImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getDependence()
	 * @generated
	 */
	int DEPENDENCE = 7;

	/**
	 * The feature id for the '<em><b>And Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__AND_DEP = 0;

	/**
	 * The feature id for the '<em><b>Or Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__OR_DEP = 1;

	/**
	 * The feature id for the '<em><b>Single Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__SINGLE_DEP = 2;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__PKG = 3;

	/**
	 * The number of structural features of the '<em>Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mancoosi.impl.AndDepImpl <em>And Dep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.AndDepImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getAndDep()
	 * @generated
	 */
	int AND_DEP = 8;

	/**
	 * The feature id for the '<em><b>And Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__AND_DEP = DEPENDENCE__AND_DEP;

	/**
	 * The feature id for the '<em><b>Or Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__OR_DEP = DEPENDENCE__OR_DEP;

	/**
	 * The feature id for the '<em><b>Single Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__SINGLE_DEP = DEPENDENCE__SINGLE_DEP;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__PKG = DEPENDENCE__PKG;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__OPS = DEPENDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependence</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__DEPENDENCE = DEPENDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Dep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP_FEATURE_COUNT = DEPENDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.OrDepImpl <em>Or Dep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.OrDepImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getOrDep()
	 * @generated
	 */
	int OR_DEP = 9;

	/**
	 * The feature id for the '<em><b>And Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__AND_DEP = DEPENDENCE__AND_DEP;

	/**
	 * The feature id for the '<em><b>Or Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__OR_DEP = DEPENDENCE__OR_DEP;

	/**
	 * The feature id for the '<em><b>Single Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__SINGLE_DEP = DEPENDENCE__SINGLE_DEP;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__PKG = DEPENDENCE__PKG;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__OPS = DEPENDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependence</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__DEPENDENCE = DEPENDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or Dep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP_FEATURE_COUNT = DEPENDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.SingleDepImpl <em>Single Dep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.SingleDepImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getSingleDep()
	 * @generated
	 */
	int SINGLE_DEP = 10;

	/**
	 * The feature id for the '<em><b>And Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__AND_DEP = DEPENDENCE__AND_DEP;

	/**
	 * The feature id for the '<em><b>Or Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__OR_DEP = DEPENDENCE__OR_DEP;

	/**
	 * The feature id for the '<em><b>Single Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__SINGLE_DEP = DEPENDENCE__SINGLE_DEP;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__PKG = DEPENDENCE__PKG;

	/**
	 * The feature id for the '<em><b>Dependence</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__DEPENDENCE = DEPENDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__VERSION = DEPENDENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__VALUE = DEPENDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Single Dep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP_FEATURE_COUNT = DEPENDENCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ScriptImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__PRE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__POST = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__STATEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__INPUT_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mancoosi.impl.InputParameterImpl <em>Input Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.InputParameterImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getInputParameter()
	 * @generated
	 */
	int INPUT_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__SCRIPT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PreinstScriptImpl <em>Preinst Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PreinstScriptImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPreinstScript()
	 * @generated
	 */
	int PREINST_SCRIPT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT__NAME = SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT__PRE = SCRIPT__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT__POST = SCRIPT__POST;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT__STATEMENTS = SCRIPT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT__INPUT_PARAMETERS = SCRIPT__INPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT__PKG = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Preinst Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstScriptImpl <em>Postinst Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstScriptImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstScript()
	 * @generated
	 */
	int POSTINST_SCRIPT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT__NAME = SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT__PRE = SCRIPT__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT__POST = SCRIPT__POST;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT__STATEMENTS = SCRIPT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT__INPUT_PARAMETERS = SCRIPT__INPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT__PKG = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PrermScriptImpl <em>Prerm Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PrermScriptImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPrermScript()
	 * @generated
	 */
	int PRERM_SCRIPT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT__NAME = SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT__PRE = SCRIPT__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT__POST = SCRIPT__POST;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT__STATEMENTS = SCRIPT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT__INPUT_PARAMETERS = SCRIPT__INPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT__PKG = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmScriptImpl <em>Postrm Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmScriptImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmScript()
	 * @generated
	 */
	int POSTRM_SCRIPT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT__NAME = SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT__PRE = SCRIPT__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT__POST = SCRIPT__POST;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT__STATEMENTS = SCRIPT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT__INPUT_PARAMETERS = SCRIPT__INPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT__PKG = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ConfigScriptImpl <em>Config Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ConfigScriptImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getConfigScript()
	 * @generated
	 */
	int CONFIG_SCRIPT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT__NAME = SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT__PRE = SCRIPT__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT__POST = SCRIPT__POST;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT__STATEMENTS = SCRIPT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT__INPUT_PARAMETERS = SCRIPT__INPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT__PKG = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Config Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.InvariantImpl <em>Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.InvariantImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getInvariant()
	 * @generated
	 */
	int INVARIANT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Atom El</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__ATOM_EL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>And</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__AND = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Or</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__OR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__NOT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mancoosi.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.AtomImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.AndInvImpl <em>And Inv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.AndInvImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getAndInv()
	 * @generated
	 */
	int AND_INV = 20;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_INV__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_INV__RIGHT = 1;

	/**
	 * The number of structural features of the '<em>And Inv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_INV_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.OrInvImpl <em>Or Inv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.OrInvImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getOrInv()
	 * @generated
	 */
	int OR_INV = 21;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_INV__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_INV__RIGHT = 1;

	/**
	 * The number of structural features of the '<em>Or Inv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_INV_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.NotInvImpl <em>Not Inv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.NotInvImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getNotInv()
	 * @generated
	 */
	int NOT_INV = 22;

	/**
	 * The feature id for the '<em><b>Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INV__ELEM = 0;

	/**
	 * The number of structural features of the '<em>Not Inv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INV_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.StatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__SCRIPT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__IS_START = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PREVIOUS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NEXT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ControlStatementImpl <em>Control Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ControlStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getControlStatement()
	 * @generated
	 */
	int CONTROL_STATEMENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__SCRIPT = STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__IS_START = STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Control Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.CaseImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__NAME = CONTROL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__SCRIPT = CONTROL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__IS_START = CONTROL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__PREVIOUS = CONTROL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__NEXT = CONTROL_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__SELECTOR = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__DEFAULT = CONTROL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ConditionImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 26;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.DefaultCaseConditionImpl <em>Default Case Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.DefaultCaseConditionImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getDefaultCaseCondition()
	 * @generated
	 */
	int DEFAULT_CASE_CONDITION = 27;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CASE_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The number of structural features of the '<em>Default Case Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CASE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.CasePrermImpl <em>Case Prerm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.CasePrermImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePrerm()
	 * @generated
	 */
	int CASE_PRERM = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__NAME = CASE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__SCRIPT = CASE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__IS_START = CASE__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__PREVIOUS = CASE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__NEXT = CASE__NEXT;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__SELECTOR = CASE__SELECTOR;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__DEFAULT = CASE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__CONDITIONS = CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Prerm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM_FEATURE_COUNT = CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.CasePrermConditionImpl <em>Case Prerm Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.CasePrermConditionImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePrermCondition()
	 * @generated
	 */
	int CASE_PRERM_CONDITION = 29;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Prerm Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.CasePostrmImpl <em>Case Postrm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.CasePostrmImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePostrm()
	 * @generated
	 */
	int CASE_POSTRM = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__NAME = CASE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__SCRIPT = CASE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__IS_START = CASE__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__PREVIOUS = CASE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__NEXT = CASE__NEXT;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__SELECTOR = CASE__SELECTOR;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__DEFAULT = CASE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__CONDITIONS = CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Postrm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM_FEATURE_COUNT = CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.CasePostrmConditionImpl <em>Case Postrm Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.CasePostrmConditionImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePostrmCondition()
	 * @generated
	 */
	int CASE_POSTRM_CONDITION = 31;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Postrm Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.CasePreinstImpl <em>Case Preinst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.CasePreinstImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePreinst()
	 * @generated
	 */
	int CASE_PREINST = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__NAME = CASE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__SCRIPT = CASE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__IS_START = CASE__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__PREVIOUS = CASE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__NEXT = CASE__NEXT;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__SELECTOR = CASE__SELECTOR;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__DEFAULT = CASE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__CONDITIONS = CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Preinst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST_FEATURE_COUNT = CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.CasePreinstConditionImpl <em>Case Preinst Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.CasePreinstConditionImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePreinstCondition()
	 * @generated
	 */
	int CASE_PREINST_CONDITION = 33;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Preinst Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.CasePostinstImpl <em>Case Postinst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.CasePostinstImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePostinst()
	 * @generated
	 */
	int CASE_POSTINST = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__NAME = CASE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__SCRIPT = CASE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__IS_START = CASE__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__PREVIOUS = CASE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__NEXT = CASE__NEXT;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__SELECTOR = CASE__SELECTOR;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__DEFAULT = CASE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__CONDITIONS = CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Postinst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST_FEATURE_COUNT = CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.CasePostinstConditionImpl <em>Case Postinst Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.CasePostinstConditionImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePostinstCondition()
	 * @generated
	 */
	int CASE_POSTINST_CONDITION = 35;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Postinst Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.BasicCaseImpl <em>Basic Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.BasicCaseImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getBasicCase()
	 * @generated
	 */
	int BASIC_CASE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__NAME = CONTROL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__SCRIPT = CONTROL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__IS_START = CONTROL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__PREVIOUS = CONTROL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__NEXT = CONTROL_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__CONDITIONS = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.BasicCaseConditionImpl <em>Basic Case Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.BasicCaseConditionImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getBasicCaseCondition()
	 * @generated
	 */
	int BASIC_CASE_CONDITION = 37;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Case Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.IfImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getIf()
	 * @generated
	 */
	int IF = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NAME = CONTROL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SCRIPT = CONTROL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IS_START = CONTROL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__PREVIOUS = CONTROL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NEXT = CONTROL_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = CONTROL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = CONTROL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.BooleanExpressionImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ReturnImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__NAME = CONTROL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__SCRIPT = CONTROL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__IS_START = CONTROL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__PREVIOUS = CONTROL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__NEXT = CONTROL_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__VALUE = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.IteratorImpl <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.IteratorImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getIterator()
	 * @generated
	 */
	int ITERATOR = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__NAME = CONTROL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__SCRIPT = CONTROL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__IS_START = CONTROL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__PREVIOUS = CONTROL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__NEXT = CONTROL_STATEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.DirectoryIteratorImpl <em>Directory Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.DirectoryIteratorImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getDirectoryIterator()
	 * @generated
	 */
	int DIRECTORY_ITERATOR = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__NAME = ITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__SCRIPT = ITERATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__IS_START = ITERATOR__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__PREVIOUS = ITERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__NEXT = ITERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__DIRECTORY = ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR_FEATURE_COUNT = ITERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.FileContentIteratorImpl <em>File Content Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.FileContentIteratorImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getFileContentIterator()
	 * @generated
	 */
	int FILE_CONTENT_ITERATOR = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__NAME = ITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__SCRIPT = ITERATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__IS_START = ITERATOR__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__PREVIOUS = ITERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__NEXT = ITERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__FILE = ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Content Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR_FEATURE_COUNT = ITERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.InputParameterIteratorImpl <em>Input Parameter Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.InputParameterIteratorImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getInputParameterIterator()
	 * @generated
	 */
	int INPUT_PARAMETER_ITERATOR = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__NAME = ITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__SCRIPT = ITERATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__IS_START = ITERATOR__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__PREVIOUS = ITERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__NEXT = ITERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__INPUT_PARAMETERS = ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Parameter Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR_FEATURE_COUNT = ITERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.EnumerationIteratorImpl <em>Enumeration Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.EnumerationIteratorImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getEnumerationIterator()
	 * @generated
	 */
	int ENUMERATION_ITERATOR = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__NAME = ITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__SCRIPT = ITERATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__IS_START = ITERATOR__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__PREVIOUS = ITERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__NEXT = ITERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__ENUMERATION = ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR_FEATURE_COUNT = ITERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.StringIteratorImpl <em>String Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.StringIteratorImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getStringIterator()
	 * @generated
	 */
	int STRING_ITERATOR = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR__NAME = ITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR__SCRIPT = ITERATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR__IS_START = ITERATOR__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR__PREVIOUS = ITERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR__NEXT = ITERATOR__NEXT;

	/**
	 * The number of structural features of the '<em>String Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR_FEATURE_COUNT = ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.EnumerationImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 47;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.EnumerationElementImpl <em>Enumeration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.EnumerationElementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getEnumerationElement()
	 * @generated
	 */
	int ENUMERATION_ELEMENT = 48;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enumeration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.FileSystemStatementImpl <em>File System Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.FileSystemStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getFileSystemStatement()
	 * @generated
	 */
	int FILE_SYSTEM_STATEMENT = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__SCRIPT = STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__IS_START = STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__FILES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File System Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.AdditionFileSytemStatementImpl <em>Addition File Sytem Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.AdditionFileSytemStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getAdditionFileSytemStatement()
	 * @generated
	 */
	int ADDITION_FILE_SYTEM_STATEMENT = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYTEM_STATEMENT__NAME = FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYTEM_STATEMENT__SCRIPT = FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYTEM_STATEMENT__IS_START = FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYTEM_STATEMENT__PREVIOUS = FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYTEM_STATEMENT__NEXT = FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYTEM_STATEMENT__FILES = FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The number of structural features of the '<em>Addition File Sytem Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYTEM_STATEMENT_FEATURE_COUNT = FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.DeletionFileSystemStatementImpl <em>Deletion File System Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.DeletionFileSystemStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getDeletionFileSystemStatement()
	 * @generated
	 */
	int DELETION_FILE_SYSTEM_STATEMENT = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__NAME = FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__SCRIPT = FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__IS_START = FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__PREVIOUS = FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__NEXT = FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__FILES = FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The number of structural features of the '<em>Deletion File System Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT = FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.UpdateFileSytemStatementImpl <em>Update File Sytem Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.UpdateFileSytemStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getUpdateFileSytemStatement()
	 * @generated
	 */
	int UPDATE_FILE_SYTEM_STATEMENT = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYTEM_STATEMENT__NAME = FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYTEM_STATEMENT__SCRIPT = FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYTEM_STATEMENT__IS_START = FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYTEM_STATEMENT__PREVIOUS = FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYTEM_STATEMENT__NEXT = FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYTEM_STATEMENT__FILES = FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The number of structural features of the '<em>Update File Sytem Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT = FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.EnvironmentStatementImpl <em>Environment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.EnvironmentStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getEnvironmentStatement()
	 * @generated
	 */
	int ENVIRONMENT_STATEMENT = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__SCRIPT = STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__IS_START = STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__ENVIRONMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Environment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.AdditionEnvironmentStatementImpl <em>Addition Environment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.AdditionEnvironmentStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getAdditionEnvironmentStatement()
	 * @generated
	 */
	int ADDITION_ENVIRONMENT_STATEMENT = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__NAME = ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__SCRIPT = ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__IS_START = ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__PREVIOUS = ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__NEXT = ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__ENVIRONMENT = ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Addition Environment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT_FEATURE_COUNT = ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.DeletionEnvironmentStatementImpl <em>Deletion Environment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.DeletionEnvironmentStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getDeletionEnvironmentStatement()
	 * @generated
	 */
	int DELETION_ENVIRONMENT_STATEMENT = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__NAME = ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__SCRIPT = ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__IS_START = ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__PREVIOUS = ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__NEXT = ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__ENVIRONMENT = ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Deletion Environment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT_FEATURE_COUNT = ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.UpdateEnvironmentStatementImpl <em>Update Environment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.UpdateEnvironmentStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getUpdateEnvironmentStatement()
	 * @generated
	 */
	int UPDATE_ENVIRONMENT_STATEMENT = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__NAME = ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__SCRIPT = ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__IS_START = ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS = ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__NEXT = ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT = ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Update Environment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT = ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PackageSettingStatementImpl <em>Package Setting Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PackageSettingStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPackageSettingStatement()
	 * @generated
	 */
	int PACKAGE_SETTING_STATEMENT = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__SCRIPT = STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__IS_START = STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__PKGSETTING = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Setting Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.AdditionPackageSettingStatementImpl <em>Addition Package Setting Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.AdditionPackageSettingStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getAdditionPackageSettingStatement()
	 * @generated
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__NAME = PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__SCRIPT = PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__IS_START = PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__PREVIOUS = PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__NEXT = PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__PKGSETTING = PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The number of structural features of the '<em>Addition Package Setting Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT = PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.DeletionPackageSettingStatementImpl <em>Deletion Package Setting Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.DeletionPackageSettingStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getDeletionPackageSettingStatement()
	 * @generated
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__NAME = PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__SCRIPT = PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__IS_START = PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__PREVIOUS = PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__NEXT = PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__PKGSETTING = PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The number of structural features of the '<em>Deletion Package Setting Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT = PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.UpdatePackageSettingStatementImpl <em>Update Package Setting Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.UpdatePackageSettingStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getUpdatePackageSettingStatement()
	 * @generated
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__NAME = PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__SCRIPT = PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__IS_START = PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__PREVIOUS = PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__NEXT = PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__PKGSETTING = PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The number of structural features of the '<em>Update Package Setting Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT = PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.NeutralStatementImpl <em>Neutral Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.NeutralStatementImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getNeutralStatement()
	 * @generated
	 */
	int NEUTRAL_STATEMENT = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT__SCRIPT = STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT__IS_START = STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Neutral Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.MessageImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = NEUTRAL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SCRIPT = NEUTRAL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__IS_START = NEUTRAL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PREVIOUS = NEUTRAL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NEXT = NEUTRAL_STATEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = NEUTRAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.CommentImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = NEUTRAL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SCRIPT = NEUTRAL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__IS_START = NEUTRAL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PREVIOUS = NEUTRAL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NEXT = NEUTRAL_STATEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = NEUTRAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.EnvironmentImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Running Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__RUNNING_SERVICES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ALTERNATIVES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__USERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Emacspkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__EMACSPKG = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Icon Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ICON_CACHE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Desktop Db</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__DESKTOP_DB = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mime Type Handler Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__MIME_TYPE_HANDLER_CACHE = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Library Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__LIBRARY_CACHE = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Skeeper Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__SKEEPER_CATALOG = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sgml Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__SGML_CATALOG = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__CONFIGURATION = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Module Cache</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__MODULE_CACHE = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Xfont Caches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__XFONT_CACHES = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Gconf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__GCONF = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__MENU = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link mancoosi.impl.FileSystemImpl <em>File System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.FileSystemImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getFileSystem()
	 * @generated
	 */
	int FILE_SYSTEM = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__ROOT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__CONFIGURATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__ALL_FILES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>File System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.GConfImpl <em>GConf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.GConfImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getGConf()
	 * @generated
	 */
	int GCONF = 66;

	/**
	 * The feature id for the '<em><b>Conf Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONF__CONF_FILES = 0;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONF__SCHEMAS = 1;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONF__ENV = 2;

	/**
	 * The number of structural features of the '<em>GConf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONF_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ApplicationMenuCatalogImpl <em>Application Menu Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ApplicationMenuCatalogImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getApplicationMenuCatalog()
	 * @generated
	 */
	int APPLICATION_MENU_CATALOG = 67;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MENU_CATALOG__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MENU_CATALOG__MENU = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Menu Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MENU_CATALOG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.MenuImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 68;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ENV = 2;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.MenuEntryImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getMenuEntry()
	 * @generated
	 */
	int MENU_ENTRY = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__MENU = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__EXECUTABLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.BootImpl <em>Boot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.BootImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getBoot()
	 * @generated
	 */
	int BOOT = 70;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT__SERVICES = 0;

	/**
	 * The number of structural features of the '<em>Boot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ServiceImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EXECUTABLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENV = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.FileImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXTENSION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SIZE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CHECK_SUM = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__IS_DIRECTORY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Suid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SUID = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__GUID = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PERMISSION = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fs</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CHILDS = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__GROUP = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__IS_MISSING = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pkg Settings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PKG_SETTINGS = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link mancoosi.impl.DocumentationFileImpl <em>Documentation File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.DocumentationFileImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getDocumentationFile()
	 * @generated
	 */
	int DOCUMENTATION_FILE = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__EXTENSION = FILE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__DESCRIPTION = FILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__SIZE = FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__CHECK_SUM = FILE__CHECK_SUM;

	/**
	 * The feature id for the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__IS_DIRECTORY = FILE__IS_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Suid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__SUID = FILE__SUID;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__GUID = FILE__GUID;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__PERMISSION = FILE__PERMISSION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__LOCATION = FILE__LOCATION;

	/**
	 * The feature id for the '<em><b>Fs</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__FS = FILE__FS;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__CHILDS = FILE__CHILDS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__PARENT = FILE__PARENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__OWNER = FILE__OWNER;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__GROUP = FILE__GROUP;

	/**
	 * The feature id for the '<em><b>Is Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__IS_MISSING = FILE__IS_MISSING;

	/**
	 * The feature id for the '<em><b>Pkg Settings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__PKG_SETTINGS = FILE__PKG_SETTINGS;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__PKG = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Documentation File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.InformationFileImpl <em>Information File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.InformationFileImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getInformationFile()
	 * @generated
	 */
	int INFORMATION_FILE = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__EXTENSION = FILE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__DESCRIPTION = FILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__SIZE = FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__CHECK_SUM = FILE__CHECK_SUM;

	/**
	 * The feature id for the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__IS_DIRECTORY = FILE__IS_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Suid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__SUID = FILE__SUID;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__GUID = FILE__GUID;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__PERMISSION = FILE__PERMISSION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__LOCATION = FILE__LOCATION;

	/**
	 * The feature id for the '<em><b>Fs</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__FS = FILE__FS;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__CHILDS = FILE__CHILDS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__PARENT = FILE__PARENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__OWNER = FILE__OWNER;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__GROUP = FILE__GROUP;

	/**
	 * The feature id for the '<em><b>Is Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__IS_MISSING = FILE__IS_MISSING;

	/**
	 * The feature id for the '<em><b>Pkg Settings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__PKG_SETTINGS = FILE__PKG_SETTINGS;

	/**
	 * The number of structural features of the '<em>Information File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.AlternativeImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__CURRENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ENV = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PackageSettingImpl <em>Package Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PackageSettingImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPackageSetting()
	 * @generated
	 */
	int PACKAGE_SETTING = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING__SERVICES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING__FILES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING__PKG = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dependences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING__DEPENDENCES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Package Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mancoosi.impl.IconCacheImpl <em>Icon Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.IconCacheImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getIconCache()
	 * @generated
	 */
	int ICON_CACHE = 77;

	/**
	 * The feature id for the '<em><b>Mtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CACHE__MTIME = 0;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CACHE__ENV = 1;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CACHE__ICONS = 2;

	/**
	 * The number of structural features of the '<em>Icon Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CACHE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.DesktopDBImpl <em>Desktop DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.DesktopDBImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getDesktopDB()
	 * @generated
	 */
	int DESKTOP_DB = 78;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_DB__ENV = 0;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_DB__APPLICATIONS = 1;

	/**
	 * The number of structural features of the '<em>Desktop DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_DB_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.MimeTypeHandlerCacheImpl <em>Mime Type Handler Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.MimeTypeHandlerCacheImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getMimeTypeHandlerCache()
	 * @generated
	 */
	int MIME_TYPE_HANDLER_CACHE = 79;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HANDLER_CACHE__ENV = 0;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HANDLER_CACHE__HANDLERS = 1;

	/**
	 * The feature id for the '<em><b>Mime Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HANDLER_CACHE__MIME_TYPES = 2;

	/**
	 * The number of structural features of the '<em>Mime Type Handler Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HANDLER_CACHE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.MimeTypeHandlerImpl <em>Mime Type Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.MimeTypeHandlerImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getMimeTypeHandler()
	 * @generated
	 */
	int MIME_TYPE_HANDLER = 80;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HANDLER__HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HANDLER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HANDLER__CACHE = 2;

	/**
	 * The number of structural features of the '<em>Mime Type Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HANDLER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.MimeTypeImpl <em>Mime Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.MimeTypeImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getMimeType()
	 * @generated
	 */
	int MIME_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Mime Type Handlers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__MIME_TYPE_HANDLERS = 2;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__CACHE = 3;

	/**
	 * The number of structural features of the '<em>Mime Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mancoosi.impl.XFontCacheImpl <em>XFont Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.XFontCacheImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getXFontCache()
	 * @generated
	 */
	int XFONT_CACHE = 82;

	/**
	 * The feature id for the '<em><b>Xfonts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFONT_CACHE__XFONTS = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFONT_CACHE__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFONT_CACHE__ENV = 2;

	/**
	 * The number of structural features of the '<em>XFont Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFONT_CACHE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.XFontImpl <em>XFont</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.XFontImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getXFont()
	 * @generated
	 */
	int XFONT = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFONT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Xfont Cache</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFONT__XFONT_CACHE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFONT__FILE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XFont</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFONT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.LibraryCacheImpl <em>Library Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.LibraryCacheImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getLibraryCache()
	 * @generated
	 */
	int LIBRARY_CACHE = 84;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CACHE__LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Shared Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CACHE__SHARED_LIBRARIES = 1;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CACHE__ENV = 2;

	/**
	 * The number of structural features of the '<em>Library Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_CACHE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.SharedLibraryImpl <em>Shared Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.SharedLibraryImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getSharedLibrary()
	 * @generated
	 */
	int SHARED_LIBRARY = 85;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_LIBRARY__FILE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_LIBRARY__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Library Cache</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_LIBRARY__LIBRARY_CACHE = 3;

	/**
	 * The number of structural features of the '<em>Shared Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_LIBRARY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ModuleCacheImpl <em>Module Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ModuleCacheImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getModuleCache()
	 * @generated
	 */
	int MODULE_CACHE = 86;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CACHE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CACHE__MODULES = 1;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CACHE__ENV = 2;

	/**
	 * The number of structural features of the '<em>Module Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CACHE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ModuleImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 87;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__FILE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Cache</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_CACHE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.SGMLCatalogImpl <em>SGML Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.SGMLCatalogImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getSGMLCatalog()
	 * @generated
	 */
	int SGML_CATALOG = 88;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGML_CATALOG__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGML_CATALOG__ENV = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGML_CATALOG__DOCUMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SGML Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGML_CATALOG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.SGMLDocumentImpl <em>SGML Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.SGMLDocumentImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getSGMLDocument()
	 * @generated
	 */
	int SGML_DOCUMENT = 89;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGML_DOCUMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGML_DOCUMENT__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGML_DOCUMENT__DOCUMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SGML Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGML_DOCUMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.SkeeperCatalogImpl <em>Skeeper Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.SkeeperCatalogImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getSkeeperCatalog()
	 * @generated
	 */
	int SKEEPER_CATALOG = 90;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEEPER_CATALOG__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEEPER_CATALOG__ENV = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEEPER_CATALOG__DOCUMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Skeeper Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEEPER_CATALOG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.SkeeperDocumentImpl <em>Skeeper Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.SkeeperDocumentImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getSkeeperDocument()
	 * @generated
	 */
	int SKEEPER_DOCUMENT = 91;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEEPER_DOCUMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEEPER_DOCUMENT__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEEPER_DOCUMENT__DOCUMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Skeeper Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEEPER_DOCUMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.EmacsPackageImpl <em>Emacs Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.EmacsPackageImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getEmacsPackage()
	 * @generated
	 */
	int EMACS_PACKAGE = 92;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMACS_PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMACS_PACKAGE__FILES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMACS_PACKAGE__ENV = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Emacs Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMACS_PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.UserImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getUser()
	 * @generated
	 */
	int USER = 93;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ENV = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Home</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HOME = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.GroupImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 94;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ENV = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__USERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstDesktopImpl <em>Postinst Desktop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstDesktopImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstDesktop()
	 * @generated
	 */
	int POSTINST_DESKTOP = 95;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Desktop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstDocBaseImpl <em>Postinst Doc Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstDocBaseImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstDocBase()
	 * @generated
	 */
	int POSTINST_DOC_BASE = 96;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__NAME = ADDITION_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__SCRIPT = ADDITION_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__IS_START = ADDITION_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__PREVIOUS = ADDITION_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__NEXT = ADDITION_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__ENVIRONMENT = ADDITION_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__DOCUMENT = ADDITION_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Doc Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE_FEATURE_COUNT = ADDITION_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstEmacsenImpl <em>Postinst Emacsen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstEmacsenImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstEmacsen()
	 * @generated
	 */
	int POSTINST_EMACSEN = 97;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__PKGSETTING = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Emacsen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstGconfImpl <em>Postinst Gconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstGconfImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstGconf()
	 * @generated
	 */
	int POSTINST_GCONF = 98;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__NAME = UPDATE_PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__SCRIPT = UPDATE_PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__IS_START = UPDATE_PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__PREVIOUS = UPDATE_PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__NEXT = UPDATE_PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__PKGSETTING = UPDATE_PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__SCHEMAS = UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Gconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_FEATURE_COUNT = UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstGconfDefaultsImpl <em>Postinst Gconf Defaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstGconfDefaultsImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstGconfDefaults()
	 * @generated
	 */
	int POSTINST_GCONF_DEFAULTS = 99;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__NAME = UPDATE_PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__SCRIPT = UPDATE_PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__IS_START = UPDATE_PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__PREVIOUS = UPDATE_PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__NEXT = UPDATE_PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__PKGSETTING = UPDATE_PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The number of structural features of the '<em>Postinst Gconf Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS_FEATURE_COUNT = UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstIconsImpl <em>Postinst Icons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstIconsImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstIcons()
	 * @generated
	 */
	int POSTINST_ICONS = 100;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Directories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__DIRECTORIES = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Icons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstInfoImpl <em>Postinst Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstInfoImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstInfo()
	 * @generated
	 */
	int POSTINST_INFO = 101;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__FILE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstInitImpl <em>Postinst Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstInitImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstInit()
	 * @generated
	 */
	int POSTINST_INIT = 102;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__INIT_PARAMS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstInitNostartImpl <em>Postinst Init Nostart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstInitNostartImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstInitNostart()
	 * @generated
	 */
	int POSTINST_INIT_NOSTART = 103;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__INIT_PARAMS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__ERROR_HANDLER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Postinst Init Nostart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstInitRestartImpl <em>Postinst Init Restart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstInitRestartImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstInitRestart()
	 * @generated
	 */
	int POSTINST_INIT_RESTART = 104;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__INIT_PARAMS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__ERROR_HANDLER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Postinst Init Restart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstMakeshlibsImpl <em>Postinst Makeshlibs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstMakeshlibsImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstMakeshlibs()
	 * @generated
	 */
	int POSTINST_MAKESHLIBS = 105;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Makeshlibs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstMenuImpl <em>Postinst Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstMenuImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstMenu()
	 * @generated
	 */
	int POSTINST_MENU = 106;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstMenuMethodImpl <em>Postinst Menu Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstMenuMethodImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstMenuMethod()
	 * @generated
	 */
	int POSTINST_MENU_METHOD = 107;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Menu Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstMimeImpl <em>Postinst Mime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstMimeImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstMime()
	 * @generated
	 */
	int POSTINST_MIME = 108;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Mime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstModulesImpl <em>Postinst Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstModulesImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstModules()
	 * @generated
	 */
	int POSTINST_MODULES = 109;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Kvers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__KVERS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstPythonImpl <em>Postinst Python</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstPythonImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstPython()
	 * @generated
	 */
	int POSTINST_PYTHON = 110;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Pyver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__PYVER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dirlist</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__DIRLIST = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Python</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstScrollkeeperImpl <em>Postinst Scrollkeeper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstScrollkeeperImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstScrollkeeper()
	 * @generated
	 */
	int POSTINST_SCROLLKEEPER = 111;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Scrollkeeper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstSgmlcatalogImpl <em>Postinst Sgmlcatalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstSgmlcatalogImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstSgmlcatalog()
	 * @generated
	 */
	int POSTINST_SGMLCATALOG = 112;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Centralcat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__CENTRALCAT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordcats</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__ORDCATS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Sgmlcatalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstSharedmimeinfoImpl <em>Postinst Sharedmimeinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstSharedmimeinfoImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstSharedmimeinfo()
	 * @generated
	 */
	int POSTINST_SHAREDMIMEINFO = 113;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Sharedmimeinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstSuidImpl <em>Postinst Suid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstSuidImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstSuid()
	 * @generated
	 */
	int POSTINST_SUID = 114;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__FILES = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__FILE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__OWNER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__GROUP = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Perms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__PERMS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Postinst Suid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstUdevImpl <em>Postinst Udev</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstUdevImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstUdev()
	 * @generated
	 */
	int POSTINST_UDEV = 115;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__NAME = UPDATE_FILE_SYTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__SCRIPT = UPDATE_FILE_SYTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__IS_START = UPDATE_FILE_SYTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__PREVIOUS = UPDATE_FILE_SYTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__NEXT = UPDATE_FILE_SYTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__FILES = UPDATE_FILE_SYTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Old</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__OLD = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__RULE = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Udev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV_FEATURE_COUNT = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstUsrlocalImpl <em>Postinst Usrlocal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstUsrlocalImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstUsrlocal()
	 * @generated
	 */
	int POSTINST_USRLOCAL = 116;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__NAME = UPDATE_FILE_SYTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__SCRIPT = UPDATE_FILE_SYTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__IS_START = UPDATE_FILE_SYTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__PREVIOUS = UPDATE_FILE_SYTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__NEXT = UPDATE_FILE_SYTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__FILES = UPDATE_FILE_SYTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__DIR = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__MODE = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__USER = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__GROUP = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Postinst Usrlocal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL_FEATURE_COUNT = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstWmImpl <em>Postinst Wm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstWmImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstWm()
	 * @generated
	 */
	int POSTINST_WM = 117;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Wm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__WM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wmman</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__WMMAN = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__PRIORITY = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Postinst Wm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstWmNomanImpl <em>Postinst Wm Noman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstWmNomanImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstWmNoman()
	 * @generated
	 */
	int POSTINST_WM_NOMAN = 118;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Wm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__WM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__PRIORITY = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Wm Noman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostinstXfontsImpl <em>Postinst Xfonts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostinstXfontsImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostinstXfonts()
	 * @generated
	 */
	int POSTINST_XFONTS = 119;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Cmds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__CMDS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Xfonts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmDebconfImpl <em>Postrm Debconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmDebconfImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmDebconf()
	 * @generated
	 */
	int POSTRM_DEBCONF = 120;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Debconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmDesktopImpl <em>Postrm Desktop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmDesktopImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmDesktop()
	 * @generated
	 */
	int POSTRM_DESKTOP = 121;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Desktop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmGconfImpl <em>Postrm Gconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmGconfImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmGconf()
	 * @generated
	 */
	int POSTRM_GCONF = 122;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__NAME = DELETION_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__SCRIPT = DELETION_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__IS_START = DELETION_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__PREVIOUS = DELETION_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__NEXT = DELETION_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__FILES = DELETION_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__SCHEMAS = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Gconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_FEATURE_COUNT = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmGconfDefaultsImpl <em>Postrm Gconf Defaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmGconfDefaultsImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmGconfDefaults()
	 * @generated
	 */
	int POSTRM_GCONF_DEFAULTS = 123;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Gconf Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmIconsImpl <em>Postrm Icons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmIconsImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmIcons()
	 * @generated
	 */
	int POSTRM_ICONS = 124;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Dirs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__DIRS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Icons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmInitImpl <em>Postrm Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmInitImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmInit()
	 * @generated
	 */
	int POSTRM_INIT = 125;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__FILES = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postrm Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmMakeshlibsImpl <em>Postrm Makeshlibs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmMakeshlibsImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmMakeshlibs()
	 * @generated
	 */
	int POSTRM_MAKESHLIBS = 126;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Makeshlibs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmMenuImpl <em>Postrm Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmMenuImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmMenu()
	 * @generated
	 */
	int POSTRM_MENU = 127;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmMenuMethodImpl <em>Postrm Menu Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmMenuMethodImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmMenuMethod()
	 * @generated
	 */
	int POSTRM_MENU_METHOD = 128;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__FILES = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postrm Menu Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmMimeImpl <em>Postrm Mime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmMimeImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmMime()
	 * @generated
	 */
	int POSTRM_MIME = 129;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Mime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmModulesImpl <em>Postrm Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmModulesImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmModules()
	 * @generated
	 */
	int POSTRM_MODULES = 130;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Kvers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__KVERS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmScrollkeeperImpl <em>Postrm Scrollkeeper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmScrollkeeperImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmScrollkeeper()
	 * @generated
	 */
	int POSTRM_SCROLLKEEPER = 131;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Scrollkeeper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmSgmlcatalogImpl <em>Postrm Sgmlcatalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmSgmlcatalogImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmSgmlcatalog()
	 * @generated
	 */
	int POSTRM_SGMLCATALOG = 132;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__NAME = UPDATE_FILE_SYTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__SCRIPT = UPDATE_FILE_SYTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__IS_START = UPDATE_FILE_SYTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__PREVIOUS = UPDATE_FILE_SYTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__NEXT = UPDATE_FILE_SYTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__FILES = UPDATE_FILE_SYTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Centralcat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__CENTRALCAT = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Sgmlcatalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG_FEATURE_COUNT = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmSharedmimeinfoImpl <em>Postrm Sharedmimeinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmSharedmimeinfoImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmSharedmimeinfo()
	 * @generated
	 */
	int POSTRM_SHAREDMIMEINFO = 133;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Sharedmimeinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmSuidImpl <em>Postrm Suid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmSuidImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmSuid()
	 * @generated
	 */
	int POSTRM_SUID = 134;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__FILE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postrm Suid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PostrmXfontsImpl <em>Postrm Xfonts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PostrmXfontsImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPostrmXfonts()
	 * @generated
	 */
	int POSTRM_XFONTS = 135;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Cmds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__CMDS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Xfonts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PreinstUdevImpl <em>Preinst Udev</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PreinstUdevImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPreinstUdev()
	 * @generated
	 */
	int PREINST_UDEV = 136;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__NAME = DELETION_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__SCRIPT = DELETION_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__IS_START = DELETION_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__PREVIOUS = DELETION_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__NEXT = DELETION_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__FILES = DELETION_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Old</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__OLD = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__RULE = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__PACKAGE = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Preinst Udev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV_FEATURE_COUNT = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PreinstUserImpl <em>Preinst User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PreinstUserImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPreinstUser()
	 * @generated
	 */
	int PREINST_USER = 137;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__NAME = UPDATE_FILE_SYTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__SCRIPT = UPDATE_FILE_SYTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__IS_START = UPDATE_FILE_SYTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__PREVIOUS = UPDATE_FILE_SYTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__NEXT = UPDATE_FILE_SYTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__FILES = UPDATE_FILE_SYTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__DIR = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__MODE = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__USER = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__GROUP = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Preinst User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER_FEATURE_COUNT = UPDATE_FILE_SYTEM_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PrermDocBaseImpl <em>Prerm Doc Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PrermDocBaseImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPrermDocBase()
	 * @generated
	 */
	int PRERM_DOC_BASE = 138;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__DOC = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Doc Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PrermEmacsenImpl <em>Prerm Emacsen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PrermEmacsenImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPrermEmacsen()
	 * @generated
	 */
	int PRERM_EMACSEN = 139;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__PKGSETTING = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prerm Emacsen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PrermGconfImpl <em>Prerm Gconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PrermGconfImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPrermGconf()
	 * @generated
	 */
	int PRERM_GCONF = 140;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__NAME = UPDATE_PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__SCRIPT = UPDATE_PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__IS_START = UPDATE_PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__PREVIOUS = UPDATE_PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__NEXT = UPDATE_PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__PKGSETTING = UPDATE_PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__SCHEMAS = UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Gconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF_FEATURE_COUNT = UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PrermInfoImpl <em>Prerm Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PrermInfoImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPrermInfo()
	 * @generated
	 */
	int PRERM_INFO = 141;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__PKGSETTING = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__FILE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prerm Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PrermInitImpl <em>Prerm Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PrermInitImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPrermInit()
	 * @generated
	 */
	int PRERM_INIT = 142;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PrermInitNorestartImpl <em>Prerm Init Norestart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PrermInitNorestartImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPrermInitNorestart()
	 * @generated
	 */
	int PRERM_INIT_NORESTART = 143;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Init Norestart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PrermPythonImpl <em>Prerm Python</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PrermPythonImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPrermPython()
	 * @generated
	 */
	int PRERM_PYTHON = 144;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__NAME = DELETION_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__SCRIPT = DELETION_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__IS_START = DELETION_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__PREVIOUS = DELETION_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__NEXT = DELETION_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__FILES = DELETION_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__PACKAGE = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Python</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON_FEATURE_COUNT = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PrermSgmlcatalogImpl <em>Prerm Sgmlcatalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PrermSgmlcatalogImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPrermSgmlcatalog()
	 * @generated
	 */
	int PRERM_SGMLCATALOG = 145;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__PKGSETTING = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Centralcat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__CENTRALCAT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prerm Sgmlcatalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PrermUsrlocalImpl <em>Prerm Usrlocal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PrermUsrlocalImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPrermUsrlocal()
	 * @generated
	 */
	int PRERM_USRLOCAL = 146;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__NAME = DELETION_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__SCRIPT = DELETION_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__IS_START = DELETION_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__PREVIOUS = DELETION_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__NEXT = DELETION_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__FILES = DELETION_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The number of structural features of the '<em>Prerm Usrlocal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL_FEATURE_COUNT = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.PrermWmImpl <em>Prerm Wm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.PrermWmImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getPrermWm()
	 * @generated
	 */
	int PRERM_WM = 147;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__NAME = DELETION_PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__SCRIPT = DELETION_PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__IS_START = DELETION_PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__PREVIOUS = DELETION_PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__NEXT = DELETION_PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__PKGSETTING = DELETION_PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The feature id for the '<em><b>Wm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__WM = DELETION_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Wm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM_FEATURE_COUNT = DELETION_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ParamImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 148;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mancoosi.impl.StringParamImpl <em>String Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.StringParamImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getStringParam()
	 * @generated
	 */
	int STRING_PARAM = 149;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM__VALUE = PARAM__VALUE;

	/**
	 * The number of structural features of the '<em>String Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM_FEATURE_COUNT = PARAM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.IntParamImpl <em>Int Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.IntParamImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getIntParam()
	 * @generated
	 */
	int INT_PARAM = 150;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_PARAM__VALUE = PARAM__VALUE;

	/**
	 * The number of structural features of the '<em>Int Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_PARAM_FEATURE_COUNT = PARAM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mancoosi.impl.SingleConflictImpl <em>Single Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.SingleConflictImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getSingleConflict()
	 * @generated
	 */
	int SINGLE_CONFLICT = 151;

	/**
	 * The meta object id for the '{@link mancoosi.impl.ConflictImpl <em>Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.ConflictImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getConflict()
	 * @generated
	 */
	int CONFLICT = 152;

	/**
	 * The feature id for the '<em><b>And Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__AND_CONFLICT = 0;

	/**
	 * The feature id for the '<em><b>Or Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__OR_CONFLICT = 1;

	/**
	 * The feature id for the '<em><b>Single Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__SINGLE_CONFLICT = 2;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__PKG = 3;

	/**
	 * The number of structural features of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>And Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__AND_CONFLICT = CONFLICT__AND_CONFLICT;

	/**
	 * The feature id for the '<em><b>Or Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__OR_CONFLICT = CONFLICT__OR_CONFLICT;

	/**
	 * The feature id for the '<em><b>Single Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__SINGLE_CONFLICT = CONFLICT__SINGLE_CONFLICT;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__PKG = CONFLICT__PKG;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__CONFLICT = CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__VERSION = CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__VALUE = CONFLICT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Single Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT_FEATURE_COUNT = CONFLICT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mancoosi.impl.AndConflictImpl <em>And Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.AndConflictImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getAndConflict()
	 * @generated
	 */
	int AND_CONFLICT = 153;

	/**
	 * The feature id for the '<em><b>And Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__AND_CONFLICT = CONFLICT__AND_CONFLICT;

	/**
	 * The feature id for the '<em><b>Or Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__OR_CONFLICT = CONFLICT__OR_CONFLICT;

	/**
	 * The feature id for the '<em><b>Single Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__SINGLE_CONFLICT = CONFLICT__SINGLE_CONFLICT;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__PKG = CONFLICT__PKG;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__OPS = CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__CONFLICT = CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT_FEATURE_COUNT = CONFLICT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.impl.OrConflictImpl <em>Or Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.impl.OrConflictImpl
	 * @see mancoosi.impl.MancoosiPackageImpl#getOrConflict()
	 * @generated
	 */
	int OR_CONFLICT = 154;

	/**
	 * The feature id for the '<em><b>And Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__AND_CONFLICT = CONFLICT__AND_CONFLICT;

	/**
	 * The feature id for the '<em><b>Or Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__OR_CONFLICT = CONFLICT__OR_CONFLICT;

	/**
	 * The feature id for the '<em><b>Single Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__SINGLE_CONFLICT = CONFLICT__SINGLE_CONFLICT;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__PKG = CONFLICT__PKG;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__OPS = CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__CONFLICT = CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT_FEATURE_COUNT = CONFLICT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mancoosi.PriorityType <em>Priority Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.PriorityType
	 * @see mancoosi.impl.MancoosiPackageImpl#getPriorityType()
	 * @generated
	 */
	int PRIORITY_TYPE = 156;

	/**
	 * The meta object id for the '{@link mancoosi.StatusType <em>Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.StatusType
	 * @see mancoosi.impl.MancoosiPackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 157;

	/**
	 * The meta object id for the '{@link mancoosi.VersionType <em>Version Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.VersionType
	 * @see mancoosi.impl.MancoosiPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 158;

	/**
	 * The meta object id for the '{@link mancoosi.ReturnStatementValue <em>Return Statement Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.ReturnStatementValue
	 * @see mancoosi.impl.MancoosiPackageImpl#getReturnStatementValue()
	 * @generated
	 */
	int RETURN_STATEMENT_VALUE = 159;

	/**
	 * The meta object id for the '{@link mancoosi.CasePrermConditionValue <em>Case Prerm Condition Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.CasePrermConditionValue
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePrermConditionValue()
	 * @generated
	 */
	int CASE_PRERM_CONDITION_VALUE = 160;

	/**
	 * The meta object id for the '{@link mancoosi.CasePostrmConditionValue <em>Case Postrm Condition Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.CasePostrmConditionValue
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePostrmConditionValue()
	 * @generated
	 */
	int CASE_POSTRM_CONDITION_VALUE = 161;

	/**
	 * The meta object id for the '{@link mancoosi.CasePreinstConditionValue <em>Case Preinst Condition Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.CasePreinstConditionValue
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePreinstConditionValue()
	 * @generated
	 */
	int CASE_PREINST_CONDITION_VALUE = 162;

	/**
	 * The meta object id for the '{@link mancoosi.CasePostinstConditionValue <em>Case Postinst Condition Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mancoosi.CasePostinstConditionValue
	 * @see mancoosi.impl.MancoosiPackageImpl#getCasePostinstConditionValue()
	 * @generated
	 */
	int CASE_POSTINST_CONDITION_VALUE = 163;


	/**
	 * Returns the meta object for class '{@link mancoosi.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see mancoosi.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mancoosi.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link mancoosi.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see mancoosi.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.Configuration#getInstalledPackages <em>Installed Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Installed Packages</em>'.
	 * @see mancoosi.Configuration#getInstalledPackages()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_InstalledPackages();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Configuration#getFileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File System</em>'.
	 * @see mancoosi.Configuration#getFileSystem()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_FileSystem();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Configuration#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see mancoosi.Configuration#getEnvironment()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.Configuration#getNotInstalledPackages <em>Not Installed Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not Installed Packages</em>'.
	 * @see mancoosi.Configuration#getNotInstalledPackages()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_NotInstalledPackages();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.Configuration#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see mancoosi.Configuration#getCreationTime()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_CreationTime();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.Configuration#getSystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Type</em>'.
	 * @see mancoosi.Configuration#getSystemType()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_SystemType();

	/**
	 * Returns the meta object for class '{@link mancoosi.InstalledPackage <em>Installed Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installed Package</em>'.
	 * @see mancoosi.InstalledPackage
	 * @generated
	 */
	EClass getInstalledPackage();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.InstalledPackage#getInstalledSize <em>Installed Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installed Size</em>'.
	 * @see mancoosi.InstalledPackage#getInstalledSize()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_InstalledSize();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.InstalledPackage#getMaintainer <em>Maintainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintainer</em>'.
	 * @see mancoosi.InstalledPackage#getMaintainer()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Maintainer();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.InstalledPackage#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see mancoosi.InstalledPackage#getArchitecture()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.InstalledPackage#getFileSize <em>File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Size</em>'.
	 * @see mancoosi.InstalledPackage#getFileSize()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_FileSize();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.InstalledPackage#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see mancoosi.InstalledPackage#getCheckSum()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_CheckSum();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.InstalledPackage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mancoosi.InstalledPackage#getDescription()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Description();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.InstalledPackage#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section</em>'.
	 * @see mancoosi.InstalledPackage#getSection()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Section();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.InstalledPackage#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see mancoosi.InstalledPackage#getTag()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Tag();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.InstalledPackage#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see mancoosi.InstalledPackage#getPriority()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Priority();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.InstalledPackage#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see mancoosi.InstalledPackage#getStatus()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Status();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.InstalledPackage#getUploaders <em>Uploaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uploaders</em>'.
	 * @see mancoosi.InstalledPackage#getUploaders()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Uploaders();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.InstalledPackage#getSourcePackage <em>Source Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Package</em>'.
	 * @see mancoosi.InstalledPackage#getSourcePackage()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_SourcePackage();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.InstalledPackage#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depends</em>'.
	 * @see mancoosi.InstalledPackage#getDepends()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Depends();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.InstalledPackage#getRecommends <em>Recommends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommends</em>'.
	 * @see mancoosi.InstalledPackage#getRecommends()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Recommends();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.InstalledPackage#getSuggests <em>Suggests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Suggests</em>'.
	 * @see mancoosi.InstalledPackage#getSuggests()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Suggests();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.InstalledPackage#getEnhances <em>Enhances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enhances</em>'.
	 * @see mancoosi.InstalledPackage#getEnhances()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Enhances();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.InstalledPackage#getPredepends <em>Predepends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predepends</em>'.
	 * @see mancoosi.InstalledPackage#getPredepends()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Predepends();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.InstalledPackage#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provides</em>'.
	 * @see mancoosi.InstalledPackage#getProvides()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Provides();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.InstalledPackage#getReplaces <em>Replaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replaces</em>'.
	 * @see mancoosi.InstalledPackage#getReplaces()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Replaces();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.InstalledPackage#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Files</em>'.
	 * @see mancoosi.InstalledPackage#getFiles()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.InstalledPackage#getDocumentationFiles <em>Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation Files</em>'.
	 * @see mancoosi.InstalledPackage#getDocumentationFiles()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_DocumentationFiles();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.InstalledPackage#getPreinstScript <em>Preinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preinst Script</em>'.
	 * @see mancoosi.InstalledPackage#getPreinstScript()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_PreinstScript();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.InstalledPackage#getPostinstScript <em>Postinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postinst Script</em>'.
	 * @see mancoosi.InstalledPackage#getPostinstScript()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_PostinstScript();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.InstalledPackage#getPrermScript <em>Prerm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prerm Script</em>'.
	 * @see mancoosi.InstalledPackage#getPrermScript()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_PrermScript();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.InstalledPackage#getPostrmScript <em>Postrm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postrm Script</em>'.
	 * @see mancoosi.InstalledPackage#getPostrmScript()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_PostrmScript();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.InstalledPackage#getConfigScript <em>Config Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Script</em>'.
	 * @see mancoosi.InstalledPackage#getConfigScript()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_ConfigScript();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.InstalledPackage#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conflict</em>'.
	 * @see mancoosi.InstalledPackage#getConflict()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Conflict();

	/**
	 * Returns the meta object for class '{@link mancoosi.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see mancoosi.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mancoosi.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Package#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see mancoosi.Package#getConfiguration()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Package#getPackageSettings <em>Package Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package Settings</em>'.
	 * @see mancoosi.Package#getPackageSettings()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackageSettings();

	/**
	 * Returns the meta object for class '{@link mancoosi.NotInstalledPackage <em>Not Installed Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Installed Package</em>'.
	 * @see mancoosi.NotInstalledPackage
	 * @generated
	 */
	EClass getNotInstalledPackage();

	/**
	 * Returns the meta object for class '{@link mancoosi.SrcPackage <em>Src Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Package</em>'.
	 * @see mancoosi.SrcPackage
	 * @generated
	 */
	EClass getSrcPackage();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.SrcPackage#getBuildDepends <em>Build Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Build Depends</em>'.
	 * @see mancoosi.SrcPackage#getBuildDepends()
	 * @see #getSrcPackage()
	 * @generated
	 */
	EReference getSrcPackage_BuildDepends();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.SrcPackage#getBuildConflicts <em>Build Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Build Conflicts</em>'.
	 * @see mancoosi.SrcPackage#getBuildConflicts()
	 * @see #getSrcPackage()
	 * @generated
	 */
	EReference getSrcPackage_BuildConflicts();

	/**
	 * Returns the meta object for class '{@link mancoosi.BinPackage <em>Bin Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Package</em>'.
	 * @see mancoosi.BinPackage
	 * @generated
	 */
	EClass getBinPackage();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.BinPackage#getSrcRef <em>Src Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src Ref</em>'.
	 * @see mancoosi.BinPackage#getSrcRef()
	 * @see #getBinPackage()
	 * @generated
	 */
	EReference getBinPackage_SrcRef();

	/**
	 * Returns the meta object for class '{@link mancoosi.VirtualPackage <em>Virtual Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Package</em>'.
	 * @see mancoosi.VirtualPackage
	 * @generated
	 */
	EClass getVirtualPackage();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.VirtualPackage#getImpPackage <em>Imp Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imp Package</em>'.
	 * @see mancoosi.VirtualPackage#getImpPackage()
	 * @see #getVirtualPackage()
	 * @generated
	 */
	EReference getVirtualPackage_ImpPackage();

	/**
	 * Returns the meta object for class '{@link mancoosi.Dependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependence</em>'.
	 * @see mancoosi.Dependence
	 * @generated
	 */
	EClass getDependence();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Dependence#getAndDep <em>And Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And Dep</em>'.
	 * @see mancoosi.Dependence#getAndDep()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_AndDep();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Dependence#getOrDep <em>Or Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or Dep</em>'.
	 * @see mancoosi.Dependence#getOrDep()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_OrDep();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Dependence#getSingleDep <em>Single Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Dep</em>'.
	 * @see mancoosi.Dependence#getSingleDep()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_SingleDep();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Dependence#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pkg</em>'.
	 * @see mancoosi.Dependence#getPkg()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_Pkg();

	/**
	 * Returns the meta object for class '{@link mancoosi.AndDep <em>And Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Dep</em>'.
	 * @see mancoosi.AndDep
	 * @generated
	 */
	EClass getAndDep();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.AndDep#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see mancoosi.AndDep#getOps()
	 * @see #getAndDep()
	 * @generated
	 */
	EReference getAndDep_Ops();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.AndDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dependence</em>'.
	 * @see mancoosi.AndDep#getDependence()
	 * @see #getAndDep()
	 * @generated
	 */
	EReference getAndDep_Dependence();

	/**
	 * Returns the meta object for class '{@link mancoosi.OrDep <em>Or Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Dep</em>'.
	 * @see mancoosi.OrDep
	 * @generated
	 */
	EClass getOrDep();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.OrDep#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see mancoosi.OrDep#getOps()
	 * @see #getOrDep()
	 * @generated
	 */
	EReference getOrDep_Ops();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.OrDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dependence</em>'.
	 * @see mancoosi.OrDep#getDependence()
	 * @see #getOrDep()
	 * @generated
	 */
	EReference getOrDep_Dependence();

	/**
	 * Returns the meta object for class '{@link mancoosi.SingleDep <em>Single Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Dep</em>'.
	 * @see mancoosi.SingleDep
	 * @generated
	 */
	EClass getSingleDep();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.SingleDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dependence</em>'.
	 * @see mancoosi.SingleDep#getDependence()
	 * @see #getSingleDep()
	 * @generated
	 */
	EReference getSingleDep_Dependence();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.SingleDep#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mancoosi.SingleDep#getVersion()
	 * @see #getSingleDep()
	 * @generated
	 */
	EAttribute getSingleDep_Version();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.SingleDep#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mancoosi.SingleDep#getValue()
	 * @see #getSingleDep()
	 * @generated
	 */
	EAttribute getSingleDep_Value();

	/**
	 * Returns the meta object for class '{@link mancoosi.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see mancoosi.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Script#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see mancoosi.Script#getPre()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Pre();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Script#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see mancoosi.Script#getPost()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Post();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.Script#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see mancoosi.Script#getStatements()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.Script#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameters</em>'.
	 * @see mancoosi.Script#getInputParameters()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_InputParameters();

	/**
	 * Returns the meta object for class '{@link mancoosi.InputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter</em>'.
	 * @see mancoosi.InputParameter
	 * @generated
	 */
	EClass getInputParameter();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.InputParameter#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Script</em>'.
	 * @see mancoosi.InputParameter#getScript()
	 * @see #getInputParameter()
	 * @generated
	 */
	EReference getInputParameter_Script();

	/**
	 * Returns the meta object for class '{@link mancoosi.PreinstScript <em>Preinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preinst Script</em>'.
	 * @see mancoosi.PreinstScript
	 * @generated
	 */
	EClass getPreinstScript();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.PreinstScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see mancoosi.PreinstScript#getPkg()
	 * @see #getPreinstScript()
	 * @generated
	 */
	EReference getPreinstScript_Pkg();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstScript <em>Postinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Script</em>'.
	 * @see mancoosi.PostinstScript
	 * @generated
	 */
	EClass getPostinstScript();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.PostinstScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see mancoosi.PostinstScript#getPkg()
	 * @see #getPostinstScript()
	 * @generated
	 */
	EReference getPostinstScript_Pkg();

	/**
	 * Returns the meta object for class '{@link mancoosi.PrermScript <em>Prerm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Script</em>'.
	 * @see mancoosi.PrermScript
	 * @generated
	 */
	EClass getPrermScript();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.PrermScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see mancoosi.PrermScript#getPkg()
	 * @see #getPrermScript()
	 * @generated
	 */
	EReference getPrermScript_Pkg();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmScript <em>Postrm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Script</em>'.
	 * @see mancoosi.PostrmScript
	 * @generated
	 */
	EClass getPostrmScript();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.PostrmScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see mancoosi.PostrmScript#getPkg()
	 * @see #getPostrmScript()
	 * @generated
	 */
	EReference getPostrmScript_Pkg();

	/**
	 * Returns the meta object for class '{@link mancoosi.ConfigScript <em>Config Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Script</em>'.
	 * @see mancoosi.ConfigScript
	 * @generated
	 */
	EClass getConfigScript();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.ConfigScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see mancoosi.ConfigScript#getPkg()
	 * @see #getConfigScript()
	 * @generated
	 */
	EReference getConfigScript_Pkg();

	/**
	 * Returns the meta object for class '{@link mancoosi.Invariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariant</em>'.
	 * @see mancoosi.Invariant
	 * @generated
	 */
	EClass getInvariant();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Invariant#getAtomEl <em>Atom El</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atom El</em>'.
	 * @see mancoosi.Invariant#getAtomEl()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_AtomEl();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Invariant#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>And</em>'.
	 * @see mancoosi.Invariant#getAnd()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_And();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Invariant#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Or</em>'.
	 * @see mancoosi.Invariant#getOr()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_Or();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Invariant#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Not</em>'.
	 * @see mancoosi.Invariant#getNot()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_Not();

	/**
	 * Returns the meta object for class '{@link mancoosi.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see mancoosi.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for class '{@link mancoosi.AndInv <em>And Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Inv</em>'.
	 * @see mancoosi.AndInv
	 * @generated
	 */
	EClass getAndInv();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.AndInv#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see mancoosi.AndInv#getLeft()
	 * @see #getAndInv()
	 * @generated
	 */
	EReference getAndInv_Left();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.AndInv#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see mancoosi.AndInv#getRight()
	 * @see #getAndInv()
	 * @generated
	 */
	EReference getAndInv_Right();

	/**
	 * Returns the meta object for class '{@link mancoosi.OrInv <em>Or Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Inv</em>'.
	 * @see mancoosi.OrInv
	 * @generated
	 */
	EClass getOrInv();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.OrInv#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see mancoosi.OrInv#getLeft()
	 * @see #getOrInv()
	 * @generated
	 */
	EReference getOrInv_Left();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.OrInv#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see mancoosi.OrInv#getRight()
	 * @see #getOrInv()
	 * @generated
	 */
	EReference getOrInv_Right();

	/**
	 * Returns the meta object for class '{@link mancoosi.NotInv <em>Not Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Inv</em>'.
	 * @see mancoosi.NotInv
	 * @generated
	 */
	EClass getNotInv();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.NotInv#getElem <em>Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elem</em>'.
	 * @see mancoosi.NotInv#getElem()
	 * @see #getNotInv()
	 * @generated
	 */
	EReference getNotInv_Elem();

	/**
	 * Returns the meta object for class '{@link mancoosi.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see mancoosi.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.Statement#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Script</em>'.
	 * @see mancoosi.Statement#getScript()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Script();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.Statement#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see mancoosi.Statement#isIsStart()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_IsStart();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Statement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see mancoosi.Statement#getPrevious()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Previous();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Statement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see mancoosi.Statement#getNext()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Next();

	/**
	 * Returns the meta object for class '{@link mancoosi.ControlStatement <em>Control Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Statement</em>'.
	 * @see mancoosi.ControlStatement
	 * @generated
	 */
	EClass getControlStatement();

	/**
	 * Returns the meta object for class '{@link mancoosi.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see mancoosi.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.Case#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see mancoosi.Case#getSelector()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Selector();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Case#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see mancoosi.Case#getDefault()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Default();

	/**
	 * Returns the meta object for class '{@link mancoosi.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see mancoosi.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Condition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see mancoosi.Condition#getAction()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Action();

	/**
	 * Returns the meta object for class '{@link mancoosi.DefaultCaseCondition <em>Default Case Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Case Condition</em>'.
	 * @see mancoosi.DefaultCaseCondition
	 * @generated
	 */
	EClass getDefaultCaseCondition();

	/**
	 * Returns the meta object for class '{@link mancoosi.CasePrerm <em>Case Prerm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Prerm</em>'.
	 * @see mancoosi.CasePrerm
	 * @generated
	 */
	EClass getCasePrerm();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.CasePrerm#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see mancoosi.CasePrerm#getConditions()
	 * @see #getCasePrerm()
	 * @generated
	 */
	EReference getCasePrerm_Conditions();

	/**
	 * Returns the meta object for class '{@link mancoosi.CasePrermCondition <em>Case Prerm Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Prerm Condition</em>'.
	 * @see mancoosi.CasePrermCondition
	 * @generated
	 */
	EClass getCasePrermCondition();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.CasePrermCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mancoosi.CasePrermCondition#getValue()
	 * @see #getCasePrermCondition()
	 * @generated
	 */
	EAttribute getCasePrermCondition_Value();

	/**
	 * Returns the meta object for class '{@link mancoosi.CasePostrm <em>Case Postrm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Postrm</em>'.
	 * @see mancoosi.CasePostrm
	 * @generated
	 */
	EClass getCasePostrm();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.CasePostrm#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see mancoosi.CasePostrm#getConditions()
	 * @see #getCasePostrm()
	 * @generated
	 */
	EReference getCasePostrm_Conditions();

	/**
	 * Returns the meta object for class '{@link mancoosi.CasePostrmCondition <em>Case Postrm Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Postrm Condition</em>'.
	 * @see mancoosi.CasePostrmCondition
	 * @generated
	 */
	EClass getCasePostrmCondition();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.CasePostrmCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mancoosi.CasePostrmCondition#getValue()
	 * @see #getCasePostrmCondition()
	 * @generated
	 */
	EAttribute getCasePostrmCondition_Value();

	/**
	 * Returns the meta object for class '{@link mancoosi.CasePreinst <em>Case Preinst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Preinst</em>'.
	 * @see mancoosi.CasePreinst
	 * @generated
	 */
	EClass getCasePreinst();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.CasePreinst#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see mancoosi.CasePreinst#getConditions()
	 * @see #getCasePreinst()
	 * @generated
	 */
	EReference getCasePreinst_Conditions();

	/**
	 * Returns the meta object for class '{@link mancoosi.CasePreinstCondition <em>Case Preinst Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Preinst Condition</em>'.
	 * @see mancoosi.CasePreinstCondition
	 * @generated
	 */
	EClass getCasePreinstCondition();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.CasePreinstCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mancoosi.CasePreinstCondition#getValue()
	 * @see #getCasePreinstCondition()
	 * @generated
	 */
	EAttribute getCasePreinstCondition_Value();

	/**
	 * Returns the meta object for class '{@link mancoosi.CasePostinst <em>Case Postinst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Postinst</em>'.
	 * @see mancoosi.CasePostinst
	 * @generated
	 */
	EClass getCasePostinst();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.CasePostinst#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see mancoosi.CasePostinst#getConditions()
	 * @see #getCasePostinst()
	 * @generated
	 */
	EReference getCasePostinst_Conditions();

	/**
	 * Returns the meta object for class '{@link mancoosi.CasePostinstCondition <em>Case Postinst Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Postinst Condition</em>'.
	 * @see mancoosi.CasePostinstCondition
	 * @generated
	 */
	EClass getCasePostinstCondition();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.CasePostinstCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mancoosi.CasePostinstCondition#getValue()
	 * @see #getCasePostinstCondition()
	 * @generated
	 */
	EAttribute getCasePostinstCondition_Value();

	/**
	 * Returns the meta object for class '{@link mancoosi.BasicCase <em>Basic Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Case</em>'.
	 * @see mancoosi.BasicCase
	 * @generated
	 */
	EClass getBasicCase();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.BasicCase#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see mancoosi.BasicCase#getConditions()
	 * @see #getBasicCase()
	 * @generated
	 */
	EReference getBasicCase_Conditions();

	/**
	 * Returns the meta object for class '{@link mancoosi.BasicCaseCondition <em>Basic Case Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Case Condition</em>'.
	 * @see mancoosi.BasicCaseCondition
	 * @generated
	 */
	EClass getBasicCaseCondition();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.BasicCaseCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mancoosi.BasicCaseCondition#getValue()
	 * @see #getBasicCaseCondition()
	 * @generated
	 */
	EAttribute getBasicCaseCondition_Value();

	/**
	 * Returns the meta object for class '{@link mancoosi.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see mancoosi.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see mancoosi.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
	 * @see mancoosi.If#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see mancoosi.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link mancoosi.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see mancoosi.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.BooleanExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mancoosi.BooleanExpression#getValue()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Value();

	/**
	 * Returns the meta object for class '{@link mancoosi.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see mancoosi.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.Return#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mancoosi.Return#getValue()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Value();

	/**
	 * Returns the meta object for class '{@link mancoosi.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see mancoosi.Iterator
	 * @generated
	 */
	EClass getIterator();

	/**
	 * Returns the meta object for class '{@link mancoosi.DirectoryIterator <em>Directory Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory Iterator</em>'.
	 * @see mancoosi.DirectoryIterator
	 * @generated
	 */
	EClass getDirectoryIterator();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.DirectoryIterator#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Directory</em>'.
	 * @see mancoosi.DirectoryIterator#getDirectory()
	 * @see #getDirectoryIterator()
	 * @generated
	 */
	EReference getDirectoryIterator_Directory();

	/**
	 * Returns the meta object for class '{@link mancoosi.FileContentIterator <em>File Content Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Content Iterator</em>'.
	 * @see mancoosi.FileContentIterator
	 * @generated
	 */
	EClass getFileContentIterator();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.FileContentIterator#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see mancoosi.FileContentIterator#getFile()
	 * @see #getFileContentIterator()
	 * @generated
	 */
	EReference getFileContentIterator_File();

	/**
	 * Returns the meta object for class '{@link mancoosi.InputParameterIterator <em>Input Parameter Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter Iterator</em>'.
	 * @see mancoosi.InputParameterIterator
	 * @generated
	 */
	EClass getInputParameterIterator();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.InputParameterIterator#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Parameters</em>'.
	 * @see mancoosi.InputParameterIterator#getInputParameters()
	 * @see #getInputParameterIterator()
	 * @generated
	 */
	EReference getInputParameterIterator_InputParameters();

	/**
	 * Returns the meta object for class '{@link mancoosi.EnumerationIterator <em>Enumeration Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Iterator</em>'.
	 * @see mancoosi.EnumerationIterator
	 * @generated
	 */
	EClass getEnumerationIterator();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.EnumerationIterator#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration</em>'.
	 * @see mancoosi.EnumerationIterator#getEnumeration()
	 * @see #getEnumerationIterator()
	 * @generated
	 */
	EReference getEnumerationIterator_Enumeration();

	/**
	 * Returns the meta object for class '{@link mancoosi.StringIterator <em>String Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Iterator</em>'.
	 * @see mancoosi.StringIterator
	 * @generated
	 */
	EClass getStringIterator();

	/**
	 * Returns the meta object for class '{@link mancoosi.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see mancoosi.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.Enumeration#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see mancoosi.Enumeration#getElements()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Elements();

	/**
	 * Returns the meta object for class '{@link mancoosi.EnumerationElement <em>Enumeration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Element</em>'.
	 * @see mancoosi.EnumerationElement
	 * @generated
	 */
	EClass getEnumerationElement();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.EnumerationElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see mancoosi.EnumerationElement#getIndex()
	 * @see #getEnumerationElement()
	 * @generated
	 */
	EAttribute getEnumerationElement_Index();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.EnumerationElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mancoosi.EnumerationElement#getValue()
	 * @see #getEnumerationElement()
	 * @generated
	 */
	EAttribute getEnumerationElement_Value();

	/**
	 * Returns the meta object for class '{@link mancoosi.FileSystemStatement <em>File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System Statement</em>'.
	 * @see mancoosi.FileSystemStatement
	 * @generated
	 */
	EClass getFileSystemStatement();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.FileSystemStatement#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Files</em>'.
	 * @see mancoosi.FileSystemStatement#getFiles()
	 * @see #getFileSystemStatement()
	 * @generated
	 */
	EReference getFileSystemStatement_Files();

	/**
	 * Returns the meta object for class '{@link mancoosi.AdditionFileSytemStatement <em>Addition File Sytem Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition File Sytem Statement</em>'.
	 * @see mancoosi.AdditionFileSytemStatement
	 * @generated
	 */
	EClass getAdditionFileSytemStatement();

	/**
	 * Returns the meta object for class '{@link mancoosi.DeletionFileSystemStatement <em>Deletion File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletion File System Statement</em>'.
	 * @see mancoosi.DeletionFileSystemStatement
	 * @generated
	 */
	EClass getDeletionFileSystemStatement();

	/**
	 * Returns the meta object for class '{@link mancoosi.UpdateFileSytemStatement <em>Update File Sytem Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update File Sytem Statement</em>'.
	 * @see mancoosi.UpdateFileSytemStatement
	 * @generated
	 */
	EClass getUpdateFileSytemStatement();

	/**
	 * Returns the meta object for class '{@link mancoosi.EnvironmentStatement <em>Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Statement</em>'.
	 * @see mancoosi.EnvironmentStatement
	 * @generated
	 */
	EClass getEnvironmentStatement();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.EnvironmentStatement#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see mancoosi.EnvironmentStatement#getEnvironment()
	 * @see #getEnvironmentStatement()
	 * @generated
	 */
	EReference getEnvironmentStatement_Environment();

	/**
	 * Returns the meta object for class '{@link mancoosi.AdditionEnvironmentStatement <em>Addition Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Environment Statement</em>'.
	 * @see mancoosi.AdditionEnvironmentStatement
	 * @generated
	 */
	EClass getAdditionEnvironmentStatement();

	/**
	 * Returns the meta object for class '{@link mancoosi.DeletionEnvironmentStatement <em>Deletion Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletion Environment Statement</em>'.
	 * @see mancoosi.DeletionEnvironmentStatement
	 * @generated
	 */
	EClass getDeletionEnvironmentStatement();

	/**
	 * Returns the meta object for class '{@link mancoosi.UpdateEnvironmentStatement <em>Update Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Environment Statement</em>'.
	 * @see mancoosi.UpdateEnvironmentStatement
	 * @generated
	 */
	EClass getUpdateEnvironmentStatement();

	/**
	 * Returns the meta object for class '{@link mancoosi.PackageSettingStatement <em>Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Setting Statement</em>'.
	 * @see mancoosi.PackageSettingStatement
	 * @generated
	 */
	EClass getPackageSettingStatement();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PackageSettingStatement#getPkgsetting <em>Pkgsetting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pkgsetting</em>'.
	 * @see mancoosi.PackageSettingStatement#getPkgsetting()
	 * @see #getPackageSettingStatement()
	 * @generated
	 */
	EReference getPackageSettingStatement_Pkgsetting();

	/**
	 * Returns the meta object for class '{@link mancoosi.AdditionPackageSettingStatement <em>Addition Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Package Setting Statement</em>'.
	 * @see mancoosi.AdditionPackageSettingStatement
	 * @generated
	 */
	EClass getAdditionPackageSettingStatement();

	/**
	 * Returns the meta object for class '{@link mancoosi.DeletionPackageSettingStatement <em>Deletion Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletion Package Setting Statement</em>'.
	 * @see mancoosi.DeletionPackageSettingStatement
	 * @generated
	 */
	EClass getDeletionPackageSettingStatement();

	/**
	 * Returns the meta object for class '{@link mancoosi.UpdatePackageSettingStatement <em>Update Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Package Setting Statement</em>'.
	 * @see mancoosi.UpdatePackageSettingStatement
	 * @generated
	 */
	EClass getUpdatePackageSettingStatement();

	/**
	 * Returns the meta object for class '{@link mancoosi.NeutralStatement <em>Neutral Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neutral Statement</em>'.
	 * @see mancoosi.NeutralStatement
	 * @generated
	 */
	EClass getNeutralStatement();

	/**
	 * Returns the meta object for class '{@link mancoosi.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see mancoosi.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for class '{@link mancoosi.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see mancoosi.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link mancoosi.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see mancoosi.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.Environment#getRunningServices <em>Running Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Running Services</em>'.
	 * @see mancoosi.Environment#getRunningServices()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_RunningServices();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.Environment#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see mancoosi.Environment#getAlternatives()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Alternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.Environment#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see mancoosi.Environment#getUsers()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.Environment#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see mancoosi.Environment#getGroups()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Groups();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Environment#getEmacspkg <em>Emacspkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Emacspkg</em>'.
	 * @see mancoosi.Environment#getEmacspkg()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Emacspkg();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Environment#getIconCache <em>Icon Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon Cache</em>'.
	 * @see mancoosi.Environment#getIconCache()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_IconCache();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Environment#getDesktopDb <em>Desktop Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desktop Db</em>'.
	 * @see mancoosi.Environment#getDesktopDb()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_DesktopDb();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Environment#getMimeTypeHandlerCache <em>Mime Type Handler Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mime Type Handler Cache</em>'.
	 * @see mancoosi.Environment#getMimeTypeHandlerCache()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_MimeTypeHandlerCache();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Environment#getLibraryCache <em>Library Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library Cache</em>'.
	 * @see mancoosi.Environment#getLibraryCache()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_LibraryCache();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Environment#getSkeeperCatalog <em>Skeeper Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Skeeper Catalog</em>'.
	 * @see mancoosi.Environment#getSkeeperCatalog()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_SkeeperCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Environment#getSgmlCatalog <em>Sgml Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sgml Catalog</em>'.
	 * @see mancoosi.Environment#getSgmlCatalog()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_SgmlCatalog();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.Environment#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Configuration</em>'.
	 * @see mancoosi.Environment#getConfiguration()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Configuration();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.Environment#getModuleCache <em>Module Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Cache</em>'.
	 * @see mancoosi.Environment#getModuleCache()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_ModuleCache();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.Environment#getXfontCaches <em>Xfont Caches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xfont Caches</em>'.
	 * @see mancoosi.Environment#getXfontCaches()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_XfontCaches();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Environment#getGconf <em>Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gconf</em>'.
	 * @see mancoosi.Environment#getGconf()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Gconf();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Environment#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Menu</em>'.
	 * @see mancoosi.Environment#getMenu()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Menu();

	/**
	 * Returns the meta object for class '{@link mancoosi.FileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System</em>'.
	 * @see mancoosi.FileSystem
	 * @generated
	 */
	EClass getFileSystem();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.FileSystem#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see mancoosi.FileSystem#getRoot()
	 * @see #getFileSystem()
	 * @generated
	 */
	EReference getFileSystem_Root();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.FileSystem#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Configuration</em>'.
	 * @see mancoosi.FileSystem#getConfiguration()
	 * @see #getFileSystem()
	 * @generated
	 */
	EReference getFileSystem_Configuration();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.FileSystem#getAllFiles <em>All Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Files</em>'.
	 * @see mancoosi.FileSystem#getAllFiles()
	 * @see #getFileSystem()
	 * @generated
	 */
	EReference getFileSystem_AllFiles();

	/**
	 * Returns the meta object for class '{@link mancoosi.GConf <em>GConf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GConf</em>'.
	 * @see mancoosi.GConf
	 * @generated
	 */
	EClass getGConf();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.GConf#getConfFiles <em>Conf Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conf Files</em>'.
	 * @see mancoosi.GConf#getConfFiles()
	 * @see #getGConf()
	 * @generated
	 */
	EReference getGConf_ConfFiles();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.GConf#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schemas</em>'.
	 * @see mancoosi.GConf#getSchemas()
	 * @see #getGConf()
	 * @generated
	 */
	EReference getGConf_Schemas();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.GConf#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.GConf#getEnv()
	 * @see #getGConf()
	 * @generated
	 */
	EReference getGConf_Env();

	/**
	 * Returns the meta object for class '{@link mancoosi.ApplicationMenuCatalog <em>Application Menu Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Menu Catalog</em>'.
	 * @see mancoosi.ApplicationMenuCatalog
	 * @generated
	 */
	EClass getApplicationMenuCatalog();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.ApplicationMenuCatalog#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Menu</em>'.
	 * @see mancoosi.ApplicationMenuCatalog#getMenu()
	 * @see #getApplicationMenuCatalog()
	 * @generated
	 */
	EReference getApplicationMenuCatalog_Menu();

	/**
	 * Returns the meta object for class '{@link mancoosi.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see mancoosi.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.Menu#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see mancoosi.Menu#getEntries()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Entries();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Menu#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog</em>'.
	 * @see mancoosi.Menu#getCatalog()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Catalog();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.Menu#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.Menu#getEnv()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Env();

	/**
	 * Returns the meta object for class '{@link mancoosi.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Entry</em>'.
	 * @see mancoosi.MenuEntry
	 * @generated
	 */
	EClass getMenuEntry();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.MenuEntry#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Menu</em>'.
	 * @see mancoosi.MenuEntry#getMenu()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EReference getMenuEntry_Menu();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.MenuEntry#getExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executable</em>'.
	 * @see mancoosi.MenuEntry#getExecutable()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EReference getMenuEntry_Executable();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.MenuEntry#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see mancoosi.MenuEntry#getParent()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EReference getMenuEntry_Parent();

	/**
	 * Returns the meta object for class '{@link mancoosi.Boot <em>Boot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boot</em>'.
	 * @see mancoosi.Boot
	 * @generated
	 */
	EClass getBoot();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.Boot#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see mancoosi.Boot#getServices()
	 * @see #getBoot()
	 * @generated
	 */
	EReference getBoot_Services();

	/**
	 * Returns the meta object for class '{@link mancoosi.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see mancoosi.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Service#getExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executable</em>'.
	 * @see mancoosi.Service#getExecutable()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Executable();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Service#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Env</em>'.
	 * @see mancoosi.Service#getEnv()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Env();

	/**
	 * Returns the meta object for class '{@link mancoosi.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see mancoosi.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.File#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see mancoosi.File#getExtension()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Extension();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.File#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mancoosi.File#getDescription()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Description();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.File#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see mancoosi.File#getSize()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.File#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see mancoosi.File#getCheckSum()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_CheckSum();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.File#isIsDirectory <em>Is Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Directory</em>'.
	 * @see mancoosi.File#isIsDirectory()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_IsDirectory();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.File#isSuid <em>Suid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suid</em>'.
	 * @see mancoosi.File#isSuid()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Suid();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.File#isGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see mancoosi.File#isGuid()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Guid();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.File#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see mancoosi.File#getPermission()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Permission();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.File#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see mancoosi.File#getLocation()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Location();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.File#getFs <em>Fs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fs</em>'.
	 * @see mancoosi.File#getFs()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Fs();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.File#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see mancoosi.File#getChilds()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Childs();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.File#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see mancoosi.File#getParent()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Parent();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.File#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see mancoosi.File#getOwner()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Owner();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.File#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see mancoosi.File#getGroup()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Group();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.File#isIsMissing <em>Is Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Missing</em>'.
	 * @see mancoosi.File#isIsMissing()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_IsMissing();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.File#getPkgSettings <em>Pkg Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pkg Settings</em>'.
	 * @see mancoosi.File#getPkgSettings()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_PkgSettings();

	/**
	 * Returns the meta object for class '{@link mancoosi.DocumentationFile <em>Documentation File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation File</em>'.
	 * @see mancoosi.DocumentationFile
	 * @generated
	 */
	EClass getDocumentationFile();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.DocumentationFile#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see mancoosi.DocumentationFile#getPkg()
	 * @see #getDocumentationFile()
	 * @generated
	 */
	EReference getDocumentationFile_Pkg();

	/**
	 * Returns the meta object for class '{@link mancoosi.InformationFile <em>Information File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information File</em>'.
	 * @see mancoosi.InformationFile
	 * @generated
	 */
	EClass getInformationFile();

	/**
	 * Returns the meta object for class '{@link mancoosi.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see mancoosi.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Alternative#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see mancoosi.Alternative#getCurrent()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Current();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Alternative#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see mancoosi.Alternative#getLocation()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Location();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.Alternative#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.Alternative#getEnv()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Env();

	/**
	 * Returns the meta object for class '{@link mancoosi.PackageSetting <em>Package Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Setting</em>'.
	 * @see mancoosi.PackageSetting
	 * @generated
	 */
	EClass getPackageSetting();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PackageSetting#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see mancoosi.PackageSetting#getServices()
	 * @see #getPackageSetting()
	 * @generated
	 */
	EReference getPackageSetting_Services();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PackageSetting#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Files</em>'.
	 * @see mancoosi.PackageSetting#getFiles()
	 * @see #getPackageSetting()
	 * @generated
	 */
	EReference getPackageSetting_Files();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.PackageSetting#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see mancoosi.PackageSetting#getPkg()
	 * @see #getPackageSetting()
	 * @generated
	 */
	EReference getPackageSetting_Pkg();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PackageSetting#getDependences <em>Dependences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependences</em>'.
	 * @see mancoosi.PackageSetting#getDependences()
	 * @see #getPackageSetting()
	 * @generated
	 */
	EReference getPackageSetting_Dependences();

	/**
	 * Returns the meta object for class '{@link mancoosi.IconCache <em>Icon Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Cache</em>'.
	 * @see mancoosi.IconCache
	 * @generated
	 */
	EClass getIconCache();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.IconCache#getMtime <em>Mtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mtime</em>'.
	 * @see mancoosi.IconCache#getMtime()
	 * @see #getIconCache()
	 * @generated
	 */
	EAttribute getIconCache_Mtime();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.IconCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.IconCache#getEnv()
	 * @see #getIconCache()
	 * @generated
	 */
	EReference getIconCache_Env();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.IconCache#getIcons <em>Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Icons</em>'.
	 * @see mancoosi.IconCache#getIcons()
	 * @see #getIconCache()
	 * @generated
	 */
	EReference getIconCache_Icons();

	/**
	 * Returns the meta object for class '{@link mancoosi.DesktopDB <em>Desktop DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desktop DB</em>'.
	 * @see mancoosi.DesktopDB
	 * @generated
	 */
	EClass getDesktopDB();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.DesktopDB#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.DesktopDB#getEnv()
	 * @see #getDesktopDB()
	 * @generated
	 */
	EReference getDesktopDB_Env();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.DesktopDB#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applications</em>'.
	 * @see mancoosi.DesktopDB#getApplications()
	 * @see #getDesktopDB()
	 * @generated
	 */
	EReference getDesktopDB_Applications();

	/**
	 * Returns the meta object for class '{@link mancoosi.MimeTypeHandlerCache <em>Mime Type Handler Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type Handler Cache</em>'.
	 * @see mancoosi.MimeTypeHandlerCache
	 * @generated
	 */
	EClass getMimeTypeHandlerCache();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.MimeTypeHandlerCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.MimeTypeHandlerCache#getEnv()
	 * @see #getMimeTypeHandlerCache()
	 * @generated
	 */
	EReference getMimeTypeHandlerCache_Env();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.MimeTypeHandlerCache#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see mancoosi.MimeTypeHandlerCache#getHandlers()
	 * @see #getMimeTypeHandlerCache()
	 * @generated
	 */
	EReference getMimeTypeHandlerCache_Handlers();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.MimeTypeHandlerCache#getMimeTypes <em>Mime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mime Types</em>'.
	 * @see mancoosi.MimeTypeHandlerCache#getMimeTypes()
	 * @see #getMimeTypeHandlerCache()
	 * @generated
	 */
	EReference getMimeTypeHandlerCache_MimeTypes();

	/**
	 * Returns the meta object for class '{@link mancoosi.MimeTypeHandler <em>Mime Type Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type Handler</em>'.
	 * @see mancoosi.MimeTypeHandler
	 * @generated
	 */
	EClass getMimeTypeHandler();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.MimeTypeHandler#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see mancoosi.MimeTypeHandler#getType()
	 * @see #getMimeTypeHandler()
	 * @generated
	 */
	EReference getMimeTypeHandler_Type();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.MimeTypeHandler#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cache</em>'.
	 * @see mancoosi.MimeTypeHandler#getCache()
	 * @see #getMimeTypeHandler()
	 * @generated
	 */
	EReference getMimeTypeHandler_Cache();

	/**
	 * Returns the meta object for class '{@link mancoosi.MimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type</em>'.
	 * @see mancoosi.MimeType
	 * @generated
	 */
	EClass getMimeType();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.MimeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mancoosi.MimeType#getName()
	 * @see #getMimeType()
	 * @generated
	 */
	EAttribute getMimeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.MimeType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see mancoosi.MimeType#getExtension()
	 * @see #getMimeType()
	 * @generated
	 */
	EAttribute getMimeType_Extension();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.MimeType#getMimeTypeHandlers <em>Mime Type Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mime Type Handlers</em>'.
	 * @see mancoosi.MimeType#getMimeTypeHandlers()
	 * @see #getMimeType()
	 * @generated
	 */
	EReference getMimeType_MimeTypeHandlers();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.MimeType#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cache</em>'.
	 * @see mancoosi.MimeType#getCache()
	 * @see #getMimeType()
	 * @generated
	 */
	EReference getMimeType_Cache();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.MimeTypeHandler#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handler</em>'.
	 * @see mancoosi.MimeTypeHandler#getHandler()
	 * @see #getMimeTypeHandler()
	 * @generated
	 */
	EReference getMimeTypeHandler_Handler();

	/**
	 * Returns the meta object for class '{@link mancoosi.XFontCache <em>XFont Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XFont Cache</em>'.
	 * @see mancoosi.XFontCache
	 * @generated
	 */
	EClass getXFontCache();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.XFontCache#getXfonts <em>Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xfonts</em>'.
	 * @see mancoosi.XFontCache#getXfonts()
	 * @see #getXFontCache()
	 * @generated
	 */
	EReference getXFontCache_Xfonts();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.XFontCache#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see mancoosi.XFontCache#getLocation()
	 * @see #getXFontCache()
	 * @generated
	 */
	EAttribute getXFontCache_Location();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.XFontCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.XFontCache#getEnv()
	 * @see #getXFontCache()
	 * @generated
	 */
	EReference getXFontCache_Env();

	/**
	 * Returns the meta object for class '{@link mancoosi.XFont <em>XFont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XFont</em>'.
	 * @see mancoosi.XFont
	 * @generated
	 */
	EClass getXFont();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.XFont#getXfontCache <em>Xfont Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Xfont Cache</em>'.
	 * @see mancoosi.XFont#getXfontCache()
	 * @see #getXFont()
	 * @generated
	 */
	EReference getXFont_XfontCache();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.XFont#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>File</em>'.
	 * @see mancoosi.XFont#getFile()
	 * @see #getXFont()
	 * @generated
	 */
	EReference getXFont_File();

	/**
	 * Returns the meta object for class '{@link mancoosi.LibraryCache <em>Library Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Cache</em>'.
	 * @see mancoosi.LibraryCache
	 * @generated
	 */
	EClass getLibraryCache();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.LibraryCache#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see mancoosi.LibraryCache#getLocations()
	 * @see #getLibraryCache()
	 * @generated
	 */
	EReference getLibraryCache_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.LibraryCache#getSharedLibraries <em>Shared Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Libraries</em>'.
	 * @see mancoosi.LibraryCache#getSharedLibraries()
	 * @see #getLibraryCache()
	 * @generated
	 */
	EReference getLibraryCache_SharedLibraries();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.LibraryCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.LibraryCache#getEnv()
	 * @see #getLibraryCache()
	 * @generated
	 */
	EReference getLibraryCache_Env();

	/**
	 * Returns the meta object for class '{@link mancoosi.SharedLibrary <em>Shared Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Library</em>'.
	 * @see mancoosi.SharedLibrary
	 * @generated
	 */
	EClass getSharedLibrary();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.SharedLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mancoosi.SharedLibrary#getName()
	 * @see #getSharedLibrary()
	 * @generated
	 */
	EAttribute getSharedLibrary_Name();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.SharedLibrary#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see mancoosi.SharedLibrary#getFile()
	 * @see #getSharedLibrary()
	 * @generated
	 */
	EReference getSharedLibrary_File();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.SharedLibrary#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mancoosi.SharedLibrary#getVersion()
	 * @see #getSharedLibrary()
	 * @generated
	 */
	EAttribute getSharedLibrary_Version();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.SharedLibrary#getLibraryCache <em>Library Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library Cache</em>'.
	 * @see mancoosi.SharedLibrary#getLibraryCache()
	 * @see #getSharedLibrary()
	 * @generated
	 */
	EReference getSharedLibrary_LibraryCache();

	/**
	 * Returns the meta object for class '{@link mancoosi.ModuleCache <em>Module Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Cache</em>'.
	 * @see mancoosi.ModuleCache
	 * @generated
	 */
	EClass getModuleCache();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.ModuleCache#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mancoosi.ModuleCache#getVersion()
	 * @see #getModuleCache()
	 * @generated
	 */
	EAttribute getModuleCache_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.ModuleCache#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see mancoosi.ModuleCache#getModules()
	 * @see #getModuleCache()
	 * @generated
	 */
	EReference getModuleCache_Modules();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.ModuleCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.ModuleCache#getEnv()
	 * @see #getModuleCache()
	 * @generated
	 */
	EReference getModuleCache_Env();

	/**
	 * Returns the meta object for class '{@link mancoosi.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see mancoosi.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Module#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see mancoosi.Module#getFile()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_File();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.Module#getModuleCache <em>Module Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module Cache</em>'.
	 * @see mancoosi.Module#getModuleCache()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModuleCache();

	/**
	 * Returns the meta object for class '{@link mancoosi.SGMLCatalog <em>SGML Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGML Catalog</em>'.
	 * @see mancoosi.SGMLCatalog
	 * @generated
	 */
	EClass getSGMLCatalog();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.SGMLCatalog#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.SGMLCatalog#getEnv()
	 * @see #getSGMLCatalog()
	 * @generated
	 */
	EReference getSGMLCatalog_Env();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.SGMLCatalog#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see mancoosi.SGMLCatalog#getDocuments()
	 * @see #getSGMLCatalog()
	 * @generated
	 */
	EReference getSGMLCatalog_Documents();

	/**
	 * Returns the meta object for class '{@link mancoosi.SGMLDocument <em>SGML Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGML Document</em>'.
	 * @see mancoosi.SGMLDocument
	 * @generated
	 */
	EClass getSGMLDocument();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.SGMLDocument#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see mancoosi.SGMLDocument#getLocation()
	 * @see #getSGMLDocument()
	 * @generated
	 */
	EReference getSGMLDocument_Location();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.SGMLDocument#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see mancoosi.SGMLDocument#getDocument()
	 * @see #getSGMLDocument()
	 * @generated
	 */
	EReference getSGMLDocument_Document();

	/**
	 * Returns the meta object for class '{@link mancoosi.SkeeperCatalog <em>Skeeper Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skeeper Catalog</em>'.
	 * @see mancoosi.SkeeperCatalog
	 * @generated
	 */
	EClass getSkeeperCatalog();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.SkeeperCatalog#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.SkeeperCatalog#getEnv()
	 * @see #getSkeeperCatalog()
	 * @generated
	 */
	EReference getSkeeperCatalog_Env();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.SkeeperCatalog#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see mancoosi.SkeeperCatalog#getDocuments()
	 * @see #getSkeeperCatalog()
	 * @generated
	 */
	EReference getSkeeperCatalog_Documents();

	/**
	 * Returns the meta object for class '{@link mancoosi.SkeeperDocument <em>Skeeper Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skeeper Document</em>'.
	 * @see mancoosi.SkeeperDocument
	 * @generated
	 */
	EClass getSkeeperDocument();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.SkeeperDocument#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see mancoosi.SkeeperDocument#getLocation()
	 * @see #getSkeeperDocument()
	 * @generated
	 */
	EReference getSkeeperDocument_Location();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.SkeeperDocument#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see mancoosi.SkeeperDocument#getDocument()
	 * @see #getSkeeperDocument()
	 * @generated
	 */
	EReference getSkeeperDocument_Document();

	/**
	 * Returns the meta object for class '{@link mancoosi.EmacsPackage <em>Emacs Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emacs Package</em>'.
	 * @see mancoosi.EmacsPackage
	 * @generated
	 */
	EClass getEmacsPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.EmacsPackage#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see mancoosi.EmacsPackage#getFiles()
	 * @see #getEmacsPackage()
	 * @generated
	 */
	EReference getEmacsPackage_Files();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.EmacsPackage#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.EmacsPackage#getEnv()
	 * @see #getEmacsPackage()
	 * @generated
	 */
	EReference getEmacsPackage_Env();

	/**
	 * Returns the meta object for class '{@link mancoosi.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see mancoosi.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.User#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.User#getEnv()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Env();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.User#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see mancoosi.User#getGroups()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Groups();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.User#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Home</em>'.
	 * @see mancoosi.User#getHome()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Home();

	/**
	 * Returns the meta object for class '{@link mancoosi.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see mancoosi.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.Group#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see mancoosi.Group#getEnv()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Env();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.Group#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see mancoosi.Group#getUsers()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Users();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstDesktop <em>Postinst Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Desktop</em>'.
	 * @see mancoosi.PostinstDesktop
	 * @generated
	 */
	EClass getPostinstDesktop();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstDocBase <em>Postinst Doc Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Doc Base</em>'.
	 * @see mancoosi.PostinstDocBase
	 * @generated
	 */
	EClass getPostinstDocBase();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstDocBase#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see mancoosi.PostinstDocBase#getDocument()
	 * @see #getPostinstDocBase()
	 * @generated
	 */
	EReference getPostinstDocBase_Document();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstEmacsen <em>Postinst Emacsen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Emacsen</em>'.
	 * @see mancoosi.PostinstEmacsen
	 * @generated
	 */
	EClass getPostinstEmacsen();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstEmacsen#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see mancoosi.PostinstEmacsen#getPackage()
	 * @see #getPostinstEmacsen()
	 * @generated
	 */
	EReference getPostinstEmacsen_Package();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstGconf <em>Postinst Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Gconf</em>'.
	 * @see mancoosi.PostinstGconf
	 * @generated
	 */
	EClass getPostinstGconf();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PostinstGconf#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schemas</em>'.
	 * @see mancoosi.PostinstGconf#getSchemas()
	 * @see #getPostinstGconf()
	 * @generated
	 */
	EReference getPostinstGconf_Schemas();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstGconfDefaults <em>Postinst Gconf Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Gconf Defaults</em>'.
	 * @see mancoosi.PostinstGconfDefaults
	 * @generated
	 */
	EClass getPostinstGconfDefaults();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstIcons <em>Postinst Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Icons</em>'.
	 * @see mancoosi.PostinstIcons
	 * @generated
	 */
	EClass getPostinstIcons();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PostinstIcons#getDirectories <em>Directories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directories</em>'.
	 * @see mancoosi.PostinstIcons#getDirectories()
	 * @see #getPostinstIcons()
	 * @generated
	 */
	EReference getPostinstIcons_Directories();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstInfo <em>Postinst Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Info</em>'.
	 * @see mancoosi.PostinstInfo
	 * @generated
	 */
	EClass getPostinstInfo();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstInfo#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see mancoosi.PostinstInfo#getFile()
	 * @see #getPostinstInfo()
	 * @generated
	 */
	EReference getPostinstInfo_File();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstInit <em>Postinst Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Init</em>'.
	 * @see mancoosi.PostinstInit
	 * @generated
	 */
	EClass getPostinstInit();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstInit#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script Param</em>'.
	 * @see mancoosi.PostinstInit#getScriptParam()
	 * @see #getPostinstInit()
	 * @generated
	 */
	EReference getPostinstInit_ScriptParam();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PostinstInit#getInitParams <em>Init Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Init Params</em>'.
	 * @see mancoosi.PostinstInit#getInitParams()
	 * @see #getPostinstInit()
	 * @generated
	 */
	EReference getPostinstInit_InitParams();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstInitNostart <em>Postinst Init Nostart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Init Nostart</em>'.
	 * @see mancoosi.PostinstInitNostart
	 * @generated
	 */
	EClass getPostinstInitNostart();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstInitNostart#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script Param</em>'.
	 * @see mancoosi.PostinstInitNostart#getScriptParam()
	 * @see #getPostinstInitNostart()
	 * @generated
	 */
	EReference getPostinstInitNostart_ScriptParam();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PostinstInitNostart#getInitParams <em>Init Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Init Params</em>'.
	 * @see mancoosi.PostinstInitNostart#getInitParams()
	 * @see #getPostinstInitNostart()
	 * @generated
	 */
	EReference getPostinstInitNostart_InitParams();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstInitNostart#getErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Handler</em>'.
	 * @see mancoosi.PostinstInitNostart#getErrorHandler()
	 * @see #getPostinstInitNostart()
	 * @generated
	 */
	EReference getPostinstInitNostart_ErrorHandler();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstInitRestart <em>Postinst Init Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Init Restart</em>'.
	 * @see mancoosi.PostinstInitRestart
	 * @generated
	 */
	EClass getPostinstInitRestart();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstInitRestart#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script Param</em>'.
	 * @see mancoosi.PostinstInitRestart#getScriptParam()
	 * @see #getPostinstInitRestart()
	 * @generated
	 */
	EReference getPostinstInitRestart_ScriptParam();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PostinstInitRestart#getInitParams <em>Init Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Init Params</em>'.
	 * @see mancoosi.PostinstInitRestart#getInitParams()
	 * @see #getPostinstInitRestart()
	 * @generated
	 */
	EReference getPostinstInitRestart_InitParams();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstInitRestart#getErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Handler</em>'.
	 * @see mancoosi.PostinstInitRestart#getErrorHandler()
	 * @see #getPostinstInitRestart()
	 * @generated
	 */
	EReference getPostinstInitRestart_ErrorHandler();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstMakeshlibs <em>Postinst Makeshlibs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Makeshlibs</em>'.
	 * @see mancoosi.PostinstMakeshlibs
	 * @generated
	 */
	EClass getPostinstMakeshlibs();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstMenu <em>Postinst Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Menu</em>'.
	 * @see mancoosi.PostinstMenu
	 * @generated
	 */
	EClass getPostinstMenu();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstMenuMethod <em>Postinst Menu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Menu Method</em>'.
	 * @see mancoosi.PostinstMenuMethod
	 * @generated
	 */
	EClass getPostinstMenuMethod();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstMenuMethod#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see mancoosi.PostinstMenuMethod#getPackage()
	 * @see #getPostinstMenuMethod()
	 * @generated
	 */
	EReference getPostinstMenuMethod_Package();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstMime <em>Postinst Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Mime</em>'.
	 * @see mancoosi.PostinstMime
	 * @generated
	 */
	EClass getPostinstMime();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstModules <em>Postinst Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Modules</em>'.
	 * @see mancoosi.PostinstModules
	 * @generated
	 */
	EClass getPostinstModules();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstModules#getKvers <em>Kvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kvers</em>'.
	 * @see mancoosi.PostinstModules#getKvers()
	 * @see #getPostinstModules()
	 * @generated
	 */
	EReference getPostinstModules_Kvers();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstPython <em>Postinst Python</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Python</em>'.
	 * @see mancoosi.PostinstPython
	 * @generated
	 */
	EClass getPostinstPython();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstPython#getPyver <em>Pyver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pyver</em>'.
	 * @see mancoosi.PostinstPython#getPyver()
	 * @see #getPostinstPython()
	 * @generated
	 */
	EReference getPostinstPython_Pyver();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PostinstPython#getDirlist <em>Dirlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dirlist</em>'.
	 * @see mancoosi.PostinstPython#getDirlist()
	 * @see #getPostinstPython()
	 * @generated
	 */
	EReference getPostinstPython_Dirlist();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstScrollkeeper <em>Postinst Scrollkeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Scrollkeeper</em>'.
	 * @see mancoosi.PostinstScrollkeeper
	 * @generated
	 */
	EClass getPostinstScrollkeeper();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstSgmlcatalog <em>Postinst Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Sgmlcatalog</em>'.
	 * @see mancoosi.PostinstSgmlcatalog
	 * @generated
	 */
	EClass getPostinstSgmlcatalog();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstSgmlcatalog#getCentralcat <em>Centralcat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Centralcat</em>'.
	 * @see mancoosi.PostinstSgmlcatalog#getCentralcat()
	 * @see #getPostinstSgmlcatalog()
	 * @generated
	 */
	EReference getPostinstSgmlcatalog_Centralcat();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstSgmlcatalog#getOrdcats <em>Ordcats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ordcats</em>'.
	 * @see mancoosi.PostinstSgmlcatalog#getOrdcats()
	 * @see #getPostinstSgmlcatalog()
	 * @generated
	 */
	EReference getPostinstSgmlcatalog_Ordcats();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstSharedmimeinfo <em>Postinst Sharedmimeinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Sharedmimeinfo</em>'.
	 * @see mancoosi.PostinstSharedmimeinfo
	 * @generated
	 */
	EClass getPostinstSharedmimeinfo();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstSuid <em>Postinst Suid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Suid</em>'.
	 * @see mancoosi.PostinstSuid
	 * @generated
	 */
	EClass getPostinstSuid();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstSuid#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see mancoosi.PostinstSuid#getPackage()
	 * @see #getPostinstSuid()
	 * @generated
	 */
	EReference getPostinstSuid_Package();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstSuid#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see mancoosi.PostinstSuid#getFile()
	 * @see #getPostinstSuid()
	 * @generated
	 */
	EReference getPostinstSuid_File();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstSuid#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see mancoosi.PostinstSuid#getOwner()
	 * @see #getPostinstSuid()
	 * @generated
	 */
	EReference getPostinstSuid_Owner();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstSuid#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see mancoosi.PostinstSuid#getGroup()
	 * @see #getPostinstSuid()
	 * @generated
	 */
	EReference getPostinstSuid_Group();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstSuid#getPerms <em>Perms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perms</em>'.
	 * @see mancoosi.PostinstSuid#getPerms()
	 * @see #getPostinstSuid()
	 * @generated
	 */
	EReference getPostinstSuid_Perms();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstUdev <em>Postinst Udev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Udev</em>'.
	 * @see mancoosi.PostinstUdev
	 * @generated
	 */
	EClass getPostinstUdev();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstUdev#getOld <em>Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old</em>'.
	 * @see mancoosi.PostinstUdev#getOld()
	 * @see #getPostinstUdev()
	 * @generated
	 */
	EReference getPostinstUdev_Old();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstUdev#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see mancoosi.PostinstUdev#getRule()
	 * @see #getPostinstUdev()
	 * @generated
	 */
	EReference getPostinstUdev_Rule();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstUsrlocal <em>Postinst Usrlocal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Usrlocal</em>'.
	 * @see mancoosi.PostinstUsrlocal
	 * @generated
	 */
	EClass getPostinstUsrlocal();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstUsrlocal#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir</em>'.
	 * @see mancoosi.PostinstUsrlocal#getDir()
	 * @see #getPostinstUsrlocal()
	 * @generated
	 */
	EReference getPostinstUsrlocal_Dir();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstUsrlocal#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode</em>'.
	 * @see mancoosi.PostinstUsrlocal#getMode()
	 * @see #getPostinstUsrlocal()
	 * @generated
	 */
	EReference getPostinstUsrlocal_Mode();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstUsrlocal#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see mancoosi.PostinstUsrlocal#getUser()
	 * @see #getPostinstUsrlocal()
	 * @generated
	 */
	EReference getPostinstUsrlocal_User();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstUsrlocal#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see mancoosi.PostinstUsrlocal#getGroup()
	 * @see #getPostinstUsrlocal()
	 * @generated
	 */
	EReference getPostinstUsrlocal_Group();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstWm <em>Postinst Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Wm</em>'.
	 * @see mancoosi.PostinstWm
	 * @generated
	 */
	EClass getPostinstWm();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstWm#getWm <em>Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wm</em>'.
	 * @see mancoosi.PostinstWm#getWm()
	 * @see #getPostinstWm()
	 * @generated
	 */
	EReference getPostinstWm_Wm();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstWm#getWmman <em>Wmman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wmman</em>'.
	 * @see mancoosi.PostinstWm#getWmman()
	 * @see #getPostinstWm()
	 * @generated
	 */
	EReference getPostinstWm_Wmman();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstWm#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Priority</em>'.
	 * @see mancoosi.PostinstWm#getPriority()
	 * @see #getPostinstWm()
	 * @generated
	 */
	EReference getPostinstWm_Priority();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstWmNoman <em>Postinst Wm Noman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Wm Noman</em>'.
	 * @see mancoosi.PostinstWmNoman
	 * @generated
	 */
	EClass getPostinstWmNoman();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstWmNoman#getWm <em>Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wm</em>'.
	 * @see mancoosi.PostinstWmNoman#getWm()
	 * @see #getPostinstWmNoman()
	 * @generated
	 */
	EReference getPostinstWmNoman_Wm();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostinstWmNoman#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Priority</em>'.
	 * @see mancoosi.PostinstWmNoman#getPriority()
	 * @see #getPostinstWmNoman()
	 * @generated
	 */
	EReference getPostinstWmNoman_Priority();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostinstXfonts <em>Postinst Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Xfonts</em>'.
	 * @see mancoosi.PostinstXfonts
	 * @generated
	 */
	EClass getPostinstXfonts();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PostinstXfonts#getCmds <em>Cmds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cmds</em>'.
	 * @see mancoosi.PostinstXfonts#getCmds()
	 * @see #getPostinstXfonts()
	 * @generated
	 */
	EReference getPostinstXfonts_Cmds();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmDebconf <em>Postrm Debconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Debconf</em>'.
	 * @see mancoosi.PostrmDebconf
	 * @generated
	 */
	EClass getPostrmDebconf();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmDesktop <em>Postrm Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Desktop</em>'.
	 * @see mancoosi.PostrmDesktop
	 * @generated
	 */
	EClass getPostrmDesktop();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmGconf <em>Postrm Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Gconf</em>'.
	 * @see mancoosi.PostrmGconf
	 * @generated
	 */
	EClass getPostrmGconf();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PostrmGconf#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schemas</em>'.
	 * @see mancoosi.PostrmGconf#getSchemas()
	 * @see #getPostrmGconf()
	 * @generated
	 */
	EReference getPostrmGconf_Schemas();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmGconfDefaults <em>Postrm Gconf Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Gconf Defaults</em>'.
	 * @see mancoosi.PostrmGconfDefaults
	 * @generated
	 */
	EClass getPostrmGconfDefaults();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmIcons <em>Postrm Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Icons</em>'.
	 * @see mancoosi.PostrmIcons
	 * @generated
	 */
	EClass getPostrmIcons();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PostrmIcons#getDirs <em>Dirs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dirs</em>'.
	 * @see mancoosi.PostrmIcons#getDirs()
	 * @see #getPostrmIcons()
	 * @generated
	 */
	EReference getPostrmIcons_Dirs();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmInit <em>Postrm Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Init</em>'.
	 * @see mancoosi.PostrmInit
	 * @generated
	 */
	EClass getPostrmInit();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostrmInit#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script Param</em>'.
	 * @see mancoosi.PostrmInit#getScriptParam()
	 * @see #getPostrmInit()
	 * @generated
	 */
	EReference getPostrmInit_ScriptParam();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmMakeshlibs <em>Postrm Makeshlibs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Makeshlibs</em>'.
	 * @see mancoosi.PostrmMakeshlibs
	 * @generated
	 */
	EClass getPostrmMakeshlibs();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmMenu <em>Postrm Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Menu</em>'.
	 * @see mancoosi.PostrmMenu
	 * @generated
	 */
	EClass getPostrmMenu();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmMenuMethod <em>Postrm Menu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Menu Method</em>'.
	 * @see mancoosi.PostrmMenuMethod
	 * @generated
	 */
	EClass getPostrmMenuMethod();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostrmMenuMethod#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see mancoosi.PostrmMenuMethod#getPackage()
	 * @see #getPostrmMenuMethod()
	 * @generated
	 */
	EReference getPostrmMenuMethod_Package();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmMime <em>Postrm Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Mime</em>'.
	 * @see mancoosi.PostrmMime
	 * @generated
	 */
	EClass getPostrmMime();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmModules <em>Postrm Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Modules</em>'.
	 * @see mancoosi.PostrmModules
	 * @generated
	 */
	EClass getPostrmModules();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostrmModules#getKvers <em>Kvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kvers</em>'.
	 * @see mancoosi.PostrmModules#getKvers()
	 * @see #getPostrmModules()
	 * @generated
	 */
	EReference getPostrmModules_Kvers();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmScrollkeeper <em>Postrm Scrollkeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Scrollkeeper</em>'.
	 * @see mancoosi.PostrmScrollkeeper
	 * @generated
	 */
	EClass getPostrmScrollkeeper();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmSgmlcatalog <em>Postrm Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Sgmlcatalog</em>'.
	 * @see mancoosi.PostrmSgmlcatalog
	 * @generated
	 */
	EClass getPostrmSgmlcatalog();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostrmSgmlcatalog#getCentralcat <em>Centralcat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Centralcat</em>'.
	 * @see mancoosi.PostrmSgmlcatalog#getCentralcat()
	 * @see #getPostrmSgmlcatalog()
	 * @generated
	 */
	EReference getPostrmSgmlcatalog_Centralcat();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmSharedmimeinfo <em>Postrm Sharedmimeinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Sharedmimeinfo</em>'.
	 * @see mancoosi.PostrmSharedmimeinfo
	 * @generated
	 */
	EClass getPostrmSharedmimeinfo();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmSuid <em>Postrm Suid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Suid</em>'.
	 * @see mancoosi.PostrmSuid
	 * @generated
	 */
	EClass getPostrmSuid();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostrmSuid#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see mancoosi.PostrmSuid#getPackage()
	 * @see #getPostrmSuid()
	 * @generated
	 */
	EReference getPostrmSuid_Package();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PostrmSuid#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see mancoosi.PostrmSuid#getFile()
	 * @see #getPostrmSuid()
	 * @generated
	 */
	EReference getPostrmSuid_File();

	/**
	 * Returns the meta object for class '{@link mancoosi.PostrmXfonts <em>Postrm Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Xfonts</em>'.
	 * @see mancoosi.PostrmXfonts
	 * @generated
	 */
	EClass getPostrmXfonts();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PostrmXfonts#getCmds <em>Cmds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cmds</em>'.
	 * @see mancoosi.PostrmXfonts#getCmds()
	 * @see #getPostrmXfonts()
	 * @generated
	 */
	EReference getPostrmXfonts_Cmds();

	/**
	 * Returns the meta object for class '{@link mancoosi.PreinstUdev <em>Preinst Udev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preinst Udev</em>'.
	 * @see mancoosi.PreinstUdev
	 * @generated
	 */
	EClass getPreinstUdev();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PreinstUdev#getOld <em>Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old</em>'.
	 * @see mancoosi.PreinstUdev#getOld()
	 * @see #getPreinstUdev()
	 * @generated
	 */
	EReference getPreinstUdev_Old();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PreinstUdev#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see mancoosi.PreinstUdev#getRule()
	 * @see #getPreinstUdev()
	 * @generated
	 */
	EReference getPreinstUdev_Rule();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PreinstUdev#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see mancoosi.PreinstUdev#getPackage()
	 * @see #getPreinstUdev()
	 * @generated
	 */
	EReference getPreinstUdev_Package();

	/**
	 * Returns the meta object for class '{@link mancoosi.PreinstUser <em>Preinst User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preinst User</em>'.
	 * @see mancoosi.PreinstUser
	 * @generated
	 */
	EClass getPreinstUser();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PreinstUser#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir</em>'.
	 * @see mancoosi.PreinstUser#getDir()
	 * @see #getPreinstUser()
	 * @generated
	 */
	EReference getPreinstUser_Dir();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PreinstUser#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode</em>'.
	 * @see mancoosi.PreinstUser#getMode()
	 * @see #getPreinstUser()
	 * @generated
	 */
	EReference getPreinstUser_Mode();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PreinstUser#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see mancoosi.PreinstUser#getUser()
	 * @see #getPreinstUser()
	 * @generated
	 */
	EReference getPreinstUser_User();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PreinstUser#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see mancoosi.PreinstUser#getGroup()
	 * @see #getPreinstUser()
	 * @generated
	 */
	EReference getPreinstUser_Group();

	/**
	 * Returns the meta object for class '{@link mancoosi.PrermDocBase <em>Prerm Doc Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Doc Base</em>'.
	 * @see mancoosi.PrermDocBase
	 * @generated
	 */
	EClass getPrermDocBase();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PrermDocBase#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Doc</em>'.
	 * @see mancoosi.PrermDocBase#getDoc()
	 * @see #getPrermDocBase()
	 * @generated
	 */
	EReference getPrermDocBase_Doc();

	/**
	 * Returns the meta object for class '{@link mancoosi.PrermEmacsen <em>Prerm Emacsen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Emacsen</em>'.
	 * @see mancoosi.PrermEmacsen
	 * @generated
	 */
	EClass getPrermEmacsen();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PrermEmacsen#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see mancoosi.PrermEmacsen#getPackage()
	 * @see #getPrermEmacsen()
	 * @generated
	 */
	EReference getPrermEmacsen_Package();

	/**
	 * Returns the meta object for class '{@link mancoosi.PrermGconf <em>Prerm Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Gconf</em>'.
	 * @see mancoosi.PrermGconf
	 * @generated
	 */
	EClass getPrermGconf();

	/**
	 * Returns the meta object for the reference list '{@link mancoosi.PrermGconf#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schemas</em>'.
	 * @see mancoosi.PrermGconf#getSchemas()
	 * @see #getPrermGconf()
	 * @generated
	 */
	EReference getPrermGconf_Schemas();

	/**
	 * Returns the meta object for class '{@link mancoosi.PrermInfo <em>Prerm Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Info</em>'.
	 * @see mancoosi.PrermInfo
	 * @generated
	 */
	EClass getPrermInfo();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PrermInfo#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see mancoosi.PrermInfo#getFile()
	 * @see #getPrermInfo()
	 * @generated
	 */
	EReference getPrermInfo_File();

	/**
	 * Returns the meta object for class '{@link mancoosi.PrermInit <em>Prerm Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Init</em>'.
	 * @see mancoosi.PrermInit
	 * @generated
	 */
	EClass getPrermInit();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PrermInit#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script Param</em>'.
	 * @see mancoosi.PrermInit#getScriptParam()
	 * @see #getPrermInit()
	 * @generated
	 */
	EReference getPrermInit_ScriptParam();

	/**
	 * Returns the meta object for class '{@link mancoosi.PrermInitNorestart <em>Prerm Init Norestart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Init Norestart</em>'.
	 * @see mancoosi.PrermInitNorestart
	 * @generated
	 */
	EClass getPrermInitNorestart();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PrermInitNorestart#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script Param</em>'.
	 * @see mancoosi.PrermInitNorestart#getScriptParam()
	 * @see #getPrermInitNorestart()
	 * @generated
	 */
	EReference getPrermInitNorestart_ScriptParam();

	/**
	 * Returns the meta object for class '{@link mancoosi.PrermPython <em>Prerm Python</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Python</em>'.
	 * @see mancoosi.PrermPython
	 * @generated
	 */
	EClass getPrermPython();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PrermPython#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see mancoosi.PrermPython#getPackage()
	 * @see #getPrermPython()
	 * @generated
	 */
	EReference getPrermPython_Package();

	/**
	 * Returns the meta object for class '{@link mancoosi.PrermSgmlcatalog <em>Prerm Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Sgmlcatalog</em>'.
	 * @see mancoosi.PrermSgmlcatalog
	 * @generated
	 */
	EClass getPrermSgmlcatalog();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PrermSgmlcatalog#getCentralcat <em>Centralcat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Centralcat</em>'.
	 * @see mancoosi.PrermSgmlcatalog#getCentralcat()
	 * @see #getPrermSgmlcatalog()
	 * @generated
	 */
	EReference getPrermSgmlcatalog_Centralcat();

	/**
	 * Returns the meta object for class '{@link mancoosi.PrermUsrlocal <em>Prerm Usrlocal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Usrlocal</em>'.
	 * @see mancoosi.PrermUsrlocal
	 * @generated
	 */
	EClass getPrermUsrlocal();

	/**
	 * Returns the meta object for class '{@link mancoosi.PrermWm <em>Prerm Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Wm</em>'.
	 * @see mancoosi.PrermWm
	 * @generated
	 */
	EClass getPrermWm();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.PrermWm#getWm <em>Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wm</em>'.
	 * @see mancoosi.PrermWm#getWm()
	 * @see #getPrermWm()
	 * @generated
	 */
	EReference getPrermWm_Wm();

	/**
	 * Returns the meta object for class '{@link mancoosi.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see mancoosi.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.Param#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mancoosi.Param#getValue()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Value();

	/**
	 * Returns the meta object for class '{@link mancoosi.StringParam <em>String Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Param</em>'.
	 * @see mancoosi.StringParam
	 * @generated
	 */
	EClass getStringParam();

	/**
	 * Returns the meta object for class '{@link mancoosi.IntParam <em>Int Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Param</em>'.
	 * @see mancoosi.IntParam
	 * @generated
	 */
	EClass getIntParam();

	/**
	 * Returns the meta object for class '{@link mancoosi.SingleConflict <em>Single Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Conflict</em>'.
	 * @see mancoosi.SingleConflict
	 * @generated
	 */
	EClass getSingleConflict();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.SingleConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conflict</em>'.
	 * @see mancoosi.SingleConflict#getConflict()
	 * @see #getSingleConflict()
	 * @generated
	 */
	EReference getSingleConflict_Conflict();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.SingleConflict#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mancoosi.SingleConflict#getVersion()
	 * @see #getSingleConflict()
	 * @generated
	 */
	EAttribute getSingleConflict_Version();

	/**
	 * Returns the meta object for the attribute '{@link mancoosi.SingleConflict#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mancoosi.SingleConflict#getValue()
	 * @see #getSingleConflict()
	 * @generated
	 */
	EAttribute getSingleConflict_Value();

	/**
	 * Returns the meta object for class '{@link mancoosi.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict</em>'.
	 * @see mancoosi.Conflict
	 * @generated
	 */
	EClass getConflict();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Conflict#getAndConflict <em>And Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And Conflict</em>'.
	 * @see mancoosi.Conflict#getAndConflict()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_AndConflict();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Conflict#getOrConflict <em>Or Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or Conflict</em>'.
	 * @see mancoosi.Conflict#getOrConflict()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_OrConflict();

	/**
	 * Returns the meta object for the containment reference '{@link mancoosi.Conflict#getSingleConflict <em>Single Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Conflict</em>'.
	 * @see mancoosi.Conflict#getSingleConflict()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_SingleConflict();

	/**
	 * Returns the meta object for the reference '{@link mancoosi.Conflict#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pkg</em>'.
	 * @see mancoosi.Conflict#getPkg()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_Pkg();

	/**
	 * Returns the meta object for class '{@link mancoosi.AndConflict <em>And Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Conflict</em>'.
	 * @see mancoosi.AndConflict
	 * @generated
	 */
	EClass getAndConflict();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.AndConflict#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see mancoosi.AndConflict#getOps()
	 * @see #getAndConflict()
	 * @generated
	 */
	EReference getAndConflict_Ops();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.AndConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conflict</em>'.
	 * @see mancoosi.AndConflict#getConflict()
	 * @see #getAndConflict()
	 * @generated
	 */
	EReference getAndConflict_Conflict();

	/**
	 * Returns the meta object for class '{@link mancoosi.OrConflict <em>Or Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Conflict</em>'.
	 * @see mancoosi.OrConflict
	 * @generated
	 */
	EClass getOrConflict();

	/**
	 * Returns the meta object for the containment reference list '{@link mancoosi.OrConflict#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see mancoosi.OrConflict#getOps()
	 * @see #getOrConflict()
	 * @generated
	 */
	EReference getOrConflict_Ops();

	/**
	 * Returns the meta object for the container reference '{@link mancoosi.OrConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conflict</em>'.
	 * @see mancoosi.OrConflict#getConflict()
	 * @see #getOrConflict()
	 * @generated
	 */
	EReference getOrConflict_Conflict();

	/**
	 * Returns the meta object for enum '{@link mancoosi.PriorityType <em>Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority Type</em>'.
	 * @see mancoosi.PriorityType
	 * @generated
	 */
	EEnum getPriorityType();

	/**
	 * Returns the meta object for enum '{@link mancoosi.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Type</em>'.
	 * @see mancoosi.StatusType
	 * @generated
	 */
	EEnum getStatusType();

	/**
	 * Returns the meta object for enum '{@link mancoosi.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version Type</em>'.
	 * @see mancoosi.VersionType
	 * @generated
	 */
	EEnum getVersionType();

	/**
	 * Returns the meta object for enum '{@link mancoosi.ReturnStatementValue <em>Return Statement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Return Statement Value</em>'.
	 * @see mancoosi.ReturnStatementValue
	 * @generated
	 */
	EEnum getReturnStatementValue();

	/**
	 * Returns the meta object for enum '{@link mancoosi.CasePrermConditionValue <em>Case Prerm Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Prerm Condition Value</em>'.
	 * @see mancoosi.CasePrermConditionValue
	 * @generated
	 */
	EEnum getCasePrermConditionValue();

	/**
	 * Returns the meta object for enum '{@link mancoosi.CasePostrmConditionValue <em>Case Postrm Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Postrm Condition Value</em>'.
	 * @see mancoosi.CasePostrmConditionValue
	 * @generated
	 */
	EEnum getCasePostrmConditionValue();

	/**
	 * Returns the meta object for enum '{@link mancoosi.CasePreinstConditionValue <em>Case Preinst Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Preinst Condition Value</em>'.
	 * @see mancoosi.CasePreinstConditionValue
	 * @generated
	 */
	EEnum getCasePreinstConditionValue();

	/**
	 * Returns the meta object for enum '{@link mancoosi.CasePostinstConditionValue <em>Case Postinst Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Postinst Condition Value</em>'.
	 * @see mancoosi.CasePostinstConditionValue
	 * @generated
	 */
	EEnum getCasePostinstConditionValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MancoosiFactory getMancoosiFactory();

} //MancoosiPackage
