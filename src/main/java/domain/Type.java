package domain;

import java.util.ArrayList;
import java.util.List;


public class Type extends Entity {

	private String name;
	private List<User> users;
	
	public Type(){
		users = new ArrayList<User>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
