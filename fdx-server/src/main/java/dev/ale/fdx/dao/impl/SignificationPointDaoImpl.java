package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.SignificationPointDao;
import dev.ale.fdx.entity.base.SignificantPointType;

@Repository
public class SignificationPointDaoImpl extends GenericDaoImpl<SignificantPointType, Long>implements SignificationPointDao{

}
