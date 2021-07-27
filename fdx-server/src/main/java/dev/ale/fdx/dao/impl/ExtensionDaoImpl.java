package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.ExtensionDao;
import dev.ale.fdx.entity.base.ExtensionType;

@Repository
public class ExtensionDaoImpl extends GenericDaoImpl<ExtensionType, Long> implements ExtensionDao {
}
