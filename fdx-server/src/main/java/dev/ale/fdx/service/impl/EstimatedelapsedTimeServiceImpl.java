package dev.ale.fdx.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.EstimatedelapsedTimeDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.EstimatedElapsedTimeType;
import dev.ale.fdx.service.EstimatedelapsedTimeService;

@Service
public class EstimatedelapsedTimeServiceImpl extends GenericServiceImpl<EstimatedElapsedTimeType, Long> implements EstimatedelapsedTimeService {
	private EstimatedelapsedTimeDao dao;
	
	@Autowired
	public EstimatedelapsedTimeServiceImpl(GenericDao<EstimatedElapsedTimeType, Long >genericDao) {
		super(genericDao);
		setDao((EstimatedelapsedTimeDao)genericDao);
		this.dao.setEntity(EstimatedElapsedTimeType.class);

	}

	public EstimatedelapsedTimeDao getDao() {
		return dao;
	}

	public void setDao(EstimatedelapsedTimeDao dao) {
		this.dao = dao;
	}


}
