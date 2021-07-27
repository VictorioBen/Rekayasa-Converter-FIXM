package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.ProfilePointDao;
import dev.ale.fdx.entity.flight.ProfilePointType;
import dev.ale.fdx.service.ProfilePointService;

@Service
public class ProfilePointServiceImpl extends GenericServiceImpl<ProfilePointType, Long> implements ProfilePointService {
	private ProfilePointDao dao;
	
	@Autowired
	public ProfilePointServiceImpl(GenericDao<ProfilePointType, Long>genericDao) {
		super(genericDao);
		setDao((ProfilePointDao)genericDao);
		this.dao.setEntity(ProfilePointType.class);
	}

	public ProfilePointDao getDao() {
		return dao;
	}

	public void setDao(ProfilePointDao dao) {
		this.dao = dao;
	}

}
