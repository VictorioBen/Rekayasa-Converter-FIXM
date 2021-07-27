package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.SupplementaryDatasourceDao;
import dev.ale.fdx.entity.flight.SupplementaryDataSourceType;

@Repository
public class SupplementaryDatasourceDaoImpl extends GenericDaoImpl<SupplementaryDataSourceType, Long> implements SupplementaryDatasourceDao{

}
