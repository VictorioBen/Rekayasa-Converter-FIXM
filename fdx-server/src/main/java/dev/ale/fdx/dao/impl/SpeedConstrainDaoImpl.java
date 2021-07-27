package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.SpeedConstrainDao;
import dev.ale.fdx.entity.flight.SpeedConstraintType;


@Repository
public class SpeedConstrainDaoImpl extends GenericDaoImpl<SpeedConstraintType, Long> implements SpeedConstrainDao {

}
