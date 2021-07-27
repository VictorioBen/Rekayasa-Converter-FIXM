package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DestinationDao;
import dev.ale.fdx.entity.flight.DestinationType;

@Repository
public class DestinationDaoImpl extends GenericDaoImpl<DestinationType, Long> implements DestinationDao{

}
