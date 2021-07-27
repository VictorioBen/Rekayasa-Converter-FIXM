package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.BoundaryCrossingDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.BoundaryCrossingType;
import dev.ale.fdx.service.BoundaryCrossingService;

@Service
public class BoundaryCrossingServiceImpl extends GenericServiceImpl<BoundaryCrossingType, Long> implements BoundaryCrossingService{

	private BoundaryCrossingDao dao;
	
	@Autowired
	public BoundaryCrossingServiceImpl(GenericDao<BoundaryCrossingType, Long>genericDao) {
		super(genericDao);
		setDao((BoundaryCrossingDao)genericDao);
		this.dao.setEntity(BoundaryCrossingType.class);
	}

	public BoundaryCrossingDao getDao() {
		return dao;
	}

	public void setDao(BoundaryCrossingDao dao) {
		this.dao = dao;
	}


}
