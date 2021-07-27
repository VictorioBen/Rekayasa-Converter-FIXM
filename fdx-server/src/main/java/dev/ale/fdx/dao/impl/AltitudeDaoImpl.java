package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.AltitudeDao;
import dev.ale.fdx.entity.base.AltitudeType;
import dev.ale.fdx.service.AltitudeIntransitionService;

@Repository
public class AltitudeDaoImpl extends GenericDaoImpl<AltitudeType, Long> implements AltitudeDao {

}
