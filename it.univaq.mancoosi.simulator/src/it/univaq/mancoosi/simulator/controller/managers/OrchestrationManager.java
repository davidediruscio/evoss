/**
 * 
 */
package it.univaq.mancoosi.simulator.controller.managers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.UUID;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import it.univaq.mancoosi.simulator.entity.StatementScript;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.util.CurrentModelsFile;
import it.univaq.mancoosi.simulator.util.FileManagement;
import it.univaq.mancoosi.simulator.util.SimulatorConfig;
import it.univaq.mancoosi.simulator.util.TransformationRuleFilesMapping;


import Wires.AtomicModelTransfomationType;
import Wires.AtomicModelTransformation;
import Wires.BasicDataType;
import Wires.ConnectableElement;
import Wires.DataFlow;
import Wires.DecisionNode;
import Wires.GenericQuery;
import Wires.IdentityTransformation;
import Wires.InputActualParameter;
import Wires.InputFormalParameter;
import Wires.Library;
import Wires.LibraryRef;
import Wires.Model;
import Wires.ModelType;
import Wires.OutputActualParameter;
import Wires.OutputFormalParameter;
import Wires.Query;
import Wires.QueryType;
import Wires.Transformation;
import Wires.Type;
import Wires.TypeParameter;
import Wires.WiresElement;
import Wires.WiresFactory;
import Wires.WiresSpecification;
import Wires.exep.ATLExtractionFailedException;
import Wires.exep.IdOutParamNotFound;
import Wires.exep.InitialModelsNotFoundException;
import Wires.exep.LibraryNotFoundException;
import Wires.exep.MetamodelNotFoundException;
import Wires.exep.QueryFailedException;
import Wires.exep.ResourceNotFoundException;
import Wires.exep.TransformationFailedException;
import Wires.exep.TypeNotFoundException;
import Wires.impl.WiresSpecificationImpl;

/**
 * Manages the creation and execution of a wires* model
 */
public class OrchestrationManager {

	private String packageNameInput;
	private String typeScript;
	private String pathPackageModel;
	private SimulatorConfig config;
	private WiresSpecification wiresSpecification;
	private ArrayList<StatementScript> statementsScript;
	private TransformationRuleFilesMapping mappingRule;
	private ArrayList<String> errorModels;

	/**
	 * Constructor
	 * 
	 * @param packageNameInput
	 * @param typeScript
	 * @param pathPackageModel
	 * @param statementsScript
	 * @throws Exception
	 */
	public OrchestrationManager(String packageNameInput, String typeScript, String pathPackageModel,
			ArrayList<StatementScript> statementsScript) throws Exception {

		config = SimulatorConfig.getInstance();
		this.packageNameInput = packageNameInput;
		this.typeScript = typeScript;
		this.statementsScript = statementsScript;
		this.pathPackageModel = pathPackageModel;
		wiresSpecification = WiresFactory.eINSTANCE.createWiresSpecification();
		mappingRule = TransformationRuleFilesMapping.getInstance();
		errorModels = new ArrayList<String>();
		
		try {
			createModel();
		} catch (Exception e) {
			throw new SimulatorException("Wires Error: Creating the model failed", e);
		}
		
		if (config.isSaveOrchestrationModel()) {
			saveModel();
		}
	}

	/**
	 * Provides the execution of the model
	 * @throws Exception 
	 */
	public Boolean runOrchestrationModel() throws Exception {

		try {
			
			 /*		PrintStream printStreamOriginal=System.err;

			System.setErr(new PrintStream(new OutputStream() {
				@Override
				public void write(int arg0) throws IOException {
				}
			}));*/
			
			((WiresSpecificationImpl) wiresSpecification).runExecution();
			
			//System.setErr(printStreamOriginal);

		} catch (InitialModelsNotFoundException e) {
			throw new SimulatorException("Orchestration Error: No initial models!", e);
		} catch (IdOutParamNotFound e) {
			throw new SimulatorException("Orchestration Error: IdOutParamNotFound", e);
		} catch (ATLExtractionFailedException e) {
			throw new SimulatorException("Orchestration Error: ATLExtractionFailedException", e);
		} catch (LibraryNotFoundException e) {
			throw new SimulatorException("Orchestration Error: LibraryNotFoundException", e);
		} catch (MetamodelNotFoundException e) {
			throw new SimulatorException("Orchestration Error: MetamodelNotFoundException", e);
		} catch (QueryFailedException e) {
			throw new SimulatorException("Orchestration Error: QueryFailedException", e);
		} catch (ResourceNotFoundException e) {
			throw new SimulatorException("Orchestration Error: ResourceNotFoundException", e);
		} catch (TypeNotFoundException e) {
			throw new SimulatorException("Orchestration Error: TypeNotFoundException", e);
		} catch (TransformationFailedException e) {
			throw new SimulatorException("Orchestration Error: Transformation failed", e);
		} catch (Exception e) {
			throw new SimulatorException("Orchestration execution error", e);
		}
		
		
		ErrorModelManager errorManager = new ErrorModelManager();
		errorManager.appendModel(errorModels);
		Boolean existError = errorManager.existsErrors();
		
		if (existError || errorManager.existsWarnings()) {
			File model = FileManagement.createTempFile("errorModel", "erromm");
			errorManager.saveModel(model.getPath());
			CurrentModelsFile.getInstance().addErrorModel(model);
		}
		return existError;
	}

