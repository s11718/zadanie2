package repoImplement;

import java.util.List;

import domain.Type;
import repo.IRepository;

public class ImplTypeRepo implements IRepository <Type>{
	
	DummyDb database;


	public ImplTypeRepo(DummyDb database) {
		super();
		this.database = database;
	}
	
	public void save(Type entity) {
		database.types.add(entity);
	}
	
	public void update(Type entity) {
		
	}
	
	public void delete(Type entity) {
		database.types.remove(entity);
	}
	
	public Type get(int id) {
		for(Type t: database.types){
			if(t.getId()==id)
				return t;
		}
		return null;
	}

	public List<Type> getAll() {
		return database.types;
	}

	public Type getUnit(String name){
		for(Type t: database.types){
			if(t.getName()==name)
				return t;
		}
		return null;
	}
}
