package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.DangerousGoodsDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.DangerousGoodsType;
import dev.ale.fdx.service.DangerousGoodsService;

@Service
public class DangerousGoodsServiceImpl extends GenericServiceImpl<DangerousGoodsType, Long> implements DangerousGoodsService{

	private DangerousGoodsDao dao;

	@Autowired
	public DangerousGoodsServiceImpl(GenericDao<DangerousGoodsType, Long>genericDao) {
		super(genericDao);
		setDao((DangerousGoodsDao)genericDao);
		this.dao.setEntity(DangerousGoodsType.class);
	}

	public DangerousGoodsDao getDao() {
		return dao;
	}

	public void setDao(DangerousGoodsDao dao) {
		this.dao = dao;
	}

}
