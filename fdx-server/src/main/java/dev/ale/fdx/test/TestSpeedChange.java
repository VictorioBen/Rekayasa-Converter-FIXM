package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TrueAirspeedType;
import dev.ale.fdx.entity.flight.ActivationType;
import dev.ale.fdx.entity.flight.SpeedChangeType;
import dev.ale.fdx.service.SpeedChangeService;

public class TestSpeedChange {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SpeedChangeService Sservice = context.getBean(SpeedChangeService.class);
		SpeedChangeType S = new SpeedChangeType();
		ActivationType value = ActivationType.valueOf("PLAN_TO_ATTAIN");
		S.setActivation(value);
		TrueAirspeedType air = new TrueAirspeedType();
		S.setSpeed(air);
		
		Sservice.create(S);
		//retrieve 
		SpeedChangeType Sretrieve = Sservice.retrieve(615L);
		System.out.println("--------- TAMPIL DATA ------------");
		System.out.println(Sretrieve.getActivation());
		System.out.println(Sretrieve.getSpeed());
		System.out.println("----------------------------------");
		//update
		ActivationType activ = ActivationType.valueOf("PLAN_TO_COMMENCE");
		Sretrieve.setActivation(activ);
		Sservice.update(Sretrieve);
//		//delete
		Sservice.deleteById(623L);

	}

}