	/**
	 * 
	 * @throws SimulatorException
	 */
	private void saveModel() throws SimulatorException {

		String pathFile = config.getDirOrchestrationModels() + packageNameInput
				+ "_" + typeScript + getRandomNumber() +".wires";
		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("wires", new EcoreResourceFactoryImpl());

		URI fileURI = URI.createFileURI(new File(pathFile).getAbsolutePath());
		Resource poResource = resourceSet.createResource(fileURI);
		poResource.getContents().add(wiresSpecification);

		try {
			poResource.save(null);
		} catch (IOException e) {
			throw new SimulatorException("Error saving the orchestration model", e);
		}
	}
	

	/**
	 * 
	 * @throws Exception
	 */
	private void createModel() throws Exception {

		// Models type
		ModelType modelSystemType = createModelType("mancoosimm", config.getDirModelTypes()
				+ "mancoosimm.ecore");
		ModelType modelPackageType = createModelType("packagemm", config.getDirModelTypes()
				+ "packagemm.ecore");
		ModelType modelErrorType = createModelType("MMError", config.getDirModelTypes()
				+ "errormm.ecore");
		ModelType modelAtlType = createModelType("ATL", config.getDirModelTypes()
				+ "ATL-0.2.ecore");
		ModelType modelExecPositionType = createModelType("positionmm", config.getDirModelTypes()
				+ "positionmm.ecore");

		// Basic DataType Integer
		BasicDataType integerType = WiresFactory.eINSTANCE.createBasicDataType();
		integerType.setName("Integer");
		wiresSpecification.getEls().add(integerType);
		// Basic DataType Boolean
		BasicDataType booleanType = WiresFactory.eINSTANCE.createBasicDataType();
		booleanType.setName("Boolean");
		wiresSpecification.getEls().add(booleanType);

		// Package model
		Model packageModel = createModel(packageNameInput, modelPackageType, pathPackageModel);

		// Configuration model - input
		Model systemModelIn = createModel("systemModelInput", modelSystemType,
				CurrentModelsFile.getInstance().getSystemModelCurrent().getPath());

		// Configuration model - output
		String inputSystemModel = config.getFileInputSystemModel();
		String nameFileModel = inputSystemModel.substring(inputSystemModel
				.lastIndexOf("/") + 1, inputSystemModel.length());
		File newTempFile = FileManagement.createTempFile(nameFileModel
				.substring(0, nameFileModel.lastIndexOf(".")), nameFileModel
				.substring(nameFileModel.lastIndexOf(".") + 1, nameFileModel
						.length()));
		Model systemModelOut = createModel("systemModelOutput",
				modelSystemType, newTempFile.getPath());
		CurrentModelsFile.getInstance().setSystemModelCurrent(newTempFile);


		// Statements temp
		ArrayList<AtomicModelTransformation> transfTemp = new ArrayList<AtomicModelTransformation>();
		// ThenTemp
		ArrayList<AtomicModelTransformation> thenTemp = new ArrayList<AtomicModelTransformation>();
		// ElseTemp
		ArrayList<AtomicModelTransformation> elseTemp = new ArrayList<AtomicModelTransformation>();
		// Generic query
		ArrayList<GenericQuery> genQueriesTemp = new ArrayList<GenericQuery>();

		Model systemModelTempPreIf = null;

		AtomicModelTransformation tempTransfIf = null;

		for (int i = 0; i < statementsScript.size(); i++) {

			if (statementsScript.get(i).getType().equals("If")) {

				tempTransfIf = transfTemp.get(transfTemp.size() - 1);

				// --------- Temp Model --> Query
				File newFile = FileManagement.createTempFile(nameFileModel
						.substring(0, nameFileModel.lastIndexOf(".")),
						nameFileModel.substring(
								nameFileModel.lastIndexOf(".") + 1,
								nameFileModel.length()));
				systemModelTempPreIf = createModel("systemModelTemp_" + i,
						modelSystemType, newFile.getPath());

				createDataFlow(tempTransfIf, systemModelTempPreIf, modelSystemType);

				AtomicModelTransformation atomicModelTransfHOT = createAtomicModelTransf(
						statementsScript.get(i).getType(), i);

				this.setInputTransfPackageModel(atomicModelTransfHOT, packageModel);
				this.setInputTransfPositionModel(atomicModelTransfHOT, modelExecPositionType, i);

				// Type Query
				QueryType conditionQueryType = WiresFactory.eINSTANCE.createQueryType();
				wiresSpecification.getEls().add(conditionQueryType);
				conditionQueryType.setName("Type_"
						+ statementsScript.get(i).getType() + "_"
						+ statementsScript.get(i).getPosition());
				File transformationTempFile = FileManagement.createTempFile("condition", "atl");
				conditionQueryType.setPath(transformationTempFile.getPath());
				// Library
				Library conditionLib = WiresFactory.eINSTANCE.createLibrary();
				conditionLib.setName("conditionlib");
				conditionLib.setPath(config.getDirTransformationRepository()
						+ "conditionlib.atl");
				wiresSpecification.getEls().add(conditionLib);
				// LibraryRef
				LibraryRef reflib = WiresFactory.eINSTANCE.createLibraryRef();
				reflib.setName("conditionLibRef");
				reflib.setLibrary(conditionLib);
				conditionQueryType.getLibraries().add(reflib);
				// Parameters
				InputFormalParameter inputParamQuery = WiresFactory.eINSTANCE.createInputFormalParameter();
				inputParamQuery.setTypeEl(modelSystemType);
				inputParamQuery.setName("IN");
				inputParamQuery.setTypeName("INConfiguration");
				conditionQueryType.getInParams().add(inputParamQuery);
				OutputFormalParameter outputParamQuery = WiresFactory.eINSTANCE.createOutputFormalParameter();
				outputParamQuery.setTypeEl(booleanType);
				outputParamQuery.setName("OUT");
				outputParamQuery.setTypeName("Boolean");
				conditionQueryType.getOutParams().add(outputParamQuery);

				// GenericQuery
				GenericQuery conditionQuery = WiresFactory.eINSTANCE.createGenericQuery();
				conditionQuery.setName("out");
				wiresSpecification.getEls().add(conditionQuery);
				genQueriesTemp.add(conditionQuery);
				TypeParameter paramTypeParameter = WiresFactory.eINSTANCE.createTypeParameter();
				conditionQuery.setTypeParam(paramTypeParameter);
				conditionQuery.setType(conditionQueryType);
				InputActualParameter inActualQuery = WiresFactory.eINSTANCE.createInputActualParameter();
				inActualQuery.setType(inputParamQuery);
				inActualQuery.setName(inputParamQuery.getName() + ":"
						+ inputParamQuery.getTypeName());
				conditionQuery.getInParams().add(inActualQuery);
				OutputActualParameter outActualQuery = WiresFactory.eINSTANCE.createOutputActualParameter();
				outActualQuery.setType(outputParamQuery);
				outActualQuery.setName(outputParamQuery.getName() + ":"
						+ outputParamQuery.getTypeName());
				conditionQuery.getOutParams().add(outActualQuery);

				// DataFlow: HOT --> GenericTransformation
				createDataFlow(atomicModelTransfHOT, conditionQuery.getTypeParam(), modelAtlType);


				if (i == 0) {
					// Dataflow input GenericQuery
					createDataFlow(systemModelIn, conditionQuery, modelSystemType);
				} else {
					createDataFlow(systemModelTempPreIf, conditionQuery, modelSystemType);
					// For transformation with possible error model
					errorModelManager(tempTransfIf, false, conditionQuery, modelErrorType, systemModelOut, integerType, modelSystemType);
				}

			} else {

				AtomicModelTransformation atomicModelTransf = null;

				atomicModelTransf = createAtomicModelTransf(statementsScript.get(i).getType(), i);

				transfTemp.add(atomicModelTransf);

				if (statementsScript.get(i).getContainingFeature().equals("then")) {
					
					thenTemp.add(atomicModelTransf);
					
					if (statementsScript.get(i - 1).getType().equals("If")) {
						// Dataflow TransfPreIf -> then
						createDataFlow(systemModelTempPreIf, atomicModelTransf, modelSystemType);
					} else {
						createDataFlow(thenTemp.get(thenTemp.size() - 2), atomicModelTransf, modelSystemType);
						// For transformation with possible error
						errorModelManager(thenTemp.get(thenTemp.size() - 2), false, atomicModelTransf, modelErrorType, systemModelOut, integerType, modelSystemType);
					}
					
				} else if (statementsScript.get(i).getContainingFeature().equals("else")) {
					
					elseTemp.add(atomicModelTransf);
					
					if (statementsScript.get(i - 1).getContainingFeature().equals("then")) {
						// Dataflow TransfPreIf -> else
						createDataFlow(systemModelTempPreIf, atomicModelTransf, modelSystemType);
					} else {
						createDataFlow(elseTemp.get(elseTemp.size() - 2), atomicModelTransf, modelSystemType);
						// For transformation with possible error
						errorModelManager(elseTemp.get(elseTemp.size() - 2), false, atomicModelTransf, modelErrorType, systemModelOut, integerType, modelSystemType);
					}
				} else if (i > 0 && statementsScript.get(i-1).getContainingFeature().equals("then")) {

						IdentityTransformation identity = createIdentityTransf(modelSystemType);
						
						DecisionNode decisNode = createDecisionNode("condition", "condition", identity, thenTemp.get(0));
						identity.setControlNode(decisNode);
						thenTemp.get(0).setControlNode(decisNode);
						
						createDataFlow(genQueriesTemp.get(genQueriesTemp.size() - 1).getOutParams().get(0), decisNode.getInParams().get(0));
						
						//PreIf --> identity
						createDataFlow(systemModelTempPreIf, identity.getInParams().get(0));


						// --------- Temp Model --> Query
						File newFile = FileManagement.createTempFile(nameFileModel
								.substring(0, nameFileModel.lastIndexOf(".")),
								nameFileModel.substring(
										nameFileModel.lastIndexOf(".") + 1,
										nameFileModel.length()));
						Model systemModelTempPostIdentity = createModel("systemModelTemp_" + i,
								modelSystemType, newFile.getPath());

						// identity --> tempModel
						createDataFlow(identity.getOutParams().get(0), systemModelTempPostIdentity);
						
						// tempModel --> postIf
						createDataFlow(systemModelTempPostIdentity, atomicModelTransf, modelSystemType);
						
						// For transformation with possible error model
						errorModelManager(thenTemp.get(thenTemp.size() - 1), true, atomicModelTransf, modelErrorType, systemModelOut, integerType, modelSystemType);


					} else if (i > 0 && statementsScript.get(i-1).getContainingFeature().equals("else")) {

						DecisionNode decisNode = createDecisionNode("condition", "condition", elseTemp.get(0), thenTemp.get(0));
						elseTemp.get(0).setControlNode(decisNode);
						thenTemp.get(0).setControlNode(decisNode);
						
						createDataFlow(genQueriesTemp.get(genQueriesTemp.size()-1).getOutParams().get(0), decisNode.getInParams().get(0));

						// else --> postIf
						if (!errorModelManager(elseTemp.get(elseTemp.size() - 1), true, atomicModelTransf, modelErrorType, systemModelOut, integerType, modelSystemType)) {
							createDataFlow(elseTemp.get(elseTemp.size()-1), atomicModelTransf, modelSystemType);
						}
						// then --> postIf
						if (!errorModelManager(thenTemp.get(thenTemp.size() - 1), true, atomicModelTransf, modelErrorType, systemModelOut, integerType, modelSystemType)) {
							createDataFlow(thenTemp.get(thenTemp.size()-1), atomicModelTransf, modelSystemType);
						}
						
					} else {

						if (i == 0) {
							createDataFlow(systemModelIn, atomicModelTransf, modelSystemType);
						} else {
							createDataFlow(transfTemp.get(transfTemp.size() - 2), atomicModelTransf, modelSystemType);

							// For transformation with possible error
							errorModelManager(transfTemp.get(transfTemp.size() - 2), false, atomicModelTransf, modelErrorType, systemModelOut, integerType, modelSystemType);

						}
					}

						
						setInputTransfPackageModel(atomicModelTransf, packageModel);
						setInputTransfPositionModel(atomicModelTransf, modelExecPositionType, i);

						if (i == (statementsScript.size() - 1)) {

							// For transformation with possible error
							Boolean res = errorModelManager(atomicModelTransf, false, null, modelErrorType, systemModelOut, integerType, modelSystemType);
							if (!res)  {
								createDataFlow(atomicModelTransf, systemModelOut, modelSystemType);
							}
						}
			}
		}
	}

