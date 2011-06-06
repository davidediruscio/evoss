package it.univaq.mancoosi.validator.debian;

import it.univaq.mancoosi.validator.Validator;
import it.univaq.mancoosi.validator.exceptions.ValidatorException;
import it.univaq.mancoosi.validator.util.XMLFileWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DebianValidator extends Validator {

	
	public DebianValidator() {
		super();
	}
	/**
	 * @throws ValidationException 
	 * @throws IOException 
	 * @throws ValidatorException 
	 * 
	 */
	protected  void createXML(String params, String filePath) throws ValidatorException, IOException, ValidatorException  {

		ArrayList<String> actions = new ArrayList<String>();
		
		String line;
		int numPkg = 0;
		String[] cmd = {"/bin/sh","-c","apt-get -q -y -s "+params};
		Process p = Runtime.getRuntime().exec(cmd);
		BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));
		
		while ((line = input.readLine()) != null) {
			if(line.startsWith("Remv ") || line.startsWith("Inst ") || line.startsWith("Purg ")) {
				numPkg += 1;
				System.out.println(" --> "+line);
				actions.add(line);
			}
		}
		try {
			p.waitFor();
		} catch (InterruptedException e) {
			throw new ValidatorException("Error in the XML file creation.", e);
		}
		input.close();
		
		if (p.exitValue()!=0) {
			throw new ValidatorException("Error in the XML file creation.");
		}
		
		p.destroy();
		
		if (numPkg == 0) {
			throw new ValidatorException("None of the requested operations is feasible.");
		}
		
		XMLFileWriter xml = new XMLFileWriter(filePath);
		
		for (String action : actions) {

			String[] elements = action.split(" ");

			if (elements[0].equals("Inst")) {
				String name = elements[1];
				String version = null;
				if (elements[2].startsWith("[")) {
					version = elements[3].substring(1);
				} else {
					version = elements[2].substring(1);
				}
				
				if (version == null) throw new ValidatorException("Version not found. Package: "+ name);
				
				String architecture = getArchitecture(name, version);
				xml.createInstallSelection(name, version, architecture);
			}

			if (elements[0].equals("Purg")) {
				String name = elements[1];
				String version = elements[2].substring(1, elements[2].length()-1);
				String architecture = getArchitecture(name, version);
				xml.createPurgeSelection(name, version, architecture);
			}

			if (elements[0].equals("Remv")) {
				String name = elements[1];
				String version = elements[2].substring(1, elements[2].length()-1);
				String architecture = getArchitecture(name, version);
				xml.createRemoveSelection(name, version, architecture);
			}
		}

		xml.closeFile();

	}

	
	private String getArchitecture(String name, String version) throws ValidatorException, IOException {
		String linePkg;

		ArrayList<String> values = new ArrayList<String>();
		String[] cmdPkg = {"/bin/sh","-c","apt-cache -q show " + name};
		Process pPkg = Runtime.getRuntime().exec(cmdPkg);
		BufferedReader info = new BufferedReader (new InputStreamReader(pPkg.getInputStream()));
		while ((linePkg = info.readLine()) != null) {
			String[] lin = linePkg.split(": ");
			if (lin[0].equals("Version")) {
				values.add(lin[1].trim());
			}

			if (lin[0].equals("Architecture")) {
				values.add(lin[1]);
			}
		}
		try {
			pPkg.waitFor();
		} catch (InterruptedException e) {
			throw new ValidatorException("Error 'apt-cache show' command", e);
		}
		
		if (pPkg.exitValue()!=0) {
			throw new ValidatorException("Error 'apt-cache show' command");
		}
		
		pPkg.destroy();
		info.close();
		
		String arch="";
		Boolean found = false;
		for (int i=0; i<values.size() && !found; i++) {
			if (i>0 && values.get(i).equals(version)) {
				found = true;
				arch = values.get(i-1);
			}
		}
		
		if (arch.equals("")){
			arch = "all";
		}
		
		if (arch.equals("")) {
			throw new ValidatorException("Architecture field not found for package "+name+" "+version);
		}
		return arch;
	}
	
	
	/**
	 * @throws ValidationException 
	 * @throws IOException 
	 * 
	 */
	protected  void realUpgrade(String params) throws ValidatorException, IOException {

		String line;
		String[] cmd = {"/bin/sh","-c","apt-get -q -y "+params};
		Process p = Runtime.getRuntime().exec(cmd);
		BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));

		while ((line = input.readLine()) != null) {
			System.out.println(" --> "+line);
		}
		try {
			p.waitFor();
		} catch (InterruptedException e) {
			throw new ValidatorException("An error has occurred during the upgrade.", e);
		}
		input.close();
		
		if (p.exitValue()!=0) {
			throw new ValidatorException("An error has occurred during the upgrade.");
		}

		p.destroy();
	}
	
	
	/**
	 * @throws ValidatorException 
	 * @throws IOException 
	 * 
	 */
	protected  void downloadingPackages(String params) throws ValidatorException, IOException {

		String[] cmd = {"/bin/sh","-c","apt-get -d -y -q "+params};
		Process p = Runtime.getRuntime().exec(cmd);

		try {
			p.waitFor();
		} catch (InterruptedException e) {
			throw new ValidatorException("An error has occurred during the download.", e);
		}

		if (p.exitValue()!=0) {
			throw new ValidatorException("An error has occurred during the download.");
		}

		p.destroy();
	}
}
