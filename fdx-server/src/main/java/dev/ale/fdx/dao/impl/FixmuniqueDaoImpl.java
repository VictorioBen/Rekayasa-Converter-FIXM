package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FixmuniqueDao;
import dev.ale.fdx.entity.messaging.FIXMUniqueMessageIdentifierType;

@Repository
public class FixmuniqueDaoImpl extends GenericDaoImpl<FIXMUniqueMessageIdentifierType, Long> implements FixmuniqueDao{

}
