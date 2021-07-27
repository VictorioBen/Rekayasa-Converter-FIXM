package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.SurveillanceCapabilitiesDao;
import dev.ale.fdx.entity.flight.SurveillanceCapabilitiesType;
import dev.ale.fdx.service.SurveillanceCapabilitiesService;

@Service
public class SurveillanceCapabilitiesServiceImpl extends GenericServiceImpl<SurveillanceCapabilitiesType, Long> implements SurveillanceCapabilitiesService {
	
	private SurveillanceCapabilitiesDao dao;
	
	@Autowired
	public SurveillanceCapabilitiesServiceImpl(GenericDao<SurveillanceCapabilitiesType, Long>genericDao) {
		super(genericDao);
		setDao((SurveillanceCapabilitiesDao)genericDao);
		this.dao.setEntity(SurveillanceCapabilitiesType.class);
	}

	public SurveillanceCapabilitiesDao getDao() {
		return dao;
	}

	public void setDao(SurveillanceCapabilitiesDao dao) {
		this.dao = dao;
	}
	
}
