package dev.ale.fdx.test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.DurationAsString;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.DistanceType;
import dev.ale.fdx.entity.base.FlightLevelOrAltitudeType;
import dev.ale.fdx.entity.base.TrueAirspeedType;
import dev.ale.fdx.entity.flight.ProfilePointType;
import dev.ale.fdx.service.ProfilePointService;

public class TestProfilPoint {

	public static void main(String[] args) throws DatatypeConfigurationException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ProfilePointService Pservice = context.getBean(ProfilePointService.class);

		ProfilePointType P = new ProfilePointType();
		//CREATE
		Duration d = DatatypeFactory.newInstance().newDurationDayTime(70L);
		P.setTimeItem("PT4M40S");
		TrueAirspeedType Air = new TrueAirspeedType();
		P.setAirspeed(Air);
		DistanceType Dis = new DistanceType();
		P.setDistance(Dis);
		FlightLevelOrAltitudeType Flevel = new FlightLevelOrAltitudeType();
		P.setLevel(Flevel);

		Pservice.create(P);
		//Retrieve
		ProfilePointType Pretrieve = Pservice.retrieve(491L);
		System.out.println("-------- TAMPIL DATA ------------");
		System.out.println(Pretrieve.getTimeItem());
		System.out.println(Pretrieve.getAirspeed());
		System.out.println(Pretrieve.getLevel());
		System.out.println("----------------------------------");
		//update
		Pretrieve.setTimeItem("PT3M33S");
		Pservice.update(Pretrieve);
		//delete
		Pservice.deleteById(487L);
	}

}
