package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.SupplementaryDatasourceDao;
import dev.ale.fdx.entity.flight.SupplementaryDataSourceType;
import dev.ale.fdx.service.SupplementaryDatasourceService;

@Service
public class SupplementaryDatasourceServiceImpl extends GenericServiceImpl<SupplementaryDataSourceType, Long> implements SupplementaryDatasourceService {

	private SupplementaryDatasourceDao dao;
	
	@Autowired
	public SupplementaryDatasourceServiceImpl(GenericDao<SupplementaryDataSourceType, Long>genericDao) {
		super(genericDao);
		setDao((SupplementaryDatasourceDao)genericDao);
		this.dao.setEntity(SupplementaryDataSourceType.class);
	}

	public SupplementaryDatasourceDao getDao() {
		return dao;
	}

	public void setDao(SupplementaryDatasourceDao dao) {
		this.dao = dao;
	}

}
