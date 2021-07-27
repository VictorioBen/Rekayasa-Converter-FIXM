package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.SurveillanceCapabilitiesType;
import dev.ale.fdx.service.SurveillanceCapabilitiesService;

public class TestSurveillanceCapabilities {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//create
		SurveillanceCapabilitiesService Sservice = context.getBean(SurveillanceCapabilitiesService.class);

		SurveillanceCapabilitiesType S = new SurveillanceCapabilitiesType();

		S.setOtherSurveillanceCapabilities("OTHER");

		Sservice.create(S);
		
		//retrieve
		SurveillanceCapabilitiesType Sretrieve = Sservice.retrieve(674L);
		System.out.println("==================== TAMPIL DATA =================");
		System.out.println(Sretrieve.getOtherSurveillanceCapabilities());
		//update
		Sretrieve.setOtherSurveillanceCapabilities("Capability");
		Sservice.update(Sretrieve);
		//delete
		Sservice.deleteById(675L);
		
	}

}
