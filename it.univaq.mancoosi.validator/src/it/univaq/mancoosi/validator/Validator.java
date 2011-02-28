package it.univaq.mancoosi.validator;

import it.univaq.mancoosi.validator.debian.DebianValidator;
import it.univaq.mancoosi.validator.exceptions.ValidatorException;
import it.univaq.mancoosi.validator.util.EmfCompareLaunch;
import it.univaq.mancoosi.validator.util.FileManagement;
import it.univaq.mancoosi.validator.util.ValidatorConfig;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.HashMap;

import javax.xml.bind.ValidationException;

public abstract class Validator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<String, Integer> options = new HashMap<String, Integer>();
		options.put("install", 1);
		options.put("remove", 2);
		options.put("purge", 3);

		if (!System.getProperty("user.name").equals("root")) {
			System.out.println("Permission denied. You must have root privileges.");
			System.exit(1);
		}

		if (args == null || args.length == 0 || !options.containsKey(args[0])) {
			printHelpCommand();
			System.exit(1);
		}

		if (args[1] != null && !options.containsKey(args[1])) {
			String listparam = args[0];
			for (int i = 1; i < args.length; i++) {
				if (options.containsKey(args[i])) {
					printHelpCommand();
					System.exit(1);
				}
				listparam = listparam + " " + args[i];
			}
			try {

				Validator v = null;

				if ((new File("/etc/debian_version")).exists()
						|| (new File("/etc/ubuntu_version")).exists()) {

					v = new DebianValidator();
					v.realtime(listparam);

				} else {
					// TODO
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} else {
			printHelpCommand();
			System.exit(1);
		}
	}

	/**
	 * 
	 */
	public static void printHelpCommand() {
		System.out.println("Options:");
		System.out.println(" install pkg1 [pkg2 ...]");
		System.out.println(" remove  pkg1 [pkg2 ...]");
		System.out.println(" purge   pkg1 [pkg2 ...]\n");
		System.out.println("         This Validator has Super Cow Powers.\n");
	}

	/**
	 * 
	 * @param config
	 * @param pathDir
	 * @throws Exception
	 */
	protected void realtime(String params) throws Exception {

		File dir = FileManagement.createTempDirectory();
		ValidatorConfig config = ValidatorConfig.getInstance();

		if (!dir.isDirectory()) {
			throw new ValidatorException(dir.getPath() + " is not a directory.");
		}

		// Create xml file
		System.out.println("\nCreating the upgrade plan...");
		File upgradePlanFile = new File(dir.getPath() + File.separator + "upgradePlan.xml");
		createXML(params, upgradePlanFile.getPath());

		System.out.println("                                                       done.");

		String str = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		System.out.println("Proceed ? yes/[no] ");
		str = in.readLine();
		while ( str != null ) {
		  if (!str.equals("yes")) {
			FileManagement.deleteDir(dir);
		    System.out.println("Program terminated. Bye!");
		  } else {
			  break;
		  }
		  str = in.readLine();
		}
		in.close();
		
		// Injector system - pre-upgrade
		System.out.println("\nInjection system...");
		launchInjector(config.getSysinjJarPath());
		String workingDir = new File(config.getSysinjJarPath()).getParent();
		File systemModel = new File(workingDir + File.separator + "model" + File.separator + "systemModel.mancoosimm");
		if (!systemModel.exists()) {
			throw new ValidatorException("File " + systemModel.getPath()
					+ " not found.");
		}
		File preUpgradeModel = new File(dir.getPath() + File.separator
				+ "preUpgrade_" + systemModel.getName());
		FileManagement.copyFile(systemModel, preUpgradeModel);
		if (!preUpgradeModel.exists()) {
			throw new ValidatorException("File " + preUpgradeModel.getPath()
					+ " not found.");
		}
		
		System.out.println("                                                       done.");
		// Real Upgrade
		System.out.println("Retrieving packages...");
		downloadingPackages(params);
		
		System.out.println("                                                       done.");
		// Simulator
		System.out.println("Simulating upgrade...");
		File postSimulUpgrade = new File(dir.getPath() + File.separator
				+ "postSimulUpgrade_" + systemModel.getName());
		launchSimulator(config.getSimulatorJarPath(),
				preUpgradeModel.getAbsolutePath(), 
				upgradePlanFile.getAbsolutePath(), 
				postSimulUpgrade.getAbsolutePath(), 
				dir.getAbsolutePath()+File.separator+"errorModel.errormm");
		
		System.out.println("                                                       done.");
		// Real Upgrade
		System.out.println("Upgrading...");
		realUpgrade(params);

		System.out.println("                                                       done.");
		// Injector system - post-upgrade
		System.out.println("Injection system...");
		launchInjector(config.getSysinjJarPath());
		File systemModelPost = new File(workingDir + File.separator + "model"
				+ File.separator + "systemModel.mancoosimm");
		if (!systemModelPost.exists()) {
			throw new ValidatorException("File " + systemModelPost.getPath()
					+ " not found.");
		}
		File postRealUpgrade = new File(dir.getPath() + File.separator
				+ "postRealUpgrade_" + systemModel.getName());
		FileManagement.copyFile(systemModelPost, postRealUpgrade);
		
		System.out.println("                                                       done.");
		// Compare
		System.out.println("Differencing models...");
		String outputDiff = dir.getPath() + File.separator + "resultdiff.emf";
		EmfCompareLaunch.compare(postRealUpgrade, postSimulUpgrade, outputDiff);
		if (!(new File(outputDiff).exists())) {
			throw new ValidatorException("File "+outputDiff+" is not created correctly.");
		}
		System.out.println("Done. Bye !");

	}

	
	private void launchSimulator(String pathJarFile, String arg1,
			String arg2, String arg3, String arg4) throws Exception {

		File jarFile = new File(pathJarFile);
		if (!jarFile.exists()) {
			throw new ValidatorException("File " + pathJarFile + " not found");
		}

		String nameComponent = jarFile.getName();
		String pathWorkDir = jarFile.getParent();

		ProcessBuilder pb = new ProcessBuilder("java", "-jar", nameComponent, arg1, arg2, arg3, arg4);
		pb.directory(new File(pathWorkDir));
		Process proc = pb.start();
		BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));

		String resultLine = in.readLine();

		while (resultLine != null) {
		  System.out.println(" --> "+resultLine);
		  resultLine = in.readLine();
		}
		proc.waitFor();
		
		if (proc.exitValue() != 0) {
			throw new ValidationException("Error exit status in the simulation fase.");
		}
		
		proc.destroy();

	}

	protected abstract void createXML(String params, String filePath) throws Exception;

	protected abstract void realUpgrade(String params) throws Exception;
	
	protected abstract void downloadingPackages(String params) throws Exception;

	private static void launchInjector(String pathJarFile) throws Exception {

		File jarFile = new File(pathJarFile);
		if (!jarFile.exists()) {
			throw new ValidatorException("File " + pathJarFile + " not found");
		}

		String nameComponent = jarFile.getName();
		String pathWorkDir = jarFile.getParent();

		ProcessBuilder pb = new ProcessBuilder("java", "-jar", nameComponent);
		pb.directory(new File(pathWorkDir));
		Process proc = pb.start();
		BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));

		String resultLine = in.readLine();

		while (resultLine != null) {
		  System.out.println(" --> "+resultLine);
		  resultLine = in.readLine();
		}

		proc.waitFor();
		
		if (proc.exitValue() != 0) {
			throw new ValidationException("Error in the injection fase.");
		}

		proc.destroy();
		
	 }
}
