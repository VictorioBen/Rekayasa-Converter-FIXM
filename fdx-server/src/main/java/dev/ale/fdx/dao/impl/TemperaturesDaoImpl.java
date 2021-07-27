package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.TemperaturesDao;
import dev.ale.fdx.entity.flight.TemperaturesType;

@Repository
public class TemperaturesDaoImpl extends GenericDaoImpl<TemperaturesType, Long> implements TemperaturesDao {

}
