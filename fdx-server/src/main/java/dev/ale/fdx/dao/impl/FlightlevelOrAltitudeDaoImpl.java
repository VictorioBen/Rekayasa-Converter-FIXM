package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FlightlevelOrAltitudeDao;
import dev.ale.fdx.entity.base.FlightLevelOrAltitudeType;

@Repository
public class FlightlevelOrAltitudeDaoImpl extends GenericDaoImpl<FlightLevelOrAltitudeType, Long> implements FlightlevelOrAltitudeDao {

}
