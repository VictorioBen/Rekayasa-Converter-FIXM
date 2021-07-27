package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.HeightDao;
import dev.ale.fdx.entity.base.HeightType;
import dev.ale.fdx.service.HeightService;

@Service
public class HeightServiceImpl extends GenericServiceImpl<HeightType, Long> implements HeightService {
	private HeightDao dao;

	@Autowired
	public HeightServiceImpl(GenericDao<HeightType, Long>genericDao) {
		super(genericDao);
		setDao((HeightDao)genericDao);
		this.dao.setEntity(HeightType.class);

	}

	public HeightDao getDao() {
		return dao;
	}

	public void setDao(HeightDao dao) {
		this.dao = dao;
	}


}
