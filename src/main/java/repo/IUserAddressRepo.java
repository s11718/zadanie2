package repo;

import domain.UserAddress;


public interface IUserAddressRepo extends IRepository<UserAddress> {

	public UserAddress withName(String name);
	
}
