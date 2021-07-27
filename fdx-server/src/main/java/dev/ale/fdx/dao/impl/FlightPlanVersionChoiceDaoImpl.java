package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.FlightPlanVersionChoiceDao;
import dev.ale.fdx.entity.messaging.FlightPlanVersionTypeChoiceType;

@Repository
public class FlightPlanVersionChoiceDaoImpl extends GenericDaoImpl<FlightPlanVersionTypeChoiceType, Long> implements FlightPlanVersionChoiceDao {

}
