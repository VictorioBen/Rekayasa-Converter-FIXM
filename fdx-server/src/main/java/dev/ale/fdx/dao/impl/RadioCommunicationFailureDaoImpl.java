package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.RadioCommunicationFailureDao;
import dev.ale.fdx.entity.flight.RadioCommunicationFailureType;

@Repository
public class RadioCommunicationFailureDaoImpl extends GenericDaoImpl<RadioCommunicationFailureType, Long>implements RadioCommunicationFailureDao{

}
