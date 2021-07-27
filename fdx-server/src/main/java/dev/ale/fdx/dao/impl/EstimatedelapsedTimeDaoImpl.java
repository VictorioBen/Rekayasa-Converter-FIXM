package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.EstimatedelapsedTimeDao;
import dev.ale.fdx.entity.flight.EstimatedElapsedTimeType;

@Repository
public class EstimatedelapsedTimeDaoImpl extends GenericDaoImpl<EstimatedElapsedTimeType, Long> implements EstimatedelapsedTimeDao{

}
