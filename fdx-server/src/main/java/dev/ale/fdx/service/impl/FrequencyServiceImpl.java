package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FrequencyDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.FrequencyType;
import dev.ale.fdx.service.FrequencyService;

@Repository
public class FrequencyServiceImpl extends GenericServiceImpl<FrequencyType, Long> implements FrequencyService{

	private FrequencyDao dao;
	@Autowired
	public FrequencyServiceImpl(GenericDao<FrequencyType, Long>genericDao) {

		super(genericDao);
		setDao((FrequencyDao)genericDao);
		this.dao.setEntity(FrequencyType.class);

	}

	public FrequencyDao getDao() {
		return dao;
	}

	public void setDao(FrequencyDao dao) {
		this.dao = dao;
	}

}
