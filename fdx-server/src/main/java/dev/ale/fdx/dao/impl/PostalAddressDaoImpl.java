package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.PostalAddressDao;
import dev.ale.fdx.entity.base.PostalAddressType;

@Repository
public class PostalAddressDaoImpl extends GenericDaoImpl<PostalAddressType, Long> implements PostalAddressDao {

}
