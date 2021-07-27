package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.DimensionDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.DimensionsType;
import dev.ale.fdx.service.DimensionService;

@Service
public class DimensionServiceImpl extends GenericServiceImpl<DimensionsType, Long> implements DimensionService {
	private DimensionDao dao;
	
	@Autowired
	public DimensionServiceImpl(GenericDao<DimensionsType, Long>genericDao) {
		super(genericDao);
		setDao((DimensionDao)genericDao);
		this.dao.setEntity(DimensionsType.class);
	}

	public DimensionDao getDao() {
		return dao;
	}

	public void setDao(DimensionDao dao) {
		this.dao = dao;
	}


}

