package repo.impl;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> withType(Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> withType(String typeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> withType(int typeId) {
		// TODO Auto-generated method stub
		return null;
	}
}
