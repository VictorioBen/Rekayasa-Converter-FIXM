package dev.ale.fdx.test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.DurationAsString;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.FlightLevelOrAltitudeType;
import dev.ale.fdx.entity.base.TrueAirspeedType;
import dev.ale.fdx.entity.flight.FlightRouteElementType;
import dev.ale.fdx.entity.flight.FlightRouteInformationType;
import dev.ale.fdx.entity.flight.FlightRulesCategoryType;
import dev.ale.fdx.service.FlightRouteElementService;
import dev.ale.fdx.service.FlightRouteInformationService;

public class TestFlightRouteElementInformation {

	public static void main(String[] args) throws DatatypeConfigurationException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		FlightRouteInformationService Fservice = context.getBean(FlightRouteInformationService.class);
		FlightRouteInformationType Flight = new FlightRouteInformationType();
		//create
		XMLGregorianCalendar Xcall = DatatypeFactory.newInstance().newXMLGregorianCalendar("2019-01-07");
		Flight.setAirfileRouteStartTime(Xcall);
		FlightRulesCategoryType Frules = FlightRulesCategoryType.valueOf("V");
		Flight.setFlightRulesCategory(Frules);
		Flight.setRouteText("jalan lurusan dengan tegap jgn kebalik");
		Flight.setTotalEstimatedElapsedTimeItem("PT3M33S");
		FlightLevelOrAltitudeType LevelOr = new FlightLevelOrAltitudeType();
		Flight.setCruisingLevel(LevelOr);
		TrueAirspeedType air = new TrueAirspeedType();
		Flight.setCruisingSpeed(air);
		Fservice.create(Flight);
		//retrieve
		FlightRouteInformationType Fretrieve = Fservice.retrieve(495L);
		System.out.println("-------------- TAMPILKAN DATA ----------------");
		System.out.println(Fretrieve.getAirfileRouteStartTime());
		System.out.println(Fretrieve.getFlightRulesCategory());
		System.out.println(Fretrieve.getRouteText());
		System.out.println(Fretrieve.getTotalEstimatedElapsedTimeItem());
		System.out.println(Fretrieve.getCruisingLevel());
		System.out.println(Fretrieve.getCruisingSpeed());
		System.out.println("------------------------------------------------");
		//update
		Fretrieve.setRouteText("Max kecepatan 60Mph");
		//delete
		Fservice.deleteById(498L);
	}

}
