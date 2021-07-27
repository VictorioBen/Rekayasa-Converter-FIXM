package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TelephoneContactDao;
import dev.ale.fdx.entity.base.TelephoneContactType;
import dev.ale.fdx.service.TelephoneContactService;

@Service
public class TelephoneContactServiceImpl extends GenericServiceImpl<TelephoneContactType, Long> implements TelephoneContactService{
	private TelephoneContactDao dao;
	
	@Autowired
	public TelephoneContactServiceImpl(GenericDao<TelephoneContactType, Long>genericDao) {
		super(genericDao);
		setDao((TelephoneContactDao)genericDao);
		this.dao.setEntity(TelephoneContactType.class);
	}

	public TelephoneContactDao getDao() {
		return dao;
	}

	public void setDao(TelephoneContactDao dao) {
		this.dao = dao;
	}

}
