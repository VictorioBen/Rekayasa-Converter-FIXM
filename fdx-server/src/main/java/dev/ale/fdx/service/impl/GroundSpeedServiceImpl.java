package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.GroundSpeedDao;
import dev.ale.fdx.entity.base.GroundSpeedType;
import dev.ale.fdx.service.GroundSpeedService;

@Service
public class GroundSpeedServiceImpl extends GenericServiceImpl<GroundSpeedType, Long> implements GroundSpeedService{
	private GroundSpeedDao dao;
	
	@Autowired
	public GroundSpeedServiceImpl(GenericDao<GroundSpeedType, Long>genericDao) {

		super(genericDao);
		setDao((GroundSpeedDao)genericDao);
		this.dao.setEntity(GroundSpeedType.class);
	}

	public GroundSpeedDao getDao() {
		return dao;
	}

	public void setDao(GroundSpeedDao dao) {
		this.dao = dao;
	}
		
}