	/**
	 * 
	 * @param source
	 * @param target
	 * @param modelType
	 * @return
	 */
	private void createDataFlow(Transformation source,
			Transformation target, ModelType modelType) {

		DataFlow p = WiresFactory.eINSTANCE.createDataFlow();
		wiresSpecification.getEls().add(p);
		OutputActualParameter out = getParamOut(source.getOutParams(), modelType);
		p.setSrc(out);
		out.getOutgoing().add(p);
		InputActualParameter in = getParamIn(target.getInParams(), modelType);
		p.setTarget(in);
		in.getIncoming().add(p);
	}

	/**
	 * 
	 * @param source
	 * @param target
	 * @return
	 */
	private void createDataFlow(ConnectableElement source,
			ConnectableElement target) {
		
		DataFlow p = WiresFactory.eINSTANCE.createDataFlow();
		wiresSpecification.getEls().add(p);
		p.setSrc(source);
		source.getOutgoing().add(p);
		
		p.setTarget(target);
		target.getIncoming().add(p);
		
	}

	/**
	 * 
	 * @param source
	 * @param conditionQuery
	 * @param typeModel
	 * @return
	 */
	private void createDataFlow(ConnectableElement source,
			Transformation conditionQuery, ModelType typeModel) {

		DataFlow p = WiresFactory.eINSTANCE.createDataFlow();

		InputActualParameter inActual = getParamIn(conditionQuery.getInParams(), typeModel);
		p.setTarget(inActual);

		inActual.getIncoming().add(p);

		p.setSrc(source);
		source.getOutgoing().add(p);

		wiresSpecification.getEls().add(p);


	}

