package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.FlightIdentificationType;
import dev.ale.fdx.service.FlightIdentificationService;

public class TestFlightIdentification {
	
		public static void main(String [] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			FlightIdentificationService FlightService = context.getBean(FlightIdentificationService.class);
			//create
			FlightIdentificationType Flight = new FlightIdentificationType();
			
			Flight.setAircraftIdentification("PK-AAA");
			
			FlightService.create(Flight);
			
			//retrieve
			FlightIdentificationType Fretrive = FlightService.retrieve((long) 373);
			System.out.println("-------------- TAMPILKAN DATA ---------");
			System.out.println(Fretrive.getAircraftIdentification());
			
			//delete
			FlightService.deleteById((long) 373);
			
		}

}
