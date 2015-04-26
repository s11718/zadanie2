package repoImplement;

import java.util.ArrayList;
import java.util.List;

import domain.Type;
import domain.User;
import repo.IUserRepository;



public class ImplUserRepository implements IUserRepository {

	private DummyDb database;

	
	public ImplUserRepository(DummyDb database){
		super();
		this.database = database;
	}
	
	
	public void save(User entity) {
		database.users.add(entity);
		
	}

	
	public void update(User entity) {
		database.users.remove(entity);
		
	}

	
	public void delete(User entity) {

		
	}


	public User get(int id) {
		for(User u: database.users){
			if(u.getId()==id)
				return u;
		}
		return null;
	}

	
	public List<User> getAll() {
		return database.users;
	}

	
	public List<User> withType(Type type) {
		return withType(type.getId());
	}

	
	public List<User> withType(String typeName) {
		for(Type t: database.types){
			if(t.getName().equals(typeName))
				return t.getUsers();
		}
		return new ArrayList<User>();
	}

	
	public List<User> withType(int typeId) {
		for(Type t: database.types){
			if(t.getId()==typeId)
				return t.getUsers();
		}
		return new ArrayList<User>();
}


	
	public User withName(String name) {
		for(User u: database.users){
			if(u.getUsername().equals(name))
				return u;
		}
		return null;
	}
}
