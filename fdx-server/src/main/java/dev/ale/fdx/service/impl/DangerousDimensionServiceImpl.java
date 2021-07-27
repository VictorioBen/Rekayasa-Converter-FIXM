package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.DangerousDimensionDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.DangerousGoodsDimensionsType;
import dev.ale.fdx.service.DangerousDimensionService;
import dev.ale.fdx.service.DangerousGoodsService;

@Service
public class DangerousDimensionServiceImpl extends GenericServiceImpl<DangerousGoodsDimensionsType, Long> implements DangerousDimensionService {
	private DangerousDimensionDao dao;
	
	@Autowired
	public DangerousDimensionServiceImpl(GenericDao<DangerousGoodsDimensionsType, Long>genericDao) {
		super(genericDao);
		setDao((DangerousDimensionDao)genericDao);
		this.dao.setEntity(DangerousGoodsDimensionsType.class);
	}

	public DangerousDimensionDao getDao() {
		return dao;
	}

	public void setDao(DangerousDimensionDao dao) {
		this.dao = dao;
	}



}
