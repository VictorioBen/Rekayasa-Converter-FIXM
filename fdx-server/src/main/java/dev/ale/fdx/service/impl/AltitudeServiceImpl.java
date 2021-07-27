package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AltitudeDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.AltitudeType;
import dev.ale.fdx.service.AltitudeService;

@Service
public class AltitudeServiceImpl extends GenericServiceImpl<AltitudeType, Long> implements AltitudeService {
	private AltitudeDao dao;
	@Autowired
	public AltitudeServiceImpl(GenericDao<AltitudeType, Long>genericDao){
		super(genericDao);
		setDao((AltitudeDao)genericDao);
		this.dao.setEntity(AltitudeType.class);
	}

	public AltitudeDao getDao() {
		return dao;
	}

	public void setDao(AltitudeDao dao) {
		this.dao = dao;
	}




}
