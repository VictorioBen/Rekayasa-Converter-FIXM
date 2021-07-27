package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.LastContactType;
import dev.ale.fdx.entity.flight.RadioCommunicationFailureType;
import dev.ale.fdx.service.RadioCommunicationFailureService;

public class TestRadioCommunicationFailure {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		RadioCommunicationFailureService Rservice = context.getBean(RadioCommunicationFailureService.class);
		//create
		RadioCommunicationFailureType R = new RadioCommunicationFailureType();
		R.setRadioFailureRemarks("Warning");
		R.setRemainingComCapability("On going");
		LastContactType value = new LastContactType();
		R.setContact(value);
		Rservice.create(R);
		
		//retrieve
		RadioCommunicationFailureType Rretrieve = Rservice.retrieve(520L);
		System.out.println("------------- TAMPILKAN DATA ----------------");
		System.out.println(Rretrieve.getRadioFailureRemarks());
		System.out.println(Rretrieve.getRemainingComCapability());
		System.out.println(Rretrieve.getContact());
		System.out.println("---------------------------------------------");
		//update
		Rretrieve.setRemainingComCapability("Service");
		Rservice.update(Rretrieve);
		//delete
		Rservice.deleteById(522L);
	}

}
