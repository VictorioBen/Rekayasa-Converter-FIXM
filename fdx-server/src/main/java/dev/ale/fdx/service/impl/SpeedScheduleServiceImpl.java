package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.SpeedScheduleDao;
import dev.ale.fdx.entity.flight.SpeedScheduleType;
import dev.ale.fdx.service.SpeedScheduleService;

@Service
public class SpeedScheduleServiceImpl extends GenericServiceImpl<SpeedScheduleType, Long> implements SpeedScheduleService {
	private SpeedScheduleDao dao;
	
	@Autowired
	public SpeedScheduleServiceImpl(GenericDao<SpeedScheduleType, Long>genericDao) {

		super(genericDao);
		setDao((SpeedScheduleDao)genericDao);
		this.dao.setEntity(SpeedScheduleType.class);
	}

	public SpeedScheduleDao getDao() {
		return dao;
	}

	public void setDao(SpeedScheduleDao dao) {
		this.dao = dao;
	}

}
