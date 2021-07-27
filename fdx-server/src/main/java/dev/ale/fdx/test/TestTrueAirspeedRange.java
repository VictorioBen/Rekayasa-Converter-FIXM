package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TrueAirspeedRangeType;
import dev.ale.fdx.entity.base.TrueAirspeedType;
import dev.ale.fdx.service.TrueAirSpeedRangeService;

public class TestTrueAirspeedRange {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		TrueAirSpeedRangeService Tservice = context.getBean(TrueAirSpeedRangeService.class);

		TrueAirspeedRangeType T = new TrueAirspeedRangeType();
		TrueAirspeedType value = new TrueAirspeedType();
		T.setLowerSpeed(value);
		T.setUpperSpeed(value);

		Tservice.create(T);
		//retrieve 
		TrueAirspeedRangeType Tretrieve = Tservice.retrieve((long) 746);
		System.out.println("================== TAMPILKAN DATA =====================");
		System.out.println(Tretrieve.getLowerSpeed());
		System.out.println(Tretrieve.getUpperSpeed());
		System.out.println("=======================================================");
		//update
		Tretrieve.setLowerSpeed(value);
		Tservice.update(Tretrieve);
		//delete
		Tservice.deleteById(748L);
	}


}
