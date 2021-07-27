package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.EnrouteDelayDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.EnRouteDelayType;
import dev.ale.fdx.service.EnrouteDelayService;

@Service
public class EnrouteDelayServiceImpl extends GenericServiceImpl<EnRouteDelayType, Long> implements EnrouteDelayService{
	private EnrouteDelayDao dao;

	@Autowired
	public EnrouteDelayServiceImpl(GenericDao<EnRouteDelayType, Long>genericDao) {
		super(genericDao);
		setDao((EnrouteDelayDao)genericDao);
		this.dao.setEntity(EnRouteDelayType.class);
	}

	public EnrouteDelayDao getDao() {
		return dao;
	}

	public void setDao(EnrouteDelayDao dao) {
		this.dao = dao;
	}


}
