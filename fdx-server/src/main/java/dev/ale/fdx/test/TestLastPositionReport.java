package dev.ale.fdx.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.RelativePointType;
import dev.ale.fdx.entity.base.SignificantPointType;
import dev.ale.fdx.entity.flight.LastPositionReportType;
import dev.ale.fdx.service.LastPositionReportService;

public class TestLastPositionReport {

	public static void main(String[] args) throws ParseException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		LastPositionReportService Lservice = context.getBean(LastPositionReportService.class);
			//create
		LastPositionReportType Last = new LastPositionReportType();
		Last.setDeterminationMethod("Thats true");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = format.parse("2019-01-03 07:23:10");
		Last.setTimeAtPositionItem(date);
		RelativePointType repon = new RelativePointType();
		Last.setPosition(repon);
		
		Lservice.create(Last);
		
		//retrieve
		LastPositionReportType Lretrieve = Lservice.retrieve(432L);
		System.out.println(Lretrieve.getDeterminationMethod());
		System.out.println(Lretrieve.getPosition());
		System.out.println(Lretrieve.getTimeAtPositionItem());
		
		//update
		Lretrieve.setDeterminationMethod("well done");
		Lservice.update(Lretrieve);
		//delete
		Lservice.deleteById(434L);
		
	}

}
