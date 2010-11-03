package it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa;


import it.univaq.mancoosi.injectors.systemconfiguration.managers.PackageSettingDependenciesManager;

public class CaixaPackageSettingDependenciesManager extends PackageSettingDependenciesManager {

	public static PackageSettingDependenciesManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new CaixaPackageSettingDependenciesManager();
		return INSTANCE;
	}
	 

	
}
