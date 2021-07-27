package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.AdditionalHandlingInformationType;
import dev.ale.fdx.entity.flight.AirWaybillType;
import dev.ale.fdx.entity.flight.AircraftDangerousGoodsLimitationType;
import dev.ale.fdx.entity.flight.DangerousGoodsType;
import dev.ale.fdx.entity.flight.ShipmentTypeType;
import dev.ale.fdx.entity.flight.ShippingInformationType;
import dev.ale.fdx.service.DangerousGoodsService;

public class TestDangerousGoods {

	public static void main(String [] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		DangerousGoodsService DangerService = context.getBean(DangerousGoodsService.class);
		//create
		DangerousGoodsType Danger = new DangerousGoodsType();
		AircraftDangerousGoodsLimitationType aircraft = AircraftDangerousGoodsLimitationType.valueOf("CARGO_AIRCRAFT_ONLY");
		Danger.setAircraftLimitation(aircraft);
		Danger.setGuidebookNumber("10");
		Danger.setOnboardLocation("Deck");
		ShipmentTypeType ship = ShipmentTypeType.valueOf("RADIOACTIVE");
		Danger.setShipment(ship);
		AirWaybillType airway = new AirWaybillType();
		Danger.setAirWayBill(airway);
		AdditionalHandlingInformationType add = new AdditionalHandlingInformationType();
		Danger.setHandlingInformation(add);
		ShippingInformationType Shipinformation = new ShippingInformationType();
		Shipinformation.setDangerousGoodsScreeningLocation("DANGEROUS 300M");
		Danger.setShippingInformation(Shipinformation);

		DangerService.create(Danger);

		//retrieve
		DangerousGoodsType DangerRetrieve = DangerService.retrieve((long) 307);
		System.out.println(DangerRetrieve.getAircraftLimitation());
		System.out.println(DangerRetrieve.getOnboardLocation());

		//delete
		DangerService.deleteById((long) 307);
	}

}
