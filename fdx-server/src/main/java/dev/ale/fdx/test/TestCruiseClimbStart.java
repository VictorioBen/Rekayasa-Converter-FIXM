package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.FlightLevelOrAltitudeChoiceType;
import dev.ale.fdx.entity.base.TrueAirspeedChoiceType;
import dev.ale.fdx.entity.base.TrueAirspeedType;
import dev.ale.fdx.entity.flight.AtOrAboveAltitudeIndicatorType;
import dev.ale.fdx.entity.flight.CruiseClimbStartType;
import dev.ale.fdx.service.CruiseClimbService;

public class TestCruiseClimbStart {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CruiseClimbService CruiseService = context.getBean(CruiseClimbService.class);

		//create
		CruiseClimbStartType CruiseClimb = new CruiseClimbStartType();
		AtOrAboveAltitudeIndicatorType AltIndicator = AtOrAboveAltitudeIndicatorType.valueOf("AT_OR_ABOVE_ALTITUDE");
		CruiseClimb.setAtOrAboveAltitude(AltIndicator);
		FlightLevelOrAltitudeChoiceType FlightChoice = new FlightLevelOrAltitudeChoiceType();
		CruiseClimb.setLevel(FlightChoice);
		TrueAirspeedType Air = new TrueAirspeedType();
		CruiseClimb.setSpeed(Air);
		CruiseService.create(CruiseClimb);

		//retrieve

	}

}
