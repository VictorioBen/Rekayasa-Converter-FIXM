package dev.ale.fdx.dao.impl;


import org.springframework.stereotype.Repository;

import dev.ale.fdx.dao.LastPositionReportDao;
import dev.ale.fdx.entity.flight.LastPositionReportType;

@Repository
public class LastPositionReportDaoImpl extends GenericDaoImpl<LastPositionReportType, Long> implements LastPositionReportDao{

}
