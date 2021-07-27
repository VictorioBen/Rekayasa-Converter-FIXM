package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.EnrouteDelayDao;
import dev.ale.fdx.entity.flight.EnRouteDelayType;

@Repository
public class EnrouteDelayDaoImpl extends GenericDaoImpl<EnRouteDelayType, Long> implements EnrouteDelayDao{

}
