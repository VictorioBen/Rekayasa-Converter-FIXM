package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.FixmuniqueDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.messaging.FIXMUniqueMessageIdentifierType;
import dev.ale.fdx.service.FixmuniqueService;

@Service
public class FixmuniqueServiceImpl extends GenericServiceImpl<FIXMUniqueMessageIdentifierType, Long>implements FixmuniqueService {

	private FixmuniqueDao dao;
	@Autowired
	public FixmuniqueServiceImpl(GenericDao<FIXMUniqueMessageIdentifierType, Long>genericDao) {

		super(genericDao);
		setDao((FixmuniqueDao)genericDao);
		this.dao.setEntity(FIXMUniqueMessageIdentifierType.class);

	}

	public FixmuniqueDao getDao() {
		return dao;
	}

	public void setDao(FixmuniqueDao dao) {
		this.dao = dao;
	}


}
