package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.SidstarabBreviatedDesingDao;
import dev.ale.fdx.entity.flight.SidStarAbbreviatedDesignatorToNextElementType;
import dev.ale.fdx.service.SidstarabBreviatedDesingService;

@Repository
public class SidstarabBreviatedDesingServiceImpl extends GenericServiceImpl<SidStarAbbreviatedDesignatorToNextElementType, Long> implements SidstarabBreviatedDesingService {

	private SidstarabBreviatedDesingDao dao;

	@Autowired
	public SidstarabBreviatedDesingServiceImpl(GenericDao<SidStarAbbreviatedDesignatorToNextElementType, Long>genericDao) {

		super(genericDao);
		setDao((SidstarabBreviatedDesingDao)genericDao);
		this.dao.setEntity(SidStarAbbreviatedDesignatorToNextElementType.class);
	}

	public SidstarabBreviatedDesingDao getDao() {
		return dao;
	}

	public void setDao(SidstarabBreviatedDesingDao dao) {
		this.dao = dao;
	}

}
