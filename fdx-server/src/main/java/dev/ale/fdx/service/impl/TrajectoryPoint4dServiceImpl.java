package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TrajectoryPoint4dDao;
import dev.ale.fdx.entity.flight.TrajectoryPoint4DType;
import dev.ale.fdx.service.TrajectoryPoint4dService;

@Service
public class TrajectoryPoint4dServiceImpl extends GenericServiceImpl<TrajectoryPoint4DType, Long> implements TrajectoryPoint4dService{

	private TrajectoryPoint4dDao dao;
	
	@Autowired
	public TrajectoryPoint4dServiceImpl(GenericDao<TrajectoryPoint4DType, Long>genericDao) {
		super(genericDao);
		setDao((TrajectoryPoint4dDao)genericDao);
		this.dao.setEntity(TrajectoryPoint4DType.class);
	}

	public TrajectoryPoint4dDao getDao() {
		return dao;
	}

	public void setDao(TrajectoryPoint4dDao dao) {
		this.dao = dao;
	}

}
