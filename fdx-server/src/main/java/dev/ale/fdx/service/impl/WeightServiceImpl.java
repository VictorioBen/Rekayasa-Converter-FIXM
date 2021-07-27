package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.WeightDao;
import dev.ale.fdx.entity.base.WeightType;
import dev.ale.fdx.service.WeightService;

@Service
public class WeightServiceImpl extends GenericServiceImpl<WeightType, Long> implements WeightService{

	private WeightDao dao;
	
	@Autowired
	public WeightServiceImpl(GenericDao<WeightType, Long>genericDao) {
		super(genericDao);
		setDao((WeightDao)genericDao);
		this.dao.setEntity(WeightType.class);
	}

	public WeightDao getDao() {
		return dao;
	}

	public void setDao(WeightDao dao) {
		this.dao = dao;
	}

}
