package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.AngleDao;
import dev.ale.fdx.entity.base.AngleType;

@Repository
public class AngleDaoImpl extends GenericDaoImpl<AngleType, Long> implements AngleDao{

}
