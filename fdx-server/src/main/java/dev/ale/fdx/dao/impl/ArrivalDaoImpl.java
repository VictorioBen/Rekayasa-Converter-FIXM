package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.ArrivalDao;
import dev.ale.fdx.entity.flight.ArrivalType;

@Repository
public class ArrivalDaoImpl extends GenericDaoImpl<ArrivalType, Long> implements ArrivalDao{

}
