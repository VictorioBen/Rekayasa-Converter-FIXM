package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.PressureType;
import dev.ale.fdx.entity.base.UomPressureType;
import dev.ale.fdx.service.PressureService;

public class TestPressure {

	public static void main(String[] args) {

			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			PressureService Pservice = context.getBean(PressureService.class);
			//create
			PressureType P = new PressureType();
			UomPressureType uom = UomPressureType.valueOf("ATM");
			P.setUom(uom);
			P.setValue(10);
			Pservice.create(P);
			//retrieve 
			PressureType Pretrieve = Pservice.retrieve(483L);
			System.out.println(Pretrieve.getUom());
			System.out.println(Pretrieve.getClass());
			//update
			Pretrieve.setValue(8);
			//delete
			Pservice.deleteById(484L);
			
	}

}
