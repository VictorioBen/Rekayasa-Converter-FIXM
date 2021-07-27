package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.EnrouteDao;
import dev.ale.fdx.entity.flight.EnRouteType;

@Repository
public class EnrouteDaoImpl extends GenericDaoImpl<EnRouteType, Long> implements EnrouteDao {

}
