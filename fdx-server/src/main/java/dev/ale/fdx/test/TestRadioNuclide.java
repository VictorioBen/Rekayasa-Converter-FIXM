package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.RadioactivityType;
import dev.ale.fdx.entity.flight.MaterialDispersabilityType;
import dev.ale.fdx.entity.flight.RadionuclideType;
import dev.ale.fdx.entity.flight.SpecialFormType;
import dev.ale.fdx.service.RadioNuclideService;

public class TestRadioNuclide {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		RadionuclideType Rnuclide = new RadionuclideType();

		RadioNuclideService Rservice = context.getBean(RadioNuclideService.class);
		MaterialDispersabilityType value = MaterialDispersabilityType.valueOf("LOW_DISPERSIBLE");
		Rnuclide.setLowDispersibleMaterialIndicator(value);
		Rnuclide.setPhysicalChemicalForm("Physical");
		Rnuclide.setRadionuclideId("1");
		Rnuclide.setRadionuclideName("");
		SpecialFormType Special = SpecialFormType.valueOf("SPECIAL_FORM");
		Rnuclide.setSpecialFormIndicator(Special);
		RadioactivityType Radio = new RadioactivityType();
		Rnuclide.setActivity(Radio);

		Rservice.create(Rnuclide);
		//retrieve 
		RadionuclideType Rretrieve = Rservice.retrieve(526L);
		System.out.println("------------ TAMPILKAN DATA ----------");
		System.out.println(Rretrieve.getPhysicalChemicalForm());
		System.out.println(Rretrieve.getRadionuclideId());
		System.out.println(Rretrieve.getRadionuclideName());
		System.out.println(Rretrieve.getLowDispersibleMaterialIndicator());
		System.out.println(Rretrieve.getSpecialFormIndicator());
		//update
		Rretrieve.setRadionuclideId("2");
		Rservice.update(Rretrieve);
		//delete
		Rservice.deleteById(528L);
	}

}
