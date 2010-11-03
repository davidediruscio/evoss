package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;

import java.io.IOException;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.FileSystemManager;

public class UbuntuFileSystemManager extends FileSystemManager {

	public  UbuntuFileSystemManager(){	
		this.userManager = UbuntuUserManager.getInstance();
		this.groupManager = UbuntuGroupManager.getInstance();
	}
	
	public static FileSystemManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new UbuntuFileSystemManager();
		return INSTANCE;
	}
	
   public void synchronize() throws IOException {
	   //TODO
   };
		

}
