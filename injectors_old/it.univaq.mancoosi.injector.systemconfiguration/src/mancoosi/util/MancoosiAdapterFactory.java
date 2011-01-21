/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.util;

import mancoosi.AdditionEnvironmentStatement;
import mancoosi.AdditionFileSytemStatement;
import mancoosi.AdditionPackageSettingStatement;
import mancoosi.Alternative;
import mancoosi.AndConflict;
import mancoosi.AndDep;
import mancoosi.AndInv;
import mancoosi.ApplicationMenuCatalog;
import mancoosi.Atom;
import mancoosi.BasicCase;
import mancoosi.BasicCaseCondition;
import mancoosi.BinPackage;
import mancoosi.BooleanExpression;
import mancoosi.Boot;
import mancoosi.Case;
import mancoosi.CasePostinst;
import mancoosi.CasePostinstCondition;
import mancoosi.CasePostrm;
import mancoosi.CasePostrmCondition;
import mancoosi.CasePreinst;
import mancoosi.CasePreinstCondition;
import mancoosi.CasePrerm;
import mancoosi.CasePrermCondition;
import mancoosi.Comment;
import mancoosi.Condition;
import mancoosi.ConfigScript;
import mancoosi.Configuration;
import mancoosi.Conflict;
import mancoosi.ControlStatement;
import mancoosi.DefaultCaseCondition;
import mancoosi.DeletionEnvironmentStatement;
import mancoosi.DeletionFileSystemStatement;
import mancoosi.DeletionPackageSettingStatement;
import mancoosi.Dependence;
import mancoosi.DesktopDB;
import mancoosi.DirectoryIterator;
import mancoosi.DocumentationFile;
import mancoosi.EmacsPackage;
import mancoosi.Enumeration;
import mancoosi.EnumerationElement;
import mancoosi.EnumerationIterator;
import mancoosi.Environment;
import mancoosi.EnvironmentStatement;
import mancoosi.File;
import mancoosi.FileContentIterator;
import mancoosi.FileSystem;
import mancoosi.FileSystemStatement;
import mancoosi.GConf;
import mancoosi.Group;
import mancoosi.IconCache;
import mancoosi.If;
import mancoosi.InformationFile;
import mancoosi.InputParameter;
import mancoosi.InputParameterIterator;
import mancoosi.InstalledPackage;
import mancoosi.IntParam;
import mancoosi.Invariant;
import mancoosi.Iterator;
import mancoosi.LibraryCache;
import mancoosi.MancoosiPackage;
import mancoosi.Menu;
import mancoosi.MenuEntry;
import mancoosi.Message;
import mancoosi.MimeType;
import mancoosi.MimeTypeHandler;
import mancoosi.MimeTypeHandlerCache;
import mancoosi.Module;
import mancoosi.ModuleCache;
import mancoosi.NamedElement;
import mancoosi.NeutralStatement;
import mancoosi.NotInstalledPackage;
import mancoosi.NotInv;
import mancoosi.OrConflict;
import mancoosi.OrDep;
import mancoosi.OrInv;
import mancoosi.PackageSetting;
import mancoosi.PackageSettingStatement;
import mancoosi.Param;
import mancoosi.PostinstDesktop;
import mancoosi.PostinstDocBase;
import mancoosi.PostinstEmacsen;
import mancoosi.PostinstGconf;
import mancoosi.PostinstGconfDefaults;
import mancoosi.PostinstIcons;
import mancoosi.PostinstInfo;
import mancoosi.PostinstInit;
import mancoosi.PostinstInitNostart;
import mancoosi.PostinstInitRestart;
import mancoosi.PostinstMakeshlibs;
import mancoosi.PostinstMenu;
import mancoosi.PostinstMenuMethod;
import mancoosi.PostinstMime;
import mancoosi.PostinstModules;
import mancoosi.PostinstPython;
import mancoosi.PostinstScript;
import mancoosi.PostinstScrollkeeper;
import mancoosi.PostinstSgmlcatalog;
import mancoosi.PostinstSharedmimeinfo;
import mancoosi.PostinstSuid;
import mancoosi.PostinstUdev;
import mancoosi.PostinstUsrlocal;
import mancoosi.PostinstWm;
import mancoosi.PostinstWmNoman;
import mancoosi.PostinstXfonts;
import mancoosi.PostrmDebconf;
import mancoosi.PostrmDesktop;
import mancoosi.PostrmGconf;
import mancoosi.PostrmGconfDefaults;
import mancoosi.PostrmIcons;
import mancoosi.PostrmInit;
import mancoosi.PostrmMakeshlibs;
import mancoosi.PostrmMenu;
import mancoosi.PostrmMenuMethod;
import mancoosi.PostrmMime;
import mancoosi.PostrmModules;
import mancoosi.PostrmScript;
import mancoosi.PostrmScrollkeeper;
import mancoosi.PostrmSgmlcatalog;
import mancoosi.PostrmSharedmimeinfo;
import mancoosi.PostrmSuid;
import mancoosi.PostrmXfonts;
import mancoosi.PreinstScript;
import mancoosi.PreinstUdev;
import mancoosi.PreinstUser;
import mancoosi.PrermDocBase;
import mancoosi.PrermEmacsen;
import mancoosi.PrermGconf;
import mancoosi.PrermInfo;
import mancoosi.PrermInit;
import mancoosi.PrermInitNorestart;
import mancoosi.PrermPython;
import mancoosi.PrermScript;
import mancoosi.PrermSgmlcatalog;
import mancoosi.PrermUsrlocal;
import mancoosi.PrermWm;
import mancoosi.Return;
import mancoosi.SGMLCatalog;
import mancoosi.SGMLDocument;
import mancoosi.Script;
import mancoosi.Service;
import mancoosi.SharedLibrary;
import mancoosi.SingleConflict;
import mancoosi.SingleDep;
import mancoosi.SkeeperCatalog;
import mancoosi.SkeeperDocument;
import mancoosi.SrcPackage;
import mancoosi.Statement;
import mancoosi.StringIterator;
import mancoosi.StringParam;
import mancoosi.UpdateEnvironmentStatement;
import mancoosi.UpdateFileSytemStatement;
import mancoosi.UpdatePackageSettingStatement;
import mancoosi.User;
import mancoosi.VirtualPackage;
import mancoosi.XFont;
import mancoosi.XFontCache;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mancoosi.MancoosiPackage
 * @generated
 */
