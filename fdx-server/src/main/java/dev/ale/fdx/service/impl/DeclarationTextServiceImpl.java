package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.DeclarationTextDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.DeclarationTextType;
import dev.ale.fdx.service.DeclarationTextService;

@Service
public class DeclarationTextServiceImpl extends GenericServiceImpl<DeclarationTextType, Long> implements DeclarationTextService {

	private DeclarationTextDao dao;
	
	@Autowired
	public DeclarationTextServiceImpl(GenericDao<DeclarationTextType, Long>genericDao) {
		super(genericDao);
		setDao((DeclarationTextDao)genericDao);
		this.dao.setEntity(DeclarationTextType.class);

	}

	public DeclarationTextDao getDao() {
		return dao;
	}

	public void setDao(DeclarationTextDao dao) {
		this.dao = dao;
	}



}
