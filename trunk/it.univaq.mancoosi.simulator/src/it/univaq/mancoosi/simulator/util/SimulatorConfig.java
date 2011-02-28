/**
 * 
 */
package it.univaq.mancoosi.simulator.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

/**
 * This class manages the configuration
 */
public class SimulatorConfig {

	private static SimulatorConfig instance = null;

	private String dirInputPackageModels;
	private String dirModelTypes;
	private String dirTransformationRepository;
	private String dirOrchestrationModels;
	private String dirTmp;
	private String dirLog;
	private String dirBackup;
	private String filePackageSequence;
	private String fileInputSystemModel;
	private String fileOutputSystemModel;
	private String fileExtensionPackageModel;
	private String fileErrorModel;
	private String packageInjectorFile;
	private boolean saveFileLog;
	private boolean saveOrchestrationModel;
	private boolean saveTempFiles;
	private boolean consoleLog;
	private int deleteFilesOlderThanNdays;


	/**
	 * Singleton
	 * @return instance
	 * @throws SimulatorException
	 */
	public static SimulatorConfig getInstance() throws SimulatorException {
		if (instance == null)
			instance = new SimulatorConfig();
		return instance;
	}

	/**
	 * Private constructor
	 * @throws SimulatorException
	 */
	private SimulatorConfig() throws SimulatorException {

		Properties props = new Properties();
		try {
			props.load(new FileInputStream("config" + File.separator + "simulator_settings.properties"));
		} catch (FileNotFoundException e) {
			throw new SimulatorException("Error properties file not found", e);
		} catch (IOException e) {
			throw new SimulatorException("IO Error in properties file", e);
		}


		if (!(props.getProperty("save_file_logger")).equals("no")) {
			saveFileLog = true;
		} else {
			saveFileLog = false;
		}
		
		if ((props.getProperty("console_logger")).equals("yes")) {
			consoleLog = true;
		} else {
			consoleLog = false;
		}
		
		if ((props.getProperty("save_temp_files")).equals("yes")) {
			saveTempFiles = true;
		} else {
			saveTempFiles = false;
		}

		if ((props.getProperty("save_orchestration_model")).equals("yes")) {
			saveOrchestrationModel = true;
		} else {
			saveOrchestrationModel = false;
		}

		dirInputPackageModels = props.getProperty("directory_input_package_models");
		if (!dirInputPackageModels.endsWith(File.separator)) {
			dirInputPackageModels = dirInputPackageModels + File.separator;
		}

		
		dirModelTypes = props.getProperty("directory_model_types");
		if (!dirModelTypes.endsWith(File.separator)) {
			dirModelTypes = dirModelTypes + File.separator;
		}

				
		dirTransformationRepository = props.getProperty("directory_transformation_repository");
		if (!dirTransformationRepository.endsWith(File.separator)) {
			dirTransformationRepository = dirTransformationRepository + File.separator;
		}
		
		
		dirOrchestrationModels = props.getProperty("directory_orchestration_models");
		if (!dirOrchestrationModels.endsWith(File.separator)) {
			dirOrchestrationModels = dirOrchestrationModels + File.separator;
		}

		
		dirTmp = props.getProperty("directory_tmp");
		if (!dirTmp.endsWith(File.separator)) {
			dirTmp = dirTmp + File.separator;
		}

		
		dirLog = props.getProperty("directory_log");
		if (!dirLog.endsWith(File.separator)) {
			dirLog = dirLog + File.separator;
		}

		
		dirBackup = props.getProperty("directory_backup");
		if (!dirBackup.endsWith(File.separator)) {
			dirBackup = dirBackup + File.separator;
		}

		
		filePackageSequence = props.getProperty("file_input_package_sequence");
		fileInputSystemModel = props.getProperty("file_input_system_model");
		fileExtensionPackageModel = props.getProperty("file_extension_package_model");
		fileErrorModel = props.getProperty("file_output_error_model");
		fileOutputSystemModel = props.getProperty("file_output_system_model");
		packageInjectorFile = props.getProperty("package_injector");
		deleteFilesOlderThanNdays = Integer.valueOf(props.getProperty("delete_files_older_thanNdays"));
	}

	/**
	 * @param dirInputPackageModels
	 *            the dirInputPackageModels to set
	 */
	public void setDirInputPackageModels(String dirInputPackageModels) {
		this.dirInputPackageModels = dirInputPackageModels;
	}

