package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.HazardClassType;
import dev.ale.fdx.service.HazardClassService;

public class TestHazard {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HazardClassService Hservice = context.getBean(HazardClassService.class);
		
		HazardClassType Hazard = new HazardClassType();
		
		Hazard.setHazardDivision(8);
		Hazard.setValue(8);
		
		Hservice.create(Hazard);
		
		 

	}

}
