/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

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
 * @see it.univaq.mancoosi.mancoosimm.MancoosiFactory
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
	String eNAME = "mancoosimm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mancoosimm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mancoosimm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MancoosiPackage eINSTANCE = it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.NamedElementImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getConfiguration()
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
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CREATION_TIME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__SYSTEM_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__FILE_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENVIRONMENT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Installed Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INSTALLED_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Not Installed Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NOT_INSTALLED_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Config Files Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONFIG_FILES_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unpacked Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__UNPACKED_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Half Configured Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__HALF_CONFIGURED_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Half Installed Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__HALF_INSTALLED_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.PackageImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 2;

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
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ARCHITECTURE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl <em>Installed Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getInstalledPackage()
	 * @generated
	 */
	int INSTALLED_PACKAGE = 3;

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
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__ARCHITECTURE = PACKAGE__ARCHITECTURE;

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
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__FILE_SIZE = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__CHECK_SUM = PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__DESCRIPTION = PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__SECTION = PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__TAG = PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__PRIORITY = PACKAGE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__UPLOADERS = PACKAGE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Source Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__SOURCE_PACKAGE = PACKAGE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__DEPENDS = PACKAGE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Recommends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__RECOMMENDS = PACKAGE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Suggests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__SUGGESTS = PACKAGE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Enhances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__ENHANCES = PACKAGE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Predepends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__PREDEPENDS = PACKAGE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__PROVIDES = PACKAGE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Replaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__REPLACES = PACKAGE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__FILES = PACKAGE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Documentation Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__DOCUMENTATION_FILES = PACKAGE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE__CONFLICT = PACKAGE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Installed Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLED_PACKAGE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.NotInstalledPackageImpl <em>Not Installed Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.NotInstalledPackageImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getNotInstalledPackage()
	 * @generated
	 */
	int NOT_INSTALLED_PACKAGE = 4;

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
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INSTALLED_PACKAGE__ARCHITECTURE = PACKAGE__ARCHITECTURE;

	/**
	 * The number of structural features of the '<em>Not Installed Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INSTALLED_PACKAGE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.ConfigFilesPackageImpl <em>Config Files Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.ConfigFilesPackageImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getConfigFilesPackage()
	 * @generated
	 */
	int CONFIG_FILES_PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__VERSION = PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__CONFIGURATION = PACKAGE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Package Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__PACKAGE_SETTINGS = PACKAGE__PACKAGE_SETTINGS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__ARCHITECTURE = PACKAGE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__MAINTAINER = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__CHECK_SUM = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__DESCRIPTION = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__SECTION = PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__TAG = PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__PRIORITY = PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE__UPLOADERS = PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Config Files Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILES_PACKAGE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl <em>Unpacked Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getUnpackedPackage()
	 * @generated
	 */
	int UNPACKED_PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__VERSION = PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__CONFIGURATION = PACKAGE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Package Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__PACKAGE_SETTINGS = PACKAGE__PACKAGE_SETTINGS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__ARCHITECTURE = PACKAGE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__MAINTAINER = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__CHECK_SUM = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__DESCRIPTION = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__SECTION = PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__TAG = PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__PRIORITY = PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__UPLOADERS = PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE__FILES = PACKAGE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Unpacked Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACKED_PACKAGE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.HalfConfiguredPackageImpl <em>Half Configured Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.HalfConfiguredPackageImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getHalfConfiguredPackage()
	 * @generated
	 */
	int HALF_CONFIGURED_PACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__NAME = UNPACKED_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__VERSION = UNPACKED_PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__CONFIGURATION = UNPACKED_PACKAGE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Package Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__PACKAGE_SETTINGS = UNPACKED_PACKAGE__PACKAGE_SETTINGS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__ARCHITECTURE = UNPACKED_PACKAGE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__MAINTAINER = UNPACKED_PACKAGE__MAINTAINER;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__CHECK_SUM = UNPACKED_PACKAGE__CHECK_SUM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__DESCRIPTION = UNPACKED_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__SECTION = UNPACKED_PACKAGE__SECTION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__TAG = UNPACKED_PACKAGE__TAG;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__PRIORITY = UNPACKED_PACKAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__UPLOADERS = UNPACKED_PACKAGE__UPLOADERS;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE__FILES = UNPACKED_PACKAGE__FILES;

	/**
	 * The number of structural features of the '<em>Half Configured Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_CONFIGURED_PACKAGE_FEATURE_COUNT = UNPACKED_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.HalfInstalledPackageImpl <em>Half Installed Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.HalfInstalledPackageImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getHalfInstalledPackage()
	 * @generated
	 */
	int HALF_INSTALLED_PACKAGE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__VERSION = PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__CONFIGURATION = PACKAGE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Package Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__PACKAGE_SETTINGS = PACKAGE__PACKAGE_SETTINGS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__ARCHITECTURE = PACKAGE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__MAINTAINER = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__CHECK_SUM = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__DESCRIPTION = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__SECTION = PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__TAG = PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__PRIORITY = PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE__UPLOADERS = PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Half Installed Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_INSTALLED_PACKAGE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.SrcPackageImpl <em>Src Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.SrcPackageImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSrcPackage()
	 * @generated
	 */
	int SRC_PACKAGE = 9;

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
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__ARCHITECTURE = INSTALLED_PACKAGE__ARCHITECTURE;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.BinPackageImpl <em>Bin Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.BinPackageImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getBinPackage()
	 * @generated
	 */
	int BIN_PACKAGE = 10;

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
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_PACKAGE__ARCHITECTURE = INSTALLED_PACKAGE__ARCHITECTURE;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.VirtualPackageImpl <em>Virtual Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.VirtualPackageImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getVirtualPackage()
	 * @generated
	 */
	int VIRTUAL_PACKAGE = 11;

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
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PACKAGE__ARCHITECTURE = INSTALLED_PACKAGE__ARCHITECTURE;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.DependenceImpl <em>Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.DependenceImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getDependence()
	 * @generated
	 */
	int DEPENDENCE = 12;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.AndDepImpl <em>And Dep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.AndDepImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getAndDep()
	 * @generated
	 */
	int AND_DEP = 13;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.OrDepImpl <em>Or Dep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.OrDepImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getOrDep()
	 * @generated
	 */
	int OR_DEP = 14;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.SingleDepImpl <em>Single Dep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.SingleDepImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSingleDep()
	 * @generated
	 */
	int SINGLE_DEP = 15;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.InvariantImpl <em>Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.InvariantImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getInvariant()
	 * @generated
	 */
	int INVARIANT = 16;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.AtomImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 17;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.AndInvImpl <em>And Inv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.AndInvImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getAndInv()
	 * @generated
	 */
	int AND_INV = 18;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.OrInvImpl <em>Or Inv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.OrInvImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getOrInv()
	 * @generated
	 */
	int OR_INV = 19;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.NotInvImpl <em>Not Inv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.NotInvImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getNotInv()
	 * @generated
	 */
	int NOT_INV = 20;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.EnvironmentImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 21;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.FileSystemImpl <em>File System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.FileSystemImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getFileSystem()
	 * @generated
	 */
	int FILE_SYSTEM = 22;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.GConfImpl <em>GConf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.GConfImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getGConf()
	 * @generated
	 */
	int GCONF = 23;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.ApplicationMenuCatalogImpl <em>Application Menu Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.ApplicationMenuCatalogImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getApplicationMenuCatalog()
	 * @generated
	 */
	int APPLICATION_MENU_CATALOG = 24;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.MenuImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 25;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.MenuEntryImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getMenuEntry()
	 * @generated
	 */
	int MENU_ENTRY = 26;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.BootImpl <em>Boot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.BootImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getBoot()
	 * @generated
	 */
	int BOOT = 27;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.ServiceImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 28;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.FileImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 29;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.DocumentationFileImpl <em>Documentation File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.DocumentationFileImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getDocumentationFile()
	 * @generated
	 */
	int DOCUMENTATION_FILE = 30;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.InformationFileImpl <em>Information File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.InformationFileImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getInformationFile()
	 * @generated
	 */
	int INFORMATION_FILE = 31;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.AlternativeImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 32;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.PackageSettingImpl <em>Package Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.PackageSettingImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getPackageSetting()
	 * @generated
	 */
	int PACKAGE_SETTING = 33;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.IconCacheImpl <em>Icon Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.IconCacheImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getIconCache()
	 * @generated
	 */
	int ICON_CACHE = 34;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.DesktopDBImpl <em>Desktop DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.DesktopDBImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getDesktopDB()
	 * @generated
	 */
	int DESKTOP_DB = 35;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.MimeTypeHandlerCacheImpl <em>Mime Type Handler Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.MimeTypeHandlerCacheImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getMimeTypeHandlerCache()
	 * @generated
	 */
	int MIME_TYPE_HANDLER_CACHE = 36;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.MimeTypeHandlerImpl <em>Mime Type Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.MimeTypeHandlerImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getMimeTypeHandler()
	 * @generated
	 */
	int MIME_TYPE_HANDLER = 37;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.MimeTypeImpl <em>Mime Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.MimeTypeImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getMimeType()
	 * @generated
	 */
	int MIME_TYPE = 38;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.XFontCacheImpl <em>XFont Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.XFontCacheImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getXFontCache()
	 * @generated
	 */
	int XFONT_CACHE = 39;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.XFontImpl <em>XFont</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.XFontImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getXFont()
	 * @generated
	 */
	int XFONT = 40;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.LibraryCacheImpl <em>Library Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.LibraryCacheImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getLibraryCache()
	 * @generated
	 */
	int LIBRARY_CACHE = 41;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.SharedLibraryImpl <em>Shared Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.SharedLibraryImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSharedLibrary()
	 * @generated
	 */
	int SHARED_LIBRARY = 42;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.ModuleCacheImpl <em>Module Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.ModuleCacheImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getModuleCache()
	 * @generated
	 */
	int MODULE_CACHE = 43;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.ModuleImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 44;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.SGMLCatalogImpl <em>SGML Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.SGMLCatalogImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSGMLCatalog()
	 * @generated
	 */
	int SGML_CATALOG = 45;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.SGMLDocumentImpl <em>SGML Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.SGMLDocumentImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSGMLDocument()
	 * @generated
	 */
	int SGML_DOCUMENT = 46;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.SkeeperCatalogImpl <em>Skeeper Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.SkeeperCatalogImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSkeeperCatalog()
	 * @generated
	 */
	int SKEEPER_CATALOG = 47;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.SkeeperDocumentImpl <em>Skeeper Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.SkeeperDocumentImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSkeeperDocument()
	 * @generated
	 */
	int SKEEPER_DOCUMENT = 48;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.EmacsPackageImpl <em>Emacs Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.EmacsPackageImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getEmacsPackage()
	 * @generated
	 */
	int EMACS_PACKAGE = 49;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.UserImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getUser()
	 * @generated
	 */
	int USER = 50;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.GroupImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 51;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.ConflictImpl <em>Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.ConflictImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getConflict()
	 * @generated
	 */
	int CONFLICT = 53;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.SingleConflictImpl <em>Single Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.SingleConflictImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSingleConflict()
	 * @generated
	 */
	int SINGLE_CONFLICT = 52;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.AndConflictImpl <em>And Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.AndConflictImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getAndConflict()
	 * @generated
	 */
	int AND_CONFLICT = 54;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.impl.OrConflictImpl <em>Or Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.impl.OrConflictImpl
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getOrConflict()
	 * @generated
	 */
	int OR_CONFLICT = 55;

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
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.PriorityType <em>Priority Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.PriorityType
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getPriorityType()
	 * @generated
	 */
	int PRIORITY_TYPE = 56;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.StatusType <em>Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.StatusType
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 57;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.mancoosimm.VersionType <em>Version Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.mancoosimm.VersionType
	 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 58;


	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.Configuration#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Configuration#getCreationTime()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_CreationTime();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.Configuration#getSystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Type</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Configuration#getSystemType()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_SystemType();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Configuration#getFileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File System</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Configuration#getFileSystem()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_FileSystem();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Configuration#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Configuration#getEnvironment()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Configuration#getInstalledPackages <em>Installed Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Installed Packages</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Configuration#getInstalledPackages()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_InstalledPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Configuration#getNotInstalledPackages <em>Not Installed Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not Installed Packages</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Configuration#getNotInstalledPackages()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_NotInstalledPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Configuration#getConfigFilesPackages <em>Config Files Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Files Packages</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Configuration#getConfigFilesPackages()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_ConfigFilesPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Configuration#getUnpackedPackages <em>Unpacked Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unpacked Packages</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Configuration#getUnpackedPackages()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_UnpackedPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Configuration#getHalfConfiguredPackages <em>Half Configured Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Half Configured Packages</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Configuration#getHalfConfiguredPackages()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_HalfConfiguredPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Configuration#getHalfInstalledPackages <em>Half Installed Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Half Installed Packages</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Configuration#getHalfInstalledPackages()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_HalfInstalledPackages();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Package#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Package#getConfiguration()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Package#getPackageSettings <em>Package Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package Settings</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Package#getPackageSettings()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackageSettings();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.Package#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Package#getArchitecture()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Architecture();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage <em>Installed Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installed Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage
	 * @generated
	 */
	EClass getInstalledPackage();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getInstalledSize <em>Installed Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installed Size</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getInstalledSize()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_InstalledSize();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getMaintainer <em>Maintainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintainer</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getMaintainer()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Maintainer();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getFileSize <em>File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Size</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getFileSize()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_FileSize();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getCheckSum()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_CheckSum();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getDescription()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Description();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getSection()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Section();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getTag()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Tag();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getPriority()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Priority();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getUploaders <em>Uploaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uploaders</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getUploaders()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EAttribute getInstalledPackage_Uploaders();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getSourcePackage <em>Source Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getSourcePackage()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_SourcePackage();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depends</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getDepends()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Depends();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getRecommends <em>Recommends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommends</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getRecommends()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Recommends();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getSuggests <em>Suggests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Suggests</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getSuggests()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Suggests();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getEnhances <em>Enhances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enhances</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getEnhances()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Enhances();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getPredepends <em>Predepends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predepends</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getPredepends()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Predepends();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provides</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getProvides()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Provides();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getReplaces <em>Replaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replaces</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getReplaces()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Replaces();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Files</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getFiles()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getDocumentationFiles <em>Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation Files</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getDocumentationFiles()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_DocumentationFiles();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conflict</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getConflict()
	 * @see #getInstalledPackage()
	 * @generated
	 */
	EReference getInstalledPackage_Conflict();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.NotInstalledPackage <em>Not Installed Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Installed Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.NotInstalledPackage
	 * @generated
	 */
	EClass getNotInstalledPackage();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.ConfigFilesPackage <em>Config Files Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Files Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ConfigFilesPackage
	 * @generated
	 */
	EClass getConfigFilesPackage();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getMaintainer <em>Maintainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintainer</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getMaintainer()
	 * @see #getConfigFilesPackage()
	 * @generated
	 */
	EAttribute getConfigFilesPackage_Maintainer();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getCheckSum()
	 * @see #getConfigFilesPackage()
	 * @generated
	 */
	EAttribute getConfigFilesPackage_CheckSum();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getDescription()
	 * @see #getConfigFilesPackage()
	 * @generated
	 */
	EAttribute getConfigFilesPackage_Description();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getSection()
	 * @see #getConfigFilesPackage()
	 * @generated
	 */
	EAttribute getConfigFilesPackage_Section();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getTag()
	 * @see #getConfigFilesPackage()
	 * @generated
	 */
	EAttribute getConfigFilesPackage_Tag();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getPriority()
	 * @see #getConfigFilesPackage()
	 * @generated
	 */
	EAttribute getConfigFilesPackage_Priority();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getUploaders <em>Uploaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uploaders</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ConfigFilesPackage#getUploaders()
	 * @see #getConfigFilesPackage()
	 * @generated
	 */
	EAttribute getConfigFilesPackage_Uploaders();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage <em>Unpacked Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unpacked Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.UnpackedPackage
	 * @generated
	 */
	EClass getUnpackedPackage();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getMaintainer <em>Maintainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintainer</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.UnpackedPackage#getMaintainer()
	 * @see #getUnpackedPackage()
	 * @generated
	 */
	EAttribute getUnpackedPackage_Maintainer();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.UnpackedPackage#getCheckSum()
	 * @see #getUnpackedPackage()
	 * @generated
	 */
	EAttribute getUnpackedPackage_CheckSum();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.UnpackedPackage#getDescription()
	 * @see #getUnpackedPackage()
	 * @generated
	 */
	EAttribute getUnpackedPackage_Description();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.UnpackedPackage#getSection()
	 * @see #getUnpackedPackage()
	 * @generated
	 */
	EAttribute getUnpackedPackage_Section();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.UnpackedPackage#getTag()
	 * @see #getUnpackedPackage()
	 * @generated
	 */
	EAttribute getUnpackedPackage_Tag();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.UnpackedPackage#getPriority()
	 * @see #getUnpackedPackage()
	 * @generated
	 */
	EAttribute getUnpackedPackage_Priority();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getUploaders <em>Uploaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uploaders</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.UnpackedPackage#getUploaders()
	 * @see #getUnpackedPackage()
	 * @generated
	 */
	EAttribute getUnpackedPackage_Uploaders();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Files</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.UnpackedPackage#getFiles()
	 * @see #getUnpackedPackage()
	 * @generated
	 */
	EReference getUnpackedPackage_Files();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.HalfConfiguredPackage <em>Half Configured Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Half Configured Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.HalfConfiguredPackage
	 * @generated
	 */
	EClass getHalfConfiguredPackage();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage <em>Half Installed Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Half Installed Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.HalfInstalledPackage
	 * @generated
	 */
	EClass getHalfInstalledPackage();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getMaintainer <em>Maintainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintainer</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getMaintainer()
	 * @see #getHalfInstalledPackage()
	 * @generated
	 */
	EAttribute getHalfInstalledPackage_Maintainer();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getCheckSum()
	 * @see #getHalfInstalledPackage()
	 * @generated
	 */
	EAttribute getHalfInstalledPackage_CheckSum();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getDescription()
	 * @see #getHalfInstalledPackage()
	 * @generated
	 */
	EAttribute getHalfInstalledPackage_Description();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getSection()
	 * @see #getHalfInstalledPackage()
	 * @generated
	 */
	EAttribute getHalfInstalledPackage_Section();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getTag()
	 * @see #getHalfInstalledPackage()
	 * @generated
	 */
	EAttribute getHalfInstalledPackage_Tag();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getPriority()
	 * @see #getHalfInstalledPackage()
	 * @generated
	 */
	EAttribute getHalfInstalledPackage_Priority();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getUploaders <em>Uploaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uploaders</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getUploaders()
	 * @see #getHalfInstalledPackage()
	 * @generated
	 */
	EAttribute getHalfInstalledPackage_Uploaders();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.SrcPackage <em>Src Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SrcPackage
	 * @generated
	 */
	EClass getSrcPackage();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.SrcPackage#getBuildDepends <em>Build Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Build Depends</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SrcPackage#getBuildDepends()
	 * @see #getSrcPackage()
	 * @generated
	 */
	EReference getSrcPackage_BuildDepends();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.SrcPackage#getBuildConflicts <em>Build Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Build Conflicts</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SrcPackage#getBuildConflicts()
	 * @see #getSrcPackage()
	 * @generated
	 */
	EReference getSrcPackage_BuildConflicts();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.BinPackage <em>Bin Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.BinPackage
	 * @generated
	 */
	EClass getBinPackage();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.BinPackage#getSrcRef <em>Src Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src Ref</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.BinPackage#getSrcRef()
	 * @see #getBinPackage()
	 * @generated
	 */
	EReference getBinPackage_SrcRef();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.VirtualPackage <em>Virtual Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.VirtualPackage
	 * @generated
	 */
	EClass getVirtualPackage();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.VirtualPackage#getImpPackage <em>Imp Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imp Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.VirtualPackage#getImpPackage()
	 * @see #getVirtualPackage()
	 * @generated
	 */
	EReference getVirtualPackage_ImpPackage();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Dependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependence</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Dependence
	 * @generated
	 */
	EClass getDependence();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Dependence#getAndDep <em>And Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And Dep</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Dependence#getAndDep()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_AndDep();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Dependence#getOrDep <em>Or Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or Dep</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Dependence#getOrDep()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_OrDep();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Dependence#getSingleDep <em>Single Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Dep</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Dependence#getSingleDep()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_SingleDep();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Dependence#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Dependence#getPkg()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_Pkg();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.AndDep <em>And Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Dep</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.AndDep
	 * @generated
	 */
	EClass getAndDep();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.AndDep#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.AndDep#getOps()
	 * @see #getAndDep()
	 * @generated
	 */
	EReference getAndDep_Ops();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.AndDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dependence</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.AndDep#getDependence()
	 * @see #getAndDep()
	 * @generated
	 */
	EReference getAndDep_Dependence();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.OrDep <em>Or Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Dep</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.OrDep
	 * @generated
	 */
	EClass getOrDep();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.OrDep#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.OrDep#getOps()
	 * @see #getOrDep()
	 * @generated
	 */
	EReference getOrDep_Ops();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.OrDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dependence</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.OrDep#getDependence()
	 * @see #getOrDep()
	 * @generated
	 */
	EReference getOrDep_Dependence();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.SingleDep <em>Single Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Dep</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SingleDep
	 * @generated
	 */
	EClass getSingleDep();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.SingleDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dependence</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SingleDep#getDependence()
	 * @see #getSingleDep()
	 * @generated
	 */
	EReference getSingleDep_Dependence();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.SingleDep#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SingleDep#getVersion()
	 * @see #getSingleDep()
	 * @generated
	 */
	EAttribute getSingleDep_Version();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.SingleDep#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SingleDep#getValue()
	 * @see #getSingleDep()
	 * @generated
	 */
	EAttribute getSingleDep_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Invariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariant</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Invariant
	 * @generated
	 */
	EClass getInvariant();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Invariant#getAtomEl <em>Atom El</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atom El</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Invariant#getAtomEl()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_AtomEl();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Invariant#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>And</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Invariant#getAnd()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_And();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Invariant#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Or</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Invariant#getOr()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_Or();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Invariant#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Not</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Invariant#getNot()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_Not();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.AndInv <em>And Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Inv</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.AndInv
	 * @generated
	 */
	EClass getAndInv();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.AndInv#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.AndInv#getLeft()
	 * @see #getAndInv()
	 * @generated
	 */
	EReference getAndInv_Left();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.AndInv#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.AndInv#getRight()
	 * @see #getAndInv()
	 * @generated
	 */
	EReference getAndInv_Right();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.OrInv <em>Or Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Inv</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.OrInv
	 * @generated
	 */
	EClass getOrInv();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.OrInv#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.OrInv#getLeft()
	 * @see #getOrInv()
	 * @generated
	 */
	EReference getOrInv_Left();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.OrInv#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.OrInv#getRight()
	 * @see #getOrInv()
	 * @generated
	 */
	EReference getOrInv_Right();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.NotInv <em>Not Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Inv</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.NotInv
	 * @generated
	 */
	EClass getNotInv();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.NotInv#getElem <em>Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elem</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.NotInv#getElem()
	 * @see #getNotInv()
	 * @generated
	 */
	EReference getNotInv_Elem();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.Environment#getRunningServices <em>Running Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Running Services</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getRunningServices()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_RunningServices();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Environment#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getAlternatives()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Alternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Environment#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getUsers()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Environment#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getGroups()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Groups();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Environment#getEmacspkg <em>Emacspkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Emacspkg</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getEmacspkg()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Emacspkg();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Environment#getIconCache <em>Icon Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getIconCache()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_IconCache();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Environment#getDesktopDb <em>Desktop Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desktop Db</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getDesktopDb()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_DesktopDb();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Environment#getMimeTypeHandlerCache <em>Mime Type Handler Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mime Type Handler Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getMimeTypeHandlerCache()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_MimeTypeHandlerCache();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Environment#getLibraryCache <em>Library Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getLibraryCache()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_LibraryCache();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Environment#getSkeeperCatalog <em>Skeeper Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Skeeper Catalog</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getSkeeperCatalog()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_SkeeperCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Environment#getSgmlCatalog <em>Sgml Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sgml Catalog</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getSgmlCatalog()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_SgmlCatalog();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.Environment#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Configuration</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getConfiguration()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Configuration();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Environment#getModuleCache <em>Module Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getModuleCache()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_ModuleCache();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Environment#getXfontCaches <em>Xfont Caches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xfont Caches</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getXfontCaches()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_XfontCaches();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Environment#getGconf <em>Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gconf</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getGconf()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Gconf();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Environment#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Menu</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getMenu()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Menu();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.FileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.FileSystem
	 * @generated
	 */
	EClass getFileSystem();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.FileSystem#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.FileSystem#getRoot()
	 * @see #getFileSystem()
	 * @generated
	 */
	EReference getFileSystem_Root();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.FileSystem#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Configuration</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.FileSystem#getConfiguration()
	 * @see #getFileSystem()
	 * @generated
	 */
	EReference getFileSystem_Configuration();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.FileSystem#getAllFiles <em>All Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Files</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.FileSystem#getAllFiles()
	 * @see #getFileSystem()
	 * @generated
	 */
	EReference getFileSystem_AllFiles();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.GConf <em>GConf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GConf</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.GConf
	 * @generated
	 */
	EClass getGConf();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.GConf#getConfFiles <em>Conf Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conf Files</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.GConf#getConfFiles()
	 * @see #getGConf()
	 * @generated
	 */
	EReference getGConf_ConfFiles();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.GConf#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schemas</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.GConf#getSchemas()
	 * @see #getGConf()
	 * @generated
	 */
	EReference getGConf_Schemas();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.GConf#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.GConf#getEnv()
	 * @see #getGConf()
	 * @generated
	 */
	EReference getGConf_Env();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.ApplicationMenuCatalog <em>Application Menu Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Menu Catalog</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ApplicationMenuCatalog
	 * @generated
	 */
	EClass getApplicationMenuCatalog();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.ApplicationMenuCatalog#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Menu</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ApplicationMenuCatalog#getMenu()
	 * @see #getApplicationMenuCatalog()
	 * @generated
	 */
	EReference getApplicationMenuCatalog_Menu();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.Menu#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Menu#getEntries()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Entries();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Menu#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Menu#getCatalog()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Catalog();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.Menu#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Menu#getEnv()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Env();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Entry</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MenuEntry
	 * @generated
	 */
	EClass getMenuEntry();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.MenuEntry#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Menu</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MenuEntry#getMenu()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EReference getMenuEntry_Menu();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.MenuEntry#getExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executable</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MenuEntry#getExecutable()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EReference getMenuEntry_Executable();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.MenuEntry#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MenuEntry#getParent()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EReference getMenuEntry_Parent();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Boot <em>Boot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boot</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Boot
	 * @generated
	 */
	EClass getBoot();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.Boot#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Boot#getServices()
	 * @see #getBoot()
	 * @generated
	 */
	EReference getBoot_Services();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Service#getExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executable</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Service#getExecutable()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Executable();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Service#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Service#getEnv()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Env();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.File#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getExtension()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Extension();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.File#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getDescription()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Description();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.File#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getSize()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.File#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getCheckSum()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_CheckSum();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.File#isIsDirectory <em>Is Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Directory</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#isIsDirectory()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_IsDirectory();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.File#isSuid <em>Suid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suid</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#isSuid()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Suid();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.File#isGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#isGuid()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Guid();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.File#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getPermission()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Permission();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.File#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getLocation()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Location();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.File#getFs <em>Fs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fs</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getFs()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Fs();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.File#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getChilds()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Childs();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.File#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getParent()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Parent();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.File#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getOwner()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Owner();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.File#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getGroup()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Group();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.File#isIsMissing <em>Is Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Missing</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#isIsMissing()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_IsMissing();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.File#getPkgSettings <em>Pkg Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pkg Settings</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.File#getPkgSettings()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_PkgSettings();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.DocumentationFile <em>Documentation File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation File</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.DocumentationFile
	 * @generated
	 */
	EClass getDocumentationFile();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.DocumentationFile#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.DocumentationFile#getPkg()
	 * @see #getDocumentationFile()
	 * @generated
	 */
	EReference getDocumentationFile_Pkg();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.InformationFile <em>Information File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information File</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.InformationFile
	 * @generated
	 */
	EClass getInformationFile();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Alternative#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Alternative#getCurrent()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Current();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Alternative#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Alternative#getLocation()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Location();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.Alternative#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Alternative#getEnv()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Env();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.PackageSetting <em>Package Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Setting</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.PackageSetting
	 * @generated
	 */
	EClass getPackageSetting();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.PackageSetting#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.PackageSetting#getServices()
	 * @see #getPackageSetting()
	 * @generated
	 */
	EReference getPackageSetting_Services();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.PackageSetting#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Files</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.PackageSetting#getFiles()
	 * @see #getPackageSetting()
	 * @generated
	 */
	EReference getPackageSetting_Files();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.PackageSetting#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.PackageSetting#getPkg()
	 * @see #getPackageSetting()
	 * @generated
	 */
	EReference getPackageSetting_Pkg();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.PackageSetting#getDependences <em>Dependences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependences</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.PackageSetting#getDependences()
	 * @see #getPackageSetting()
	 * @generated
	 */
	EReference getPackageSetting_Dependences();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.IconCache <em>Icon Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.IconCache
	 * @generated
	 */
	EClass getIconCache();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.IconCache#getMtime <em>Mtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mtime</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.IconCache#getMtime()
	 * @see #getIconCache()
	 * @generated
	 */
	EAttribute getIconCache_Mtime();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.IconCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.IconCache#getEnv()
	 * @see #getIconCache()
	 * @generated
	 */
	EReference getIconCache_Env();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.IconCache#getIcons <em>Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Icons</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.IconCache#getIcons()
	 * @see #getIconCache()
	 * @generated
	 */
	EReference getIconCache_Icons();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.DesktopDB <em>Desktop DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desktop DB</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.DesktopDB
	 * @generated
	 */
	EClass getDesktopDB();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.DesktopDB#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.DesktopDB#getEnv()
	 * @see #getDesktopDB()
	 * @generated
	 */
	EReference getDesktopDB_Env();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.DesktopDB#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applications</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.DesktopDB#getApplications()
	 * @see #getDesktopDB()
	 * @generated
	 */
	EReference getDesktopDB_Applications();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache <em>Mime Type Handler Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type Handler Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache
	 * @generated
	 */
	EClass getMimeTypeHandlerCache();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getEnv()
	 * @see #getMimeTypeHandlerCache()
	 * @generated
	 */
	EReference getMimeTypeHandlerCache_Env();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getHandlers()
	 * @see #getMimeTypeHandlerCache()
	 * @generated
	 */
	EReference getMimeTypeHandlerCache_Handlers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getMimeTypes <em>Mime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mime Types</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getMimeTypes()
	 * @see #getMimeTypeHandlerCache()
	 * @generated
	 */
	EReference getMimeTypeHandlerCache_MimeTypes();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler <em>Mime Type Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type Handler</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeTypeHandler
	 * @generated
	 */
	EClass getMimeTypeHandler();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handler</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getHandler()
	 * @see #getMimeTypeHandler()
	 * @generated
	 */
	EReference getMimeTypeHandler_Handler();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getType()
	 * @see #getMimeTypeHandler()
	 * @generated
	 */
	EReference getMimeTypeHandler_Type();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getCache()
	 * @see #getMimeTypeHandler()
	 * @generated
	 */
	EReference getMimeTypeHandler_Cache();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.MimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeType
	 * @generated
	 */
	EClass getMimeType();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.MimeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeType#getName()
	 * @see #getMimeType()
	 * @generated
	 */
	EAttribute getMimeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.MimeType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeType#getExtension()
	 * @see #getMimeType()
	 * @generated
	 */
	EAttribute getMimeType_Extension();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.MimeType#getMimeTypeHandlers <em>Mime Type Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mime Type Handlers</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeType#getMimeTypeHandlers()
	 * @see #getMimeType()
	 * @generated
	 */
	EReference getMimeType_MimeTypeHandlers();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.MimeType#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.MimeType#getCache()
	 * @see #getMimeType()
	 * @generated
	 */
	EReference getMimeType_Cache();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.XFontCache <em>XFont Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XFont Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.XFontCache
	 * @generated
	 */
	EClass getXFontCache();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.XFontCache#getXfonts <em>Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xfonts</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.XFontCache#getXfonts()
	 * @see #getXFontCache()
	 * @generated
	 */
	EReference getXFontCache_Xfonts();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.XFontCache#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.XFontCache#getLocation()
	 * @see #getXFontCache()
	 * @generated
	 */
	EAttribute getXFontCache_Location();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.XFontCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.XFontCache#getEnv()
	 * @see #getXFontCache()
	 * @generated
	 */
	EReference getXFontCache_Env();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.XFont <em>XFont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XFont</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.XFont
	 * @generated
	 */
	EClass getXFont();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.XFont#getXfontCache <em>Xfont Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Xfont Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.XFont#getXfontCache()
	 * @see #getXFont()
	 * @generated
	 */
	EReference getXFont_XfontCache();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.XFont#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>File</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.XFont#getFile()
	 * @see #getXFont()
	 * @generated
	 */
	EReference getXFont_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.LibraryCache <em>Library Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.LibraryCache
	 * @generated
	 */
	EClass getLibraryCache();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.LibraryCache#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.LibraryCache#getLocations()
	 * @see #getLibraryCache()
	 * @generated
	 */
	EReference getLibraryCache_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.LibraryCache#getSharedLibraries <em>Shared Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Libraries</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.LibraryCache#getSharedLibraries()
	 * @see #getLibraryCache()
	 * @generated
	 */
	EReference getLibraryCache_SharedLibraries();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.LibraryCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.LibraryCache#getEnv()
	 * @see #getLibraryCache()
	 * @generated
	 */
	EReference getLibraryCache_Env();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.SharedLibrary <em>Shared Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Library</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SharedLibrary
	 * @generated
	 */
	EClass getSharedLibrary();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.SharedLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SharedLibrary#getName()
	 * @see #getSharedLibrary()
	 * @generated
	 */
	EAttribute getSharedLibrary_Name();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.SharedLibrary#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SharedLibrary#getFile()
	 * @see #getSharedLibrary()
	 * @generated
	 */
	EReference getSharedLibrary_File();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.SharedLibrary#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SharedLibrary#getVersion()
	 * @see #getSharedLibrary()
	 * @generated
	 */
	EAttribute getSharedLibrary_Version();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.SharedLibrary#getLibraryCache <em>Library Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SharedLibrary#getLibraryCache()
	 * @see #getSharedLibrary()
	 * @generated
	 */
	EReference getSharedLibrary_LibraryCache();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.ModuleCache <em>Module Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ModuleCache
	 * @generated
	 */
	EClass getModuleCache();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.ModuleCache#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ModuleCache#getVersion()
	 * @see #getModuleCache()
	 * @generated
	 */
	EAttribute getModuleCache_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.ModuleCache#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ModuleCache#getModules()
	 * @see #getModuleCache()
	 * @generated
	 */
	EReference getModuleCache_Modules();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.ModuleCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.ModuleCache#getEnv()
	 * @see #getModuleCache()
	 * @generated
	 */
	EReference getModuleCache_Env();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Module#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Module#getFile()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_File();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.Module#getModuleCache <em>Module Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module Cache</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Module#getModuleCache()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModuleCache();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.SGMLCatalog <em>SGML Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGML Catalog</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SGMLCatalog
	 * @generated
	 */
	EClass getSGMLCatalog();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.SGMLCatalog#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SGMLCatalog#getEnv()
	 * @see #getSGMLCatalog()
	 * @generated
	 */
	EReference getSGMLCatalog_Env();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.SGMLCatalog#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SGMLCatalog#getDocuments()
	 * @see #getSGMLCatalog()
	 * @generated
	 */
	EReference getSGMLCatalog_Documents();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.SGMLDocument <em>SGML Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGML Document</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SGMLDocument
	 * @generated
	 */
	EClass getSGMLDocument();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.SGMLDocument#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SGMLDocument#getLocation()
	 * @see #getSGMLDocument()
	 * @generated
	 */
	EReference getSGMLDocument_Location();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.SGMLDocument#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SGMLDocument#getDocument()
	 * @see #getSGMLDocument()
	 * @generated
	 */
	EReference getSGMLDocument_Document();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.SkeeperCatalog <em>Skeeper Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skeeper Catalog</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SkeeperCatalog
	 * @generated
	 */
	EClass getSkeeperCatalog();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.SkeeperCatalog#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SkeeperCatalog#getEnv()
	 * @see #getSkeeperCatalog()
	 * @generated
	 */
	EReference getSkeeperCatalog_Env();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.SkeeperCatalog#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SkeeperCatalog#getDocuments()
	 * @see #getSkeeperCatalog()
	 * @generated
	 */
	EReference getSkeeperCatalog_Documents();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.SkeeperDocument <em>Skeeper Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skeeper Document</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SkeeperDocument
	 * @generated
	 */
	EClass getSkeeperDocument();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.SkeeperDocument#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SkeeperDocument#getLocation()
	 * @see #getSkeeperDocument()
	 * @generated
	 */
	EReference getSkeeperDocument_Location();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.SkeeperDocument#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SkeeperDocument#getDocument()
	 * @see #getSkeeperDocument()
	 * @generated
	 */
	EReference getSkeeperDocument_Document();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.EmacsPackage <em>Emacs Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emacs Package</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.EmacsPackage
	 * @generated
	 */
	EClass getEmacsPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.EmacsPackage#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.EmacsPackage#getFiles()
	 * @see #getEmacsPackage()
	 * @generated
	 */
	EReference getEmacsPackage_Files();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.EmacsPackage#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.EmacsPackage#getEnv()
	 * @see #getEmacsPackage()
	 * @generated
	 */
	EReference getEmacsPackage_Env();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.User#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.User#getEnv()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Env();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.User#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.User#getGroups()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Groups();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.User#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Home</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.User#getHome()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Home();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.Group#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Env</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Group#getEnv()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Env();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.mancoosimm.Group#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Group#getUsers()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Users();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.SingleConflict <em>Single Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Conflict</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SingleConflict
	 * @generated
	 */
	EClass getSingleConflict();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.SingleConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conflict</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SingleConflict#getConflict()
	 * @see #getSingleConflict()
	 * @generated
	 */
	EReference getSingleConflict_Conflict();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.SingleConflict#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SingleConflict#getVersion()
	 * @see #getSingleConflict()
	 * @generated
	 */
	EAttribute getSingleConflict_Version();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.mancoosimm.SingleConflict#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.SingleConflict#getValue()
	 * @see #getSingleConflict()
	 * @generated
	 */
	EAttribute getSingleConflict_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Conflict
	 * @generated
	 */
	EClass getConflict();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Conflict#getAndConflict <em>And Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And Conflict</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Conflict#getAndConflict()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_AndConflict();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Conflict#getOrConflict <em>Or Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or Conflict</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Conflict#getOrConflict()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_OrConflict();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.mancoosimm.Conflict#getSingleConflict <em>Single Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Conflict</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Conflict#getSingleConflict()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_SingleConflict();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.mancoosimm.Conflict#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.Conflict#getPkg()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_Pkg();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.AndConflict <em>And Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Conflict</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.AndConflict
	 * @generated
	 */
	EClass getAndConflict();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.AndConflict#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.AndConflict#getOps()
	 * @see #getAndConflict()
	 * @generated
	 */
	EReference getAndConflict_Ops();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.AndConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conflict</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.AndConflict#getConflict()
	 * @see #getAndConflict()
	 * @generated
	 */
	EReference getAndConflict_Conflict();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.mancoosimm.OrConflict <em>Or Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Conflict</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.OrConflict
	 * @generated
	 */
	EClass getOrConflict();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.mancoosimm.OrConflict#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.OrConflict#getOps()
	 * @see #getOrConflict()
	 * @generated
	 */
	EReference getOrConflict_Ops();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.mancoosimm.OrConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conflict</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.OrConflict#getConflict()
	 * @see #getOrConflict()
	 * @generated
	 */
	EReference getOrConflict_Conflict();

	/**
	 * Returns the meta object for enum '{@link it.univaq.mancoosi.mancoosimm.PriorityType <em>Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority Type</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.PriorityType
	 * @generated
	 */
	EEnum getPriorityType();

	/**
	 * Returns the meta object for enum '{@link it.univaq.mancoosi.mancoosimm.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Type</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.StatusType
	 * @generated
	 */
	EEnum getStatusType();

	/**
	 * Returns the meta object for enum '{@link it.univaq.mancoosi.mancoosimm.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version Type</em>'.
	 * @see it.univaq.mancoosi.mancoosimm.VersionType
	 * @generated
	 */
	EEnum getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MancoosiFactory getMancoosiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.NamedElementImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Creation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__CREATION_TIME = eINSTANCE.getConfiguration_CreationTime();

		/**
		 * The meta object literal for the '<em><b>System Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__SYSTEM_TYPE = eINSTANCE.getConfiguration_SystemType();

		/**
		 * The meta object literal for the '<em><b>File System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__FILE_SYSTEM = eINSTANCE.getConfiguration_FileSystem();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ENVIRONMENT = eINSTANCE.getConfiguration_Environment();

		/**
		 * The meta object literal for the '<em><b>Installed Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INSTALLED_PACKAGES = eINSTANCE.getConfiguration_InstalledPackages();

		/**
		 * The meta object literal for the '<em><b>Not Installed Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__NOT_INSTALLED_PACKAGES = eINSTANCE.getConfiguration_NotInstalledPackages();

		/**
		 * The meta object literal for the '<em><b>Config Files Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONFIG_FILES_PACKAGES = eINSTANCE.getConfiguration_ConfigFilesPackages();

		/**
		 * The meta object literal for the '<em><b>Unpacked Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__UNPACKED_PACKAGES = eINSTANCE.getConfiguration_UnpackedPackages();

		/**
		 * The meta object literal for the '<em><b>Half Configured Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__HALF_CONFIGURED_PACKAGES = eINSTANCE.getConfiguration_HalfConfiguredPackages();

		/**
		 * The meta object literal for the '<em><b>Half Installed Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__HALF_INSTALLED_PACKAGES = eINSTANCE.getConfiguration_HalfInstalledPackages();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.PackageImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__VERSION = eINSTANCE.getPackage_Version();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONFIGURATION = eINSTANCE.getPackage_Configuration();

		/**
		 * The meta object literal for the '<em><b>Package Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGE_SETTINGS = eINSTANCE.getPackage_PackageSettings();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__ARCHITECTURE = eINSTANCE.getPackage_Architecture();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl <em>Installed Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getInstalledPackage()
		 * @generated
		 */
		EClass INSTALLED_PACKAGE = eINSTANCE.getInstalledPackage();

		/**
		 * The meta object literal for the '<em><b>Installed Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLED_PACKAGE__INSTALLED_SIZE = eINSTANCE.getInstalledPackage_InstalledSize();

		/**
		 * The meta object literal for the '<em><b>Maintainer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLED_PACKAGE__MAINTAINER = eINSTANCE.getInstalledPackage_Maintainer();

		/**
		 * The meta object literal for the '<em><b>File Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLED_PACKAGE__FILE_SIZE = eINSTANCE.getInstalledPackage_FileSize();

		/**
		 * The meta object literal for the '<em><b>Check Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLED_PACKAGE__CHECK_SUM = eINSTANCE.getInstalledPackage_CheckSum();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLED_PACKAGE__DESCRIPTION = eINSTANCE.getInstalledPackage_Description();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLED_PACKAGE__SECTION = eINSTANCE.getInstalledPackage_Section();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLED_PACKAGE__TAG = eINSTANCE.getInstalledPackage_Tag();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLED_PACKAGE__PRIORITY = eINSTANCE.getInstalledPackage_Priority();

		/**
		 * The meta object literal for the '<em><b>Uploaders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLED_PACKAGE__UPLOADERS = eINSTANCE.getInstalledPackage_Uploaders();

		/**
		 * The meta object literal for the '<em><b>Source Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLED_PACKAGE__SOURCE_PACKAGE = eINSTANCE.getInstalledPackage_SourcePackage();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLED_PACKAGE__DEPENDS = eINSTANCE.getInstalledPackage_Depends();

		/**
		 * The meta object literal for the '<em><b>Recommends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLED_PACKAGE__RECOMMENDS = eINSTANCE.getInstalledPackage_Recommends();

		/**
		 * The meta object literal for the '<em><b>Suggests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLED_PACKAGE__SUGGESTS = eINSTANCE.getInstalledPackage_Suggests();

		/**
		 * The meta object literal for the '<em><b>Enhances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLED_PACKAGE__ENHANCES = eINSTANCE.getInstalledPackage_Enhances();

		/**
		 * The meta object literal for the '<em><b>Predepends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLED_PACKAGE__PREDEPENDS = eINSTANCE.getInstalledPackage_Predepends();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLED_PACKAGE__PROVIDES = eINSTANCE.getInstalledPackage_Provides();

		/**
		 * The meta object literal for the '<em><b>Replaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLED_PACKAGE__REPLACES = eINSTANCE.getInstalledPackage_Replaces();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLED_PACKAGE__FILES = eINSTANCE.getInstalledPackage_Files();

		/**
		 * The meta object literal for the '<em><b>Documentation Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLED_PACKAGE__DOCUMENTATION_FILES = eINSTANCE.getInstalledPackage_DocumentationFiles();

		/**
		 * The meta object literal for the '<em><b>Conflict</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLED_PACKAGE__CONFLICT = eINSTANCE.getInstalledPackage_Conflict();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.NotInstalledPackageImpl <em>Not Installed Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.NotInstalledPackageImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getNotInstalledPackage()
		 * @generated
		 */
		EClass NOT_INSTALLED_PACKAGE = eINSTANCE.getNotInstalledPackage();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.ConfigFilesPackageImpl <em>Config Files Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.ConfigFilesPackageImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getConfigFilesPackage()
		 * @generated
		 */
		EClass CONFIG_FILES_PACKAGE = eINSTANCE.getConfigFilesPackage();

		/**
		 * The meta object literal for the '<em><b>Maintainer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_FILES_PACKAGE__MAINTAINER = eINSTANCE.getConfigFilesPackage_Maintainer();

		/**
		 * The meta object literal for the '<em><b>Check Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_FILES_PACKAGE__CHECK_SUM = eINSTANCE.getConfigFilesPackage_CheckSum();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_FILES_PACKAGE__DESCRIPTION = eINSTANCE.getConfigFilesPackage_Description();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_FILES_PACKAGE__SECTION = eINSTANCE.getConfigFilesPackage_Section();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_FILES_PACKAGE__TAG = eINSTANCE.getConfigFilesPackage_Tag();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_FILES_PACKAGE__PRIORITY = eINSTANCE.getConfigFilesPackage_Priority();

		/**
		 * The meta object literal for the '<em><b>Uploaders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_FILES_PACKAGE__UPLOADERS = eINSTANCE.getConfigFilesPackage_Uploaders();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl <em>Unpacked Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getUnpackedPackage()
		 * @generated
		 */
		EClass UNPACKED_PACKAGE = eINSTANCE.getUnpackedPackage();

		/**
		 * The meta object literal for the '<em><b>Maintainer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPACKED_PACKAGE__MAINTAINER = eINSTANCE.getUnpackedPackage_Maintainer();

		/**
		 * The meta object literal for the '<em><b>Check Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPACKED_PACKAGE__CHECK_SUM = eINSTANCE.getUnpackedPackage_CheckSum();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPACKED_PACKAGE__DESCRIPTION = eINSTANCE.getUnpackedPackage_Description();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPACKED_PACKAGE__SECTION = eINSTANCE.getUnpackedPackage_Section();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPACKED_PACKAGE__TAG = eINSTANCE.getUnpackedPackage_Tag();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPACKED_PACKAGE__PRIORITY = eINSTANCE.getUnpackedPackage_Priority();

		/**
		 * The meta object literal for the '<em><b>Uploaders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPACKED_PACKAGE__UPLOADERS = eINSTANCE.getUnpackedPackage_Uploaders();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNPACKED_PACKAGE__FILES = eINSTANCE.getUnpackedPackage_Files();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.HalfConfiguredPackageImpl <em>Half Configured Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.HalfConfiguredPackageImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getHalfConfiguredPackage()
		 * @generated
		 */
		EClass HALF_CONFIGURED_PACKAGE = eINSTANCE.getHalfConfiguredPackage();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.HalfInstalledPackageImpl <em>Half Installed Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.HalfInstalledPackageImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getHalfInstalledPackage()
		 * @generated
		 */
		EClass HALF_INSTALLED_PACKAGE = eINSTANCE.getHalfInstalledPackage();

		/**
		 * The meta object literal for the '<em><b>Maintainer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALF_INSTALLED_PACKAGE__MAINTAINER = eINSTANCE.getHalfInstalledPackage_Maintainer();

		/**
		 * The meta object literal for the '<em><b>Check Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALF_INSTALLED_PACKAGE__CHECK_SUM = eINSTANCE.getHalfInstalledPackage_CheckSum();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALF_INSTALLED_PACKAGE__DESCRIPTION = eINSTANCE.getHalfInstalledPackage_Description();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALF_INSTALLED_PACKAGE__SECTION = eINSTANCE.getHalfInstalledPackage_Section();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALF_INSTALLED_PACKAGE__TAG = eINSTANCE.getHalfInstalledPackage_Tag();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALF_INSTALLED_PACKAGE__PRIORITY = eINSTANCE.getHalfInstalledPackage_Priority();

		/**
		 * The meta object literal for the '<em><b>Uploaders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALF_INSTALLED_PACKAGE__UPLOADERS = eINSTANCE.getHalfInstalledPackage_Uploaders();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.SrcPackageImpl <em>Src Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.SrcPackageImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSrcPackage()
		 * @generated
		 */
		EClass SRC_PACKAGE = eINSTANCE.getSrcPackage();

		/**
		 * The meta object literal for the '<em><b>Build Depends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_PACKAGE__BUILD_DEPENDS = eINSTANCE.getSrcPackage_BuildDepends();

		/**
		 * The meta object literal for the '<em><b>Build Conflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_PACKAGE__BUILD_CONFLICTS = eINSTANCE.getSrcPackage_BuildConflicts();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.BinPackageImpl <em>Bin Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.BinPackageImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getBinPackage()
		 * @generated
		 */
		EClass BIN_PACKAGE = eINSTANCE.getBinPackage();

		/**
		 * The meta object literal for the '<em><b>Src Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_PACKAGE__SRC_REF = eINSTANCE.getBinPackage_SrcRef();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.VirtualPackageImpl <em>Virtual Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.VirtualPackageImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getVirtualPackage()
		 * @generated
		 */
		EClass VIRTUAL_PACKAGE = eINSTANCE.getVirtualPackage();

		/**
		 * The meta object literal for the '<em><b>Imp Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_PACKAGE__IMP_PACKAGE = eINSTANCE.getVirtualPackage_ImpPackage();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.DependenceImpl <em>Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.DependenceImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getDependence()
		 * @generated
		 */
		EClass DEPENDENCE = eINSTANCE.getDependence();

		/**
		 * The meta object literal for the '<em><b>And Dep</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCE__AND_DEP = eINSTANCE.getDependence_AndDep();

		/**
		 * The meta object literal for the '<em><b>Or Dep</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCE__OR_DEP = eINSTANCE.getDependence_OrDep();

		/**
		 * The meta object literal for the '<em><b>Single Dep</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCE__SINGLE_DEP = eINSTANCE.getDependence_SingleDep();

		/**
		 * The meta object literal for the '<em><b>Pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCE__PKG = eINSTANCE.getDependence_Pkg();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.AndDepImpl <em>And Dep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.AndDepImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getAndDep()
		 * @generated
		 */
		EClass AND_DEP = eINSTANCE.getAndDep();

		/**
		 * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_DEP__OPS = eINSTANCE.getAndDep_Ops();

		/**
		 * The meta object literal for the '<em><b>Dependence</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_DEP__DEPENDENCE = eINSTANCE.getAndDep_Dependence();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.OrDepImpl <em>Or Dep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.OrDepImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getOrDep()
		 * @generated
		 */
		EClass OR_DEP = eINSTANCE.getOrDep();

		/**
		 * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_DEP__OPS = eINSTANCE.getOrDep_Ops();

		/**
		 * The meta object literal for the '<em><b>Dependence</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_DEP__DEPENDENCE = eINSTANCE.getOrDep_Dependence();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.SingleDepImpl <em>Single Dep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.SingleDepImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSingleDep()
		 * @generated
		 */
		EClass SINGLE_DEP = eINSTANCE.getSingleDep();

		/**
		 * The meta object literal for the '<em><b>Dependence</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_DEP__DEPENDENCE = eINSTANCE.getSingleDep_Dependence();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_DEP__VERSION = eINSTANCE.getSingleDep_Version();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_DEP__VALUE = eINSTANCE.getSingleDep_Value();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.InvariantImpl <em>Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.InvariantImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getInvariant()
		 * @generated
		 */
		EClass INVARIANT = eINSTANCE.getInvariant();

		/**
		 * The meta object literal for the '<em><b>Atom El</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT__ATOM_EL = eINSTANCE.getInvariant_AtomEl();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT__AND = eINSTANCE.getInvariant_And();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT__OR = eINSTANCE.getInvariant_Or();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT__NOT = eINSTANCE.getInvariant_Not();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.AtomImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.AndInvImpl <em>And Inv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.AndInvImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getAndInv()
		 * @generated
		 */
		EClass AND_INV = eINSTANCE.getAndInv();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_INV__LEFT = eINSTANCE.getAndInv_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_INV__RIGHT = eINSTANCE.getAndInv_Right();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.OrInvImpl <em>Or Inv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.OrInvImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getOrInv()
		 * @generated
		 */
		EClass OR_INV = eINSTANCE.getOrInv();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_INV__LEFT = eINSTANCE.getOrInv_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_INV__RIGHT = eINSTANCE.getOrInv_Right();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.NotInvImpl <em>Not Inv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.NotInvImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getNotInv()
		 * @generated
		 */
		EClass NOT_INV = eINSTANCE.getNotInv();

		/**
		 * The meta object literal for the '<em><b>Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_INV__ELEM = eINSTANCE.getNotInv_Elem();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.EnvironmentImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Running Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__RUNNING_SERVICES = eINSTANCE.getEnvironment_RunningServices();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__ALTERNATIVES = eINSTANCE.getEnvironment_Alternatives();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__USERS = eINSTANCE.getEnvironment_Users();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__GROUPS = eINSTANCE.getEnvironment_Groups();

		/**
		 * The meta object literal for the '<em><b>Emacspkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__EMACSPKG = eINSTANCE.getEnvironment_Emacspkg();

		/**
		 * The meta object literal for the '<em><b>Icon Cache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__ICON_CACHE = eINSTANCE.getEnvironment_IconCache();

		/**
		 * The meta object literal for the '<em><b>Desktop Db</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__DESKTOP_DB = eINSTANCE.getEnvironment_DesktopDb();

		/**
		 * The meta object literal for the '<em><b>Mime Type Handler Cache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__MIME_TYPE_HANDLER_CACHE = eINSTANCE.getEnvironment_MimeTypeHandlerCache();

		/**
		 * The meta object literal for the '<em><b>Library Cache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__LIBRARY_CACHE = eINSTANCE.getEnvironment_LibraryCache();

		/**
		 * The meta object literal for the '<em><b>Skeeper Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__SKEEPER_CATALOG = eINSTANCE.getEnvironment_SkeeperCatalog();

		/**
		 * The meta object literal for the '<em><b>Sgml Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__SGML_CATALOG = eINSTANCE.getEnvironment_SgmlCatalog();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__CONFIGURATION = eINSTANCE.getEnvironment_Configuration();

		/**
		 * The meta object literal for the '<em><b>Module Cache</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__MODULE_CACHE = eINSTANCE.getEnvironment_ModuleCache();

		/**
		 * The meta object literal for the '<em><b>Xfont Caches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__XFONT_CACHES = eINSTANCE.getEnvironment_XfontCaches();

		/**
		 * The meta object literal for the '<em><b>Gconf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__GCONF = eINSTANCE.getEnvironment_Gconf();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__MENU = eINSTANCE.getEnvironment_Menu();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.FileSystemImpl <em>File System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.FileSystemImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getFileSystem()
		 * @generated
		 */
		EClass FILE_SYSTEM = eINSTANCE.getFileSystem();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SYSTEM__ROOT = eINSTANCE.getFileSystem_Root();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SYSTEM__CONFIGURATION = eINSTANCE.getFileSystem_Configuration();

		/**
		 * The meta object literal for the '<em><b>All Files</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SYSTEM__ALL_FILES = eINSTANCE.getFileSystem_AllFiles();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.GConfImpl <em>GConf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.GConfImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getGConf()
		 * @generated
		 */
		EClass GCONF = eINSTANCE.getGConf();

		/**
		 * The meta object literal for the '<em><b>Conf Files</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCONF__CONF_FILES = eINSTANCE.getGConf_ConfFiles();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCONF__SCHEMAS = eINSTANCE.getGConf_Schemas();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCONF__ENV = eINSTANCE.getGConf_Env();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.ApplicationMenuCatalogImpl <em>Application Menu Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.ApplicationMenuCatalogImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getApplicationMenuCatalog()
		 * @generated
		 */
		EClass APPLICATION_MENU_CATALOG = eINSTANCE.getApplicationMenuCatalog();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MENU_CATALOG__MENU = eINSTANCE.getApplicationMenuCatalog_Menu();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.MenuImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ENTRIES = eINSTANCE.getMenu_Entries();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__CATALOG = eINSTANCE.getMenu_Catalog();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ENV = eINSTANCE.getMenu_Env();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.MenuEntryImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getMenuEntry()
		 * @generated
		 */
		EClass MENU_ENTRY = eINSTANCE.getMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ENTRY__MENU = eINSTANCE.getMenuEntry_Menu();

		/**
		 * The meta object literal for the '<em><b>Executable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ENTRY__EXECUTABLE = eINSTANCE.getMenuEntry_Executable();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ENTRY__PARENT = eINSTANCE.getMenuEntry_Parent();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.BootImpl <em>Boot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.BootImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getBoot()
		 * @generated
		 */
		EClass BOOT = eINSTANCE.getBoot();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOT__SERVICES = eINSTANCE.getBoot_Services();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.ServiceImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Executable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__EXECUTABLE = eINSTANCE.getService_Executable();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ENV = eINSTANCE.getService_Env();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.FileImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__EXTENSION = eINSTANCE.getFile_Extension();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__DESCRIPTION = eINSTANCE.getFile_Description();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__SIZE = eINSTANCE.getFile_Size();

		/**
		 * The meta object literal for the '<em><b>Check Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__CHECK_SUM = eINSTANCE.getFile_CheckSum();

		/**
		 * The meta object literal for the '<em><b>Is Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__IS_DIRECTORY = eINSTANCE.getFile_IsDirectory();

		/**
		 * The meta object literal for the '<em><b>Suid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__SUID = eINSTANCE.getFile_Suid();

		/**
		 * The meta object literal for the '<em><b>Guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__GUID = eINSTANCE.getFile_Guid();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PERMISSION = eINSTANCE.getFile_Permission();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__LOCATION = eINSTANCE.getFile_Location();

		/**
		 * The meta object literal for the '<em><b>Fs</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__FS = eINSTANCE.getFile_Fs();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__CHILDS = eINSTANCE.getFile_Childs();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__PARENT = eINSTANCE.getFile_Parent();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__OWNER = eINSTANCE.getFile_Owner();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__GROUP = eINSTANCE.getFile_Group();

		/**
		 * The meta object literal for the '<em><b>Is Missing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__IS_MISSING = eINSTANCE.getFile_IsMissing();

		/**
		 * The meta object literal for the '<em><b>Pkg Settings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__PKG_SETTINGS = eINSTANCE.getFile_PkgSettings();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.DocumentationFileImpl <em>Documentation File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.DocumentationFileImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getDocumentationFile()
		 * @generated
		 */
		EClass DOCUMENTATION_FILE = eINSTANCE.getDocumentationFile();

		/**
		 * The meta object literal for the '<em><b>Pkg</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_FILE__PKG = eINSTANCE.getDocumentationFile_Pkg();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.InformationFileImpl <em>Information File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.InformationFileImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getInformationFile()
		 * @generated
		 */
		EClass INFORMATION_FILE = eINSTANCE.getInformationFile();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.AlternativeImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__CURRENT = eINSTANCE.getAlternative_Current();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__LOCATION = eINSTANCE.getAlternative_Location();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__ENV = eINSTANCE.getAlternative_Env();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.PackageSettingImpl <em>Package Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.PackageSettingImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getPackageSetting()
		 * @generated
		 */
		EClass PACKAGE_SETTING = eINSTANCE.getPackageSetting();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_SETTING__SERVICES = eINSTANCE.getPackageSetting_Services();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_SETTING__FILES = eINSTANCE.getPackageSetting_Files();

		/**
		 * The meta object literal for the '<em><b>Pkg</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_SETTING__PKG = eINSTANCE.getPackageSetting_Pkg();

		/**
		 * The meta object literal for the '<em><b>Dependences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_SETTING__DEPENDENCES = eINSTANCE.getPackageSetting_Dependences();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.IconCacheImpl <em>Icon Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.IconCacheImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getIconCache()
		 * @generated
		 */
		EClass ICON_CACHE = eINSTANCE.getIconCache();

		/**
		 * The meta object literal for the '<em><b>Mtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_CACHE__MTIME = eINSTANCE.getIconCache_Mtime();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON_CACHE__ENV = eINSTANCE.getIconCache_Env();

		/**
		 * The meta object literal for the '<em><b>Icons</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON_CACHE__ICONS = eINSTANCE.getIconCache_Icons();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.DesktopDBImpl <em>Desktop DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.DesktopDBImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getDesktopDB()
		 * @generated
		 */
		EClass DESKTOP_DB = eINSTANCE.getDesktopDB();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESKTOP_DB__ENV = eINSTANCE.getDesktopDB_Env();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESKTOP_DB__APPLICATIONS = eINSTANCE.getDesktopDB_Applications();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.MimeTypeHandlerCacheImpl <em>Mime Type Handler Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.MimeTypeHandlerCacheImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getMimeTypeHandlerCache()
		 * @generated
		 */
		EClass MIME_TYPE_HANDLER_CACHE = eINSTANCE.getMimeTypeHandlerCache();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIME_TYPE_HANDLER_CACHE__ENV = eINSTANCE.getMimeTypeHandlerCache_Env();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIME_TYPE_HANDLER_CACHE__HANDLERS = eINSTANCE.getMimeTypeHandlerCache_Handlers();

		/**
		 * The meta object literal for the '<em><b>Mime Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIME_TYPE_HANDLER_CACHE__MIME_TYPES = eINSTANCE.getMimeTypeHandlerCache_MimeTypes();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.MimeTypeHandlerImpl <em>Mime Type Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.MimeTypeHandlerImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getMimeTypeHandler()
		 * @generated
		 */
		EClass MIME_TYPE_HANDLER = eINSTANCE.getMimeTypeHandler();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIME_TYPE_HANDLER__HANDLER = eINSTANCE.getMimeTypeHandler_Handler();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIME_TYPE_HANDLER__TYPE = eINSTANCE.getMimeTypeHandler_Type();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIME_TYPE_HANDLER__CACHE = eINSTANCE.getMimeTypeHandler_Cache();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.MimeTypeImpl <em>Mime Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.MimeTypeImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getMimeType()
		 * @generated
		 */
		EClass MIME_TYPE = eINSTANCE.getMimeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIME_TYPE__NAME = eINSTANCE.getMimeType_Name();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIME_TYPE__EXTENSION = eINSTANCE.getMimeType_Extension();

		/**
		 * The meta object literal for the '<em><b>Mime Type Handlers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIME_TYPE__MIME_TYPE_HANDLERS = eINSTANCE.getMimeType_MimeTypeHandlers();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIME_TYPE__CACHE = eINSTANCE.getMimeType_Cache();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.XFontCacheImpl <em>XFont Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.XFontCacheImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getXFontCache()
		 * @generated
		 */
		EClass XFONT_CACHE = eINSTANCE.getXFontCache();

		/**
		 * The meta object literal for the '<em><b>Xfonts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XFONT_CACHE__XFONTS = eINSTANCE.getXFontCache_Xfonts();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XFONT_CACHE__LOCATION = eINSTANCE.getXFontCache_Location();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XFONT_CACHE__ENV = eINSTANCE.getXFontCache_Env();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.XFontImpl <em>XFont</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.XFontImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getXFont()
		 * @generated
		 */
		EClass XFONT = eINSTANCE.getXFont();

		/**
		 * The meta object literal for the '<em><b>Xfont Cache</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XFONT__XFONT_CACHE = eINSTANCE.getXFont_XfontCache();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XFONT__FILE = eINSTANCE.getXFont_File();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.LibraryCacheImpl <em>Library Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.LibraryCacheImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getLibraryCache()
		 * @generated
		 */
		EClass LIBRARY_CACHE = eINSTANCE.getLibraryCache();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CACHE__LOCATIONS = eINSTANCE.getLibraryCache_Locations();

		/**
		 * The meta object literal for the '<em><b>Shared Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CACHE__SHARED_LIBRARIES = eINSTANCE.getLibraryCache_SharedLibraries();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_CACHE__ENV = eINSTANCE.getLibraryCache_Env();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.SharedLibraryImpl <em>Shared Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.SharedLibraryImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSharedLibrary()
		 * @generated
		 */
		EClass SHARED_LIBRARY = eINSTANCE.getSharedLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_LIBRARY__NAME = eINSTANCE.getSharedLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_LIBRARY__FILE = eINSTANCE.getSharedLibrary_File();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_LIBRARY__VERSION = eINSTANCE.getSharedLibrary_Version();

		/**
		 * The meta object literal for the '<em><b>Library Cache</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_LIBRARY__LIBRARY_CACHE = eINSTANCE.getSharedLibrary_LibraryCache();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.ModuleCacheImpl <em>Module Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.ModuleCacheImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getModuleCache()
		 * @generated
		 */
		EClass MODULE_CACHE = eINSTANCE.getModuleCache();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_CACHE__VERSION = eINSTANCE.getModuleCache_Version();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_CACHE__MODULES = eINSTANCE.getModuleCache_Modules();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_CACHE__ENV = eINSTANCE.getModuleCache_Env();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.ModuleImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__FILE = eINSTANCE.getModule_File();

		/**
		 * The meta object literal for the '<em><b>Module Cache</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULE_CACHE = eINSTANCE.getModule_ModuleCache();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.SGMLCatalogImpl <em>SGML Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.SGMLCatalogImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSGMLCatalog()
		 * @generated
		 */
		EClass SGML_CATALOG = eINSTANCE.getSGMLCatalog();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SGML_CATALOG__ENV = eINSTANCE.getSGMLCatalog_Env();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SGML_CATALOG__DOCUMENTS = eINSTANCE.getSGMLCatalog_Documents();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.SGMLDocumentImpl <em>SGML Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.SGMLDocumentImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSGMLDocument()
		 * @generated
		 */
		EClass SGML_DOCUMENT = eINSTANCE.getSGMLDocument();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SGML_DOCUMENT__LOCATION = eINSTANCE.getSGMLDocument_Location();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SGML_DOCUMENT__DOCUMENT = eINSTANCE.getSGMLDocument_Document();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.SkeeperCatalogImpl <em>Skeeper Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.SkeeperCatalogImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSkeeperCatalog()
		 * @generated
		 */
		EClass SKEEPER_CATALOG = eINSTANCE.getSkeeperCatalog();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKEEPER_CATALOG__ENV = eINSTANCE.getSkeeperCatalog_Env();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKEEPER_CATALOG__DOCUMENTS = eINSTANCE.getSkeeperCatalog_Documents();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.SkeeperDocumentImpl <em>Skeeper Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.SkeeperDocumentImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSkeeperDocument()
		 * @generated
		 */
		EClass SKEEPER_DOCUMENT = eINSTANCE.getSkeeperDocument();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKEEPER_DOCUMENT__LOCATION = eINSTANCE.getSkeeperDocument_Location();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKEEPER_DOCUMENT__DOCUMENT = eINSTANCE.getSkeeperDocument_Document();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.EmacsPackageImpl <em>Emacs Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.EmacsPackageImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getEmacsPackage()
		 * @generated
		 */
		EClass EMACS_PACKAGE = eINSTANCE.getEmacsPackage();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMACS_PACKAGE__FILES = eINSTANCE.getEmacsPackage_Files();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMACS_PACKAGE__ENV = eINSTANCE.getEmacsPackage_Env();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.UserImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ENV = eINSTANCE.getUser_Env();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__GROUPS = eINSTANCE.getUser_Groups();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__HOME = eINSTANCE.getUser_Home();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.GroupImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ENV = eINSTANCE.getGroup_Env();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__USERS = eINSTANCE.getGroup_Users();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.SingleConflictImpl <em>Single Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.SingleConflictImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getSingleConflict()
		 * @generated
		 */
		EClass SINGLE_CONFLICT = eINSTANCE.getSingleConflict();

		/**
		 * The meta object literal for the '<em><b>Conflict</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_CONFLICT__CONFLICT = eINSTANCE.getSingleConflict_Conflict();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_CONFLICT__VERSION = eINSTANCE.getSingleConflict_Version();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_CONFLICT__VALUE = eINSTANCE.getSingleConflict_Value();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.ConflictImpl <em>Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.ConflictImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getConflict()
		 * @generated
		 */
		EClass CONFLICT = eINSTANCE.getConflict();

		/**
		 * The meta object literal for the '<em><b>And Conflict</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT__AND_CONFLICT = eINSTANCE.getConflict_AndConflict();

		/**
		 * The meta object literal for the '<em><b>Or Conflict</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT__OR_CONFLICT = eINSTANCE.getConflict_OrConflict();

		/**
		 * The meta object literal for the '<em><b>Single Conflict</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT__SINGLE_CONFLICT = eINSTANCE.getConflict_SingleConflict();

		/**
		 * The meta object literal for the '<em><b>Pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT__PKG = eINSTANCE.getConflict_Pkg();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.AndConflictImpl <em>And Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.AndConflictImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getAndConflict()
		 * @generated
		 */
		EClass AND_CONFLICT = eINSTANCE.getAndConflict();

		/**
		 * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_CONFLICT__OPS = eINSTANCE.getAndConflict_Ops();

		/**
		 * The meta object literal for the '<em><b>Conflict</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_CONFLICT__CONFLICT = eINSTANCE.getAndConflict_Conflict();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.impl.OrConflictImpl <em>Or Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.impl.OrConflictImpl
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getOrConflict()
		 * @generated
		 */
		EClass OR_CONFLICT = eINSTANCE.getOrConflict();

		/**
		 * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_CONFLICT__OPS = eINSTANCE.getOrConflict_Ops();

		/**
		 * The meta object literal for the '<em><b>Conflict</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_CONFLICT__CONFLICT = eINSTANCE.getOrConflict_Conflict();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.PriorityType <em>Priority Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.PriorityType
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getPriorityType()
		 * @generated
		 */
		EEnum PRIORITY_TYPE = eINSTANCE.getPriorityType();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.StatusType <em>Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.StatusType
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getStatusType()
		 * @generated
		 */
		EEnum STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '{@link it.univaq.mancoosi.mancoosimm.VersionType <em>Version Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.mancoosi.mancoosimm.VersionType
		 * @see it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl#getVersionType()
		 * @generated
		 */
		EEnum VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //MancoosiPackage
