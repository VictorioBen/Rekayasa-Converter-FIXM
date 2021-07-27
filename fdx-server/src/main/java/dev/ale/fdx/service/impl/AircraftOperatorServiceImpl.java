package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AircraftOperatorDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.AircraftOperatorType;
import dev.ale.fdx.service.AircraftOperatorService;

@Service
public class AircraftOperatorServiceImpl extends GenericServiceImpl<AircraftOperatorType, Long> implements AircraftOperatorService {

	private AircraftOperatorDao dao;

	@Autowired
	public AircraftOperatorServiceImpl(GenericDao<AircraftOperatorType, Long>genericDao) {
		super(genericDao);
		setDao((AircraftOperatorDao)genericDao);
		this.dao.setEntity(AircraftOperatorType.class);

	}

	public AircraftOperatorDao getDao() {
		return dao;
	}

	public void setDao(AircraftOperatorDao dao) {
		this.dao = dao;
	}




}
