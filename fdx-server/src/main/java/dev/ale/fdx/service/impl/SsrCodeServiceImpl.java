package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.SsrCodeDao;
import dev.ale.fdx.entity.base.SsrCodeType;
import dev.ale.fdx.service.SsrCodeService;

@Repository
public class SsrCodeServiceImpl extends GenericServiceImpl<SsrCodeType, Long> implements SsrCodeService {

	private SsrCodeDao dao;
	
	@Autowired
	public SsrCodeServiceImpl(GenericDao<SsrCodeType, Long>genericDao) {
		super(genericDao);
		setDao((SsrCodeDao)genericDao);
		this.dao.setEntity(SsrCodeType.class);
	}

	public SsrCodeDao getDao() {
		return dao;
	}

	public void setDao(SsrCodeDao dao) {
		this.dao = dao;
	}

}
