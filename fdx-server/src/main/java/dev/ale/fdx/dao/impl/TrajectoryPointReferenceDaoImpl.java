package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.TrajectoryPointReferenceDao;
import dev.ale.fdx.entity.flight.TrajectoryPointReferenceType;

@Repository
public class TrajectoryPointReferenceDaoImpl extends GenericDaoImpl<TrajectoryPointReferenceType, Long> implements TrajectoryPointReferenceDao {

}
