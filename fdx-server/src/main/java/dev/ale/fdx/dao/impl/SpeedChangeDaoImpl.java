package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.SpeedChangeDao;
import dev.ale.fdx.entity.flight.SpeedChangeType;

@Repository
public class SpeedChangeDaoImpl extends GenericDaoImpl<SpeedChangeType, Long> implements SpeedChangeDao {

}
