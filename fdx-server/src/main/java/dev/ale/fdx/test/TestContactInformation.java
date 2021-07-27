package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.ContactInformationType;
import dev.ale.fdx.entity.base.PostalAddressType;
import dev.ale.fdx.entity.base.TelephoneContactType;
import dev.ale.fdx.service.ContactInformationService;

public class TestContactInformation {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ContactInformationService Cis = context.getBean(ContactInformationService.class);
		//create
		ContactInformationType Cit = new ContactInformationType();
		Cit.setName("Rio");
		Cit.setTitle("Kapten");
		PostalAddressType Pos = new PostalAddressType();
		Pos.setAdministrativeArea("JL Komp Depag no 13 RT13 RW05 Kedaung Kaliangke Jakbar 11730");
		Cit.setAddress(Pos);
		TelephoneContactType telpon = new TelephoneContactType();
		telpon.setVoice("087788661921");
		Cit.setPhoneFax(telpon);
		Cis.create(Cit);
		
		//retrieve
		ContactInformationType CitRetrieve = Cis.retrieve((long) 261);
		System.out.println("----------- TAMPILKAN DATA ---------------");
		System.out.println(CitRetrieve.getName());
		System.out.println(CitRetrieve.getTitle());
		System.out.println(CitRetrieve.getAddress().getAdministrativeArea());
		System.out.println(CitRetrieve.getPhoneFax().getVoice());
		System.out.println("------------ TAMPILKAN DATAT -------------");
		
		//delete
		Cis.deleteById((long) 261);
	}

}
