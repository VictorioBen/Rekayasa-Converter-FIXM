package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.SsrCodeType;
import dev.ale.fdx.entity.flight.BoundaryCrossingType;
import dev.ale.fdx.entity.flight.EnRouteType;
import dev.ale.fdx.service.EnrouteService;

public class TestEnroute {
	
	public static void main(String [] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EnrouteService EnService = context.getBean(EnrouteService.class);
		
		EnRouteType EnRoute = new EnRouteType();
		
		EnRoute.setCurrentModeACode("A");
		BoundaryCrossingType Boncros = new BoundaryCrossingType();
		EnRoute.setBoundaryCrossingCoordination(Boncros);
		SsrCodeType ssrcode = new SsrCodeType();
		EnRoute.setCurrentSsrCode(ssrcode);
		
		EnService.create(EnRoute);
		
		//retrieve
		
		EnRouteType EnRetrieve = EnService.retrieve((long) 344);
		System.out.println(EnRetrieve.getCurrentModeACode());
		System.out.println(EnRetrieve.getBoundaryCrossingCoordination());
		System.out.println(EnRetrieve.getCurrentSsrCode());
		
		//delete
		EnService.deleteById((long) 38);
	}

}
