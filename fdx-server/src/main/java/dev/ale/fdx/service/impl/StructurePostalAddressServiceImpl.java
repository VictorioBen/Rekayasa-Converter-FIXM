package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.StructurePostalAddressDao;
import dev.ale.fdx.entity.flight.StructuredPostalAddressType;
import dev.ale.fdx.service.StructurePostalAddressService;

@Service
public class StructurePostalAddressServiceImpl extends GenericServiceImpl<StructuredPostalAddressType, Long> implements StructurePostalAddressService {

	private StructurePostalAddressDao dao;
	
	@Autowired
	public StructurePostalAddressServiceImpl(GenericDao<StructuredPostalAddressType, Long>genericDao) {
		super(genericDao);
		setDao((StructurePostalAddressDao)genericDao);
		this.dao.setEntity(StructuredPostalAddressType.class);
	}

	public StructurePostalAddressDao getDao() {
		return dao;
	}

	public void setDao(StructurePostalAddressDao dao) {
		this.dao = dao;
	}

}
