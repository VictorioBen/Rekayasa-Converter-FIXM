package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.LastContactDao;
import dev.ale.fdx.entity.flight.LastContactType;

@Repository
public class LastContactDaoImpl extends GenericDaoImpl<LastContactType, Long> implements LastContactDao {

	
}
