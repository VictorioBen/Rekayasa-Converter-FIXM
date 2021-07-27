package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.MeteorologicalDataDao;
import dev.ale.fdx.entity.flight.MeteorologicalDataType;

@Repository
public class MeteorologicalDataDaoImpl extends GenericDaoImpl<MeteorologicalDataType, Long> implements MeteorologicalDataDao {

}
