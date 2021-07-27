package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.CruiseClimbDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.CruiseClimbStartType;
import dev.ale.fdx.service.CruiseClimbService;

@Service
public class CruiseClimbServiceImpl extends GenericServiceImpl<CruiseClimbStartType, Long> implements CruiseClimbService {
	private CruiseClimbDao dao;
	@Autowired
	public CruiseClimbServiceImpl(GenericDao<CruiseClimbStartType, Long>genericDao) {
		super(genericDao);
		setDao((CruiseClimbDao)genericDao);
		this.dao.setEntity(CruiseClimbStartType.class);
	}

	public CruiseClimbDao getDao() {
		return dao;
	}

	public void setDao(CruiseClimbDao dao) {
		this.dao = dao;
	}

}
