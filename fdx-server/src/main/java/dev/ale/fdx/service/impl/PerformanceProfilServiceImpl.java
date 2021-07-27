package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.PerformanceProfilDao;
import dev.ale.fdx.entity.flight.PerformanceProfileType;
import dev.ale.fdx.service.PerformanceProfilService;

@Service
public class PerformanceProfilServiceImpl extends GenericServiceImpl<PerformanceProfileType, Long> implements PerformanceProfilService {

	private PerformanceProfilDao dao;

	@Autowired
	public PerformanceProfilServiceImpl(GenericDao<PerformanceProfileType, Long>genericDao) {
		super(genericDao);
		setDao((PerformanceProfilDao)genericDao);
		this.dao.setEntity(PerformanceProfileType.class);
	}

	public PerformanceProfilDao getDao() {
		return dao;
	}

	public void setDao(PerformanceProfilDao dao) {
		this.dao = dao;
	}

}
