package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.RadioActivityDao;
import dev.ale.fdx.entity.base.RadioactivityType;
import dev.ale.fdx.service.RadioActivityService;

@Service
public class RadioActivityServiceImpl extends GenericServiceImpl<RadioactivityType, Long> implements RadioActivityService{
	private RadioActivityDao dao;
	
	@Autowired
	public RadioActivityServiceImpl(GenericDao<RadioactivityType, Long>genericDao) {
		super(genericDao);
		setDao((RadioActivityDao)genericDao);
		this.dao.setEntity(RadioactivityType.class);
	}

	public RadioActivityDao getDao() {
		return dao;
	}

	public void setDao(RadioActivityDao dao) {
		this.dao = dao;
	}

}
