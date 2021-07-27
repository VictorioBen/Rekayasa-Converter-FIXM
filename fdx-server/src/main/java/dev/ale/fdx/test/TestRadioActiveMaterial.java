package dev.ale.fdx.test;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.FissileExceptedType;
import dev.ale.fdx.entity.flight.RadioactiveMaterialCategoryType;
import dev.ale.fdx.entity.flight.RadioactiveMaterialType;
import dev.ale.fdx.entity.flight.RadionuclideType;
import dev.ale.fdx.service.RadioActiveMaterialService;

public class TestRadioActiveMaterial {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		RadioActiveMaterialService Rservice = context.getBean(RadioActiveMaterialService.class);
		
		RadioactiveMaterialType R = new RadioactiveMaterialType();
		RadioactiveMaterialCategoryType Rcategory = RadioactiveMaterialCategoryType.valueOf("I_WHITE");
		R.setCategory(Rcategory);
		BigDecimal Bcritical = BigDecimal.valueOf(10);
		R.setCriticalitySafetyIndex(Bcritical);
		FissileExceptedType F = FissileExceptedType.valueOf("EXCEPTED");
		R.setFissileExceptedIndicator(F);
		BigDecimal Btransport = BigDecimal.valueOf(20);
		R.setTransportIndex(Btransport);
		RadionuclideType Rnuclide = new RadionuclideType();
		R.setRadionuclide(Rnuclide);
		Rservice.create(R);
		
		//retrieve
		RadioactiveMaterialType Rretrieve = Rservice.retrieve(510L);
		System.out.println("----------------- TAMPILKAN DATA -----------");
		System.out.println(Rretrieve.getCategory());
		System.out.println(Rretrieve.getCriticalitySafetyIndex());
		System.out.println(Rretrieve.getFissileExceptedIndicator());
		System.out.println(Rretrieve.getRadionuclide());
		System.out.println(Rretrieve.getTransportIndex());
		
		//update
		RadioactiveMaterialCategoryType Rmat = RadioactiveMaterialCategoryType.valueOf("III_YELLOW");
		Rretrieve.setCategory(Rmat);
		Rservice.update(Rretrieve);
		
		//delete
		Rservice.deleteById(512L);
	}

}
