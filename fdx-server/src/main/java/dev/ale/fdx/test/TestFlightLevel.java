package dev.ale.fdx.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.config.DefaultNamespacePrefixMapper;
import dev.ale.fdx.config.JAXBContextConfig;
import dev.ale.fdx.entity.base.FlightLevelType;
import dev.ale.fdx.entity.base.UomFlightLevelType;
import dev.ale.fdx.entity.flight.AircraftType;
import dev.ale.fdx.entity.flight.FlightType;
import dev.ale.fdx.entity.flight.ObjectFactory;
import dev.ale.fdx.service.FlightLevelService;

public class TestFlightLevel {

	
		public static void main(String [] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			FlightLevelService Fservice = context.getBean(FlightLevelService.class);
			ObjectFactory FlightFactory = new ObjectFactory();
			//create
			FlightLevelType FlightLevel = new FlightLevelType();
			UomFlightLevelType uom = UomFlightLevelType.valueOf("SM");
			FlightLevel.setUom(uom);
			FlightLevel.setValue(8);
			
			Fservice.create(FlightLevel);
			
			//retrieve
			FlightLevelType Fretrieve = Fservice.retrieve((long) 375);
			System.out.println("----------- TAMPILKAN DATA --------------");
			System.out.println(Fretrieve.getUom());
			System.out.println(Fretrieve.getValue());
			System.out.println("------------ TAMPILKAN DATA -------------");
			
			//delete
			Fservice.deleteById((long) 375);
			
			
		}
}
