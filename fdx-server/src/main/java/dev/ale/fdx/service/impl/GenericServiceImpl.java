package dev.ale.fdx.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.service.GenericService;

public class GenericServiceImpl<E, PK extends Serializable> implements GenericService<E, PK > {

	private GenericDao<E, PK> dao;
	
	public GenericServiceImpl() {}
	
	public GenericServiceImpl(GenericDao<E, PK> dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public PK create(E entity) {
		return this.dao.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public E retrieveOne(PK id) {
		return this.dao.findOne(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<E> retrieveAll() {
		return this.dao.findAll();
	}

	@Override
	@Transactional
	public E retrieve(PK id) {
		return this.dao.get(id);
	}

	

	@Override
	@Transactional
	public void delete(E entity) {
		this.dao.delete(entity);
	}

	@Override
	@Transactional
	public void deleteById(PK id) {
		this.dao.deleteById(id);
	}

	@Override
	public E update(E entity) {
		return this.dao.merge(entity);
	}

	@Override
	public E updateById(PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
