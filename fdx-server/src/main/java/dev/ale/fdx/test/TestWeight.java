package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.UomWeightType;
import dev.ale.fdx.entity.base.WeightType;
import dev.ale.fdx.service.WeightService;

public class TestWeight {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//create
		WeightService Wservice = context.getBean(WeightService.class);
		WeightType W = new WeightType();
		UomWeightType value = UomWeightType.valueOf("LB");
		W.setUom(value);
		W.setValue(8);
		Wservice.create(W);
		//retrieve
		WeightType Wretrieve = Wservice.retrieve(765L);
		System.out.println("================ TAMPIL DATA ================");
		System.out.println(Wretrieve.getValue());
		System.out.println(Wretrieve.getUom());
		//update
		Wretrieve.setValue(8);
		//delete
		Wservice.deleteById(766L);
		
	}

}