	/**
	 * 
	 * @param source
	 * @param target
	 * @param modelType
	 * @return
	 */
	private void createDataFlow(Transformation source, ConnectableElement target, ModelType modelType) {
		DataFlow p = WiresFactory.eINSTANCE.createDataFlow();
		OutputActualParameter out = getParamOut(source.getOutParams(), modelType);
		p.setSrc(out);
		out.getOutgoing().add(p);

		p.setTarget(target);
		target.getIncoming().add(p);
		wiresSpecification.getEls().add(p);
	}

	/**
	 * 
	 * @param transfWithError
	 * @param transfPosterror
	 * @param errorModel
	 * @param integerType
	 * @throws SimulatorException 
	 */
	private Boolean errorModelManager(Transformation transfWithError, Boolean thenOrElse,
			Transformation transfPosterror, ModelType modelErrorType, Model sysModelOut,
			BasicDataType integerType, ModelType systemType) throws SimulatorException {

		Boolean result = false;
		OutputActualParameter outActualError = getParamOut(transfWithError.getOutParams(), modelErrorType);
		if (outActualError != null) {
			result = true;
			// Error modelTemp
			String nameErrorModel = config.getFileErrorModel();
			File errorTempFile = FileManagement.createTempFile(nameErrorModel
					.substring(0, nameErrorModel.lastIndexOf(".")),
					nameErrorModel.substring(
							nameErrorModel.lastIndexOf(".") + 1, nameErrorModel.length()));
			
			errorModels.add(errorTempFile.getPath());
			
			Model errorModelTemp = createModel("errorModelTemp_"
					+ this.getRandomNumber(), modelErrorType,
					errorTempFile.getPath());

			// Dataflow: OUTActual --> TempErrorModel
			createDataFlow(outActualError, errorModelTemp);

			if (!thenOrElse) {

				createManagementErrorModel(transfWithError, errorModelTemp, transfPosterror, modelErrorType, sysModelOut, systemType, integerType);
			} else {

				// modelTemp1
				String path = config.getFileInputSystemModel();
				String nameModel = path.substring(path.lastIndexOf("/") + 1, path.length());
				File tempFile1 = FileManagement.createTempFile(nameModel.substring(0, nameModel.lastIndexOf(".")),
						nameModel.substring(nameModel.lastIndexOf(".") + 1, nameModel.length()));
				Model sysModelTemp1 = createModel("modelTemp1_"
						+ this.getRandomNumber(), systemType,
						tempFile1.getPath());
				
				File tempFile2 = FileManagement.createTempFile(nameModel
						.substring(0, nameModel.lastIndexOf(".")),
						nameModel.substring(nameModel.lastIndexOf(".") + 1, nameModel.length()));
				Model sysModelTemp2 = createModel("modelTemp2_"
						+ this.getRandomNumber(), systemType,
						tempFile2.getPath());
				
				IdentityTransformation identity = createIdentityTransf(systemType);

				createManagementErrorModel(transfWithError, errorModelTemp, identity, modelErrorType, sysModelOut, systemType, integerType);

				createDataFlow(transfWithError, sysModelTemp1, systemType);

				createDataFlow(sysModelTemp1, identity.getInParams().get(0));

				createDataFlow(identity.getOutParams().get(0), sysModelTemp2);
				
				createDataFlow(sysModelTemp2, transfPosterror, systemType);
				
			}
		}
			return result;
	}

