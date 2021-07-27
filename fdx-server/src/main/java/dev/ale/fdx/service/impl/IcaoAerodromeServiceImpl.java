package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.IcaoAerodromeDao;
import dev.ale.fdx.entity.base.IcaoAerodromeReferenceType;
import dev.ale.fdx.service.IcaoAerodromeService;

@Service
public class IcaoAerodromeServiceImpl extends GenericServiceImpl<IcaoAerodromeReferenceType, Long> implements IcaoAerodromeService {

	private IcaoAerodromeDao dao;
	
	@Autowired
	public IcaoAerodromeServiceImpl(GenericDao<IcaoAerodromeReferenceType, Long>genericDao) {
		super(genericDao);
		setDao((IcaoAerodromeDao)genericDao);
		this.dao.setEntity(IcaoAerodromeReferenceType.class);
	}

	public IcaoAerodromeDao getDao() {
		return dao;
	}

	public void setDao(IcaoAerodromeDao dao) {
		this.dao = dao;
	}

}
