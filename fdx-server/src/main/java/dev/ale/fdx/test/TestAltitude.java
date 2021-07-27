package dev.ale.fdx.test;

import org.hibernate.type.EnumType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.AltitudeType;
import dev.ale.fdx.entity.base.UomAltitudeType;
import dev.ale.fdx.service.AltitudeService;

public class TestAltitude {

	public static void main(String []args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AltitudeService AlService = context.getBean(AltitudeService.class);

		AltitudeType alt = new AltitudeType();
		//create
		UomAltitudeType uom = UomAltitudeType.valueOf("FT");
		alt.setUom(uom);
		alt.setValue(100);
		AlService.update(alt);
		//retrieve
		AltitudeType AllRetrieve = AlService.retrieve((long) 95);
		System.out.println("------------- TAMPILKAN DATA --------------");
		System.out.println(AllRetrieve.getUom());
		System.out.println(AllRetrieve.getValue());
		System.out.println("------------- TAMPILKAN DATA --------------");
		//AlService.deleteById((long) 95);

	}
}
