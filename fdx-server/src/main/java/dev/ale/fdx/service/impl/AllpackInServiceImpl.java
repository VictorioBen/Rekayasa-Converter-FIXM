package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AllpackedInOneDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.AllPackedInOneType;
import dev.ale.fdx.service.AllpackInService;

@Service
public class AllpackInServiceImpl extends GenericServiceImpl<AllPackedInOneType, Long> implements AllpackInService{
	private AllpackedInOneDao dao;
	@Autowired
	public AllpackInServiceImpl(GenericDao<AllPackedInOneType, Long>genericDao) {
		super(genericDao);
		setDao((AllpackedInOneDao)genericDao);
		this.dao.setEntity(AllPackedInOneType.class);

	}

	public AllpackedInOneDao getDao() {
		return dao;
	}

	public void setDao(AllpackedInOneDao dao) {
		this.dao = dao;
	}




}
