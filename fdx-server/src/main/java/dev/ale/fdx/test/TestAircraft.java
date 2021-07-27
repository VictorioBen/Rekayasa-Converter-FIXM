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
import dev.ale.fdx.entity.base.ColourChoiceType;
import dev.ale.fdx.entity.flight.AircraftApproachCategoryType;
import dev.ale.fdx.entity.flight.AircraftType;
import dev.ale.fdx.entity.flight.ArrivalType;
import dev.ale.fdx.entity.flight.FlightCapabilitiesType;
import dev.ale.fdx.entity.flight.FlightType;
import dev.ale.fdx.entity.flight.ObjectFactory;
import dev.ale.fdx.entity.flight.WakeTurbulenceCategoryType;
import dev.ale.fdx.service.AircraftService;

public class TestAircraft {

	public static void main(String [] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AircraftService AirService = context.getBean(AircraftService.class);
		
		AircraftType aircraft = new AircraftType();
		ObjectFactory AircraftFactory = new ObjectFactory();
			//	Create

				aircraft.setAircraftAddress("01");
		
				AircraftApproachCategoryType AirApproch = AircraftApproachCategoryType.valueOf("B");
				WakeTurbulenceCategoryType turbulence = WakeTurbulenceCategoryType.valueOf("M");
				ColourChoiceType colour = new ColourChoiceType();
				colour.setOtherColour("BLUE");
				FlightCapabilitiesType fc = new FlightCapabilitiesType();
				fc.setHjid((long) 10);
		
				aircraft.setAircraftApproachCategory(AirApproch);
				aircraft.setNumberOfAircraft(02);
				aircraft.setRegistration("PK-BBB");
				aircraft.setSignificantMarkings("N99");
				aircraft.setWakeTurbulence(turbulence);
				aircraft.setAircraftColours(colour);
				aircraft.setCapabilities(fc);
				AirService.update(aircraft);

		// TES RETRIEVE

		AircraftType aircraftRetrieve = AirService.retrieve((long) 22);
		System.out.println("----------- TAMPILKAN  DATA ----------------");
		System.out.println(aircraftRetrieve.getAircraftAddress());
		System.out.println(aircraftRetrieve.getAircraftApproachCategory());
		System.out.println(aircraftRetrieve.getNumberOfAircraft());
		System.out.println(aircraftRetrieve.getRegistration());
		System.out.println(aircraftRetrieve.getSignificantMarkings());
		System.out.println(aircraftRetrieve.getWakeTurbulence());
		System.out.println(aircraftRetrieve.getAircraftColours().getOtherColour());
		System.out.println(aircraftRetrieve.getCapabilities().getHjid());
		System.out.println(aircraftRetrieve.getHjid());
		System.out.println(aircraftRetrieve.getAircraftColours());
		System.out.println("----------- TAMPILKAN  DATA ----------------");
		
		//Tes Update
		
		aircraftRetrieve.setAircraftAddress("C");
		AirService.update(aircraftRetrieve);

		//Tes Marshalling
		
		try
		{
			JAXBContext jaxbContext = JAXBContext.newInstance(JAXBContextConfig.JAXB_CONTEXT_FIXM);
			JAXBElement<AircraftType> element = AircraftFactory.createAircraft(aircraftRetrieve);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new DefaultNamespacePrefixMapper());
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.marshal(element, new File("/fdx_workspace/fdx-client/src/main/resource/send/aircraft45.xml"));

		}catch(JAXBException e)		{
			e.printStackTrace();
		}
	}
}
