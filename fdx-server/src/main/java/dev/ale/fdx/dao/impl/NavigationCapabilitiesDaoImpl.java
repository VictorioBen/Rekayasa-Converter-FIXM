package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.NavigationCapabilitiesDao;
import dev.ale.fdx.entity.flight.NavigationCapabilitiesType;

@Repository
public class NavigationCapabilitiesDaoImpl extends GenericDaoImpl<NavigationCapabilitiesType, Long> implements NavigationCapabilitiesDao {

}
