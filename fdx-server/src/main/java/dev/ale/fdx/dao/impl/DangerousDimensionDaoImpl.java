package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DangerousDimensionDao;
import dev.ale.fdx.dao.DangerousGoodsDao;
import dev.ale.fdx.entity.flight.DangerousGoodsDimensionsType;

@Repository
public class DangerousDimensionDaoImpl extends GenericDaoImpl<DangerousGoodsDimensionsType, Long> implements DangerousDimensionDao{

}
