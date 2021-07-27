package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FlightEmergencyDao;
import dev.ale.fdx.entity.flight.FlightEmergencyType;

@Repository
public class FlightEmergencyDaoImpl extends GenericDaoImpl<FlightEmergencyType, Long> implements FlightEmergencyDao {

}
