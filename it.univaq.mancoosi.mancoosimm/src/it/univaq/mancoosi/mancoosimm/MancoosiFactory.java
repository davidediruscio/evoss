/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage
 * @generated
 */
public interface MancoosiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MancoosiFactory eINSTANCE = it.univaq.mancoosi.mancoosimm.impl.MancoosiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Installed Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Installed Package</em>'.
	 * @generated
	 */
	InstalledPackage createInstalledPackage();

	/**
	 * Returns a new object of class '<em>Not Installed Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Installed Package</em>'.
	 * @generated
	 */
	NotInstalledPackage createNotInstalledPackage();

	/**
	 * Returns a new object of class '<em>Config Files Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Files Package</em>'.
	 * @generated
	 */
	ConfigFilesPackage createConfigFilesPackage();

	/**
	 * Returns a new object of class '<em>Unpacked Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unpacked Package</em>'.
	 * @generated
	 */
	UnpackedPackage createUnpackedPackage();

	/**
	 * Returns a new object of class '<em>Half Configured Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Half Configured Package</em>'.
	 * @generated
	 */
	HalfConfiguredPackage createHalfConfiguredPackage();

	/**
	 * Returns a new object of class '<em>Half Installed Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Half Installed Package</em>'.
	 * @generated
	 */
	HalfInstalledPackage createHalfInstalledPackage();

	/**
	 * Returns a new object of class '<em>Src Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Package</em>'.
	 * @generated
	 */
	SrcPackage createSrcPackage();

	/**
	 * Returns a new object of class '<em>Bin Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bin Package</em>'.
	 * @generated
	 */
	BinPackage createBinPackage();

	/**
	 * Returns a new object of class '<em>Virtual Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Package</em>'.
	 * @generated
	 */
	VirtualPackage createVirtualPackage();

	/**
	 * Returns a new object of class '<em>And Dep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Dep</em>'.
	 * @generated
	 */
	AndDep createAndDep();

	/**
	 * Returns a new object of class '<em>Or Dep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Dep</em>'.
	 * @generated
	 */
	OrDep createOrDep();

	/**
	 * Returns a new object of class '<em>Single Dep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Dep</em>'.
	 * @generated
	 */
	SingleDep createSingleDep();

	/**
	 * Returns a new object of class '<em>Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invariant</em>'.
	 * @generated
	 */
	Invariant createInvariant();

	/**
	 * Returns a new object of class '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atom</em>'.
	 * @generated
	 */
	Atom createAtom();

	/**
	 * Returns a new object of class '<em>And Inv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Inv</em>'.
	 * @generated
	 */
	AndInv createAndInv();

	/**
	 * Returns a new object of class '<em>Or Inv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Inv</em>'.
	 * @generated
	 */
	OrInv createOrInv();

	/**
	 * Returns a new object of class '<em>Not Inv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Inv</em>'.
	 * @generated
	 */
	NotInv createNotInv();

	/**
	 * Returns a new object of class '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment</em>'.
	 * @generated
	 */
	Environment createEnvironment();

	/**
	 * Returns a new object of class '<em>File System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File System</em>'.
	 * @generated
	 */
	FileSystem createFileSystem();

	/**
	 * Returns a new object of class '<em>GConf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GConf</em>'.
	 * @generated
	 */
	GConf createGConf();

	/**
	 * Returns a new object of class '<em>Application Menu Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Menu Catalog</em>'.
	 * @generated
	 */
	ApplicationMenuCatalog createApplicationMenuCatalog();

	/**
	 * Returns a new object of class '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu</em>'.
	 * @generated
	 */
	Menu createMenu();

	/**
	 * Returns a new object of class '<em>Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Entry</em>'.
	 * @generated
	 */
	MenuEntry createMenuEntry();

	/**
	 * Returns a new object of class '<em>Boot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boot</em>'.
	 * @generated
	 */
	Boot createBoot();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Documentation File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation File</em>'.
	 * @generated
	 */
	DocumentationFile createDocumentationFile();

	/**
	 * Returns a new object of class '<em>Information File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information File</em>'.
	 * @generated
	 */
	InformationFile createInformationFile();

	/**
	 * Returns a new object of class '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative</em>'.
	 * @generated
	 */
	Alternative createAlternative();

	/**
	 * Returns a new object of class '<em>Package Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Setting</em>'.
	 * @generated
	 */
	PackageSetting createPackageSetting();

	/**
	 * Returns a new object of class '<em>Icon Cache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Icon Cache</em>'.
	 * @generated
	 */
	IconCache createIconCache();

	/**
	 * Returns a new object of class '<em>Desktop DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desktop DB</em>'.
	 * @generated
	 */
	DesktopDB createDesktopDB();

	/**
	 * Returns a new object of class '<em>Mime Type Handler Cache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mime Type Handler Cache</em>'.
	 * @generated
	 */
	MimeTypeHandlerCache createMimeTypeHandlerCache();

	/**
	 * Returns a new object of class '<em>Mime Type Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mime Type Handler</em>'.
	 * @generated
	 */
	MimeTypeHandler createMimeTypeHandler();

	/**
	 * Returns a new object of class '<em>Mime Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mime Type</em>'.
	 * @generated
	 */
	MimeType createMimeType();

	/**
	 * Returns a new object of class '<em>XFont Cache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XFont Cache</em>'.
	 * @generated
	 */
	XFontCache createXFontCache();

	/**
	 * Returns a new object of class '<em>XFont</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XFont</em>'.
	 * @generated
	 */
	XFont createXFont();

	/**
	 * Returns a new object of class '<em>Library Cache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Cache</em>'.
	 * @generated
	 */
	LibraryCache createLibraryCache();

	/**
	 * Returns a new object of class '<em>Shared Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Library</em>'.
	 * @generated
	 */
	SharedLibrary createSharedLibrary();

	/**
	 * Returns a new object of class '<em>Module Cache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Cache</em>'.
	 * @generated
	 */
	ModuleCache createModuleCache();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>SGML Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SGML Catalog</em>'.
	 * @generated
	 */
	SGMLCatalog createSGMLCatalog();

	/**
	 * Returns a new object of class '<em>SGML Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SGML Document</em>'.
	 * @generated
	 */
	SGMLDocument createSGMLDocument();

	/**
	 * Returns a new object of class '<em>Skeeper Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skeeper Catalog</em>'.
	 * @generated
	 */
	SkeeperCatalog createSkeeperCatalog();

	/**
	 * Returns a new object of class '<em>Skeeper Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skeeper Document</em>'.
	 * @generated
	 */
	SkeeperDocument createSkeeperDocument();

	/**
	 * Returns a new object of class '<em>Emacs Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emacs Package</em>'.
	 * @generated
	 */
	EmacsPackage createEmacsPackage();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Single Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Conflict</em>'.
	 * @generated
	 */
	SingleConflict createSingleConflict();

	/**
	 * Returns a new object of class '<em>And Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Conflict</em>'.
	 * @generated
	 */
	AndConflict createAndConflict();

	/**
	 * Returns a new object of class '<em>Or Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Conflict</em>'.
	 * @generated
	 */
	OrConflict createOrConflict();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MancoosiPackage getMancoosiPackage();

} //MancoosiFactory
