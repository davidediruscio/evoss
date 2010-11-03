/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.util;

import it.univaq.mancoosi.packagemm.AddAlternative;
import it.univaq.mancoosi.packagemm.AdditionEnvironmentStatement;
import it.univaq.mancoosi.packagemm.AdditionFileSystemStatement;
import it.univaq.mancoosi.packagemm.AdditionPackageSettingStatement;
import it.univaq.mancoosi.packagemm.AndBooleanExpression;
import it.univaq.mancoosi.packagemm.AndConflict;
import it.univaq.mancoosi.packagemm.AndDep;
import it.univaq.mancoosi.packagemm.Assignment;
import it.univaq.mancoosi.packagemm.BasicCase;
import it.univaq.mancoosi.packagemm.BasicCaseCondition;
import it.univaq.mancoosi.packagemm.BooleanExpression;
import it.univaq.mancoosi.packagemm.Case;
import it.univaq.mancoosi.packagemm.CasePostinst;
import it.univaq.mancoosi.packagemm.CasePostinstCondition;
import it.univaq.mancoosi.packagemm.CasePostrm;
import it.univaq.mancoosi.packagemm.CasePostrmCondition;
import it.univaq.mancoosi.packagemm.CasePreinst;
import it.univaq.mancoosi.packagemm.CasePreinstCondition;
import it.univaq.mancoosi.packagemm.CasePrerm;
import it.univaq.mancoosi.packagemm.CasePrermCondition;
import it.univaq.mancoosi.packagemm.Comment;
import it.univaq.mancoosi.packagemm.Condition;
import it.univaq.mancoosi.packagemm.ConfigScript;
import it.univaq.mancoosi.packagemm.Conflict;
import it.univaq.mancoosi.packagemm.ControlStatement;
import it.univaq.mancoosi.packagemm.DefaultCaseCondition;
import it.univaq.mancoosi.packagemm.DeletionEnvironmentStatement;
import it.univaq.mancoosi.packagemm.DeletionFileSystemStatement;
import it.univaq.mancoosi.packagemm.DeletionPackageSettingStatement;
import it.univaq.mancoosi.packagemm.Dependence;
import it.univaq.mancoosi.packagemm.DirectoryIterator;
import it.univaq.mancoosi.packagemm.DocumentationFile;
import it.univaq.mancoosi.packagemm.Enumeration;
import it.univaq.mancoosi.packagemm.EnumerationElement;
import it.univaq.mancoosi.packagemm.EnumerationIterator;
import it.univaq.mancoosi.packagemm.EnvironmentStatement;
import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.packagemm.FileBlockDeviceBoolean;
import it.univaq.mancoosi.packagemm.FileCharacterDeviceBoolean;
import it.univaq.mancoosi.packagemm.FileContentIterator;
import it.univaq.mancoosi.packagemm.FileExecutePermissionBoolean;
import it.univaq.mancoosi.packagemm.FileExistsBoolean;
import it.univaq.mancoosi.packagemm.FileNotZeroSizeBoolean;
import it.univaq.mancoosi.packagemm.FilePipeBoolean;
import it.univaq.mancoosi.packagemm.FileReadPermissionBoolean;
import it.univaq.mancoosi.packagemm.FileSocketBoolean;
import it.univaq.mancoosi.packagemm.FileSymbolicLinkBoolean;
import it.univaq.mancoosi.packagemm.FileSystemStatement;
import it.univaq.mancoosi.packagemm.FileTerminalDeviceBoolean;
import it.univaq.mancoosi.packagemm.FileWritePermissionBoolean;
import it.univaq.mancoosi.packagemm.If;
import it.univaq.mancoosi.packagemm.InformationFile;
import it.univaq.mancoosi.packagemm.InputParameter;
import it.univaq.mancoosi.packagemm.InputParameterIterator;
import it.univaq.mancoosi.packagemm.IntParam;
import it.univaq.mancoosi.packagemm.IntegerEqualBoolean;
import it.univaq.mancoosi.packagemm.IntegerGreaterBoolean;
import it.univaq.mancoosi.packagemm.IntegerGreaterEqualBoolean;
import it.univaq.mancoosi.packagemm.IntegerLessBoolean;
import it.univaq.mancoosi.packagemm.IntegerLessEqualBoolean;
import it.univaq.mancoosi.packagemm.IntegerNotEqualBoolean;
import it.univaq.mancoosi.packagemm.IsDirectoryBoolean;
import it.univaq.mancoosi.packagemm.Iterator;
import it.univaq.mancoosi.packagemm.Message;
import it.univaq.mancoosi.packagemm.NamedElement;
import it.univaq.mancoosi.packagemm.NeutralStatement;
import it.univaq.mancoosi.packagemm.OrBooleanExpression;
import it.univaq.mancoosi.packagemm.OrConflict;
import it.univaq.mancoosi.packagemm.OrDep;
import it.univaq.mancoosi.packagemm.PackageSettingStatement;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.Param;
import it.univaq.mancoosi.packagemm.PostinstAddAlternative;
import it.univaq.mancoosi.packagemm.PostinstDesktop;
import it.univaq.mancoosi.packagemm.PostinstDocBase;
import it.univaq.mancoosi.packagemm.PostinstEmacsen;
import it.univaq.mancoosi.packagemm.PostinstGconf;
import it.univaq.mancoosi.packagemm.PostinstGconfDefaults;
import it.univaq.mancoosi.packagemm.PostinstIcons;
import it.univaq.mancoosi.packagemm.PostinstInfo;
import it.univaq.mancoosi.packagemm.PostinstInit;
import it.univaq.mancoosi.packagemm.PostinstInitNostart;
import it.univaq.mancoosi.packagemm.PostinstInitRestart;
import it.univaq.mancoosi.packagemm.PostinstMakeshlibs;
import it.univaq.mancoosi.packagemm.PostinstMenu;
import it.univaq.mancoosi.packagemm.PostinstMenuMethod;
import it.univaq.mancoosi.packagemm.PostinstMime;
import it.univaq.mancoosi.packagemm.PostinstModules;
import it.univaq.mancoosi.packagemm.PostinstPython;
import it.univaq.mancoosi.packagemm.PostinstScript;
import it.univaq.mancoosi.packagemm.PostinstScrollkeeper;
import it.univaq.mancoosi.packagemm.PostinstSgmlcatalog;
import it.univaq.mancoosi.packagemm.PostinstSharedmimeinfo;
import it.univaq.mancoosi.packagemm.PostinstSuid;
import it.univaq.mancoosi.packagemm.PostinstUdev;
import it.univaq.mancoosi.packagemm.PostinstUsrlocal;
import it.univaq.mancoosi.packagemm.PostinstWm;
import it.univaq.mancoosi.packagemm.PostinstWmNoman;
import it.univaq.mancoosi.packagemm.PostinstXfonts;
import it.univaq.mancoosi.packagemm.PostrmDebconf;
import it.univaq.mancoosi.packagemm.PostrmDesktop;
import it.univaq.mancoosi.packagemm.PostrmGconf;
import it.univaq.mancoosi.packagemm.PostrmGconfDefaults;
import it.univaq.mancoosi.packagemm.PostrmIcons;
import it.univaq.mancoosi.packagemm.PostrmInit;
import it.univaq.mancoosi.packagemm.PostrmMakeshlibs;
import it.univaq.mancoosi.packagemm.PostrmMenu;
import it.univaq.mancoosi.packagemm.PostrmMenuMethod;
import it.univaq.mancoosi.packagemm.PostrmMime;
import it.univaq.mancoosi.packagemm.PostrmModules;
import it.univaq.mancoosi.packagemm.PostrmScript;
import it.univaq.mancoosi.packagemm.PostrmScrollkeeper;
import it.univaq.mancoosi.packagemm.PostrmSgmlcatalog;
import it.univaq.mancoosi.packagemm.PostrmSharedmimeinfo;
import it.univaq.mancoosi.packagemm.PostrmSuid;
import it.univaq.mancoosi.packagemm.PostrmXfonts;
import it.univaq.mancoosi.packagemm.PreinstScript;
import it.univaq.mancoosi.packagemm.PreinstUdev;
import it.univaq.mancoosi.packagemm.PreinstUser;
import it.univaq.mancoosi.packagemm.PrermDocBase;
import it.univaq.mancoosi.packagemm.PrermEmacsen;
import it.univaq.mancoosi.packagemm.PrermGconf;
import it.univaq.mancoosi.packagemm.PrermInfo;
import it.univaq.mancoosi.packagemm.PrermInit;
import it.univaq.mancoosi.packagemm.PrermInitNorestart;
import it.univaq.mancoosi.packagemm.PrermPython;
import it.univaq.mancoosi.packagemm.PrermScript;
import it.univaq.mancoosi.packagemm.PrermSgmlcatalog;
import it.univaq.mancoosi.packagemm.PrermUsrlocal;
import it.univaq.mancoosi.packagemm.PrermWm;
import it.univaq.mancoosi.packagemm.RegularFileBoolean;
import it.univaq.mancoosi.packagemm.Return;
import it.univaq.mancoosi.packagemm.Script;
import it.univaq.mancoosi.packagemm.SingleConflict;
import it.univaq.mancoosi.packagemm.SingleDep;
import it.univaq.mancoosi.packagemm.Statement;
import it.univaq.mancoosi.packagemm.StatementBoolean;
import it.univaq.mancoosi.packagemm.StatementExistsBoolean;
import it.univaq.mancoosi.packagemm.StrinNotNullBoolean;
import it.univaq.mancoosi.packagemm.StringEqualBoolean;
import it.univaq.mancoosi.packagemm.StringGreaterBoolean;
import it.univaq.mancoosi.packagemm.StringIterator;
import it.univaq.mancoosi.packagemm.StringLessBoolean;
import it.univaq.mancoosi.packagemm.StringNotEqualBoolean;
import it.univaq.mancoosi.packagemm.StringNullBoolean;
import it.univaq.mancoosi.packagemm.StringParam;
import it.univaq.mancoosi.packagemm.UpdateEnvironmentStatement;
import it.univaq.mancoosi.packagemm.UpdateFileSystemStatement;
import it.univaq.mancoosi.packagemm.UpdatePackageSettingStatement;
import it.univaq.mancoosi.packagemm.UpdatePythonModules;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage
 * @generated
 */
