package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.OtherReferenceType;
import dev.ale.fdx.service.OtherReferenceService;

public class TesOtherReference {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		OtherReferenceService Oservice = context.getBean(OtherReferenceService.class);
		
		OtherReferenceType O = new OtherReferenceType();
		O.setIataDesignator("QZ");
		Oservice.create(O);
		//retrieve
		OtherReferenceType Oretrieve = Oservice.retrieve((long) 455);
		System.out.println("-------- TAMPILKAN DATA ----------------");
		System.out.println(Oretrieve.getIataDesignator());
		System.out.println("----------------------------------------");
		//update
		Oretrieve.setIataDesignator("GA");
		Oservice.update(Oretrieve);
		//delete
		Oservice.deleteById(456L);
	}

}
