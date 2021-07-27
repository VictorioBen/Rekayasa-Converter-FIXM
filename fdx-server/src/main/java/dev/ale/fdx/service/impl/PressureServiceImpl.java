package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.PressureDao;
import dev.ale.fdx.entity.base.PressureType;
import dev.ale.fdx.service.PressureService;

@Service
public class PressureServiceImpl extends GenericServiceImpl<PressureType, Long> implements PressureService {
	private PressureDao dao;

	@Autowired
	public PressureServiceImpl(GenericDao<PressureType, Long>genericDao) {
		super(genericDao);
		setDao((PressureDao)genericDao);
		this.dao.setEntity(PressureType.class);
	}

	public PressureDao getDao() {
		return dao;
	}

	public void setDao(PressureDao dao) {
		this.dao = dao;
	}

}
