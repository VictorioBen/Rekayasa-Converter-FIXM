package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.ContactInformationDao;
import dev.ale.fdx.entity.base.ContactInformationType;

@Repository
public class ContactInformationDaoImpl extends GenericDaoImpl<ContactInformationType, Long> implements ContactInformationDao {

}
