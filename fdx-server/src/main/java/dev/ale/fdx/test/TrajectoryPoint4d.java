package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.FlightLevelOrAltitudeType;
import dev.ale.fdx.entity.base.IndicatedAirspeedType;
import dev.ale.fdx.entity.base.PressureType;
import dev.ale.fdx.entity.base.VerticalRangeType;
import dev.ale.fdx.entity.flight.MeteorologicalDataType;
import dev.ale.fdx.entity.flight.Point4DTimeChoiceType;
import dev.ale.fdx.entity.flight.TrajectoryPoint4DType;
import dev.ale.fdx.service.TrajectoryPoint4dService;

public class TrajectoryPoint4d {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		TrajectoryPoint4dService Tservice = context.getBean(TrajectoryPoint4dService.class);

		TrajectoryPoint4DType T = new TrajectoryPoint4DType();
		PressureType press = new PressureType();
		T.setAltimeterSetting(press);
		FlightLevelOrAltitudeType F = new FlightLevelOrAltitudeType();
		T.setLevel(F);
		MeteorologicalDataType meteor = new MeteorologicalDataType();
		T.setMetData(meteor);
		IndicatedAirspeedType air = new IndicatedAirspeedType();
		T.setPredictedAirspeed(air);
		T.setSrsName("CAPT RIO");
		Point4DTimeChoiceType point = new Point4DTimeChoiceType();
		T.setTime(point);
		VerticalRangeType v = new VerticalRangeType();
		T.setVerticalRange(v);
		Tservice.create(T);
		//retrieve
		System.out.println("================= TAMPIL DATA ==================");
		TrajectoryPoint4DType Tretrieve = Tservice.retrieve(707L);
		System.out.println(Tretrieve.getSrsName());
		System.out.println(Tretrieve.getMetData());
		System.out.println(Tretrieve.getPointProperty());
		System.out.println(Tretrieve.getPredictedAirspeed());
		System.out.println("=================================================");
		//update
		Tretrieve.setSrsName("CAPT Ben");
		//delete
		Tservice.deleteById(714L);
	}

}
