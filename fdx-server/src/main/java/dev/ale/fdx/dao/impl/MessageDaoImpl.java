package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.MessageDao;
import dev.ale.fdx.entity.messaging.MessageType;

@Repository
public class MessageDaoImpl extends GenericDaoImpl<MessageType, Long> implements MessageDao {

}
