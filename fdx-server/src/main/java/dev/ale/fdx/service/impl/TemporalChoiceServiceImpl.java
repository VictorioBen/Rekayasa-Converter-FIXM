package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TemporalChoiceDao;
import dev.ale.fdx.entity.base.TemporalChoiceType;
import dev.ale.fdx.service.TemporalChoiceService;

@Service
public class TemporalChoiceServiceImpl extends GenericServiceImpl<TemporalChoiceType, Long> implements TemporalChoiceService {

	private TemporalChoiceDao dao;
	
	@Autowired
	public TemporalChoiceServiceImpl(GenericDao<TemporalChoiceType, Long>genericDao) {
		super(genericDao);
		setDao((TemporalChoiceDao)genericDao);
		this.dao.setEntity(TemporalChoiceType.class);
	}

	public TemporalChoiceDao getDao() {
		return dao;
	}

	public void setDao(TemporalChoiceDao dao) {
		this.dao = dao;
	}

}
