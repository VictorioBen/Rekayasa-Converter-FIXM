package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.DistanceType;
import dev.ale.fdx.entity.base.PositionPointType;
import dev.ale.fdx.entity.base.SignificantPointType;
import dev.ale.fdx.entity.flight.EnRouteDelayType;
import dev.ale.fdx.entity.flight.FlightRouteElementType;
import dev.ale.fdx.entity.flight.FlightRulesType;
import dev.ale.fdx.entity.flight.ModifiedRouteItemIndicatorType;
import dev.ale.fdx.entity.flight.RouteDesignatorToNextElementType;
import dev.ale.fdx.entity.flight.RouteTruncationIndicatorType;
import dev.ale.fdx.entity.flight.SidStarAbbreviatedDesignatorToNextElementType;
import dev.ale.fdx.entity.flight.TrajectoryPoint4DType;
import dev.ale.fdx.service.FlightRouteElementService;

public class TestFlightRouteElement {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		FlightRouteElementType Flight = new FlightRouteElementType();

		FlightRouteElementService Fservice = context.getBean(FlightRouteElementService.class);
		FlightRulesType rules = FlightRulesType.valueOf("IFR");
		Flight.setFlightRulesChange(rules);
		ModifiedRouteItemIndicatorType mod = ModifiedRouteItemIndicatorType.valueOf("MODIFIED_ROUTE_ITEM");
		Flight.setModified(mod);
		Flight.setModifiedRouteItemReference("Modified");
		RouteTruncationIndicatorType route = RouteTruncationIndicatorType.valueOf("ROUTE_TRUNCATION");
		Flight.setRouteTerminationIndicator(route);
		Flight.setRouteTruncationIndicator(route);
		Flight.setSeqNum(8);
		DistanceType distance = new DistanceType();
		Flight.setAlongRouteDistance(distance);
		EnRouteDelayType enroute = new EnRouteDelayType();
		Flight.setEnRouteDelay(enroute);
		TrajectoryPoint4DType trajec = new TrajectoryPoint4DType();
		Flight.setPoint4D(trajec);
		RouteDesignatorToNextElementType next = new RouteDesignatorToNextElementType();
		Flight.setRouteDesignatorToNextElement(next);
		PositionPointType Pospon = new PositionPointType();
		Flight.setRoutePoint(Pospon);
		SidStarAbbreviatedDesignatorToNextElementType SidStar = new SidStarAbbreviatedDesignatorToNextElementType();
		Flight.setSidStarAbbreviatedDesignatorToNextElement(SidStar);


		Fservice.create(Flight);

		//retrieve
		FlightRouteElementType Fupdate = Fservice.retrieve((long) 388);
		System.out.println("------------- TAMPILKAN DATA --------------");
		System.out.println(Fupdate.getModifiedRouteItemReference());
		System.out.println(Fupdate.getAlongRouteDistance());
		System.out.println(Fupdate.getEnRouteDelay());
		System.out.println(Fupdate.getFlightRulesChange());
		System.out.println(Fupdate.getRouteDesignatorToNextElement());
		System.out.println(Fupdate.getRoutePoint());
		System.out.println(Fupdate.getRouteTerminationIndicator());
		System.out.println(Fupdate.getRouteTruncationIndicator());
		System.out.println(Fupdate.getSeqNum());
		System.out.println(Fupdate.getSidStarAbbreviatedDesignatorToNextElement());
		System.out.println("-------------- TAMPILKAN DATA ---------------");

		//delete
		Fservice.deleteById((long) 395);
	}

}
