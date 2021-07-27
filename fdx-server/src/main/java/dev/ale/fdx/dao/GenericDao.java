package dev.ale.fdx.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao <E, PK extends Serializable> {
	
	void setEntity(Class<E> entity);
	
	PK save(E entity);
	
	E findOne(PK id);
	List<E> findAll();
	E get(PK id);
	
	
	
	E merge(E entity);
	
	void delete(E entity);
	void deleteById(PK id);
	
}
