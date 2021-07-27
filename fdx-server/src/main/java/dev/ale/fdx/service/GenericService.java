package dev.ale.fdx.service;

import java.io.Serializable;
import java.util.List;

public interface GenericService<E, PK extends Serializable> {
	PK create(E entity);
	
	E retrieveOne(PK id);
	List<E> retrieveAll();
	E retrieve(PK id);
	
	E update(E entity);
	E updateById(PK id);
	
	void delete(E entity);
	void deleteById(PK id);
}
