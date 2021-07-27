package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.OnlineContactDao;
import dev.ale.fdx.entity.base.OnlineContactType;

@Repository
public class OnlineContactDaoImpl extends GenericDaoImpl<OnlineContactType, Long> implements OnlineContactDao {

}
