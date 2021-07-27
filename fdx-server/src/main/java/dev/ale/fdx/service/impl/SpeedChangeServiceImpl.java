package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.SpeedChangeDao;
import dev.ale.fdx.entity.flight.SpeedChangeType;
import dev.ale.fdx.service.SpeedChangeService;

@Service
public class SpeedChangeServiceImpl extends GenericServiceImpl<SpeedChangeType, Long> implements SpeedChangeService {

	private SpeedChangeDao dao;
	
	@Autowired
	public SpeedChangeServiceImpl(GenericDao<SpeedChangeType, Long>genericDao) {
		super(genericDao);
		setDao((SpeedChangeDao)genericDao);
		this.dao.setEntity(SpeedChangeType.class);
	}

	public SpeedChangeDao getDao() {
		return dao;
	}

	public void setDao(SpeedChangeDao dao) {
		this.dao = dao;
	}

}
