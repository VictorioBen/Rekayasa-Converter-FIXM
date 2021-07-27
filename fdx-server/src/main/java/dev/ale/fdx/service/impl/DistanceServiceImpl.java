package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DistanceDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.DistanceType;
import dev.ale.fdx.service.DistanceService;

@Repository
public class DistanceServiceImpl extends GenericServiceImpl<DistanceType, Long> implements DistanceService {

	private DistanceDao dao;
	@Autowired
	public DistanceServiceImpl(GenericDao<DistanceType, Long>genericDao) {
		super(genericDao);
		setDao((DistanceDao)genericDao);
		this.dao.setEntity(DistanceType.class);

	}

	public DistanceDao getDao() {
		return dao;
	}

	public void setDao(DistanceDao dao) {
		this.dao = dao;
	}



}
