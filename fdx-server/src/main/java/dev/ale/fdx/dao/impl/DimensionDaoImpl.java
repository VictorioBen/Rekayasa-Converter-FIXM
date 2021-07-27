package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DimensionDao;
import dev.ale.fdx.entity.base.DimensionsType;

@Repository
public class DimensionDaoImpl extends GenericDaoImpl<DimensionsType, Long> implements DimensionDao {

}
