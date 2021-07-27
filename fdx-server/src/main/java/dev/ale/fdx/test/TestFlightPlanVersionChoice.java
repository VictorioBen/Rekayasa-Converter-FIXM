package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.messaging.FlightPlanVersionTypeChoiceType;
import dev.ale.fdx.service.FlightPlanVersionChoiceService;
import dev.ale.fdx.service.FlightPlanVersionService;

public class TestFlightPlanVersionChoice {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		FlightPlanVersionChoiceService Fservice = context.getBean(FlightPlanVersionChoiceService.class);

		FlightPlanVersionTypeChoiceType Flight = new FlightPlanVersionTypeChoiceType();
		Flight.setAspFlightPlanVersion("fast");
		Flight.setAuFlightPlanVersion(10);

		Fservice.create(Flight);

		//retrieve
		FlightPlanVersionTypeChoiceType Fretrieve = Fservice.retrieve((long) 379);
		System.out.println("---------- TAMPILKAN DATA ---------------");
		System.out.println(Fretrieve.getAspFlightPlanVersion());
		System.out.println(Fretrieve.getAuFlightPlanVersion());
		System.out.println("----------- TAMPILKAN DATA --------------");
		
		//Delete
		Fservice.deleteById((long) 379);

	}

}
