package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.NavigationCapabilitiesDao;
import dev.ale.fdx.entity.flight.NavigationCapabilitiesType;
import dev.ale.fdx.service.NavigationCapabilitiesService;

@Service
public class NavigationCapabilitiesServiceImpl extends GenericServiceImpl<NavigationCapabilitiesType, Long> implements NavigationCapabilitiesService {
	private NavigationCapabilitiesDao dao;
	
	@Autowired
	public NavigationCapabilitiesServiceImpl(GenericDao<NavigationCapabilitiesType, Long>genericDao) {
		super(genericDao);
		setDao((NavigationCapabilitiesDao)genericDao);
		this.dao.setEntity(NavigationCapabilitiesType.class);
	}

	public NavigationCapabilitiesDao getDao() {
		return dao;
	}

	public void setDao(NavigationCapabilitiesDao dao) {
		this.dao = dao;
	}

}
