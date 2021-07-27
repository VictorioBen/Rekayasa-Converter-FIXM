package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DangerousPackageDao;
import dev.ale.fdx.entity.flight.DangerousGoodsPackageType;


@Repository
public class DangerousPackageDaoImpl extends GenericDaoImpl<DangerousGoodsPackageType, Long> implements DangerousPackageDao{

}
