package it.univaq.mancoosi.injectors.systemconfiguration.managers;

import it.univaq.mancoosi.mancoosimm.IconCache;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;

import java.io.IOException;

public abstract class IconCacheManager {

	protected static IconCacheManager INSTANCE;
	protected MancoosiFactory factory; 
	protected IconCache iconCache;

	protected IconCacheManager(){
		this.factory = MancoosiFactory.eINSTANCE;
		iconCache = factory.createIconCache(); 
	}

	public static IconCacheManager getInstance() {
		return INSTANCE;
	}

	public abstract void createIconCacheFromSystem();

	public abstract void synchronize() throws IOException;
}
