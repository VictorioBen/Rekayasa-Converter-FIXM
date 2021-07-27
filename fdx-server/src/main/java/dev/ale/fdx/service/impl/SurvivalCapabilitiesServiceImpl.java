package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.SurvivalCapabilitiesDao;
import dev.ale.fdx.entity.flight.SurvivalCapabilitiesType;
import dev.ale.fdx.service.SurvivalCapabilitiesService;

@Service
public class SurvivalCapabilitiesServiceImpl extends GenericServiceImpl<SurvivalCapabilitiesType, Long> implements SurvivalCapabilitiesService {

	private SurvivalCapabilitiesDao dao;
	
	@Autowired
	public SurvivalCapabilitiesServiceImpl(GenericDao<SurvivalCapabilitiesType, Long>genericDao) {
		super(genericDao);
		setDao((SurvivalCapabilitiesDao)genericDao);
		this.dao.setEntity(SurvivalCapabilitiesType.class);

	}

	public SurvivalCapabilitiesDao getDao() {
		return dao;
	}

	public void setDao(SurvivalCapabilitiesDao dao) {
		this.dao = dao;
	}

}
