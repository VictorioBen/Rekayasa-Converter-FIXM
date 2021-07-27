package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.ExtensibleDao;
import dev.ale.fdx.entity.base.ExtensibleType;

@Repository
public class ExtensibleDaoImpl extends GenericDaoImpl<ExtensibleType, Long> implements ExtensibleDao {

}
