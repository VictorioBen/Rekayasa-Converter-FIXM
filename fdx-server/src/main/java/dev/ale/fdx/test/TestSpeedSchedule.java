package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.IndicatedAirspeedType;
import dev.ale.fdx.entity.flight.SpeedScheduleType;
import dev.ale.fdx.service.SpeedScheduleService;

public class TestSpeedSchedule {

	public static void main(String[] args) {

			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			SpeedScheduleService Sservice = context.getBean(SpeedScheduleService.class);
			
			SpeedScheduleType S = new SpeedScheduleType();
			IndicatedAirspeedType air = new IndicatedAirspeedType();
			S.setInitialSpeed(air);
			IndicatedAirspeedType indi = new IndicatedAirspeedType();
			S.setSubsequentSpeed(indi);
			
			Sservice.create(S);
			//retrieve
			SpeedScheduleType Sretrieve = Sservice.retrieve((long) 641);
			System.out.println("------------- TAMPIL DATA ----------------");
			System.out.println(Sretrieve.getInitialSpeed());
			System.out.println(Sretrieve.getSubsequentSpeed());
			//update
			Sretrieve.setInitialSpeed(air);
			Sservice.update(Sretrieve);
			//delete
			Sservice.deleteById((long) 638);
			
	}

}
