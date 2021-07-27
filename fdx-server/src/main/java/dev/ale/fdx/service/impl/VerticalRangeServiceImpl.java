package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.VerticalRangeDao;
import dev.ale.fdx.entity.base.VerticalRangeType;
import dev.ale.fdx.service.VerticalRangeService;

@Repository
public class VerticalRangeServiceImpl extends GenericServiceImpl<VerticalRangeType, Long> implements VerticalRangeService {

	private VerticalRangeDao dao;
	
	@Autowired
	public VerticalRangeServiceImpl(GenericDao<VerticalRangeType, Long>genericDao) {
		super(genericDao);
		setDao((VerticalRangeDao)genericDao);
		this.dao.setEntity(VerticalRangeType.class);
	}

	public VerticalRangeDao getDao() {
		return dao;
	}

	public void setDao(VerticalRangeDao dao) {
		this.dao = dao;
	}

}
