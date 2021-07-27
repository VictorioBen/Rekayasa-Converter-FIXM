package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.SsrCodeType;
import dev.ale.fdx.entity.base.SsrModeType;
import dev.ale.fdx.service.SsrCodeService;

public class TestSsrCode {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		SsrCodeService Sservice = context.getBean(SsrCodeService.class);

		SsrCodeType S = new SsrCodeType();
		SsrModeType value = SsrModeType.valueOf("C");
		S.setSsrMode(value);
		S.setValue("8");

		Sservice.create(S);
		//retrieve
		SsrCodeType Sretrieve = Sservice.retrieve(647L);
		System.out.println("------------- TAMPIL DATA ------------");
		System.out.println(Sretrieve.getSsrMode());
		System.out.println(Sretrieve.getValue());
		System.out.println("---------------------------------------");
		//update
		Sretrieve.setValue("6");
		Sservice.update(Sretrieve);
		//delete
		Sservice.deleteById(648L);
	}

}
