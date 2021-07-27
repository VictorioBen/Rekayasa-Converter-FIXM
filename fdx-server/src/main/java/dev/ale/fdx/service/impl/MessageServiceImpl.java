package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.MessageDao;
import dev.ale.fdx.entity.messaging.MessageType;
import dev.ale.fdx.service.MessageService;

@Service
public class MessageServiceImpl extends GenericServiceImpl<MessageType, Long> implements MessageService {
	private MessageDao dao;
	
	@Autowired
	public MessageServiceImpl(GenericDao<MessageType, Long>genericDao) {
		super(genericDao);
		setDao((MessageDao)genericDao);
		this.dao.setEntity(MessageType.class);
	}

	public MessageDao getDao() {
		return dao;
	}

	public void setDao(MessageDao dao) {
		this.dao = dao;
	}

}
