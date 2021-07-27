package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.BoundaryCrossingDao;
import dev.ale.fdx.entity.flight.BoundaryCrossingType;

@Repository
public class BoundaryCrossingDaoImpl extends GenericDaoImpl<BoundaryCrossingType, Long> implements BoundaryCrossingDao {

}
