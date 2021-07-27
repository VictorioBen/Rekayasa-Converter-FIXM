package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.GroundSpeedType;
import dev.ale.fdx.entity.base.UomGroundSpeedType;
import dev.ale.fdx.service.GroundSpeedService;

public class TestGroundSpeed {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		GroundSpeedService Gservice = context.getBean(GroundSpeedService.class);
		
		GroundSpeedType Ground = new GroundSpeedType();
		UomGroundSpeedType uom = UomGroundSpeedType.valueOf("KT");
		Ground.setUom(uom);
		Ground.setValue(8);
		
		Gservice.create(Ground);
		

	}

}
