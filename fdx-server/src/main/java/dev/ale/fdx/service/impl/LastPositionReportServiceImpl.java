package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.LastPositionReportDao;
import dev.ale.fdx.entity.flight.LastPositionReportType;
import dev.ale.fdx.service.LastPositionReportService;

@Service
public class LastPositionReportServiceImpl extends GenericServiceImpl<LastPositionReportType, Long> implements LastPositionReportService{

	private LastPositionReportDao dao;
	
	@Autowired
	public LastPositionReportServiceImpl(GenericDao<LastPositionReportType, Long>genericDao) {
		super(genericDao);
		setDao((LastPositionReportDao)genericDao);
		this.dao.setEntity(LastPositionReportType.class);
	}

	public LastPositionReportDao getDao() {
		return dao;
	}

	public void setDao(LastPositionReportDao dao) {
		this.dao = dao;
	}

}
