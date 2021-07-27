package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;

import dev.ale.fdx.entity.base.VolumeType;
import dev.ale.fdx.entity.base.WeightType;
import dev.ale.fdx.entity.flight.DangerousGoodsDimensionsType;
import dev.ale.fdx.service.DangerousDimensionService;

public class TestDangerousGoodsDimension {

	public static void main(String [] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		DangerousDimensionService DangerousService = context.getBean(DangerousDimensionService.class);
		//create
		DangerousGoodsDimensionsType Danger = new DangerousGoodsDimensionsType();
		WeightType weight = new WeightType();
		weight.setValue(10);
		Danger.setGrossWeight(weight);
		Danger.setNetWeight(weight);
		VolumeType v = new VolumeType();
		v.setValue(12);
		Danger.setVolume(v);
		DangerousService.create(Danger);

		//retrieve
		DangerousGoodsDimensionsType DangerR = DangerousService.retrieve((long) 273);
		System.out.println(DangerR.getGrossWeight().getValue());
		System.out.println(DangerR.getNetWeight().getValue());

		//delete
		DangerousService.deleteById((long) 288);
	}

}
