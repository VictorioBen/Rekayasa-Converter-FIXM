package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.DeclarationTextType;
import dev.ale.fdx.service.DeclarationTextService;

public class TestDeclaration {

	public static void main(String [] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		DeclarationTextService Dservice = context.getBean(DeclarationTextService.class);
		//create
		DeclarationTextType Declaration = new DeclarationTextType();
		Declaration.setCompliance("berjalan lancar");
		Declaration.setConsignor("JNE");
		Declaration.setShipper("Randy");

		Dservice.create(Declaration);

		//retrieve
		DeclarationTextType Dretrieve = Dservice.retrieve((long) 315);
		System.out.println(Dretrieve.getCompliance());
		System.out.println(Dretrieve.getConsignor());
		System.out.println(Dretrieve.getShipper());

		//delete
		Dservice.deleteById((long) 315);
	}

}
