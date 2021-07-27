package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.LevelConstrainDao;
import dev.ale.fdx.entity.flight.LevelConstraintType;

@Repository
public class LevelConstrainDaoImpl extends GenericDaoImpl<LevelConstraintType, Long> implements LevelConstrainDao {

}
