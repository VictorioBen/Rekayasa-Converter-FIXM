package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.CruiseClimbDao;
import dev.ale.fdx.entity.flight.CruiseClimbStartType;

@Repository
public class CruiseClimbDaoImpl extends GenericDaoImpl<CruiseClimbStartType, Long> implements CruiseClimbDao{

}
