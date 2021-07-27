package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.MessageCollectionDao;
import dev.ale.fdx.entity.messaging.MessageCollectionType;

@Repository
public class MessageCollectionDaoImpl extends GenericDaoImpl<MessageCollectionType, Long> implements MessageCollectionDao {

}
