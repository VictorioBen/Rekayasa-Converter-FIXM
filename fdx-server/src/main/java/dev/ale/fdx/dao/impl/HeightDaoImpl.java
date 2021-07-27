package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.HeightDao;
import dev.ale.fdx.entity.base.HeightType;

@Repository
public class HeightDaoImpl extends GenericDaoImpl<HeightType, Long> implements HeightDao{

}
