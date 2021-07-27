package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.GeographicalPositionDao;
import dev.ale.fdx.entity.base.GeographicalPositionType;
import dev.ale.fdx.service.GeographicalPositionService;

@Service
public class GeographicalPositionServiceImpl extends GenericServiceImpl<GeographicalPositionType, Long> implements GeographicalPositionService {

	private GeographicalPositionDao dao;
	
	@Autowired
	public GeographicalPositionServiceImpl(GenericDao<GeographicalPositionType, Long>genericDao) {
		super(genericDao);
		setDao((GeographicalPositionDao)genericDao);
		this.dao.setEntity(GeographicalPositionType.class);
	}

	public GeographicalPositionDao getDao() {
		return dao;
	}

	public void setDao(GeographicalPositionDao dao) {
		this.dao = dao;
	}


}
