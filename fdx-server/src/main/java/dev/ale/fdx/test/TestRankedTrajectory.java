package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.RankedTrajectoryType;
import dev.ale.fdx.entity.flight.RouteTrajectoryType;
import dev.ale.fdx.service.RankedTrajectoryService;

public class TestRankedTrajectory {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		RankedTrajectoryService Rservice = context.getBean(RankedTrajectoryService.class);

		RankedTrajectoryType R = new RankedTrajectoryType();

		R.setIdentifier("1");
		RouteTrajectoryType value = new RouteTrajectoryType();
		R.setRouteTrajectory(value);
		Rservice.create(R);
		//Retrieve
		RankedTrajectoryType Rretrieve = Rservice.retrieve(532L);
		System.out.println("-------------- TAMPILKAN DATA -------------");
		System.out.println(Rretrieve.getIdentifier());
		System.out.println(Rretrieve.getRouteTrajectory());
		System.out.println("--------------------------------------------");
		//Update
		Rretrieve.setIdentifier("2");
		Rservice.update(Rretrieve);
		//delete
		Rservice.deleteById(534L);

	}

}
