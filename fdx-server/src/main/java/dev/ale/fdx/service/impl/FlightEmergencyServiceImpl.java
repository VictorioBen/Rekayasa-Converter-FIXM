package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.FlightEmergencyDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.FlightEmergencyType;
import dev.ale.fdx.service.FlightEmergencyService;

@Service
public class FlightEmergencyServiceImpl extends GenericServiceImpl<FlightEmergencyType, Long>implements FlightEmergencyService {

	private FlightEmergencyDao dao;
	
	@Autowired
	public FlightEmergencyServiceImpl(GenericDao<FlightEmergencyType, Long>genericDao) {
		super(genericDao);
		setDao((FlightEmergencyDao)genericDao);
		this.dao.setEntity(FlightEmergencyType.class);
	}

	public FlightEmergencyDao getDao() {
		return dao;
	}

	public void setDao(FlightEmergencyDao dao) {
		this.dao = dao;
	}

}
