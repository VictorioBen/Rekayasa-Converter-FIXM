package dev.ale.fdx;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.config.DefaultNamespacePrefixMapper;
import dev.ale.fdx.config.JAXBContextConfig;
import dev.ale.fdx.entity.flight.DepartureType;
import dev.ale.fdx.entity.flight.FlightType;
import dev.ale.fdx.entity.flight.ObjectFactory;
import dev.ale.fdx.service.DepartureService;
import dev.ale.fdx.service.FlightService;

public class MarshallFromDB {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		

		FlightService flightService = context.getBean(FlightService.class);
		FlightType flight = flightService.retrieve(1L);
		
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
