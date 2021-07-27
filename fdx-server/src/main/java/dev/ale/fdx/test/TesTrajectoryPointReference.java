package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.TrajectoryPointReferenceType;
import dev.ale.fdx.service.TrajectoryPointReferenceService;

public class TesTrajectoryPointReference {

	public static void main(String[] args) {

			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			TrajectoryPointReferenceService Tservice = context.getBean(TrajectoryPointReferenceService.class);
			
			TrajectoryPointReferenceType T = new TrajectoryPointReferenceType();
			
			T.setIdentifier("left");
			T.setType("200m");
			Tservice.create(T);
			//retrieve
			TrajectoryPointReferenceType Tretrieve = Tservice.retrieve(734L);
			System.out.println(Tretrieve.getIdentifier());
			System.out.println(Tretrieve.getType());
			//update
			Tretrieve.setType("400m");
			//delete
			Tservice.deleteById(735L);
	}

}
