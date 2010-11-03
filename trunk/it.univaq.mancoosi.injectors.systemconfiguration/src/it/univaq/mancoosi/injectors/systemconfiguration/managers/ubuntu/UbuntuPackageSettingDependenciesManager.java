package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;


import it.univaq.mancoosi.injectors.systemconfiguration.managers.PackageSettingDependenciesManager;

public class UbuntuPackageSettingDependenciesManager extends PackageSettingDependenciesManager {

	public static PackageSettingDependenciesManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new UbuntuPackageSettingDependenciesManager();
		return INSTANCE;
	}
	 

	
}
