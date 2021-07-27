package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.TelephoneContactDao;
import dev.ale.fdx.entity.base.TelephoneContactType;

@Repository
public class TelephoneContactDaoImpl extends GenericDaoImpl<TelephoneContactType, Long> implements TelephoneContactDao {

}
