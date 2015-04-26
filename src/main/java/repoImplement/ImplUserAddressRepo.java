package repoImplement;

import java.util.List;

import domain.UserAddress;
import repo.IUserAddressRepo;

public class ImplUserAddressRepo implements IUserAddressRepo {

	DummyDb database;
	
	public ImplUserAddressRepo(DummyDb database) {
		super();
		this.database = database;
	}

	public void save(UserAddress entity) {
		database.addresses.add(entity);	
	}

	
	public void update(UserAddress entity) {
	}

	
	public void delete(UserAddress entity) {
		database.addresses.remove(entity);
	}

	
	public UserAddress get(int id) {
		for(UserAddress t: database.addresses){
			if(t.getId()==id)
				return t;
		}
		return null;
	}

	
	public List<UserAddress> getAll() {
		return database.addresses;
	}

	
	public UserAddress withName(String name) {
		for(UserAddress ua: database.addresses){
			if(ua.getUsername().equals(name))
				return ua;
		}
		return null;
	}

}
