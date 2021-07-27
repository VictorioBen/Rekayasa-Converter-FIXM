package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.ProfilePointDao;
import dev.ale.fdx.entity.flight.ProfilePointType;

@Repository
public class ProfilePointDaoImpl extends GenericDaoImpl<ProfilePointType, Long> implements ProfilePointDao {

}
