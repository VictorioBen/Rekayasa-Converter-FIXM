package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AdditionalHandlingDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.AdditionalHandlingInformationType;
import dev.ale.fdx.service.AdditionalHandlingService;

@Service
public class AdditionalHandlingServiceImpl extends GenericServiceImpl<AdditionalHandlingInformationType, Long> implements AdditionalHandlingService {
	private AdditionalHandlingDao dao;
	@Autowired
	public AdditionalHandlingServiceImpl(GenericDao<AdditionalHandlingInformationType, Long>genericDao) {
		super(genericDao);
		setDao((AdditionalHandlingDao)genericDao);
		this.dao.setEntity(AdditionalHandlingInformationType.class);

	}

	public AdditionalHandlingDao getDao() {
		return dao;
	}

	public void setDao(AdditionalHandlingDao dao) {
		this.dao = dao;
	}




}
