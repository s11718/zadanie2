package repo;

import domain.*;

public interface IRepositoryCatalog {

	public IUserRepository getUsers();
	public IRepository<Type> getTypes();
	public IUserAddressRepo getUserAddresses();
}

