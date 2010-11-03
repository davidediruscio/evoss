package it.univaq.mancoosi.injectors.packages.debian;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;


public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws BuildException 
	 */
	public static void main(String[] args) throws BuildException, IOException {
		
		File buildFile = new File("build.xml");

		File startingDirectory = new File("files/src/scripts");
		List<File> files = Dirs.getFileListing(startingDirectory);

		String pkgname = "";
		ArrayList<String> namePkgs = new ArrayList<String>();
		
		for (int i=0; i<files.size(); i++) {
			String nameFile = files.get(i).getName();
			String subname= null;
			if (nameFile.endsWith(".prerm")) {
				subname = nameFile.substring(0,nameFile.indexOf(".prerm"));
			} else if (nameFile.endsWith(".preinst")) {
				subname = nameFile.substring(0,nameFile.indexOf(".preinst"));
			} else if (nameFile.endsWith(".postrm")) {
				subname = nameFile.substring(0,nameFile.indexOf(".postrm"));
			} else if (nameFile.endsWith(".postinst")) {
				subname = nameFile.substring(0,nameFile.indexOf(".postinst"));
			}

			if (subname!= null && !subname.equals(pkgname)) {
				namePkgs.add(subname);
				pkgname = subname;
			}
		}

	      	      
    	for (int j=0; j<namePkgs.size();j++) {
    		Boolean found = false;
    		for (int i =0; i<files.size() && !found; i++) {
    			if ((files.get(i).getName().equals(namePkgs.get(j)+".prerm") ||
    					files.get(i).getName().equals(namePkgs.get(j)+".preinst") ||
    					files.get(i).getName().equals(namePkgs.get(j)+".postinst") ||
    					files.get(i).getName().equals(namePkgs.get(j)+".postrm"))
    					&& (!(new File("out/"+namePkgs.get(j)+".packagemm").exists()))) {
    				Project p = new Project();
    				p.setUserProperty("ant.file", buildFile.getAbsolutePath());
    				p.init();
    				ProjectHelper helper = ProjectHelper.getProjectHelper();
    				p.addReference("ant.projectHelper", helper);
    				helper.parse(p, buildFile);

	    			found = true;
	    			p.setProperty("sourceFilesFilter", namePkgs.get(j)+".*");
	    			p.setProperty("resultLocation", "out/"+namePkgs.get(j)+".packagemm");
	    			if ((new File("files/bin")).exists()) {
	    				// only execute gra2mol
	    				p.executeTarget("phaseTwo");
	    			} else {
	    				// compile + execute gra2mol
	    				p.executeTarget(p.getDefaultTarget());
	    			}
    			}
    		}		
    	}
	}

}



class Dirs {

	static public List<File> getFileListing(File aStartingDir)
			throws FileNotFoundException {

		validateDirectory(aStartingDir);

		List<File> result = getFileListingNoSort(aStartingDir);

		Collections.sort(result);

		return result;
	}

	static private List<File> getFileListingNoSort(File aStartingDir)
			throws FileNotFoundException {

		List<File> result = new ArrayList<File>();

		File[] filesAndDirs = aStartingDir.listFiles();

		List<File> filesDirs = Arrays.asList(filesAndDirs);

		for (File file : filesDirs) {

			result.add(file);

			if (!file.isFile()) {

				List<File> deeperList = getFileListingNoSort(file);

				result.addAll(deeperList);

			}
		}
		return result;
	}

	static private void validateDirectory(File aDirectory)
			throws FileNotFoundException {

		if (aDirectory == null) {

			throw new IllegalArgumentException("Directory should not be null.");

		}

		if (!aDirectory.exists()) {
			throw new FileNotFoundException("Directory does not exist: "
					+ aDirectory);
		}

		if (!aDirectory.isDirectory()) {
			throw new IllegalArgumentException("Is not a directory: "
					+ aDirectory);
		}

		if (!aDirectory.canRead()) {
			throw new IllegalArgumentException("Directory cannot be read: "
					+ aDirectory);
		}
	}
}
