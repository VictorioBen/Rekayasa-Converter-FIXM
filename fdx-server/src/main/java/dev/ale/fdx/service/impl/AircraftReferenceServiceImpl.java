package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AircraftReferenceDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.AircraftTypeReferenceType;
import dev.ale.fdx.service.AircraftReferenceService;

@Service
public class AircraftReferenceServiceImpl extends GenericServiceImpl<AircraftTypeReferenceType, Long> implements AircraftReferenceService {

	private AircraftReferenceDao dao;
	@Autowired
	public AircraftReferenceServiceImpl(GenericDao<AircraftTypeReferenceType, Long>genericDao) {
		super(genericDao);
		setDao((AircraftReferenceDao)genericDao);
		this.dao.setEntity(AircraftTypeReferenceType.class);

	}

	public AircraftReferenceDao getDao() {
		return dao;
	}

	public void setDao(AircraftReferenceDao dao) {
		this.dao = dao;
	}




}
