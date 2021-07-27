package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.messaging.FlightPlanVersionType;
import dev.ale.fdx.entity.messaging.FlightPlanVersionTypeChoiceType;
import dev.ale.fdx.service.FlightPlanVersionService;

public class TestFlightPlanVersion {
	
	public static void main(String [] args) {
		
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			FlightPlanVersionService Fservice = context.getBean(FlightPlanVersionService.class);
			FlightPlanVersionType FlightPlan = new FlightPlanVersionType();
			FlightPlanVersionTypeChoiceType Plan = new FlightPlanVersionTypeChoiceType();
			FlightPlan.setVersion(Plan);
			FlightPlan.setReferenceVersion(Plan);
			
			Fservice.create(FlightPlan);
	}

}
