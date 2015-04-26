package repoImplement;

import domain.Type;
import repo.IRepository;
import repo.IRepositoryCatalog;
import repo.IUserAddressRepo;
import repo.IUserRepository;

public class ImplRepositoryCatalog implements IRepositoryCatalog {

	private DummyDb database = new DummyDb();
	
	@Override
	public IUserRepository getUsers() {
		return new ImplUserRepository(database);
	}

	@Override
	public IRepository<Type> getTypes() {
		return new ImplTypeRepo(database);
	}

	@Override
	public IUserAddressRepo getUserAddresses() {
		return new ImplUserAddressRepo(database);
	}
	

}
