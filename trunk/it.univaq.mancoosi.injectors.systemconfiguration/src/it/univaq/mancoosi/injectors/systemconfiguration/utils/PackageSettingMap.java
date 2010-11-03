package it.univaq.mancoosi.injectors.systemconfiguration.utils;



public class PackageSettingMap {
	
	private static final PackageSettingMap INSTANCE = new PackageSettingMap();
	 
	   
	   // Private constructor prevents instantiation from other classes
	   private PackageSettingMap() {
		   
	   }
	 
	   public static PackageSettingMap getInstance() {
	      return INSTANCE;
	   }
	   

	
}
