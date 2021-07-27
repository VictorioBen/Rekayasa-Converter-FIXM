package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.FlightRouteInformationDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.FlightRouteInformationType;
import dev.ale.fdx.service.FlightRouteInformationService;


@Service
public class FlightRouteInformationServiceImpl extends GenericServiceImpl<FlightRouteInformationType, Long> implements FlightRouteInformationService {

	FlightRouteInformationDao dao; 
	
	@Autowired
	public FlightRouteInformationServiceImpl(GenericDao<FlightRouteInformationType, Long>genericDao) {

		super(genericDao);
		setDao((FlightRouteInformationDao)genericDao);
		this.dao.setEntity(FlightRouteInformationType.class);
	}

	public FlightRouteInformationDao getDao() {
		return dao;
	}

	public void setDao(FlightRouteInformationDao dao) {
		this.dao = dao;
	}

}
