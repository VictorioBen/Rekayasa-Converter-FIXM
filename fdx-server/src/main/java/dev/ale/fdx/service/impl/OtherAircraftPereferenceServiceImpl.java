package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.OtherAircraftPereferenceDao;
import dev.ale.fdx.entity.flight.OtherAircraftTypeReferenceType;
import dev.ale.fdx.service.OtherAircraftPereferenceService;

@Service
public class OtherAircraftPereferenceServiceImpl extends GenericServiceImpl<OtherAircraftTypeReferenceType, Long> implements OtherAircraftPereferenceService{
	private OtherAircraftPereferenceDao dao;
	
	@Autowired
	public OtherAircraftPereferenceServiceImpl(GenericDao<OtherAircraftTypeReferenceType, Long>genericDao) {
		super(genericDao);
		setDao((OtherAircraftPereferenceDao)genericDao);
		this.dao.setEntity(OtherAircraftTypeReferenceType.class);
	}

	public OtherAircraftPereferenceDao getDao() {
		return dao;
	}

	public void setDao(OtherAircraftPereferenceDao dao) {
		this.dao = dao;
	}

}
