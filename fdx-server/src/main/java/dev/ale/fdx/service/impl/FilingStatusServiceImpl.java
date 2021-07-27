package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FilingStatusDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.messaging.FilingStatusType;
import dev.ale.fdx.service.FilingStatusService;

@Repository
public class FilingStatusServiceImpl extends GenericServiceImpl<FilingStatusType, Long> implements FilingStatusService {

	private FilingStatusDao dao;
	
	@Autowired
	public FilingStatusServiceImpl(GenericDao<FilingStatusType, Long>genericDao) {
		super(genericDao);
		setDao((FilingStatusDao)genericDao);
		this.dao.setEntity(FilingStatusType.class);
	}

	public FilingStatusDao getDao() {
		return dao;
	}

	public void setDao(FilingStatusDao dao) {
		this.dao = dao;
	}

}
