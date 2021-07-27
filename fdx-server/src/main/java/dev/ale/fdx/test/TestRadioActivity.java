package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.RadioactivityType;
import dev.ale.fdx.entity.base.UomRadioactivityType;
import dev.ale.fdx.service.RadioActivityService;

public class TestRadioActivity {

	public static void main(String[] args) {
		
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			RadioActivityService Rservice = context.getBean(RadioActivityService.class);
			
			RadioactivityType R = new RadioactivityType();
			UomRadioactivityType value = UomRadioactivityType.valueOf("BQ");
			R.setUom(value);
			R.setValue(10);
			
			Rservice.create(R);
			//retrieve
			RadioactivityType Rretrieve = Rservice.retrieve(516L);
			System.out.println("---------- TAMPILKAN DATA ---------");
			System.out.println(Rretrieve.getUom());
			System.out.println(Rretrieve.getValue());
			System.out.println("-----------------------------------");
			//Update
			UomRadioactivityType Uom = UomRadioactivityType.valueOf("G");
			Rretrieve.setUom(Uom);
			Rservice.update(Rretrieve);
			//Delete
			Rservice.deleteById(518L);
			//Rservice.deleteById(id);
	}

}
