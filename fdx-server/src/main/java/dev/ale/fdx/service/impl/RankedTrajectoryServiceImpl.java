package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.RankedTrajectoryDao;
import dev.ale.fdx.entity.flight.RankedTrajectoryType;
import dev.ale.fdx.service.RankedTrajectoryService;

@Service
public class RankedTrajectoryServiceImpl extends GenericServiceImpl<RankedTrajectoryType, Long>implements RankedTrajectoryService{
	private RankedTrajectoryDao dao;
	
	@Autowired
	public RankedTrajectoryServiceImpl(GenericDao<RankedTrajectoryType, Long>genericDao) {
		super(genericDao);
		setDao((RankedTrajectoryDao)genericDao);
		this.dao.setEntity(RankedTrajectoryType.class);
	}

	public RankedTrajectoryDao getDao() {
		return dao;
	}

	public void setDao(RankedTrajectoryDao dao) {
		this.dao = dao;
	}
}

