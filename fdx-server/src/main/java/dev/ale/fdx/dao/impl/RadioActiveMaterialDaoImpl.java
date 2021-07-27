package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.RadioActiveMaterialDao;
import dev.ale.fdx.entity.flight.RadioactiveMaterialType;

@Repository
public class RadioActiveMaterialDaoImpl extends GenericDaoImpl<RadioactiveMaterialType, Long> implements RadioActiveMaterialDao{

}
