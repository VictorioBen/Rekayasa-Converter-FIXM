package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DangerousPackageGroupDao;
import dev.ale.fdx.entity.flight.DangerousGoodsPackageGroupType;

@Repository
public class DangerousPackageGroupDaoImpl extends GenericDaoImpl<DangerousGoodsPackageGroupType, Long> implements DangerousPackageGroupDao {

}
