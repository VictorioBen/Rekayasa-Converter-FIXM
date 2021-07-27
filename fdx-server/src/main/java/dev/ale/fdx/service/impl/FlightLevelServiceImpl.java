package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.FlightLevelDao;
import dev.ale.fdx.dao.FlightlevelOrAltitudeDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.FlightLevelOrAltitudeType;
import dev.ale.fdx.entity.base.FlightLevelType;
import dev.ale.fdx.service.FlightLevelService;

@Service
public class FlightLevelServiceImpl extends GenericServiceImpl<FlightLevelType, Long> implements FlightLevelService{

	private FlightLevelDao dao;
	
	@Autowired
	public FlightLevelServiceImpl(GenericDao<FlightLevelType, Long>genericDao) {
		super(genericDao);
		setDao((FlightLevelDao)genericDao);
		this.dao.setEntity(FlightLevelType.class);
	}

	public FlightLevelDao getDao() {
		return dao;
	}

	public void setDao(FlightLevelDao dao) {
		this.dao = dao;
	}


}
