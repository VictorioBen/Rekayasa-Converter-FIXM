package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TemperatureType;
import dev.ale.fdx.entity.flight.TemperaturesType;
import dev.ale.fdx.service.TemperaturesService;

public class TestTemperatures {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		TemperaturesService Tservice = context.getBean(TemperaturesService.class);

		TemperaturesType T = new TemperaturesType();
		TemperatureType Temp = new TemperatureType();
		T.setControlTemperature(Temp);
		T.setEmergencyTemperature(Temp);
		T.setFlashpointTemperature(Temp);

		Tservice.create(T);
		//Retrieve
		TemperaturesType Tretrieve = Tservice.retrieve(681L);
		System.out.println("============ TAMPILKAN DATAT ===========");
		System.out.println(Tretrieve.getControlTemperature());
		System.out.println(Tretrieve.getEmergencyTemperature());
		System.out.println(Tretrieve.getFlashpointTemperature());
		//Update
		Tretrieve.setControlTemperature(Temp);
		Tservice.update(Tretrieve);
		//deelte
		Tservice.deleteById(685L);

	}

}
