package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.FlightRouteElementDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.FlightRouteElementType;
import dev.ale.fdx.service.FlightRouteElementService;

@Service
public class FlightRouteElementServiceImpl extends GenericServiceImpl<FlightRouteElementType, Long> implements FlightRouteElementService {

	FlightRouteElementDao dao;
	
	@Autowired
	public FlightRouteElementServiceImpl(GenericDao<FlightRouteElementType, Long>genericDao) {

		super(genericDao);
		setDao((FlightRouteElementDao)genericDao);
		this.dao.setEntity(FlightRouteElementType.class);
	}

	public FlightRouteElementDao getDao() {
		return dao;
	}

	public void setDao(FlightRouteElementDao dao) {
		this.dao = dao;
	}

}
