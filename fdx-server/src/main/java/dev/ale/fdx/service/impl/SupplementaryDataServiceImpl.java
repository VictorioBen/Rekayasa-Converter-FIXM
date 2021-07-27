package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.SupplementaryDataDao;
import dev.ale.fdx.entity.flight.SupplementaryDataType;
import dev.ale.fdx.service.SupplementaryDataService;

@Service
public class SupplementaryDataServiceImpl extends GenericServiceImpl<SupplementaryDataType, Long> implements SupplementaryDataService {
	SupplementaryDataDao dao;

	@Autowired
	public SupplementaryDataServiceImpl(GenericDao<SupplementaryDataType, Long>genericDao) {
		super(genericDao);
		setDao((SupplementaryDataDao)genericDao);
		this.dao.setEntity(SupplementaryDataType.class);
	}

	public SupplementaryDataDao getDao() {
		return dao;
	}

	public void setDao(SupplementaryDataDao dao) {
		this.dao = dao;
	}

}
