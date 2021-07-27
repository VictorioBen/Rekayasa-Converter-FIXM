package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AngleDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.AngleType;
import dev.ale.fdx.service.AngleService;

@Service
public class AngleServiceImpl extends GenericServiceImpl<AngleType, Long> implements AngleService{
	private AngleDao dao;
	@Autowired
	public AngleServiceImpl(GenericDao<AngleType, Long>genericDao) {
		super(genericDao);
		setDao((AngleDao)genericDao);
		this.dao.setEntity(AngleType.class);
	}

	public AngleDao getDao() {
		return dao;
	}

	public void setDao(AngleDao dao) {
		this.dao = dao;
	}




}
