package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.OtherUnitReferenceDao;
import dev.ale.fdx.entity.base.OtherUnitReferenceType;
import dev.ale.fdx.service.OtherUnitReferenceService;

@Service
public class OtherUnitReferenceServiceImpl extends GenericServiceImpl<OtherUnitReferenceType, Long> implements OtherUnitReferenceService {
	private OtherUnitReferenceDao dao;
	
	@Autowired
	public OtherUnitReferenceServiceImpl(GenericDao<OtherUnitReferenceType, Long>genericDao) {
		super(genericDao);
		setDao((OtherUnitReferenceDao)genericDao);
		this.dao.setEntity(OtherUnitReferenceType.class);
	}

	public OtherUnitReferenceDao getDao() {
		return dao;
	}

	public void setDao(OtherUnitReferenceDao dao) {
		this.dao = dao;
	}

}
