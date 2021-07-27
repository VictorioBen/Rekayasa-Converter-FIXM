package dev.ale.fdx;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.config.DefaultNamespacePrefixMapper;
import dev.ale.fdx.config.JAXBContextConfig;
import dev.ale.fdx.entity.base.ColourChoiceType;
import dev.ale.fdx.entity.base.ColourCodeType;
import dev.ale.fdx.entity.flight.AircraftType;
import dev.ale.fdx.entity.flight.AircraftTypeReferenceType;
import dev.ale.fdx.entity.flight.AircraftTypeType;
import dev.ale.fdx.entity.flight.FlightType;
import dev.ale.fdx.entity.flight.IcaoAircraftTypeReferenceType;
import dev.ale.fdx.entity.flight.ObjectFactory;
import dev.ale.fdx.service.FlightService;
import dev.ale.fdx.service.impl.FlightServiceImpl;

public class MarshallMain {

	public static void main(String[] args) { 

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class); 

		//Set Aircraft
		AircraftType aircraft = new AircraftType();
		//Set ColourChoice on Aircraft
		ColourChoiceType colour = new ColourChoiceType();
		colour.getColourCode().add(ColourCodeType.BLUE);
		colour.getColourCode().add(ColourCodeType.WHITE);
		aircraft.setAircraftColours(colour);
		//Set AircraftType on Aircraft
		AircraftTypeType type = new AircraftTypeType();
		IcaoAircraftTypeReferenceType refType = new IcaoAircraftTypeReferenceType();
		refType.setIcaoAircraftTypeDesignator("B738");
		type.setType(refType);
		type.setNumberOfAircraft(1);
		aircraft.getAircraftType().add(type);
		
		//Set Aircraft to Flight
		FlightType flight = new FlightType();
		flight.setAircraft(aircraft);
		
		//Set service for flight
		FlightService flightService = context.getBean(FlightService.class);
		
		//Insert into DB
		flightService.create(flight);
//		flightService.update(flight);
		
		ObjectFactory flightFactory = new ObjectFactory();

		try
		{
			JAXBContext jaxbContext = JAXBContext.newInstance(JAXBContextConfig.JAXB_CONTEXT_FIXM);
			JAXBElement<FlightType> element = flightFactory.createFlight(flight);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new DefaultNamespacePrefixMapper());
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.marshal(element, System.out);

		}catch(JAXBException e)		{
			e.printStackTrace();
		}


	}

}
