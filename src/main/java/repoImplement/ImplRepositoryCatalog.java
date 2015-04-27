package repoImplement;

import domain.Type;
import domain.User;
import repo.IRepository;
import repo.IRepositoryCatalog;
import repo.IUserRepository;

public class ImplRepositoryCatalog implements IRepositoryCatalog {

	private DummyDb database = new DummyDb();
	
	public ImplRepositoryCatalog(){
		User admin = new User("admin", "admin", "admin@admin.com", "Admin");
		getUsers().save(admin);
	}
	
	@Override
	public IUserRepository getUsers() {
		return new ImplUserRepository(database);
	}

	@Override
	public IRepository<Type> getTypes() {
		return new ImplTypeRepo(database);
	}


	

}
