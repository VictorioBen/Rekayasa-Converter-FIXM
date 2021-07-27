package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.DepartureDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.DepartureType;
import dev.ale.fdx.service.DepartureService;

@Service
public class DepartureServiceImpl extends GenericServiceImpl<DepartureType, Long> implements DepartureService {
	private DepartureDao dao;

	@Autowired
	public DepartureServiceImpl(GenericDao<DepartureType, Long>genericDao) {
		super(genericDao);
		setDao((DepartureDao)genericDao);
		this.dao.setEntity(DepartureType.class);

	}

	public DepartureDao getDao() {
		return dao;
	}

	public void setDao(DepartureDao dao) {
		this.dao = dao;
	}


}
