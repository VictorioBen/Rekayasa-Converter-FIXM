package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.TrajectoryPointPropertyType;
import dev.ale.fdx.entity.flight.TrajectoryPointPropertyTypeType;
import dev.ale.fdx.entity.flight.TrajectoryPointReferenceType;
import dev.ale.fdx.service.TrajectoryPointPropertyService;

public class TestTrajectoryPointProperty {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TrajectoryPointPropertyService Tservice = context.getBean(TrajectoryPointPropertyService.class);
		//create
		TrajectoryPointPropertyType T = new TrajectoryPointPropertyType();
		TrajectoryPointPropertyTypeType value = TrajectoryPointPropertyTypeType.valueOf("FIR_BOUNDARY_CROSSING_POINT");
		T.setPropertyType(value);
		TrajectoryPointReferenceType Tref = new TrajectoryPointReferenceType();
		T.setReference(Tref);
		
		Tservice.create(T);
		//retrieve
		TrajectoryPointPropertyType Tretrieve = Tservice.retrieve(728L);
		System.out.println("====================== TAMPILKAN DATA =====================");
		System.out.println(Tretrieve.getPropertyType());
		System.out.println(Tretrieve.getReference());
		System.out.println("===========================================================");
		//update
		Tretrieve.setPropertyType(value);
		Tservice.update(Tretrieve);
		//delete
		Tservice.deleteById(730L);
	}

}
