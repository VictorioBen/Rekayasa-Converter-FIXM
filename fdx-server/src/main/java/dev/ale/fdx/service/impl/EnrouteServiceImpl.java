package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.EnrouteDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.EnRouteType;
import dev.ale.fdx.service.EnrouteService;

@Service
public class EnrouteServiceImpl extends GenericServiceImpl<EnRouteType, Long> implements EnrouteService {
	private EnrouteDao dao;

	@Autowired
	public EnrouteServiceImpl(GenericDao<EnRouteType, Long>genericDao) {
		super(genericDao);
		setDao((EnrouteDao)genericDao);
		this.dao.setEntity(EnRouteType.class);
	}

	public EnrouteDao getDao() {
		return dao;
	}

	public void setDao(EnrouteDao dao) {
		this.dao = dao;
	}


}
