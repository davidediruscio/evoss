package mancoosi.injectors.managers.ubuntu;

import java.io.IOException;

import mancoosi.injectors.managers.FileSystemManager;
import mancoosi.injectors.managers.GroupManager;
import mancoosi.injectors.managers.UserManager;

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
