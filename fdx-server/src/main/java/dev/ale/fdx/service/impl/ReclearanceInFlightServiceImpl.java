package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.ReclearanceInFlightDao;
import dev.ale.fdx.entity.flight.ReclearanceInFlightType;
import dev.ale.fdx.service.ReclearanceInFlightService;

@Service
public class ReclearanceInFlightServiceImpl extends GenericServiceImpl<ReclearanceInFlightType, Long> implements ReclearanceInFlightService {

	private ReclearanceInFlightDao dao;
	
	@Autowired
	public ReclearanceInFlightServiceImpl(GenericDao<ReclearanceInFlightType, Long>genericDao) {

		super(genericDao);
		setDao((ReclearanceInFlightDao)genericDao);
		this.dao.setEntity(ReclearanceInFlightType.class);
	}

	public ReclearanceInFlightDao getDao() {
		return dao;
	}

	public void setDao(ReclearanceInFlightDao dao) {
		this.dao = dao;
	}

}
