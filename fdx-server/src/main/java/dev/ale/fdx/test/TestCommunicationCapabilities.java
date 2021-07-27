package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.CommunicationCapabilitiesType;
import dev.ale.fdx.service.CommunicationCapabilitiesService;

public class TestCommunicationCapabilities {

	public static void main(String [] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CommunicationCapabilitiesService ComCapService = context.getBean(CommunicationCapabilitiesService.class);
		//create
		CommunicationCapabilitiesType ComCap  = new CommunicationCapabilitiesType();
		ComCap.setOtherCommunicationCapabilities("Other");
		ComCap.setOtherDatalinkCapabilities("Datalink");
		ComCap.setSelectiveCallingCode("Selective");

		ComCapService.create(ComCap);
		
		//retreive
		CommunicationCapabilitiesType ComCapRetrieve = ComCapService.retrieve((long) 251);
		System.out.println("------------------ TAMPILKAN DATA ------------------------");
		System.out.println(ComCapRetrieve.getOtherCommunicationCapabilities());
		System.out.println(ComCapRetrieve.getOtherDatalinkCapabilities());
		System.out.println("------------------ TAMPILKAN DATA ------------------------");
		//delete
		ComCapService.deleteById((long ) 252);
		
	}

}
