package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DangerousGoodsDao;
import dev.ale.fdx.entity.flight.DangerousGoodsType;

@Repository
public class DangerousGoodsDaoImpl extends GenericDaoImpl<DangerousGoodsType, Long> implements DangerousGoodsDao {

}
