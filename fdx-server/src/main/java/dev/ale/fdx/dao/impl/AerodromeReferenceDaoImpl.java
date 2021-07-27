package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.AerodromeReferenceDao;
import dev.ale.fdx.entity.base.AerodromeReferenceType;

@Repository
public class AerodromeReferenceDaoImpl extends GenericDaoImpl<AerodromeReferenceType, Long> implements AerodromeReferenceDao {

}
