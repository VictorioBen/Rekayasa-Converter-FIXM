package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.DinghiesType;
import dev.ale.fdx.entity.flight.SurvivalCapabilitiesType;
import dev.ale.fdx.service.SurvivalCapabilitiesService;

public class TesSurvivalCapabilities {

	public static void main(String [] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		SurvivalCapabilitiesService SurvivalService = context.getBean(SurvivalCapabilitiesService.class);

		SurvivalCapabilitiesType Survival = new SurvivalCapabilitiesType();
		//create
		Survival.setSurvivalEquipmentRemarks("N/");
		DinghiesType Ding = new DinghiesType();
		Survival.setDinghyInformation(Ding);

		SurvivalService.create(Survival);

		//retrieve
		SurvivalCapabilitiesType SurvivalRetrieve = SurvivalService.retrieve((long) 319);
		System.out.println(SurvivalRetrieve.getSurvivalEquipmentRemarks());
		System.out.println(SurvivalRetrieve.getDinghyInformation());

		//delete
		SurvivalService.deleteById((long) 320);
	}

}
