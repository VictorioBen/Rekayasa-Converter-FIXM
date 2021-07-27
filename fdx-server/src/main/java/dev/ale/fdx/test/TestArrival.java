package dev.ale.fdx.test;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.AerodromeReferenceType;
import dev.ale.fdx.entity.base.IcaoAerodromeReferenceType;
import dev.ale.fdx.entity.base.OtherReferenceType;
import dev.ale.fdx.entity.flight.ArrivalType;
import dev.ale.fdx.service.ArrivalService;

public class TestArrival {


	public static void main(String [] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class); 
		
		//Yang di test adalah CRUD
		//Create
		//Retrieve
		//Update
		//Delete
		
		ArrivalService arrService = context.getBean(ArrivalService.class);
		
		//Buat object ArrivalType
		ArrivalType arrival = new ArrivalType();
		//Set Kalender kedatangan
		Date d = new Date("12/12/2020");
		//arrival.setActualTimeOfArrivalItem(target);
		//set waktu kedatangan
		arrival.setActualTimeOfArrivalItem(d);
		//Set Airport Slot
		arrival.setAirportSlotIdentification("101");
		//Set runway
		arrival.setRunwayDirection("010");
		
		//Set AerodromeReferenceType
		//Pakai ICAOreferenceType
		IcaoAerodromeReferenceType aerodrome = new IcaoAerodromeReferenceType();
		aerodrome.setLocationIndicator("WIII");
		arrival.setArrivalAerodrome(aerodrome);
//		OtherReferenceType Other = new OtherReferenceType();
//		Other.setIataDesignator("WIIJ");
//		Other.setHjid((long) 8);
//		arrival.setDestinationAerodrome(Other);
//		
		arrService.update(arrival);
		
		
		
		//Test Retrieve
		ArrivalType arrivalRetrieve = arrService.retrieve((long) 7);
		System.out.println(arrivalRetrieve);
		System.out.println(arrivalRetrieve.getAirportSlotIdentification());
		System.out.println(arrivalRetrieve.getArrivalAerodrome());
		System.out.println(arrivalRetrieve.getRunwayDirection());

	}
}
