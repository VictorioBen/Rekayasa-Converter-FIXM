package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.AirwayBillDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.flight.AirWaybillType;
import dev.ale.fdx.service.AirwayBillService;

@Service
public class AirwayBillServiceImpl extends GenericServiceImpl<AirWaybillType, Long> implements AirwayBillService {

	private AirwayBillDao dao;

	@Autowired
	public AirwayBillServiceImpl(GenericDao<AirWaybillType, Long>genericDao) {

		super(genericDao);
		setDao((AirwayBillDao)genericDao);
		this.dao.setEntity(AirWaybillType.class);

	}

	public AirwayBillDao getDao() {
		return dao;
	}

	public void setDao(AirwayBillDao dao) {
		this.dao = dao;
	}


}
