package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.WindDirectionDao;
import dev.ale.fdx.entity.base.WindDirectionType;
import dev.ale.fdx.service.WindDirectionService;

@Service
public class WindDirectionServiceImpl extends GenericServiceImpl<WindDirectionType, Long> implements WindDirectionService {

	private WindDirectionDao dao;
	
	@Autowired
	public WindDirectionServiceImpl(GenericDao<WindDirectionType, Long>genericDao) {

		super(genericDao);
		setDao((WindDirectionDao)genericDao);
		this.dao.setEntity(WindDirectionType.class);
	}

	public WindDirectionDao getDao() {
		return dao;
	}

	public void setDao(WindDirectionDao dao) {
		this.dao = dao;
	}

}
