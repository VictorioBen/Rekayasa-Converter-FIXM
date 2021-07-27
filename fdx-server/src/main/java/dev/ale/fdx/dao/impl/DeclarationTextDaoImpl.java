package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.DeclarationTextDao;
import dev.ale.fdx.entity.flight.DeclarationTextType;

@Repository
public class DeclarationTextDaoImpl extends GenericDaoImpl<DeclarationTextType, Long> implements DeclarationTextDao {

}
