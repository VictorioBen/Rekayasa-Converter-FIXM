package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.FlightCapabilitiestDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.FlightCapabilitiesType;
import dev.ale.fdx.service.FlightCapabilitiestService;

@Service
public class FlightCapabilitiestServiceImpl extends GenericServiceImpl<FlightCapabilitiesType, Long> implements FlightCapabilitiestService {

	private FlightCapabilitiestDao dao;

	@Autowired
	public FlightCapabilitiestServiceImpl(GenericDao<FlightCapabilitiesType, Long>genericDao) {
		super(genericDao);
		setDao((FlightCapabilitiestDao)genericDao);
		this.dao.setEntity(FlightCapabilitiesType.class);
	}

	public FlightCapabilitiestDao getDao() {
		return dao;
	}

	public void setDao(FlightCapabilitiestDao dao) {
		this.dao = dao;
	}


}
