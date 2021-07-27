package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.AirwayBillDao;
import dev.ale.fdx.entity.flight.AirWaybillType;

@Repository
public class AirwayBillDaoImpl extends GenericDaoImpl<AirWaybillType, Long> implements AirwayBillDao {

}
