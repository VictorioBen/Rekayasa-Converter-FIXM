package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TrueAirspeedType;
import dev.ale.fdx.entity.base.UomAirspeedType;
import dev.ale.fdx.service.TrueAirspeedService;

public class TestTrueAirspeed {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TrueAirspeedService Tservice = context.getBean(TrueAirspeedService.class);
		
		TrueAirspeedType T = new TrueAirspeedType();
		UomAirspeedType uom = UomAirspeedType.valueOf("MACH");
		T.setUom(uom);
		T.setValue(10);
		Tservice.create(T);
		//retrieve
		TrueAirspeedType Tretrieve = Tservice.retrieve(752L);
		System.out.println("=============== TAMPIL DATA =================");
		System.out.println(Tretrieve.getUom());
		System.out.println(Tretrieve.getValue());
		System.out.println("==============================================");
		//update
		Tretrieve.setValue(8);
		Tservice.update(Tretrieve);
		//delete
		Tservice.deleteById(753L);
		
	}

}
