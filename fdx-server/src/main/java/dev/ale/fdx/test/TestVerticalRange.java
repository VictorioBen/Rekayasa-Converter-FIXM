package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.FlightLevelOrAltitudeType;
import dev.ale.fdx.entity.base.VerticalRangeType;
import dev.ale.fdx.service.VerticalRangeService;

public class TestVerticalRange {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		VerticalRangeService Vservice = context.getBean(VerticalRangeService.class);
		VerticalRangeType V = new VerticalRangeType();
		FlightLevelOrAltitudeType F = new FlightLevelOrAltitudeType();
		V.setLowerBound(F);
		V.setUpperBound(F);
		Vservice.create(V);
		//retrieve
		VerticalRangeType Vretrieve = Vservice.retrieve(755L);
		System.out.println("=================== TAMPIL DATA =================");
		System.out.println(Vretrieve.getLowerBound());
		System.out.println(Vretrieve.getUpperBound());
		System.out.println("=================================================");
		//update
		Vretrieve.setLowerBound(F);
		Vservice.update(Vretrieve);
		//delete
		Vservice.deleteById(756L);
	}

}
