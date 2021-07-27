package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.LevelConstrainDao;
import dev.ale.fdx.entity.flight.LevelConstraintType;
import dev.ale.fdx.service.LevelConstrainService;

@Service
public class LevelConstrainServiceImpl extends GenericServiceImpl<LevelConstraintType, Long> implements LevelConstrainService {
	private LevelConstrainDao dao;
	
	@Autowired
	public LevelConstrainServiceImpl(GenericDao<LevelConstraintType, Long>genericDao) {
		super(genericDao);
		setDao((LevelConstrainDao)genericDao);
		this.dao.setEntity(LevelConstraintType.class);
	}

	public LevelConstrainDao getDao() {
		return dao;
	}

	public void setDao(LevelConstrainDao dao) {
		this.dao = dao;
	}

}
