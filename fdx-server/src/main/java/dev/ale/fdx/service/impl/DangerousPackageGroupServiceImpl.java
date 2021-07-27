package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.DangerousPackageGroupDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.DangerousGoodsPackageGroupType;
import dev.ale.fdx.service.DangerousPackageGroupService;

@Service
public class DangerousPackageGroupServiceImpl extends GenericServiceImpl<DangerousGoodsPackageGroupType, Long> implements DangerousPackageGroupService {

	private DangerousPackageGroupDao dao;
	
	@Autowired
	public DangerousPackageGroupServiceImpl(GenericDao<DangerousGoodsPackageGroupType, Long>genericDao) {
		super(genericDao);
		setDao((DangerousPackageGroupDao)genericDao);
		this.dao.setEntity(DangerousGoodsPackageGroupType.class);
	}

	public DangerousPackageGroupDao getDao() {
		return dao;
	}

	public void setDao(DangerousPackageGroupDao dao) {
		this.dao = dao;
	}

}

