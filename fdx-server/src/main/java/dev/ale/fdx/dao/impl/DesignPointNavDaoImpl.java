package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DesignPointNavDao;
import dev.ale.fdx.entity.base.DesignatedPointOrNavaidType;

@Repository
public class DesignPointNavDaoImpl extends GenericDaoImpl<DesignatedPointOrNavaidType, Long> implements DesignPointNavDao{

}
