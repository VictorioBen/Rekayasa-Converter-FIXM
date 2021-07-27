package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TemperaturDao;
import dev.ale.fdx.entity.base.TemperatureType;
import dev.ale.fdx.service.TemperatureService;

@Service
public class TemperatureServiceImpl extends GenericServiceImpl<TemperatureType, Long> implements TemperatureService {

	private TemperaturDao dao;
	
	@Autowired
	public TemperatureServiceImpl(GenericDao<TemperatureType, Long>genericDao) {

		super(genericDao);
		setDao((TemperaturDao)genericDao);
		this.dao.setEntity(TemperatureType.class);
	}

	public TemperaturDao getDao() {
		return dao;
	}

	public void setDao(TemperaturDao dao) {
		this.dao = dao;
	}

}
