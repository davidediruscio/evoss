package mancoosi.injectors.managers.caixa;


import mancoosi.injectors.managers.PackageSettingDependenciesManager;

public class CaixaPackageSettingDependenciesManager extends PackageSettingDependenciesManager {

	public static PackageSettingDependenciesManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new CaixaPackageSettingDependenciesManager();
		return INSTANCE;
	}
	 

	
}
