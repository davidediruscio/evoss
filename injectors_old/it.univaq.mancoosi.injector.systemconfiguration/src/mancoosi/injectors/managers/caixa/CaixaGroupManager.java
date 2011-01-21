package mancoosi.injectors.managers.caixa;

import java.io.IOException;

import mancoosi.injectors.managers.GroupManager;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class CaixaGroupManager extends GroupManager {

	public static GroupManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new CaixaGroupManager();
		return INSTANCE;
	}

	@Override
	public void synchronize() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}
