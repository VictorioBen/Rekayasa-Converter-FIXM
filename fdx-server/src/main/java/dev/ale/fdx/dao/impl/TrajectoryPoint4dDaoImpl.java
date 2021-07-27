package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.TrajectoryPoint4dDao;
import dev.ale.fdx.entity.flight.TrajectoryPoint4DType;

@Repository
public class TrajectoryPoint4dDaoImpl extends GenericDaoImpl<TrajectoryPoint4DType, Long> implements TrajectoryPoint4dDao{

}
