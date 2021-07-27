package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.CommunicationCapabilitiesDao;
import dev.ale.fdx.entity.flight.CommunicationCapabilitiesType;

@Repository
public class CommunicationCapabilitiesDaoImpl extends GenericDaoImpl<CommunicationCapabilitiesType, Long> implements CommunicationCapabilitiesDao{

}
