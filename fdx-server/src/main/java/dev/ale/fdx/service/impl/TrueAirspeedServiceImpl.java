package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TrueAirspeedDao;
import dev.ale.fdx.entity.base.TrueAirspeedType;
import dev.ale.fdx.service.TrueAirspeedService;

@Service
public class TrueAirspeedServiceImpl extends GenericServiceImpl<TrueAirspeedType, Long> implements TrueAirspeedService{

	private TrueAirspeedDao dao;
	
	@Autowired
	public TrueAirspeedServiceImpl(GenericDao<TrueAirspeedType, Long>genericDao) {

		super(genericDao);
		setDao((TrueAirspeedDao)genericDao);
		this.dao.setEntity(TrueAirspeedType.class);
	}

	public TrueAirspeedDao getDao() {
		return dao;
	}

	public void setDao(TrueAirspeedDao dao) {
		this.dao = dao;
	}

}