	/**
	 * 
	 * @return
	 */
	private String getRandomNumber() {
		String random = UUID.randomUUID().toString();
		return random;
	}

	/**
	 * 
	 * @param atomicModelTransf
	 * @param packageModel
	 * @param i
	 * @throws Exception
	 */
	private void setInputTransfPackageModel (AtomicModelTransformation atomicModelTransf, Model packageModel) throws Exception {	

		InputActualParameter inputActual = getParamIn(atomicModelTransf.getInParams(), packageModel.getType());
		if (inputActual != null) {
			createDataFlow(packageModel, inputActual);
		}
	}
	

	/**
	 * 
	 * @param atomicModelTransf
	 * @param modelExecPositionType
	 * @param i
	 * @throws Exception
	 */
	private void setInputTransfPositionModel (AtomicModelTransformation atomicModelTransf, ModelType modelExecPositionType, int i) throws Exception {

		InputActualParameter inActualPosition = getParamIn(
				atomicModelTransf.getInParams(), modelExecPositionType);
		if (inActualPosition != null) {

			PositionModelBuilder positionModel = new PositionModelBuilder(
					statementsScript.get(i).getType(), typeScript, statementsScript.get(i).getPosition());

			Model posInModel = createModel("posModelIn_" + i,
					modelExecPositionType, positionModel.getPathPositionScriptModel());

			createDataFlow(posInModel, inActualPosition);
		}
	}

	
	/**
	 * 
	 * @param errorModelTemp
	 * @param transfPostError
	 * @param errorModel
	 * @param i
	 * @throws SimulatorException 
	 */
	private void createManagementErrorModel(
			Transformation transfWithError,
			Model errorModelTemp,
			Transformation transfPostError,
			ModelType modelErrorType, Model sysModelOut, ModelType modelSysModel, BasicDataType integerType) throws SimulatorException {

		QueryType isEmptyErrorModel = getQueryType("isEmptyErrorModel");
		
		if (isEmptyErrorModel == null) {
			InputFormalParameter inputFormal = WiresFactory.eINSTANCE.createInputFormalParameter();
			inputFormal.setName("INERR");
			inputFormal.setTypeEl(modelErrorType);
			inputFormal.setTypeName("MMError");
			
			OutputFormalParameter outputFormal = WiresFactory.eINSTANCE.createOutputFormalParameter();
			outputFormal.setName("OUTINT");
			outputFormal.setTypeEl(integerType);
			outputFormal.setTypeName("Integer");
			
			isEmptyErrorModel = createQueryType("isEmptyErrorModel", config.getDirTransformationRepository()
					+"isEmptyErrorModel.atl", inputFormal, outputFormal);
		}
		
		// Query
		Query isEmptyQuery = createQueryElement(isEmptyErrorModel, "isEmptyErrorModel");
		
		// DataFlow: ErrorTempModel --> Query
		createDataFlow(errorModelTemp, isEmptyQuery.getInParams().get(0));
		
		// IdentityTransformation - ErrorExists
		IdentityTransformation identityErrorExists = createIdentityTransf(modelSysModel);
		
		// DecisionNode
		DecisionNode node;

		// Configuration model - Temp
		String inputSystemModel = config.getFileInputSystemModel();
		String nameFileModel = inputSystemModel.substring(inputSystemModel
				.lastIndexOf("/") + 1, inputSystemModel.length());
		File newTempFile = FileManagement.createTempFile(nameFileModel.substring(0,
				nameFileModel.lastIndexOf(".")), nameFileModel
				.substring(nameFileModel.lastIndexOf(".") + 1,
						nameFileModel.length()));
		Model systemModelTemp = createModel("systemModelOutputTemp", modelSysModel,
				newTempFile.getPath());
		
		// Dataflow: OutActualSystemModel --> tempSysModel
		createDataFlow(transfWithError, systemModelTemp, modelSysModel);
		
		if (transfPostError != null) {
			node = createDecisionNode("x", "x>0", transfPostError, identityErrorExists);
			transfPostError.setControlNode(node);
		} else {
			

			// IdentityTransformation - 
			IdentityTransformation identitySysModel = createIdentityTransf(modelSysModel);
			node = createDecisionNode("x","x>0", identitySysModel, identityErrorExists);
			
			// DataFlow: TempSysModel --> Identity
			createDataFlow(systemModelTemp, identitySysModel.getInParams().get(0));
			
			// DataFlow: Identity --> SysModel
			createDataFlow(identitySysModel.getOutParams().get(0), sysModelOut);
		}
		
		identityErrorExists.setControlNode(node);
		
		// DataFlow: Query --> DecisionNode
		createDataFlow(isEmptyQuery.getOutParams().get(0), node.getInParams().get(0));
		
		// DataFlow: systemModelTemp --> Identity ErrorExist
		createDataFlow(systemModelTemp, identityErrorExists.getInParams().get(0));
		
		// DataFlow: Identity ErrorExist --> sysModelOut
		createDataFlow(identityErrorExists.getOutParams().get(0), sysModelOut);
	}
	
