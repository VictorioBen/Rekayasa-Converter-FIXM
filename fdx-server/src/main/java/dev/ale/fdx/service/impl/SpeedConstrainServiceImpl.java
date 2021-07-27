package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.SpeedConstrainDao;
import dev.ale.fdx.entity.flight.SpeedConstraintType;
import dev.ale.fdx.service.SpeedConstrainService;

@Service
public class SpeedConstrainServiceImpl extends GenericServiceImpl<SpeedConstraintType, Long> implements SpeedConstrainService{
	private SpeedConstrainDao dao;
	
	@Autowired
	public SpeedConstrainServiceImpl(GenericDao<SpeedConstraintType, Long>genericDao) {

		super(genericDao);
		setDao((SpeedConstrainDao)genericDao);
		this.dao.setEntity(SpeedConstraintType.class);
	}

	public SpeedConstrainDao getDao() {
		return dao;
	}

	public void setDao(SpeedConstrainDao dao) {
		this.dao = dao;
	}

}
