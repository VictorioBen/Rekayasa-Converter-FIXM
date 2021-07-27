package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.HazardClassDao;
import dev.ale.fdx.entity.flight.HazardClassType;

@Repository
public class HazardClassDaoImpl extends GenericDaoImpl<HazardClassType, Long> implements HazardClassDao {

}
