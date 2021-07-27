package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TimeConstraintDao;
import dev.ale.fdx.entity.flight.TimeConstraintType;
import dev.ale.fdx.service.TimeConstraintService;

@Service
public class TimeConstraintServiceImpl extends GenericServiceImpl<TimeConstraintType, Long> implements TimeConstraintService {

	private TimeConstraintDao dao;
	
	@Autowired
	public TimeConstraintServiceImpl(GenericDao<TimeConstraintType, Long>genericDao) {

		super(genericDao);
		setDao((TimeConstraintDao)genericDao);
		this.dao.setEntity(TimeConstraintType.class);
	}

	public TimeConstraintDao getDao() {
		return dao;
	}

	public void setDao(TimeConstraintDao dao) {
		this.dao = dao;
	}

}
