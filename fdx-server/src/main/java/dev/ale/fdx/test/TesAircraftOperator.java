package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.AircraftOperatorType;
import dev.ale.fdx.entity.base.PersonOrOrganizationType;
import dev.ale.fdx.service.AircraftOperatorService;

public class TesAircraftOperator {

	public static void main(String [] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AircraftOperatorService AirService = context.getBean(AircraftOperatorService.class);

		AircraftOperatorType AirOperator = new AircraftOperatorType();

		AirOperator.setDesignatorIcao("WII");

		PersonOrOrganizationType person = new PersonOrOrganizationType();

		AirOperator.setOperatingOrganization(person);

		AirService.create(AirOperator);
		
		//retrive
		AircraftOperatorType airRetrieve = AirService.retrieve((long) 86);
		System.out.println(airRetrieve.getDesignatorIcao());
		System.out.println(airRetrieve.getOperatingOrganization());
		
//		System.out.println("----------TAMPILKAN DATA--------------------");
//		System.out.println(AirOperator.getDesignatorIcao());
//		System.out.println(AirOperator.getOperatingOrganization());
//		System.out.println(AirOperator.getHjid());
//		System.out.println("----------TAMPILKAN DATA--------------------");
//		
		//AirService.deleteById((long) 83);

	}
}
