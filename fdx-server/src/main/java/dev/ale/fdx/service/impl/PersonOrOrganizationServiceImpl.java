package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.PersonOrOrganizationDao;
import dev.ale.fdx.entity.base.PersonOrOrganizationType;
import dev.ale.fdx.service.PersonOrOrganizationService;

@Service
public class PersonOrOrganizationServiceImpl extends GenericServiceImpl<PersonOrOrganizationType, Long> implements PersonOrOrganizationService{
	private PersonOrOrganizationDao dao;

	@Autowired
	public PersonOrOrganizationServiceImpl(GenericDao<PersonOrOrganizationType, Long>genericDao) {
		super(genericDao);
		setDao((PersonOrOrganizationDao)genericDao);
		this.dao.setEntity(PersonOrOrganizationType.class);

	}

	public PersonOrOrganizationDao getDao() {
		return dao;
	}

	public void setDao(PersonOrOrganizationDao dao) {
		this.dao = dao;
	}

}
