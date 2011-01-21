package mancoosi.injectors.managers;

import java.io.*;
import java.util.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import mancoosi.AndConflict;
import mancoosi.AndDep;
import mancoosi.Configuration;
import mancoosi.Conflict;
import mancoosi.Dependence;
import mancoosi.File;
import mancoosi.InstalledPackage;
import mancoosi.MancoosiFactory;
import mancoosi.MancoosiPackage;
import mancoosi.NotInstalledPackage;
import mancoosi.OrConflict;
import mancoosi.OrDep;
import mancoosi.Package;
import mancoosi.PackageSetting;
import mancoosi.PriorityType;
import mancoosi.SingleConflict;
import mancoosi.SingleDep;
import mancoosi.VersionType;
import mancoosi.impl.ConfigurationImpl;
import mancoosi.impl.MancoosiPackageImpl;


 public abstract class PackageManager {

	protected static  PackageManager INSTANCE ;
	
	protected Configuration configuration;
	protected HashMap<String, InstalledPackage> pkgMap; 
	protected HashMap<String, InstalledPackage> pkgFromSyncMap; 
	protected HashMap<InstalledPackage, ArrayList<File>> pkgSettingsMap;
	protected HashMap<String, String> versionTypeMap;
	protected FileSystemManager fileSystemManager;
	protected MancoosiFactory factory;

	
	protected PackageManager(){
		this.configuration = ConfigurationManager.getInstance().getConfiguration();
		this.pkgMap = new HashMap<String, InstalledPackage>();
		this.pkgFromSyncMap = new HashMap<String, InstalledPackage>();
		this.pkgSettingsMap = new HashMap<InstalledPackage, ArrayList<File>>();
		this.fileSystemManager = FileSystemManager.getInstance();
		this.factory = MancoosiFactory.eINSTANCE; 
		
		this.versionTypeMap =  new HashMap<String, String>();
		versionTypeMap.put("=", "eq");
		versionTypeMap.put(">=", "ge");
		versionTypeMap.put(">", "gt");
		versionTypeMap.put(">>", "ggt");
		versionTypeMap.put("<", "lt");
		versionTypeMap.put("<=", "le");
		versionTypeMap.put("<<", "llt");
	}
	
/*	public void registerResource(Resource resource) {
		this.resource = resource;		
	}
*/		
	public static PackageManager getInstance() {
	   return INSTANCE;
	}
    
	

	/* This method works but actually is never used.
	private void processPackageFiles(BufferedReader pkgFiles, InstalledPackage pkg) {
		
		Scanner scanner = new Scanner(pkgFiles);
		String filePath, rights;
		File file;
		
	    try {
	      //first use a Scanner to get each line
	      while ( scanner.hasNextLine() ){
	    	  
	    	  filePath = scanner.nextLine();   	  
	    	  String[] cmd = {"/bin/sh","-c"," ls -l \"" + filePath + "\" | awk '{print $1}'"};
	    	  Process p = Runtime.getRuntime().exec(cmd);
	    	  BufferedReader input =
	    		  new BufferedReader
	    		  (new InputStreamReader(p.getInputStream()));
				
	    	  rights = input.readLine();			
	    	  p.destroy();
	    	  input.close();
	    	 
	      }
	    } catch (Exception err) {
	    	err.printStackTrace();
	    }
		
	}
	*/
	
	protected abstract void processPackageMetadata(BufferedReader packageInfo, InstalledPackage installedPackage) throws IOException;
	
	
	
	public InstalledPackage createPackage(String packageName) {
		
		InstalledPackage pkg = factory.createInstalledPackage();
		pkg.setName(packageName);
		System.out.println("Creating new package " + packageName);
		configuration.getInstalledPackages().add(pkg);
		pkgMap.put(pkg.getName(), pkg);
		
		return pkg;	
	}
	
	
	public Boolean removePackage(String packageName) {
		Boolean found = false;
		Iterator<InstalledPackage> installedPackageIterator = configuration.getInstalledPackages().iterator();
		InstalledPackage packageToBeRemoved = null;
		
		while ( installedPackageIterator.hasNext() && !found) {
			packageToBeRemoved = installedPackageIterator.next();
			if (packageToBeRemoved.getName().equals(packageName)) {
				
				PackageSetting pkgSetting = packageToBeRemoved.getPackageSettings();
				
				if (pkgSetting != null) {
					EList<File> confFilesList = pkgSetting.getFiles();
					File confFile = null;
					
					for (int i=0; i < confFilesList.size(); i++) {
						System.out.println("Deleting file " + confFilesList.get(i) );
						FileSystemManager.getInstance().deleteFile((confFilesList.get(i)).getLocation());
	
					}
					
					EcoreUtil.delete(pkgSetting);
				}
				EcoreUtil.delete(packageToBeRemoved);
				found = true;
			}			
		}
		return found;
	}
	
	public Boolean existsPackage(String packageName) {
			
		EList<InstalledPackage> installedPackages = ConfigurationManager.getInstance().getConfiguration().getInstalledPackages();
		
		Iterator<InstalledPackage> installedPackagesIterator = installedPackages.iterator();
		InstalledPackage installedPackageElement = null;
		Boolean found = false;
		
		while ( installedPackagesIterator.hasNext() && !found ) {
			installedPackageElement = installedPackagesIterator.next();
			if ( installedPackageElement.getName().equals(packageName) ) {
				found = true;
				pkgMap.put(packageName,installedPackageElement);
			}
			
		}
		
		return found;
	}


	public List<File> getConfFiles(InstalledPackage installedPackage) {
		
		return pkgSettingsMap.get(installedPackage);
		
	}
	
	protected abstract void createSingleDeps(String[] singleDeps, Dependence owner);
	
	protected abstract void createSingleConflicts(String[] singleConflicts, Conflict owner);
	
	protected abstract void processPackageMetadataLine(String aLine, InstalledPackage pkg);

	protected abstract void processConfFiles(List<String> conffilesBlock, InstalledPackage installedPackage);
	
	public abstract void setFeaturesOfInstalledPackages() throws IOException;
	
	public abstract void setFeaturesOfInstalledPackagesFoundBySync() throws IOException;
	
	public abstract void createPackageElementsFromSystem() throws IOException;
	
	public abstract void synchronize() throws IOException;
	
}
