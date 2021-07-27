package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.FlightlevelOrAltitudeDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.FlightLevelOrAltitudeType;
import dev.ale.fdx.service.FlightlevelOrAltitudeService;

@Service
public class FlightlevelOrAltitudeServiceImpl extends GenericServiceImpl<FlightLevelOrAltitudeType, Long>implements FlightlevelOrAltitudeService {

	private FlightlevelOrAltitudeDao dao;
	
	@Autowired
	public FlightlevelOrAltitudeServiceImpl(GenericDao<FlightLevelOrAltitudeType, Long>genericDao) {
		super(genericDao);
		setDao((FlightlevelOrAltitudeDao)genericDao);
		this.dao.setEntity(FlightLevelOrAltitudeType.class);



	}

	public FlightlevelOrAltitudeDao getDao() {
		return dao;
	}

	public void setDao(FlightlevelOrAltitudeDao dao) {
		this.dao = dao;
	}


}
