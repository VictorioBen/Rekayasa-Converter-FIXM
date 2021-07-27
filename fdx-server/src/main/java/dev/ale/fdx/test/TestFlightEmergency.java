package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.FrequencyType;
import dev.ale.fdx.entity.base.IcaoUnitReferenceType;
import dev.ale.fdx.entity.flight.EmergencyPhaseType;
import dev.ale.fdx.entity.flight.FlightEmergencyType;
import dev.ale.fdx.entity.flight.LastContactType;
import dev.ale.fdx.service.FlightEmergencyService;

public class TestFlightEmergency {

	public static void main(String [] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		FlightEmergencyService Fservice = context.getBean(FlightEmergencyService.class);

		//create
		FlightEmergencyType FlightEmergency = new FlightEmergencyType();
		FlightEmergency.setActionTaken("Emergency");
		FlightEmergency.setEmergencyDescription("AirTurbulance");
		LastContactType contact = new LastContactType();
		contact.setLastContactUnit("fireman");
		FlightEmergency.setLastContact(contact);
		FlightEmergency.setOtherInformation("dalam perbaikan");
		IcaoUnitReferenceType icao = new IcaoUnitReferenceType();
		FlightEmergency.setOriginator(icao);
		EmergencyPhaseType phase = EmergencyPhaseType.valueOf("DETRESFA");
		FlightEmergency.setPhase(phase);

		Fservice.create(FlightEmergency);

		//retrieve
		FlightEmergencyType Fretrieve = Fservice.retrieve((long) 370);
		System.out.println(Fretrieve.getActionTaken());
		System.out.println(Fretrieve.getEmergencyDescription());
		System.out.println(Fretrieve.getLastContact());
		System.out.println(Fretrieve.getOtherInformation());
		System.out.println(Fretrieve.getPhase());

		//delete
		Fservice.deleteById((long) 364);

	}

}
