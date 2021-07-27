package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.ColourChoiceDao;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.entity.base.ColourChoiceType;
import dev.ale.fdx.service.ColourChoiceService;

@Service
public class ColourChoiceServiceImpl extends GenericServiceImpl<ColourChoiceType, Long> implements ColourChoiceService {

	private ColourChoiceDao dao;
	
	@Autowired
	public ColourChoiceServiceImpl(GenericDao<ColourChoiceType, Long> genericDao) {
		super(genericDao);
		this.setDao((ColourChoiceDao) genericDao);
		this.dao.setEntity(ColourChoiceType.class);
	}

	public void setDao(ColourChoiceDao dao) {
		this.dao = dao;
	}
}
