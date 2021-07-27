package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.MessageCollectionDao;
import dev.ale.fdx.entity.messaging.MessageCollectionType;
import dev.ale.fdx.service.MessageCollectionService;

@Service
public class MessageCollectionServiceImpl extends GenericServiceImpl<MessageCollectionType, Long> implements MessageCollectionService {

	private MessageCollectionDao dao;
	
	@Autowired
	public MessageCollectionServiceImpl(GenericDao<MessageCollectionType, Long>genericDao) {
		super(genericDao);
		setDao((MessageCollectionDao)genericDao);
		this.dao.setEntity(MessageCollectionType.class);
	}

	public MessageCollectionDao getDao() {
		return dao;
	}

	public void setDao(MessageCollectionDao dao) {
		this.dao = dao;
	}

}
