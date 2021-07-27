package dev.ale.fdx.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;

import dev.ale.fdx.dao.GenericDao;

public class GenericDaoImpl<E, PK extends Serializable> implements GenericDao<E, PK> {

	private SessionFactory sessionFactory;
	private Class<E> entity;

	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void setEntity(Class<E> entity) {
		this.entity = entity;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public PK save(E entity) {
		return (PK) this.sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	@Transactional
	public E findOne(PK id) {
		return (E) this.sessionFactory.getCurrentSession().find(this.entity, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<E> findAll() {
		TypedQuery<E> query = this.sessionFactory.getCurrentSession().createQuery("from " + this.entity.getName());
		return query.getResultList();
	}
	
	@Override
	@Transactional
	public E get(PK id) {
		return (E) this.sessionFactory.getCurrentSession().get(this.entity, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public E merge(E entity) {
		return (E) this.sessionFactory.getCurrentSession().merge(entity);
	}
	
	
	@Override
	@Transactional
	public void delete(E entity) {
		this.sessionFactory.getCurrentSession().remove(entity);
	}

	@Override
	@Transactional
	public void deleteById(PK id) {
		E entity = findOne(id);
		delete(entity);
	}

	

}
