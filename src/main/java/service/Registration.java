package service;



import java.util.List;

import domain.User;
import repo.IRepositoryCatalog;
import repoImplement.ImplRepositoryCatalog;

public class Registration {
	
	private static IRepositoryCatalog catalog = new ImplRepositoryCatalog();
	
	public static void registerUser(String username, String password, String email){
		User user = new User(username, password, email);
		catalog.getUsers().save(user);
	}
	
	public static List<User> getAllRegistered() {
		 return catalog.getUsers().getAll();
		}
	
	public static User getUser (String name){
		return catalog.getUsers().withName(name);
	}
	
	public static Boolean checkRegistered(String name) throws Exception{
		if(catalog.getUsers().withName(name).getUsername().equals(name)){
			return true;
		}
		throw new Exception();
	}
	


}
