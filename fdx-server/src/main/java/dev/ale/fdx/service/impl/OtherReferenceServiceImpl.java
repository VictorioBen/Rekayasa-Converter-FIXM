package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.OtherReferenceDao;
import dev.ale.fdx.entity.base.OtherReferenceType;
import dev.ale.fdx.service.OtherReferenceService;

@Service
public class OtherReferenceServiceImpl extends GenericServiceImpl<OtherReferenceType, Long> implements OtherReferenceService {
	private OtherReferenceDao dao;
	
	@Autowired
	public OtherReferenceServiceImpl(GenericDao<OtherReferenceType, Long>genericDao) {
		super(genericDao);
		setDao((OtherReferenceDao)genericDao);
		this.dao.setEntity(OtherReferenceType.class);
	}

	public OtherReferenceDao getDao() {
		return dao;
	}

	public void setDao(OtherReferenceDao dao) {
		this.dao = dao;
	}

}
