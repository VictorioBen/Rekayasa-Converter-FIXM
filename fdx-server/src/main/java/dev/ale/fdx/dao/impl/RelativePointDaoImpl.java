package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.RelativePointDao;
import dev.ale.fdx.entity.base.RelativePointType;
import dev.ale.fdx.entity.flight.RouteDesignatorToNextElementType;

@Repository
public class RelativePointDaoImpl extends GenericDaoImpl<RelativePointType, Long> implements RelativePointDao {
		
}
