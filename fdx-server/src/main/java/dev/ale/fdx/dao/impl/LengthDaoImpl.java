package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.LengthDao;
import dev.ale.fdx.entity.base.LengthType;

@Repository
public class LengthDaoImpl extends GenericDaoImpl<LengthType, Long>implements LengthDao{

}
