package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FlightCapabilitiestDao;
import dev.ale.fdx.entity.flight.FlightCapabilitiesType;

@Repository
public class FlightCapabilitiestDaoImpl extends GenericDaoImpl<FlightCapabilitiesType, Long>implements FlightCapabilitiestDao{

}
