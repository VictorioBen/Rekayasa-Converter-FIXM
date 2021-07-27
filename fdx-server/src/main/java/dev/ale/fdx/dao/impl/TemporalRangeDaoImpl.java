package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.TemporalRangeDao;
import dev.ale.fdx.entity.base.TemporalRangeType;

@Repository
public class TemporalRangeDaoImpl extends GenericDaoImpl<TemporalRangeType, Long> implements TemporalRangeDao {

}
