package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DepartureDao;
import dev.ale.fdx.entity.flight.DepartureType;

@Repository
public class DepartureDaoImpl extends GenericDaoImpl<DepartureType, Long> implements DepartureDao{

}
