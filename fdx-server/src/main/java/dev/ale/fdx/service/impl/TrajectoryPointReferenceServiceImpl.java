package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TrajectoryPointReferenceDao;
import dev.ale.fdx.entity.flight.TrajectoryPointReferenceType;
import dev.ale.fdx.service.TrajectoryPointReferenceService;

@Repository
public class TrajectoryPointReferenceServiceImpl extends GenericServiceImpl<TrajectoryPointReferenceType, Long> implements TrajectoryPointReferenceService {

	private TrajectoryPointReferenceDao dao;
	
	@Autowired
	public TrajectoryPointReferenceServiceImpl(GenericDao<TrajectoryPointReferenceType, Long>genericDao) {
		super(genericDao);
		setDao((TrajectoryPointReferenceDao)genericDao);
		this.dao.setEntity(TrajectoryPointReferenceType.class);
	}

	public TrajectoryPointReferenceDao getDao() {
		return dao;
	}

	public void setDao(TrajectoryPointReferenceDao dao) {
		this.dao = dao;
	}

}
