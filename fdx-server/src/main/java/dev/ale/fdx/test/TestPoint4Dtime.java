package dev.ale.fdx.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

import org.hibernate.type.DurationType;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.DurationAsString;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.Point4DTimeChoiceType;
import dev.ale.fdx.service.Point4DTimeChoiceService;

public class TestPoint4Dtime {

	public static void main(String[] args) throws ParseException, DatatypeConfigurationException {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Point4DTimeChoiceService Pservice = context.getBean(Point4DTimeChoiceService.class);
		//create
		Point4DTimeChoiceType P = new Point4DTimeChoiceType();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = format.parse("2019-01-03 07:23:10");
		P.setAbsoluteTimeItem(date);
		javax.xml.datatype.Duration Q = DatatypeFactory.newInstance().newDuration(120L);
		P.setRelativeTimeFromInitialPredictionPoint(Q);
		Pservice.create(P);
		
		//retrieve
		Point4DTimeChoiceType Pretrieve = Pservice.retrieve((long) 477);
		System.out.println("--------- TAMPIL DATA -----------");
		System.out.println(Pretrieve.getAbsoluteTimeItem());
		System.out.println(Pretrieve.getRelativeTimeFromInitialPredictionPoint());
		System.out.println("---------------------------------");
		
		//update
		javax.xml.datatype.Duration Q2 = DatatypeFactory.newInstance().newDuration(200L);
		Pretrieve.setRelativeTimeFromInitialPredictionPoint(Q2);
		Pservice.update(Pretrieve);
		//delete
		Pservice.deleteById(478L);
		
	

	}

}
