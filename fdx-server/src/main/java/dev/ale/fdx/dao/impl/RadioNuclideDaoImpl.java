package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.RadioNuclideDao;
import dev.ale.fdx.entity.flight.RadionuclideType;

@Repository
public class RadioNuclideDaoImpl extends GenericDaoImpl<RadionuclideType, Long> implements RadioNuclideDao{

}
