package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.PerformanceProfilDao;
import dev.ale.fdx.entity.flight.PerformanceProfileType;

@Repository
public class PerformanceProfilDaoImpl extends GenericDaoImpl<PerformanceProfileType, Long> implements PerformanceProfilDao{

}
