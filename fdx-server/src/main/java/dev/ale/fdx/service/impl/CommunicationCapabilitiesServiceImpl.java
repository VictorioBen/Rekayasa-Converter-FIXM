package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.CommunicationCapabilitiesDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.CommunicationCapabilitiesType;
import dev.ale.fdx.service.CommunicationCapabilitiesService;

@Service
public class CommunicationCapabilitiesServiceImpl extends GenericServiceImpl<CommunicationCapabilitiesType, Long> implements CommunicationCapabilitiesService{
	private CommunicationCapabilitiesDao dao;

	@Autowired
	public CommunicationCapabilitiesServiceImpl(GenericDao<CommunicationCapabilitiesType, Long>genericDao) {
		super(genericDao);
		setDao((CommunicationCapabilitiesDao)genericDao);
		this.dao.setEntity(CommunicationCapabilitiesType.class);
	}

	public CommunicationCapabilitiesDao getDao() {
		return dao;
	}

	public void setDao(CommunicationCapabilitiesDao dao) {
		this.dao = dao;
	}

}
