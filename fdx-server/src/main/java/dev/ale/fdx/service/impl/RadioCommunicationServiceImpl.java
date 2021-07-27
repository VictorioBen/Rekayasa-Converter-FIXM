package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.RadioCommunicationFailureDao;
import dev.ale.fdx.entity.flight.RadioCommunicationFailureType;
import dev.ale.fdx.service.RadioCommunicationFailureService;

@Repository
public class RadioCommunicationServiceImpl extends GenericServiceImpl<RadioCommunicationFailureType, Long> implements RadioCommunicationFailureService{
	private RadioCommunicationFailureDao dao;
	
	@Autowired
	public RadioCommunicationServiceImpl(GenericDao<RadioCommunicationFailureType, Long>genericDao) {
		super(genericDao);
		setDao((RadioCommunicationFailureDao)genericDao);
		this.dao.setEntity(RadioCommunicationFailureType.class);
	}

	public RadioCommunicationFailureDao getDao() {
		return dao;
	}

	public void setDao(RadioCommunicationFailureDao dao) {
		this.dao = dao;
	}

}
