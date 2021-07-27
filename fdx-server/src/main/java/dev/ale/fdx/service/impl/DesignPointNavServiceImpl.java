package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.DesignPointNavDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.DesignatedPointOrNavaidType;
import dev.ale.fdx.service.DesignPointNavService;

@Service
public class DesignPointNavServiceImpl extends GenericServiceImpl<DesignatedPointOrNavaidType, Long> implements DesignPointNavService {

	private DesignPointNavDao dao;
	@Autowired
	public DesignPointNavServiceImpl(GenericDao<DesignatedPointOrNavaidType, Long>genericDao) {
		super(genericDao);
		setDao((DesignPointNavDao)genericDao);
		this.dao.setEntity(DesignatedPointOrNavaidType.class);

	}

	public DesignPointNavDao getDao() {
		return dao;
	}

	public void setDao(DesignPointNavDao dao) {
		this.dao = dao;
	}

}
	