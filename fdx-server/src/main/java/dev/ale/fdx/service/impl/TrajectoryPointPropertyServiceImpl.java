package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TrajectoryPointPropertyDao;
import dev.ale.fdx.entity.flight.TrajectoryPointPropertyType;
import dev.ale.fdx.service.TrajectoryPointPropertyService;

@Service
public class TrajectoryPointPropertyServiceImpl extends GenericServiceImpl<TrajectoryPointPropertyType, Long> implements TrajectoryPointPropertyService {

	private TrajectoryPointPropertyDao dao;
	
	@Autowired
	public TrajectoryPointPropertyServiceImpl(GenericDao<TrajectoryPointPropertyType, Long>genericDao) {
		super(genericDao);
		setDao((TrajectoryPointPropertyDao)genericDao);
		this.dao.setEntity(TrajectoryPointPropertyType.class);
	}

	public TrajectoryPointPropertyDao getDao() {
		return dao;
	}

	public void setDao(TrajectoryPointPropertyDao dao) {
		this.dao = dao;
	}

}
