/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.PackagemmFactory;
import it.univaq.mancoosi.packagemm.PackagemmPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackagemmPackageImpl extends EPackageImpl implements PackagemmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "packagemm.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andDepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orDepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleDepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preinstScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prermScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultCaseConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casePrermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casePrermConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casePostrmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casePostrmConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casePreinstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casePreinstConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casePostinstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casePostinstConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicCaseConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileExistsBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularFileBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileNotZeroSizeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isDirectoryBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileBlockDeviceBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileCharacterDeviceBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filePipeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSymbolicLinkBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSocketBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTerminalDeviceBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileReadPermissionBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileWritePermissionBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileExecutePermissionBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEqualBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerNotEqualBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerGreaterBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerGreaterEqualBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLessBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLessEqualBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEqualBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringNotEqualBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringGreaterBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLessBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strinNotNullBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringNullBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementExistsBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileContentIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParameterIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSystemStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionFileSystemStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletionFileSystemStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateFileSystemStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEnvironmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletionEnvironmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateEnvironmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageSettingStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionPackageSettingStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletionPackageSettingStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updatePackageSettingStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neutralStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstDesktopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstDocBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstEmacsenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstGconfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstGconfDefaultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstIconsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstInitNostartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstInitRestartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstMakeshlibsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstMenuMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstMimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstModulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstPythonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstScrollkeeperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstSgmlcatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstSharedmimeinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstSuidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstUdevEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstUsrlocalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstWmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstWmNomanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstXfontsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmDebconfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmDesktopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmGconfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmGconfDefaultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmIconsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmMakeshlibsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmMenuMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmMimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmModulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmScrollkeeperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmSgmlcatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmSharedmimeinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmSuidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postrmXfontsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preinstUdevEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preinstUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prermDocBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prermEmacsenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prermGconfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prermInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prermInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prermInitNorestartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prermPythonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prermSgmlcatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prermUsrlocalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prermWmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updatePythonModulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postinstAddAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum returnStatementValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum casePrermConditionValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum casePostrmConditionValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum casePreinstConditionValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum casePostinstConditionValueEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PackagemmPackageImpl() {
		super(eNS_URI, PackagemmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PackagemmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static PackagemmPackage init() {
		if (isInited) return (PackagemmPackage)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI);

		// Obtain or create and register package
		PackagemmPackageImpl thePackagemmPackage = (PackagemmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PackagemmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PackagemmPackageImpl());

		isInited = true;

		// Load packages
		thePackagemmPackage.loadPackage();

		// Fix loaded packages
		thePackagemmPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		thePackagemmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PackagemmPackage.eNS_URI, thePackagemmPackage);
		return thePackagemmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		if (namedElementEClass == null) {
			namedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(0);
		}
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		if (packageEClass == null) {
			packageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(1);
		}
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Version() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_InstalledSize() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Maintainer() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Architecture() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_FileSize() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_CheckSum() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Description() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Section() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Tag() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Priority() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Status() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Uploaders() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Recommends() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Suggests() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Enhances() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Predepends() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Replaces() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Files() {
        return (EReference)getPackage().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_DocumentationFiles() {
        return (EReference)getPackage().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PreinstScript() {
        return (EReference)getPackage().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PostinstScript() {
        return (EReference)getPackage().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PrermScript() {
        return (EReference)getPackage().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PostrmScript() {
        return (EReference)getPackage().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ConfigScript() {
        return (EReference)getPackage().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Conflict() {
        return (EReference)getPackage().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Depends() {
        return (EReference)getPackage().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Conffiles() {
        return (EReference)getPackage().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		if (scriptEClass == null) {
			scriptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(2);
		}
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Statements() {
        return (EReference)getScript().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_InputParameters() {
        return (EReference)getScript().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParameter() {
		if (inputParameterEClass == null) {
			inputParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(3);
		}
		return inputParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameter_Script() {
        return (EReference)getInputParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependence() {
		if (dependenceEClass == null) {
			dependenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(4);
		}
		return dependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependence_AndDep() {
        return (EReference)getDependence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependence_OrDep() {
        return (EReference)getDependence().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependence_SingleDep() {
        return (EReference)getDependence().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependence_Pkg() {
        return (EAttribute)getDependence().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndDep() {
		if (andDepEClass == null) {
			andDepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(5);
		}
		return andDepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndDep_Ops() {
        return (EReference)getAndDep().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndDep_Dependence() {
        return (EReference)getAndDep().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrDep() {
		if (orDepEClass == null) {
			orDepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(6);
		}
		return orDepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrDep_Ops() {
        return (EReference)getOrDep().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrDep_Dependence() {
        return (EReference)getOrDep().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleDep() {
		if (singleDepEClass == null) {
			singleDepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(7);
		}
		return singleDepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleDep_Dependence() {
        return (EReference)getSingleDep().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleDep_Version() {
        return (EAttribute)getSingleDep().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleDep_Value() {
        return (EAttribute)getSingleDep().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreinstScript() {
		if (preinstScriptEClass == null) {
			preinstScriptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(8);
		}
		return preinstScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreinstScript_Pkg() {
        return (EReference)getPreinstScript().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstScript() {
		if (postinstScriptEClass == null) {
			postinstScriptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(9);
		}
		return postinstScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstScript_Pkg() {
        return (EReference)getPostinstScript().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrermScript() {
		if (prermScriptEClass == null) {
			prermScriptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(10);
		}
		return prermScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermScript_Pkg() {
        return (EReference)getPrermScript().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmScript() {
		if (postrmScriptEClass == null) {
			postrmScriptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(11);
		}
		return postrmScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostrmScript_Pkg() {
        return (EReference)getPostrmScript().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigScript() {
		if (configScriptEClass == null) {
			configScriptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(12);
		}
		return configScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigScript_Pkg() {
        return (EReference)getConfigScript().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		if (statementEClass == null) {
			statementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(13);
		}
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Script() {
        return (EReference)getStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_IsStart() {
        return (EAttribute)getStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Previous() {
        return (EReference)getStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Next() {
        return (EReference)getStatement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlStatement() {
		if (controlStatementEClass == null) {
			controlStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(14);
		}
		return controlStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		if (caseEClass == null) {
			caseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(15);
		}
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase_Selector() {
        return (EAttribute)getCase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Default() {
        return (EReference)getCase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		if (conditionEClass == null) {
			conditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(16);
		}
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Action() {
        return (EReference)getCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultCaseCondition() {
		if (defaultCaseConditionEClass == null) {
			defaultCaseConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(17);
		}
		return defaultCaseConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasePrerm() {
		if (casePrermEClass == null) {
			casePrermEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(18);
		}
		return casePrermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCasePrerm_Conditions() {
        return (EReference)getCasePrerm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasePrermCondition() {
		if (casePrermConditionEClass == null) {
			casePrermConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(19);
		}
		return casePrermConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCasePrermCondition_Value() {
        return (EAttribute)getCasePrermCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasePostrm() {
		if (casePostrmEClass == null) {
			casePostrmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(20);
		}
		return casePostrmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCasePostrm_Conditions() {
        return (EReference)getCasePostrm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasePostrmCondition() {
		if (casePostrmConditionEClass == null) {
			casePostrmConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(21);
		}
		return casePostrmConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCasePostrmCondition_Value() {
        return (EAttribute)getCasePostrmCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasePreinst() {
		if (casePreinstEClass == null) {
			casePreinstEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(22);
		}
		return casePreinstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCasePreinst_Conditions() {
        return (EReference)getCasePreinst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasePreinstCondition() {
		if (casePreinstConditionEClass == null) {
			casePreinstConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(23);
		}
		return casePreinstConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCasePreinstCondition_Value() {
        return (EAttribute)getCasePreinstCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasePostinst() {
		if (casePostinstEClass == null) {
			casePostinstEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(24);
		}
		return casePostinstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCasePostinst_Conditions() {
        return (EReference)getCasePostinst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasePostinstCondition() {
		if (casePostinstConditionEClass == null) {
			casePostinstConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(25);
		}
		return casePostinstConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCasePostinstCondition_Value() {
        return (EAttribute)getCasePostinstCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicCase() {
		if (basicCaseEClass == null) {
			basicCaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(26);
		}
		return basicCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicCase_Conditions() {
        return (EReference)getBasicCase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicCaseCondition() {
		if (basicCaseConditionEClass == null) {
			basicCaseConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(27);
		}
		return basicCaseConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicCaseCondition_Value() {
        return (EAttribute)getBasicCaseCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		if (ifEClass == null) {
			ifEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(28);
		}
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Condition() {
        return (EReference)getIf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Then() {
        return (EReference)getIf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Else() {
        return (EReference)getIf().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		if (booleanExpressionEClass == null) {
			booleanExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(29);
		}
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanExpression_Not() {
        return (EAttribute)getBooleanExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileExistsBoolean() {
		if (fileExistsBooleanEClass == null) {
			fileExistsBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(30);
		}
		return fileExistsBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileExistsBoolean_File() {
        return (EReference)getFileExistsBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularFileBoolean() {
		if (regularFileBooleanEClass == null) {
			regularFileBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(31);
		}
		return regularFileBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularFileBoolean_File() {
        return (EReference)getRegularFileBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileNotZeroSizeBoolean() {
		if (fileNotZeroSizeBooleanEClass == null) {
			fileNotZeroSizeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(32);
		}
		return fileNotZeroSizeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileNotZeroSizeBoolean_File() {
        return (EReference)getFileNotZeroSizeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsDirectoryBoolean() {
		if (isDirectoryBooleanEClass == null) {
			isDirectoryBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(33);
		}
		return isDirectoryBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsDirectoryBoolean_File() {
        return (EReference)getIsDirectoryBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileBlockDeviceBoolean() {
		if (fileBlockDeviceBooleanEClass == null) {
			fileBlockDeviceBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(34);
		}
		return fileBlockDeviceBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileBlockDeviceBoolean_File() {
        return (EReference)getFileBlockDeviceBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileCharacterDeviceBoolean() {
		if (fileCharacterDeviceBooleanEClass == null) {
			fileCharacterDeviceBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(35);
		}
		return fileCharacterDeviceBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileCharacterDeviceBoolean_File() {
        return (EReference)getFileCharacterDeviceBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilePipeBoolean() {
		if (filePipeBooleanEClass == null) {
			filePipeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(36);
		}
		return filePipeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilePipeBoolean_File() {
        return (EReference)getFilePipeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSymbolicLinkBoolean() {
		if (fileSymbolicLinkBooleanEClass == null) {
			fileSymbolicLinkBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(37);
		}
		return fileSymbolicLinkBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSymbolicLinkBoolean_File() {
        return (EReference)getFileSymbolicLinkBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSocketBoolean() {
		if (fileSocketBooleanEClass == null) {
			fileSocketBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(38);
		}
		return fileSocketBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSocketBoolean_File() {
        return (EReference)getFileSocketBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileTerminalDeviceBoolean() {
		if (fileTerminalDeviceBooleanEClass == null) {
			fileTerminalDeviceBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(39);
		}
		return fileTerminalDeviceBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileTerminalDeviceBoolean_File() {
        return (EReference)getFileTerminalDeviceBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileReadPermissionBoolean() {
		if (fileReadPermissionBooleanEClass == null) {
			fileReadPermissionBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(40);
		}
		return fileReadPermissionBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileReadPermissionBoolean_File() {
        return (EReference)getFileReadPermissionBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileWritePermissionBoolean() {
		if (fileWritePermissionBooleanEClass == null) {
			fileWritePermissionBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(41);
		}
		return fileWritePermissionBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileWritePermissionBoolean_File() {
        return (EReference)getFileWritePermissionBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileExecutePermissionBoolean() {
		if (fileExecutePermissionBooleanEClass == null) {
			fileExecutePermissionBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(42);
		}
		return fileExecutePermissionBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileExecutePermissionBoolean_File() {
        return (EReference)getFileExecutePermissionBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerEqualBoolean() {
		if (integerEqualBooleanEClass == null) {
			integerEqualBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(43);
		}
		return integerEqualBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerEqualBoolean_FirstOp() {
        return (EAttribute)getIntegerEqualBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerEqualBoolean_SecondOp() {
        return (EAttribute)getIntegerEqualBoolean().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerNotEqualBoolean() {
		if (integerNotEqualBooleanEClass == null) {
			integerNotEqualBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(44);
		}
		return integerNotEqualBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerNotEqualBoolean_FirstOp() {
        return (EAttribute)getIntegerNotEqualBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerNotEqualBoolean_SecondOp() {
        return (EAttribute)getIntegerNotEqualBoolean().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerGreaterBoolean() {
		if (integerGreaterBooleanEClass == null) {
			integerGreaterBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(45);
		}
		return integerGreaterBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerGreaterBoolean_FirstOp() {
        return (EAttribute)getIntegerGreaterBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerGreaterBoolean_SecondOp() {
        return (EAttribute)getIntegerGreaterBoolean().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerGreaterEqualBoolean() {
		if (integerGreaterEqualBooleanEClass == null) {
			integerGreaterEqualBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(46);
		}
		return integerGreaterEqualBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerGreaterEqualBoolean_FirstOp() {
        return (EAttribute)getIntegerGreaterEqualBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerGreaterEqualBoolean_SecondOp() {
        return (EAttribute)getIntegerGreaterEqualBoolean().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLessBoolean() {
		if (integerLessBooleanEClass == null) {
			integerLessBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(47);
		}
		return integerLessBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerLessBoolean_FirstOp() {
        return (EAttribute)getIntegerLessBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerLessBoolean_SecondOp() {
        return (EAttribute)getIntegerLessBoolean().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLessEqualBoolean() {
		if (integerLessEqualBooleanEClass == null) {
			integerLessEqualBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(48);
		}
		return integerLessEqualBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerLessEqualBoolean_FirstOp() {
        return (EAttribute)getIntegerLessEqualBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerLessEqualBoolean_SecondOp() {
        return (EAttribute)getIntegerLessEqualBoolean().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringEqualBoolean() {
		if (stringEqualBooleanEClass == null) {
			stringEqualBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(49);
		}
		return stringEqualBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringEqualBoolean_FirstOp() {
        return (EAttribute)getStringEqualBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringEqualBoolean_SecondOp() {
        return (EAttribute)getStringEqualBoolean().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringNotEqualBoolean() {
		if (stringNotEqualBooleanEClass == null) {
			stringNotEqualBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(50);
		}
		return stringNotEqualBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringNotEqualBoolean_FirstOp() {
        return (EAttribute)getStringNotEqualBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringNotEqualBoolean_SecondOp() {
        return (EAttribute)getStringNotEqualBoolean().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringGreaterBoolean() {
		if (stringGreaterBooleanEClass == null) {
			stringGreaterBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(51);
		}
		return stringGreaterBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringGreaterBoolean_FirstOp() {
        return (EAttribute)getStringGreaterBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringGreaterBoolean_SecondOp() {
        return (EAttribute)getStringGreaterBoolean().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLessBoolean() {
		if (stringLessBooleanEClass == null) {
			stringLessBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(52);
		}
		return stringLessBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLessBoolean_FirstOp() {
        return (EAttribute)getStringLessBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLessBoolean_SecondOp() {
        return (EAttribute)getStringLessBoolean().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrinNotNullBoolean() {
		if (strinNotNullBooleanEClass == null) {
			strinNotNullBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(53);
		}
		return strinNotNullBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrinNotNullBoolean_String() {
        return (EAttribute)getStrinNotNullBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringNullBoolean() {
		if (stringNullBooleanEClass == null) {
			stringNullBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(54);
		}
		return stringNullBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringNullBoolean_String() {
        return (EAttribute)getStringNullBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndBooleanExpression() {
		if (andBooleanExpressionEClass == null) {
			andBooleanExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(55);
		}
		return andBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndBooleanExpression_Exps() {
        return (EReference)getAndBooleanExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrBooleanExpression() {
		if (orBooleanExpressionEClass == null) {
			orBooleanExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(56);
		}
		return orBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrBooleanExpression_Exps() {
        return (EReference)getOrBooleanExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementBoolean() {
		if (statementBooleanEClass == null) {
			statementBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(57);
		}
		return statementBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementExistsBoolean() {
		if (statementExistsBooleanEClass == null) {
			statementExistsBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(58);
		}
		return statementExistsBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatementExistsBoolean_Statement() {
        return (EAttribute)getStatementExistsBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		if (returnEClass == null) {
			returnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(59);
		}
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturn_Value() {
        return (EAttribute)getReturn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterator() {
		if (iteratorEClass == null) {
			iteratorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(60);
		}
		return iteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectoryIterator() {
		if (directoryIteratorEClass == null) {
			directoryIteratorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(61);
		}
		return directoryIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectoryIterator_Directory() {
        return (EReference)getDirectoryIterator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileContentIterator() {
		if (fileContentIteratorEClass == null) {
			fileContentIteratorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(62);
		}
		return fileContentIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileContentIterator_File() {
        return (EReference)getFileContentIterator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParameterIterator() {
		if (inputParameterIteratorEClass == null) {
			inputParameterIteratorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(63);
		}
		return inputParameterIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterIterator_InputParameters() {
        return (EReference)getInputParameterIterator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationIterator() {
		if (enumerationIteratorEClass == null) {
			enumerationIteratorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(64);
		}
		return enumerationIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationIterator_Enumeration() {
        return (EReference)getEnumerationIterator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationIterator_Statements() {
        return (EReference)getEnumerationIterator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringIterator() {
		if (stringIteratorEClass == null) {
			stringIteratorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(65);
		}
		return stringIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		if (enumerationEClass == null) {
			enumerationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(66);
		}
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Elements() {
        return (EReference)getEnumeration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationElement() {
		if (enumerationElementEClass == null) {
			enumerationElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(67);
		}
		return enumerationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationElement_Index() {
        return (EAttribute)getEnumerationElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationElement_Value() {
        return (EAttribute)getEnumerationElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSystemStatement() {
		if (fileSystemStatementEClass == null) {
			fileSystemStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(68);
		}
		return fileSystemStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSystemStatement_Files() {
        return (EReference)getFileSystemStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionFileSystemStatement() {
		if (additionFileSystemStatementEClass == null) {
			additionFileSystemStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(69);
		}
		return additionFileSystemStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletionFileSystemStatement() {
		if (deletionFileSystemStatementEClass == null) {
			deletionFileSystemStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(70);
		}
		return deletionFileSystemStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateFileSystemStatement() {
		if (updateFileSystemStatementEClass == null) {
			updateFileSystemStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(71);
		}
		return updateFileSystemStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentStatement() {
		if (environmentStatementEClass == null) {
			environmentStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(72);
		}
		return environmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentStatement_Environment() {
        return (EAttribute)getEnvironmentStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionEnvironmentStatement() {
		if (additionEnvironmentStatementEClass == null) {
			additionEnvironmentStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(73);
		}
		return additionEnvironmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletionEnvironmentStatement() {
		if (deletionEnvironmentStatementEClass == null) {
			deletionEnvironmentStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(74);
		}
		return deletionEnvironmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateEnvironmentStatement() {
		if (updateEnvironmentStatementEClass == null) {
			updateEnvironmentStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(75);
		}
		return updateEnvironmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageSettingStatement() {
		if (packageSettingStatementEClass == null) {
			packageSettingStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(76);
		}
		return packageSettingStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageSettingStatement_Pkgsetting() {
        return (EAttribute)getPackageSettingStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionPackageSettingStatement() {
		if (additionPackageSettingStatementEClass == null) {
			additionPackageSettingStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(77);
		}
		return additionPackageSettingStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletionPackageSettingStatement() {
		if (deletionPackageSettingStatementEClass == null) {
			deletionPackageSettingStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(78);
		}
		return deletionPackageSettingStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdatePackageSettingStatement() {
		if (updatePackageSettingStatementEClass == null) {
			updatePackageSettingStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(79);
		}
		return updatePackageSettingStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeutralStatement() {
		if (neutralStatementEClass == null) {
			neutralStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(80);
		}
		return neutralStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		if (messageEClass == null) {
			messageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(81);
		}
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		if (commentEClass == null) {
			commentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(82);
		}
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		if (fileEClass == null) {
			fileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(83);
		}
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Extension() {
        return (EAttribute)getFile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Description() {
        return (EAttribute)getFile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Size() {
        return (EAttribute)getFile().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_CheckSum() {
        return (EAttribute)getFile().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_IsDirectory() {
        return (EAttribute)getFile().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Suid() {
        return (EAttribute)getFile().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Guid() {
        return (EAttribute)getFile().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Permission() {
        return (EAttribute)getFile().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Location() {
        return (EAttribute)getFile().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Childs() {
        return (EReference)getFile().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Parent() {
        return (EReference)getFile().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Owner() {
        return (EAttribute)getFile().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Group() {
        return (EAttribute)getFile().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_IsMissing() {
        return (EAttribute)getFile().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationFile() {
		if (documentationFileEClass == null) {
			documentationFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(84);
		}
		return documentationFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationFile_Pkg() {
        return (EReference)getDocumentationFile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFile() {
		if (informationFileEClass == null) {
			informationFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(85);
		}
		return informationFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstDesktop() {
		if (postinstDesktopEClass == null) {
			postinstDesktopEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(86);
		}
		return postinstDesktopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstDocBase() {
		if (postinstDocBaseEClass == null) {
			postinstDocBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(87);
		}
		return postinstDocBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstDocBase_Document() {
        return (EReference)getPostinstDocBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstEmacsen() {
		if (postinstEmacsenEClass == null) {
			postinstEmacsenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(88);
		}
		return postinstEmacsenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstEmacsen_Package() {
        return (EReference)getPostinstEmacsen().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstGconf() {
		if (postinstGconfEClass == null) {
			postinstGconfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(89);
		}
		return postinstGconfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstGconf_Schemas() {
        return (EReference)getPostinstGconf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstGconfDefaults() {
		if (postinstGconfDefaultsEClass == null) {
			postinstGconfDefaultsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(90);
		}
		return postinstGconfDefaultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstIcons() {
		if (postinstIconsEClass == null) {
			postinstIconsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(91);
		}
		return postinstIconsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstIcons_Directories() {
        return (EReference)getPostinstIcons().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstInfo() {
		if (postinstInfoEClass == null) {
			postinstInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(92);
		}
		return postinstInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstInfo_File() {
        return (EReference)getPostinstInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstInit() {
		if (postinstInitEClass == null) {
			postinstInitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(93);
		}
		return postinstInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstInit_ScriptParam() {
        return (EReference)getPostinstInit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstInit_InitParams() {
        return (EReference)getPostinstInit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstInit_ErrorHandler() {
        return (EReference)getPostinstInit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstInitNostart() {
		if (postinstInitNostartEClass == null) {
			postinstInitNostartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(94);
		}
		return postinstInitNostartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstInitNostart_ScriptParam() {
        return (EReference)getPostinstInitNostart().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstInitNostart_InitParams() {
        return (EReference)getPostinstInitNostart().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstInitNostart_ErrorHandler() {
        return (EReference)getPostinstInitNostart().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstInitRestart() {
		if (postinstInitRestartEClass == null) {
			postinstInitRestartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(95);
		}
		return postinstInitRestartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstInitRestart_ScriptParam() {
        return (EReference)getPostinstInitRestart().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstInitRestart_InitParams() {
        return (EReference)getPostinstInitRestart().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstInitRestart_ErrorHandler() {
        return (EReference)getPostinstInitRestart().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstMakeshlibs() {
		if (postinstMakeshlibsEClass == null) {
			postinstMakeshlibsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(96);
		}
		return postinstMakeshlibsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstMenu() {
		if (postinstMenuEClass == null) {
			postinstMenuEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(97);
		}
		return postinstMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstMenuMethod() {
		if (postinstMenuMethodEClass == null) {
			postinstMenuMethodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(98);
		}
		return postinstMenuMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstMenuMethod_Package() {
        return (EReference)getPostinstMenuMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstMime() {
		if (postinstMimeEClass == null) {
			postinstMimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(99);
		}
		return postinstMimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstModules() {
		if (postinstModulesEClass == null) {
			postinstModulesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(100);
		}
		return postinstModulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstModules_Kvers() {
        return (EReference)getPostinstModules().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstPython() {
		if (postinstPythonEClass == null) {
			postinstPythonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(101);
		}
		return postinstPythonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstPython_Pyver() {
        return (EReference)getPostinstPython().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstPython_Dirlist() {
        return (EReference)getPostinstPython().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstScrollkeeper() {
		if (postinstScrollkeeperEClass == null) {
			postinstScrollkeeperEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(102);
		}
		return postinstScrollkeeperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstSgmlcatalog() {
		if (postinstSgmlcatalogEClass == null) {
			postinstSgmlcatalogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(103);
		}
		return postinstSgmlcatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstSgmlcatalog_Centralcat() {
        return (EReference)getPostinstSgmlcatalog().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstSgmlcatalog_Ordcats() {
        return (EReference)getPostinstSgmlcatalog().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstSharedmimeinfo() {
		if (postinstSharedmimeinfoEClass == null) {
			postinstSharedmimeinfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(104);
		}
		return postinstSharedmimeinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstSuid() {
		if (postinstSuidEClass == null) {
			postinstSuidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(105);
		}
		return postinstSuidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstSuid_Package() {
        return (EReference)getPostinstSuid().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstSuid_File() {
        return (EReference)getPostinstSuid().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstSuid_Owner() {
        return (EReference)getPostinstSuid().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstSuid_Group() {
        return (EReference)getPostinstSuid().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstSuid_Perms() {
        return (EReference)getPostinstSuid().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstUdev() {
		if (postinstUdevEClass == null) {
			postinstUdevEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(106);
		}
		return postinstUdevEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstUdev_Old() {
        return (EReference)getPostinstUdev().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstUdev_Rule() {
        return (EReference)getPostinstUdev().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstUsrlocal() {
		if (postinstUsrlocalEClass == null) {
			postinstUsrlocalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(107);
		}
		return postinstUsrlocalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstUsrlocal_Dirlist() {
        return (EReference)getPostinstUsrlocal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstWm() {
		if (postinstWmEClass == null) {
			postinstWmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(108);
		}
		return postinstWmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstWm_Wm() {
        return (EReference)getPostinstWm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstWm_Wmman() {
        return (EReference)getPostinstWm().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstWm_Priority() {
        return (EReference)getPostinstWm().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstWmNoman() {
		if (postinstWmNomanEClass == null) {
			postinstWmNomanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(109);
		}
		return postinstWmNomanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstWmNoman_Wm() {
        return (EReference)getPostinstWmNoman().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstWmNoman_Priority() {
        return (EReference)getPostinstWmNoman().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstXfonts() {
		if (postinstXfontsEClass == null) {
			postinstXfontsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(110);
		}
		return postinstXfontsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstXfonts_Cmds() {
        return (EReference)getPostinstXfonts().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmDebconf() {
		if (postrmDebconfEClass == null) {
			postrmDebconfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(111);
		}
		return postrmDebconfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmDesktop() {
		if (postrmDesktopEClass == null) {
			postrmDesktopEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(112);
		}
		return postrmDesktopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmGconf() {
		if (postrmGconfEClass == null) {
			postrmGconfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(113);
		}
		return postrmGconfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostrmGconf_Schemas() {
        return (EReference)getPostrmGconf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmGconfDefaults() {
		if (postrmGconfDefaultsEClass == null) {
			postrmGconfDefaultsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(114);
		}
		return postrmGconfDefaultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmIcons() {
		if (postrmIconsEClass == null) {
			postrmIconsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(115);
		}
		return postrmIconsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostrmIcons_Dirs() {
        return (EReference)getPostrmIcons().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmInit() {
		if (postrmInitEClass == null) {
			postrmInitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(116);
		}
		return postrmInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostrmInit_ScriptParam() {
        return (EReference)getPostrmInit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostrmInit_ErrorHandler() {
        return (EReference)getPostrmInit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmMakeshlibs() {
		if (postrmMakeshlibsEClass == null) {
			postrmMakeshlibsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(117);
		}
		return postrmMakeshlibsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmMenu() {
		if (postrmMenuEClass == null) {
			postrmMenuEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(118);
		}
		return postrmMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmMenuMethod() {
		if (postrmMenuMethodEClass == null) {
			postrmMenuMethodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(119);
		}
		return postrmMenuMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostrmMenuMethod_Package() {
        return (EReference)getPostrmMenuMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmMime() {
		if (postrmMimeEClass == null) {
			postrmMimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(120);
		}
		return postrmMimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmModules() {
		if (postrmModulesEClass == null) {
			postrmModulesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(121);
		}
		return postrmModulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostrmModules_Kvers() {
        return (EReference)getPostrmModules().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmScrollkeeper() {
		if (postrmScrollkeeperEClass == null) {
			postrmScrollkeeperEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(122);
		}
		return postrmScrollkeeperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmSgmlcatalog() {
		if (postrmSgmlcatalogEClass == null) {
			postrmSgmlcatalogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(123);
		}
		return postrmSgmlcatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostrmSgmlcatalog_Centralcat() {
        return (EReference)getPostrmSgmlcatalog().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmSharedmimeinfo() {
		if (postrmSharedmimeinfoEClass == null) {
			postrmSharedmimeinfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(124);
		}
		return postrmSharedmimeinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmSuid() {
		if (postrmSuidEClass == null) {
			postrmSuidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(125);
		}
		return postrmSuidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostrmSuid_Package() {
        return (EReference)getPostrmSuid().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostrmSuid_File() {
        return (EReference)getPostrmSuid().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostrmXfonts() {
		if (postrmXfontsEClass == null) {
			postrmXfontsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(126);
		}
		return postrmXfontsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostrmXfonts_Cmds() {
        return (EReference)getPostrmXfonts().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreinstUdev() {
		if (preinstUdevEClass == null) {
			preinstUdevEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(127);
		}
		return preinstUdevEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreinstUdev_Old() {
        return (EReference)getPreinstUdev().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreinstUdev_Rule() {
        return (EReference)getPreinstUdev().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreinstUdev_Package() {
        return (EReference)getPreinstUdev().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreinstUser() {
		if (preinstUserEClass == null) {
			preinstUserEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(128);
		}
		return preinstUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreinstUser_Dir() {
        return (EReference)getPreinstUser().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreinstUser_Mode() {
        return (EReference)getPreinstUser().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreinstUser_User() {
        return (EReference)getPreinstUser().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreinstUser_Group() {
        return (EReference)getPreinstUser().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrermDocBase() {
		if (prermDocBaseEClass == null) {
			prermDocBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(129);
		}
		return prermDocBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermDocBase_Document() {
        return (EReference)getPrermDocBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrermEmacsen() {
		if (prermEmacsenEClass == null) {
			prermEmacsenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(130);
		}
		return prermEmacsenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermEmacsen_Package() {
        return (EReference)getPrermEmacsen().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrermGconf() {
		if (prermGconfEClass == null) {
			prermGconfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(131);
		}
		return prermGconfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermGconf_Schemas() {
        return (EReference)getPrermGconf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrermInfo() {
		if (prermInfoEClass == null) {
			prermInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(132);
		}
		return prermInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermInfo_File() {
        return (EReference)getPrermInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrermInit() {
		if (prermInitEClass == null) {
			prermInitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(133);
		}
		return prermInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermInit_ScriptParam() {
        return (EReference)getPrermInit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermInit_ErrorHandler() {
        return (EReference)getPrermInit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrermInitNorestart() {
		if (prermInitNorestartEClass == null) {
			prermInitNorestartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(134);
		}
		return prermInitNorestartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermInitNorestart_ScriptParam() {
        return (EReference)getPrermInitNorestart().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermInitNorestart_ErrorHandler() {
        return (EReference)getPrermInitNorestart().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrermPython() {
		if (prermPythonEClass == null) {
			prermPythonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(135);
		}
		return prermPythonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermPython_Package() {
        return (EReference)getPrermPython().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrermSgmlcatalog() {
		if (prermSgmlcatalogEClass == null) {
			prermSgmlcatalogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(136);
		}
		return prermSgmlcatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermSgmlcatalog_Centralcat() {
        return (EReference)getPrermSgmlcatalog().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrermUsrlocal() {
		if (prermUsrlocalEClass == null) {
			prermUsrlocalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(137);
		}
		return prermUsrlocalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermUsrlocal_Dirlist() {
        return (EReference)getPrermUsrlocal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrermWm() {
		if (prermWmEClass == null) {
			prermWmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(138);
		}
		return prermWmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrermWm_Wm() {
        return (EReference)getPrermWm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdatePythonModules() {
		if (updatePythonModulesEClass == null) {
			updatePythonModulesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(139);
		}
		return updatePythonModulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdatePythonModules_File() {
        return (EReference)getUpdatePythonModules().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostinstAddAlternative() {
		if (postinstAddAlternativeEClass == null) {
			postinstAddAlternativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(140);
		}
		return postinstAddAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstAddAlternative_Master() {
        return (EReference)getPostinstAddAlternative().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostinstAddAlternative_Slave() {
        return (EReference)getPostinstAddAlternative().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddAlternative() {
		if (addAlternativeEClass == null) {
			addAlternativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(141);
		}
		return addAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddAlternative_Link() {
        return (EAttribute)getAddAlternative().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddAlternative_Name() {
        return (EAttribute)getAddAlternative().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddAlternative_Path() {
        return (EAttribute)getAddAlternative().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddAlternative_Priority() {
        return (EAttribute)getAddAlternative().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParam() {
		if (paramEClass == null) {
			paramEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(142);
		}
		return paramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParam_Value() {
        return (EAttribute)getParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringParam() {
		if (stringParamEClass == null) {
			stringParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(143);
		}
		return stringParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntParam() {
		if (intParamEClass == null) {
			intParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(144);
		}
		return intParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleConflict() {
		if (singleConflictEClass == null) {
			singleConflictEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(153);
		}
		return singleConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleConflict_Conflict() {
        return (EReference)getSingleConflict().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleConflict_Version() {
        return (EAttribute)getSingleConflict().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleConflict_Value() {
        return (EAttribute)getSingleConflict().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflict() {
		if (conflictEClass == null) {
			conflictEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(154);
		}
		return conflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflict_AndConflict() {
        return (EReference)getConflict().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflict_OrConflict() {
        return (EReference)getConflict().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflict_SingleConflict() {
        return (EReference)getConflict().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConflict_Pkg() {
        return (EAttribute)getConflict().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndConflict() {
		if (andConflictEClass == null) {
			andConflictEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(155);
		}
		return andConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndConflict_Ops() {
        return (EReference)getAndConflict().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndConflict_Conflict() {
        return (EReference)getAndConflict().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrConflict() {
		if (orConflictEClass == null) {
			orConflictEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(156);
		}
		return orConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrConflict_Ops() {
        return (EReference)getOrConflict().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrConflict_Conflict() {
        return (EReference)getOrConflict().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		if (assignmentEClass == null) {
			assignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(157);
		}
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_Assigned() {
        return (EAttribute)getAssignment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_Expression() {
        return (EAttribute)getAssignment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorityType() {
		if (priorityTypeEEnum == null) {
			priorityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(145);
		}
		return priorityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusType() {
		if (statusTypeEEnum == null) {
			statusTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(146);
		}
		return statusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVersionType() {
		if (versionTypeEEnum == null) {
			versionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(147);
		}
		return versionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReturnStatementValue() {
		if (returnStatementValueEEnum == null) {
			returnStatementValueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(148);
		}
		return returnStatementValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCasePrermConditionValue() {
		if (casePrermConditionValueEEnum == null) {
			casePrermConditionValueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(149);
		}
		return casePrermConditionValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCasePostrmConditionValue() {
		if (casePostrmConditionValueEEnum == null) {
			casePostrmConditionValueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(150);
		}
		return casePostrmConditionValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCasePreinstConditionValue() {
		if (casePreinstConditionValueEEnum == null) {
			casePreinstConditionValueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(151);
		}
		return casePreinstConditionValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCasePostinstConditionValue() {
		if (casePostinstConditionValueEEnum == null) {
			casePostinstConditionValueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PackagemmPackage.eNS_URI).getEClassifiers().get(152);
		}
		return casePostinstConditionValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagemmFactory getPackagemmFactory() {
		return (PackagemmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("it.univaq.mancoosi.packagemm." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //PackagemmPackageImpl
