package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.PostalAddressType;
import dev.ale.fdx.service.PostalAddressService;

public class TestPostalAddress {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PostalAddressService Pservice = context.getBean(PostalAddressService.class);
		
		PostalAddressType P = new PostalAddressType();
		P.setAdministrativeArea("Jl bekasi");
		P.setCity("Jakarta");
		P.setCountryCode("+62");
		P.setCountryName("Indonesia");
		P.setDeliveryPoint("60");
		P.setPostalCode("111460");
	
		Pservice.create(P);
		//retrieve
		PostalAddressType Pretrieve = Pservice.retrieve(480L);
		System.out.println("------------ TAMPILKAN DATA -----------");
		System.out.println(Pretrieve.getAdministrativeArea());
		System.out.println(Pretrieve.getCity());
		System.out.println(Pretrieve.getCountryCode());
		System.out.println(Pretrieve.getCountryName());
		System.out.println(Pretrieve.getDeliveryPoint());
		System.out.println(Pretrieve.getPostalCode());
		System.out.println("-----------------------------------------");
		
		//update
		Pretrieve.setAdministrativeArea("Jl Mawar Sharoon");
		Pretrieve.setCity("Heaven");
		Pretrieve.setCountryCode("not our world");
		Pservice.update(Pretrieve);
		
		//delete
		Pservice.deleteById((long) 482);
	}

}
