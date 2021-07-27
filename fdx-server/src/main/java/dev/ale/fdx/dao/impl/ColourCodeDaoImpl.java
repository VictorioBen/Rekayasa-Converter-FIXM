package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.ColourCodeDao;
import dev.ale.fdx.entity.base.ColourCodeType;

@Repository
public class ColourCodeDaoImpl extends GenericDaoImpl<ColourCodeType, Long> implements ColourCodeDao {

}
