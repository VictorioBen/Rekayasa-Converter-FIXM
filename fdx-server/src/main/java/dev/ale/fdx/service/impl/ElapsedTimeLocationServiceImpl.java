package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.ElapsedTimeLocationDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.ElapsedTimeLocationType;
import dev.ale.fdx.service.ElapsedTimeLocationService;

@Service
public class ElapsedTimeLocationServiceImpl extends GenericServiceImpl<ElapsedTimeLocationType, Long> implements ElapsedTimeLocationService {
	private ElapsedTimeLocationDao dao;

	@Autowired
	public ElapsedTimeLocationServiceImpl(GenericDao<ElapsedTimeLocationType, Long>genericDao) {
		super(genericDao);
		setDao((ElapsedTimeLocationDao)genericDao);
		this.dao.setEntity(ElapsedTimeLocationType.class);
	}

	public ElapsedTimeLocationDao getDao() {
		return dao;
	}

	public void setDao(ElapsedTimeLocationDao dao) {
		this.dao = dao;
	}

}
