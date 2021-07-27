package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.WindDirectionDao;
import dev.ale.fdx.entity.base.WindDirectionType;

@Repository
public class WindDirectionDaoImpl extends GenericDaoImpl<WindDirectionType, Long> implements WindDirectionDao {

}
