package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.NavigationCapabilitiesType;
import dev.ale.fdx.service.NavigationCapabilitiesService;

public class TestNavigationCapabilities {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//create
		NavigationCapabilitiesService Nservice = context.getBean(NavigationCapabilitiesService.class);
		
		NavigationCapabilitiesType Ncap = new NavigationCapabilitiesType();
		Ncap.setOtherNavigationCapabilities("Amatir");
		
		Nservice.create(Ncap);
		
		//retrieve
		NavigationCapabilitiesType Nretrieve = Nservice.retrieve((long) 448);
		System.out.println("----------- TAMPILKAN DATA ------------------");
		System.out.println(Nretrieve.getOtherNavigationCapabilities());
		System.out.println("----------- TAMPILKAN DATA ------------------");
		//update
		Nretrieve.setOtherNavigationCapabilities("PRO");
		Nservice.update(Nretrieve);
		//delete
		Nservice.deleteById(449L);
	
	}

}
