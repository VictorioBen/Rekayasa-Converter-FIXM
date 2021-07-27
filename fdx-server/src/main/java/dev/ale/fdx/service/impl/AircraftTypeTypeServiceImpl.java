package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AircraftTypeTypeDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.AircraftTypeType;
import dev.ale.fdx.service.AircraftTypeTypeService;

@Service
public class AircraftTypeTypeServiceImpl extends GenericServiceImpl<AircraftTypeType, Long> implements AircraftTypeTypeService {
	private AircraftTypeTypeDao dao;

	@Autowired
	public AircraftTypeTypeServiceImpl(GenericDao<AircraftTypeType, Long>genericDao) {
		super(genericDao);
		setDao((AircraftTypeTypeDao)genericDao);
		this.dao.setEntity(AircraftTypeType.class);

	}


	public AircraftTypeTypeDao getDao() {
		return dao;
	}

	public void setDao(AircraftTypeTypeDao dao) {
		this.dao = dao;
	}




}
