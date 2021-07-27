package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.ReclearanceInFlightDao;
import dev.ale.fdx.entity.flight.ReclearanceInFlightType;

@Repository
public class ReclearanceInFlightDaoImpl extends GenericDaoImpl<ReclearanceInFlightType, Long> implements ReclearanceInFlightDao {

}
