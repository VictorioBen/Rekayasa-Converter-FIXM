package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.ShippingInformationDao;
import dev.ale.fdx.entity.flight.ShippingInformationType;
import dev.ale.fdx.service.ShippingInformationService;

@Service
public class ShippingInformationServiceImpl extends GenericServiceImpl<ShippingInformationType, Long> implements ShippingInformationService {
	private ShippingInformationDao dao;
	
	@Autowired
	public ShippingInformationServiceImpl(GenericDao<ShippingInformationType, Long>genericDao) {

		super(genericDao);
		setDao((ShippingInformationDao)genericDao);
		this.dao.setEntity(ShippingInformationType.class);
	}

	public ShippingInformationDao getDao() {
		return dao;
	}

	public void setDao(ShippingInformationDao dao) {
		this.dao = dao;
	}

}
