package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TemperaturesDao;
import dev.ale.fdx.entity.flight.TemperaturesType;
import dev.ale.fdx.service.TemperaturesService;

@Repository
public class TemperaturesServiceImpl extends GenericServiceImpl<TemperaturesType, Long> implements TemperaturesService {

	private TemperaturesDao dao;
	
	@Autowired
	public TemperaturesServiceImpl(GenericDao<TemperaturesType, Long>genericDao) {
		super(genericDao);
		setDao((TemperaturesDao)genericDao);
		this.dao.setEntity(TemperaturesType.class);
	}

	public TemperaturesDao getDao() {
		return dao;
	}

	public void setDao(TemperaturesDao dao) {
		this.dao = dao;
	}

}
