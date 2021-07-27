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
import dev.ale.fdx.entity.base.AircraftOperatorType;
import dev.ale.fdx.entity.base.PersonOrOrganizationType;
import dev.ale.fdx.entity.flight.AircraftType;
import dev.ale.fdx.entity.flight.DepartureType;
import dev.ale.fdx.entity.flight.DestinationType;
import dev.ale.fdx.entity.flight.EnRouteType;
import dev.ale.fdx.entity.flight.FlightEmergencyType;
import dev.ale.fdx.entity.flight.FlightIdentificationType;
import dev.ale.fdx.entity.flight.FlightRouteInformationType;
import dev.ale.fdx.entity.flight.FlightType;
import dev.ale.fdx.entity.flight.ObjectFactory;
import dev.ale.fdx.entity.flight.RadioCommunicationFailureType;
import dev.ale.fdx.entity.flight.RankedTrajectoryType;
import dev.ale.fdx.entity.flight.RouteTrajectoryType;
import dev.ale.fdx.entity.flight.SupplementaryDataType;
import dev.ale.fdx.entity.flight.TypeOfFlightType;
import dev.ale.fdx.service.FlightService;

public class TesFlight {
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		FlightService Fservice = context.getBean(FlightService.class);

		FlightType flight = new FlightType();
		
		ObjectFactory Flightfactory = new ObjectFactory();
		
		TypeOfFlightType Ftype = TypeOfFlightType.valueOf("S");
		flight.setFlightType(Ftype);
		
		
		flight.setRemarks("Garuda");

		RouteTrajectoryType Route = new RouteTrajectoryType();
		Route.setHjid((long) 10);
		flight.setAgreed(Route);
		flight.setCurrent(Route);
		flight.setFiled(Route);
		flight.setNegotiating(Route);

		AircraftType aircraft = new AircraftType();
		aircraft.setHjid((long) 10);
		flight.setAircraft(aircraft);

		DepartureType depart = new DepartureType();
		depart.setHjid((long) 10);
		flight.setDeparture(depart);


		RankedTrajectoryType rTrajec = new RankedTrajectoryType();
		rTrajec.setHjid((long) 10);
		flight.setDesired(rTrajec);

		DestinationType destination = new DestinationType();
		destination.setHjid((long) 10);
		flight.setDestination(destination);

		FlightEmergencyType FlightEmergency = new FlightEmergencyType();
		FlightEmergency.setHjid((long) 10);
		flight.setEmergency(FlightEmergency);

		EnRouteType EnRoute = new EnRouteType();
		EnRoute.setHjid((long) 10);
		flight.setEnRoute(EnRoute);

		FlightIdentificationType Fident = new FlightIdentificationType();
		Fident.setHjid((long) 10);
		flight.setFlightIdentification(Fident);

		PersonOrOrganizationType Person = new PersonOrOrganizationType();
		Person.setHjid((long) 10);
		flight.setFlightPlanOriginator(Person);
		flight.setFlightPlanSubmitter(Person);
		flight.setGufiOriginator(Person);

		AircraftOperatorType AirOperator = new AircraftOperatorType();
		AirOperator.setHjid((long) 10);
		flight.setOperator(AirOperator);

		RadioCommunicationFailureType radio = new RadioCommunicationFailureType();
		radio.setHjid((long) 10);
		flight.setRadioCommunicationFailure(radio);
		
		SupplementaryDataType SupData = new SupplementaryDataType();
		SupData.setHjid((long) 10);
		flight.setSupplementaryData(SupData);

		Fservice.update(flight);
		//Fservice.deleteById((long) 28);
		FlightType flightRetrive = Fservice.retrieve((long) 163);
		System.out.println("---------------TAMPILKAN DATA ----------------");
		System.out.println(flightRetrive.getRemarks());
		
		System.out.println(("--------------------- TAMPILKAN DATA ---------------"));
		
		try
		{
			JAXBContext jaxbContext = JAXBContext.newInstance(JAXBContextConfig.JAXB_CONTEXT_FIXM);
			JAXBElement<FlightType> element = Flightfactory.createFlight(flight);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new DefaultNamespacePrefixMapper());
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.marshal(element, new File("/fdx_workspace/fdx-client/src/main/resource/Send/flight.xml"));

		}catch(JAXBException e)		{
			e.printStackTrace();
		}
	}
	
		
	

}
