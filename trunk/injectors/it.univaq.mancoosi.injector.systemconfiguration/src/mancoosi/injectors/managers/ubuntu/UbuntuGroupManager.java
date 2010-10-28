package mancoosi.injectors.managers.ubuntu;

import java.io.IOException;

import mancoosi.injectors.managers.GroupManager;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class UbuntuGroupManager extends GroupManager {

	public static GroupManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new UbuntuGroupManager();
		return INSTANCE;
	}

	@Override
	public void synchronize() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}
