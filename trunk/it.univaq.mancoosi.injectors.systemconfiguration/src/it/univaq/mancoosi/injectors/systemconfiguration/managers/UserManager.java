package it.univaq.mancoosi.injectors.systemconfiguration.managers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import it.univaq.mancoosi.mancoosimm.Configuration;
import it.univaq.mancoosi.mancoosimm.Group;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;
import it.univaq.mancoosi.mancoosimm.User;

 
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

	public User addUser(String userName, String groupName){	
		User user = getUser(userName);
		
		if (user != null) 
			return user;
		else {
			user = factory.createUser();
			Group group = this.groupManager.addGroup(groupName) ;
			
			user.setName(userName);
			user.getGroups().add(group);
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
		           
		      while ((line = input.readLine()) != null) {
		    	  String[] elements = line.split(":");
		    	  this.addUser(elements[0], elements[4]);
		      }

			  input.close();

		} catch (Exception err) {
		      err.printStackTrace();
	    }
		
		
	}
	
	
	public abstract void synchronize() throws IOException;

	
}
