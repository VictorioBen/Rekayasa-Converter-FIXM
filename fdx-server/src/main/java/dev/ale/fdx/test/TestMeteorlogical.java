package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TemperatureType;
import dev.ale.fdx.entity.base.WindDirectionType;
import dev.ale.fdx.entity.base.WindSpeedType;
import dev.ale.fdx.entity.flight.MeteorologicalDataType;
import dev.ale.fdx.entity.messaging.MessageType;
import dev.ale.fdx.service.MeteorologicalDataService;


public class TestMeteorlogical {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MeteorologicalDataService Mservice = context.getBean(MeteorologicalDataService.class);

		MeteorologicalDataType M = new MeteorologicalDataType();
		TemperatureType T = new TemperatureType();
		M.setTemperature(T);
		WindDirectionType W = new WindDirectionType();
		M.setWindDirection(W);
		WindSpeedType Ws = new WindSpeedType();
		M.setWindSpeed(Ws);

		Mservice.create(M);
	}

}
