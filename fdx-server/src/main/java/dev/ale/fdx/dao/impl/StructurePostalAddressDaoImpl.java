package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.StructurePostalAddressDao;
import dev.ale.fdx.entity.flight.StructuredPostalAddressType;

@Repository
public class StructurePostalAddressDaoImpl extends GenericDaoImpl<StructuredPostalAddressType, Long> implements StructurePostalAddressDao {

}
