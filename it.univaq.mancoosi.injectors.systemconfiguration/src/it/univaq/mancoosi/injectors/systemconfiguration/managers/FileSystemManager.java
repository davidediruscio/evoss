package it.univaq.mancoosi.injectors.systemconfiguration.managers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import it.univaq.mancoosi.mancoosimm.FileSystem;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;
import it.univaq.mancoosi.injectors.systemconfiguration.utils.FileMap;

public abstract class FileSystemManager {

	//private Configuration configuration;
	protected FileMap fileSystemMap; 
	protected MancoosiFactory factory; 
	protected File root;
	protected UserManager userManager;
	protected GroupManager groupManager;
	protected Resource resource;
	protected static FileSystemManager INSTANCE;	 
	protected FileSystem fileSystem;
   

	protected FileSystemManager(){
		this.factory = MancoosiFactory.eINSTANCE;
		fileSystem = factory.createFileSystem();
		this.root = factory.createFile();
		this.root.setName("/");
		fileSystem.setRoot(this.root);
		this.fileSystemMap = new FileMap("/", "", null, true);
		this.fileSystemMap.setModelFileElement(this.root);
	}
	
//	public void registerResource(Resource resource) {
//		this.resource = resource;		
//	}
	
	public static FileSystemManager getInstance() {
		return INSTANCE;
	}
   
	
	public FileSystem getFileSystem() {
		return fileSystem;
	}
	
	public void setFileSystem(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}
	
	
	public String[] getFileInformation(String location){
		
		
		String line;
		String[] fileInformations = null;
		String[] cmd = {"/bin/sh","-c","ls -dl ".concat(location)};
		
		try {
		      Process p = Runtime.getRuntime().exec(cmd);
		      BufferedReader input =
		        new BufferedReader
		          (new InputStreamReader(p.getInputStream()));
		      
		      if ((line = input.readLine()) != null) {
		    	  if ( line.contains("No such file or directory") ) return null;	// The considered file is missing in the real file system
		    	  fileInformations = line.split(" ");  
		      }
			  input.close();
		} catch (Exception err) {
		      err.printStackTrace();
	    }  	
		return fileInformations;
		
	}
	
	public Boolean exists(String path) {
		
		FileSystem fs = FileSystemManager.getInstance().getFileSystem();
		Iterator<File> fileIterator = fs.getAllFiles().iterator();
		File file = null;
		Boolean found = false;
		
		while ( (fileIterator.hasNext()) && (! found)) {
			file = fileIterator.next();
			if (file.getLocation().equals(path)) 
				found = true;
		}
		return found;
	}
	
	public File createFile(String path){
	
		Boolean isDirectory = true;
		FileMap curr = this.fileSystemMap;
		;
		String location = new String();

		File file =  getFile(path);		
		// The file corresponding to path might already exists in the model, for instance in the util-linux package the Conffiles section contains
		//  /etc/init.d/hwclock.sh b56b63f3746082677487829b5c65f881
		//  /etc/init.d/hwclock.sh b56b63f3746082677487829b5c65f881
		// In this respect the following test is performed
		if (file != null) 
			return file;
		
		
		String[] pathElements = path.split("/");
		for (int i = 1; i<pathElements.length; i++){
			
			location = location.concat("/".concat(pathElements[i]));	
		
			// The considered element does not exist and need to be created in the model
			if (curr.getChild(pathElements[i]) == null) { 	
				
				// The considered element is a file and the attribute isDirectory is set properly
				if (i== pathElements.length-1)
					isDirectory = false;
			
				file = factory.createFile();
				file.setName(pathElements[i]);
				file.setIsDirectory(isDirectory);
				file.setParent(curr.getModelFileElement());
		
				String[] fileInfoElements = getFileInformation(location);
				
				if (fileInfoElements != null) { 
					file.setPermission(fileInfoElements[0]);
					file.setLocation(fileInfoElements[7]);
					file.setOwner(userManager.getUser(fileInfoElements[2]));
					file.setGroup(groupManager.getGroup(fileInfoElements[3]));
				} else {
					file.setLocation(location);
					file.setIsMissing(true);
				}
				
				FileSystemManager.getInstance().getFileSystem().getAllFiles().add(file);
				
				curr.addFile(pathElements[i], isDirectory, file);			
				curr.getModelFileElement().getChilds().add(file);			
			} 
			curr = curr.getChild(pathElements[i]);
		}	
		return file;
	}	
	
	public Boolean deleteFile(String path){
		// This method has to be enhanced to reduce the number of files which are visited
		
		Iterator<File> allFilesIterator = fileSystem.getAllFiles().iterator();
		File fileToBeDeleted= null;
		Boolean found = false;
		
		while (allFilesIterator.hasNext() && !found) {
			fileToBeDeleted = allFilesIterator.next();
			if (fileToBeDeleted.getLocation().equals(path)) {
				EcoreUtil.delete(fileToBeDeleted);
				found = true;
			}
			
		}
		return found;
	}
	
	public File getFile(String path){
		
		String[] pathElements = path.split("/");
		FileMap curr = fileSystemMap;
		
		for (int i=1; i<pathElements.length; i++){
			curr = curr.getChild(pathElements[i]);
			if (curr == null)
				return null;
		}
		
		return curr.getModelFileElement();
	}


	
	public abstract void synchronize() throws IOException;
		

	
}
