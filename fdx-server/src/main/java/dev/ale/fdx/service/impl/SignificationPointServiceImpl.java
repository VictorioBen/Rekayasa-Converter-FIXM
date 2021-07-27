package dev.ale.fdx.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.SignificationPointDao;
import dev.ale.fdx.entity.base.SignificantPointType;
import dev.ale.fdx.service.SignificationPointService;

@Service
public class SignificationPointServiceImpl extends GenericServiceImpl<SignificantPointType, Long>implements SignificationPointService {
	private SignificationPointDao dao;
	
	@Autowired
	public SignificationPointServiceImpl(GenericDao<SignificantPointType, Long>genericDao) {
		super(genericDao);
		setDao((SignificationPointDao)genericDao);
		this.dao.setEntity(SignificantPointType.class);

	}

	public SignificationPointDao getDao() {
		return dao;
	}

	public void setDao(SignificationPointDao dao) {
		this.dao = dao;
	}

}
