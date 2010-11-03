package it.univaq.mancoosi.injectors.systemconfiguration.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.PackageSetting;

public class PackageSettingMap {

	private String packageName;
	private ArrayList<File> confFiles;
	
	private static final PackageSettingMap INSTANCE = new PackageSettingMap();
	 
	   
	   // Private constructor prevents instantiation from other classes
	   private PackageSettingMap() {
		   
	   }
	 
	   public static PackageSettingMap getInstance() {
	      return INSTANCE;
	   }
	   

	
}
