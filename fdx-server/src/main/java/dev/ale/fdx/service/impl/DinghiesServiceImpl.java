package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.DinghiesDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.DinghiesType;
import dev.ale.fdx.service.DinghiesService;

@Service
public class DinghiesServiceImpl extends GenericServiceImpl<DinghiesType, Long> implements DinghiesService {
	private DinghiesDao dao;
	
	@Autowired
	public DinghiesServiceImpl(GenericDao<DinghiesType, Long>genericDao) {
		super(genericDao);
		setDao((DinghiesDao)genericDao);
		this.dao.setEntity(DinghiesType.class);


	}

	public DinghiesDao getDao() {
		return dao;
	}

	public void setDao(DinghiesDao dao) {
		this.dao = dao;
	}



}