	/**
	 * 
	 * @param position
	 * @param node
	 * @return
	 */
	private IdentityTransformation createIdentityTransf(ModelType modelType) {
		IdentityTransformation identity = WiresFactory.eINSTANCE
				.createIdentityTransformation();
		identity.setName("identity_" + this.getRandomNumber());
		
		InputActualParameter inputId = WiresFactory.eINSTANCE
				.createInputActualParameter();
		inputId.setName("model");
		OutputActualParameter outputId = WiresFactory.eINSTANCE
				.createOutputActualParameter();
		outputId.setName("model");
		identity.getInParams().add(inputId);
		identity.getOutParams().add(outputId);
		wiresSpecification.getEls().add(identity);

		return identity;
	}

	
	/**
	 * 
	 * @param name
	 * @param path
	 * @return
	 */
	private ModelType createModelType (String name, String path) {
		ModelType model = WiresFactory.eINSTANCE.createModelType();
		model.setName(name);
		model.setPath(path);
		
		wiresSpecification.getEls().add(model);
		
		return model;
	}

	
	/**
	 * 
	 * @param modelType
	 * @param name
	 * @param path
	 * @return
	 */
	private Model createModel(String name, ModelType modelType, String path) {
		Model model = WiresFactory.eINSTANCE.createModel();
		model.setName(name);
		model.setType(modelType);
		model.setPath(path);

		wiresSpecification.getEls().add(model);
		
		return model;
	}

	
	
