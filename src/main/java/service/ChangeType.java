package service;


public class ChangeType {
	
	public static synchronized void change(String username){
		if(Registration.getUser(username).getType().equals("Normal")){
			Registration.getUser(username).setType("Premium");
		}else{
			Registration.getUser(username).setType("Normal");
		}
	}
}
