package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FlightLevelDao;
import dev.ale.fdx.entity.base.FlightLevelType;

@Repository
public class FlightLevelDaoImpl extends GenericDaoImpl<FlightLevelType, Long> implements FlightLevelDao {

}
