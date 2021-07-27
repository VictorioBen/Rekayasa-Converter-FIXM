package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TemporalRangeDao;
import dev.ale.fdx.entity.base.TemporalRangeType;
import dev.ale.fdx.service.TemporalRangeService;

@Service
public class TemporalRangeServiceImpl extends GenericServiceImpl<TemporalRangeType, Long> implements TemporalRangeService{

	private TemporalRangeDao dao; 
	
	@Autowired
	public TemporalRangeServiceImpl(GenericDao<TemporalRangeType, Long>genericDao) {

		super(genericDao);
		setDao((TemporalRangeDao)genericDao);
		this.dao.setEntity(TemporalRangeType.class);

	}

	public TemporalRangeDao getDao() {
		return dao;
	}

	public void setDao(TemporalRangeDao dao) {
		this.dao = dao;
	}


}
