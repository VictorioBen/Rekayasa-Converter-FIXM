package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.GlobalUniqueFlightIdentDao;
import dev.ale.fdx.entity.base.GloballyUniqueFlightIdentifierType;

@Repository
public class GlobalUniqueFlightIdentDaoImpl extends GenericDaoImpl<GloballyUniqueFlightIdentifierType, Long> implements GlobalUniqueFlightIdentDao {

}
