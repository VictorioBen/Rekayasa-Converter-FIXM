package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.TrueAirspeedDao;
import dev.ale.fdx.entity.base.TrueAirspeedType;

@Repository
public class TrueAirspeedDaoImpl extends GenericDaoImpl<TrueAirspeedType, Long> implements TrueAirspeedDao {

}
