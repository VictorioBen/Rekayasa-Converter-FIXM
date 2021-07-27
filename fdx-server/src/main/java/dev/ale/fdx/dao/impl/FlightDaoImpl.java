package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FlightDao;
import dev.ale.fdx.entity.flight.FlightType;

@Repository
public class FlightDaoImpl extends GenericDaoImpl<FlightType, Long> implements FlightDao{

}
