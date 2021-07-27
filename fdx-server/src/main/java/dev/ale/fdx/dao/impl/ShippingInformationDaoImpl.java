package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.ShippingInformationDao;
import dev.ale.fdx.entity.flight.ShippingInformationType;

@Repository
public class ShippingInformationDaoImpl extends GenericDaoImpl<ShippingInformationType, Long> implements ShippingInformationDao{

}