	/**
	 * 
	 * @param paramString
	 * @param falseTransf
	 * @param trueTransf
	 * @return
	 */
	private DecisionNode createDecisionNode(String inputString, String paramString,
			Transformation falseTransf, Transformation trueTransf) {

		DecisionNode node = WiresFactory.eINSTANCE.createDecisionNode();
		InputActualParameter inputActual = WiresFactory.eINSTANCE.createInputActualParameter();
		inputActual.setName(inputString);

		node.setExpression(paramString);
		node.getFalseBranch().add(falseTransf);
		node.getTrueBranch().add(trueTransf);
		node.getInParams().add(inputActual);

		wiresSpecification.getEls().add(node);

		return node;
	}
	
	
	/**
	 * 
	 * @param queryType
	 * @param name
	 * @param position
	 * @return
	 */
	private Query createQueryElement(QueryType queryType, String name) {
		
		Query query = WiresFactory.eINSTANCE.createQuery();
		
		query.setType(queryType);
		query.setName(name+"_"+this.getRandomNumber());

		for (int i = 0; i < queryType.getInParams().size(); i++) {
			InputFormalParameter inFormal = queryType.getInParams().get(i);
			InputActualParameter inActual = WiresFactory.eINSTANCE.createInputActualParameter();
			inActual.setType(inFormal);
			inActual.setName(inFormal.getName() + ":" + inFormal.getTypeName());
			query.getInParams().add(inActual);
		}

		for (int i = 0; i < queryType.getOutParams().size(); i++) {
			OutputFormalParameter outFormal = queryType.getOutParams().get(i);
			OutputActualParameter outActual = WiresFactory.eINSTANCE.createOutputActualParameter();
			outActual.setType(outFormal);
			outActual.setName(outFormal.getName() + ":"	+ outFormal.getTypeName());
			query.getOutParams().add(outActual);
		}
		
		wiresSpecification.getEls().add(query);
		
		return query;
	}
	
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	private QueryType getQueryType (String name) {
		
		Iterator<WiresElement> elemIterator = wiresSpecification.getEls().iterator();
		Boolean found = false;
		WiresElement element = null;
		QueryType type = null;
		
		while ((elemIterator.hasNext()) && (!found)) {
			element = elemIterator.next();
			if (element instanceof QueryType) {
				type = (QueryType) element;

				if ((type.getName()).equals(name))
					found = true;
			}
		}
		
		if (!found) type = null;

		return type;
	}
	
	
	/**
	 * 
	 * @param name
	 * @param path
	 * @param inFormal
	 * @param outFormal
	 * @return
	 * @throws SimulatorException 
	 */
	private QueryType createQueryType(String name, String path,
			InputFormalParameter inFormal, OutputFormalParameter outFormal)
	throws SimulatorException {
		
		QueryType queryType = WiresFactory.eINSTANCE.createQueryType();

		queryType.setName(name);
		queryType.setPath(path);
		queryType.getInParams().add(inFormal);
		queryType.getOutParams().add(outFormal);

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String file = "";
			String line;
			while ((line = br.readLine()) != null) {

				file = file + " " + line;
			}
			StringTokenizer tokens = new StringTokenizer(file, " ,:;", true);
			while (tokens.hasMoreTokens()) {
				String word = tokens.nextToken();

				if ((word.equals("uses")) && (tokens.hasMoreTokens())) {
					word = nextNoDelimToken(tokens);
					while ((!word.equals(";")) && (tokens.hasMoreTokens())) {

						LibraryRef lib = WiresFactory.eINSTANCE.createLibraryRef();
						lib.setName(word);
						lib.setLibrary(getLibrary(word));
						queryType.getLibraries().add(lib);

						word = nextNoDelimToken(tokens);
					}
				}
			}
		} catch (FileNotFoundException e) {
			throw new SimulatorException("Wires Error: "
					+ "File not found", e);
		} catch (IOException e) {
			throw new SimulatorException("Wires Error: "
					+ "IO error", e);
		}

		wiresSpecification.getEls().add(queryType);

