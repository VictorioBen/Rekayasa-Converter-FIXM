package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.BearingDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.BearingType;
import dev.ale.fdx.service.BearingService;

@Service
public class BearingServiceImpl extends GenericServiceImpl<BearingType, Long> implements BearingService {

	private BearingDao dao;
	@Autowired
	public BearingServiceImpl(GenericDao<BearingType, Long>genericDao) {
		super(genericDao);
		setDao((BearingDao)genericDao);
		this.dao.setEntity(BearingType.class);

	}


	public BearingDao getDao() {
		return dao;
	}

	public void setDao(BearingDao dao) {
		this.dao = dao;
	}


}
