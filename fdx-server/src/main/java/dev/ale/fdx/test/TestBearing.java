package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.BearingType;
import dev.ale.fdx.entity.base.ZeroBearingTypeType;
import dev.ale.fdx.service.BearingService;

public class TestBearing {

	public static void main (String [] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BearingService BearService = context.getBean(BearingService.class);
		//create
		BearingType bear = new BearingType();
		ZeroBearingTypeType ZeroBear = ZeroBearingTypeType.valueOf("MAGNETIC_NORTH");
		bear.setZeroBearingType(ZeroBear);
		BearService.create(bear);

		//retrieve
		BearingType BearRetrieve = BearService.retrieve((long) 234);
		System.out.println("------------------- TAMPILKAN DATA ---------------");
		System.out.println(BearRetrieve.getZeroBearingType());
		System.out.println("------------------- TAMPILKAN DATA ---------------");

		//delete 
		BearService.deleteById((long) 233);
	}

}
