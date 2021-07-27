package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.FlightIdentificationDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.FlightIdentificationType;
import dev.ale.fdx.service.FlightIdentificationService;

@Service
public class FlightIdentificationServiceImpl extends GenericServiceImpl<FlightIdentificationType, Long> implements FlightIdentificationService {
	private FlightIdentificationDao dao;
	
	@Autowired
	public FlightIdentificationServiceImpl(GenericDao<FlightIdentificationType, Long>genericDao) {
		super(genericDao);
		setDao((FlightIdentificationDao)genericDao);
		this.dao.setEntity(FlightIdentificationType.class);

	}

	public FlightIdentificationDao getDao() {
		return dao;
	}

	public void setDao(FlightIdentificationDao dao) {
		this.dao = dao;
	}

}
