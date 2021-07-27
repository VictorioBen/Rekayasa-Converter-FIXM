package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.AltitudeInTransitionType;
import dev.ale.fdx.entity.flight.BoundaryCrossingConditionType;
import dev.ale.fdx.entity.flight.BoundaryCrossingType;
import dev.ale.fdx.service.AltitudeIntransitionService;

public class TestAltitudeTransition {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AltitudeIntransitionService IntranService = context.getBean(AltitudeIntransitionService.class);

		AltitudeInTransitionType altitude = new AltitudeInTransitionType();
		//create
		BoundaryCrossingConditionType Bouncros = BoundaryCrossingConditionType.valueOf("AT_OR_BELOW");
		altitude.setCrossingCondition(Bouncros);
		IntranService.create(altitude);
		//retrieve
		AltitudeInTransitionType alRetrieve = IntranService.retrieve((long) 101);
		System.out.println("---------------TAMPILKAN DATA------------------ ");
		System.out.println(alRetrieve.getCrossingCondition());
		System.out.println("---------------TAMPILKAN DATA -------------------");

		//delete
		//IntranService.deleteById((long) 100);
	}

}
