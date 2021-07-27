package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AircraftDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.AircraftType;
import dev.ale.fdx.service.AircraftService;

@Service
public class AircraftServiceImpl extends GenericServiceImpl<AircraftType, Long> implements AircraftService{

	private AircraftDao dao;

	@Autowired
	public AircraftServiceImpl(GenericDao<AircraftType, Long> genericDao) {
		super(genericDao);
		setDao((AircraftDao) genericDao);
		this.dao.setEntity(AircraftType.class);
	}

	public AircraftDao getDao() {
		return dao;
	}

	public void setDao(AircraftDao dao) {
		this.dao = dao;
	}
}
