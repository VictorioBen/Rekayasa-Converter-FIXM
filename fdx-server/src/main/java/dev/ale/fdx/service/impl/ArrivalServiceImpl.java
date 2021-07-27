package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.ArrivalDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.ArrivalType;
import dev.ale.fdx.service.ArrivalService;

@Service
public class ArrivalServiceImpl extends GenericServiceImpl<ArrivalType, Long> implements ArrivalService{

	private ArrivalDao dao;

	@Autowired
	public ArrivalServiceImpl(GenericDao<ArrivalType, Long> genericDao) {
		super(genericDao);
		setDao((ArrivalDao) genericDao);
		this.dao.setEntity(ArrivalType.class);
	}

	public ArrivalDao getDao() {
		return dao;
	}

	public void setDao(ArrivalDao dao) {
		this.dao = dao;
	}


}
