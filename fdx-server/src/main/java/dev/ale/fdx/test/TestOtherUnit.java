package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.GeographicalPositionType;
import dev.ale.fdx.entity.base.OtherReferenceType;
import dev.ale.fdx.entity.base.OtherUnitReferenceType;
import dev.ale.fdx.service.OtherUnitReferenceService;

public class TestOtherUnit {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		OtherUnitReferenceService Oservice = context.getBean(OtherUnitReferenceService.class);
		//create
		OtherUnitReferenceType O = new OtherUnitReferenceType();
		O.setAtcUnitNameOrAlternate("JATSC");
		GeographicalPositionType GeoPos = new GeographicalPositionType();
		O.setPosition(GeoPos);

		Oservice.create(O);
		
		//retrieve
		OtherUnitReferenceType Oretrieve = Oservice.retrieve(458L);
		System.out.println("--------------- TAMPILKAN DATA ---------------");
		System.out.println(Oretrieve.getAtcUnitNameOrAlternate());
		//update
		Oretrieve.setAtcUnitNameOrAlternate("MATSC");
		Oservice.update(Oretrieve);
		//delete
		Oservice.deleteById((long) 460);

	}

}
