package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.PositionPointDao;
import dev.ale.fdx.entity.base.PositionPointType;

@Repository
public class PositionPointDaoImpl extends GenericDaoImpl<PositionPointType, Long> implements PositionPointDao {

}
