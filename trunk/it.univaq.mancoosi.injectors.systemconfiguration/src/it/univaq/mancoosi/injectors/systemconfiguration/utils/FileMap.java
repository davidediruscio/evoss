package it.univaq.mancoosi.injectors.systemconfiguration.utils;

import java.util.HashMap;

import it.univaq.mancoosi.mancoosimm.File;



public class FileMap {
	
	private String name;
	private String path;
	private HashMap<String, FileMap> childs;
	private FileMap parent;
	private Boolean isDirectory;
	private File modelFileElement;


	public void setModelFileElement(File modelFileElement) {
		this.modelFileElement = modelFileElement;
	}
	
	public File getModelFileElement() {
		return this.modelFileElement;
	}
	
	
	public FileMap(String name, String path, FileMap parent, Boolean isDiretory) {	
		this.name = name;
		this.parent = parent;
		this.isDirectory = isDiretory;
		this.path = path;
		this.childs = new HashMap();
	}
	
	public void addFile(String name, Boolean isDirectory, File modelFileElement){
		FileMap newFile = new FileMap(name, this.path.concat("/"+name), this, isDirectory);
		newFile.setModelFileElement(modelFileElement);
		this.childs.put(name, newFile);
	}
	
	public HashMap<String, FileMap> getAllChilds() {
		return this.childs;
	}
	
	public FileMap getChild(String name) {
		return this.childs.get(name);
	}

	public Boolean exists(String name) {
		if (this.childs.get(name) != null)
			return true;
		else 
			return false;		
	}
	
	public Boolean isDirectory() {
		return this.isDirectory;
	}
	
	public FileMap getParent() {
		return this.parent;
	}
	
	public String getName() {
		return this.name;	
	}
	
	public String getPath() {
		return this.path;
	}

}
