package it.univaq.mancoosi.validator.debian;

import it.univaq.mancoosi.validator.Validator;
import it.univaq.mancoosi.validator.util.XMLFileWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.bind.ValidationException;

public class DebianValidator extends Validator {

	
	public DebianValidator() {
		super();
	}
	/**
	 * 
	 */
	protected  void createXML(String params, String filePath) throws Exception {

		String line;
		String[] cmd = {"/bin/sh","-c","apt-get -s "+params+" | awk '/Inst/ || /Purg/ || /Remv/'"};
		Process p = Runtime.getRuntime().exec(cmd);
		BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));

		XMLFileWriter xml = new XMLFileWriter(filePath);

		int numPkg = 0;
		
		while ((line = input.readLine()) != null) {
			
			numPkg = numPkg + 1;
			
			String[] elements = line.split(" ");
			
			System.out.println(" --> "+line);

			if (elements[0].equals("Inst")) {
				if (elements.length > 5) {
					xml.createInstallSelection(elements[1], elements[3].substring(1), 
							elements[5].substring(1, elements[5].length()-2));
				} else if (elements.length < 5) {
					String name = elements[1];
					String version = elements[2].substring(1);
					String architecture = getArchitecture(name, version);
					xml.createInstallSelection(name, version, architecture);
				} else {
					if (elements[2].startsWith("[")) {
						String name = elements[1];
						String version = elements[3].substring(1);
						String architecture = getArchitecture(name, version);
						xml.createInstallSelection(name, version, architecture);
					} else {
						String name = elements[1];
						String version = elements[2].substring(1);
						String architecture = getArchitecture(name, version);
						xml.createInstallSelection(name, version, architecture);
					}
				}
			}

			if (elements[0].equals("Purg")) {
				String name = elements[1];
				String version = elements[2].substring(1, elements[2].length()-1);
				String architecture = getArchitecture(name, version);
				
				//if (architecture != null) {
					xml.createPurgeSelection(name, version, architecture);
				//} else {
				//	xml.createPurgeSelection(name, version);
				//}
			}

			if (elements[0].equals("Remv")) {
				String name = elements[1];
				String version = elements[2].substring(1, elements[2].length()-1);
				String architecture = getArchitecture(name, version);
				
				//if (architecture != null) {
					xml.createRemoveSelection(name, version, architecture);
				//} else {
				//	xml.createRemoveSelection(name, version);
				//}
			}
		}
		p.waitFor();
		input.close();
		if (p.exitValue() != 0) {
			throw new ValidationException("Error in the XML file creation.");
		}
		
		if (numPkg == 0) {
			throw new ValidationException("None of the requested operations is feasible.");
		}
		
		p.destroy();

		xml.closeFile();

	}

	
	private String getArchitecture(String name, String version) throws IOException {
		String linePkg;
		String ver="";
		String arch="";

		String[] cmdPkg = {"/bin/sh","-c","apt-cache show " + name};
		Process pPkg = Runtime.getRuntime().exec(cmdPkg);
		BufferedReader info = new BufferedReader (new InputStreamReader(pPkg.getInputStream()));
		while ((linePkg = info.readLine()) != null) {
			String[] lin = linePkg.split(": ");

			if (lin[0].equals("Version")) {
				ver = lin[1].trim();
			}

			if (lin[0].equals("Architecture")) {
				arch = lin[1];
			}
		}
		info.close();
		pPkg.destroy();
		
		if (ver.equals(version)) {
			return arch;
		} else return null;
	}
	
	
	
	/**
	 * 
	 */
	protected  void realUpgrade(String params) throws Exception {

		String line;
		String[] cmd = {"/bin/sh","-c","apt-get -q -y "+params};
		Process p = Runtime.getRuntime().exec(cmd);
		BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));

		while ((line = input.readLine()) != null) {
			System.out.println(" --> "+line);
		}
		input.close();
		p.waitFor();
		if (p.exitValue() != 0) {
			throw new ValidationException("An error has occurred during the upgrade.");
		}
		p.destroy();
	}
	
	
	/**
	 * 
	 */
	protected  void downloadingPackages(String params) throws Exception {

		//String line;
		String[] cmd = {"/bin/sh","-c","apt-get -d -y -q "+params};
		Process p = Runtime.getRuntime().exec(cmd);
		//BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));
		//while ((line = input.readLine()) != null) {
		//	System.out.println(" --> "+line);
		//}
		//input.close();
		p.waitFor();
		if (p.exitValue() != 0) {
			throw new ValidationException("An error has occurred during the download.");
		}
		p.destroy();
	}
}
