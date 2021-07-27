package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.RouteTrajectoryDao;
import dev.ale.fdx.entity.flight.RouteTrajectoryType;
import dev.ale.fdx.service.RouteTrajectoryService;

@Service
public class RouteTrajectoryServiceImpl extends GenericServiceImpl<RouteTrajectoryType, Long> implements RouteTrajectoryService {

	private RouteTrajectoryDao dao;
	
	@Autowired
	public RouteTrajectoryServiceImpl(GenericDao<RouteTrajectoryType, Long>genericDao) {
		super(genericDao);
		setDao((RouteTrajectoryDao)genericDao);
		this.dao.setEntity(RouteTrajectoryType.class);
	}

	public RouteTrajectoryDao getDao() {
		return dao;
	}

	public void setDao(RouteTrajectoryDao dao) {
		this.dao = dao;
	}

}
