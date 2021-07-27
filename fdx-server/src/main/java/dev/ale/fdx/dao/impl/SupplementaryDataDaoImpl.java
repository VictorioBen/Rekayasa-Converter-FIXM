package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.SupplementaryDataDao;
import dev.ale.fdx.entity.flight.SupplementaryDataType;

@Repository
public class SupplementaryDataDaoImpl extends GenericDaoImpl<SupplementaryDataType, Long> implements SupplementaryDataDao {

}
