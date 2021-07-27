package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.ColourCodeDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.ColourCodeType;
import dev.ale.fdx.service.ColourCodeService;

@Service
public class ColourCodeServiceImpl extends GenericServiceImpl<ColourCodeType, Long> implements ColourCodeService {

	private ColourCodeDao dao;
	@Autowired
	public ColourCodeServiceImpl(GenericDao<ColourCodeType, Long>genericDao) {
		super(genericDao);
		setDao((ColourCodeDao)genericDao);
		this.dao.setEntity(ColourCodeType.class);
	}

	public ColourCodeDao getDao() {
		return dao;
	}

	public void setDao(ColourCodeDao dao) {
		this.dao = dao;
	}
}
