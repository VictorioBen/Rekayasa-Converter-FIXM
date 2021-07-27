package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.GeographicalPositionDao;
import dev.ale.fdx.entity.base.GeographicalPositionType;

@Repository
public class GeographicalPositionDaoImpl extends GenericDaoImpl<GeographicalPositionType, Long> implements GeographicalPositionDao {

}
