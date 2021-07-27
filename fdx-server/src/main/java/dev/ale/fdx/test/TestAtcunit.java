package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.AtcUnitReferenceType;
import dev.ale.fdx.entity.base.IcaoUnitReferenceType;
import dev.ale.fdx.entity.base.OtherReferenceType;
import dev.ale.fdx.service.AtcunitReferenceService;

public class TestAtcunit {
	
	public static void main(String [] args) {
		
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			AtcunitReferenceService AtService = context.getBean(AtcunitReferenceService.class);
			//CREATE
			IcaoUnitReferenceType icao = new IcaoUnitReferenceType();
			icao.setControlSectorDesignator("Boundaries");
			
			AtService.create(icao);
			
			//RETRIEVE
			System.out.println("------------- TAMPILKAN DATA --------------");
			AtcUnitReferenceType AtRetrieve = AtService.retrieve((long) 231);
			System.out.println(AtRetrieve.getControlSectorDesignator());
			System.out.println("------------- TAMPILKAN DATA --------------");
			
			//delete
			AtService.deleteById((long) 231);
	}

}
