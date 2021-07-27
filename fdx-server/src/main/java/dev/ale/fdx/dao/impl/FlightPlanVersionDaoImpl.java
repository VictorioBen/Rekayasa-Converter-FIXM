package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FlightPlanVersionDao;
import dev.ale.fdx.entity.messaging.FlightPlanVersionType;

@Repository
public class FlightPlanVersionDaoImpl extends GenericDaoImpl<FlightPlanVersionType, Long> implements FlightPlanVersionDao{

}
