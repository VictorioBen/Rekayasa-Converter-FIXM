package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.RelativePointType;
import dev.ale.fdx.entity.base.SignificantPointType;
import dev.ale.fdx.entity.flight.ElapsedTimeLocationType;
import dev.ale.fdx.service.ElapsedTimeLocationService;

public class TestElapsedTimeLocation {
	
		public static void main(String [] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			ElapsedTimeLocationService ElapsedService = context.getBean(ElapsedTimeLocationService.class);
			//create
			ElapsedTimeLocationType Elapsed = new ElapsedTimeLocationType();
			Elapsed.setLongitude(106.660568);
			Elapsed.setRegion("Indonesia");
			RelativePointType Repon = new RelativePointType();
			Elapsed.setPoint(Repon);
			
			ElapsedService.create(Elapsed);
			//retrieve
			ElapsedTimeLocationType ElapsedRetrieve = ElapsedService.retrieve((long) 337);
			System.out.println(ElapsedRetrieve.getRegion());
			System.out.println(ElapsedRetrieve.getLongitude());
			System.out.println(ElapsedRetrieve.getPoint());
			
			//delete
			ElapsedService.deleteById((long) 337);
			
		}

}
