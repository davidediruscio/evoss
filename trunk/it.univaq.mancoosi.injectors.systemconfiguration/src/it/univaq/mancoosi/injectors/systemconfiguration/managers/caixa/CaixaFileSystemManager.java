package it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa;

import java.io.IOException;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.FileSystemManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.GroupManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.UserManager;

public class CaixaFileSystemManager extends FileSystemManager {

	public  CaixaFileSystemManager(){	
		this.userManager = CaixaUserManager.getInstance();
		this.groupManager = CaixaGroupManager.getInstance();
	}
	
	public static FileSystemManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new CaixaFileSystemManager();
		return INSTANCE;
	}
	
   public void synchronize() throws IOException {
	   //TODO
   };
		

}
