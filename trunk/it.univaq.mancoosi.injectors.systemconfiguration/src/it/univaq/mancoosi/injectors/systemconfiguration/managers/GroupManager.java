package it.univaq.mancoosi.injectors.systemconfiguration.managers;

import it.univaq.mancoosi.mancoosimm.Configuration;
import it.univaq.mancoosi.mancoosimm.Group;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;

import java.io.IOException;
import java.util.HashMap;


public abstract class GroupManager {

	private Configuration configuration;
	private MancoosiFactory factory = MancoosiFactory.eINSTANCE; 

	private HashMap<String, Group> groupMap; 

	protected static GroupManager INSTANCE;

	protected GroupManager(){
		this.configuration = ConfigurationManager.getInstance().getConfiguration();
		this.groupMap = new HashMap<String, Group>();
	}

	public static GroupManager getInstance() {
		return INSTANCE;
	}


	public Group addGroup(String groupName){

		Group group;

		if (groupMap.get(groupName) == null) {
			group = factory.createGroup();
			group.setName(groupName);
			groupMap.put(groupName, group);
			configuration.getEnvironment().getGroups().add(group);
		} else
			group = groupMap.get(groupName);
		return group;
	}


	public Group getGroup(String groupName){

		return groupMap.get(groupName);
	}


	public Group[] getAllGroups(){
		Group[] groups;
		groups = (Group[]) configuration.getEnvironment().getGroups().toArray();
		return groups;
	}

	public Boolean exists(String groupName){
		if ( this.getGroup(groupName)== null )
			return false;
		else 
			return true;
	}

	//mirco
	private void groupMapReload () {

		Group[] groups = getAllGroups();

		for (int i = 0; i < groups.length; i++) {
			String groupName = groups[i].getName();
			Group group = groups[i];

			if (group != null) {
				groupMap.put(groupName, group);
			}
		}
	}


	public abstract void synchronize() throws IOException;


}
