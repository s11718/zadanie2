package domain;

public class User extends Entity {
	
	private String username;
	private String password;
	private String email;
	private String type;
	private boolean state;
	


	public User(String username, String password, String email){
		super();
		this.setUsername(username);
		this.setPassword(password);
		this.setEmail(email);
		this.type = "Normal";
	}
	public User(String username, String password, String email, String Type){
		super();
		this.setUsername(username);
		this.setPassword(password);
		this.setEmail(email);
		this.setType(Type);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	

}
