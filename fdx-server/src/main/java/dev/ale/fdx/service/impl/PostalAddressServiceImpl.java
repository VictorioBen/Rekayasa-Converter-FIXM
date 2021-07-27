package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.PostalAddressDao;
import dev.ale.fdx.entity.base.PostalAddressType;
import dev.ale.fdx.service.PostalAddressService;

@Service
public class PostalAddressServiceImpl extends GenericServiceImpl<PostalAddressType, Long> implements PostalAddressService{
	private PostalAddressDao dao;
	
	@Autowired
	public PostalAddressServiceImpl(GenericDao<PostalAddressType, Long>genericDao) {
		super(genericDao);
		setDao((PostalAddressDao)genericDao);
		this.dao.setEntity(PostalAddressType.class);
	}

	public PostalAddressDao getDao() {
		return dao;
	}

	public void setDao(PostalAddressDao dao) {
		this.dao = dao;
	}

}
