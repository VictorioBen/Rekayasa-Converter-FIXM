package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.UomWindSpeedType;
import dev.ale.fdx.entity.base.WindSpeedType;
import dev.ale.fdx.service.WindSpeedService;

public class TestWindSpeed {

	public static void main(String[] args) {

			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			//create
			WindSpeedService Wservice = context.getBean(WindSpeedService.class);
			WindSpeedType W = new WindSpeedType();
			UomWindSpeedType value = UomWindSpeedType.valueOf("KT");
			W.setUom(value);
			W.setValue(8);
			
			Wservice.create(W);
			//retrieve
			WindSpeedType Wretrieve = Wservice.retrieve(768L);
			System.out.println("====================== TAMPIL DATA ===================");
			System.out.println(Wretrieve.getUom());
			System.out.println(Wretrieve.getValue());
			System.out.println("===============================================");
			//UPDATE
			Wretrieve.setValue(9);
			//delete
			Wservice.deleteById(768L);
			
	}

}
