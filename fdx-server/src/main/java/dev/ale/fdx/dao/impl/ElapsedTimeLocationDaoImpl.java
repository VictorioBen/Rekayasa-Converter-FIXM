package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.ElapsedTimeLocationDao;
import dev.ale.fdx.entity.flight.ElapsedTimeLocationType;

@Repository
public class ElapsedTimeLocationDaoImpl extends GenericDaoImpl<ElapsedTimeLocationType, Long> implements ElapsedTimeLocationDao {

}
