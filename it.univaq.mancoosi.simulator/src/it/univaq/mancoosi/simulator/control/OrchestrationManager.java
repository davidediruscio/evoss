/**
 * 
 */
package it.univaq.mancoosi.simulator.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import it.univaq.mancoosi.simulator.entity.StatementScript;
import it.univaq.mancoosi.simulator.exceptions.ErrorModelFoundException;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.util.CurrentSystemModelFile;
import it.univaq.mancoosi.simulator.util.FileManagement;
import it.univaq.mancoosi.simulator.util.SimulatorConfig;
import it.univaq.mancoosi.simulator.util.TransformationRuleFilesMapping;

import Wires.ActualParameter;
import Wires.AtomicModelTransfomationType;
import Wires.AtomicModelTransformation;
import Wires.BasicDataType;
import Wires.ConnectableElement;
import Wires.DataFlow;
import Wires.DecisionNode;
import Wires.FormalParameter;
import Wires.GenericTransformation;
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
import Wires.TransformationType;
import Wires.Type;
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
 * @author max
 */
public class OrchestrationManager {

	private String packageNameInput;
	private String typeScript;
	private String pathPackageModel;
	private SimulatorConfig config;
	private WiresSpecification wiresSpecification;
	private ArrayList<StatementScript> statementsScript;
	private TransformationRuleFilesMapping mappingRule;

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
	 * Provides the execution of the model created
	 * 
	 * @throws SimulatorException
	 */
	public void runOrchestrationModel() throws SimulatorException {

		try {
			
			((WiresSpecificationImpl) wiresSpecification).runExecution();

		} catch (InitialModelsNotFoundException e) {

			throw new SimulatorException("Wires Error: "
					+ "No initial models!", e);

		} catch (IdOutParamNotFound e) {

			WiresElement wEl = e.getWiresElement();
			String paramName = ((ActualParameter) wEl).getName();
			String transName = ((IdentityTransformation) (((ActualParameter) wEl)
					.eContainer())).getName();
			throw new SimulatorException("Wires Error: "
					+ "The input parameter '" + paramName
					+ "' does not have an output parameter with the"
					+ " same name in the identity transformation '" + transName
					+ "'", e);

		} catch (ATLExtractionFailedException e) {

			WiresElement wEl = e.getWiresElement();
			String transName = ((GenericTransformation) (((ActualParameter) wEl)
					.eContainer())).getName();

			throw new SimulatorException("Wires Error: "
					+ "ATL code extraction failed at generic transformation '"
					+ transName + "'", e);

		} catch (LibraryNotFoundException e) {

			LibraryRef lib = e.getLibraryRef();
			String libRefName = lib.getName();
			String containerName = ((TransformationType) (lib.eContainer()))
					.getName();
			String concept = "";
			if ((lib instanceof TransformationType))
				concept = "transformation type";
			else if ((lib instanceof Library)) {
				concept = "library";
			}
			throw new SimulatorException("Wires Error: "
					+ "Library not found at library ref '" + libRefName
					+ "' of " + concept + " '" + containerName + "'", e);

		} catch (MetamodelNotFoundException e) {

			WiresElement wEl = e.getWiresElement();
			if ((wEl instanceof FormalParameter)) {
				String paramName = ((FormalParameter) wEl).getName() + ":"
						+ ((FormalParameter) wEl).getTypeName();
				String tType = ((TransformationType) (((FormalParameter) wEl)
						.eContainer())).getName();
				throw new SimulatorException("Wires Error: "
						+ "Please fill the typeEl attribute in the parameter '"
						+ paramName + "' of the transformation '" + tType
						+ " '", e);
			} else if ((wEl instanceof ModelType)) {
				String mmName = ((ModelType) wEl).getName();
				throw new SimulatorException("Wires Error: "
						+ "Could not find metamodel '" + mmName + "'", e);
			}

		} catch (QueryFailedException e) {

			WiresElement wEl = e.getWiresElement();
			String transName = ((Query) wEl).getName();
			throw new SimulatorException("Wires Error: " + "Query '"
					+ transName + "' failed", e);

		} catch (ResourceNotFoundException e) {

			WiresElement wEl = e.getWiresElement();
			String elementName = ((ConnectableElement) wEl).getName();
			throw new SimulatorException("Wires Error: "
					+ "Path not found for '" + elementName + "'" + " element", e);

		} catch (TypeNotFoundException e) {
			WiresElement wEl = e.getWiresElement();
			String elementName = ((ConnectableElement) wEl).getName();
			throw new SimulatorException("Wires Error: "
					+ "Type not found at '" + elementName + "'" + " element", e);

		} catch (TransformationFailedException e) {
			throw new SimulatorException("Wires Error: "
					+ "Transformation failed", e);

		} catch (Exception e) {
			throw new SimulatorException("Wires execution error", e);
		}
		
		File modelError = new File(config.getDirOutput() + config.getFileErrorModel());
		//If the orchestration produced the model then the simulation ends
		if (modelError.exists()) throw new ErrorModelFoundException(
				"Error model created from the execution" +
				" of the script: "+ packageNameInput+"."+typeScript);
		
	}

