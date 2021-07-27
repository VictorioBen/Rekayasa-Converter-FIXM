package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.AircraftDao;
import dev.ale.fdx.entity.flight.AircraftType;

@Repository
public class AircraftDaoImpl extends GenericDaoImpl<AircraftType, Long> implements AircraftDao{

}
