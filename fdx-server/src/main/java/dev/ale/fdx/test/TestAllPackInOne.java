package dev.ale.fdx.test;

import java.math.BigDecimal;

import org.hibernate.query.criteria.internal.ValueHandlerFactory.BigDecimalValueHandler;
import org.hibernate.type.BigDecimalType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.AllPackedInOneType;
import dev.ale.fdx.service.AllpackInService;

public class TestAllPackInOne {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AllpackInService AllService = context.getBean(AllpackInService.class);

		AllPackedInOneType allpack = new AllPackedInOneType();
		
		//create
		
		allpack.setNumberOfPackages(10);
		
		BigDecimal b = new BigDecimal("0.4");
		allpack.setQValue(b);
		AllService.create(allpack);
		//retrieve
		AllPackedInOneType AllRetrieve = AllService.retrieve((long) 216);
		System.out.println("------------- TAMPILKAN DATA --------------");
		System.out.println(AllRetrieve.getNumberOfPackages());
		System.out.println(AllRetrieve.getQValue());
		System.out.println("------------- TAMPILKAN DATA --------------");
		
		//delete 
		AllService.deleteById((long) 190);

	}

}
