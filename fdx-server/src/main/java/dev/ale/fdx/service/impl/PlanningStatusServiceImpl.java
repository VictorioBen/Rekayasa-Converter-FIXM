package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.PlanningStatusDao;
import dev.ale.fdx.entity.messaging.PlanningStatusType;
import dev.ale.fdx.service.PlanningStatusService;

@Service
public class PlanningStatusServiceImpl extends GenericServiceImpl<PlanningStatusType, Long> implements PlanningStatusService {
	private PlanningStatusDao dao;
	
	@Autowired
	public PlanningStatusServiceImpl(GenericDao<PlanningStatusType, Long>genericDao) {
		super(genericDao);
		setDao((PlanningStatusDao)genericDao);
		this.dao.setEntity(PlanningStatusType.class);
	}

	public PlanningStatusDao getDao() {
		return dao;
	}

	public void setDao(PlanningStatusDao dao) {
		this.dao = dao;
	}

}
