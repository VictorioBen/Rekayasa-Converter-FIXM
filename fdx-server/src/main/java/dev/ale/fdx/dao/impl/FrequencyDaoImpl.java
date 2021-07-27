package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.FrequencyDao;
import dev.ale.fdx.entity.base.FrequencyType;

@Repository
public class FrequencyDaoImpl extends GenericDaoImpl<FrequencyType, Long> implements FrequencyDao {

}
