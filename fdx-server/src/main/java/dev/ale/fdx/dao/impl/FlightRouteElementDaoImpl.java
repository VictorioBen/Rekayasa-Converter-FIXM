package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.FlightRouteElementDao;
import dev.ale.fdx.entity.flight.FlightRouteElementType;
@Repository
public class FlightRouteElementDaoImpl extends GenericDaoImpl<FlightRouteElementType, Long> implements FlightRouteElementDao {

}
