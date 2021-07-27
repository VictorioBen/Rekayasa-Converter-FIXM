package dev.ale.fdx.test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.DurationAsString;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.ElapsedTimeLocationType;
import dev.ale.fdx.entity.flight.EstimatedElapsedTimeType;
import dev.ale.fdx.service.EstimatedelapsedTimeService;

public class TestEstimedTime {

	public static void main(String[] args) throws DatatypeConfigurationException  {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EstimatedelapsedTimeService EsService = context.getBean(EstimatedelapsedTimeService.class);
		EstimatedElapsedTimeType EsType = new EstimatedElapsedTimeType();
		EsType.setSeqNum(8);
		ElapsedTimeLocationType Elapsed = new ElapsedTimeLocationType();
		Elapsed.setLongitude(106.660568);
		EsType.setLocation(Elapsed);
		Duration duration = DatatypeFactory.newInstance().newDuration(60);
		EsType.setElapsedTime(duration);

		EsService.update(EsType);

		//retrieve 
		EstimatedElapsedTimeType EsRetrieve = EsService.retrieve((long) 351);
		System.out.println(EsRetrieve.getElapsedTime());
		System.out.println(EsRetrieve.getLocation());
		System.out.println(EsRetrieve.getSeqNum());

		//delete
		EsService.deleteById((long) 351);


	}

}
