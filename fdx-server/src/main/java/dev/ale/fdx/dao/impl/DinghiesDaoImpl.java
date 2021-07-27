package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DinghiesDao;
import dev.ale.fdx.entity.flight.DinghiesType;

@Repository
public class DinghiesDaoImpl extends GenericDaoImpl<DinghiesType, Long> implements DinghiesDao{

}
