package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.TrueAirSpeedChoiceDao;
import dev.ale.fdx.entity.base.TrueAirspeedChoiceType;
import dev.ale.fdx.service.TrueAirSpeedChoiceService;

@Service
public class TrueAirSpeedChoiceServiceImpl extends GenericServiceImpl<TrueAirspeedChoiceType, Long> implements TrueAirSpeedChoiceService {

	private TrueAirSpeedChoiceDao dao;
	
	@Autowired
	public TrueAirSpeedChoiceServiceImpl(GenericDao<TrueAirspeedChoiceType, Long>genericDao) {
		super(genericDao);
		setDao((TrueAirSpeedChoiceDao)genericDao);
		this.dao.setEntity(TrueAirspeedChoiceType.class);
	}

	public TrueAirSpeedChoiceDao getDao() {
		return dao;
	}

	public void setDao(TrueAirSpeedChoiceDao dao) {
		this.dao = dao;
	}

}
