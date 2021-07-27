package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.ContactInformationType;
import dev.ale.fdx.entity.base.ParticipantTypeType;
import dev.ale.fdx.entity.base.PersonOrOrganizationType;
import dev.ale.fdx.service.PersonOrOrganizationService;

public class TestPersonorganization {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonOrOrganizationService Pservice = context.getBean(PersonOrOrganizationService.class);
		//create
		PersonOrOrganizationType P = new PersonOrOrganizationType();
		P.setName("CAPT. RIO");
		ParticipantTypeType Participant = ParticipantTypeType.valueOf("NON_FFICE_PARTICIPANT");
		P.setParticipantType(Participant);
		ContactInformationType contact = new ContactInformationType();
		P.setContact(contact);
		
		Pservice.create(P);
		//Retrieve
		PersonOrOrganizationType Pretrieve = Pservice.retrieve(466L);
		System.out.println(Pretrieve.getParticipantType());
		//update
		Pretrieve.setName("CAPT. Ben");
		Pservice.update(Pretrieve);
		//Delete
		Pservice.deleteById(468L);

	}

}
