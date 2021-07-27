package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DistanceDao;
import dev.ale.fdx.entity.base.DistanceType;

@Repository
public class DistanceDaoImpl extends GenericDaoImpl<DistanceType,  Long> implements DistanceDao{

}
