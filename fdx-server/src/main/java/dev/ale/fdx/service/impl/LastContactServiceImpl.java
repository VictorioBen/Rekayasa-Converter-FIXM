package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.LastContactDao;
import dev.ale.fdx.entity.flight.LastContactType;
import dev.ale.fdx.service.LastContactService;

@Service
public class LastContactServiceImpl extends GenericServiceImpl<LastContactType, Long> implements LastContactService {

	private LastContactDao dao;
	
	@Autowired
	public LastContactServiceImpl(GenericDao<LastContactType, Long>genericDao) {
		super(genericDao);
		setDao((LastContactDao)genericDao);
		this.dao.setEntity(LastContactType.class);
	}

	public LastContactDao getDao() {
		return dao;
	}

	public void setDao(LastContactDao dao) {
		this.dao = dao;
	}

}
