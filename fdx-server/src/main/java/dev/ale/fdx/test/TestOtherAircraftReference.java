package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.OtherAircraftTypeReferenceType;
import dev.ale.fdx.service.OtherAircraftPereferenceService;

public class TestOtherAircraftReference {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		OtherAircraftPereferenceService Oservice = context.getBean(OtherAircraftPereferenceService.class);
		//create
		OtherAircraftTypeReferenceType O = new OtherAircraftTypeReferenceType();
		O.setOtherAircraftType("Other");
		
		Oservice.create(O);
		//retrieve 
		OtherAircraftTypeReferenceType Oretrieve = Oservice.retrieve((long) 451);
		System.out.println(Oretrieve.getOtherAircraftType());
		//update
		Oretrieve.setOtherAircraftType("Hybrid Air Vechile");
		Oservice.update(Oretrieve);
		//delete
		Oservice.deleteById(453L);
		
	}

}
