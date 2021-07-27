package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.AircraftOperatorDao;
import dev.ale.fdx.entity.base.AircraftOperatorType;

@Repository
public class AircraftOperatorDaoImpl extends GenericDaoImpl<AircraftOperatorType, Long> implements AircraftOperatorDao {

}
