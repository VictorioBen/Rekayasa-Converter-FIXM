package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.LevelChangeDao;
import dev.ale.fdx.entity.flight.LevelChangeType;
import dev.ale.fdx.service.LevelChangeService;

@Service
public class LevelChangeServiceImpl extends GenericServiceImpl<LevelChangeType, Long> implements LevelChangeService{
	private LevelChangeDao dao;
	
	@Autowired
	public LevelChangeServiceImpl(GenericDao<LevelChangeType, Long>genericDao) {

		super(genericDao);
		setDao((LevelChangeDao)genericDao);
		this.dao.setEntity(LevelChangeType.class);
	}

	public LevelChangeDao getDao() {
		return dao;
	}

	public void setDao(LevelChangeDao dao) {
		this.dao = dao;
	}

}
