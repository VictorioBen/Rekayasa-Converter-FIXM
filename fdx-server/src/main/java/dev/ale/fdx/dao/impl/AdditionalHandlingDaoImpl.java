package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.AdditionalHandlingDao;
import dev.ale.fdx.entity.flight.AdditionalHandlingInformationType;

@Repository
public class AdditionalHandlingDaoImpl extends GenericDaoImpl<AdditionalHandlingInformationType, Long> implements AdditionalHandlingDao {

}
