package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.SsrCodeDao;
import dev.ale.fdx.entity.base.SsrCodeType;

@Repository
public class SsrCodeImpl extends GenericDaoImpl<SsrCodeType, Long> implements SsrCodeDao {

}
