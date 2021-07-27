package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.ContactInformationDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.ContactInformationType;
import dev.ale.fdx.service.ContactInformationService;

@Service
public class ContactInformationServiceImpl extends GenericServiceImpl<ContactInformationType, Long> implements ContactInformationService{

	private ContactInformationDao dao;
	@Autowired
	public ContactInformationServiceImpl(GenericDao<ContactInformationType, Long>genericDao) {
		super(genericDao);
		setDao((ContactInformationDao)genericDao);
		this.dao.setEntity(ContactInformationType.class);
	}

	public ContactInformationDao getDao() {
		return dao;
	}

	public void setDao(ContactInformationDao dao) {
		this.dao = dao;
	}

}
