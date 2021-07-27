package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.TrajectoryPointPropertyDao;
import dev.ale.fdx.entity.flight.TrajectoryPointPropertyType;

@Repository
public class TrajectoryPointPropertyDaoImpl extends GenericDaoImpl<TrajectoryPointPropertyType, Long> implements TrajectoryPointPropertyDao {

}
