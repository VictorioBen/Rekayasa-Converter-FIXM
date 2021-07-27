package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.AircraftReferenceDao;
import dev.ale.fdx.entity.flight.AircraftTypeReferenceType;

@Repository
public class AircraftReferenceDaoImpl extends GenericDaoImpl<AircraftTypeReferenceType, Long> implements AircraftReferenceDao {

}
