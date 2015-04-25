package repo;



import java.util.List;

import domain.*;

public interface IUserRepository extends IRepository<User>{

	public List<User> withType(Type type);
	public List<User> withType(String typeName);
	public List<User> withType(int typeId);
}
