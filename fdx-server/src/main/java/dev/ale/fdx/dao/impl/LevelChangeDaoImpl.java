package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.LevelChangeDao;
import dev.ale.fdx.entity.flight.LevelChangeType;

@Repository
public class LevelChangeDaoImpl extends GenericDaoImpl<LevelChangeType, Long> implements LevelChangeDao {

}
