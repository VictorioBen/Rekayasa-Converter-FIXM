package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.DestinationDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.DestinationType;
import dev.ale.fdx.service.DestinationService;

@Service
public class DestinationServiceImpl extends GenericServiceImpl<DestinationType, Long> implements DestinationService {
	private DestinationDao dao;
	
	@Autowired
	public DestinationServiceImpl(GenericDao<DestinationType, Long>genericDao) {
		super(genericDao);
		setDao((DestinationDao)genericDao);
		this.dao.setEntity(DestinationType.class);
	}

	public DestinationDao getDao() {
		return dao;
	}

	public void setDao(DestinationDao dao) {
		this.dao = dao;
	}


}
