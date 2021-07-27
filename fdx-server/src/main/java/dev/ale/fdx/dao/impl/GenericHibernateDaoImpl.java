package dev.ale.fdx.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dev.ale.fdx.dao.GenericDao;

public class GenericHibernateDaoImpl<E, PK extends Serializable> extends HibernateDaoSupport implements GenericDao<E, PK> {

	private Class<E> entity;

	@Autowired
	public GenericHibernateDaoImpl(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public void setEntity(Class<E> entity) {
		this.entity = entity;
	}

	@SuppressWarnings("unchecked")
	@Override
	public PK save(E entity) {
		return (PK) super.getHibernateTemplate().save(entity);
	}

	@Override
	public E findOne(PK id) {
		return super.getHibernateTemplate().get(this.entity, id);
	}

	@Override
	public List<E> findAll() {
		return super.getHibernateTemplate().loadAll(this.entity);
	}

	@Override
	public E get(PK id) {
		return super.getHibernateTemplate().get(this.entity, id);
	}

	@Override
	public E merge(E entity) {
		return super.getHibernateTemplate().merge(entity);
	}

	@Override
	public void delete(E entity) {
		super.getHibernateTemplate().delete(entity);
	}

	@Override
	public void deleteById(PK id) {
		E entity = super.getHibernateTemplate().get(this.entity, id);
		super.getHibernateTemplate().delete(entity);
	}

	


}
