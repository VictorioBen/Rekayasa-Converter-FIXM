package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.FlightDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.FlightType;
import dev.ale.fdx.service.FlightService;

@Service
public class FlightServiceImpl extends GenericServiceImpl<FlightType, Long> implements FlightService {
	 
	private FlightDao dao;
	
	@Autowired
	public FlightServiceImpl(GenericDao<FlightType, Long> genericDao) {
		super(genericDao);
		setDao((FlightDao) genericDao);
		this.dao.setEntity(FlightType.class);
	}

	public FlightDao getDao() {
		return dao;
	}

	public void setDao(FlightDao dao) {
		this.dao = dao;
	}
	
}
