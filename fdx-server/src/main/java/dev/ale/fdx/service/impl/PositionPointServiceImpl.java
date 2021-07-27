package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.PositionPointDao;
import dev.ale.fdx.entity.base.PositionPointType;
import dev.ale.fdx.service.PositionPointService;

@Service
public class PositionPointServiceImpl extends GenericServiceImpl<PositionPointType, Long> implements PositionPointService{

	private PositionPointDao dao;

	@Autowired
	public PositionPointServiceImpl(GenericDao<PositionPointType, Long>genericDao) {
		super(genericDao);
		setDao((PositionPointDao)genericDao);
		this.dao.setEntity(PositionPointType.class);
	}

	public PositionPointDao getDao() {
		return dao;
	}

	public void setDao(PositionPointDao dao) {
		this.dao = dao;
	}

}
