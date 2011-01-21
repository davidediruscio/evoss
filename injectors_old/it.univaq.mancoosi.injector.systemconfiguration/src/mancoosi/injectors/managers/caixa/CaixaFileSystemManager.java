package mancoosi.injectors.managers.caixa;

import java.io.IOException;

import mancoosi.injectors.managers.FileSystemManager;
import mancoosi.injectors.managers.GroupManager;
import mancoosi.injectors.managers.UserManager;

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