public class PackagemmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PackagemmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagemmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PackagemmPackage.eINSTANCE;
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
	@Override
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
	protected PackagemmSwitch<Adapter> modelSwitch =
		new PackagemmSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePackage(it.univaq.mancoosi.packagemm.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseInputParameter(InputParameter object) {
				return createInputParameterAdapter();
			}
			@Override
			public Adapter caseDependence(Dependence object) {
				return createDependenceAdapter();
			}
			@Override
			public Adapter caseAndDep(AndDep object) {
				return createAndDepAdapter();
			}
			@Override
			public Adapter caseOrDep(OrDep object) {
				return createOrDepAdapter();
			}
			@Override
			public Adapter caseSingleDep(SingleDep object) {
				return createSingleDepAdapter();
			}
			@Override
			public Adapter casePreinstScript(PreinstScript object) {
				return createPreinstScriptAdapter();
			}
			@Override
			public Adapter casePostinstScript(PostinstScript object) {
				return createPostinstScriptAdapter();
			}
			@Override
			public Adapter casePrermScript(PrermScript object) {
				return createPrermScriptAdapter();
			}
			@Override
			public Adapter casePostrmScript(PostrmScript object) {
				return createPostrmScriptAdapter();
			}
			@Override
			public Adapter caseConfigScript(ConfigScript object) {
				return createConfigScriptAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseControlStatement(ControlStatement object) {
				return createControlStatementAdapter();
			}
			@Override
			public Adapter caseCase(Case object) {
				return createCaseAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseDefaultCaseCondition(DefaultCaseCondition object) {
				return createDefaultCaseConditionAdapter();
			}
			@Override
			public Adapter caseCasePrerm(CasePrerm object) {
				return createCasePrermAdapter();
			}
			@Override
			public Adapter caseCasePrermCondition(CasePrermCondition object) {
				return createCasePrermConditionAdapter();
			}
			@Override
			public Adapter caseCasePostrm(CasePostrm object) {
				return createCasePostrmAdapter();
			}
			@Override
			public Adapter caseCasePostrmCondition(CasePostrmCondition object) {
				return createCasePostrmConditionAdapter();
			}
			@Override
			public Adapter caseCasePreinst(CasePreinst object) {
				return createCasePreinstAdapter();
			}
			@Override
			public Adapter caseCasePreinstCondition(CasePreinstCondition object) {
				return createCasePreinstConditionAdapter();
			}
			@Override
			public Adapter caseCasePostinst(CasePostinst object) {
				return createCasePostinstAdapter();
			}
			@Override
			public Adapter caseCasePostinstCondition(CasePostinstCondition object) {
				return createCasePostinstConditionAdapter();
			}
			@Override
			public Adapter caseBasicCase(BasicCase object) {
				return createBasicCaseAdapter();
			}
			@Override
			public Adapter caseBasicCaseCondition(BasicCaseCondition object) {
				return createBasicCaseConditionAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseFileExistsBoolean(FileExistsBoolean object) {
				return createFileExistsBooleanAdapter();
			}
			@Override
			public Adapter caseRegularFileBoolean(RegularFileBoolean object) {
				return createRegularFileBooleanAdapter();
			}
			@Override
			public Adapter caseFileNotZeroSizeBoolean(FileNotZeroSizeBoolean object) {
				return createFileNotZeroSizeBooleanAdapter();
			}
			@Override
			public Adapter caseIsDirectoryBoolean(IsDirectoryBoolean object) {
				return createIsDirectoryBooleanAdapter();
			}
			@Override
			public Adapter caseFileBlockDeviceBoolean(FileBlockDeviceBoolean object) {
				return createFileBlockDeviceBooleanAdapter();
			}
			@Override
			public Adapter caseFileCharacterDeviceBoolean(FileCharacterDeviceBoolean object) {
				return createFileCharacterDeviceBooleanAdapter();
			}
			@Override
			public Adapter caseFilePipeBoolean(FilePipeBoolean object) {
				return createFilePipeBooleanAdapter();
			}
			@Override
			public Adapter caseFileSymbolicLinkBoolean(FileSymbolicLinkBoolean object) {
				return createFileSymbolicLinkBooleanAdapter();
			}
			@Override
			public Adapter caseFileSocketBoolean(FileSocketBoolean object) {
				return createFileSocketBooleanAdapter();
			}
			@Override
			public Adapter caseFileTerminalDeviceBoolean(FileTerminalDeviceBoolean object) {
				return createFileTerminalDeviceBooleanAdapter();
			}
			@Override
			public Adapter caseFileReadPermissionBoolean(FileReadPermissionBoolean object) {
				return createFileReadPermissionBooleanAdapter();
			}
			@Override
			public Adapter caseFileWritePermissionBoolean(FileWritePermissionBoolean object) {
				return createFileWritePermissionBooleanAdapter();
			}
			@Override
			public Adapter caseFileExecutePermissionBoolean(FileExecutePermissionBoolean object) {
				return createFileExecutePermissionBooleanAdapter();
			}
			@Override
			public Adapter caseIntegerEqualBoolean(IntegerEqualBoolean object) {
				return createIntegerEqualBooleanAdapter();
			}
			@Override
			public Adapter caseIntegerNotEqualBoolean(IntegerNotEqualBoolean object) {
				return createIntegerNotEqualBooleanAdapter();
			}
			@Override
			public Adapter caseIntegerGreaterBoolean(IntegerGreaterBoolean object) {
				return createIntegerGreaterBooleanAdapter();
			}
			@Override
			public Adapter caseIntegerGreaterEqualBoolean(IntegerGreaterEqualBoolean object) {
				return createIntegerGreaterEqualBooleanAdapter();
			}
			@Override
			public Adapter caseIntegerLessBoolean(IntegerLessBoolean object) {
				return createIntegerLessBooleanAdapter();
			}
			@Override
			public Adapter caseIntegerLessEqualBoolean(IntegerLessEqualBoolean object) {
				return createIntegerLessEqualBooleanAdapter();
			}
			@Override
			public Adapter caseStringEqualBoolean(StringEqualBoolean object) {
				return createStringEqualBooleanAdapter();
			}
			@Override
			public Adapter caseStringNotEqualBoolean(StringNotEqualBoolean object) {
				return createStringNotEqualBooleanAdapter();
			}
			@Override
			public Adapter caseStringGreaterBoolean(StringGreaterBoolean object) {
				return createStringGreaterBooleanAdapter();
			}
			@Override
			public Adapter caseStringLessBoolean(StringLessBoolean object) {
				return createStringLessBooleanAdapter();
			}
			@Override
			public Adapter caseStrinNotNullBoolean(StrinNotNullBoolean object) {
				return createStrinNotNullBooleanAdapter();
			}
			@Override
			public Adapter caseStringNullBoolean(StringNullBoolean object) {
				return createStringNullBooleanAdapter();
			}
			@Override
			public Adapter caseAndBooleanExpression(AndBooleanExpression object) {
				return createAndBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseOrBooleanExpression(OrBooleanExpression object) {
				return createOrBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseStatementBoolean(StatementBoolean object) {
				return createStatementBooleanAdapter();
			}
			@Override
			public Adapter caseStatementExistsBoolean(StatementExistsBoolean object) {
				return createStatementExistsBooleanAdapter();
			}
			@Override
			public Adapter caseReturn(Return object) {
				return createReturnAdapter();
			}
			@Override
			public Adapter caseIterator(Iterator object) {
				return createIteratorAdapter();
			}
			@Override
			public Adapter caseDirectoryIterator(DirectoryIterator object) {
				return createDirectoryIteratorAdapter();
			}
			@Override
			public Adapter caseFileContentIterator(FileContentIterator object) {
				return createFileContentIteratorAdapter();
			}
			@Override
			public Adapter caseInputParameterIterator(InputParameterIterator object) {
				return createInputParameterIteratorAdapter();
			}
			@Override
			public Adapter caseEnumerationIterator(EnumerationIterator object) {
				return createEnumerationIteratorAdapter();
			}
			@Override
			public Adapter caseStringIterator(StringIterator object) {
				return createStringIteratorAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumerationElement(EnumerationElement object) {
				return createEnumerationElementAdapter();
			}
			@Override
			public Adapter caseFileSystemStatement(FileSystemStatement object) {
				return createFileSystemStatementAdapter();
			}
			@Override
			public Adapter caseAdditionFileSystemStatement(AdditionFileSystemStatement object) {
				return createAdditionFileSystemStatementAdapter();
			}
			@Override
			public Adapter caseDeletionFileSystemStatement(DeletionFileSystemStatement object) {
				return createDeletionFileSystemStatementAdapter();
			}
			@Override
			public Adapter caseUpdateFileSystemStatement(UpdateFileSystemStatement object) {
				return createUpdateFileSystemStatementAdapter();
			}
			@Override
			public Adapter caseEnvironmentStatement(EnvironmentStatement object) {
				return createEnvironmentStatementAdapter();
			}
			@Override
			public Adapter caseAdditionEnvironmentStatement(AdditionEnvironmentStatement object) {
				return createAdditionEnvironmentStatementAdapter();
			}
			@Override
			public Adapter caseDeletionEnvironmentStatement(DeletionEnvironmentStatement object) {
				return createDeletionEnvironmentStatementAdapter();
			}
			@Override
			public Adapter caseUpdateEnvironmentStatement(UpdateEnvironmentStatement object) {
				return createUpdateEnvironmentStatementAdapter();
			}
			@Override
			public Adapter casePackageSettingStatement(PackageSettingStatement object) {
				return createPackageSettingStatementAdapter();
			}
			@Override
			public Adapter caseAdditionPackageSettingStatement(AdditionPackageSettingStatement object) {
				return createAdditionPackageSettingStatementAdapter();
			}
			@Override
			public Adapter caseDeletionPackageSettingStatement(DeletionPackageSettingStatement object) {
				return createDeletionPackageSettingStatementAdapter();
			}
			@Override
			public Adapter caseUpdatePackageSettingStatement(UpdatePackageSettingStatement object) {
				return createUpdatePackageSettingStatementAdapter();
			}
			@Override
			public Adapter caseNeutralStatement(NeutralStatement object) {
				return createNeutralStatementAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseDocumentationFile(DocumentationFile object) {
				return createDocumentationFileAdapter();
			}
			@Override
			public Adapter caseInformationFile(InformationFile object) {
				return createInformationFileAdapter();
			}
			@Override
			public Adapter casePostinstDesktop(PostinstDesktop object) {
				return createPostinstDesktopAdapter();
			}
			@Override
			public Adapter casePostinstDocBase(PostinstDocBase object) {
				return createPostinstDocBaseAdapter();
			}
			@Override
			public Adapter casePostinstEmacsen(PostinstEmacsen object) {
				return createPostinstEmacsenAdapter();
			}
			@Override
			public Adapter casePostinstGconf(PostinstGconf object) {
				return createPostinstGconfAdapter();
			}
			@Override
			public Adapter casePostinstGconfDefaults(PostinstGconfDefaults object) {
				return createPostinstGconfDefaultsAdapter();
			}
			@Override
			public Adapter casePostinstIcons(PostinstIcons object) {
				return createPostinstIconsAdapter();
			}
			@Override
			public Adapter casePostinstInfo(PostinstInfo object) {
				return createPostinstInfoAdapter();
			}
			@Override
			public Adapter casePostinstInit(PostinstInit object) {
				return createPostinstInitAdapter();
			}
			@Override
			public Adapter casePostinstInitNostart(PostinstInitNostart object) {
				return createPostinstInitNostartAdapter();
			}
			@Override
			public Adapter casePostinstInitRestart(PostinstInitRestart object) {
				return createPostinstInitRestartAdapter();
			}
			@Override
			public Adapter casePostinstMakeshlibs(PostinstMakeshlibs object) {
				return createPostinstMakeshlibsAdapter();
			}
			@Override
			public Adapter casePostinstMenu(PostinstMenu object) {
				return createPostinstMenuAdapter();
			}
			@Override
			public Adapter casePostinstMenuMethod(PostinstMenuMethod object) {
				return createPostinstMenuMethodAdapter();
			}
			@Override
			public Adapter casePostinstMime(PostinstMime object) {
				return createPostinstMimeAdapter();
			}
			@Override
			public Adapter casePostinstModules(PostinstModules object) {
				return createPostinstModulesAdapter();
			}
			@Override
			public Adapter casePostinstPython(PostinstPython object) {
				return createPostinstPythonAdapter();
			}
			@Override
			public Adapter casePostinstScrollkeeper(PostinstScrollkeeper object) {
				return createPostinstScrollkeeperAdapter();
			}
			@Override
			public Adapter casePostinstSgmlcatalog(PostinstSgmlcatalog object) {
				return createPostinstSgmlcatalogAdapter();
			}
			@Override
			public Adapter casePostinstSharedmimeinfo(PostinstSharedmimeinfo object) {
				return createPostinstSharedmimeinfoAdapter();
			}
			@Override
			public Adapter casePostinstSuid(PostinstSuid object) {
				return createPostinstSuidAdapter();
			}
			@Override
			public Adapter casePostinstUdev(PostinstUdev object) {
				return createPostinstUdevAdapter();
			}
			@Override
			public Adapter casePostinstUsrlocal(PostinstUsrlocal object) {
				return createPostinstUsrlocalAdapter();
			}
			@Override
			public Adapter casePostinstWm(PostinstWm object) {
				return createPostinstWmAdapter();
			}
			@Override
			public Adapter casePostinstWmNoman(PostinstWmNoman object) {
				return createPostinstWmNomanAdapter();
			}
			@Override
			public Adapter casePostinstXfonts(PostinstXfonts object) {
				return createPostinstXfontsAdapter();
			}
			@Override
			public Adapter casePostrmDebconf(PostrmDebconf object) {
				return createPostrmDebconfAdapter();
			}
			@Override
			public Adapter casePostrmDesktop(PostrmDesktop object) {
				return createPostrmDesktopAdapter();
			}
			@Override
			public Adapter casePostrmGconf(PostrmGconf object) {
				return createPostrmGconfAdapter();
			}
			@Override
			public Adapter casePostrmGconfDefaults(PostrmGconfDefaults object) {
				return createPostrmGconfDefaultsAdapter();
			}
			@Override
			public Adapter casePostrmIcons(PostrmIcons object) {
				return createPostrmIconsAdapter();
			}
			@Override
			public Adapter casePostrmInit(PostrmInit object) {
				return createPostrmInitAdapter();
			}
			@Override
			public Adapter casePostrmMakeshlibs(PostrmMakeshlibs object) {
				return createPostrmMakeshlibsAdapter();
			}
			@Override
			public Adapter casePostrmMenu(PostrmMenu object) {
				return createPostrmMenuAdapter();
			}
			@Override
			public Adapter casePostrmMenuMethod(PostrmMenuMethod object) {
				return createPostrmMenuMethodAdapter();
			}
			@Override
			public Adapter casePostrmMime(PostrmMime object) {
				return createPostrmMimeAdapter();
			}
			@Override
			public Adapter casePostrmModules(PostrmModules object) {
				return createPostrmModulesAdapter();
			}
			@Override
			public Adapter casePostrmScrollkeeper(PostrmScrollkeeper object) {
				return createPostrmScrollkeeperAdapter();
			}
			@Override
			public Adapter casePostrmSgmlcatalog(PostrmSgmlcatalog object) {
				return createPostrmSgmlcatalogAdapter();
			}
			@Override
			public Adapter casePostrmSharedmimeinfo(PostrmSharedmimeinfo object) {
				return createPostrmSharedmimeinfoAdapter();
			}
			@Override
			public Adapter casePostrmSuid(PostrmSuid object) {
				return createPostrmSuidAdapter();
			}
			@Override
			public Adapter casePostrmXfonts(PostrmXfonts object) {
				return createPostrmXfontsAdapter();
			}
			@Override
			public Adapter casePreinstUdev(PreinstUdev object) {
				return createPreinstUdevAdapter();
			}
			@Override
			public Adapter casePreinstUser(PreinstUser object) {
				return createPreinstUserAdapter();
			}
			@Override
			public Adapter casePrermDocBase(PrermDocBase object) {
				return createPrermDocBaseAdapter();
			}
			@Override
			public Adapter casePrermEmacsen(PrermEmacsen object) {
				return createPrermEmacsenAdapter();
			}
			@Override
			public Adapter casePrermGconf(PrermGconf object) {
				return createPrermGconfAdapter();
			}
			@Override
			public Adapter casePrermInfo(PrermInfo object) {
				return createPrermInfoAdapter();
			}
			@Override
			public Adapter casePrermInit(PrermInit object) {
				return createPrermInitAdapter();
			}
			@Override
			public Adapter casePrermInitNorestart(PrermInitNorestart object) {
				return createPrermInitNorestartAdapter();
			}
			@Override
			public Adapter casePrermPython(PrermPython object) {
				return createPrermPythonAdapter();
			}
			@Override
			public Adapter casePrermSgmlcatalog(PrermSgmlcatalog object) {
				return createPrermSgmlcatalogAdapter();
			}
			@Override
			public Adapter casePrermUsrlocal(PrermUsrlocal object) {
				return createPrermUsrlocalAdapter();
			}
			@Override
			public Adapter casePrermWm(PrermWm object) {
				return createPrermWmAdapter();
			}
			@Override
			public Adapter caseUpdatePythonModules(UpdatePythonModules object) {
				return createUpdatePythonModulesAdapter();
			}
			@Override
			public Adapter casePostinstAddAlternative(PostinstAddAlternative object) {
				return createPostinstAddAlternativeAdapter();
			}
			@Override
			public Adapter caseAddAlternative(AddAlternative object) {
				return createAddAlternativeAdapter();
			}
			@Override
			public Adapter caseParam(Param object) {
				return createParamAdapter();
			}
			@Override
			public Adapter caseStringParam(StringParam object) {
				return createStringParamAdapter();
			}
			@Override
			public Adapter caseIntParam(IntParam object) {
				return createIntParamAdapter();
			}
			@Override
			public Adapter caseSingleConflict(SingleConflict object) {
				return createSingleConflictAdapter();
			}
			@Override
			public Adapter caseConflict(Conflict object) {
				return createConflictAdapter();
			}
			@Override
			public Adapter caseAndConflict(AndConflict object) {
				return createAndConflictAdapter();
			}
			@Override
			public Adapter caseOrConflict(OrConflict object) {
				return createOrConflictAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.InputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.InputParameter
	 * @generated
	 */
	public Adapter createInputParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Dependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Dependence
	 * @generated
	 */
	public Adapter createDependenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.AndDep <em>And Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.AndDep
	 * @generated
	 */
	public Adapter createAndDepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.OrDep <em>Or Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.OrDep
	 * @generated
	 */
	public Adapter createOrDepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.SingleDep <em>Single Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.SingleDep
	 * @generated
	 */
	public Adapter createSingleDepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PreinstScript <em>Preinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PreinstScript
	 * @generated
	 */
	public Adapter createPreinstScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstScript <em>Postinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstScript
	 * @generated
	 */
	public Adapter createPostinstScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PrermScript <em>Prerm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PrermScript
	 * @generated
	 */
	public Adapter createPrermScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmScript <em>Postrm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmScript
	 * @generated
	 */
	public Adapter createPostrmScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.ConfigScript <em>Config Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.ConfigScript
	 * @generated
	 */
	public Adapter createConfigScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.ControlStatement <em>Control Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.ControlStatement
	 * @generated
	 */
	public Adapter createControlStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Case
	 * @generated
	 */
	public Adapter createCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.DefaultCaseCondition <em>Default Case Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.DefaultCaseCondition
	 * @generated
	 */
	public Adapter createDefaultCaseConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.CasePrerm <em>Case Prerm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.CasePrerm
	 * @generated
	 */
	public Adapter createCasePrermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.CasePrermCondition <em>Case Prerm Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.CasePrermCondition
	 * @generated
	 */
	public Adapter createCasePrermConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.CasePostrm <em>Case Postrm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.CasePostrm
	 * @generated
	 */
	public Adapter createCasePostrmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.CasePostrmCondition <em>Case Postrm Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.CasePostrmCondition
	 * @generated
	 */
	public Adapter createCasePostrmConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.CasePreinst <em>Case Preinst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.CasePreinst
	 * @generated
	 */
	public Adapter createCasePreinstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.CasePreinstCondition <em>Case Preinst Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.CasePreinstCondition
	 * @generated
	 */
	public Adapter createCasePreinstConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.CasePostinst <em>Case Postinst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.CasePostinst
	 * @generated
	 */
	public Adapter createCasePostinstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.CasePostinstCondition <em>Case Postinst Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.CasePostinstCondition
	 * @generated
	 */
	public Adapter createCasePostinstConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.BasicCase <em>Basic Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.BasicCase
	 * @generated
	 */
	public Adapter createBasicCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.BasicCaseCondition <em>Basic Case Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.BasicCaseCondition
	 * @generated
	 */
	public Adapter createBasicCaseConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileExistsBoolean <em>File Exists Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileExistsBoolean
	 * @generated
	 */
	public Adapter createFileExistsBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.RegularFileBoolean <em>Regular File Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.RegularFileBoolean
	 * @generated
	 */
	public Adapter createRegularFileBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileNotZeroSizeBoolean <em>File Not Zero Size Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileNotZeroSizeBoolean
	 * @generated
	 */
	public Adapter createFileNotZeroSizeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.IsDirectoryBoolean <em>Is Directory Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.IsDirectoryBoolean
	 * @generated
	 */
	public Adapter createIsDirectoryBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileBlockDeviceBoolean <em>File Block Device Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileBlockDeviceBoolean
	 * @generated
	 */
	public Adapter createFileBlockDeviceBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileCharacterDeviceBoolean <em>File Character Device Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileCharacterDeviceBoolean
	 * @generated
	 */
	public Adapter createFileCharacterDeviceBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FilePipeBoolean <em>File Pipe Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FilePipeBoolean
	 * @generated
	 */
	public Adapter createFilePipeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileSymbolicLinkBoolean <em>File Symbolic Link Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileSymbolicLinkBoolean
	 * @generated
	 */
	public Adapter createFileSymbolicLinkBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileSocketBoolean <em>File Socket Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileSocketBoolean
	 * @generated
	 */
	public Adapter createFileSocketBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileTerminalDeviceBoolean <em>File Terminal Device Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileTerminalDeviceBoolean
	 * @generated
	 */
	public Adapter createFileTerminalDeviceBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileReadPermissionBoolean <em>File Read Permission Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileReadPermissionBoolean
	 * @generated
	 */
	public Adapter createFileReadPermissionBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileWritePermissionBoolean <em>File Write Permission Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileWritePermissionBoolean
	 * @generated
	 */
	public Adapter createFileWritePermissionBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileExecutePermissionBoolean <em>File Execute Permission Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileExecutePermissionBoolean
	 * @generated
	 */
	public Adapter createFileExecutePermissionBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.IntegerEqualBoolean <em>Integer Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.IntegerEqualBoolean
	 * @generated
	 */
	public Adapter createIntegerEqualBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.IntegerNotEqualBoolean <em>Integer Not Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.IntegerNotEqualBoolean
	 * @generated
	 */
	public Adapter createIntegerNotEqualBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.IntegerGreaterBoolean <em>Integer Greater Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.IntegerGreaterBoolean
	 * @generated
	 */
	public Adapter createIntegerGreaterBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.IntegerGreaterEqualBoolean <em>Integer Greater Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.IntegerGreaterEqualBoolean
	 * @generated
	 */
	public Adapter createIntegerGreaterEqualBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.IntegerLessBoolean <em>Integer Less Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.IntegerLessBoolean
	 * @generated
	 */
	public Adapter createIntegerLessBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.IntegerLessEqualBoolean <em>Integer Less Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.IntegerLessEqualBoolean
	 * @generated
	 */
	public Adapter createIntegerLessEqualBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.StringEqualBoolean <em>String Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.StringEqualBoolean
	 * @generated
	 */
	public Adapter createStringEqualBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.StringNotEqualBoolean <em>String Not Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.StringNotEqualBoolean
	 * @generated
	 */
	public Adapter createStringNotEqualBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.StringGreaterBoolean <em>String Greater Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.StringGreaterBoolean
	 * @generated
	 */
	public Adapter createStringGreaterBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.StringLessBoolean <em>String Less Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.StringLessBoolean
	 * @generated
	 */
	public Adapter createStringLessBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.StrinNotNullBoolean <em>Strin Not Null Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.StrinNotNullBoolean
	 * @generated
	 */
	public Adapter createStrinNotNullBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.StringNullBoolean <em>String Null Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.StringNullBoolean
	 * @generated
	 */
	public Adapter createStringNullBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.AndBooleanExpression <em>And Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.AndBooleanExpression
	 * @generated
	 */
	public Adapter createAndBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.OrBooleanExpression <em>Or Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.OrBooleanExpression
	 * @generated
	 */
	public Adapter createOrBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.StatementBoolean <em>Statement Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.StatementBoolean
	 * @generated
	 */
	public Adapter createStatementBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.StatementExistsBoolean <em>Statement Exists Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.StatementExistsBoolean
	 * @generated
	 */
	public Adapter createStatementExistsBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Return
	 * @generated
	 */
	public Adapter createReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Iterator
	 * @generated
	 */
	public Adapter createIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.DirectoryIterator <em>Directory Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.DirectoryIterator
	 * @generated
	 */
	public Adapter createDirectoryIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileContentIterator <em>File Content Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileContentIterator
	 * @generated
	 */
	public Adapter createFileContentIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.InputParameterIterator <em>Input Parameter Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.InputParameterIterator
	 * @generated
	 */
	public Adapter createInputParameterIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.EnumerationIterator <em>Enumeration Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.EnumerationIterator
	 * @generated
	 */
	public Adapter createEnumerationIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.StringIterator <em>String Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.StringIterator
	 * @generated
	 */
	public Adapter createStringIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.EnumerationElement <em>Enumeration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.EnumerationElement
	 * @generated
	 */
	public Adapter createEnumerationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.FileSystemStatement <em>File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.FileSystemStatement
	 * @generated
	 */
	public Adapter createFileSystemStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.AdditionFileSystemStatement <em>Addition File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.AdditionFileSystemStatement
	 * @generated
	 */
	public Adapter createAdditionFileSystemStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.DeletionFileSystemStatement <em>Deletion File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.DeletionFileSystemStatement
	 * @generated
	 */
	public Adapter createDeletionFileSystemStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.UpdateFileSystemStatement <em>Update File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.UpdateFileSystemStatement
	 * @generated
	 */
	public Adapter createUpdateFileSystemStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.EnvironmentStatement <em>Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.EnvironmentStatement
	 * @generated
	 */
	public Adapter createEnvironmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.AdditionEnvironmentStatement <em>Addition Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.AdditionEnvironmentStatement
	 * @generated
	 */
	public Adapter createAdditionEnvironmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.DeletionEnvironmentStatement <em>Deletion Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.DeletionEnvironmentStatement
	 * @generated
	 */
	public Adapter createDeletionEnvironmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.UpdateEnvironmentStatement <em>Update Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.UpdateEnvironmentStatement
	 * @generated
	 */
	public Adapter createUpdateEnvironmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PackageSettingStatement <em>Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PackageSettingStatement
	 * @generated
	 */
	public Adapter createPackageSettingStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.AdditionPackageSettingStatement <em>Addition Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.AdditionPackageSettingStatement
	 * @generated
	 */
	public Adapter createAdditionPackageSettingStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.DeletionPackageSettingStatement <em>Deletion Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.DeletionPackageSettingStatement
	 * @generated
	 */
	public Adapter createDeletionPackageSettingStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.UpdatePackageSettingStatement <em>Update Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.UpdatePackageSettingStatement
	 * @generated
	 */
	public Adapter createUpdatePackageSettingStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.NeutralStatement <em>Neutral Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.NeutralStatement
	 * @generated
	 */
	public Adapter createNeutralStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.DocumentationFile <em>Documentation File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.DocumentationFile
	 * @generated
	 */
	public Adapter createDocumentationFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.InformationFile <em>Information File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.InformationFile
	 * @generated
	 */
	public Adapter createInformationFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstDesktop <em>Postinst Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstDesktop
	 * @generated
	 */
	public Adapter createPostinstDesktopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstDocBase <em>Postinst Doc Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstDocBase
	 * @generated
	 */
	public Adapter createPostinstDocBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstEmacsen <em>Postinst Emacsen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstEmacsen
	 * @generated
	 */
	public Adapter createPostinstEmacsenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstGconf <em>Postinst Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstGconf
	 * @generated
	 */
	public Adapter createPostinstGconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstGconfDefaults <em>Postinst Gconf Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstGconfDefaults
	 * @generated
	 */
	public Adapter createPostinstGconfDefaultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstIcons <em>Postinst Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstIcons
	 * @generated
	 */
	public Adapter createPostinstIconsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstInfo <em>Postinst Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstInfo
	 * @generated
	 */
	public Adapter createPostinstInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstInit <em>Postinst Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstInit
	 * @generated
	 */
	public Adapter createPostinstInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstInitNostart <em>Postinst Init Nostart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstInitNostart
	 * @generated
	 */
	public Adapter createPostinstInitNostartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstInitRestart <em>Postinst Init Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstInitRestart
	 * @generated
	 */
	public Adapter createPostinstInitRestartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstMakeshlibs <em>Postinst Makeshlibs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstMakeshlibs
	 * @generated
	 */
	public Adapter createPostinstMakeshlibsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstMenu <em>Postinst Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstMenu
	 * @generated
	 */
	public Adapter createPostinstMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstMenuMethod <em>Postinst Menu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstMenuMethod
	 * @generated
	 */
	public Adapter createPostinstMenuMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstMime <em>Postinst Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstMime
	 * @generated
	 */
	public Adapter createPostinstMimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstModules <em>Postinst Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstModules
	 * @generated
	 */
	public Adapter createPostinstModulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstPython <em>Postinst Python</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstPython
	 * @generated
	 */
	public Adapter createPostinstPythonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstScrollkeeper <em>Postinst Scrollkeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstScrollkeeper
	 * @generated
	 */
	public Adapter createPostinstScrollkeeperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstSgmlcatalog <em>Postinst Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstSgmlcatalog
	 * @generated
	 */
	public Adapter createPostinstSgmlcatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstSharedmimeinfo <em>Postinst Sharedmimeinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstSharedmimeinfo
	 * @generated
	 */
	public Adapter createPostinstSharedmimeinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstSuid <em>Postinst Suid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstSuid
	 * @generated
	 */
	public Adapter createPostinstSuidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstUdev <em>Postinst Udev</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstUdev
	 * @generated
	 */
	public Adapter createPostinstUdevAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstUsrlocal <em>Postinst Usrlocal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstUsrlocal
	 * @generated
	 */
	public Adapter createPostinstUsrlocalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstWm <em>Postinst Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstWm
	 * @generated
	 */
	public Adapter createPostinstWmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstWmNoman <em>Postinst Wm Noman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstWmNoman
	 * @generated
	 */
	public Adapter createPostinstWmNomanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstXfonts <em>Postinst Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstXfonts
	 * @generated
	 */
	public Adapter createPostinstXfontsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmDebconf <em>Postrm Debconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmDebconf
	 * @generated
	 */
	public Adapter createPostrmDebconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmDesktop <em>Postrm Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmDesktop
	 * @generated
	 */
	public Adapter createPostrmDesktopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmGconf <em>Postrm Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmGconf
	 * @generated
	 */
	public Adapter createPostrmGconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmGconfDefaults <em>Postrm Gconf Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmGconfDefaults
	 * @generated
	 */
	public Adapter createPostrmGconfDefaultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmIcons <em>Postrm Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmIcons
	 * @generated
	 */
	public Adapter createPostrmIconsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmInit <em>Postrm Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmInit
	 * @generated
	 */
	public Adapter createPostrmInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmMakeshlibs <em>Postrm Makeshlibs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmMakeshlibs
	 * @generated
	 */
	public Adapter createPostrmMakeshlibsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmMenu <em>Postrm Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmMenu
	 * @generated
	 */
	public Adapter createPostrmMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmMenuMethod <em>Postrm Menu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmMenuMethod
	 * @generated
	 */
	public Adapter createPostrmMenuMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmMime <em>Postrm Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmMime
	 * @generated
	 */
	public Adapter createPostrmMimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmModules <em>Postrm Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmModules
	 * @generated
	 */
	public Adapter createPostrmModulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmScrollkeeper <em>Postrm Scrollkeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmScrollkeeper
	 * @generated
	 */
	public Adapter createPostrmScrollkeeperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmSgmlcatalog <em>Postrm Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmSgmlcatalog
	 * @generated
	 */
	public Adapter createPostrmSgmlcatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmSharedmimeinfo <em>Postrm Sharedmimeinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmSharedmimeinfo
	 * @generated
	 */
	public Adapter createPostrmSharedmimeinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmSuid <em>Postrm Suid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmSuid
	 * @generated
	 */
	public Adapter createPostrmSuidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostrmXfonts <em>Postrm Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostrmXfonts
	 * @generated
	 */
	public Adapter createPostrmXfontsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PreinstUdev <em>Preinst Udev</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PreinstUdev
	 * @generated
	 */
	public Adapter createPreinstUdevAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PreinstUser <em>Preinst User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PreinstUser
	 * @generated
	 */
	public Adapter createPreinstUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PrermDocBase <em>Prerm Doc Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PrermDocBase
	 * @generated
	 */
	public Adapter createPrermDocBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PrermEmacsen <em>Prerm Emacsen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PrermEmacsen
	 * @generated
	 */
	public Adapter createPrermEmacsenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PrermGconf <em>Prerm Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PrermGconf
	 * @generated
	 */
	public Adapter createPrermGconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PrermInfo <em>Prerm Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PrermInfo
	 * @generated
	 */
	public Adapter createPrermInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PrermInit <em>Prerm Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PrermInit
	 * @generated
	 */
	public Adapter createPrermInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PrermInitNorestart <em>Prerm Init Norestart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PrermInitNorestart
	 * @generated
	 */
	public Adapter createPrermInitNorestartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PrermPython <em>Prerm Python</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PrermPython
	 * @generated
	 */
	public Adapter createPrermPythonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PrermSgmlcatalog <em>Prerm Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PrermSgmlcatalog
	 * @generated
	 */
	public Adapter createPrermSgmlcatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PrermUsrlocal <em>Prerm Usrlocal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PrermUsrlocal
	 * @generated
	 */
	public Adapter createPrermUsrlocalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PrermWm <em>Prerm Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PrermWm
	 * @generated
	 */
	public Adapter createPrermWmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.UpdatePythonModules <em>Update Python Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.UpdatePythonModules
	 * @generated
	 */
	public Adapter createUpdatePythonModulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.PostinstAddAlternative <em>Postinst Add Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.PostinstAddAlternative
	 * @generated
	 */
	public Adapter createPostinstAddAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.AddAlternative <em>Add Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.AddAlternative
	 * @generated
	 */
	public Adapter createAddAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Param
	 * @generated
	 */
	public Adapter createParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.StringParam <em>String Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.StringParam
	 * @generated
	 */
	public Adapter createStringParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.IntParam <em>Int Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.IntParam
	 * @generated
	 */
	public Adapter createIntParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.SingleConflict <em>Single Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.SingleConflict
	 * @generated
	 */
	public Adapter createSingleConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Conflict
	 * @generated
	 */
	public Adapter createConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.AndConflict <em>And Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.AndConflict
	 * @generated
	 */
	public Adapter createAndConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.OrConflict <em>Or Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.OrConflict
	 * @generated
	 */
	public Adapter createOrConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.mancoosi.packagemm.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.mancoosi.packagemm.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
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

} //PackagemmAdapterFactory
