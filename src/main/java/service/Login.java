package service;

import service.Registration;



public class Login {

	public static void logIn(String username, String password){
		Registration.getUser(username).setState(true);
	}
	
	public static boolean checkPassword(String username, String password) throws Exception{
		if(Registration.getUser(username).getPassword().equals(password) && Registration.getUser(username).getPassword().hashCode() == password.hashCode()){
			return true;
		}
		throw new Exception();
	}
	
	public static boolean checkLoged(String username) throws Exception{
		if(Registration.getUser(username).getState()){
			return true;
		}
		throw new Exception();
	}
}
