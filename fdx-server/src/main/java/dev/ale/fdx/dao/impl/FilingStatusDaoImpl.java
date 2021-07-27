package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FilingStatusDao;
import dev.ale.fdx.entity.messaging.FilingStatusType;

@Repository
public class FilingStatusDaoImpl extends GenericDaoImpl<FilingStatusType, Long> implements FilingStatusDao{

}
