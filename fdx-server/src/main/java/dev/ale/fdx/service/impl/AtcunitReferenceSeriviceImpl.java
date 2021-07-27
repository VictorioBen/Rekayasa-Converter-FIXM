package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AtcunitReferenceDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.AtcUnitReferenceType;
import dev.ale.fdx.service.AtcunitReferenceService;

@Service
public class AtcunitReferenceSeriviceImpl extends GenericServiceImpl<AtcUnitReferenceType, Long> implements AtcunitReferenceService {
	private AtcunitReferenceDao dao;
	
	@Autowired
	public AtcunitReferenceSeriviceImpl(GenericDao<AtcUnitReferenceType, Long>genericDao) {
		super(genericDao);
		setDao((AtcunitReferenceDao)genericDao);
		this.dao.setEntity(AtcUnitReferenceType.class);
	}

	public AtcunitReferenceDao getDao() {
		return dao;
	}

	public void setDao(AtcunitReferenceDao dao) {
		this.dao = dao;
	}

}
