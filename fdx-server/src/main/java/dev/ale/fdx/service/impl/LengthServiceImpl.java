package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.LengthDao;
import dev.ale.fdx.entity.base.LengthType;
import dev.ale.fdx.service.LengthService;

@Service
public class LengthServiceImpl extends GenericServiceImpl<LengthType, Long> implements LengthService {
	private LengthDao dao;
	
	@Autowired
	public LengthServiceImpl(GenericDao<LengthType, Long>genericDao) {
		super(genericDao);
		setDao((LengthDao)genericDao);
		this.dao.setEntity(LengthType.class);

	}

	public LengthDao getDao() {
		return dao;
	}

	public void setDao(LengthDao dao) {
		this.dao = dao;
	}

}
