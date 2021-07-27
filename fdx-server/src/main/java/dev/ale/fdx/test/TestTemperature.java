package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TemperatureType;
import dev.ale.fdx.entity.base.UomTemperatureType;
import dev.ale.fdx.service.TemperatureService;

public class TestTemperature {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TemperatureService Tservice = context.getBean(TemperatureService.class);
		//create
		TemperatureType T = new TemperatureType();
		UomTemperatureType value = UomTemperatureType.valueOf("K");
		T.setUom(value);
		T.setValue(8);
		Tservice.create(T);
		//retireve
		TemperatureType Tretrieve = Tservice.retrieve(689L);
		System.out.println("========== TAMPIL DATA ==============");
		System.out.println(Tretrieve.getUom());
		System.out.println(Tretrieve.getValue());
		System.out.println("=====================================");
		//UPDATE
		UomTemperatureType uom = UomTemperatureType.valueOf("F");
		Tretrieve.setUom(uom);
		//Delete
		Tservice.deleteById(690L);
	}

}
