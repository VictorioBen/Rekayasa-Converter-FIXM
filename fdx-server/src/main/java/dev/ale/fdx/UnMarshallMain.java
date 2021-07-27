package dev.ale.fdx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import dev.ale.fdx.entity.flight.AircraftType;
import dev.ale.fdx.entity.flight.FlightType;

public class UnMarshallMain {

	private static final String JAXB_CONTEXT_FIXM_BASE = "dev.ale.fdx.entity.base";
	private static final String JAXB_CONTEXT_FIXM_FLIGHT = "dev.ale.fdx.entity.flight";
	private static final String JAXB_CONTEXT_FIXM_MESSAGING = "dev.ale.fdx.entity.messaging";
	private static final String JAXB_CONTEXT_FIXM = JAXB_CONTEXT_FIXM_BASE + ":" + JAXB_CONTEXT_FIXM_FLIGHT + ":"
			+ JAXB_CONTEXT_FIXM_MESSAGING;

	private static final String XSD_FIXM_FLIGHT = "/xsd/flight/Flight.xsd";
	private static final String XSD_FIXM_AIRCRAFT = "/xsd/flight/aircraft/Aircraft.xsd";
	private static final String XSD_FIXM_FLIGHTDATA = "/xsd/flight/flightdata/FlightData.xsd";

	private static final String XML_PATH = "/xml";
	private static final String XML_FILE_1 = XML_PATH + "/20191030-ales.xml";
	private static final String XML_FILE_2 = XML_PATH + "/20191030-ales-aircraft.xml";

	public static void main(String[] args) throws SAXException, FileNotFoundException, JAXBException {
		
		// Get JAXBContext
		JAXBContext context = JAXBContext.newInstance(JAXB_CONTEXT_FIXM);

		// Create Umarshaller
		Unmarshaller unmarshaller = context.createUnmarshaller();

		// Setup schema validator
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = schemaFactory.newSchema(new File(UnMarshallMain.class.getResource(XSD_FIXM_FLIGHTDATA).getFile()));
		unmarshaller.setSchema(schema);

		// Unmarshall xml file (flight)
		String xmlFile = Unmarshaller.class.getResource(XML_FILE_1).getFile();
		InputStream xmlStream = new FileInputStream(Unmarshaller.class.getResource(XML_FILE_1).getFile());
//		JAXBElement<FlightType> eFlight = unmarshaller.unmarshal(new StreamSource(xmlStream), FlightType.class);
		@SuppressWarnings("unchecked")
		JAXBElement<FlightType> eFlight = (JAXBElement<FlightType>) unmarshaller.unmarshal(new File(xmlFile));
		FlightType flight =  eFlight.getValue();		
		
		System.out.println(flight);
		System.out.println(flight.getGufi().getValue());
		System.out.println(flight.getAircraft().getAircraftAddress());
		System.out.println(flight.getAircraft().getRegistration());
		System.out.println(flight.getAircraft().getSignificantMarkings());
		System.out.println(flight.getAircraft().getAircraftApproachCategory().value());
//		System.out.println(flight.getAircraft().getAircraftColours().getColourCode().get(0));
		System.out.println(flight.getAircraft().getCapabilities().getCommunication().getOtherCommunicationCapabilities());
		System.out.println(flight.getAircraft().getNumberOfAircraft());
		System.out.println(flight.getAircraft().getWakeTurbulence().value());
	



		// Unmarshall xml file (aircraft)
		/*
		 * String xmlFile = Unmarshaller.class.getResource(XML_FILE_2).getFile();
		 * AircraftType aircraft = (AircraftType) unmarshaller.unmarshal(new
		 * File(xmlFile)); System.out.println(aircraft.toString());
		 */


	}
}
