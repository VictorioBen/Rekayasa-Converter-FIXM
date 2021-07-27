package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.WindSpeedDao;
import dev.ale.fdx.entity.base.WindSpeedType;
import dev.ale.fdx.service.WindSpeedService;

@Service
public class WindSpeedServiceImpl extends GenericServiceImpl<WindSpeedType, Long> implements WindSpeedService {

	private WindSpeedDao dao;
	
	@Autowired
	public WindSpeedServiceImpl(GenericDao<WindSpeedType, Long>genericDao) {
		super(genericDao);
		setDao((WindSpeedDao)genericDao);
		this.dao.setEntity(WindSpeedType.class);
	}

	public WindSpeedDao getDao() {
		return dao;
	}

	public void setDao(WindSpeedDao dao) {
		this.dao = dao;
	}

}
