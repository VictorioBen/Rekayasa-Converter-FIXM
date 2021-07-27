package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.TemperaturDao;
import dev.ale.fdx.entity.base.TemperatureType;

@Repository
public class TemperatureDaoImpl extends GenericDaoImpl<TemperatureType, Long> implements TemperaturDao {

}
