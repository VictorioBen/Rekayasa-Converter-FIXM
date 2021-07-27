package dev.ale.fdx.test;

import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XMLGregorianCalendarAsDateTime;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.AerodromeReferenceType;
import dev.ale.fdx.entity.base.ExtensionType;
import dev.ale.fdx.entity.base.OtherReferenceType;
import dev.ale.fdx.entity.flight.DepartureType;
import dev.ale.fdx.entity.flight.FlightType;
import dev.ale.fdx.service.DepartureService;
import dev.ale.fdx.service.FlightService;

public class TestDeparture {



	public static void main(String[] args) throws DatatypeConfigurationException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DepartureService Dservice = context.getBean(DepartureService.class);

		DepartureType departure = new DepartureType();
		XMLGregorianCalendar xmlGregorgianCalender = DatatypeFactory.newInstance().newXMLGregorianCalendar("2019-04-25T01:40:50");
		XMLGregorianCalendar xmlEstimated = DatatypeFactory.newInstance().newXMLGregorianCalendar("2019-04-26T01:01:01");
		Date d = new Date("12/12/2020");
		departure.setActualTimeOfDepartureItem(d);
		departure.setActualTimeOfDeparture(xmlGregorgianCalender);
		OtherReferenceType other = new OtherReferenceType();

		departure.setRunwayDirection("WII");
		departure.setEstimatedOffBlockTime(xmlEstimated);
		departure.setAirportSlotIdentification("VIP");
		departure.setAerodrome(other);
		Dservice.create(departure);



		//retrieve by id
		DepartureType DepRetrieve = Dservice.retrieve((long)19);
		System.out.println("------------- TAMPILKAN DATA --------------");
		System.out.println(DepRetrieve.getActualTimeOfDeparture());
		System.out.println(DepRetrieve.getEstimatedOffBlockTime());
		System.out.println(DepRetrieve.getRunwayDirection());
		System.out.println(DepRetrieve.getAirportSlotIdentification());
		System.out.println("------------- TAMPILKAN DATA --------------");
		//delete by id
		//Dservice.deleteById((long) 32);

		//Update
		DepRetrieve.setRunwayDirection("CGK");
		Dservice.update(DepRetrieve);





	}

}
