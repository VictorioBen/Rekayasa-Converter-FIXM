package dev.ale.fdx.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XMLGregorianCalendarAsDateTime;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.DesignatedPointOrNavaidType;
import dev.ale.fdx.entity.base.FlightLevelOrAltitudeType;
import dev.ale.fdx.entity.base.PositionPointType;
import dev.ale.fdx.entity.base.RelativePointType;
import dev.ale.fdx.entity.base.SignificantPointType;
import dev.ale.fdx.entity.flight.AltitudeInTransitionType;
import dev.ale.fdx.entity.flight.BoundaryCrossingType;
import dev.ale.fdx.service.BoundaryCrossingService;

public class TestBoundaryCrossing {

	public static void main(String [] args) throws DatatypeConfigurationException, ParseException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BoundaryCrossingService BonCros = context.getBean(BoundaryCrossingService.class);

		BoundaryCrossingType boundary = new BoundaryCrossingType();

		//create
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = format.parse("2019-01-03 07:23:10");
		boundary.setCrossingTimeItem(date);	
		AltitudeInTransitionType alt = new AltitudeInTransitionType();
		//alt.setHjid((long) 10);
		boundary.setAltitudeInTransition(alt);
		FlightLevelOrAltitudeType FlightAlt = new FlightLevelOrAltitudeType();
		//FlightAlt.setHjid((long) 20);
		boundary.setClearedLevel(FlightAlt);
		PositionPointType Pospon = new PositionPointType();
		//Pospon.setHjid((long) 10);
		boundary.setCrossingPoint(Pospon);
		BonCros.update(boundary);

		//retrieve 
		BoundaryCrossingType BonCrosRetrieve = BonCros.retrieve((long) 241);
		System.out.println(BonCrosRetrieve.getCrossingTime());
		System.out.println(BonCrosRetrieve.getCrossingPoint());

		//delete
		BonCros.deleteById((long) 235);
	}
}
