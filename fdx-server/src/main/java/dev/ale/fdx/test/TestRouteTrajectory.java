package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.WeightType;
import dev.ale.fdx.entity.flight.FlightRouteInformationType;
import dev.ale.fdx.entity.flight.PerformanceProfileType;
import dev.ale.fdx.entity.flight.RouteTrajectoryType;
import dev.ale.fdx.entity.flight.SpeedScheduleType;
import dev.ale.fdx.service.RouteTrajectoryService;

public class TestRouteTrajectory {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		RouteTrajectoryService Rservice = context.getBean(RouteTrajectoryService.class);
		//create
		RouteTrajectoryType R = new RouteTrajectoryType();
		PerformanceProfileType Pp = new PerformanceProfileType();
		R.setClimbProfile(Pp);
		SpeedScheduleType Ss = new SpeedScheduleType();
		R.setClimbSchedule(Ss);
		R.setDescentProfile(Pp);
		R.setDescentSchedule(Ss);
		FlightRouteInformationType F = new FlightRouteInformationType();
		R.setRouteInformation(F);
		WeightType W = new WeightType();
		R.setTakeoffWeight(W);
		Rservice.create(R);
		//retrieve
		RouteTrajectoryType Rretrieve = Rservice.retrieve(569L);
		System.out.println("----------- TAMPIL DATA -----------");
		System.out.println(Rretrieve.getRouteInformation());
		System.out.println(Rretrieve.getTakeoffWeight());
		//update
		Rretrieve.setTakeoffWeight(W);
		Rservice.update(Rretrieve);
		//delete
		Rservice.deleteById(569L);

	}

}
