package dev.ale.fdx.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.FrequencyType;
import dev.ale.fdx.entity.flight.LastContactType;
import dev.ale.fdx.entity.flight.LastPositionReportType;
import dev.ale.fdx.service.LastContactService;

public class TestLastContact {

	public static void main(String[] args) throws ParseException {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		LastContactService Lservice = context.getBean(LastContactService.class);
		
		LastContactType Last = new LastContactType();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = format.parse("2019-01-03 07:23:10");
		Date date2 = format.parse("2018-02-03 07:23:10");
		Last.setLastContactTimeItem(date);
		Last.setLastContactUnit("iceman");
		FrequencyType freq = new FrequencyType();
		Last.setLastContactFrequency(freq);
		LastPositionReportType Lastpos = new LastPositionReportType();
		Last.setPosition(Lastpos);
		
		Lservice.create(Last);
		
		//retrieve 
		LastContactType Lretrieve = Lservice.retrieve((long) 414);
		System.out.println(Lretrieve.getLastContactUnit());
		//update
		Lretrieve.setLastContactTimeItem(date2);
		Lservice.update(Lretrieve);
		//delete
		Lservice.deleteById((long) 420);

	}

}
