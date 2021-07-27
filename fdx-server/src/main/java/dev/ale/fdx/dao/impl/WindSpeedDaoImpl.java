package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.WindSpeedDao;
import dev.ale.fdx.entity.base.WindSpeedType;

@Repository
public class WindSpeedDaoImpl extends GenericDaoImpl<WindSpeedType, Long> implements WindSpeedDao {

}
