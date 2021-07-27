package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.ExtensibleDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.ExtensibleType;

@Service
public class ExtensibleServiceImpl extends GenericServiceImpl<ExtensibleType, Long>{

	private ExtensibleDao dao;
	
	@Autowired
	public ExtensibleServiceImpl(GenericDao<ExtensibleType, Long> genericDao) {
		super(genericDao);
		setDao((ExtensibleDao) genericDao);
		this.dao.setEntity(ExtensibleType.class);
	}

	public ExtensibleDao getDao() {
		return dao;
	}

	public void setDao(ExtensibleDao dao) {
		this.dao = dao;
	}
}
