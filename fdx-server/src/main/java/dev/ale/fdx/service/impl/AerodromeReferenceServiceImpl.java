package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AerodromeReferenceDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.AerodromeReferenceType;
import dev.ale.fdx.service.AerodromeReferenceService;

@Service
public class AerodromeReferenceServiceImpl extends GenericServiceImpl<AerodromeReferenceType, Long>implements AerodromeReferenceService {
	private AerodromeReferenceDao dao;

	@Autowired
	public AerodromeReferenceServiceImpl(GenericDao<AerodromeReferenceType, Long>genericDao) {
		super(genericDao);
		setDao((AerodromeReferenceDao)genericDao);
		this.dao.setEntity(AerodromeReferenceType.class);

	}


	public AerodromeReferenceDao getDao() {
		return dao;
	}

	public void setDao(AerodromeReferenceDao dao) {
		this.dao = dao;
	}




}
