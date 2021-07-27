package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.VerticalRateDao;
import dev.ale.fdx.entity.base.VerticalRateType;
import dev.ale.fdx.service.VerticalRateService;

@Service
public class VerticalRateServiceImpl extends GenericServiceImpl<VerticalRateType, Long>  implements VerticalRateService{

	private VerticalRateDao dao;
	
	@Autowired
	public VerticalRateServiceImpl(GenericDao<VerticalRateType, Long>genericDao) {
		super(genericDao);
		setDao((VerticalRateDao)genericDao);
		this.dao.setEntity(VerticalRateType.class);
	}

	public VerticalRateDao getDao() {
		return dao;
	}

	public void setDao(VerticalRateDao dao) {
		this.dao = dao;
	}

}
