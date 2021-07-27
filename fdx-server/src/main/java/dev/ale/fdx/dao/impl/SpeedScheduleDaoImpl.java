package dev.ale.fdx.dao.impl;	
import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.SpeedScheduleDao;
import dev.ale.fdx.entity.flight.SpeedScheduleType;

@Repository
public class SpeedScheduleDaoImpl extends GenericDaoImpl<SpeedScheduleType, Long> implements SpeedScheduleDao {

}
