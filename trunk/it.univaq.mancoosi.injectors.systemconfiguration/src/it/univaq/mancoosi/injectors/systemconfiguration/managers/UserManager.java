package it.univaq.mancoosi.injectors.systemconfiguration.managers;

import it.univaq.mancoosi.mancoosimm.Configuration;
import it.univaq.mancoosi.mancoosimm.Group;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;
import it.univaq.mancoosi.mancoosimm.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public abstract class UserManager {

	protected static UserManager INSTANCE ;

	protected Configuration configuration;
	protected MancoosiFactory factory = MancoosiFactory.eINSTANCE; 
	protected GroupManager groupManager;
	protected HashMap<String, User> userMap; 

	protected UserManager(){
		//	this.configuration = ConfigurationManager.getInstance().getConfiguration();
		this.userMap = new HashMap<String, User>();
		//	this.groupManager = GroupManager.getInstance();
	}


	public static UserManager getInstance() {
		return INSTANCE;
	}

	public User addUser(String userName, String homeDir){	
		User user = getUser(userName);

		if (user != null) 
			return user;
		else {
			user = factory.createUser();
			List<Group> groups = addUserGroupsFromSystem (userName);

			user.setName(userName);
			user.getGroups().addAll(groups);
			user.setHome(FileSystemManager.getInstance().createFile(homeDir));
			userMap.put(userName, user);
			configuration.getEnvironment().getUsers().add(user);
			return user;
		}
	}		


	public User getUser(String name){
		return userMap.get(name);
	}

	public User[] getAllUsers(){
		User[] users;
		users = (User[]) configuration.getEnvironment().getUsers().toArray();
		return users;
	}



	public void createUsersFromSystem() {

		String line;

		try {
			String[] cmd = {"/bin/sh","-c","cat /etc/passwd"};
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader input =
				new BufferedReader
				(new InputStreamReader(p.getInputStream()));

			//iter on system users
			while ((line = input.readLine()) != null) {
				String[] elements = line.split(":");
				this.addUser(elements[0], elements[5]);
			}

			input.close();

		} catch (Exception err) {
			err.printStackTrace();
		}
	}

	//mirco
	public List<Group> addUserGroupsFromSystem (String userName) {

		List<Group> result = new ArrayList<Group>();
		String line;

		try {
			String[] cmd = {"/bin/sh","-c","groups "+ userName};
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader input =
				new BufferedReader
				(new InputStreamReader(p.getInputStream()));

			String[] elements;

			if ((line = input.readLine()) != null) {
				elements = line.split(" ");

				//iter on groups of the user
				for (int i=2; i<elements.length; i++) {
					Group group = this.groupManager.addGroup(elements[i]);
					result.add( group );
				}
			}

			input.close();

		} catch (Exception err) {
			err.printStackTrace();
		}

		return result;		
	}

	//mirco
	private void userMapReload () {

		User[] users = getAllUsers();

		for (int i = 0; i < users.length; i++) {
			String userName = users[i].getName();
			User user = users[i];

			if (user != null) {
				userMap.put(userName, user);
			}
		}
	}


	public abstract void synchronize() throws IOException;

}
