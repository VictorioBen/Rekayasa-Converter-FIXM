package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FlightIdentificationDao;
import dev.ale.fdx.entity.flight.FlightIdentificationType;

@Repository
public class FlightIdentificationDaoImpl extends GenericDaoImpl<FlightIdentificationType, Long> implements FlightIdentificationDao {

}
