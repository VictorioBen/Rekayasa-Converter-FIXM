package dev.ale.fdx.test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.DurationAsString;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.EnRouteDelayType;
import dev.ale.fdx.entity.flight.EnRouteDelayTypeType;
import dev.ale.fdx.service.EnrouteDelayService;

public class TestEnrouteDelay {
	
	public static void main(String [] args) throws DatatypeConfigurationException {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EnrouteDelayService EnDelayService = context.getBean(EnrouteDelayService.class);
		//create
		EnRouteDelayType EnrouteDelay = new EnRouteDelayType();
		EnrouteDelay.setDelayReference("Security Delay");
		EnRouteDelayTypeType EnDelayType = EnRouteDelayTypeType.valueOf("AU_REQUEST_SEGMENT");
		EnrouteDelay.setDelayType(EnDelayType);
		Duration duration = DatatypeFactory.newInstance().newDuration(60);
		EnrouteDelay.setDelayValue(duration);
		
		EnDelayService.create(EnrouteDelay);
		
		//retrieve
		EnRouteDelayType EnRouteRetrieve = EnDelayService.retrieve((long) 341);
		System.out.println(EnRouteRetrieve.getDelayReference());
		System.out.println(EnRouteRetrieve.getDelayValueItem());
		System.out.println(EnRouteRetrieve.getDelayType());
		
		//delete
		EnDelayService.deleteById((long) 342);
	}

}
