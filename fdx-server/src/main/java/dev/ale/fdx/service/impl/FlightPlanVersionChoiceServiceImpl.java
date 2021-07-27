package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.FlightPlanVersionChoiceDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.messaging.FlightPlanVersionTypeChoiceType;
import dev.ale.fdx.service.FlightPlanVersionChoiceService;
@Service
public class FlightPlanVersionChoiceServiceImpl extends GenericServiceImpl<FlightPlanVersionTypeChoiceType, Long> implements FlightPlanVersionChoiceService {

	FlightPlanVersionChoiceDao dao;
	
	@Autowired
	public FlightPlanVersionChoiceServiceImpl(GenericDao<FlightPlanVersionTypeChoiceType, Long>genericDao) {

		super(genericDao);
		setDao((FlightPlanVersionChoiceDao)genericDao);
		this.dao.setEntity(FlightPlanVersionTypeChoiceType.class);

	}

	public FlightPlanVersionChoiceDao getDao() {
		return dao;
	}

	public void setDao(FlightPlanVersionChoiceDao dao) {
		this.dao = dao;
	}

}
