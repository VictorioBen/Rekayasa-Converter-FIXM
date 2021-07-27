package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.PersonOrOrganizationDao;
import dev.ale.fdx.entity.base.PersonOrOrganizationType;

@Repository
public class PersonOrOrganizationDaoImpl extends GenericDaoImpl<PersonOrOrganizationType, Long> implements PersonOrOrganizationDao {

}
