package mancoosi.injectors.managers.ubuntu;


import mancoosi.injectors.managers.PackageSettingDependenciesManager;

public class UbuntuPackageSettingDependenciesManager extends PackageSettingDependenciesManager {

	public static PackageSettingDependenciesManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new UbuntuPackageSettingDependenciesManager();
		return INSTANCE;
	}
	 

	
}