		return queryType;
	}
	

	
	/**
	 * 
	 * @param elementModel
	 * @param position
	 * @return
	 * @throws SimulatorException
	 */
	private AtomicModelTransformation createAtomicModelTransf(
			String elementModel, int position) throws SimulatorException {

		AtomicModelTransformation atomModelTransf = WiresFactory.eINSTANCE.createAtomicModelTransformation();
		Iterator<WiresElement> elemIterator = wiresSpecification.getEls().iterator();
		WiresElement element = null;
		AtomicModelTransfomationType type = null;
		Boolean found = false;

		while ((elemIterator.hasNext()) && (!found)) {
			element = elemIterator.next();
			if (element instanceof AtomicModelTransfomationType) {
				type = (AtomicModelTransfomationType) element;

				if ((type.getName()).equals(elementModel))
					found = true;
			}
		}

		if (!found) {
			type = createAtomicModelTransfType(elementModel);
			atomModelTransf.setName(elementModel);
		} else {
			atomModelTransf.setName(elementModel + "_" + position);
		}

		atomModelTransf.setType(type);

		for (int i = 0; i < type.getInParams().size(); i++) {
			InputFormalParameter inFormal = type.getInParams().get(i);
			InputActualParameter inActual = WiresFactory.eINSTANCE.createInputActualParameter();
			inActual.setType(inFormal);
			inActual.setName(inFormal.getName() + ":" + inFormal.getTypeName());
			atomModelTransf.getInParams().add(inActual);
		}

		for (int i = 0; i < type.getOutParams().size(); i++) {
			OutputFormalParameter outFormal = type.getOutParams().get(i);
			OutputActualParameter outActual = WiresFactory.eINSTANCE.createOutputActualParameter();
			outActual.setType(outFormal);
			outActual.setName(outFormal.getName() + ":"	+ outFormal.getTypeName());
			atomModelTransf.getOutParams().add(outActual);
		}

		wiresSpecification.getEls().add(atomModelTransf);

		return atomModelTransf;
	}

	
	/**
	 * 
	 * @param list
	 * @param type
	 * @return
	 */
	private InputActualParameter getParamIn(EList<InputActualParameter> list, Type type) {
		Boolean found = false;
		InputActualParameter param = null;
		for (int i = 0; i < list.size() && !found; i++) {
			if ((((InputFormalParameter) ((list.get(i)).getType()))
					.getTypeEl().getName()).equals(type.getName())) {
				found = true;
				
				param = list.get(i);
			}
		}
		
		return param;
	}

	
	/**
	 * 
	 * @param list
	 * @param type
	 * @return
	 */
	private OutputActualParameter getParamOut(EList<OutputActualParameter> list, Type type) {
		Boolean found = false;
		OutputActualParameter param = null;
		for (int i = 0; i < list.size() && !found; i++) {
			if ((((OutputFormalParameter) ((list.get(i)).getType()))
					.getTypeEl().getName()).equals(type.getName())) {
				found = true;
				param = list.get(i);
			}
		}
		
		return param;
	}

	
	/**
	 * 
	 * @param elementModel
	 * @return
	 * @throws SimulatorException
	 */
	private AtomicModelTransfomationType createAtomicModelTransfType(String elementModel) throws SimulatorException {

		AtomicModelTransfomationType atomModelTransfType = WiresFactory.eINSTANCE
				.createAtomicModelTransfomationType();
		String pathTransfRule = mappingRule.getPathFileTransformation(elementModel);

		atomModelTransfType.setName(elementModel);
		atomModelTransfType.setPath(pathTransfRule);

		try {
			BufferedReader br = new BufferedReader(new FileReader(pathTransfRule));
			String file = " ";
			String line = "";
			String word = "";
			boolean end = false;

			while ((line = br.readLine()) != null)
				file = file + " " + line;
			StringTokenizer tokens = new StringTokenizer(file, " ,:;", true);
			do {
				word = tokens.nextToken();

				if ((word.equals("create")) && (tokens.hasMoreTokens())) {
					word = nextNoDelimToken(tokens);
					while ((!word.equals("from")) && (tokens.hasMoreTokens())) {
						OutputFormalParameter outParam = WiresFactory.eINSTANCE.createOutputFormalParameter();
						outParam.setName(word);
						outParam.setTypeName(nextNoDelimToken(tokens));
						atomModelTransfType.getOutParams().add(outParam);
						outParam.setTypeEl(getModelTypeByName(outParam.getTypeName()));

						word = nextNoDelimToken(tokens);
					}
				}
				if ((word.equals("from")) && (tokens.hasMoreTokens())) {
					word = nextNoDelimToken(tokens);
					while ((!word.equals(";")) && (tokens.hasMoreTokens())) {
						InputFormalParameter inParam = WiresFactory.eINSTANCE.createInputFormalParameter();
						inParam.setName(word);
						inParam.setTypeName(nextNoDelimToken(tokens));
						atomModelTransfType.getInParams().add(inParam);
						inParam.setTypeEl(getModelTypeByName(inParam.getTypeName()));

						word = nextNoDelimToken(tokens);
					}
				}
				if ((word.equals("uses")) && (tokens.hasMoreTokens())) {
					word = nextNoDelimToken(tokens);
					while ((!word.equals(";")) && (tokens.hasMoreTokens())) {

						LibraryRef lib = WiresFactory.eINSTANCE.createLibraryRef();
						lib.setName(word);
						lib.setLibrary(getLibrary(word));
						atomModelTransfType.getLibraries().add(lib);

						word = nextNoDelimToken(tokens);
					}
					end = true;
				}

				if ((word.equals("helper")) || (word.equals("rule")) || (word.equals("lazy")))
					end = true;
				if (!tokens.hasMoreTokens())
					break;
			} while (!end);

			wiresSpecification.getEls().add(atomModelTransfType);

		} catch (FileNotFoundException e) {
			throw new SimulatorException("Wires Error: " + "File not found", e);
		} catch (IOException e) {
			throw new SimulatorException("Wires Error: " + "IO error", e);
		}
		return atomModelTransfType;
	}
	
	/**
	 * 
	 * @param tokens
	 * @return
	 */
	private String nextNoDelimToken(StringTokenizer tokens) {
		String result = null;
		if (tokens.hasMoreTokens())
			result = tokens.nextToken();
		while ((tokens.hasMoreTokens())
				&& ((result.equals(" ")) || (result.equals(",")) || (result.equals(":")))) {
			result = tokens.nextToken();
		}
		return result;
	}

	/**
	 * 
	 * @param word
	 * @return
	 */
	private Library getLibrary(String word) {
		Iterator<WiresElement> elemIterator = wiresSpecification.getEls().iterator();
		WiresElement wiresEl = null;
		Library element = null;
		Boolean found = false;

		while ((elemIterator.hasNext()) && (!found)) {
			wiresEl = elemIterator.next();
			if (wiresEl instanceof Library) {
				element = (Library) wiresEl;
				if ((element.getName()).equals(word))
					found = true;
			}
		}

		if (!found) {
			element = WiresFactory.eINSTANCE.createLibrary();
			element.setName(word);
			element.setPath(config.getDirTransformationRepository() + word + ".atl");
			wiresSpecification.getEls().add(element);
		}
		return element;
	}

	
	/**
	 * 
	 * @param typeName
	 * @return
	 */
	private ModelType getModelTypeByName(String typeName) {

		Iterator<WiresElement> elemIterator = wiresSpecification.getEls().iterator();
		ModelType element = null;
		WiresElement wiresEl = null;
		Boolean found = false;


		if (typeName.equals("INConfiguration") || typeName.equals("OUTConfiguration")) {
			typeName = "mancoosimm";
		}
		
		if (typeName.equals("INCurrentPosition") || typeName.equals("OUTCurrentPosition")) {
				typeName = "positionmm";
			}
		
		if (typeName.equals("INPackage")) {
				typeName = "packagemm";
			}
		
		while ((elemIterator.hasNext()) && (!found)) {
			wiresEl = elemIterator.next();
			if (wiresEl instanceof ModelType) {
				element = (ModelType) wiresEl;
				if ((element.getName()).equals(typeName))
					found = true;
			}
		}
		
		if (!found) element = null;
		
		return element;
	}
}
