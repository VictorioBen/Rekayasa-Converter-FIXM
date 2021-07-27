package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.PressureDao;
import dev.ale.fdx.entity.base.PressureType;

@Repository
public class PressureDaoImpl extends GenericDaoImpl<PressureType, Long> implements PressureDao {

}
