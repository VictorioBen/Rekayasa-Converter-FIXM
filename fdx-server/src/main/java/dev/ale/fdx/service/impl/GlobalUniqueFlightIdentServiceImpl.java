package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.GlobalUniqueFlightIdentDao;
import dev.ale.fdx.entity.base.GloballyUniqueFlightIdentifierType;
import dev.ale.fdx.service.GlobalUniqueFlightIdentService;

@Service
public class GlobalUniqueFlightIdentServiceImpl extends GenericServiceImpl<GloballyUniqueFlightIdentifierType, Long> implements GlobalUniqueFlightIdentService {

	private GlobalUniqueFlightIdentDao dao;

	@Autowired
	public GlobalUniqueFlightIdentServiceImpl(GenericDao<GloballyUniqueFlightIdentifierType, Long>genericDao) {

		super(genericDao);
		setDao((GlobalUniqueFlightIdentDao)genericDao);
		this.dao.setEntity(GloballyUniqueFlightIdentifierType.class);

	}

	public GlobalUniqueFlightIdentDao getDao() {
		return dao;
	}

	public void setDao(GlobalUniqueFlightIdentDao dao) {
		this.dao = dao;
	}

}
