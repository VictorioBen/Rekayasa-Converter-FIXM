package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.ExtensionDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.ExtensionType;
import dev.ale.fdx.service.ExtensionService;

@Service
public class ExtensionServiceImpl extends GenericServiceImpl<ExtensionType, Long> implements ExtensionService {

	private ExtensionDao dao;
	
	@Autowired
	public ExtensionServiceImpl(GenericDao<ExtensionType, Long> genericDao) {
		super(genericDao);
		setDao((ExtensionDao) genericDao);
		this.dao.setEntity(ExtensionType.class);
	}

	public ExtensionDao getDao() {
		return dao;
	}

	public void setDao(ExtensionDao dao) {
		this.dao = dao;
	}
}
