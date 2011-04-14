package it.univaq.mancoosi.injectors.systemconfiguration.managers;

import it.univaq.mancoosi.mancoosimm.GConf;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandler;
import it.univaq.mancoosi.mancoosimm.Schema;

import java.io.IOException;
import java.util.HashMap;

public abstract class GConfManager {
	
	protected static GConfManager INSTANCE;
	protected MancoosiFactory factory; 
	protected GConf gconf;

	protected GConfManager(){
		factory = MancoosiFactory.eINSTANCE;
		gconf = factory.createGConf(); 
	}

	public static GConfManager getInstance() {
		return INSTANCE;
	}

	public abstract void createGConfFromSystem();

	public abstract void synchronize() throws IOException;

	public GConf getGconf() {
		return gconf;
	}

}
