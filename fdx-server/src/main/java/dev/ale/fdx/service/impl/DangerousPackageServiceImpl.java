package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DangerousPackageDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.DangerousGoodsPackageType;
import dev.ale.fdx.service.DangerousPackageService;

@Repository
public class DangerousPackageServiceImpl extends GenericServiceImpl<DangerousGoodsPackageType, Long> implements DangerousPackageService{

	private DangerousPackageDao dao;
	
	@Autowired
	public DangerousPackageServiceImpl(GenericDao<DangerousGoodsPackageType, Long>genericDao) {
		super(genericDao);
		setDao((DangerousPackageDao)genericDao);
		this.dao.setEntity(DangerousGoodsPackageType.class);

	}

	public DangerousPackageDao getDao() {
		return dao;
	}

	public void setDao(DangerousPackageDao dao) {
		this.dao = dao;
	}

}
