package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TelephoneContactType;
import dev.ale.fdx.service.TelephoneContactService;

public class TestTelephoneContact {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		TelephoneContactService Tservice = context.getBean(TelephoneContactService.class);

		TelephoneContactType T = new TelephoneContactType();
		T.setFacsimile("+62");
		T.setVoice("Bipp Bip Bippp");
		Tservice.create(T);
		//Rertrive
		TelephoneContactType Tretrieve = Tservice.retrieve(678L);
		System.out.println("============== TAMPIL DATA ===================");
		System.out.println(Tretrieve.getFacsimile());
		System.out.println(Tretrieve.getVoice());
		//update
		Tretrieve.setVoice("Sdup sduup Sduuuupp");
		Tservice.update(Tretrieve);
		//delete
		Tservice.deleteById(679L); 
		
	}

}