	/**
	 * @return the dirInputModel
	 */
	public String getDirInputPackageModels() {
		return dirInputPackageModels;
	}

	/**
	 * @param dirModelTypes
	 *            the dirModelTypes to set
	 */
	public void setDirModelTypes(String dirModelTypes) {
		this.dirModelTypes = dirModelTypes;
	}
	
	/**
	 * @param filePackageSequence
	 *            the filePackageSequence to set
	 */
	public void setFilePackageSequence(String filePackageSequence) {
		this.filePackageSequence = filePackageSequence;
	}

	/**
	 * @return the dirModelTypes
	 */
	public String getDirModelTypes() {
		return dirModelTypes;
	}

	/**
	 * @param dirOrchestrationModels
	 *            the dirOrchestrationModels to set
	 */
	public void setDirOrchestrationModels(String dirOrchestrationModels) {
		this.dirOrchestrationModels = dirOrchestrationModels;
	}

	/**
	 * @return the dirOrchestrationModels
	 */
	public String getDirOrchestrationModels() {
		return dirOrchestrationModels;
	}

	/**
	 * @param fileInputSystemModel
	 *            the fileInputSystemModel to set
	 */
	public void setFileInputSystemModel(String fileInputSystemModel) {
		this.fileInputSystemModel = fileInputSystemModel;
	}
	
	/**
	 * @param dirTransformationRepository
	 *            the dirTransformationRepository to set
	 */
	public void setDirTransformationRepository(
			String dirTransformationRepository) {
		this.dirTransformationRepository = dirTransformationRepository;
	}

	/**
	 * @param fileErrorModel
	 *            the fileErrorModel to set
	 */
	public void setFileErrorModel(String fileErrorModel) {
		this.fileErrorModel = fileErrorModel;
	}
	
	/**
	 * @return the dirTransformationRepository
	 */
	public String getDirTransformationRepository() {
		return dirTransformationRepository;
	}

	/**
	 * @return the filePackageSequence
	 */
	public String getFilePackageSequence() {
		return filePackageSequence;
	}

	/**
	 * @return the fileSystemModelInput
	 */
	public String getFileInputSystemModel() {
		return fileInputSystemModel;
	}

	/**
	 * @return the fileExtensionPackageModel
	 */
	public String getFileExtensionPackageModel() {
		return fileExtensionPackageModel;
	}

	/**
	 * @return the dirTmp
	 */
	public String getTmpDir() {
		return dirTmp;
	}

	/**
	 * @return the dirLog
	 */
	public String getDirLog() {
		return dirLog;
	}

	/**
	 * @return the saveOrchestrationModel
	 */
	public Boolean isSaveOrchestrationModel() {
		return saveOrchestrationModel;
	}

	/**
	 * @return the saveTempFiles
	 */
	public Boolean isSaveTempFiles() {
		return saveTempFiles;
	}

	/**
	 * @return the fileErrorModel
	 */
	public String getFileErrorModel() {
		return fileErrorModel;
	}

	/**
	 * @return the saveFileLog
	 */
	public Boolean isSaveFileLog() {
		return saveFileLog;
	}

	/**
	 * @return the consoleLog
	 */
	public boolean isConsoleLog() {
		return consoleLog;
	}

	public void setPackageInjectorFile(String injectorPackageFile) {
		this.packageInjectorFile = injectorPackageFile;
	}

	public String getPackageInjectorFile() {
		return packageInjectorFile;
	}

	public void setDeleteFilesOlderThanNdays(int deleteFilesOlderThanNdays) {
		this.deleteFilesOlderThanNdays = deleteFilesOlderThanNdays;
	}

	public int getDeleteFilesOlderThanNdays() {
		return deleteFilesOlderThanNdays;
	}

	public void setDirBackup(String dirBackup) {
		this.dirBackup = dirBackup;
	}

	public String getDirBackup() {
		return dirBackup;
	}

	/**
	 * @param fileOutputSystemModel the fileOutputSystemModel to set
	 */
	public void setFileOutputSystemModel(String fileOutputSystemModel) {
		this.fileOutputSystemModel = fileOutputSystemModel;
	}

	/**
	 * @return the fileOutputSystemModel
	 */
	public String getFileOutputSystemModel() {
		return fileOutputSystemModel;
	}


}
