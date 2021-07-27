package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.TimeConstraintDao;
import dev.ale.fdx.entity.flight.TimeConstraintType;

@Repository
public class TimeConstraintDaoImpl extends GenericDaoImpl<TimeConstraintType, Long> implements TimeConstraintDao {

}
