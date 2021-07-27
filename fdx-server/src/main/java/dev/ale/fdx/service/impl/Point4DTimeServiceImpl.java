package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.Point4DTimeChoiceDao;
import dev.ale.fdx.entity.flight.Point4DTimeChoiceType;
import dev.ale.fdx.service.Point4DTimeChoiceService;

@Service
public class Point4DTimeServiceImpl extends GenericServiceImpl<Point4DTimeChoiceType, Long> implements Point4DTimeChoiceService {

	private Point4DTimeChoiceDao dao;
	
	@Autowired
	public Point4DTimeServiceImpl(GenericDao<Point4DTimeChoiceType, Long>genericDao) {
		super(genericDao);
		setDao((Point4DTimeChoiceDao)genericDao);
		this.dao.setEntity(Point4DTimeChoiceType.class);
	}

	public Point4DTimeChoiceDao getDao() {
		return dao;
	}

	public void setDao(Point4DTimeChoiceDao dao) {
		this.dao = dao;
	}

}
