package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AltitudeIntransitionDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.AltitudeInTransitionType;
import dev.ale.fdx.service.AltitudeIntransitionService;

@Service
public class AltitudeIntransitionServiceImpl extends GenericServiceImpl<AltitudeInTransitionType, Long> implements AltitudeIntransitionService {
	private AltitudeIntransitionDao dao;
	@Autowired
	public AltitudeIntransitionServiceImpl(GenericDao<AltitudeInTransitionType, Long>genericDao) {
		super(genericDao);
		setDao((AltitudeIntransitionDao)genericDao);
		this.dao.setEntity(AltitudeInTransitionType.class);
	}

	public AltitudeIntransitionDao getDao() {
		return dao;
	}

	public void setDao(AltitudeIntransitionDao dao) {
		this.dao = dao;
	}



}
