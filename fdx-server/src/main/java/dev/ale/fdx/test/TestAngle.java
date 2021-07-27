package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.AngleType;
import dev.ale.fdx.entity.base.UomAngleType;
import dev.ale.fdx.service.AngleService;

public class TestAngle {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AngleService angleService = context.getBean(AngleService.class);
		//create
		AngleType angle = new AngleType();
		UomAngleType uom = UomAngleType.valueOf("DEG");
		angle.setUom(uom);
		angle.setValue(10);
		angleService.create(angle);
		
		//retrieve
		AngleType angleRetrieve = angleService.retrieve((long) 229);
		System.out.println("------------- TAMPILKAN DATA --------------");
		System.out.println(angleRetrieve.getUom());
		System.out.println(angleRetrieve.getValue());
		System.out.println("------------- TAMPILKAN DATA --------------");
		//delete
	}

}
