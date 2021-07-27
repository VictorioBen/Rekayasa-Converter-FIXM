package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.ColourChoiceType;
import dev.ale.fdx.entity.flight.DinghiesType;
import dev.ale.fdx.entity.flight.DinghyCoverIndicatorType;
import dev.ale.fdx.service.DinghiesService;

public class TestDinghiest extends Object {

		public static void main(String [] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			DinghiesService DingService = context.getBean(DinghiesService.class);
			
			DinghiesType Ding = new DinghiesType();
			DinghyCoverIndicatorType Dinghy = DinghyCoverIndicatorType.valueOf("COVERED");
			Ding.setCovered(Dinghy);
			Ding.setNumber(8);
			Ding.setTotalCapacity(8);
			ColourChoiceType ColourChoice = new ColourChoiceType();
			Ding.setColour(ColourChoice);
			
			DingService.create(Ding);
			
			//retrieve 
			DinghiesType DingRetrieve = DingService.retrieve((long) 329);
			System.out.println(DingRetrieve.getCovered());
			
			//delete
			DingService.deleteById((long) 331);
			
			
		}
}