public class MancoosiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MancoosiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MancoosiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MancoosiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MancoosiSwitch modelSwitch =
		new MancoosiSwitch() {
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			public Object caseInstalledPackage(InstalledPackage object) {
				return createInstalledPackageAdapter();
			}
			public Object caseNotInstalledPackage(NotInstalledPackage object) {
				return createNotInstalledPackageAdapter();
			}
			public Object caseSrcPackage(SrcPackage object) {
				return createSrcPackageAdapter();
			}
			public Object caseBinPackage(BinPackage object) {
				return createBinPackageAdapter();
			}
			public Object caseVirtualPackage(VirtualPackage object) {
				return createVirtualPackageAdapter();
			}
			public Object caseDependence(Dependence object) {
				return createDependenceAdapter();
			}
			public Object caseAndDep(AndDep object) {
				return createAndDepAdapter();
			}
			public Object caseOrDep(OrDep object) {
				return createOrDepAdapter();
			}
			public Object caseSingleDep(SingleDep object) {
				return createSingleDepAdapter();
			}
			public Object caseScript(Script object) {
				return createScriptAdapter();
			}
			public Object caseInputParameter(InputParameter object) {
				return createInputParameterAdapter();
			}
			public Object casePreinstScript(PreinstScript object) {
				return createPreinstScriptAdapter();
			}
			public Object casePostinstScript(PostinstScript object) {
				return createPostinstScriptAdapter();
			}
			public Object casePrermScript(PrermScript object) {
				return createPrermScriptAdapter();
			}
			public Object casePostrmScript(PostrmScript object) {
				return createPostrmScriptAdapter();
			}
			public Object caseConfigScript(ConfigScript object) {
				return createConfigScriptAdapter();
			}
			public Object caseInvariant(Invariant object) {
				return createInvariantAdapter();
			}
			public Object caseAtom(Atom object) {
				return createAtomAdapter();
			}
			public Object caseAndInv(AndInv object) {
				return createAndInvAdapter();
			}
			public Object caseOrInv(OrInv object) {
				return createOrInvAdapter();
			}
			public Object caseNotInv(NotInv object) {
				return createNotInvAdapter();
			}
			public Object caseStatement(Statement object) {
				return createStatementAdapter();
			}
			public Object caseControlStatement(ControlStatement object) {
				return createControlStatementAdapter();
			}
			public Object caseCase(Case object) {
				return createCaseAdapter();
			}
			public Object caseCondition(Condition object) {
				return createConditionAdapter();
			}
			public Object caseDefaultCaseCondition(DefaultCaseCondition object) {
				return createDefaultCaseConditionAdapter();
			}
			public Object caseCasePrerm(CasePrerm object) {
				return createCasePrermAdapter();
			}
			public Object caseCasePrermCondition(CasePrermCondition object) {
				return createCasePrermConditionAdapter();
			}
			public Object caseCasePostrm(CasePostrm object) {
				return createCasePostrmAdapter();
			}
			public Object caseCasePostrmCondition(CasePostrmCondition object) {
				return createCasePostrmConditionAdapter();
			}
			public Object caseCasePreinst(CasePreinst object) {
				return createCasePreinstAdapter();
			}
			public Object caseCasePreinstCondition(CasePreinstCondition object) {
				return createCasePreinstConditionAdapter();
			}
			public Object caseCasePostinst(CasePostinst object) {
				return createCasePostinstAdapter();
			}
			public Object caseCasePostinstCondition(CasePostinstCondition object) {
				return createCasePostinstConditionAdapter();
			}
			public Object caseBasicCase(BasicCase object) {
				return createBasicCaseAdapter();
			}
			public Object caseBasicCaseCondition(BasicCaseCondition object) {
				return createBasicCaseConditionAdapter();
			}
			public Object caseIf(If object) {
				return createIfAdapter();
			}
			public Object caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			public Object caseReturn(Return object) {
				return createReturnAdapter();
			}
			public Object caseIterator(Iterator object) {
				return createIteratorAdapter();
			}
			public Object caseDirectoryIterator(DirectoryIterator object) {
				return createDirectoryIteratorAdapter();
			}
			public Object caseFileContentIterator(FileContentIterator object) {
				return createFileContentIteratorAdapter();
			}
			public Object caseInputParameterIterator(InputParameterIterator object) {
				return createInputParameterIteratorAdapter();
			}
			public Object caseEnumerationIterator(EnumerationIterator object) {
				return createEnumerationIteratorAdapter();
			}
			public Object caseStringIterator(StringIterator object) {
				return createStringIteratorAdapter();
			}
			public Object caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			public Object caseEnumerationElement(EnumerationElement object) {
				return createEnumerationElementAdapter();
			}
			public Object caseFileSystemStatement(FileSystemStatement object) {
				return createFileSystemStatementAdapter();
			}
			public Object caseAdditionFileSytemStatement(AdditionFileSytemStatement object) {
				return createAdditionFileSytemStatementAdapter();
			}
			public Object caseDeletionFileSystemStatement(DeletionFileSystemStatement object) {
				return createDeletionFileSystemStatementAdapter();
			}
			public Object caseUpdateFileSytemStatement(UpdateFileSytemStatement object) {
				return createUpdateFileSytemStatementAdapter();
			}
			public Object caseEnvironmentStatement(EnvironmentStatement object) {
				return createEnvironmentStatementAdapter();
			}
			public Object caseAdditionEnvironmentStatement(AdditionEnvironmentStatement object) {
				return createAdditionEnvironmentStatementAdapter();
			}
			public Object caseDeletionEnvironmentStatement(DeletionEnvironmentStatement object) {
				return createDeletionEnvironmentStatementAdapter();
			}
			public Object caseUpdateEnvironmentStatement(UpdateEnvironmentStatement object) {
				return createUpdateEnvironmentStatementAdapter();
			}
			public Object casePackageSettingStatement(PackageSettingStatement object) {
				return createPackageSettingStatementAdapter();
			}
			public Object caseAdditionPackageSettingStatement(AdditionPackageSettingStatement object) {
				return createAdditionPackageSettingStatementAdapter();
			}
			public Object caseDeletionPackageSettingStatement(DeletionPackageSettingStatement object) {
				return createDeletionPackageSettingStatementAdapter();
			}
			public Object caseUpdatePackageSettingStatement(UpdatePackageSettingStatement object) {
				return createUpdatePackageSettingStatementAdapter();
			}
			public Object caseNeutralStatement(NeutralStatement object) {
				return createNeutralStatementAdapter();
			}
			public Object caseMessage(Message object) {
				return createMessageAdapter();
			}
			public Object caseComment(Comment object) {
				return createCommentAdapter();
			}
			public Object caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			public Object caseFileSystem(FileSystem object) {
				return createFileSystemAdapter();
			}
			public Object caseGConf(GConf object) {
				return createGConfAdapter();
			}
			public Object caseApplicationMenuCatalog(ApplicationMenuCatalog object) {
				return createApplicationMenuCatalogAdapter();
			}
			public Object caseMenu(Menu object) {
				return createMenuAdapter();
			}
			public Object caseMenuEntry(MenuEntry object) {
				return createMenuEntryAdapter();
			}
			public Object caseBoot(Boot object) {
				return createBootAdapter();
			}
			public Object caseService(Service object) {
				return createServiceAdapter();
			}
			public Object caseFile(File object) {
				return createFileAdapter();
			}
			public Object caseDocumentationFile(DocumentationFile object) {
				return createDocumentationFileAdapter();
			}
			public Object caseInformationFile(InformationFile object) {
				return createInformationFileAdapter();
			}
			public Object caseAlternative(Alternative object) {
				return createAlternativeAdapter();
			}
			public Object casePackageSetting(PackageSetting object) {
				return createPackageSettingAdapter();
			}
			public Object caseIconCache(IconCache object) {
				return createIconCacheAdapter();
			}
			public Object caseDesktopDB(DesktopDB object) {
				return createDesktopDBAdapter();
			}
			public Object caseMimeTypeHandlerCache(MimeTypeHandlerCache object) {
				return createMimeTypeHandlerCacheAdapter();
			}
			public Object caseMimeTypeHandler(MimeTypeHandler object) {
				return createMimeTypeHandlerAdapter();
			}
			public Object caseMimeType(MimeType object) {
				return createMimeTypeAdapter();
			}
			public Object caseXFontCache(XFontCache object) {
				return createXFontCacheAdapter();
			}
			public Object caseXFont(XFont object) {
				return createXFontAdapter();
			}
			public Object caseLibraryCache(LibraryCache object) {
				return createLibraryCacheAdapter();
			}
			public Object caseSharedLibrary(SharedLibrary object) {
				return createSharedLibraryAdapter();
			}
			public Object caseModuleCache(ModuleCache object) {
				return createModuleCacheAdapter();
			}
			public Object caseModule(Module object) {
				return createModuleAdapter();
			}
			public Object caseSGMLCatalog(SGMLCatalog object) {
				return createSGMLCatalogAdapter();
			}
			public Object caseSGMLDocument(SGMLDocument object) {
				return createSGMLDocumentAdapter();
			}
			public Object caseSkeeperCatalog(SkeeperCatalog object) {
				return createSkeeperCatalogAdapter();
			}
			public Object caseSkeeperDocument(SkeeperDocument object) {
				return createSkeeperDocumentAdapter();
			}
			public Object caseEmacsPackage(EmacsPackage object) {
				return createEmacsPackageAdapter();
			}
			public Object caseUser(User object) {
				return createUserAdapter();
			}
			public Object caseGroup(Group object) {
				return createGroupAdapter();
			}
			public Object casePostinstDesktop(PostinstDesktop object) {
				return createPostinstDesktopAdapter();
			}
			public Object casePostinstDocBase(PostinstDocBase object) {
				return createPostinstDocBaseAdapter();
			}
			public Object casePostinstEmacsen(PostinstEmacsen object) {
				return createPostinstEmacsenAdapter();
			}
			public Object casePostinstGconf(PostinstGconf object) {
				return createPostinstGconfAdapter();
			}
			public Object casePostinstGconfDefaults(PostinstGconfDefaults object) {
				return createPostinstGconfDefaultsAdapter();
			}
			public Object casePostinstIcons(PostinstIcons object) {
				return createPostinstIconsAdapter();
			}
			public Object casePostinstInfo(PostinstInfo object) {
				return createPostinstInfoAdapter();
			}
			public Object casePostinstInit(PostinstInit object) {
				return createPostinstInitAdapter();
			}
			public Object casePostinstInitNostart(PostinstInitNostart object) {
				return createPostinstInitNostartAdapter();
			}
			public Object casePostinstInitRestart(PostinstInitRestart object) {
				return createPostinstInitRestartAdapter();
			}
			public Object casePostinstMakeshlibs(PostinstMakeshlibs object) {
				return createPostinstMakeshlibsAdapter();
			}
			public Object casePostinstMenu(PostinstMenu object) {
				return createPostinstMenuAdapter();
			}
			public Object casePostinstMenuMethod(PostinstMenuMethod object) {
				return createPostinstMenuMethodAdapter();
			}
			public Object casePostinstMime(PostinstMime object) {
				return createPostinstMimeAdapter();
			}
			public Object casePostinstModules(PostinstModules object) {
				return createPostinstModulesAdapter();
			}
			public Object casePostinstPython(PostinstPython object) {
				return createPostinstPythonAdapter();
			}
			public Object casePostinstScrollkeeper(PostinstScrollkeeper object) {
				return createPostinstScrollkeeperAdapter();
			}
			public Object casePostinstSgmlcatalog(PostinstSgmlcatalog object) {
				return createPostinstSgmlcatalogAdapter();
			}
			public Object casePostinstSharedmimeinfo(PostinstSharedmimeinfo object) {
				return createPostinstSharedmimeinfoAdapter();
			}
			public Object casePostinstSuid(PostinstSuid object) {
				return createPostinstSuidAdapter();
			}
			public Object casePostinstUdev(PostinstUdev object) {
				return createPostinstUdevAdapter();
			}
			public Object casePostinstUsrlocal(PostinstUsrlocal object) {
				return createPostinstUsrlocalAdapter();
			}
			public Object casePostinstWm(PostinstWm object) {
				return createPostinstWmAdapter();
			}
			public Object casePostinstWmNoman(PostinstWmNoman object) {
				return createPostinstWmNomanAdapter();
			}
			public Object casePostinstXfonts(PostinstXfonts object) {
				return createPostinstXfontsAdapter();
			}
			public Object casePostrmDebconf(PostrmDebconf object) {
				return createPostrmDebconfAdapter();
			}
			public Object casePostrmDesktop(PostrmDesktop object) {
				return createPostrmDesktopAdapter();
			}
			public Object casePostrmGconf(PostrmGconf object) {
				return createPostrmGconfAdapter();
			}
			public Object casePostrmGconfDefaults(PostrmGconfDefaults object) {
				return createPostrmGconfDefaultsAdapter();
			}
			public Object casePostrmIcons(PostrmIcons object) {
				return createPostrmIconsAdapter();
			}
			public Object casePostrmInit(PostrmInit object) {
				return createPostrmInitAdapter();
			}
			public Object casePostrmMakeshlibs(PostrmMakeshlibs object) {
				return createPostrmMakeshlibsAdapter();
			}
			public Object casePostrmMenu(PostrmMenu object) {
				return createPostrmMenuAdapter();
			}
			public Object casePostrmMenuMethod(PostrmMenuMethod object) {
				return createPostrmMenuMethodAdapter();
			}
			public Object casePostrmMime(PostrmMime object) {
				return createPostrmMimeAdapter();
			}
			public Object casePostrmModules(PostrmModules object) {
				return createPostrmModulesAdapter();
			}
			public Object casePostrmScrollkeeper(PostrmScrollkeeper object) {
				return createPostrmScrollkeeperAdapter();
			}
			public Object casePostrmSgmlcatalog(PostrmSgmlcatalog object) {
				return createPostrmSgmlcatalogAdapter();
			}
			public Object casePostrmSharedmimeinfo(PostrmSharedmimeinfo object) {
				return createPostrmSharedmimeinfoAdapter();
			}
			public Object casePostrmSuid(PostrmSuid object) {
				return createPostrmSuidAdapter();
			}
			public Object casePostrmXfonts(PostrmXfonts object) {
				return createPostrmXfontsAdapter();
			}
			public Object casePreinstUdev(PreinstUdev object) {
				return createPreinstUdevAdapter();
			}
			public Object casePreinstUser(PreinstUser object) {
				return createPreinstUserAdapter();
			}
			public Object casePrermDocBase(PrermDocBase object) {
				return createPrermDocBaseAdapter();
			}
			public Object casePrermEmacsen(PrermEmacsen object) {
				return createPrermEmacsenAdapter();
			}
			public Object casePrermGconf(PrermGconf object) {
				return createPrermGconfAdapter();
			}
			public Object casePrermInfo(PrermInfo object) {
				return createPrermInfoAdapter();
			}
			public Object casePrermInit(PrermInit object) {
				return createPrermInitAdapter();
			}
			public Object casePrermInitNorestart(PrermInitNorestart object) {
				return createPrermInitNorestartAdapter();
			}
			public Object casePrermPython(PrermPython object) {
				return createPrermPythonAdapter();
			}
			public Object casePrermSgmlcatalog(PrermSgmlcatalog object) {
				return createPrermSgmlcatalogAdapter();
			}
			public Object casePrermUsrlocal(PrermUsrlocal object) {
				return createPrermUsrlocalAdapter();
			}
			public Object casePrermWm(PrermWm object) {
				return createPrermWmAdapter();
			}
			public Object caseParam(Param object) {
				return createParamAdapter();
			}
			public Object caseStringParam(StringParam object) {
				return createStringParamAdapter();
			}
			public Object caseIntParam(IntParam object) {
				return createIntParamAdapter();
			}
			public Object caseSingleConflict(SingleConflict object) {
				return createSingleConflictAdapter();
			}
			public Object caseConflict(Conflict object) {
				return createConflictAdapter();
			}
			public Object caseAndConflict(AndConflict object) {
				return createAndConflictAdapter();
			}
			public Object caseOrConflict(OrConflict object) {
				return createOrConflictAdapter();
			}
			public Object casePackage(mancoosi.Package object) {
				return createPackageAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.InstalledPackage <em>Installed Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.InstalledPackage
	 * @generated
	 */
	public Adapter createInstalledPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.NotInstalledPackage <em>Not Installed Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.NotInstalledPackage
	 * @generated
	 */
	public Adapter createNotInstalledPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.SrcPackage <em>Src Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.SrcPackage
	 * @generated
	 */
	public Adapter createSrcPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.BinPackage <em>Bin Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.BinPackage
	 * @generated
	 */
	public Adapter createBinPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.VirtualPackage <em>Virtual Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.VirtualPackage
	 * @generated
	 */
	public Adapter createVirtualPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Dependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Dependence
	 * @generated
	 */
	public Adapter createDependenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.AndDep <em>And Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.AndDep
	 * @generated
	 */
	public Adapter createAndDepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.OrDep <em>Or Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.OrDep
	 * @generated
	 */
	public Adapter createOrDepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.SingleDep <em>Single Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.SingleDep
	 * @generated
	 */
	public Adapter createSingleDepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.InputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.InputParameter
	 * @generated
	 */
	public Adapter createInputParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PreinstScript <em>Preinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PreinstScript
	 * @generated
	 */
	public Adapter createPreinstScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstScript <em>Postinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstScript
	 * @generated
	 */
	public Adapter createPostinstScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PrermScript <em>Prerm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PrermScript
	 * @generated
	 */
	public Adapter createPrermScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmScript <em>Postrm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmScript
	 * @generated
	 */
	public Adapter createPostrmScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.ConfigScript <em>Config Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.ConfigScript
	 * @generated
	 */
	public Adapter createConfigScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Invariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Invariant
	 * @generated
	 */
	public Adapter createInvariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Atom
	 * @generated
	 */
	public Adapter createAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.AndInv <em>And Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.AndInv
	 * @generated
	 */
	public Adapter createAndInvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.OrInv <em>Or Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.OrInv
	 * @generated
	 */
	public Adapter createOrInvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.NotInv <em>Not Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.NotInv
	 * @generated
	 */
	public Adapter createNotInvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.ControlStatement <em>Control Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.ControlStatement
	 * @generated
	 */
	public Adapter createControlStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Case
	 * @generated
	 */
	public Adapter createCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.DefaultCaseCondition <em>Default Case Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.DefaultCaseCondition
	 * @generated
	 */
	public Adapter createDefaultCaseConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.CasePrerm <em>Case Prerm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.CasePrerm
	 * @generated
	 */
	public Adapter createCasePrermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.CasePrermCondition <em>Case Prerm Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.CasePrermCondition
	 * @generated
	 */
	public Adapter createCasePrermConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.CasePostrm <em>Case Postrm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.CasePostrm
	 * @generated
	 */
	public Adapter createCasePostrmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.CasePostrmCondition <em>Case Postrm Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.CasePostrmCondition
	 * @generated
	 */
	public Adapter createCasePostrmConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.CasePreinst <em>Case Preinst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.CasePreinst
	 * @generated
	 */
	public Adapter createCasePreinstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.CasePreinstCondition <em>Case Preinst Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.CasePreinstCondition
	 * @generated
	 */
	public Adapter createCasePreinstConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.CasePostinst <em>Case Postinst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.CasePostinst
	 * @generated
	 */
	public Adapter createCasePostinstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.CasePostinstCondition <em>Case Postinst Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.CasePostinstCondition
	 * @generated
	 */
	public Adapter createCasePostinstConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.BasicCase <em>Basic Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.BasicCase
	 * @generated
	 */
	public Adapter createBasicCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.BasicCaseCondition <em>Basic Case Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.BasicCaseCondition
	 * @generated
	 */
	public Adapter createBasicCaseConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Return
	 * @generated
	 */
	public Adapter createReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Iterator
	 * @generated
	 */
	public Adapter createIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.DirectoryIterator <em>Directory Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.DirectoryIterator
	 * @generated
	 */
	public Adapter createDirectoryIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.FileContentIterator <em>File Content Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.FileContentIterator
	 * @generated
	 */
	public Adapter createFileContentIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.InputParameterIterator <em>Input Parameter Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.InputParameterIterator
	 * @generated
	 */
	public Adapter createInputParameterIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.EnumerationIterator <em>Enumeration Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.EnumerationIterator
	 * @generated
	 */
	public Adapter createEnumerationIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.StringIterator <em>String Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.StringIterator
	 * @generated
	 */
	public Adapter createStringIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.EnumerationElement <em>Enumeration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.EnumerationElement
	 * @generated
	 */
	public Adapter createEnumerationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.FileSystemStatement <em>File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.FileSystemStatement
	 * @generated
	 */
	public Adapter createFileSystemStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.AdditionFileSytemStatement <em>Addition File Sytem Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.AdditionFileSytemStatement
	 * @generated
	 */
	public Adapter createAdditionFileSytemStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.DeletionFileSystemStatement <em>Deletion File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.DeletionFileSystemStatement
	 * @generated
	 */
	public Adapter createDeletionFileSystemStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.UpdateFileSytemStatement <em>Update File Sytem Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.UpdateFileSytemStatement
	 * @generated
	 */
	public Adapter createUpdateFileSytemStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.EnvironmentStatement <em>Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.EnvironmentStatement
	 * @generated
	 */
	public Adapter createEnvironmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.AdditionEnvironmentStatement <em>Addition Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.AdditionEnvironmentStatement
	 * @generated
	 */
	public Adapter createAdditionEnvironmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.DeletionEnvironmentStatement <em>Deletion Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.DeletionEnvironmentStatement
	 * @generated
	 */
	public Adapter createDeletionEnvironmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.UpdateEnvironmentStatement <em>Update Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.UpdateEnvironmentStatement
	 * @generated
	 */
	public Adapter createUpdateEnvironmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PackageSettingStatement <em>Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PackageSettingStatement
	 * @generated
	 */
	public Adapter createPackageSettingStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.AdditionPackageSettingStatement <em>Addition Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.AdditionPackageSettingStatement
	 * @generated
	 */
	public Adapter createAdditionPackageSettingStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.DeletionPackageSettingStatement <em>Deletion Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.DeletionPackageSettingStatement
	 * @generated
	 */
	public Adapter createDeletionPackageSettingStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.UpdatePackageSettingStatement <em>Update Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.UpdatePackageSettingStatement
	 * @generated
	 */
	public Adapter createUpdatePackageSettingStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.NeutralStatement <em>Neutral Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.NeutralStatement
	 * @generated
	 */
	public Adapter createNeutralStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.FileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.FileSystem
	 * @generated
	 */
	public Adapter createFileSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.GConf <em>GConf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.GConf
	 * @generated
	 */
	public Adapter createGConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.ApplicationMenuCatalog <em>Application Menu Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.ApplicationMenuCatalog
	 * @generated
	 */
	public Adapter createApplicationMenuCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.MenuEntry
	 * @generated
	 */
	public Adapter createMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Boot <em>Boot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Boot
	 * @generated
	 */
	public Adapter createBootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.DocumentationFile <em>Documentation File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.DocumentationFile
	 * @generated
	 */
	public Adapter createDocumentationFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.InformationFile <em>Information File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.InformationFile
	 * @generated
	 */
	public Adapter createInformationFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Alternative
	 * @generated
	 */
	public Adapter createAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PackageSetting <em>Package Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PackageSetting
	 * @generated
	 */
	public Adapter createPackageSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.IconCache <em>Icon Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.IconCache
	 * @generated
	 */
	public Adapter createIconCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.DesktopDB <em>Desktop DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.DesktopDB
	 * @generated
	 */
	public Adapter createDesktopDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.MimeTypeHandlerCache <em>Mime Type Handler Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.MimeTypeHandlerCache
	 * @generated
	 */
	public Adapter createMimeTypeHandlerCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.MimeTypeHandler <em>Mime Type Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.MimeTypeHandler
	 * @generated
	 */
	public Adapter createMimeTypeHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.MimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.MimeType
	 * @generated
	 */
	public Adapter createMimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.XFontCache <em>XFont Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.XFontCache
	 * @generated
	 */
	public Adapter createXFontCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.XFont <em>XFont</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.XFont
	 * @generated
	 */
	public Adapter createXFontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.LibraryCache <em>Library Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.LibraryCache
	 * @generated
	 */
	public Adapter createLibraryCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.SharedLibrary <em>Shared Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.SharedLibrary
	 * @generated
	 */
	public Adapter createSharedLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.ModuleCache <em>Module Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.ModuleCache
	 * @generated
	 */
	public Adapter createModuleCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.SGMLCatalog <em>SGML Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.SGMLCatalog
	 * @generated
	 */
	public Adapter createSGMLCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.SGMLDocument <em>SGML Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.SGMLDocument
	 * @generated
	 */
	public Adapter createSGMLDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.SkeeperCatalog <em>Skeeper Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.SkeeperCatalog
	 * @generated
	 */
	public Adapter createSkeeperCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.SkeeperDocument <em>Skeeper Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.SkeeperDocument
	 * @generated
	 */
	public Adapter createSkeeperDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.EmacsPackage <em>Emacs Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.EmacsPackage
	 * @generated
	 */
	public Adapter createEmacsPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstDesktop <em>Postinst Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstDesktop
	 * @generated
	 */
	public Adapter createPostinstDesktopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstDocBase <em>Postinst Doc Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstDocBase
	 * @generated
	 */
	public Adapter createPostinstDocBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstEmacsen <em>Postinst Emacsen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstEmacsen
	 * @generated
	 */
	public Adapter createPostinstEmacsenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstGconf <em>Postinst Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstGconf
	 * @generated
	 */
	public Adapter createPostinstGconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstGconfDefaults <em>Postinst Gconf Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstGconfDefaults
	 * @generated
	 */
	public Adapter createPostinstGconfDefaultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstIcons <em>Postinst Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstIcons
	 * @generated
	 */
	public Adapter createPostinstIconsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstInfo <em>Postinst Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstInfo
	 * @generated
	 */
	public Adapter createPostinstInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstInit <em>Postinst Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstInit
	 * @generated
	 */
	public Adapter createPostinstInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstInitNostart <em>Postinst Init Nostart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstInitNostart
	 * @generated
	 */
	public Adapter createPostinstInitNostartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstInitRestart <em>Postinst Init Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstInitRestart
	 * @generated
	 */
	public Adapter createPostinstInitRestartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstMakeshlibs <em>Postinst Makeshlibs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstMakeshlibs
	 * @generated
	 */
	public Adapter createPostinstMakeshlibsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstMenu <em>Postinst Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstMenu
	 * @generated
	 */
	public Adapter createPostinstMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstMenuMethod <em>Postinst Menu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstMenuMethod
	 * @generated
	 */
	public Adapter createPostinstMenuMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstMime <em>Postinst Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstMime
	 * @generated
	 */
	public Adapter createPostinstMimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstModules <em>Postinst Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstModules
	 * @generated
	 */
	public Adapter createPostinstModulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstPython <em>Postinst Python</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstPython
	 * @generated
	 */
	public Adapter createPostinstPythonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstScrollkeeper <em>Postinst Scrollkeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstScrollkeeper
	 * @generated
	 */
	public Adapter createPostinstScrollkeeperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstSgmlcatalog <em>Postinst Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstSgmlcatalog
	 * @generated
	 */
	public Adapter createPostinstSgmlcatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstSharedmimeinfo <em>Postinst Sharedmimeinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstSharedmimeinfo
	 * @generated
	 */
	public Adapter createPostinstSharedmimeinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstSuid <em>Postinst Suid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstSuid
	 * @generated
	 */
	public Adapter createPostinstSuidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstUdev <em>Postinst Udev</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstUdev
	 * @generated
	 */
	public Adapter createPostinstUdevAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstUsrlocal <em>Postinst Usrlocal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstUsrlocal
	 * @generated
	 */
	public Adapter createPostinstUsrlocalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstWm <em>Postinst Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstWm
	 * @generated
	 */
	public Adapter createPostinstWmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstWmNoman <em>Postinst Wm Noman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstWmNoman
	 * @generated
	 */
	public Adapter createPostinstWmNomanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostinstXfonts <em>Postinst Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostinstXfonts
	 * @generated
	 */
	public Adapter createPostinstXfontsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmDebconf <em>Postrm Debconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmDebconf
	 * @generated
	 */
	public Adapter createPostrmDebconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmDesktop <em>Postrm Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmDesktop
	 * @generated
	 */
	public Adapter createPostrmDesktopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmGconf <em>Postrm Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmGconf
	 * @generated
	 */
	public Adapter createPostrmGconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmGconfDefaults <em>Postrm Gconf Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmGconfDefaults
	 * @generated
	 */
	public Adapter createPostrmGconfDefaultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmIcons <em>Postrm Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmIcons
	 * @generated
	 */
	public Adapter createPostrmIconsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmInit <em>Postrm Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmInit
	 * @generated
	 */
	public Adapter createPostrmInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmMakeshlibs <em>Postrm Makeshlibs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmMakeshlibs
	 * @generated
	 */
	public Adapter createPostrmMakeshlibsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmMenu <em>Postrm Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmMenu
	 * @generated
	 */
	public Adapter createPostrmMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmMenuMethod <em>Postrm Menu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmMenuMethod
	 * @generated
	 */
	public Adapter createPostrmMenuMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmMime <em>Postrm Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmMime
	 * @generated
	 */
	public Adapter createPostrmMimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmModules <em>Postrm Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmModules
	 * @generated
	 */
	public Adapter createPostrmModulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmScrollkeeper <em>Postrm Scrollkeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmScrollkeeper
	 * @generated
	 */
	public Adapter createPostrmScrollkeeperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmSgmlcatalog <em>Postrm Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmSgmlcatalog
	 * @generated
	 */
	public Adapter createPostrmSgmlcatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmSharedmimeinfo <em>Postrm Sharedmimeinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmSharedmimeinfo
	 * @generated
	 */
	public Adapter createPostrmSharedmimeinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmSuid <em>Postrm Suid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmSuid
	 * @generated
	 */
	public Adapter createPostrmSuidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PostrmXfonts <em>Postrm Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PostrmXfonts
	 * @generated
	 */
	public Adapter createPostrmXfontsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PreinstUdev <em>Preinst Udev</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PreinstUdev
	 * @generated
	 */
	public Adapter createPreinstUdevAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PreinstUser <em>Preinst User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PreinstUser
	 * @generated
	 */
	public Adapter createPreinstUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PrermDocBase <em>Prerm Doc Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PrermDocBase
	 * @generated
	 */
	public Adapter createPrermDocBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PrermEmacsen <em>Prerm Emacsen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PrermEmacsen
	 * @generated
	 */
	public Adapter createPrermEmacsenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PrermGconf <em>Prerm Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PrermGconf
	 * @generated
	 */
	public Adapter createPrermGconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PrermInfo <em>Prerm Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PrermInfo
	 * @generated
	 */
	public Adapter createPrermInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PrermInit <em>Prerm Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PrermInit
	 * @generated
	 */
	public Adapter createPrermInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PrermInitNorestart <em>Prerm Init Norestart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PrermInitNorestart
	 * @generated
	 */
	public Adapter createPrermInitNorestartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PrermPython <em>Prerm Python</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PrermPython
	 * @generated
	 */
	public Adapter createPrermPythonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PrermSgmlcatalog <em>Prerm Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PrermSgmlcatalog
	 * @generated
	 */
	public Adapter createPrermSgmlcatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PrermUsrlocal <em>Prerm Usrlocal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PrermUsrlocal
	 * @generated
	 */
	public Adapter createPrermUsrlocalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.PrermWm <em>Prerm Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.PrermWm
	 * @generated
	 */
	public Adapter createPrermWmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Param
	 * @generated
	 */
	public Adapter createParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.StringParam <em>String Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.StringParam
	 * @generated
	 */
	public Adapter createStringParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.IntParam <em>Int Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.IntParam
	 * @generated
	 */
	public Adapter createIntParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.SingleConflict <em>Single Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.SingleConflict
	 * @generated
	 */
	public Adapter createSingleConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.Conflict
	 * @generated
	 */
	public Adapter createConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.AndConflict <em>And Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.AndConflict
	 * @generated
	 */
	public Adapter createAndConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mancoosi.OrConflict <em>Or Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mancoosi.OrConflict
	 * @generated
	 */
	public Adapter createOrConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MancoosiAdapterFactory
