package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.AerodromeReferenceType;
import dev.ale.fdx.entity.base.IcaoAerodromeReferenceType;
import dev.ale.fdx.entity.base.OtherReferenceType;
import dev.ale.fdx.entity.flight.DeclarationTextType;
import dev.ale.fdx.entity.flight.IcaoAircraftTypeReferenceType;
import dev.ale.fdx.entity.flight.ShippingInformationType;
import dev.ale.fdx.entity.flight.SidStarAbbreviatedDesignatorToNextElementType;
import dev.ale.fdx.entity.flight.StructuredPostalAddressType;
import dev.ale.fdx.service.ShippingInformationService;

public class TestShippingInformation {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ShippingInformationType S = new ShippingInformationType();

		ShippingInformationService Sservice = context.getBean(ShippingInformationService.class);

		S.setDangerousGoodsScreeningLocation("After Mountain 300m");
		S.setDepartureCountry("Malaysia");
		S.setDestinationCountry("Selangor");
		S.setOriginCountry("Asia");
		S.setShipmentAuthorizations("JNE");
		S.setSubsidiaryHazardClassAndDivision("1");
		S.setSupplementaryInformation("Suply");
		IcaoAerodromeReferenceType icao = new IcaoAerodromeReferenceType(); 
		S.setAerodromeOfLoading(icao);
		OtherReferenceType other = new OtherReferenceType();
		S.setAerodromeOfUnloading(other);
		StructuredPostalAddressType Spostal = new StructuredPostalAddressType();
		S.setConsignee(Spostal);
		DeclarationTextType Dec = new DeclarationTextType();
		S.setDeclarationText(Dec);
		StructuredPostalAddressType struc = new StructuredPostalAddressType();
		S.setShipper(struc);
		Sservice.create(S);
		//retrieve
		ShippingInformationType Sretrieve = Sservice.retrieve(590L);
		System.out.println("--------------- TAMPIL DATA -------------------");
		System.out.println(Sretrieve.getDangerousGoodsScreeningLocation());
		System.out.println(Sretrieve.getDepartureCountry());
		System.out.println(Sretrieve.getDestinationCountry());
		System.out.println(Sretrieve.getOriginCountry());
		System.out.println(Sretrieve.getShipmentAuthorizations());
		System.out.println(Sretrieve.getSubsidiaryHazardClassAndDivision());
		System.out.println(Sretrieve.getSupplementaryInformation());
		System.out.println(Sretrieve.getAerodromeOfLoading());
		System.out.println(Sretrieve.getAerodromeOfUnloading());
		System.out.println("-----------------------------------------------");
		//update
		Sretrieve.setDepartureCountry("Ngoro");
		Sservice.update(Sretrieve);
		//delete
		Sservice.deleteById(596L);
		
	}

}
