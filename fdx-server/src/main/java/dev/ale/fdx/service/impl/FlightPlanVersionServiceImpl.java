package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.FlightPlanVersionDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.messaging.FlightPlanVersionType;
import dev.ale.fdx.service.FlightPlanVersionService;

@Service
public class FlightPlanVersionServiceImpl extends GenericServiceImpl<FlightPlanVersionType, Long> implements FlightPlanVersionService {

	private FlightPlanVersionDao dao;
	
	@Autowired
	public FlightPlanVersionServiceImpl(GenericDao<FlightPlanVersionType, Long> genericDao) {

		super(genericDao);
		setDao((FlightPlanVersionDao)genericDao);
		this.dao.setEntity(FlightPlanVersionType.class);
	}

	public FlightPlanVersionDao getDao() {
		return dao;
	}

	public void setDao(FlightPlanVersionDao dao) {
		this.dao = dao;
	}


}
