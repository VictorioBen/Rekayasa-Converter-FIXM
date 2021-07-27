package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.MeteorologicalDataDao;
import dev.ale.fdx.entity.flight.MeteorologicalDataType;
import dev.ale.fdx.service.MeteorologicalDataService;

@Service
public class MeteorologicalDataServiceImpl extends GenericServiceImpl<MeteorologicalDataType, Long> implements MeteorologicalDataService {
	private MeteorologicalDataDao dao;
	
	@Autowired
	public MeteorologicalDataServiceImpl(GenericDao<MeteorologicalDataType, Long>genericDao) {
		super(genericDao);
		setDao((MeteorologicalDataDao)genericDao);
		this.dao.setEntity(MeteorologicalDataType.class);
	}

	public MeteorologicalDataDao getDao() {
		return dao;
	}

	public void setDao(MeteorologicalDataDao dao) {
		this.dao = dao;
	}

}
