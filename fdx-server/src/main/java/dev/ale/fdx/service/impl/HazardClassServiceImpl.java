package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.HazardClassDao;
import dev.ale.fdx.entity.flight.HazardClassType;
import dev.ale.fdx.service.HazardClassService;

@Service
public class HazardClassServiceImpl extends GenericServiceImpl<HazardClassType, Long> implements HazardClassService {
	private HazardClassDao dao;
	
	@Autowired
	public HazardClassServiceImpl(GenericDao<HazardClassType, Long>genericDao) {
		super(genericDao);
		setDao((HazardClassDao)genericDao);
		this.dao.setEntity(HazardClassType.class);
	}

	public HazardClassDao getDao() {
		return dao;
	}

	public void setDao(HazardClassDao dao) {
		this.dao = dao;
	}


}
