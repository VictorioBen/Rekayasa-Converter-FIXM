package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.BearingDao;
import dev.ale.fdx.entity.base.BearingType;

@Repository
public class BearingDaoImpl extends GenericDaoImpl<BearingType, Long> implements BearingDao {

}
