package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TrueAirspeedChoiceType;
import dev.ale.fdx.entity.base.TrueAirspeedRangeType;
import dev.ale.fdx.entity.base.TrueAirspeedType;
import dev.ale.fdx.service.TrueAirSpeedChoiceService;

public class TestTrueAirspeedChoice {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		TrueAirSpeedChoiceService Tservice = context.getBean(TrueAirSpeedChoiceService.class);
		//create
		TrueAirspeedChoiceType T = new TrueAirspeedChoiceType();
		TrueAirspeedRangeType True = new TrueAirspeedRangeType();
		T.setAirspeedRange(True);
		TrueAirspeedType air = new TrueAirspeedType();
		T.setAirspeedValue(air);
		Tservice.create(T);
		//retrieve
		TrueAirspeedChoiceType Tretrieve = Tservice.retrieve(737L);
		System.out.println("====================TAMPILKAN DATA ===================");
		System.out.println(Tretrieve.getAirspeedRange());
		System.out.println(Tretrieve.getAirspeedValue());
		//update
		Tretrieve.setAirspeedRange(True);
		//delete
		Tservice.deleteById(740L);


	}

}
