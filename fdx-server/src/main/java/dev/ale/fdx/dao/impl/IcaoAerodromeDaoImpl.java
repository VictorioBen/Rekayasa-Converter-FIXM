package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.IcaoAerodromeDao;
import dev.ale.fdx.entity.base.IcaoAerodromeReferenceType;

@Repository
public class IcaoAerodromeDaoImpl extends GenericDaoImpl<IcaoAerodromeReferenceType, Long> implements IcaoAerodromeDao {

}
