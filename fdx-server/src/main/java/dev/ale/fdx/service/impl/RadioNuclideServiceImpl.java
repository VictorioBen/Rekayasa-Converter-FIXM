package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.RadioNuclideDao;
import dev.ale.fdx.entity.flight.RadionuclideType;
import dev.ale.fdx.service.RadioNuclideService;

@Service
public class RadioNuclideServiceImpl extends GenericServiceImpl<RadionuclideType, Long> implements RadioNuclideService {
	private RadioNuclideDao dao;
	
	@Autowired
	public RadioNuclideServiceImpl(GenericDao<RadionuclideType, Long>genericDao) {	
		super(genericDao);
		setDao((RadioNuclideDao)genericDao);
		this.dao.setEntity(RadionuclideType.class);
	}

	public RadioNuclideDao getDao() {
		return dao;
	}

	public void setDao(RadioNuclideDao dao) {
		this.dao = dao;
	}

}
