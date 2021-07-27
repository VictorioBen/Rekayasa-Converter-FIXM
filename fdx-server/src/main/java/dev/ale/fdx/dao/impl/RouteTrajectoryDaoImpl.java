package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.RouteTrajectoryDao;
import dev.ale.fdx.entity.flight.RouteTrajectoryType;

@Repository
public class RouteTrajectoryDaoImpl extends GenericDaoImpl<RouteTrajectoryType, Long> implements RouteTrajectoryDao{

}
