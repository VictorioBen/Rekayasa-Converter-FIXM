package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TrueAirSpeedRangeDao;
import dev.ale.fdx.entity.base.TrueAirspeedRangeType;
import dev.ale.fdx.service.TrueAirSpeedRangeService;

@Service
public class TrueAirSpeedRangeServiceImpl extends GenericServiceImpl<TrueAirspeedRangeType, Long> implements TrueAirSpeedRangeService{

	private TrueAirSpeedRangeDao dao;
	
	@Autowired
	public TrueAirSpeedRangeServiceImpl(GenericDao<TrueAirspeedRangeType, Long>genericDao) {
		super(genericDao);
		setDao((TrueAirSpeedRangeDao)genericDao);
		this.dao.setEntity(TrueAirspeedRangeType.class);
	}

	public TrueAirSpeedRangeDao getDao() {
		return dao;
	}

	public void setDao(TrueAirSpeedRangeDao dao) {
		this.dao = dao;
	}

}
