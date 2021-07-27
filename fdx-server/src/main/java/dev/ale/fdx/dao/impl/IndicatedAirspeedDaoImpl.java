package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.IndicatedAirspeedDao;
import dev.ale.fdx.entity.base.IndicatedAirspeedType;

@Repository
public class IndicatedAirspeedDaoImpl extends GenericDaoImpl<IndicatedAirspeedType, Long> implements IndicatedAirspeedDao {

}
