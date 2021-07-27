package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.AirWaybillType;
import dev.ale.fdx.service.AirwayBillService;

public class TestAirwayBill {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AirwayBillService AirwayService = context.getBean(AirwayBillService.class);
		
		AirWaybillType airway = new AirWaybillType();
		
		//Create
		airway.setAirWaybillNumber("20");
		airway.setValue("20");
		AirwayService.create(airway);
		
		
		//RETRIVE
		AirWaybillType airRetrieve = AirwayService.retrieve((long) 92);
		System.out.println("------------- TAMPILKAN DATA --------------");
		System.out.println(airRetrieve.getAirWaybillNumber());
		System.out.println(airRetrieve.getValue());
		System.out.println("------------- TAMPILKAN DATA --------------");
		//AirwayService.deleteById((long) 90);
		//AirwayService.delete(airway);
	}

}
