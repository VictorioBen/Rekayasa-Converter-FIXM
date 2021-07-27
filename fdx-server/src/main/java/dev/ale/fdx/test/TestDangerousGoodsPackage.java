package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.DimensionsType;
import dev.ale.fdx.entity.base.TemperatureType;
import dev.ale.fdx.entity.flight.AircraftDangerousGoodsLimitationType;
import dev.ale.fdx.entity.flight.AllPackedInOneType;
import dev.ale.fdx.entity.flight.DangerousGoodsDimensionsType;
import dev.ale.fdx.entity.flight.DangerousGoodsPackageType;
import dev.ale.fdx.entity.flight.HazardClassType;
import dev.ale.fdx.entity.flight.MarinePollutantIndicatorType;
import dev.ale.fdx.entity.flight.OverpackIndicatorType;
import dev.ale.fdx.entity.flight.PackingGroupType;
import dev.ale.fdx.entity.flight.RadioactiveMaterialCategoryType;
import dev.ale.fdx.entity.flight.RadioactiveMaterialType;
import dev.ale.fdx.entity.flight.ShipmentTypeType;
import dev.ale.fdx.entity.flight.TemperaturesType;
import dev.ale.fdx.service.DangerousPackageService;

public class TestDangerousGoodsPackage {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		DangerousPackageService DangerService = context.getBean(DangerousPackageService.class);
		//create
		DangerousGoodsPackageType Danger = new DangerousGoodsPackageType();
		Danger.setCompatibilityGroup("Area Militer");
		AircraftDangerousGoodsLimitationType Aircraft = AircraftDangerousGoodsLimitationType.valueOf("PASSENGER_AND_CARGO_AIRCRAFT");
		Danger.setDangerousGoodsLimitation(Aircraft);
		Danger.setDangerousGoodsQuantity(10);
		MarinePollutantIndicatorType marine = MarinePollutantIndicatorType.valueOf("MARINE_POLLUTANT");
		Danger.setMarinePollutantIndicator(marine);
		OverpackIndicatorType over = OverpackIndicatorType.valueOf("OVERPACK_USED");
		Danger.setOverpackIndicator(over);
		PackingGroupType pack = PackingGroupType.valueOf("II");
		Danger.setPackingGroup(pack);
		Danger.setPackingInstructionNumber("18");
		Danger.setProductName("Garuda");
		Danger.setProperShippingName("EMS");
		Danger.setReportableQuantity(8);
		ShipmentTypeType shipment = ShipmentTypeType.valueOf("RADIOACTIVE");
		Danger.setShipmentType(shipment);
		Danger.setSupplementaryInformation("READY FOR USE");
		Danger.setTechnicalName("Ben");
		Danger.setTypeOfPackaging("BOXES");
		Danger.setUnNumber("8");
		AllPackedInOneType all = new AllPackedInOneType();
		Danger.setAllPackedInOne(all);
		HazardClassType hazard = new HazardClassType();
		Danger.setHazardClass(hazard);
		DimensionsType dimension = new DimensionsType();
		Danger.setPackageDimensions(dimension);
		RadioactiveMaterialType radio = new RadioactiveMaterialType();
		RadioactiveMaterialCategoryType material = RadioactiveMaterialCategoryType.valueOf("II_YELLOW");
		radio.setCategory(material);
		Danger.setRadioactiveMaterials(radio);
		DangerousGoodsDimensionsType DGD = new DangerousGoodsDimensionsType();
		Danger.setShipmentDimensions(DGD);
		TemperaturesType temp = new TemperaturesType();
		Danger.setTemperatures(temp);

		DangerService.create(Danger);

		//retrieve
		DangerousGoodsPackageType DangerousRetrieve = DangerService.retrieve((long) 276);
		System.out.println("----------------- TAMPIL DATA ---------------");
		System.out.println(DangerousRetrieve.getDangerousGoodsLimitation());
		System.out.println(DangerousRetrieve.getMarinePollutantIndicator());
		System.out.println(DangerousRetrieve.getOverpackIndicator());
		System.out.println(DangerousRetrieve.getPackingGroup());
		System.out.println(DangerousRetrieve.getPackingInstructionNumber());
		System.out.println("----------------- TAMPIL DATA ---------------");

		//deleete
		DangerService.deleteById((long) 276);

	}

}
