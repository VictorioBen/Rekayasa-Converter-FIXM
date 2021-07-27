package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.RadioActiveMaterialDao;
import dev.ale.fdx.entity.flight.RadioactiveMaterialType;
import dev.ale.fdx.service.RadioActiveMaterialService;

@Service
public class RadioActiveMaterialServiceImpl extends GenericServiceImpl<RadioactiveMaterialType, Long> implements RadioActiveMaterialService {
	private RadioActiveMaterialDao dao;

	@Autowired
	public RadioActiveMaterialServiceImpl(GenericDao<RadioactiveMaterialType, Long>genericDao) {
		super(genericDao);
		setDao((RadioActiveMaterialDao)genericDao);
		this.dao.setEntity(RadioactiveMaterialType.class);
	}

	public RadioActiveMaterialDao getDao() {
		return dao;
	}

	public void setDao(RadioActiveMaterialDao dao) {
		this.dao = dao;
	}

}
