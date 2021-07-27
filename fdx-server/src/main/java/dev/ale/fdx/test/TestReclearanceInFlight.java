package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.AerodromeReferenceType;
import dev.ale.fdx.entity.base.OtherReferenceType;
import dev.ale.fdx.entity.flight.ReclearanceInFlightType;
import dev.ale.fdx.service.ReclearanceInFlightService;

public class TestReclearanceInFlight {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ReclearanceInFlightService Rservice = context.getBean(ReclearanceInFlightService.class);

		ReclearanceInFlightType R = new ReclearanceInFlightType();

		R.setRouteToRevisedDestination("WII");
		OtherReferenceType other = new OtherReferenceType();
		R.setFiledRevisedDestinationAerodrome(other);

		Rservice.create(R);
		//retrieve
		ReclearanceInFlightType Rretrieve = Rservice.retrieve(540L);
		System.out.println("---------- TAMPILKAN DATA ----------------");
		System.out.println(Rretrieve.getRouteToRevisedDestination());
		System.out.println(Rretrieve.getFiledRevisedDestinationAerodrome());
		//update
		Rretrieve.setRouteToRevisedDestination("CGK");
		Rservice.update(Rretrieve);
		//delete
		Rservice.deleteById(542L);
	}

}
