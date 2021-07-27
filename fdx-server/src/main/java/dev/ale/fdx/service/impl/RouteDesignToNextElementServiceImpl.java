package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.RouteDesignToNextElementDao;
import dev.ale.fdx.entity.flight.RouteDesignatorToNextElementType;
import dev.ale.fdx.service.RouteDesignToNextElementService;

@Service
public class RouteDesignToNextElementServiceImpl extends GenericServiceImpl<RouteDesignatorToNextElementType, Long> implements RouteDesignToNextElementService {

	private RouteDesignToNextElementDao dao;
	
	@Autowired
	public RouteDesignToNextElementServiceImpl(GenericDao<RouteDesignatorToNextElementType, Long>genericDao) {
		super(genericDao);
		setDao((RouteDesignToNextElementDao)genericDao);
		this.dao.setEntity(RouteDesignatorToNextElementType.class);
	}

	public RouteDesignToNextElementDao getDao() {
		return dao;
	}

	public void setDao(RouteDesignToNextElementDao dao) {
		this.dao = dao;
	}

}
