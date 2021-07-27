package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.VolumeDao;
import dev.ale.fdx.entity.base.VolumeType;
import dev.ale.fdx.service.VolumeService;

@Service
public class VolumeServiceImpl extends GenericServiceImpl<VolumeType, Long> implements VolumeService {

	private VolumeDao dao;
	
	@Autowired
	public VolumeServiceImpl(GenericDao<VolumeType, Long>genericDao) {
		super(genericDao);
		setDao((VolumeDao)genericDao);
		this.dao.setEntity(VolumeType.class);
	}

	public VolumeDao getDao() {
		return dao;
	}

	public void setDao(VolumeDao dao) {
		this.dao = dao;
	}

}
