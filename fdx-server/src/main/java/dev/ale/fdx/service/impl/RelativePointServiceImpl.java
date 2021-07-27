package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.RelativePointDao;
import dev.ale.fdx.entity.base.RelativePointType;
import dev.ale.fdx.service.RelativePointService;

@Service
public class RelativePointServiceImpl extends GenericServiceImpl<RelativePointType, Long> implements RelativePointService {

	private RelativePointDao dao;

	@Autowired
	public RelativePointServiceImpl(GenericDao<RelativePointType, Long>genericDao) {

		super(genericDao);
		setDao((RelativePointDao)genericDao);
		this.dao.setEntity(RelativePointType.class);
	}

	public RelativePointDao getDao() {
		return dao;
	}

	public void setDao(RelativePointDao dao) {
		this.dao = dao;
	}

}
