package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.OnlineContactDao;
import dev.ale.fdx.entity.base.OnlineContactType;
import dev.ale.fdx.service.OnlineContactService;

@Service
public class OnlineContactServiceImpl extends GenericServiceImpl<OnlineContactType, Long> implements OnlineContactService {

	private OnlineContactDao dao;
	
	@Autowired
	public OnlineContactServiceImpl(GenericDao<OnlineContactType, Long>genericDao) {
		super(genericDao);
		setDao((OnlineContactDao)genericDao);
		this.dao.setEntity(OnlineContactType.class);			
	}

	public OnlineContactDao getDao() {
		return dao;
	}

	public void setDao(OnlineContactDao dao) {
		this.dao = dao;
	}

}