	/**
	 * 
	 * @throws SimulatorException
	 */
	private void saveModel() throws SimulatorException {

		String pathFile = config.getDirOrchestrationModels() + packageNameInput
				+ "_" + typeScript + ".wires";
		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("wires", new EcoreResourceFactoryImpl());

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
		ModelType modelSystemType = createModelType("mancoosimm", config
				.getDirModelTypes()
				+ "mancoosimm.ecore");
		ModelType modelPackageType = createModelType("packagemm", config
				.getDirModelTypes()
				+ "packagemm.ecore");
		ModelType modelErrorType = createModelType("MMError", config
				.getDirModelTypes()
				+ "errormm.ecore");
		ModelType modelAtlType = createModelType("ATL", config
				.getDirModelTypes()
				+ "ATL-0.2.ecore");
		ModelType modelExecPositionType = createModelType(
				"positionmm", config.getDirModelTypes()
						+ "positionmm.ecore");

		// Basic DataType Integer
		BasicDataType integerType = WiresFactory.eINSTANCE
				.createBasicDataType();
		integerType.setName("Integer");
		wiresSpecification.getEls().add(integerType);
		// Basic DataType Boolean
		BasicDataType booleanType = WiresFactory.eINSTANCE
		.createBasicDataType();
		booleanType.setName("Boolean");
		wiresSpecification.getEls().add(booleanType);
		
		// Package model
		Model packageModel = createModel(packageNameInput, modelPackageType,
				pathPackageModel);

		// Configuration model - input
		Model systemModelIn = createModel("systemModelInput", modelSystemType,
				CurrentSystemModelFile.getInstance().getSystemModelCurrent()
						.getPath());

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
		CurrentSystemModelFile.getInstance().setSystemModelCurrent(newTempFile);

		// Error model
		Model errorModel = createModel("errorModel", modelErrorType, config
				.getDirOutput()
				+ config.getFileErrorModel());

		// Statements
		ArrayList<AtomicModelTransformation> transfTemp = new ArrayList<AtomicModelTransformation>();
		
		int i = 0;
		while (i < statementsScript.size()) {
			
			if (statementsScript.get(i).getType().equals("If")) {
				
				AtomicModelTransformation atomicModelTransfHOT = 
					createAtomicModelTransf(statementsScript.get(i).getType(), i);

				setInputTransfPackageModel (atomicModelTransfHOT, packageModel, i);
				setInputTransfPositionModel (atomicModelTransfHOT, modelExecPositionType, i);
				
				// Type Query
				AtomicModelTransfomationType conditionQueryType = WiresFactory.eINSTANCE.createAtomicModelTransfomationType();
				wiresSpecification.getEls().add(conditionQueryType);
				conditionQueryType.setName("Type_"+statementsScript.get(i).getType()+"_"+statementsScript.get(i).getPosition());
				File transformationTempFile = FileManagement.createTempFile("condition", "atl");
				conditionQueryType.setPath(transformationTempFile.getPath());
				InputFormalParameter inputParamQuery = WiresFactory.eINSTANCE.createInputFormalParameter();
				inputParamQuery.setTypeEl(modelSystemType);
				inputParamQuery.setName(inputSystemModel);
				inputParamQuery.setTypeName(inputSystemModel);
				conditionQueryType.getInParams().add(inputParamQuery);
				OutputFormalParameter outputParamQuery = WiresFactory.eINSTANCE.createOutputFormalParameter();
				outputParamQuery.setTypeEl(booleanType);
				outputParamQuery.setName("OUT");
				outputParamQuery.setTypeName("Boolean");
				conditionQueryType.getOutParams().add(outputParamQuery);
				
				// Query
				GenericTransformation conditionQuery = WiresFactory.eINSTANCE.createGenericTransformation();
				wiresSpecification.getEls().add(conditionQuery);
				//TypeParameter paramTypeParameter = WiresFactory.eINSTANCE.createTypeParameter();
				//paramTypeParameter.setType(modelAtlType);
				conditionQuery.setType(conditionQueryType);
				InputActualParameter inActualQuery = WiresFactory.eINSTANCE.createInputActualParameter();
				inActualQuery.setType(inputParamQuery);
				inActualQuery.setName(inputParamQuery.getName()+":"+inputParamQuery.getTypeName());
				conditionQuery.getInParams().add(inActualQuery);
				OutputActualParameter outActualQuery = WiresFactory.eINSTANCE.createOutputActualParameter();
				outActualQuery.setType(outputParamQuery);
				outActualQuery.setName(outputParamQuery.getName()+":"+outputParamQuery.getTypeName());
				conditionQuery.getOutParams().add(outActualQuery);
				
				// DataFlow: HOT --> GenericTransformation
				DataFlow outHOTinTypeParam = WiresFactory.eINSTANCE.createDataFlow();
				OutputActualParameter outputActual = getParamOut(atomicModelTransfHOT.getOutParams(), modelAtlType);
				
				outHOTinTypeParam.setSrc(outputActual);
				outHOTinTypeParam.setTarget(conditionQuery.getTypeParam());
				conditionQuery.getTypeParam().getIncoming().add(outHOTinTypeParam);
				outputActual.getOutgoing().add(outHOTinTypeParam);
				wiresSpecification.getEls().add(outHOTinTypeParam);
				
				//TODO
				
			} else {

				AtomicModelTransformation atomicModelTransf = null;

				atomicModelTransf = createAtomicModelTransf(statementsScript
						.get(i).getType(), i);

				transfTemp.add(atomicModelTransf);

				DataFlow in = WiresFactory.eINSTANCE.createDataFlow();

				InputActualParameter inActual = getParamIn(atomicModelTransf.getInParams(), systemModelIn.getType());
				in.setTarget(inActual);

				inActual.getIncoming().add(in);

				if (i == 0) {

					in.setSrc(systemModelIn);
					systemModelIn.getOutgoing().add(in);

				} else {

					OutputActualParameter outActual = getParamOut((transfTemp
							.get(i - 1)).getOutParams(), systemModelIn
							.getType());

					in.setSrc(outActual);
					outActual.getOutgoing().add(in);

					// init2 - For transformation with possible error model
					OutputActualParameter outActualError = getParamOut(
							transfTemp.get(i - 1).getOutParams(), errorModel
									.getType());
					if (outActualError != null) {

						// Error modelTemp
						String nameErrorModel = config.getFileErrorModel();
						File errorTempFile = FileManagement.createTempFile(
								nameErrorModel.substring(0, nameErrorModel
										.lastIndexOf(".")), nameErrorModel
										.substring(nameErrorModel
												.lastIndexOf(".") + 1,
												nameErrorModel.length()));
						Model errorModelTemp = createModel("errorModelTemp_"
								+ (i - 1), modelErrorType, errorTempFile
								.getPath());

						// Dataflow: OUTActual --> TempErrorModel
						DataFlow outActualModelTemp = WiresFactory.eINSTANCE
								.createDataFlow();
						outActualModelTemp.setSrc(outActualError);
						outActualModelTemp.setTarget(errorModelTemp);
						wiresSpecification.getEls().add(outActualModelTemp);
						errorModelTemp.getIncoming().add(outActualModelTemp);
						outActualError.getOutgoing().add(outActualModelTemp);

						createManagementErrorModel(errorModelTemp,
								atomicModelTransf, errorModel, null,
								integerType, i - 1);
					}
					// end2

				}

				wiresSpecification.getEls().add(in);

				setInputTransfPackageModel (atomicModelTransf, packageModel, i);
				setInputTransfPositionModel (atomicModelTransf, modelExecPositionType, i);

				if (i == (statementsScript.size() - 1)) {

					// init2 - For transformation with possible error model
					OutputActualParameter outActualError = getParamOut(
							atomicModelTransf.getOutParams(), errorModel
									.getType());
					if (outActualError != null) {

						// Error modelTemp
						String nameErrorModel = config.getFileErrorModel();
						File errorTempFile = FileManagement.createTempFile(
								nameErrorModel.substring(0, nameErrorModel
										.lastIndexOf(".")), nameErrorModel
										.substring(nameErrorModel
												.lastIndexOf(".") + 1,
												nameErrorModel.length()));
						Model errorModelTemp = createModel("errorModel_" + i,
								modelErrorType, errorTempFile.getPath());

						// Dataflow: OUTActual --> TempErrorModel
						DataFlow outActualModelTemp = WiresFactory.eINSTANCE
								.createDataFlow();
						outActualModelTemp.setSrc(outActualError);
						outActualModelTemp.setTarget(errorModelTemp);
						wiresSpecification.getEls().add(outActualModelTemp);
						errorModelTemp.getIncoming().add(outActualModelTemp);
						outActualError.getOutgoing().add(outActualModelTemp);

						createManagementErrorModel(errorModelTemp,
								atomicModelTransf, errorModel, systemModelOut,
								integerType, i);
						// end2
					} else {
						DataFlow inT = WiresFactory.eINSTANCE.createDataFlow();
						OutputActualParameter outputActual = getParamOut(
								atomicModelTransf.getOutParams(),
								systemModelOut.getType());
						inT.setSrc(outputActual);
						inT.setTarget(systemModelOut);
						systemModelOut.getIncoming().add(inT);
						outputActual.getOutgoing().add(inT);
						wiresSpecification.getEls().add(inT);
					}
				}
			i++;
			}
		}
	}

	
	/**
	 * 
	 * @param atomicModelTransf
	 * @param packageModel
	 * @param i
	 * @throws Exception
	 */
	private void setInputTransfPackageModel (AtomicModelTransformation atomicModelTransf, Model packageModel, int i) throws Exception {	

		InputActualParameter inputActual = getParamIn(atomicModelTransf
				.getInParams(), packageModel.getType());
		if (inputActual != null) {
	
			DataFlow inPackage = WiresFactory.eINSTANCE
					.createDataFlow();
			inPackage.setSrc(packageModel);
			inPackage.setTarget(inputActual);
			inputActual.getIncoming().add(inPackage);
			packageModel.getOutgoing().add(inPackage);
			wiresSpecification.getEls().add(inPackage);
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
					modelExecPositionType, positionModel
							.getPathPositionScriptModel());

			DataFlow inPosition = WiresFactory.eINSTANCE
					.createDataFlow();

			inPosition.setSrc(posInModel);
			inPosition.setTarget(inActualPosition);
			inActualPosition.getIncoming().add(inPosition);
			posInModel.getOutgoing().add(inPosition);
			wiresSpecification.getEls().add(inPosition);
		}
	}

	
	/**
	 * 
	 * @param errorModelTemp
	 * @param atomicModelTransformation
	 * @param errorModel
	 * @param i
	 * @throws SimulatorException 
	 */
	private void createManagementErrorModel(
			Model errorModelTemp,
			AtomicModelTransformation atomicModelTransformation,
			Model errorModel, Model sysModelOut, BasicDataType integerType, int position) throws SimulatorException {

		QueryType isEmptyErrorModel = getQueryType("isEmptyErrorModel");
		
		if (isEmptyErrorModel == null) {
			InputFormalParameter inputFormal = WiresFactory.eINSTANCE.createInputFormalParameter();
			inputFormal.setName("INERR");
			inputFormal.setTypeEl((ModelType)errorModel.getType());
			inputFormal.setTypeName("MMError");
			
			OutputFormalParameter outputFormal = WiresFactory.eINSTANCE.createOutputFormalParameter();
			outputFormal.setName("OUTINT");
			outputFormal.setTypeEl(integerType);
			outputFormal.setTypeName("Integer");
			
			isEmptyErrorModel = createQueryType("isEmptyErrorModel", config.getDirTransformationRepository()
					+"isEmptyErrorModel.atl", inputFormal, outputFormal);
		}
		
		// Query
		Query isEmptyQuery = createQueryElement(isEmptyErrorModel, "isEmptyErrorModel", position);
		
		// DataFlow: ErrorTempModel --> Query
		DataFlow outErrQueryDataflow = WiresFactory.eINSTANCE.createDataFlow();
		outErrQueryDataflow.setSrc(errorModelTemp);
		errorModelTemp.getOutgoing().add(outErrQueryDataflow);
		outErrQueryDataflow.setTarget(isEmptyQuery.getInParams().get(0));
		isEmptyQuery.getInParams().get(0).getIncoming().add(outErrQueryDataflow);
		wiresSpecification.getEls().add(outErrQueryDataflow);
		
		// IdentityTransformation - ErrorModel
		IdentityTransformation identityErrorModel = createIdentityTransf(position, (ModelType)errorModel.getType());
		
		// DecisionNode
		DecisionNode node;
		
		if (sysModelOut == null) {
			
			node = createDecisionNode("x>0", atomicModelTransformation, identityErrorModel);
			atomicModelTransformation.setControlNode(node);
			
		} else {
			
			// Configuration model - Temp
			String inputSystemModel = config.getFileInputSystemModel();
			String nameFileModel = inputSystemModel.substring(inputSystemModel
					.lastIndexOf("/") + 1, inputSystemModel.length());
			File newTempFile = FileManagement.createTempFile(nameFileModel.substring(0,
					nameFileModel.lastIndexOf(".")), nameFileModel
					.substring(nameFileModel.lastIndexOf(".") + 1,
							nameFileModel.length()));
			Model systemModelTemp = createModel("systemModelOutputTemp", (ModelType)sysModelOut.getType(),
					newTempFile.getPath());
			
			// Dataflow: OutActualSystamModel --> tempSysModel
			DataFlow inT = WiresFactory.eINSTANCE.createDataFlow();
			OutputActualParameter outputActual = getParamOut(
					atomicModelTransformation.getOutParams(), sysModelOut.getType());
			inT.setSrc(outputActual);
			inT.setTarget(systemModelTemp);
			systemModelTemp.getIncoming().add(inT);
			outputActual.getOutgoing().add(inT);
			wiresSpecification.getEls().add(inT);
			
			// IdentityTransformation - 
			IdentityTransformation identitySysModel = createIdentityTransf(position+1, (ModelType)systemModelTemp.getType());
			node = createDecisionNode("x>0", identitySysModel, identityErrorModel);
			
			// DataFlow: TempSysModel --> Identity
			DataFlow outTempIdentityDataflow = WiresFactory.eINSTANCE.createDataFlow();
			outTempIdentityDataflow.setSrc(systemModelTemp);
			systemModelTemp.getOutgoing().add(outTempIdentityDataflow);
			outTempIdentityDataflow.setTarget(identitySysModel.getInParams().get(0));
			identitySysModel.getInParams().get(0).getIncoming().add(outTempIdentityDataflow);
			wiresSpecification.getEls().add(outTempIdentityDataflow);
			
			// DataFlow: Identity --> SysModel
			DataFlow identityModelDataflow = WiresFactory.eINSTANCE.createDataFlow();
			identityModelDataflow.setSrc(identitySysModel.getOutParams().get(0));
			identitySysModel.getOutParams().get(0).getOutgoing().add(identityModelDataflow);
			identityModelDataflow.setTarget(sysModelOut);
			sysModelOut.getIncoming().add(identityModelDataflow);
			wiresSpecification.getEls().add(identityModelDataflow);
		}
		
		identityErrorModel.setControlNode(node);
		
		// DataFlow: Query --> DecisionNode
		DataFlow queryNodeDataflow = WiresFactory.eINSTANCE.createDataFlow();
		queryNodeDataflow.setSrc(isEmptyQuery.getOutParams().get(0));
		isEmptyQuery.getOutParams().get(0).getOutgoing().add(queryNodeDataflow);
		queryNodeDataflow.setTarget(node.getInParams().get(0));
		node.getInParams().get(0).getIncoming().add(queryNodeDataflow);
		wiresSpecification.getEls().add(queryNodeDataflow);
		
		// DataFlow: TempErrorModel --> Identity
		DataFlow outActualIdentityDataflow = WiresFactory.eINSTANCE.createDataFlow();
		outActualIdentityDataflow.setSrc(errorModelTemp);
		errorModelTemp.getOutgoing().add(outActualIdentityDataflow);
		outActualIdentityDataflow.setTarget(identityErrorModel.getInParams().get(0));
		identityErrorModel.getInParams().get(0).getIncoming().add(outActualIdentityDataflow);
		wiresSpecification.getEls().add(outActualIdentityDataflow);
		
		// DataFlow: Identity --> errorModel
		DataFlow identityModelDataflow = WiresFactory.eINSTANCE.createDataFlow();
		identityModelDataflow.setSrc(identityErrorModel.getOutParams().get(0));
		identityErrorModel.getOutParams().get(0).getOutgoing().add(identityModelDataflow);
		identityModelDataflow.setTarget(errorModel);
		errorModel.getIncoming().add(identityModelDataflow);
		wiresSpecification.getEls().add(identityModelDataflow);
	}
	
	/**
	 * 
	 * @param position
	 * @param node
	 * @return
	 */
	private IdentityTransformation createIdentityTransf(int position, ModelType modelType) {
		IdentityTransformation identity = WiresFactory.eINSTANCE
				.createIdentityTransformation();
		identity.setName("identity_" + position);
		
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
	private DecisionNode createDecisionNode(String paramString,
			Transformation falseTransf, Transformation trueTransf) {

		DecisionNode node = WiresFactory.eINSTANCE.createDecisionNode();
		InputActualParameter inputActual = WiresFactory.eINSTANCE.createInputActualParameter();
		inputActual.setName("x");

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
	private Query createQueryElement(QueryType queryType,
									String name, int position) {
		
		Query query = WiresFactory.eINSTANCE.createQuery();
		
		query.setType(queryType);
		query.setName(name+"_"+position);

		for (int i = 0; i < queryType.getInParams().size(); i++) {
			InputFormalParameter inFormal = queryType.getInParams().get(i);
			InputActualParameter inActual = WiresFactory.eINSTANCE
					.createInputActualParameter();
			inActual.setType(inFormal);
			inActual.setName(inFormal.getName() + ":" + inFormal.getTypeName());
			query.getInParams().add(inActual);
		}

		for (int i = 0; i < queryType.getOutParams().size(); i++) {
			OutputFormalParameter outFormal = queryType.getOutParams().get(i);
			OutputActualParameter outActual = WiresFactory.eINSTANCE
					.createOutputActualParameter();
			outActual.setType(outFormal);
			outActual.setName(outFormal.getName() + ":"
					+ outFormal.getTypeName());
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

						LibraryRef lib = WiresFactory.eINSTANCE
								.createLibraryRef();
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

		AtomicModelTransformation atomModelTransf = WiresFactory.eINSTANCE
				.createAtomicModelTransformation();
		Iterator<WiresElement> elemIterator = wiresSpecification.getEls()
				.iterator();
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
			InputActualParameter inActual = WiresFactory.eINSTANCE
					.createInputActualParameter();
			inActual.setType(inFormal);
			inActual.setName(inFormal.getName() + ":" + inFormal.getTypeName());
			atomModelTransf.getInParams().add(inActual);
		}

		for (int i = 0; i < type.getOutParams().size(); i++) {
			OutputFormalParameter outFormal = type.getOutParams().get(i);
			OutputActualParameter outActual = WiresFactory.eINSTANCE
					.createOutputActualParameter();
			outActual.setType(outFormal);
			outActual.setName(outFormal.getName() + ":"
					+ outFormal.getTypeName());
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
	private InputActualParameter getParamIn(EList<InputActualParameter> list,
			Type type) {
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
	private OutputActualParameter getParamOut(
			EList<OutputActualParameter> list, Type type) {
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
	private AtomicModelTransfomationType createAtomicModelTransfType(
			String elementModel) throws SimulatorException {

		AtomicModelTransfomationType atomModelTransfType = WiresFactory.eINSTANCE
				.createAtomicModelTransfomationType();
		String pathTransfRule = mappingRule
				.getPathFileTransformation(elementModel);

		atomModelTransfType.setName(elementModel);
		atomModelTransfType.setPath(pathTransfRule);

		try {
			BufferedReader br = new BufferedReader(new FileReader(
					pathTransfRule));
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
						OutputFormalParameter outParam = WiresFactory.eINSTANCE
								.createOutputFormalParameter();
						outParam.setName(word);
						outParam.setTypeName(nextNoDelimToken(tokens));
						atomModelTransfType.getOutParams().add(outParam);
						outParam.setTypeEl(getModelTypeByName(outParam
								.getTypeName()));

						word = nextNoDelimToken(tokens);
					}
				}
				if ((word.equals("from")) && (tokens.hasMoreTokens())) {
					word = nextNoDelimToken(tokens);
					while ((!word.equals(";")) && (tokens.hasMoreTokens())) {
						InputFormalParameter inParam = WiresFactory.eINSTANCE
								.createInputFormalParameter();
						inParam.setName(word);
						inParam.setTypeName(nextNoDelimToken(tokens));
						atomModelTransfType.getInParams().add(inParam);
						inParam.setTypeEl(getModelTypeByName(inParam
								.getTypeName()));

						word = nextNoDelimToken(tokens);
					}
				}
				if ((word.equals("uses")) && (tokens.hasMoreTokens())) {
					word = nextNoDelimToken(tokens);
					while ((!word.equals(";")) && (tokens.hasMoreTokens())) {

						LibraryRef lib = WiresFactory.eINSTANCE
								.createLibraryRef();
						lib.setName(word);
						lib.setLibrary(getLibrary(word));
						atomModelTransfType.getLibraries().add(lib);

						word = nextNoDelimToken(tokens);
					}
					end = true;
				}

				if ((word.equals("helper")) || (word.equals("rule"))
						|| (word.equals("lazy")))
					end = true;
				if (!tokens.hasMoreTokens())
					break;
			} while (!end);

			wiresSpecification.getEls().add(atomModelTransfType);

		} catch (FileNotFoundException e) {
			throw new SimulatorException("Wires Error: "
					+ "File not found", e);
		} catch (IOException e) {
			throw new SimulatorException("Wires Error: "
					+ "IO error", e);
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
				&& ((result.equals(" ")) || (result.equals(",")) || (result
						.equals(":")))) {
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
			element.setPath(config.getDirTransformationRepository() + word
					+ ".atl");
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

		Iterator<WiresElement> elemIterator = wiresSpecification.getEls()
				.iterator();
		ModelType element = null;
		WiresElement wiresEl = null;
		Boolean found = false;


		if (typeName.equals("INConfiguration")
			|| typeName.equals("OUTConfiguration")) {
			typeName = "mancoosimm";
		}
		
		if (typeName.equals("INCurrentPosition")
				|| typeName.equals("OUTCurrentPosition")) {
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
		
		return element;
	}
}
